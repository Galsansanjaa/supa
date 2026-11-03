package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import defpackage.ts0;
import defpackage.vy2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class ComposableSingletons$WideNavigationRail_androidKt {
    public static final ComposableSingletons$WideNavigationRail_androidKt INSTANCE = new ComposableSingletons$WideNavigationRail_androidKt();
    private static ts0 lambda$2011757776 = ComposableLambdaKt.composableLambdaInstance(2011757776, false, new ts0() { // from class: androidx.compose.material3.ComposableSingletons$WideNavigationRail_androidKt$lambda$2011757776$1
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
                ComposerKt.traceEventStart(2011757776, i, -1, "androidx.compose.material3.ComposableSingletons$WideNavigationRail_androidKt.lambda$2011757776.<anonymous> (WideNavigationRail.android.kt:185)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final ts0 getLambda$2011757776$material3() {
        return lambda$2011757776;
    }
}
