package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import defpackage.ts0;
import defpackage.us0;
import defpackage.vy2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class ComposableSingletons$BottomSheetScaffoldKt {
    public static final ComposableSingletons$BottomSheetScaffoldKt INSTANCE = new ComposableSingletons$BottomSheetScaffoldKt();
    private static ts0 lambda$1392012807 = ComposableLambdaKt.composableLambdaInstance(1392012807, false, new ts0() { // from class: androidx.compose.material3.ComposableSingletons$BottomSheetScaffoldKt$lambda$1392012807$1
        @Override // defpackage.ts0
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return vy2.a;
        }

        public final void invoke(Composer composer, int i) {
            if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1392012807, i, -1, "androidx.compose.material3.ComposableSingletons$BottomSheetScaffoldKt.lambda$1392012807.<anonymous> (BottomSheetScaffold.kt:128)");
            }
            BottomSheetDefaults.INSTANCE.m2264DragHandlelgZ2HuY(null, 0.0f, 0.0f, null, 0L, composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static us0 lambda$1768941633 = ComposableLambdaKt.composableLambdaInstance(1768941633, false, new us0() { // from class: androidx.compose.material3.ComposableSingletons$BottomSheetScaffoldKt$lambda$1768941633$1
        @Override // defpackage.us0
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((SnackbarHostState) obj, (Composer) obj2, ((Number) obj3).intValue());
            return vy2.a;
        }

        public final void invoke(SnackbarHostState snackbarHostState, Composer composer, int i) {
            if ((i & 6) == 0) {
                i |= composer.changed(snackbarHostState) ? 4 : 2;
            }
            if (!composer.shouldExecute((i & 19) != 18, i & 1)) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1768941633, i, -1, "androidx.compose.material3.ComposableSingletons$BottomSheetScaffoldKt.lambda$1768941633.<anonymous> (BottomSheetScaffold.kt:131)");
            }
            SnackbarHostKt.SnackbarHost(snackbarHostState, null, null, composer, i & 14, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-788244078, reason: not valid java name */
    private static ts0 f24lambda$788244078 = ComposableLambdaKt.composableLambdaInstance(-788244078, false, new ts0() { // from class: androidx.compose.material3.ComposableSingletons$BottomSheetScaffoldKt$lambda$-788244078$1
        @Override // defpackage.ts0
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return vy2.a;
        }

        public final void invoke(Composer composer, int i) {
            if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-788244078, i, -1, "androidx.compose.material3.ComposableSingletons$BottomSheetScaffoldKt.lambda$-788244078.<anonymous> (BottomSheetScaffold.kt:415)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-788244078$material3, reason: not valid java name */
    public final ts0 m2454getLambda$788244078$material3() {
        return f24lambda$788244078;
    }

    public final ts0 getLambda$1392012807$material3() {
        return lambda$1392012807;
    }

    public final us0 getLambda$1768941633$material3() {
        return lambda$1768941633;
    }
}
