package defpackage;

import android.os.Build;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class ml3 {
    public static final int a;

    static {
        a = Build.VERSION.SDK_INT >= 31 ? GroupFlagsKt.HasAuxSlotFlag : 0;
    }
}
