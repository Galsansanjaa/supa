package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import defpackage.ts0;
import defpackage.vy2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class ComposableSingletons$ModalBottomSheet_androidKt {
    public static final ComposableSingletons$ModalBottomSheet_androidKt INSTANCE = new ComposableSingletons$ModalBottomSheet_androidKt();

    /* renamed from: lambda$-1294623166, reason: not valid java name */
    private static ts0 f28lambda$1294623166 = ComposableLambdaKt.composableLambdaInstance(-1294623166, false, new ts0() { // from class: androidx.compose.material3.ComposableSingletons$ModalBottomSheet_androidKt$lambda$-1294623166$1
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
                ComposerKt.traceEventStart(-1294623166, i, -1, "androidx.compose.material3.ComposableSingletons$ModalBottomSheet_androidKt.lambda$-1294623166.<anonymous> (ModalBottomSheet.android.kt:338)");
            }
            BottomSheetDefaults.INSTANCE.m2264DragHandlelgZ2HuY(null, 0.0f, 0.0f, null, 0L, composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-91331245, reason: not valid java name */
    private static ts0 f29lambda$91331245 = ComposableLambdaKt.composableLambdaInstance(-91331245, false, new ts0() { // from class: androidx.compose.material3.ComposableSingletons$ModalBottomSheet_androidKt$lambda$-91331245$1
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
                ComposerKt.traceEventStart(-91331245, i, -1, "androidx.compose.material3.ComposableSingletons$ModalBottomSheet_androidKt.lambda$-91331245.<anonymous> (ModalBottomSheet.android.kt:422)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1294623166$material3, reason: not valid java name */
    public final ts0 m2458getLambda$1294623166$material3() {
        return f28lambda$1294623166;
    }

    /* renamed from: getLambda$-91331245$material3, reason: not valid java name */
    public final ts0 m2459getLambda$91331245$material3() {
        return f29lambda$91331245;
    }
}
