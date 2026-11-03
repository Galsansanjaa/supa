package com.uptodown.services.utils;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class NativeConst {
    public static final NativeConst a = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [com.uptodown.services.utils.NativeConst, java.lang.Object] */
    static {
        System.loadLibrary("utd-services-native");
    }

    public final native String getApiKeySeed();
}
