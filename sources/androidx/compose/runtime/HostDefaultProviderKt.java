package androidx.compose.runtime;

import defpackage.mz;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class HostDefaultProviderKt {
    private static final ProvidableCompositionLocal<HostDefaultProvider> LocalHostDefaultProvider = CompositionLocalKt.compositionLocalOf$default(null, new mz(28), 1, null);

    public static final HostDefaultProvider LocalHostDefaultProvider$lambda$0() {
        throw new IllegalStateException("CompositionLocal LocalHostDefaultProvider not present");
    }

    public static final ProvidableCompositionLocal<HostDefaultProvider> getLocalHostDefaultProvider() {
        return LocalHostDefaultProvider;
    }
}
