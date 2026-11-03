package androidx.compose.runtime.composer;

import defpackage.f31;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public abstract class DebugStringFormattable {
    public static final int $stable = 0;

    public static /* synthetic */ String toDebugString$default(DebugStringFormattable debugStringFormattable, String str, int i, Object obj) {
        if (obj != null) {
            f31.f("Super calls with default arguments not supported in this target, function: toDebugString");
            return null;
        }
        if ((i & 1) != 0) {
            str = "  ";
        }
        return debugStringFormattable.toDebugString(str);
    }

    public abstract String toDebugString(String str);
}
