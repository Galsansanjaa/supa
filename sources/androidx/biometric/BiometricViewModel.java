package androidx.biometric;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import androidx.biometric.AuthenticationCallbackProvider;
import androidx.biometric.BiometricPrompt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public class BiometricViewModel extends ViewModel {
    private AuthenticationCallbackProvider mAuthenticationCallbackProvider;
    private MutableLiveData<BiometricErrorData> mAuthenticationError;
    private MutableLiveData<CharSequence> mAuthenticationHelpMessage;
    private MutableLiveData<BiometricPrompt.AuthenticationResult> mAuthenticationResult;
    private CancellationSignalProvider mCancellationSignalProvider;
    private BiometricPrompt.AuthenticationCallback mClientCallback;
    private Executor mClientExecutor;
    private BiometricPrompt.CryptoObject mCryptoObject;
    private MutableLiveData<CharSequence> mFingerprintDialogHelpMessage;
    private MutableLiveData<Integer> mFingerprintDialogState;
    private MutableLiveData<Boolean> mIsAuthenticationFailurePending;
    private boolean mIsAwaitingResult;
    private boolean mIsConfirmingDeviceCredential;
    private boolean mIsDelayingPrompt;
    private MutableLiveData<Boolean> mIsFingerprintDialogCancelPending;
    private boolean mIsIgnoringCancel;
    private MutableLiveData<Boolean> mIsNegativeButtonPressPending;
    private boolean mIsPromptShowing;
    private DialogInterface.OnClickListener mNegativeButtonListener;
    private CharSequence mNegativeButtonTextOverride;
    private BiometricPrompt.PromptInfo mPromptInfo;
    private int mCanceledFrom = 0;
    private boolean mIsFingerprintDialogDismissedInstantly = true;
    private int mFingerprintDialogPreviousState = 0;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class CallbackListener extends AuthenticationCallbackProvider.Listener {
        private final WeakReference<BiometricViewModel> mViewModelRef;

        public CallbackListener(BiometricViewModel biometricViewModel) {
            this.mViewModelRef = new WeakReference<>(biometricViewModel);
        }

        @Override // androidx.biometric.AuthenticationCallbackProvider.Listener
        public void onError(int i, CharSequence charSequence) {
            if (this.mViewModelRef.get() == null || this.mViewModelRef.get().isConfirmingDeviceCredential() || !this.mViewModelRef.get().isAwaitingResult()) {
                return;
            }
            this.mViewModelRef.get().setAuthenticationError(new BiometricErrorData(i, charSequence));
        }

        @Override // androidx.biometric.AuthenticationCallbackProvider.Listener
        public void onFailure() {
            if (this.mViewModelRef.get() == null || !this.mViewModelRef.get().isAwaitingResult()) {
                return;
            }
            this.mViewModelRef.get().setAuthenticationFailurePending(true);
        }

        @Override // androidx.biometric.AuthenticationCallbackProvider.Listener
        public void onHelp(CharSequence charSequence) {
            if (this.mViewModelRef.get() != null) {
                this.mViewModelRef.get().setAuthenticationHelpMessage(charSequence);
            }
        }

        @Override // androidx.biometric.AuthenticationCallbackProvider.Listener
        public void onSuccess(BiometricPrompt.AuthenticationResult authenticationResult) {
            if (this.mViewModelRef.get() == null || !this.mViewModelRef.get().isAwaitingResult()) {
                return;
            }
            if (authenticationResult.getAuthenticationType() == -1) {
                authenticationResult = new BiometricPrompt.AuthenticationResult(authenticationResult.getCryptoObject(), this.mViewModelRef.get().getInferredAuthenticationResultType());
            }
            this.mViewModelRef.get().setAuthenticationResult(authenticationResult);
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static class DefaultExecutor implements Executor {
        private final Handler mHandler = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.mHandler.post(runnable);
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static class NegativeButtonListener implements DialogInterface.OnClickListener {
        private final WeakReference<BiometricViewModel> mViewModelRef;

        public NegativeButtonListener(BiometricViewModel biometricViewModel) {
            this.mViewModelRef = new WeakReference<>(biometricViewModel);
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            if (this.mViewModelRef.get() != null) {
                this.mViewModelRef.get().setNegativeButtonPressPending(true);
            }
        }
    }

    private static <T> void updateValue(MutableLiveData<T> mutableLiveData, T t) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            mutableLiveData.setValue(t);
        } else {
            mutableLiveData.postValue(t);
        }
    }

    public int getAllowedAuthenticators() {
        BiometricPrompt.PromptInfo promptInfo = this.mPromptInfo;
        if (promptInfo != null) {
            return AuthenticatorUtils.getConsolidatedAuthenticators(promptInfo, this.mCryptoObject);
        }
        return 0;
    }

    public AuthenticationCallbackProvider getAuthenticationCallbackProvider() {
        AuthenticationCallbackProvider authenticationCallbackProvider = this.mAuthenticationCallbackProvider;
        if (authenticationCallbackProvider != null) {
            return authenticationCallbackProvider;
        }
        AuthenticationCallbackProvider authenticationCallbackProvider2 = new AuthenticationCallbackProvider(new CallbackListener(this));
        this.mAuthenticationCallbackProvider = authenticationCallbackProvider2;
        return authenticationCallbackProvider2;
    }

    public MutableLiveData<BiometricErrorData> getAuthenticationError() {
        MutableLiveData<BiometricErrorData> mutableLiveData = this.mAuthenticationError;
        if (mutableLiveData != null) {
            return mutableLiveData;
        }
        MutableLiveData<BiometricErrorData> mutableLiveData2 = new MutableLiveData<>();
        this.mAuthenticationError = mutableLiveData2;
        return mutableLiveData2;
    }

    public LiveData<CharSequence> getAuthenticationHelpMessage() {
        MutableLiveData<CharSequence> mutableLiveData = this.mAuthenticationHelpMessage;
        if (mutableLiveData != null) {
            return mutableLiveData;
        }
        MutableLiveData<CharSequence> mutableLiveData2 = new MutableLiveData<>();
        this.mAuthenticationHelpMessage = mutableLiveData2;
        return mutableLiveData2;
    }

    public LiveData<BiometricPrompt.AuthenticationResult> getAuthenticationResult() {
        MutableLiveData<BiometricPrompt.AuthenticationResult> mutableLiveData = this.mAuthenticationResult;
        if (mutableLiveData != null) {
            return mutableLiveData;
        }
        MutableLiveData<BiometricPrompt.AuthenticationResult> mutableLiveData2 = new MutableLiveData<>();
        this.mAuthenticationResult = mutableLiveData2;
        return mutableLiveData2;
    }

    public int getCanceledFrom() {
        return this.mCanceledFrom;
    }

    public CancellationSignalProvider getCancellationSignalProvider() {
        CancellationSignalProvider cancellationSignalProvider = this.mCancellationSignalProvider;
        if (cancellationSignalProvider != null) {
            return cancellationSignalProvider;
        }
        CancellationSignalProvider cancellationSignalProvider2 = new CancellationSignalProvider();
        this.mCancellationSignalProvider = cancellationSignalProvider2;
        return cancellationSignalProvider2;
    }

    public BiometricPrompt.AuthenticationCallback getClientCallback() {
        BiometricPrompt.AuthenticationCallback authenticationCallback = this.mClientCallback;
        if (authenticationCallback != null) {
            return authenticationCallback;
        }
        BiometricPrompt.AuthenticationCallback authenticationCallback2 = new BiometricPrompt.AuthenticationCallback() { // from class: androidx.biometric.BiometricViewModel.1
        };
        this.mClientCallback = authenticationCallback2;
        return authenticationCallback2;
    }

    public Executor getClientExecutor() {
        Executor executor = this.mClientExecutor;
        return executor != null ? executor : new DefaultExecutor();
    }

    public BiometricPrompt.CryptoObject getCryptoObject() {
        return this.mCryptoObject;
    }

    public CharSequence getDescription() {
        BiometricPrompt.PromptInfo promptInfo = this.mPromptInfo;
        if (promptInfo != null) {
            return promptInfo.getDescription();
        }
        return null;
    }

    public LiveData<CharSequence> getFingerprintDialogHelpMessage() {
        MutableLiveData<CharSequence> mutableLiveData = this.mFingerprintDialogHelpMessage;
        if (mutableLiveData != null) {
            return mutableLiveData;
        }
        MutableLiveData<CharSequence> mutableLiveData2 = new MutableLiveData<>();
        this.mFingerprintDialogHelpMessage = mutableLiveData2;
        return mutableLiveData2;
    }

    public int getFingerprintDialogPreviousState() {
        return this.mFingerprintDialogPreviousState;
    }

    public LiveData<Integer> getFingerprintDialogState() {
        MutableLiveData<Integer> mutableLiveData = this.mFingerprintDialogState;
        if (mutableLiveData != null) {
            return mutableLiveData;
        }
        MutableLiveData<Integer> mutableLiveData2 = new MutableLiveData<>();
        this.mFingerprintDialogState = mutableLiveData2;
        return mutableLiveData2;
    }

    public int getInferredAuthenticationResultType() {
        int allowedAuthenticators = getAllowedAuthenticators();
        return (!AuthenticatorUtils.isSomeBiometricAllowed(allowedAuthenticators) || AuthenticatorUtils.isDeviceCredentialAllowed(allowedAuthenticators)) ? -1 : 2;
    }

    public DialogInterface.OnClickListener getNegativeButtonListener() {
        DialogInterface.OnClickListener onClickListener = this.mNegativeButtonListener;
        if (onClickListener != null) {
            return onClickListener;
        }
        NegativeButtonListener negativeButtonListener = new NegativeButtonListener(this);
        this.mNegativeButtonListener = negativeButtonListener;
        return negativeButtonListener;
    }

    public CharSequence getNegativeButtonText() {
        CharSequence charSequence = this.mNegativeButtonTextOverride;
        if (charSequence != null) {
            return charSequence;
        }
        BiometricPrompt.PromptInfo promptInfo = this.mPromptInfo;
        if (promptInfo != null) {
            return promptInfo.getNegativeButtonText();
        }
        return null;
    }

    public CharSequence getSubtitle() {
        BiometricPrompt.PromptInfo promptInfo = this.mPromptInfo;
        if (promptInfo != null) {
            return promptInfo.getSubtitle();
        }
        return null;
    }

    public CharSequence getTitle() {
        BiometricPrompt.PromptInfo promptInfo = this.mPromptInfo;
        if (promptInfo != null) {
            return promptInfo.getTitle();
        }
        return null;
    }

    public LiveData<Boolean> isAuthenticationFailurePending() {
        MutableLiveData<Boolean> mutableLiveData = this.mIsAuthenticationFailurePending;
        if (mutableLiveData != null) {
            return mutableLiveData;
        }
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>();
        this.mIsAuthenticationFailurePending = mutableLiveData2;
        return mutableLiveData2;
    }

    public boolean isAwaitingResult() {
        return this.mIsAwaitingResult;
    }

    public boolean isConfirmationRequired() {
        BiometricPrompt.PromptInfo promptInfo = this.mPromptInfo;
        return promptInfo == null || promptInfo.isConfirmationRequired();
    }

    public boolean isConfirmingDeviceCredential() {
        return this.mIsConfirmingDeviceCredential;
    }

    public boolean isDelayingPrompt() {
        return this.mIsDelayingPrompt;
    }

    public LiveData<Boolean> isFingerprintDialogCancelPending() {
        MutableLiveData<Boolean> mutableLiveData = this.mIsFingerprintDialogCancelPending;
        if (mutableLiveData != null) {
            return mutableLiveData;
        }
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>();
        this.mIsFingerprintDialogCancelPending = mutableLiveData2;
        return mutableLiveData2;
    }

    public boolean isFingerprintDialogDismissedInstantly() {
        return this.mIsFingerprintDialogDismissedInstantly;
    }

    public boolean isIgnoringCancel() {
        return this.mIsIgnoringCancel;
    }

    public LiveData<Boolean> isNegativeButtonPressPending() {
        MutableLiveData<Boolean> mutableLiveData = this.mIsNegativeButtonPressPending;
        if (mutableLiveData != null) {
            return mutableLiveData;
        }
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>();
        this.mIsNegativeButtonPressPending = mutableLiveData2;
        return mutableLiveData2;
    }

    public boolean isPromptShowing() {
        return this.mIsPromptShowing;
    }

    public void resetClientCallback() {
        this.mClientCallback = null;
    }

    public void setAuthenticationError(BiometricErrorData biometricErrorData) {
        MutableLiveData<BiometricErrorData> mutableLiveData = this.mAuthenticationError;
        if (mutableLiveData == null) {
            mutableLiveData = new MutableLiveData<>();
            this.mAuthenticationError = mutableLiveData;
        }
        updateValue(mutableLiveData, biometricErrorData);
    }

    public void setAuthenticationFailurePending(boolean z) {
        MutableLiveData<Boolean> mutableLiveData = this.mIsAuthenticationFailurePending;
        if (mutableLiveData == null) {
            mutableLiveData = new MutableLiveData<>();
            this.mIsAuthenticationFailurePending = mutableLiveData;
        }
        updateValue(mutableLiveData, Boolean.valueOf(z));
    }

    public void setAuthenticationHelpMessage(CharSequence charSequence) {
        MutableLiveData<CharSequence> mutableLiveData = this.mAuthenticationHelpMessage;
        if (mutableLiveData == null) {
            mutableLiveData = new MutableLiveData<>();
            this.mAuthenticationHelpMessage = mutableLiveData;
        }
        updateValue(mutableLiveData, charSequence);
    }

    public void setAuthenticationResult(BiometricPrompt.AuthenticationResult authenticationResult) {
        MutableLiveData<BiometricPrompt.AuthenticationResult> mutableLiveData = this.mAuthenticationResult;
        if (mutableLiveData == null) {
            mutableLiveData = new MutableLiveData<>();
            this.mAuthenticationResult = mutableLiveData;
        }
        updateValue(mutableLiveData, authenticationResult);
    }

    public void setAwaitingResult(boolean z) {
        this.mIsAwaitingResult = z;
    }

    public void setCanceledFrom(int i) {
        this.mCanceledFrom = i;
    }

    public void setClientCallback(BiometricPrompt.AuthenticationCallback authenticationCallback) {
        this.mClientCallback = authenticationCallback;
    }

    public void setClientExecutor(Executor executor) {
        this.mClientExecutor = executor;
    }

    public void setConfirmingDeviceCredential(boolean z) {
        this.mIsConfirmingDeviceCredential = z;
    }

    public void setCryptoObject(BiometricPrompt.CryptoObject cryptoObject) {
        this.mCryptoObject = cryptoObject;
    }

    public void setDelayingPrompt(boolean z) {
        this.mIsDelayingPrompt = z;
    }

    public void setFingerprintDialogCancelPending(boolean z) {
        MutableLiveData<Boolean> mutableLiveData = this.mIsFingerprintDialogCancelPending;
        if (mutableLiveData == null) {
            mutableLiveData = new MutableLiveData<>();
            this.mIsFingerprintDialogCancelPending = mutableLiveData;
        }
        updateValue(mutableLiveData, Boolean.valueOf(z));
    }

    public void setFingerprintDialogDismissedInstantly(boolean z) {
        this.mIsFingerprintDialogDismissedInstantly = z;
    }

    public void setFingerprintDialogHelpMessage(CharSequence charSequence) {
        MutableLiveData<CharSequence> mutableLiveData = this.mFingerprintDialogHelpMessage;
        if (mutableLiveData == null) {
            mutableLiveData = new MutableLiveData<>();
            this.mFingerprintDialogHelpMessage = mutableLiveData;
        }
        updateValue(mutableLiveData, charSequence);
    }

    public void setFingerprintDialogPreviousState(int i) {
        this.mFingerprintDialogPreviousState = i;
    }

    public void setFingerprintDialogState(int i) {
        MutableLiveData<Integer> mutableLiveData = this.mFingerprintDialogState;
        if (mutableLiveData == null) {
            mutableLiveData = new MutableLiveData<>();
            this.mFingerprintDialogState = mutableLiveData;
        }
        updateValue(mutableLiveData, Integer.valueOf(i));
    }

    public void setIgnoringCancel(boolean z) {
        this.mIsIgnoringCancel = z;
    }

    public void setNegativeButtonPressPending(boolean z) {
        MutableLiveData<Boolean> mutableLiveData = this.mIsNegativeButtonPressPending;
        if (mutableLiveData == null) {
            mutableLiveData = new MutableLiveData<>();
            this.mIsNegativeButtonPressPending = mutableLiveData;
        }
        updateValue(mutableLiveData, Boolean.valueOf(z));
    }

    public void setNegativeButtonTextOverride(CharSequence charSequence) {
        this.mNegativeButtonTextOverride = charSequence;
    }

    public void setPromptInfo(BiometricPrompt.PromptInfo promptInfo) {
        this.mPromptInfo = promptInfo;
    }

    public void setPromptShowing(boolean z) {
        this.mIsPromptShowing = z;
    }
}
