package androidx.credentials.playservices.controllers.identityauth;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public class HiddenActivity extends Activity {
    public static final Companion Companion = new Companion(null);
    private static final int DEFAULT_VALUE = 1;
    private static final String KEY_AWAITING_RESULT = "androidx.credentials.playservices.AWAITING_RESULT";
    private static final String TAG = "HiddenActivity";
    private boolean mWaitingForActivityResult;
    private ResultReceiver resultReceiver;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }
    }

    private final void handleCredentialFlow(String str) {
        HiddenActivity hiddenActivity;
        PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra(CredentialProviderBaseController.EXTRA_FLOW_PENDING_INTENT);
        int intExtra = getIntent().getIntExtra(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG, 1);
        if (pendingIntent == null) {
            setupPendingIntentFailureByType(str);
            return;
        }
        try {
            this.mWaitingForActivityResult = true;
            hiddenActivity = this;
            try {
                hiddenActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), intExtra, null, 0, 0, 0, null);
            } catch (IntentSender.SendIntentException e) {
                e = e;
                hiddenActivity.setupIntentSenderFailureByType(str, e);
            }
        } catch (IntentSender.SendIntentException e2) {
            e = e2;
            hiddenActivity = this;
        }
    }

    private final void restoreState(Bundle bundle) {
        if (bundle != null) {
            this.mWaitingForActivityResult = bundle.getBoolean(KEY_AWAITING_RESULT, false);
        }
    }

    private final void setupFailure(ResultReceiver resultReceiver, String str, String str2) {
        CredentialProviderBaseController.Companion.reportError$credentials_play_services_auth(resultReceiver, str, str2);
        finish();
    }

    private final void setupIntentSenderFailureByType(String str, IntentSender.SendIntentException sendIntentException) {
        switch (str.hashCode()) {
            case -441061071:
                if (str.equals(CredentialProviderBaseController.BEGIN_SIGN_IN_TAG)) {
                    ResultReceiver resultReceiver = this.resultReceiver;
                    resultReceiver.getClass();
                    setupFailure(resultReceiver, CredentialProviderBaseController.GET_UNKNOWN, "During begin sign in, one tap ui intent sender failure: " + sendIntentException.getMessage());
                    return;
                }
                return;
            case 15545322:
                if (str.equals(CredentialProviderBaseController.CREATE_PUBLIC_KEY_CREDENTIAL_TAG)) {
                    ResultReceiver resultReceiver2 = this.resultReceiver;
                    resultReceiver2.getClass();
                    setupFailure(resultReceiver2, CredentialProviderBaseController.CREATE_UNKNOWN, "During public key credential, found IntentSender failure on public key creation: " + sendIntentException.getMessage());
                    return;
                }
                return;
            case 1246634622:
                if (str.equals(CredentialProviderBaseController.CREATE_PASSWORD_TAG)) {
                    ResultReceiver resultReceiver3 = this.resultReceiver;
                    resultReceiver3.getClass();
                    setupFailure(resultReceiver3, CredentialProviderBaseController.CREATE_UNKNOWN, "During save password, found UI intent sender failure: " + sendIntentException.getMessage());
                    return;
                }
                return;
            case 1980564212:
                if (str.equals(CredentialProviderBaseController.SIGN_IN_INTENT_TAG)) {
                    ResultReceiver resultReceiver4 = this.resultReceiver;
                    resultReceiver4.getClass();
                    setupFailure(resultReceiver4, CredentialProviderBaseController.GET_UNKNOWN, "During get sign-in intent, one tap ui intent sender failure: " + sendIntentException.getMessage());
                    return;
                }
                return;
            default:
                return;
        }
    }

    private final void setupPendingIntentFailureByType(String str) {
        switch (str.hashCode()) {
            case -441061071:
                if (str.equals(CredentialProviderBaseController.BEGIN_SIGN_IN_TAG)) {
                    ResultReceiver resultReceiver = this.resultReceiver;
                    resultReceiver.getClass();
                    setupFailure(resultReceiver, CredentialProviderBaseController.GET_UNKNOWN, "internal error during the begin sign in operation");
                    return;
                }
                return;
            case 15545322:
                if (str.equals(CredentialProviderBaseController.CREATE_PUBLIC_KEY_CREDENTIAL_TAG)) {
                    ResultReceiver resultReceiver2 = this.resultReceiver;
                    resultReceiver2.getClass();
                    setupFailure(resultReceiver2, CredentialProviderBaseController.CREATE_UNKNOWN, "internal error during public key credential creation");
                    return;
                }
                return;
            case 1246634622:
                if (str.equals(CredentialProviderBaseController.CREATE_PASSWORD_TAG)) {
                    ResultReceiver resultReceiver3 = this.resultReceiver;
                    resultReceiver3.getClass();
                    setupFailure(resultReceiver3, CredentialProviderBaseController.CREATE_UNKNOWN, "internal error during password creation");
                    return;
                }
                return;
            case 1980564212:
                if (str.equals(CredentialProviderBaseController.SIGN_IN_INTENT_TAG)) {
                    ResultReceiver resultReceiver4 = this.resultReceiver;
                    resultReceiver4.getClass();
                    setupFailure(resultReceiver4, CredentialProviderBaseController.GET_UNKNOWN, "internal error during the sign-in intent operation");
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        ResultReceiver resultReceiver = this.resultReceiver;
        if (resultReceiver != null) {
            CredentialProviderBaseController.Companion.reportResult$credentials_play_services_auth(resultReceiver, i, i2, intent);
        }
        this.mWaitingForActivityResult = false;
        finish();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        String stringExtra = getIntent().getStringExtra(CredentialProviderBaseController.TYPE_TAG);
        ResultReceiver resultReceiver = (ResultReceiver) getIntent().getParcelableExtra(CredentialProviderBaseController.RESULT_RECEIVER_TAG);
        this.resultReceiver = resultReceiver;
        if (resultReceiver == null) {
            finish();
        }
        restoreState(bundle);
        if (this.mWaitingForActivityResult) {
            return;
        }
        if (stringExtra != null) {
            handleCredentialFlow(stringExtra);
        } else {
            Log.w(TAG, "Activity handed an unsupported type");
            finish();
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        bundle.putBoolean(KEY_AWAITING_RESULT, this.mWaitingForActivityResult);
        super.onSaveInstanceState(bundle);
    }
}
