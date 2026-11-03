package androidx.credentials.provider;

import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.credentials.provider.utils.PrivilegedApp;
import androidx.credentials.provider.utils.RequestValidationUtil;
import defpackage.hu2;
import defpackage.jh2;
import defpackage.kw;
import defpackage.nb0;
import defpackage.sb0;
import defpackage.v5;
import defpackage.wd;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class CallingAppInfo {
    public static final Companion Companion = new Companion(null);
    public static final String EXTRA_CREDENTIAL_REQUEST_ORIGIN = "androidx.credentials.provider.extra.CREDENTIAL_REQUEST_ORIGIN";
    private static final String EXTRA_CREDENTIAL_REQUEST_PACKAGE_NAME = "androidx.credentials.provider.extra.CREDENTIAL_REQUEST_PACKAGE_NAME";
    private static final String EXTRA_CREDENTIAL_REQUEST_SIGNATURES = "androidx.credentials.provider.extra.CREDENTIAL_REQUEST_SIGNATURES";
    private static final String EXTRA_CREDENTIAL_REQUEST_SIGNING_INFO = "androidx.credentials.provider.extra.CREDENTIAL_REQUEST_SIGNING_INFO";
    private final String origin;
    private final String packageName;
    private SigningInfo signingInfo;
    private final SigningInfoCompat signingInfoCompat;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        public static /* synthetic */ CallingAppInfo create$default(Companion companion, String str, SigningInfo signingInfo, String str2, int i, Object obj) {
            if ((i & 4) != 0) {
                str2 = null;
            }
            return companion.create(str, signingInfo, str2);
        }

        public static /* synthetic */ CallingAppInfo create$default(Companion companion, String str, List list, String str2, int i, Object obj) {
            if ((i & 4) != 0) {
                str2 = null;
            }
            return companion.create(str, (List<? extends Signature>) list, str2);
        }

        public final CallingAppInfo create(String str, SigningInfo signingInfo, String str2) {
            str.getClass();
            signingInfo.getClass();
            return new CallingAppInfo(str, signingInfo, str2);
        }

        public final CallingAppInfo create(String str, List<? extends Signature> list, String str2) {
            str.getClass();
            list.getClass();
            return new CallingAppInfo(str, list, str2);
        }

        public final CallingAppInfo extractCallingAppInfo(Bundle bundle) {
            bundle.getClass();
            String string = bundle.getString(CallingAppInfo.EXTRA_CREDENTIAL_REQUEST_ORIGIN);
            String string2 = bundle.getString(CallingAppInfo.EXTRA_CREDENTIAL_REQUEST_PACKAGE_NAME);
            if (string2 == null) {
                return null;
            }
            if (Build.VERSION.SDK_INT >= 28) {
                SigningInfo signingInfo = (SigningInfo) bundle.getParcelable(CallingAppInfo.EXTRA_CREDENTIAL_REQUEST_SIGNING_INFO);
                if (signingInfo == null) {
                    return null;
                }
                return create(string2, signingInfo, string);
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray(CallingAppInfo.EXTRA_CREDENTIAL_REQUEST_SIGNATURES);
            if (parcelableArray == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                parcelable.getClass();
                arrayList.add((Signature) parcelable);
            }
            return create(string2, arrayList, string);
        }

        public final void setCallingAppInfo$credentials(Bundle bundle, CallingAppInfo callingAppInfo) {
            bundle.getClass();
            callingAppInfo.getClass();
            bundle.putString(CallingAppInfo.EXTRA_CREDENTIAL_REQUEST_ORIGIN, callingAppInfo.getOrigin$credentials());
            bundle.putString(CallingAppInfo.EXTRA_CREDENTIAL_REQUEST_PACKAGE_NAME, callingAppInfo.getPackageName());
            if (Build.VERSION.SDK_INT >= 28) {
                bundle.putParcelable(CallingAppInfo.EXTRA_CREDENTIAL_REQUEST_SIGNING_INFO, callingAppInfo.getSigningInfo());
            } else {
                bundle.putParcelableArray(CallingAppInfo.EXTRA_CREDENTIAL_REQUEST_SIGNATURES, (Parcelable[]) callingAppInfo.getSigningInfoCompat().getSigningCertificateHistory().toArray(new Signature[0]));
            }
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class SignatureVerifier {
        private final SigningInfoCompat signingInfoCompat;

        public SignatureVerifier(SigningInfoCompat signingInfoCompat) {
            signingInfoCompat.getClass();
            this.signingInfoCompat = signingInfoCompat;
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, ps0] */
        private final Set<String> convertToFingerprints(List<? extends Signature> list) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<? extends Signature> it = list.iterator();
            while (it.hasNext()) {
                byte[] digest = MessageDigest.getInstance("SHA-256").digest(it.next().toByteArray());
                digest.getClass();
                linkedHashSet.add(wd.G0(digest, ":", new Object(), 30));
            }
            return linkedHashSet;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence convertToFingerprints$lambda$0(byte b) {
            return String.format("%02X", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
        }

        private final Set<String> getSignatureFingerprints() {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            List<Signature> apkContentsSigners = this.signingInfoCompat.getApkContentsSigners();
            if (this.signingInfoCompat.hasMultipleSigners() && !apkContentsSigners.isEmpty()) {
                linkedHashSet.addAll(convertToFingerprints(apkContentsSigners));
                return linkedHashSet;
            }
            if (!this.signingInfoCompat.getSigningCertificateHistory().isEmpty()) {
                linkedHashSet.addAll(convertToFingerprints(nb0.C(this.signingInfoCompat.getSigningCertificateHistory().get(0))));
            }
            return linkedHashSet;
        }

        public final boolean verifySignatureFingerprints(Set<String> set) {
            set.getClass();
            Set<String> signatureFingerprints = getSignatureFingerprints();
            if (this.signingInfoCompat.hasMultipleSigners()) {
                return set.containsAll(signatureFingerprints);
            }
            Set<String> set2 = signatureFingerprints;
            set2.getClass();
            Set O0 = kw.O0(set);
            O0.retainAll(set2 instanceof Collection ? set2 : kw.L0(set2));
            return !O0.isEmpty();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CallingAppInfo(String str, SigningInfo signingInfo) {
        this(str, signingInfo, (String) null, 4, (sb0) null);
        str.getClass();
        signingInfo.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CallingAppInfo(String str, SigningInfo signingInfo, String str2) {
        this(str, str2, SigningInfoCompat.Companion.fromSigningInfo(signingInfo), signingInfo);
        str.getClass();
        signingInfo.getClass();
    }

    public /* synthetic */ CallingAppInfo(String str, SigningInfo signingInfo, String str2, int i, sb0 sb0Var) {
        this(str, signingInfo, (i & 4) != 0 ? null : str2);
    }

    private CallingAppInfo(String str, String str2, SigningInfoCompat signingInfoCompat, SigningInfo signingInfo) {
        this.packageName = str;
        this.origin = str2;
        this.signingInfoCompat = signingInfoCompat;
        if (Build.VERSION.SDK_INT >= 28) {
            signingInfo.getClass();
            this.signingInfo = signingInfo;
        }
        if (str.length() > 0) {
            return;
        }
        v5.m("packageName must not be empty");
        throw null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CallingAppInfo(String str, List<? extends Signature> list) {
        this(str, list, (String) null, 4, (sb0) null);
        str.getClass();
        list.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CallingAppInfo(String str, List<? extends Signature> list, String str2) {
        this(str, str2, SigningInfoCompat.Companion.fromSignatures(list), null);
        str.getClass();
        list.getClass();
    }

    public /* synthetic */ CallingAppInfo(String str, List list, String str2, int i, sb0 sb0Var) {
        this(str, (List<? extends Signature>) list, (i & 4) != 0 ? null : str2);
    }

    private final boolean isAppPrivileged(List<PrivilegedApp> list) {
        for (PrivilegedApp privilegedApp : list) {
            if (jh2.k(privilegedApp.getPackageName(), this.packageName)) {
                return isAppPrivileged(privilegedApp.getFingerprints());
            }
        }
        return false;
    }

    private final boolean isAppPrivileged(Set<String> set) {
        return new SignatureVerifier(this.signingInfoCompat).verifySignatureFingerprints(set);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallingAppInfo)) {
            return false;
        }
        CallingAppInfo callingAppInfo = (CallingAppInfo) obj;
        return jh2.k(this.packageName, callingAppInfo.packageName) && jh2.k(this.origin, callingAppInfo.origin) && jh2.k(this.signingInfoCompat, callingAppInfo.signingInfoCompat);
    }

    public final String getOrigin(String str) {
        str.getClass();
        if (!RequestValidationUtil.Companion.isValidJSON(str)) {
            v5.m("privilegedAllowlist must not be empty, and must be a valid JSON");
            return null;
        }
        String str2 = this.origin;
        if (str2 == null) {
            return str2;
        }
        try {
            if (isAppPrivileged(PrivilegedApp.Companion.extractPrivilegedApps$credentials(new JSONObject(str)))) {
                return this.origin;
            }
            hu2.h("Origin is not being returned as the calling app did notmatch the privileged allowlist");
            return null;
        } catch (JSONException unused) {
            v5.m("privilegedAllowlist must be formatted properly");
            return null;
        }
    }

    public final String getOrigin$credentials() {
        return this.origin;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final SigningInfo getSigningInfo() {
        SigningInfo signingInfo = this.signingInfo;
        if (signingInfo != null) {
            return signingInfo;
        }
        jh2.b0("signingInfo");
        throw null;
    }

    public final SigningInfoCompat getSigningInfoCompat() {
        return this.signingInfoCompat;
    }

    public int hashCode() {
        int hashCode = this.packageName.hashCode() * 31;
        String str = this.origin;
        return this.signingInfoCompat.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final boolean isOriginPopulated() {
        return this.origin != null;
    }
}
