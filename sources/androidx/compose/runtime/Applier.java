package androidx.compose.runtime;

import defpackage.sg3;
import defpackage.ts0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public interface Applier<N> {

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static <N> void apply(Applier<N> applier, ts0 ts0Var, Object obj) {
            ts0Var.invoke(applier.getCurrent(), obj);
        }

        @Deprecated
        public static <N> void onBeginChanges(Applier<N> applier) {
        }

        @Deprecated
        public static <N> void onEndChanges(Applier<N> applier) {
        }

        @Deprecated
        public static <N> void reuse(Applier<N> applier) {
            sg3.b(applier);
        }
    }

    void apply(ts0 ts0Var, Object obj);

    void clear();

    void down(N n);

    N getCurrent();

    void insertBottomUp(int i, N n);

    void insertTopDown(int i, N n);

    void move(int i, int i2, int i3);

    void onBeginChanges();

    void onEndChanges();

    void remove(int i, int i2);

    void reuse();

    void up();
}
