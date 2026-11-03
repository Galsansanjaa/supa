package androidx.compose.ui.scrollcapture;

import androidx.compose.ui.AndroidComposeUiFlags;
import defpackage.a10;
import defpackage.e50;
import defpackage.ea0;
import defpackage.ej1;
import defpackage.k93;
import defpackage.qq;
import defpackage.ts0;
import defpackage.vy2;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class RelativeScroller {
    private float scrollAmount;
    private final ts0 scrollBy;
    private final int viewportSize;

    public RelativeScroller(int i, ts0 ts0Var) {
        this.viewportSize = i;
        this.scrollBy = ts0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object scrollBy(float r5, defpackage.a10 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.compose.ui.scrollcapture.RelativeScroller$scrollBy$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.ui.scrollcapture.RelativeScroller$scrollBy$1 r0 = (androidx.compose.ui.scrollcapture.RelativeScroller$scrollBy$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.scrollcapture.RelativeScroller$scrollBy$1 r0 = new androidx.compose.ui.scrollcapture.RelativeScroller$scrollBy$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.ta3.H(r6)
            goto L41
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.hu2.h(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.ta3.H(r6)
            ts0 r6 = r4.scrollBy
            java.lang.Float r1 = new java.lang.Float
            r1.<init>(r5)
            r0.label = r2
            java.lang.Object r6 = r6.invoke(r1, r0)
            e50 r5 = defpackage.e50.a
            if (r6 != r5) goto L41
            return r5
        L41:
            java.lang.Number r6 = (java.lang.Number) r6
            float r5 = r6.floatValue()
            float r6 = r4.scrollAmount
            float r6 = r6 + r5
            r4.scrollAmount = r6
            vy2 r4 = defpackage.vy2.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.scrollcapture.RelativeScroller.scrollBy(float, a10):java.lang.Object");
    }

    public final float getScrollAmount() {
        return this.scrollAmount;
    }

    public final int mapOffsetToViewport(int i) {
        return ea0.o(i - ej1.K(this.scrollAmount), 0, this.viewportSize);
    }

    public final void reset() {
        this.scrollAmount = 0.0f;
    }

    public final Object scrollRangeToCenter(int i, int i2, a10 a10Var) {
        if (i > i2) {
            qq.j(k93.l(i, i2, "Expected min=", " ≤ max="));
            return null;
        }
        int i3 = i2 - i;
        int i4 = this.viewportSize;
        if (i3 > i4) {
            qq.j(k93.l(i3, i4, "Expected range (", ") to be ≤ viewportSize="));
            return null;
        }
        boolean z = AndroidComposeUiFlags.isAlwaysScrollDuringScrollCaptureEnabled;
        vy2 vy2Var = vy2.a;
        if (!z) {
            float f = i;
            float f2 = this.scrollAmount;
            if (f >= f2 && i2 <= f2 + i4) {
                return vy2Var;
            }
        }
        Object scrollTo = scrollTo(((i3 / 2) + i) - (i4 / 2), a10Var);
        return scrollTo == e50.a ? scrollTo : vy2Var;
    }

    public final Object scrollTo(float f, a10 a10Var) {
        Object scrollBy = scrollBy(f - this.scrollAmount, a10Var);
        return scrollBy == e50.a ? scrollBy : vy2.a;
    }
}
