package androidx.compose.ui;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class SensitiveContentKt {
    public static final Modifier sensitiveContent(Modifier modifier, boolean z) {
        return modifier.then(new SensitiveNodeElement(z));
    }

    public static /* synthetic */ Modifier sensitiveContent$default(Modifier modifier, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return sensitiveContent(modifier, z);
    }
}
