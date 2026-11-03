package com.inmobi.cmp.core.cmpapi.status;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public enum DisplayStatus {
    VISIBLE("visible"),
    HIDDEN("hidden"),
    DISABLED("disabled"),
    DISMISSED("dismissed");

    private final String value;

    DisplayStatus(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
