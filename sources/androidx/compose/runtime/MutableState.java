package androidx.compose.runtime;

import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public interface MutableState<T> extends State<T> {
    T component1();

    ps0 component2();

    @Override // androidx.compose.runtime.State
    T getValue();

    void setValue(T t);
}
