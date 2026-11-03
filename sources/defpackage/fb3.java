package defpackage;

import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class fb3 {
    public static final Map a;
    public static final Map b;

    static {
        Map singletonMap = Collections.singletonMap("core", new String[]{"version", "created", "lastUpdated", "cmpId", "cmpVersion", "consentScreen", "consentLanguage", "vendorListVersion", "purposeConsents", "vendorConsents"});
        singletonMap.getClass();
        a = singletonMap;
        b = fi1.Q(new dv1("core", new String[]{"version", "created", "lastUpdated", "cmpId", "cmpVersion", "consentScreen", "consentLanguage", "vendorListVersion", "policyVersion", "isServiceSpecific", "useNonStandardStacks", "specialFeatureOptions", "purposeConsents", "purposeLegitimateInterests", "purposeOneTreatment", "publisherCountryCode", "vendorConsents", "vendorLegitimateInterests", "publisherRestrictions"}), new dv1("publisherTC", new String[]{"publisherConsents", "publisherLegitimateInterests", "numCustomPurposes", "publisherCustomConsents", "publisherCustomLegitimateInterests"}), new dv1("vendorsAllowed", new String[]{"vendorsAllowed"}), new dv1("vendorsDisclosed", new String[]{"vendorsDisclosed"}));
    }
}
