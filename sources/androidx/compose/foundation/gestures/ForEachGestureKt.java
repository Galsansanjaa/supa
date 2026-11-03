package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import defpackage.a10;
import defpackage.e50;
import defpackage.ts0;
import defpackage.vy2;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class ForEachGestureKt {
    public static final boolean allPointersUp(AwaitPointerEventScope awaitPointerEventScope) {
        List<PointerInputChange> changes = awaitPointerEventScope.getCurrentEvent().getChanges();
        int size = changes.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            if (changes.get(i).getPressed()) {
                z = true;
                break;
            }
            i++;
        }
        return !z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x003e, code lost:
    
        if (allPointersUp(r6) == false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004c -> B:10:0x004f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object awaitAllPointersUp(androidx.compose.ui.input.pointer.AwaitPointerEventScope r6, androidx.compose.ui.input.pointer.PointerEventPass r7, defpackage.a10 r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3 r0 = (androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3 r0 = new androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L30
            java.lang.Object r6 = r0.L$1
            androidx.compose.ui.input.pointer.PointerEventPass r6 = (androidx.compose.ui.input.pointer.PointerEventPass) r6
            java.lang.Object r7 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r7 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r7
            defpackage.ta3.H(r8)
            r5 = r7
            r7 = r6
            r6 = r5
            goto L4f
        L30:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.hu2.h(r6)
            r6 = 0
            return r6
        L37:
            defpackage.ta3.H(r8)
            boolean r8 = allPointersUp(r6)
            if (r8 != 0) goto L6f
        L40:
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r2
            java.lang.Object r8 = r6.awaitPointerEvent(r7, r0)
            e50 r1 = defpackage.e50.a
            if (r8 != r1) goto L4f
            return r1
        L4f:
            androidx.compose.ui.input.pointer.PointerEvent r8 = (androidx.compose.ui.input.pointer.PointerEvent) r8
            java.util.List r8 = r8.getChanges()
            r1 = r8
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
            r3 = 0
        L5d:
            if (r3 >= r1) goto L6f
            java.lang.Object r4 = r8.get(r3)
            androidx.compose.ui.input.pointer.PointerInputChange r4 = (androidx.compose.ui.input.pointer.PointerInputChange) r4
            boolean r4 = r4.getPressed()
            if (r4 == 0) goto L6c
            goto L40
        L6c:
            int r3 = r3 + 1
            goto L5d
        L6f:
            vy2 r6 = defpackage.vy2.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ForEachGestureKt.awaitAllPointersUp(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.ui.input.pointer.PointerEventPass, a10):java.lang.Object");
    }

    public static final Object awaitAllPointersUp(PointerInputScope pointerInputScope, a10 a10Var) {
        Object awaitPointerEventScope = pointerInputScope.awaitPointerEventScope(new ForEachGestureKt$awaitAllPointersUp$2(null), a10Var);
        return awaitPointerEventScope == e50.a ? awaitPointerEventScope : vy2.a;
    }

    public static /* synthetic */ Object awaitAllPointersUp$default(AwaitPointerEventScope awaitPointerEventScope, PointerEventPass pointerEventPass, a10 a10Var, int i, Object obj) {
        if ((i & 1) != 0) {
            pointerEventPass = PointerEventPass.Final;
        }
        return awaitAllPointersUp(awaitPointerEventScope, pointerEventPass, a10Var);
    }

    public static final Object awaitEachGesture(PointerInputScope pointerInputScope, ts0 ts0Var, a10 a10Var) {
        Object awaitPointerEventScope = pointerInputScope.awaitPointerEventScope(new ForEachGestureKt$awaitEachGesture$2(a10Var.getContext(), ts0Var, null), a10Var);
        return awaitPointerEventScope == e50.a ? awaitPointerEventScope : vy2.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:1|(2:3|(4:5|6|7|(1:(4:(1:(1:12)(2:35|36))(2:37|38)|13|14|(4:19|20|(2:22|23)|26)(2:16|17))(3:39|40|23))(3:41|14|(0)(0))))|43|6|7|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008e, code lost:
    
        if (r10 != r5) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a8, code lost:
    
        if (r10 == r5) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0052, code lost:
    
        r10 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0071 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.compose.ui.input.pointer.PointerInputScope, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v3, types: [androidx.compose.ui.input.pointer.PointerInputScope, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [androidx.compose.ui.input.pointer.PointerInputScope] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [j20, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x008e -> B:13:0x004f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00a8 -> B:13:0x004f). Please report as a decompilation issue!!! */
    @defpackage.hd0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object forEachGesture(androidx.compose.ui.input.pointer.PointerInputScope r8, defpackage.ts0 r9, defpackage.a10 r10) {
        /*
            boolean r0 = r10 instanceof androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1 r0 = (androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1 r0 = new androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            int r1 = r0.label
            r2 = 3
            r3 = 2
            r4 = 1
            e50 r5 = defpackage.e50.a
            if (r1 == 0) goto L64
            if (r1 == r4) goto L54
            if (r1 == r3) goto L40
            if (r1 != r2) goto L39
            java.lang.Object r8 = r0.L$2
            j20 r8 = (defpackage.j20) r8
            java.lang.Object r9 = r0.L$1
            ts0 r9 = (defpackage.ts0) r9
            java.lang.Object r1 = r0.L$0
            androidx.compose.ui.input.pointer.PointerInputScope r1 = (androidx.compose.ui.input.pointer.PointerInputScope) r1
            defpackage.ta3.H(r10)
            goto L4f
        L39:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.hu2.h(r8)
            r8 = 0
            return r8
        L40:
            java.lang.Object r8 = r0.L$2
            j20 r8 = (defpackage.j20) r8
            java.lang.Object r9 = r0.L$1
            ts0 r9 = (defpackage.ts0) r9
            java.lang.Object r1 = r0.L$0
            androidx.compose.ui.input.pointer.PointerInputScope r1 = (androidx.compose.ui.input.pointer.PointerInputScope) r1
            defpackage.ta3.H(r10)     // Catch: java.util.concurrent.CancellationException -> L52
        L4f:
            r10 = r8
            r8 = r1
            goto L6b
        L52:
            r10 = move-exception
            goto L96
        L54:
            java.lang.Object r8 = r0.L$2
            j20 r8 = (defpackage.j20) r8
            java.lang.Object r9 = r0.L$1
            ts0 r9 = (defpackage.ts0) r9
            java.lang.Object r1 = r0.L$0
            androidx.compose.ui.input.pointer.PointerInputScope r1 = (androidx.compose.ui.input.pointer.PointerInputScope) r1
            defpackage.ta3.H(r10)     // Catch: java.util.concurrent.CancellationException -> L52
            goto L82
        L64:
            defpackage.ta3.H(r10)
            j20 r10 = r0.getContext()
        L6b:
            boolean r1 = defpackage.nb0.B(r10)
            if (r1 == 0) goto Lac
            r0.L$0 = r8     // Catch: java.util.concurrent.CancellationException -> L91
            r0.L$1 = r9     // Catch: java.util.concurrent.CancellationException -> L91
            r0.L$2 = r10     // Catch: java.util.concurrent.CancellationException -> L91
            r0.label = r4     // Catch: java.util.concurrent.CancellationException -> L91
            java.lang.Object r1 = r9.invoke(r8, r0)     // Catch: java.util.concurrent.CancellationException -> L91
            if (r1 != r5) goto L80
            goto Laa
        L80:
            r1 = r8
            r8 = r10
        L82:
            r0.L$0 = r1     // Catch: java.util.concurrent.CancellationException -> L52
            r0.L$1 = r9     // Catch: java.util.concurrent.CancellationException -> L52
            r0.L$2 = r8     // Catch: java.util.concurrent.CancellationException -> L52
            r0.label = r3     // Catch: java.util.concurrent.CancellationException -> L52
            java.lang.Object r10 = awaitAllPointersUp(r1, r0)     // Catch: java.util.concurrent.CancellationException -> L52
            if (r10 != r5) goto L4f
            goto Laa
        L91:
            r1 = move-exception
            r7 = r1
            r1 = r8
            r8 = r10
            r10 = r7
        L96:
            boolean r6 = defpackage.nb0.B(r8)
            if (r6 == 0) goto Lab
            r0.L$0 = r1
            r0.L$1 = r9
            r0.L$2 = r8
            r0.label = r2
            java.lang.Object r10 = awaitAllPointersUp(r1, r0)
            if (r10 != r5) goto L4f
        Laa:
            return r5
        Lab:
            throw r10
        Lac:
            vy2 r8 = defpackage.vy2.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ForEachGestureKt.forEachGesture(androidx.compose.ui.input.pointer.PointerInputScope, ts0, a10):java.lang.Object");
    }
}
