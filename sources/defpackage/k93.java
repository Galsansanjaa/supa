package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.style.StylePropertiesKt;
import androidx.compose.ui.spatial.RectListKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.work.impl.model.WorkTag;
import androidx.work.impl.model.WorkTagDao;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class k93 {
    public static void a(WorkTagDao workTagDao, String str, Set set) {
        str.getClass();
        set.getClass();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            workTagDao.insert(new WorkTag((String) it.next(), str));
        }
    }

    public static /* synthetic */ int b(Object obj) {
        if (obj instanceof String) {
            return 2;
        }
        if (obj instanceof Boolean) {
            return 1;
        }
        if (obj instanceof Long) {
            return 3;
        }
        if (obj instanceof Double) {
            return 4;
        }
        qq.e("invalid tag type: ".concat(String.valueOf(obj.getClass())));
        return 0;
    }

    public static int c(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            default:
                switch (i) {
                    case 20:
                        return 10;
                    case 21:
                        return 11;
                    case 22:
                        return 12;
                    default:
                        return 0;
                }
        }
    }

    public static /* synthetic */ String d(int i) {
        if (i == 1) {
            return "All";
        }
        if (i == 2) {
            return "Partial";
        }
        if (i == 3) {
            return "Reject";
        }
        if (i == 4) {
            return "NA";
        }
        throw null;
    }

    public static /* synthetic */ String e(int i) {
        switch (i) {
            case 1:
                return "IABTCF_CmpSdkID";
            case 2:
                return "IABTCF_CmpSdkVersion";
            case 3:
                return "IABTCF_PolicyVersion";
            case 4:
                return "IABTCF_gdprApplies";
            case 5:
                return "IABTCF_PublisherCC";
            case 6:
                return "IABTCF_PurposeOneTreatment";
            case 7:
                return "IABTCF_UseNonStandardStacks";
            case 8:
                return "IABTCF_TCString";
            case 9:
                return "IABTCF_VendorConsents";
            case 10:
                return "IABTCF_VendorLegitimateInterests";
            case 11:
                return "IABTCF_PurposeConsents";
            case 12:
                return "IABTCF_PurposeLegitimateInterests";
            case 13:
                return "IABTCF_SpecialFeaturesOptIns";
            case 14:
                return "IABTCF_PublisherRestrictions";
            case 15:
                return "IABTCF_PublisherConsent";
            case 16:
                return "IABTCF_PublisherLegitimateInterests";
            case 17:
                return "IABTCF_PublisherCustomPurposesConsents";
            case 18:
                return "IABTCF_PublisherCustomPurposesLegitimateInterests";
            case 19:
                return "GVL";
            case 20:
                return "Cmp";
            case 21:
                return "portal_config";
            case 22:
                return "option_hash";
            case 23:
                return "non_IAB_vendor_hash";
            case 24:
                return "portal_config_hash";
            case 25:
                return "gvl_version";
            case 26:
                return "gvl_last_updated";
            case 27:
                return "portal_non_hash";
            case 28:
                return "translations_text";
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                return "googleVendorList";
            case 30:
                return "googleVendorLastUpdate";
            case 31:
                return "IABTCF_AddtlConsent";
            case 32:
                return "google_enabled";
            case 33:
                return "lang_";
            case 34:
                return "IABTCF_NonIABConsentEncoded";
            case 35:
                return "IABTCF_NonIABConsent";
            case 36:
                return "IABTCF_NonIABLegInterests";
            case 37:
                return "IABUSPrivacy_String";
            case 38:
                return "IABUSSavedPrivacyString";
            case 39:
                return "GBCPurposeHash";
            case 40:
                return "GBCConsentString";
            case 41:
                return "GBCResponse";
            case 42:
                return "MSPAPurposes";
            case 43:
                return "IABGPP_TCFEU2_CmpSdkID";
            case 44:
                return "IABGPP_TCFEU2_CmpSdkVersion";
            case 45:
                return "IABGPP_TCFEU2_PolicyVersion";
            case 46:
                return "IABGPP_TCFEU2_gdprApplies";
            case 47:
                return "IABGPP_TCFEU2_PublisherCC";
            case 48:
                return "IABGPP_TCFEU2_PurposeOneTreatment";
            case 49:
                return "IABGPP_TCFEU2_UseNonStandardStacks";
            case 50:
                return "IABGPP_2_TCString";
            case 51:
                return "IABGPP_TCFEU2_VendorConsents";
            case 52:
                return "IABGPP_TCFEU2_VendorLegitimateInterests";
            case 53:
                return "IABGPP_TCFEU2_PurposeConsents";
            case 54:
                return "IABGPP_TCFEU2_PurposeLegitimateInterests";
            case 55:
                return "IABGPP_TCFEU2_SpecialFeaturesOptIns";
            case StylePropertiesKt.InnerShadowId /* 56 */:
                return "IABGPP_TCFEU2_PublisherRestrictions";
            case StylePropertiesKt.ContentBrushId /* 57 */:
                return "IABGPP_TCFEU2_PublisherConsent";
            case StylePropertiesKt.FontFamilyId /* 58 */:
                return "IABGPP_TCFEU2_PublisherLegitimateInterests";
            case StylePropertiesKt.TextMotionId /* 59 */:
                return "IABGPP_TCFEU2_PublisherCustomPurposesConsents";
            case 60:
                return "IABGPP_TCFEU2_PublisherCustomPurposesLegitimateInterests";
            case 61:
                return "IABGPP_HDR_Version";
            case RectListKt.BitOffsetForGesturable /* 62 */:
                return "IABGPP_HDR_Sections";
            case 63:
                return "IABGPP_HDR_GppString";
            case 64:
                return "IABGPP_GppSID";
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                return "IABGPP_[SectionID]_String";
            case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                return "MSPAPurposeHash";
            case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                return "MSPAShown";
            case 68:
                return "SavedSectionId";
            case 69:
                return "MSPAJurisdiction";
            case 70:
                return "SavedRegion";
            case 71:
                return "MSPAPurposesConsent";
            case 72:
                return "MSPASensitivePurposeConsent";
            case 73:
                return "MSPAStatus";
            case 74:
                return "MSPAConsentGivenExplicitly";
            case 75:
                return "GDPRShown";
            case 76:
                return "GDPRStatus";
            case 77:
                return "CCPAShown";
            case 78:
                return "CCPAConsentGivenExplicitly";
            case 79:
                return "LastVisitTime";
            case 80:
                return "GDPR_Consent_LastStoredTimeStamp";
            case 81:
                return "ConfigThemeUUID";
            case 82:
                return "ConfigLanguage";
            case 83:
                return "ConfigCOPApplicable";
            case 84:
                return "ConfigADVApplicable";
            case 85:
                return "ConfigGBCApplicable";
            case 86:
                return "MSPAConfigThemeUUID";
            case 87:
                return "MSPAConfigLanguage";
            case 88:
                return "MSPAConfigGBCApplicable";
            case 89:
                return "CCPAConfigThemeUUID";
            case SubsamplingScaleImageView.ORIENTATION_90 /* 90 */:
                return "CCPAConfigLanguage";
            case 91:
                return "CCPAConfigGBCApplicable";
            case 92:
                return "GBCShown";
            case 93:
                return "GBCStatus";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String f(int i) {
        if (i == 1) {
            return "N";
        }
        if (i == 2) {
            return "Y";
        }
        throw null;
    }

    public static /* synthetic */ int g(int i) {
        switch (i) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 20;
            case 11:
                return 21;
            case 12:
                return 22;
            default:
                throw null;
        }
    }

    public static int h(int i, int i2, int i3) {
        return gp3.a(i) + i2 + i3;
    }

    public static int i(int i, int i2, int i3, int i4) {
        return gp3.a(i) + i2 + i3 + i4;
    }

    public static int j(int i, int i2, String str) {
        return (str.hashCode() + i) * i2;
    }

    public static View k(ViewGroup viewGroup, int i, ViewGroup viewGroup2, boolean z) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup2, z);
    }

    public static String l(int i, int i2, String str, String str2) {
        return str + i + str2 + i2;
    }

    public static String m(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static bq3 n(bq3 bq3Var) {
        int size = bq3Var.size();
        return bq3Var.g(size + size);
    }

    public static /* synthetic */ boolean o(Object obj) {
        return obj != null;
    }

    public static /* synthetic */ String p(int i) {
        switch (i) {
            case 1:
                return "CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN";
            case 2:
                return "CLIENT_UPLOAD_ELIGIBLE";
            case 3:
                return "MEASUREMENT_SERVICE_NOT_ENABLED";
            case 4:
                return "ANDROID_TOO_OLD";
            case 5:
                return "NON_PLAY_MODE";
            case 6:
                return "SDK_TOO_OLD";
            case 7:
                return "MISSING_JOB_SCHEDULER";
            case 8:
                return "NOT_ENABLED_IN_MANIFEST";
            case 9:
                return "CLIENT_FLAG_OFF";
            case 10:
                return "SERVICE_FLAG_OFF";
            case 11:
                return "PINNED_TO_SERVICE_UPLOAD";
            case 12:
                return "MISSING_SGTM_SERVER_URL";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String q(int i) {
        switch (i) {
            case 1:
                return "IAB_VENDOR";
            case 2:
                return "NON_IAB_VENDOR";
            case 3:
                return "GOOGLE_VENDOR";
            case 4:
                return "PUBLISHER_VENDOR";
            case 5:
                return "PURPOSE";
            case 6:
                return "SPECIAL_PURPOSE";
            case 7:
                return "FEATURES";
            case 8:
                return "SPECIAL_FEATURE";
            case 9:
                return "GOOGLE_BASIC_CONSENT_PURPOSE";
            case 10:
                return "PURPOSE_PARTNER";
            case 11:
                return "MSPA_PURPOSE";
            case 12:
                return "MSPA_SENSITIVE_PURPOSE";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String r(int i) {
        switch (i) {
            case 1:
                return "GO_TO_PAGE";
            case 2:
                return "PURPOSE";
            case 3:
                return "SPECIAL_FEATURE";
            case 4:
                return "PARTIAL_CONSENT";
            case 5:
                return "SAVE_AND_EXIT";
            case 6:
                return "ACCEPT_ALL";
            case 7:
                return "REJECT_ALL";
            case 8:
                return "ACCEPT_ALL_LEGITIMATE";
            case 9:
                return "OBJECT_ALL_LEGITIMATE";
            case 10:
                return "START_ON_PAGE";
            case 11:
                return "EXPAND_ELEMENT";
            case 12:
                return "COLLAPSE_ELEMENT";
            case 13:
                return "ACTION1";
            case 14:
                return "ACTION2";
            case 15:
                return "CONFIRM";
            default:
                return "null";
        }
    }

    public static du3 s(ut3 ut3Var, iu3 iu3Var, hg2 hg2Var, ArrayList arrayList) {
        String str = iu3Var.a;
        if (ut3Var.k(str)) {
            du3 d = ut3Var.d(str);
            if (d instanceof us3) {
                return ((us3) d).a(hg2Var, arrayList);
            }
            v5.m(wa2.q(str, " is not a function"));
            return null;
        }
        if ("hasOwnProperty".equals(str)) {
            jh2.e0("hasOwnProperty", 1, arrayList);
            return ut3Var.k(((dq1) hg2Var.m).w(hg2Var, (du3) arrayList.get(0)).b()) ? du3.j : du3.k;
        }
        v5.m(wa2.y("Object has no function ", str));
        return null;
    }
}
