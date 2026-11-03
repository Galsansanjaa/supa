package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
@Deprecated
/* loaded from: classes.dex */
public class TintContextWrapper extends ContextWrapper {
    private TintContextWrapper(Context context) {
        super(context);
    }

    public static Context wrap(Context context) {
        return context;
    }
}
