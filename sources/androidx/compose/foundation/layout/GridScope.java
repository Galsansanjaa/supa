package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import defpackage.f31;
import defpackage.i61;
import defpackage.lv0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
@LayoutScopeMarker
/* loaded from: classes.dex */
public interface GridScope {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final int GridIndexUnspecified = 0;
    public static final int MaxGridIndex = 1000;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int GridIndexUnspecified = 0;
        public static final int MaxGridIndex = 1000;

        private Companion() {
        }

        public static /* synthetic */ void getGridIndexUnspecified$annotations() {
        }

        public static /* synthetic */ void getMaxGridIndex$annotations() {
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Modifier gridItem$default(GridScope gridScope, Modifier modifier, int i, int i2, int i3, int i4, Alignment alignment, int i5, Object obj) {
            int i6 = lv0.a;
            if (obj != null) {
                f31.f("Super calls with default arguments not supported in this target, function: gridItem");
                return null;
            }
            if ((i5 & 1) != 0) {
                i = 0;
            }
            if ((i5 & 2) != 0) {
                i2 = 0;
            }
            if ((i5 & 4) != 0) {
                i3 = 1;
            }
            if ((i5 & 8) != 0) {
                i4 = 1;
            }
            if ((i5 & 16) != 0) {
                alignment = Alignment.Companion.getTopStart();
            }
            return gridScope.gridItem(modifier, i, i2, i3, i4, alignment);
        }

        public static /* synthetic */ Modifier gridItem$default(GridScope gridScope, Modifier modifier, i61 i61Var, i61 i61Var2, Alignment alignment, int i, Object obj) {
            int i2 = lv0.a;
            if (obj != null) {
                f31.f("Super calls with default arguments not supported in this target, function: gridItem");
                return null;
            }
            if ((i & 4) != 0) {
                alignment = Alignment.Companion.getTopStart();
            }
            return gridScope.gridItem(modifier, i61Var, i61Var2, alignment);
        }

        public static /* synthetic */ Modifier gridItem$default(GridScope gridScope, Modifier modifier, Object obj, Alignment alignment, int i, Object obj2) {
            int i2 = lv0.a;
            if (obj2 != null) {
                f31.f("Super calls with default arguments not supported in this target, function: gridItem");
                return null;
            }
            if ((i & 2) != 0) {
                alignment = Alignment.Companion.getTopStart();
            }
            return gridScope.gridItem(modifier, obj, alignment);
        }
    }

    Modifier gridItem(Modifier modifier, int i, int i2, int i3, int i4, Alignment alignment);

    Modifier gridItem(Modifier modifier, i61 i61Var, i61 i61Var2, Alignment alignment);

    Modifier gridItem(Modifier modifier, Object obj, Alignment alignment);
}
