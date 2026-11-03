package androidx.compose.foundation.text.input.internal;

import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public interface ImeEditCommandScope {
    boolean beginBatchEdit();

    void edit(ps0 ps0Var);

    boolean endBatchEdit();

    int getTransformedLength();

    /* renamed from: mapFromTransformed-GEjPoXI */
    long mo1775mapFromTransformedGEjPoXI(long j);

    /* renamed from: mapToTransformed-GEjPoXI */
    long mo1776mapToTransformedGEjPoXI(long j);
}
