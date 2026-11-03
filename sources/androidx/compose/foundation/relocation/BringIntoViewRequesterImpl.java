package androidx.compose.foundation.relocation;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.geometry.Rect;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class BringIntoViewRequesterImpl implements BringIntoViewRequester {
    private final MutableVector<BringIntoViewRequesterNode> nodes = new MutableVector<>(new BringIntoViewRequesterNode[16], 0);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect bringIntoView$lambda$0$0(Rect rect) {
        return rect;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0064 -> B:10:0x0067). Please report as a decompilation issue!!! */
    @Override // androidx.compose.foundation.relocation.BringIntoViewRequester
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object bringIntoView(androidx.compose.ui.geometry.Rect r7, defpackage.a10 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1 r0 = (androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1 r0 = new androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L39
            if (r1 != r2) goto L32
            int r6 = r0.I$1
            int r7 = r0.I$0
            java.lang.Object r1 = r0.L$1
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            java.lang.Object r3 = r0.L$0
            androidx.compose.ui.geometry.Rect r3 = (androidx.compose.ui.geometry.Rect) r3
            defpackage.ta3.H(r8)
            r8 = r3
            goto L67
        L32:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.hu2.h(r6)
            r6 = 0
            return r6
        L39:
            defpackage.ta3.H(r8)
            androidx.compose.runtime.collection.MutableVector<androidx.compose.foundation.relocation.BringIntoViewRequesterNode> r6 = r6.nodes
            T[] r8 = r6.content
            int r6 = r6.getSize()
            r1 = 0
            r5 = r8
            r8 = r7
            r7 = r1
            r1 = r5
        L49:
            if (r7 >= r6) goto L69
            r3 = r1[r7]
            androidx.compose.foundation.relocation.BringIntoViewRequesterNode r3 = (androidx.compose.foundation.relocation.BringIntoViewRequesterNode) r3
            androidx.compose.foundation.relocation.a r4 = new androidx.compose.foundation.relocation.a
            r4.<init>()
            r0.L$0 = r8
            r0.L$1 = r1
            r0.I$0 = r7
            r0.I$1 = r6
            r0.label = r2
            java.lang.Object r3 = androidx.compose.ui.relocation.BringIntoViewModifierNodeKt.bringIntoView(r3, r4, r0)
            e50 r4 = defpackage.e50.a
            if (r3 != r4) goto L67
            return r4
        L67:
            int r7 = r7 + r2
            goto L49
        L69:
            vy2 r6 = defpackage.vy2.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.relocation.BringIntoViewRequesterImpl.bringIntoView(androidx.compose.ui.geometry.Rect, a10):java.lang.Object");
    }

    public final MutableVector<BringIntoViewRequesterNode> getNodes() {
        return this.nodes;
    }
}
