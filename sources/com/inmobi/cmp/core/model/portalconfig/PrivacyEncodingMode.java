package com.inmobi.cmp.core.model.portalconfig;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public enum PrivacyEncodingMode {
    TCF("TCF"),
    GPP("GPP"),
    TCF_AND_GPP("TCF_AND_GPP");

    private final String value;

    PrivacyEncodingMode(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
