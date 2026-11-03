package defpackage;

import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsProviderModifierNode;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.TextFieldSizeKt;
import androidx.compose.foundation.text.input.internal.TextFieldTextLayoutModifierNode;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode;
import androidx.compose.foundation.text.modifiers.TextStringSimpleNode;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.BadgeKt;
import androidx.compose.material3.ClockFaceSizeModifier;
import androidx.compose.material3.DragHandleKt;
import androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1;
import androidx.compose.material3.SliderDefaults;
import androidx.compose.material3.TooltipKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.RootMeasurePolicy;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class h8 implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Placeable b;

    public /* synthetic */ h8(int i, Placeable placeable) {
        this.a = i;
        this.b = placeable;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        vy2 BottomAppBarLayout_t5fmz9U$lambda$23$lambda$22$lambda$21;
        vy2 VerticalDragHandle$lambda$13$lambda$12$lambda$11;
        vy2 textFieldLabelMinHeight$lambda$26$lambda$25;
        vy2 layoutCaret_J5j9r9c$lambda$22$lambda$21;
        int i = this.a;
        Placeable placeable = this.b;
        switch (i) {
            case 0:
                BottomAppBarLayout_t5fmz9U$lambda$23$lambda$22$lambda$21 = AppBarKt.BottomAppBarLayout_t5fmz9U$lambda$23$lambda$22$lambda$21(placeable, (Placeable.PlacementScope) obj);
                return BottomAppBarLayout_t5fmz9U$lambda$23$lambda$22$lambda$21;
            case 1:
                Placeable.PlacementScope.place$default((Placeable.PlacementScope) obj, this.b, 0, 0, 0.0f, 4, null);
                return vy2.a;
            case 2:
                return BadgeKt.d(placeable, (Placeable.PlacementScope) obj);
            case 3:
                return BasicTextFieldKt.s(placeable, (Placeable.PlacementScope) obj);
            case 4:
                return ClockFaceSizeModifier.a(placeable, (Placeable.PlacementScope) obj);
            case 5:
                VerticalDragHandle$lambda$13$lambda$12$lambda$11 = DragHandleKt.VerticalDragHandle$lambda$13$lambda$12$lambda$11(placeable, (Placeable.PlacementScope) obj);
                return VerticalDragHandle$lambda$13$lambda$12$lambda$11;
            case 6:
                return ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1.g(placeable, (Placeable.PlacementScope) obj);
            case 7:
                return LazyLayoutBeyondBoundsProviderModifierNode.a(placeable, (Placeable.PlacementScope) obj);
            case 8:
                return RootMeasurePolicy.b(placeable, (Placeable.PlacementScope) obj);
            case 9:
                return SliderDefaults.o(placeable, (Placeable.PlacementScope) obj);
            case 10:
                return SliderDefaults.p(placeable, (Placeable.PlacementScope) obj);
            case 11:
                return TextAnnotatedStringNode.b(placeable, (Placeable.PlacementScope) obj);
            case 12:
                textFieldLabelMinHeight$lambda$26$lambda$25 = TextFieldImplKt.textFieldLabelMinHeight$lambda$26$lambda$25(placeable, (Placeable.PlacementScope) obj);
                return textFieldLabelMinHeight$lambda$26$lambda$25;
            case 13:
                return TextFieldSizeKt.c(placeable, (Placeable.PlacementScope) obj);
            case 14:
                return TextFieldTextLayoutModifierNode.a(placeable, (Placeable.PlacementScope) obj);
            case 15:
                return TextStringSimpleNode.c(placeable, (Placeable.PlacementScope) obj);
            default:
                layoutCaret_J5j9r9c$lambda$22$lambda$21 = TooltipKt.layoutCaret_J5j9r9c$lambda$22$lambda$21(placeable, (Placeable.PlacementScope) obj);
                return layoutCaret_J5j9r9c$lambda$22$lambda$21;
        }
    }
}
