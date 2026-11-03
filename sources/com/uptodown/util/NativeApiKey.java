package com.uptodown.util;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class NativeApiKey {
    public static final NativeApiKey a = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [com.uptodown.util.NativeApiKey, java.lang.Object] */
    static {
        System.loadLibrary("uptodown-native");
    }

    private final native String getAuthApikey();

    public final String a() {
        return getAuthApikey();
    }
}
