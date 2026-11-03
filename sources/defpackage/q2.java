package defpackage;

import androidx.compose.foundation.text.BasicSecureTextFieldKt;
import androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdownProvider_androidKt;
import androidx.compose.foundation.text.selection.SelectionContainerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class q2 implements ts0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ts0 b;
    public final /* synthetic */ int m;

    public /* synthetic */ q2(int i, int i2, ts0 ts0Var) {
        this.a = i2;
        this.b = ts0Var;
        this.m = i;
    }

    @Override // defpackage.ts0
    public final Object invoke(Object obj, Object obj2) {
        vy2 DisableCutCopy$lambda$1;
        vy2 LaunchedEffect$lambda$0;
        vy2 DisableSelection$lambda$0;
        int i = this.a;
        int i2 = this.m;
        ts0 ts0Var = this.b;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.intValue();
                r3.m(ts0Var, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return vy2.a;
            case 1:
                DisableCutCopy$lambda$1 = BasicSecureTextFieldKt.DisableCutCopy$lambda$1(ts0Var, i2, composer, num.intValue());
                return DisableCutCopy$lambda$1;
            case 2:
                return DefaultTextContextMenuDropdownProvider_androidKt.h(ts0Var, i2, composer, num.intValue());
            case 3:
                LaunchedEffect$lambda$0 = EffectsKt.LaunchedEffect$lambda$0(ts0Var, i2, composer, num.intValue());
                return LaunchedEffect$lambda$0;
            default:
                DisableSelection$lambda$0 = SelectionContainerKt.DisableSelection$lambda$0(ts0Var, i2, composer, num.intValue());
                return DisableSelection$lambda$0;
        }
    }
}
