package com.inmobi.cmp.core.cmpapi.status;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public enum EventStatus {
    TC_LOADED("tcloaded"),
    CMP_UI_SHOWN("cmpuishown"),
    USER_ACTION_COMPLETE("useractioncomplete");

    private final String value;

    EventStatus(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
