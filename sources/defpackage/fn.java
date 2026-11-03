package defpackage;

import androidx.compose.foundation.contextmenu.ContextMenuUiKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.CoreTextFieldKt;
import androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter;
import androidx.compose.material3.ExposedDropdownMenuKt;
import androidx.compose.ui.focus.FocusRequester;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class fn implements os0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object m;

    public /* synthetic */ fn(int i, boolean z, Object obj) {
        this.a = i;
        this.b = z;
        this.m = obj;
    }

    @Override // defpackage.os0
    public final Object invoke() {
        vy2 BasicTextField$lambda$10$0;
        vy2 CoreTextField$lambda$19$0;
        vy2 ExposedDropdownMenuBox$lambda$20$lambda$19;
        switch (this.a) {
            case 0:
                BasicTextField$lambda$10$0 = BasicTextFieldKt.BasicTextField$lambda$10$0(this.b, (lm1) this.m);
                return BasicTextField$lambda$10$0;
            case 1:
                return ContextMenuUiKt.d(this.b, (os0) this.m);
            case 2:
                CoreTextField$lambda$19$0 = CoreTextFieldKt.CoreTextField$lambda$19$0(this.b, (LegacyPlatformTextInputServiceAdapter) this.m);
                return CoreTextField$lambda$19$0;
            default:
                ExposedDropdownMenuBox$lambda$20$lambda$19 = ExposedDropdownMenuKt.ExposedDropdownMenuBox$lambda$20$lambda$19(this.b, (FocusRequester) this.m);
                return ExposedDropdownMenuBox$lambda$20$lambda$19;
        }
    }
}
