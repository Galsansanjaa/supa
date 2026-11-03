package androidx.compose.material3;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import defpackage.ps0;
import defpackage.vy2;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements ps0 {
    public final /* synthetic */ int a;

    public /* synthetic */ d(int i) {
        this.a = i;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        AppBarOverflowStateImpl Saver$lambda$2;
        vy2 invoke$lambda$3$lambda$2;
        vy2 invoke$lambda$5$lambda$4;
        vy2 invoke$lambda$12$lambda$8$lambda$7;
        vy2 invoke$lambda$1$lambda$0;
        vy2 measure_3p2s80s$lambda$0;
        switch (this.a) {
            case 0:
                Saver$lambda$2 = AppBarOverflowStateImpl.Saver$lambda$2((List) obj);
                return Saver$lambda$2;
            case 1:
                return CenteredContentMeasurePolicy.b((Placeable.PlacementScope) obj);
            case 2:
                return DateInputKt$DateInputContent$3.a((SemanticsPropertyReceiver) obj);
            case 3:
                return DatePickerKt$Day$2.a((SemanticsPropertyReceiver) obj);
            case 4:
                invoke$lambda$3$lambda$2 = DatePickerKt$HorizontalMonthsList$1.invoke$lambda$3$lambda$2((SemanticsPropertyReceiver) obj);
                return invoke$lambda$3$lambda$2;
            case 5:
                return DatePickerKt$Year$2.a((SemanticsPropertyReceiver) obj);
            case 6:
                return DateRangeInputKt$DateRangeInputContent$2$3.a((SemanticsPropertyReceiver) obj);
            case 7:
                return DateRangeInputKt$DateRangeInputContent$2$6.a((SemanticsPropertyReceiver) obj);
            case 8:
                invoke$lambda$5$lambda$4 = DateRangePickerKt$VerticalMonthsList$1.invoke$lambda$5$lambda$4((SemanticsPropertyReceiver) obj);
                return invoke$lambda$5$lambda$4;
            case 9:
                return DefaultNavigationRailOverride$NavigationRail$1.a((SemanticsPropertyReceiver) obj);
            case 10:
                return EqualWeightContentMeasurePolicy.a((Placeable.PlacementScope) obj);
            case 11:
                return FloatingActionButtonKt$ExtendedFloatingActionButton$3$1$1.a((SemanticsPropertyReceiver) obj);
            case 12:
                invoke$lambda$12$lambda$8$lambda$7 = FloatingActionButtonKt$ExtendedFloatingActionButton$5.invoke$lambda$12$lambda$8$lambda$7((SemanticsPropertyReceiver) obj);
                return invoke$lambda$12$lambda$8$lambda$7;
            case 13:
                return ModalBottomSheetKt$ModalBottomSheet$4.a((SemanticsPropertyReceiver) obj);
            case 14:
                return ModalBottomSheet_androidKt$ModalBottomSheetDialog$dialog$1$1$1.a((SemanticsPropertyReceiver) obj);
            case 15:
                return NavigationBarKt$NavigationBarItem$styledIcon$1.a((SemanticsPropertyReceiver) obj);
            case 16:
                return NavigationRailKt$NavigationRailItem$styledIcon$1.a((SemanticsPropertyReceiver) obj);
            case 17:
                return OutlinedTextFieldKt$OutlinedTextField$1.a((SemanticsPropertyReceiver) obj);
            case 18:
                return OutlinedTextFieldKt$OutlinedTextField$3.a((SemanticsPropertyReceiver) obj);
            case 19:
                return OutlinedTextFieldKt$OutlinedTextField$5.a((SemanticsPropertyReceiver) obj);
            case 20:
                return SecureTextFieldKt$OutlinedSecureTextField$1.a((SemanticsPropertyReceiver) obj);
            case 21:
                return SurfaceKt$Surface$1.a((SemanticsPropertyReceiver) obj);
            case 22:
                invoke$lambda$1$lambda$0 = TimePickerKt$ClockFace$1.invoke$lambda$1$lambda$0((SemanticsPropertyReceiver) obj);
                return invoke$lambda$1$lambda$0;
            case 23:
                measure_3p2s80s$lambda$0 = VisibleModifier.measure_3p2s80s$lambda$0((Placeable.PlacementScope) obj);
                return measure_3p2s80s$lambda$0;
            case 24:
                return WideNavigationRailKt$WideNavigationRailLayout$1.a((SemanticsPropertyReceiver) obj);
            default:
                return WideNavigationRail_androidKt$ModalWideNavigationRailDialog$dialog$1$1$1.a((SemanticsPropertyReceiver) obj);
        }
    }
}
