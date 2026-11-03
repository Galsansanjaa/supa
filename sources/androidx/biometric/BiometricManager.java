package androidx.biometric;

import android.content.Context;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.util.Log;
import androidx.core.hardware.fingerprint.FingerprintManagerCompat;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public class BiometricManager {
    public static final int BIOMETRIC_ERROR_HW_UNAVAILABLE = 1;
    public static final int BIOMETRIC_ERROR_NONE_ENROLLED = 11;
    public static final int BIOMETRIC_ERROR_NO_HARDWARE = 12;
    public static final int BIOMETRIC_ERROR_SECURITY_UPDATE_REQUIRED = 15;
    public static final int BIOMETRIC_ERROR_UNSUPPORTED = -2;
    public static final int BIOMETRIC_STATUS_UNKNOWN = -1;
    public static final int BIOMETRIC_SUCCESS = 0;
    private static final String TAG = "BiometricManager";
    private final android.hardware.biometrics.BiometricManager mBiometricManager;
    private final FingerprintManagerCompat mFingerprintManager;
    private final Injector mInjector;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static class Api29Impl {
        private Api29Impl() {
        }

        public static int canAuthenticate(android.hardware.biometrics.BiometricManager biometricManager) {
            return biometricManager.canAuthenticate();
        }

        public static android.hardware.biometrics.BiometricManager create(Context context) {
            return (android.hardware.biometrics.BiometricManager) context.getSystemService(android.hardware.biometrics.BiometricManager.class);
        }

        public static Method getCanAuthenticateWithCryptoMethod() {
            try {
                return android.hardware.biometrics.BiometricManager.class.getMethod("canAuthenticate", BiometricPrompt.CryptoObject.class);
            } catch (NoSuchMethodException unused) {
                return null;
            }
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static class Api30Impl {
        private Api30Impl() {
        }

        public static int canAuthenticate(android.hardware.biometrics.BiometricManager biometricManager, int i) {
            return biometricManager.canAuthenticate(i);
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public interface Authenticators {
        public static final int BIOMETRIC_STRONG = 15;
        public static final int BIOMETRIC_WEAK = 255;
        public static final int DEVICE_CREDENTIAL = 32768;
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static class DefaultInjector implements Injector {
        private final Context mContext;

        public DefaultInjector(Context context) {
            this.mContext = context.getApplicationContext();
        }

        @Override // androidx.biometric.BiometricManager.Injector
        public android.hardware.biometrics.BiometricManager getBiometricManager() {
            return Api29Impl.create(this.mContext);
        }

        @Override // androidx.biometric.BiometricManager.Injector
        public FingerprintManagerCompat getFingerprintManager() {
            return FingerprintManagerCompat.from(this.mContext);
        }

        @Override // androidx.biometric.BiometricManager.Injector
        public boolean isDeviceSecurable() {
            return KeyguardUtils.getKeyguardManager(this.mContext) != null;
        }

        @Override // androidx.biometric.BiometricManager.Injector
        public boolean isDeviceSecuredWithCredential() {
            return KeyguardUtils.isDeviceSecuredWithCredential(this.mContext);
        }

        @Override // androidx.biometric.BiometricManager.Injector
        public boolean isFingerprintHardwarePresent() {
            return PackageUtils.hasSystemFeatureFingerprint(this.mContext);
        }

        @Override // androidx.biometric.BiometricManager.Injector
        public boolean isStrongBiometricGuaranteed() {
            return DeviceUtils.canAssumeStrongBiometrics(this.mContext, Build.MODEL);
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public interface Injector {
        android.hardware.biometrics.BiometricManager getBiometricManager();

        FingerprintManagerCompat getFingerprintManager();

        boolean isDeviceSecurable();

        boolean isDeviceSecuredWithCredential();

        boolean isFingerprintHardwarePresent();

        boolean isStrongBiometricGuaranteed();
    }

    public BiometricManager(Injector injector) {
        this.mInjector = injector;
        int i = Build.VERSION.SDK_INT;
        this.mBiometricManager = i >= 29 ? injector.getBiometricManager() : null;
        this.mFingerprintManager = i <= 29 ? injector.getFingerprintManager() : null;
    }

    private int canAuthenticateCompat(int i) {
        if (!AuthenticatorUtils.isSupportedCombination(i)) {
            return -2;
        }
        if (i == 0 || !this.mInjector.isDeviceSecurable()) {
            return 12;
        }
        if (AuthenticatorUtils.isDeviceCredentialAllowed(i)) {
            return this.mInjector.isDeviceSecuredWithCredential() ? 0 : 11;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 == 29) {
            return AuthenticatorUtils.isWeakBiometricAllowed(i) ? canAuthenticateWithWeakBiometricOnApi29() : canAuthenticateWithStrongBiometricOnApi29();
        }
        if (i2 != 28) {
            return canAuthenticateWithFingerprint();
        }
        if (this.mInjector.isFingerprintHardwarePresent()) {
            return canAuthenticateWithFingerprintOrUnknownBiometric();
        }
        return 12;
    }

    private int canAuthenticateWithFingerprint() {
        FingerprintManagerCompat fingerprintManagerCompat = this.mFingerprintManager;
        if (fingerprintManagerCompat == null) {
            Log.e(TAG, "Failure in canAuthenticate(). FingerprintManager was null.");
            return 1;
        }
        if (fingerprintManagerCompat.isHardwareDetected()) {
            return !this.mFingerprintManager.hasEnrolledFingerprints() ? 11 : 0;
        }
        return 12;
    }

    private int canAuthenticateWithFingerprintOrUnknownBiometric() {
        return !this.mInjector.isDeviceSecuredWithCredential() ? canAuthenticateWithFingerprint() : canAuthenticateWithFingerprint() == 0 ? 0 : -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0046 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int canAuthenticateWithStrongBiometricOnApi29() {
        /*
            r6 = this;
            java.lang.String r0 = "BiometricManager"
            java.lang.reflect.Method r1 = androidx.biometric.BiometricManager.Api29Impl.getCanAuthenticateWithCryptoMethod()
            if (r1 == 0) goto L3a
            androidx.biometric.BiometricPrompt$CryptoObject r2 = androidx.biometric.CryptoObjectUtils.createFakeCryptoObject()
            android.hardware.biometrics.BiometricPrompt$CryptoObject r2 = androidx.biometric.CryptoObjectUtils.wrapForBiometricPrompt(r2)
            if (r2 == 0) goto L3a
            android.hardware.biometrics.BiometricManager r3 = r6.mBiometricManager     // Catch: java.lang.reflect.InvocationTargetException -> L29 java.lang.IllegalArgumentException -> L2b java.lang.IllegalAccessException -> L2d
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.reflect.InvocationTargetException -> L29 java.lang.IllegalArgumentException -> L2b java.lang.IllegalAccessException -> L2d
            r5 = 0
            r4[r5] = r2     // Catch: java.lang.reflect.InvocationTargetException -> L29 java.lang.IllegalArgumentException -> L2b java.lang.IllegalAccessException -> L2d
            java.lang.Object r1 = r1.invoke(r3, r4)     // Catch: java.lang.reflect.InvocationTargetException -> L29 java.lang.IllegalArgumentException -> L2b java.lang.IllegalAccessException -> L2d
            boolean r2 = r1 instanceof java.lang.Integer     // Catch: java.lang.reflect.InvocationTargetException -> L29 java.lang.IllegalArgumentException -> L2b java.lang.IllegalAccessException -> L2d
            if (r2 == 0) goto L2f
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.reflect.InvocationTargetException -> L29 java.lang.IllegalArgumentException -> L2b java.lang.IllegalAccessException -> L2d
            int r6 = r1.intValue()     // Catch: java.lang.reflect.InvocationTargetException -> L29 java.lang.IllegalArgumentException -> L2b java.lang.IllegalAccessException -> L2d
            return r6
        L29:
            r1 = move-exception
            goto L35
        L2b:
            r1 = move-exception
            goto L35
        L2d:
            r1 = move-exception
            goto L35
        L2f:
            java.lang.String r1 = "Invalid return type for canAuthenticate(CryptoObject)."
            android.util.Log.w(r0, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L29 java.lang.IllegalArgumentException -> L2b java.lang.IllegalAccessException -> L2d
            goto L3a
        L35:
            java.lang.String r2 = "Failed to invoke canAuthenticate(CryptoObject)."
            android.util.Log.w(r0, r2, r1)
        L3a:
            int r0 = r6.canAuthenticateWithWeakBiometricOnApi29()
            androidx.biometric.BiometricManager$Injector r1 = r6.mInjector
            boolean r1 = r1.isStrongBiometricGuaranteed()
            if (r1 != 0) goto L4e
            if (r0 == 0) goto L49
            goto L4e
        L49:
            int r6 = r6.canAuthenticateWithFingerprintOrUnknownBiometric()
            return r6
        L4e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.biometric.BiometricManager.canAuthenticateWithStrongBiometricOnApi29():int");
    }

    private int canAuthenticateWithWeakBiometricOnApi29() {
        android.hardware.biometrics.BiometricManager biometricManager = this.mBiometricManager;
        if (biometricManager != null) {
            return Api29Impl.canAuthenticate(biometricManager);
        }
        Log.e(TAG, "Failure in canAuthenticate(). BiometricManager was null.");
        return 1;
    }

    public static BiometricManager from(Context context) {
        return new BiometricManager(new DefaultInjector(context));
    }

    @Deprecated
    public int canAuthenticate() {
        return canAuthenticate(255);
    }

    public int canAuthenticate(int i) {
        if (Build.VERSION.SDK_INT < 30) {
            return canAuthenticateCompat(i);
        }
        android.hardware.biometrics.BiometricManager biometricManager = this.mBiometricManager;
        if (biometricManager != null) {
            return Api30Impl.canAuthenticate(biometricManager, i);
        }
        Log.e(TAG, "Failure in canAuthenticate(). BiometricManager was null.");
        return 1;
    }
}
