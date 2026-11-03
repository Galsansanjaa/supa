package androidx.core.util;

import defpackage.dv1;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class PairKt {
    public static final <F, S> F component1(android.util.Pair<F, S> pair) {
        return (F) pair.first;
    }

    public static final <F, S> F component1(Pair<F, S> pair) {
        return pair.first;
    }

    public static final <F, S> S component2(android.util.Pair<F, S> pair) {
        return (S) pair.second;
    }

    public static final <F, S> S component2(Pair<F, S> pair) {
        return pair.second;
    }

    public static final <F, S> android.util.Pair<F, S> toAndroidPair(dv1 dv1Var) {
        return new android.util.Pair<>(dv1Var.a, dv1Var.b);
    }

    public static final <F, S> Pair<F, S> toAndroidXPair(dv1 dv1Var) {
        return new Pair<>(dv1Var.a, dv1Var.b);
    }

    public static final <F, S> dv1 toKotlinPair(android.util.Pair<F, S> pair) {
        return new dv1(pair.first, pair.second);
    }

    public static final <F, S> dv1 toKotlinPair(Pair<F, S> pair) {
        return new dv1(pair.first, pair.second);
    }
}
