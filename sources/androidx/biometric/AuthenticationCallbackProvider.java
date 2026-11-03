package androidx.biometric;

import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import androidx.biometric.BiometricPrompt;
import androidx.core.hardware.fingerprint.FingerprintManagerCompat;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public class AuthenticationCallbackProvider {
    private android.hardware.biometrics.BiometricPrompt$AuthenticationCallback mBiometricCallback;
    private FingerprintManagerCompat.AuthenticationCallback mFingerprintCallback;
    final Listener mListener;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static class Api28Impl {
        private Api28Impl() {
        }

        public static android.hardware.biometrics.BiometricPrompt$AuthenticationCallback createCallback(final Listener listener) {
            return new android.hardware.biometrics.BiometricPrompt$AuthenticationCallback() { // from class: androidx.biometric.AuthenticationCallbackProvider.Api28Impl.1
                public void onAuthenticationError(int i, CharSequence charSequence) {
                    Listener.this.onError(i, charSequence);
                }

                public void onAuthenticationFailed() {
                    Listener.this.onFailure();
                }

                public void onAuthenticationHelp(int i, CharSequence charSequence) {
                }

                public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
                    BiometricPrompt.CryptoObject unwrapFromBiometricPrompt = authenticationResult != null ? CryptoObjectUtils.unwrapFromBiometricPrompt(authenticationResult.getCryptoObject()) : null;
                    int i = Build.VERSION.SDK_INT;
                    int i2 = -1;
                    if (i >= 30) {
                        if (authenticationResult != null) {
                            i2 = Api30Impl.getAuthenticationType(authenticationResult);
                        }
                    } else if (i != 29) {
                        i2 = 2;
                    }
                    Listener.this.onSuccess(new BiometricPrompt.AuthenticationResult(unwrapFromBiometricPrompt, i2));
                }
            };
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static class Api30Impl {
        private Api30Impl() {
        }

        public static int getAuthenticationType(BiometricPrompt.AuthenticationResult authenticationResult) {
            return authenticationResult.getAuthenticationType();
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static class Listener {
        public void onError(int i, CharSequence charSequence) {
        }

        public void onFailure() {
        }

        public void onHelp(CharSequence charSequence) {
        }

        public void onSuccess(BiometricPrompt.AuthenticationResult authenticationResult) {
        }
    }

    public AuthenticationCallbackProvider(Listener listener) {
        this.mListener = listener;
    }

    public android.hardware.biometrics.BiometricPrompt$AuthenticationCallback getBiometricCallback() {
        android.hardware.biometrics.BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallback = this.mBiometricCallback;
        if (biometricPrompt$AuthenticationCallback != null) {
            return biometricPrompt$AuthenticationCallback;
        }
        android.hardware.biometrics.BiometricPrompt$AuthenticationCallback createCallback = Api28Impl.createCallback(this.mListener);
        this.mBiometricCallback = createCallback;
        return createCallback;
    }

    public FingerprintManagerCompat.AuthenticationCallback getFingerprintCallback() {
        FingerprintManagerCompat.AuthenticationCallback authenticationCallback = this.mFingerprintCallback;
        if (authenticationCallback != null) {
            return authenticationCallback;
        }
        FingerprintManagerCompat.AuthenticationCallback authenticationCallback2 = new FingerprintManagerCompat.AuthenticationCallback() { // from class: androidx.biometric.AuthenticationCallbackProvider.1
            @Override // androidx.core.hardware.fingerprint.FingerprintManagerCompat.AuthenticationCallback
            public void onAuthenticationError(int i, CharSequence charSequence) {
                AuthenticationCallbackProvider.this.mListener.onError(i, charSequence);
            }

            @Override // androidx.core.hardware.fingerprint.FingerprintManagerCompat.AuthenticationCallback
            public void onAuthenticationFailed() {
                AuthenticationCallbackProvider.this.mListener.onFailure();
            }

            @Override // androidx.core.hardware.fingerprint.FingerprintManagerCompat.AuthenticationCallback
            public void onAuthenticationHelp(int i, CharSequence charSequence) {
                AuthenticationCallbackProvider.this.mListener.onHelp(charSequence);
            }

            @Override // androidx.core.hardware.fingerprint.FingerprintManagerCompat.AuthenticationCallback
            public void onAuthenticationSucceeded(FingerprintManagerCompat.AuthenticationResult authenticationResult) {
                AuthenticationCallbackProvider.this.mListener.onSuccess(new BiometricPrompt.AuthenticationResult(authenticationResult != null ? CryptoObjectUtils.unwrapFromFingerprintManager(authenticationResult.getCryptoObject()) : null, 2));
            }
        };
        this.mFingerprintCallback = authenticationCallback2;
        return authenticationCallback2;
    }
}
