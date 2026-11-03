package androidx.compose.foundation.text.input.internal;

import java.util.function.IntConsumer;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ IntConsumer b;
    public final /* synthetic */ int m;

    public /* synthetic */ d(IntConsumer intConsumer, int i, int i2) {
        this.a = i2;
        this.b = intConsumer;
        this.m = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        int i2 = this.m;
        IntConsumer intConsumer = this.b;
        switch (i) {
            case 0:
                Api34LegacyPerformHandwritingGestureImpl.a(intConsumer, i2);
                return;
            default:
                Api34PerformHandwritingGestureImpl.a(intConsumer, i2);
                return;
        }
    }
}
