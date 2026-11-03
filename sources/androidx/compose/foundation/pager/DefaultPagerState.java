package androidx.compose.foundation.pager;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import defpackage.ea0;
import defpackage.nb0;
import defpackage.os0;
import defpackage.sb0;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class DefaultPagerState extends PagerState {
    public static final Companion Companion = new Companion(null);
    private static final Saver<DefaultPagerState, ?> Saver = ListSaverKt.listSaver(new Object(), new Object());
    private MutableState<os0> pageCountState;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        public final Saver<DefaultPagerState, ?> getSaver() {
            return DefaultPagerState.Saver;
        }
    }

    public DefaultPagerState(int i, float f, os0 os0Var) {
        super(i, f);
        MutableState<os0> mutableStateOf$default;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(os0Var, null, 2, null);
        this.pageCountState = mutableStateOf$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List Saver$lambda$0(SaverScope saverScope, DefaultPagerState defaultPagerState) {
        return nb0.D(Integer.valueOf(defaultPagerState.getCurrentPage()), Float.valueOf(ea0.n(defaultPagerState.getCurrentPageOffsetFraction(), -0.5f, 0.5f)), Integer.valueOf(defaultPagerState.getPageCount()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DefaultPagerState Saver$lambda$1(final List list) {
        Object obj = list.get(0);
        obj.getClass();
        int intValue = ((Integer) obj).intValue();
        Object obj2 = list.get(1);
        obj2.getClass();
        return new DefaultPagerState(intValue, ((Float) obj2).floatValue(), new os0() { // from class: androidx.compose.foundation.pager.c
            @Override // defpackage.os0
            public final Object invoke() {
                int Saver$lambda$1$0;
                Saver$lambda$1$0 = DefaultPagerState.Saver$lambda$1$0(list);
                return Integer.valueOf(Saver$lambda$1$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int Saver$lambda$1$0(List list) {
        Object obj = list.get(2);
        obj.getClass();
        return ((Integer) obj).intValue();
    }

    @Override // androidx.compose.foundation.pager.PagerState
    public int getPageCount() {
        return ((Number) this.pageCountState.getValue().invoke()).intValue();
    }

    public final MutableState<os0> getPageCountState() {
        return this.pageCountState;
    }

    public final void setPageCountState(MutableState<os0> mutableState) {
        this.pageCountState = mutableState;
    }
}
