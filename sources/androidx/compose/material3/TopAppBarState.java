package androidx.compose.material3;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import defpackage.ea0;
import defpackage.gk2;
import defpackage.nb0;
import defpackage.pp2;
import defpackage.sb0;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class TopAppBarState {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final Saver<TopAppBarState, ?> Saver = ListSaverKt.listSaver(new gk2(20), new pp2(26));
    private MutableFloatState _heightOffset;
    private final MutableFloatState contentOffset$delegate;
    private float heightOffsetLimit;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        public final Saver<TopAppBarState, ?> getSaver() {
            return TopAppBarState.Saver;
        }
    }

    public TopAppBarState(float f, float f2, float f3) {
        this.heightOffsetLimit = f;
        this.contentOffset$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(f3);
        this._heightOffset = PrimitiveSnapshotStateKt.mutableFloatStateOf(f2);
    }

    public static final List Saver$lambda$0(SaverScope saverScope, TopAppBarState topAppBarState) {
        return nb0.D(Float.valueOf(topAppBarState.heightOffsetLimit), Float.valueOf(topAppBarState.getHeightOffset()), Float.valueOf(topAppBarState.getContentOffset()));
    }

    public static final TopAppBarState Saver$lambda$1(List list) {
        return new TopAppBarState(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue(), ((Number) list.get(2)).floatValue());
    }

    public static /* synthetic */ TopAppBarState b(List list) {
        return Saver$lambda$1(list);
    }

    public final float getCollapsedFraction() {
        if (this.heightOffsetLimit == 0.0f) {
            return 0.0f;
        }
        return getHeightOffset() / this.heightOffsetLimit;
    }

    public final float getContentOffset() {
        return this.contentOffset$delegate.getFloatValue();
    }

    public final float getHeightOffset() {
        return this._heightOffset.getFloatValue();
    }

    public final float getHeightOffsetLimit() {
        return this.heightOffsetLimit;
    }

    public final float getOverlappedFraction() {
        float f = this.heightOffsetLimit;
        if (f == 0.0f) {
            return 0.0f;
        }
        return 1.0f - (ea0.n(f - getContentOffset(), this.heightOffsetLimit, 0.0f) / this.heightOffsetLimit);
    }

    public final void setContentOffset(float f) {
        this.contentOffset$delegate.setFloatValue(f);
    }

    public final void setHeightOffset(float f) {
        this._heightOffset.setFloatValue(ea0.n(f, this.heightOffsetLimit, 0.0f));
    }

    public final void setHeightOffsetLimit(float f) {
        this.heightOffsetLimit = f;
    }
}
