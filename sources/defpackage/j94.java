package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class j94 {
    public static final s52 a;

    static {
        a21 a21Var = f21.b;
        Object[] objArr = new Object[24];
        objArr[0] = "Version";
        objArr[1] = "GoogleConsent";
        objArr[2] = "VendorConsent";
        objArr[3] = "VendorLegitimateInterest";
        objArr[4] = "gdprApplies";
        objArr[5] = "EnableAdvertiserConsentMode";
        objArr[6] = "PolicyVersion";
        objArr[7] = "PurposeConsents";
        objArr[8] = "PurposeOneTreatment";
        objArr[9] = "Purpose1";
        objArr[10] = "Purpose3";
        objArr[11] = "Purpose4";
        System.arraycopy(new String[]{"Purpose7", "CmpSdkID", "PublisherCC", "PublisherRestrictions1", "PublisherRestrictions3", "PublisherRestrictions4", "PublisherRestrictions7", "AuthorizePurpose1", "AuthorizePurpose3", "AuthorizePurpose4", "AuthorizePurpose7", "PurposeDiagnostics"}, 0, objArr, 12, 12);
        np3.i(24, objArr);
        a = f21.m(24, objArr);
    }

    public static String a(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, "");
        } catch (ClassCastException unused) {
            return "";
        }
    }

    public static final boolean b(fo3 fo3Var, x52 x52Var, x52 x52Var2, mj2 mj2Var, char[] cArr, int i, int i2, int i3, String str, String str2, String str3, boolean z, boolean z2) {
        i94 i94Var;
        char c;
        int c2 = c(fo3Var);
        if (c2 > 0 && (i2 != 1 || i != 1)) {
            cArr[c2] = '2';
        }
        if (g(fo3Var, x52Var2) == go3.PURPOSE_RESTRICTION_NOT_ALLOWED) {
            c = '3';
        } else {
            if (fo3Var == fo3.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE && i3 == 1 && mj2Var.n.equals(str)) {
                if (c2 > 0 && cArr[c2] != '2') {
                    cArr[c2] = '1';
                }
                return true;
            }
            if (x52Var.containsKey(fo3Var) && (i94Var = (i94) x52Var.get(fo3Var)) != null) {
                int ordinal = i94Var.ordinal();
                go3 go3Var = go3.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST;
                if (ordinal != 0) {
                    go3 go3Var2 = go3.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            return g(fo3Var, x52Var2) == go3Var ? f(fo3Var, cArr, str3, z2) : e(fo3Var, cArr, str2, z);
                        }
                        if (ordinal == 3) {
                            return g(fo3Var, x52Var2) == go3Var2 ? e(fo3Var, cArr, str2, z) : f(fo3Var, cArr, str3, z2);
                        }
                    } else if (g(fo3Var, x52Var2) != go3Var2) {
                        return f(fo3Var, cArr, str3, z2);
                    }
                } else if (g(fo3Var, x52Var2) != go3Var) {
                    return e(fo3Var, cArr, str2, z);
                }
                c = '8';
            }
            c = '0';
        }
        if (c2 <= 0 || cArr[c2] == '2') {
            return false;
        }
        cArr[c2] = c;
        return false;
    }

    public static final int c(fo3 fo3Var) {
        if (fo3Var == fo3.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
            return 1;
        }
        if (fo3Var == fo3.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE) {
            return 2;
        }
        if (fo3Var == fo3.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS) {
            return 3;
        }
        return fo3Var == fo3.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE ? 4 : -1;
    }

    public static final String d(fo3 fo3Var, String str, String str2) {
        String str3 = "0";
        String valueOf = (TextUtils.isEmpty(str) || str.length() < fo3Var.a()) ? "0" : String.valueOf(str.charAt(fo3Var.a() - 1));
        if (!TextUtils.isEmpty(str2) && str2.length() >= fo3Var.a()) {
            str3 = String.valueOf(str2.charAt(fo3Var.a() - 1));
        }
        return String.valueOf(valueOf).concat(String.valueOf(str3));
    }

    public static final boolean e(fo3 fo3Var, char[] cArr, String str, boolean z) {
        char c;
        int c2 = c(fo3Var);
        if (!z) {
            c = '4';
        } else {
            if (str.length() >= fo3Var.a()) {
                char charAt = str.charAt(fo3Var.a() - 1);
                boolean z2 = charAt == '1';
                if (c2 > 0 && cArr[c2] != '2') {
                    cArr[c2] = charAt != '1' ? '6' : '1';
                }
                return z2;
            }
            c = '0';
        }
        if (c2 > 0 && cArr[c2] != '2') {
            cArr[c2] = c;
        }
        return false;
    }

    public static final boolean f(fo3 fo3Var, char[] cArr, String str, boolean z) {
        char c;
        int c2 = c(fo3Var);
        if (!z) {
            c = '5';
        } else {
            if (str.length() >= fo3Var.a()) {
                char charAt = str.charAt(fo3Var.a() - 1);
                boolean z2 = charAt == '1';
                if (c2 > 0 && cArr[c2] != '2') {
                    cArr[c2] = charAt != '1' ? '7' : '1';
                }
                return z2;
            }
            c = '0';
        }
        if (c2 > 0 && cArr[c2] != '2') {
            cArr[c2] = c;
        }
        return false;
    }

    public static final go3 g(fo3 fo3Var, x52 x52Var) {
        Object obj = x52Var.get(fo3Var);
        if (obj == null) {
            obj = go3.PURPOSE_RESTRICTION_UNDEFINED;
        }
        return (go3) obj;
    }
}
