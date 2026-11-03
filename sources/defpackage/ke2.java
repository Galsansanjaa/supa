package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class ke2 {
    public static final ie2 a = new ie2(new byte[0], 0, 0, false);
    public static final int b;
    public static final AtomicReference[] c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        b = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        c = atomicReferenceArr;
    }

    public static final void a(ie2 ie2Var) {
        ie2Var.getClass();
        if (ie2Var.f != null || ie2Var.g != null) {
            v5.m("Failed requirement.");
            return;
        }
        if (ie2Var.d) {
            return;
        }
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (b - 1))];
        ie2 ie2Var2 = a;
        ie2 ie2Var3 = (ie2) atomicReference.getAndSet(ie2Var2);
        if (ie2Var3 == ie2Var2) {
            return;
        }
        int i = ie2Var3 != null ? ie2Var3.c : 0;
        if (i >= 65536) {
            atomicReference.set(ie2Var3);
            return;
        }
        ie2Var.f = ie2Var3;
        ie2Var.b = 0;
        ie2Var.c = i + 8192;
        atomicReference.set(ie2Var);
    }

    public static final ie2 b() {
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (b - 1))];
        ie2 ie2Var = a;
        ie2 ie2Var2 = (ie2) atomicReference.getAndSet(ie2Var);
        if (ie2Var2 == ie2Var) {
            return new ie2();
        }
        if (ie2Var2 == null) {
            atomicReference.set(null);
            return new ie2();
        }
        atomicReference.set(ie2Var2.f);
        ie2Var2.f = null;
        ie2Var2.c = 0;
        return ie2Var2;
    }
}
