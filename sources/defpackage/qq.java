package defpackage;

import androidx.compose.runtime.CancellationHandle;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qq implements CancellationHandle {
    public static /* synthetic */ void c() {
        throw new ClassCastException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void d(int i, Object obj, Object obj2, Object obj3, String str) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + ((char) i));
    }

    public static /* synthetic */ void e(Object obj) {
        throw new AssertionError(obj);
    }

    public static /* synthetic */ void f(Object obj, int i, int i2, String str) {
        throw new IllegalArgumentException(str + i + obj + i2);
    }

    public static /* synthetic */ void g(Object obj, String str) {
        throw new RuntimeException(str + obj);
    }

    public static /* synthetic */ void h(String str) {
        throw new RuntimeException(str);
    }

    public static /* synthetic */ void j(Object obj) {
        throw new IllegalArgumentException(obj.toString());
    }

    @Override // androidx.compose.runtime.CancellationHandle
    public void cancel() {
        CancellationHandle.Companion.Empty$lambda$0();
    }
}
