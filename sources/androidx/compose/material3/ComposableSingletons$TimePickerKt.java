package androidx.compose.material3;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import defpackage.us0;
import defpackage.vy2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class ComposableSingletons$TimePickerKt {
    public static final ComposableSingletons$TimePickerKt INSTANCE = new ComposableSingletons$TimePickerKt();
    private static us0 lambda$1425358052 = ComposableLambdaKt.composableLambdaInstance(1425358052, false, new us0() { // from class: androidx.compose.material3.ComposableSingletons$TimePickerKt$lambda$1425358052$1
        @Override // defpackage.us0
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return vy2.a;
        }

        public final void invoke(RowScope rowScope, Composer composer, int i) {
            if (!composer.shouldExecute((i & 17) != 16, i & 1)) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1425358052, i, -1, "androidx.compose.material3.ComposableSingletons$TimePickerKt.lambda$1425358052.<anonymous> (TimePicker.kt:1328)");
            }
            Strings.Companion companion = Strings.Companion;
            TextKt.m3230TextNvy7gAk(Strings_androidKt.m3606getString2EP1pXo(Strings.m3527constructorimpl(R.string.m3c_time_picker_am), composer, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1179219109, reason: not valid java name */
    private static us0 f40lambda$1179219109 = ComposableLambdaKt.composableLambdaInstance(-1179219109, false, new us0() { // from class: androidx.compose.material3.ComposableSingletons$TimePickerKt$lambda$-1179219109$1
        @Override // defpackage.us0
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return vy2.a;
        }

        public final void invoke(RowScope rowScope, Composer composer, int i) {
            if (!composer.shouldExecute((i & 17) != 16, i & 1)) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1179219109, i, -1, "androidx.compose.material3.ComposableSingletons$TimePickerKt.lambda$-1179219109.<anonymous> (TimePicker.kt:1346)");
            }
            Strings.Companion companion = Strings.Companion;
            TextKt.m3230TextNvy7gAk(Strings_androidKt.m3606getString2EP1pXo(Strings.m3527constructorimpl(R.string.m3c_time_picker_pm), composer, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1179219109$material3, reason: not valid java name */
    public final us0 m2470getLambda$1179219109$material3() {
        return f40lambda$1179219109;
    }

    public final us0 getLambda$1425358052$material3() {
        return lambda$1425358052;
    }
}
