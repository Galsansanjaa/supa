package androidx.savedstate;

import android.os.Bundle;
import defpackage.ps0;
import java.util.Map;

/* loaded from: classes4.dex */
public final class SavedStateKt {
    public static final <T> T read(Bundle bundle, ps0 ps0Var) {
        return (T) SavedStateKt__SavedStateKt.read(bundle, ps0Var);
    }

    public static final Bundle savedState(Bundle bundle, ps0 ps0Var) {
        return SavedStateKt__SavedState_androidKt.savedState(bundle, ps0Var);
    }

    public static final Bundle savedState(Map<String, ? extends Object> map, ps0 ps0Var) {
        return SavedStateKt__SavedState_androidKt.savedState(map, ps0Var);
    }

    public static final <T> T write(Bundle bundle, ps0 ps0Var) {
        return (T) SavedStateKt__SavedStateKt.write(bundle, ps0Var);
    }
}
