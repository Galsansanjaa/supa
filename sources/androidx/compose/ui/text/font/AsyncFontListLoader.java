package androidx.compose.ui.text.font;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import defpackage.ps0;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class AsyncFontListLoader implements State<Object> {
    public static final int $stable = 0;
    private final AsyncTypefaceCache asyncTypefaceCache;
    private boolean cacheable;
    private final List<Font> fontList;
    private final ps0 onCompletion;
    private final PlatformFontLoader platformFontLoader;
    private final TypefaceRequest typefaceRequest;
    private final MutableState value$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    public AsyncFontListLoader(List<? extends Font> list, Object obj, TypefaceRequest typefaceRequest, AsyncTypefaceCache asyncTypefaceCache, ps0 ps0Var, PlatformFontLoader platformFontLoader) {
        MutableState mutableStateOf$default;
        this.fontList = list;
        this.typefaceRequest = typefaceRequest;
        this.asyncTypefaceCache = asyncTypefaceCache;
        this.onCompletion = ps0Var;
        this.platformFontLoader = platformFontLoader;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(obj, null, 2, null);
        this.value$delegate = mutableStateOf$default;
        this.cacheable = true;
    }

    private void setValue(Object obj) {
        this.value$delegate.setValue(obj);
    }

    public final boolean getCacheable$ui_text() {
        return this.cacheable;
    }

    @Override // androidx.compose.runtime.State
    public Object getValue() {
        return this.value$delegate.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e2, code lost:
    
        if (defpackage.nb0.U(r2) == r9) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0069 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a2 A[Catch: all -> 0x003b, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x003b, blocks: (B:12:0x0036, B:27:0x00a2, B:30:0x00d4, B:41:0x0050, B:44:0x005c), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d4 A[Catch: all -> 0x003b, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x003b, blocks: (B:12:0x0036, B:27:0x00a2, B:30:0x00d4, B:41:0x0050, B:44:0x005c), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x007e -> B:14:0x00ec). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00e2 -> B:13:0x00e5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object load(defpackage.a10 r18) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.AsyncFontListLoader.load(a10):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadWithTimeoutOrNull$ui_text(androidx.compose.ui.text.font.Font r6, defpackage.a10 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1 r0 = (androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1 r0 = new androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            int r1 = r0.label
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2f
            java.lang.Object r5 = r0.L$0
            r6 = r5
            androidx.compose.ui.text.font.Font r6 = (androidx.compose.ui.text.font.Font) r6
            defpackage.ta3.H(r7)     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            return r7
        L2b:
            r5 = move-exception
            goto L4d
        L2d:
            r5 = move-exception
            goto L76
        L2f:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.hu2.h(r5)
            return r3
        L35:
            defpackage.ta3.H(r7)
            androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2 r7 = new androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            r7.<init>(r5, r6, r3)     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            r0.L$0 = r6     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            r0.label = r2     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            r1 = 15000(0x3a98, double:7.411E-320)
            java.lang.Object r5 = defpackage.dn3.S(r1, r7, r0)     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            e50 r6 = defpackage.e50.a
            if (r5 != r6) goto L4c
            return r6
        L4c:
            return r5
        L4d:
            j20 r7 = r0.getContext()
            x20 r1 = defpackage.x20.a
            h20 r7 = r7.get(r1)
            y20 r7 = (defpackage.y20) r7
            if (r7 == 0) goto L80
            j20 r0 = r0.getContext()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Unable to load font "
            r2.<init>(r4)
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            r1.<init>(r6, r5)
            r7.handleException(r0, r1)
            goto L80
        L76:
            j20 r6 = r0.getContext()
            boolean r6 = defpackage.nb0.B(r6)
            if (r6 == 0) goto L81
        L80:
            return r3
        L81:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.AsyncFontListLoader.loadWithTimeoutOrNull$ui_text(androidx.compose.ui.text.font.Font, a10):java.lang.Object");
    }

    public final void setCacheable$ui_text(boolean z) {
        this.cacheable = z;
    }
}
