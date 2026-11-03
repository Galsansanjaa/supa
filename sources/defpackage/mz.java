package defpackage;

import androidx.compose.foundation.contextmenu.ContextMenuAreaKt;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.material3.DateInputKt;
import androidx.compose.material3.DatePickerKt;
import androidx.compose.material3.DefaultSingleRowTopAppBarOverride;
import androidx.compose.runtime.ComputedProvidableCompositionLocal;
import androidx.compose.runtime.HostDefaultProviderKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.input.InputModeManager;
import androidx.compose.ui.platform.AccessibilityManager;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.Density;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;
import java.lang.reflect.Method;
import java.util.Calendar;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class mz implements os0 {
    public final /* synthetic */ int a;

    public /* synthetic */ mz(int i) {
        this.a = i;
    }

    @Override // defpackage.os0
    public final Object invoke() {
        GraphicsContext LocalGraphicsContext$lambda$0;
        Density LocalDensity$lambda$0;
        FocusManager LocalFocusManager$lambda$0;
        Font.ResourceLoader LocalFontLoader$lambda$0;
        AccessibilityManager LocalAccessibilityManager$lambda$0;
        FontFamily.Resolver LocalFontFamilyResolver$lambda$0;
        HapticFeedback LocalHapticFeedback$lambda$0;
        InputModeManager LocalInputModeManager$lambda$0;
        MutableState DatePickerContent$lambda$25$lambda$24;
        float SingleRowTopAppBar$lambda$15$lambda$14$lambda$13;
        vy2 vy2Var;
        vy2 vy2Var2;
        vy2 vy2Var3;
        vy2 vy2Var4;
        vy2 vy2Var5;
        vy2 vy2Var6;
        vy2 vy2Var7;
        vy2 vy2Var8;
        boolean detectDragGestures$lambda$5;
        vy2 vy2Var9;
        boolean detectDragGestures$lambda$9;
        Method threadSessionMethod_delegate$lambda$7;
        Method beginTransactionMethod_delegate$lambda$8;
        switch (this.a) {
            case 0:
                LocalGraphicsContext$lambda$0 = CompositionLocalsKt.LocalGraphicsContext$lambda$0();
                return LocalGraphicsContext$lambda$0;
            case 1:
                LocalDensity$lambda$0 = CompositionLocalsKt.LocalDensity$lambda$0();
                return LocalDensity$lambda$0;
            case 2:
                LocalFocusManager$lambda$0 = CompositionLocalsKt.LocalFocusManager$lambda$0();
                return LocalFocusManager$lambda$0;
            case 3:
                LocalFontLoader$lambda$0 = CompositionLocalsKt.LocalFontLoader$lambda$0();
                return LocalFontLoader$lambda$0;
            case 4:
                LocalAccessibilityManager$lambda$0 = CompositionLocalsKt.LocalAccessibilityManager$lambda$0();
                return LocalAccessibilityManager$lambda$0;
            case 5:
                LocalFontFamilyResolver$lambda$0 = CompositionLocalsKt.LocalFontFamilyResolver$lambda$0();
                return LocalFontFamilyResolver$lambda$0;
            case 6:
                LocalHapticFeedback$lambda$0 = CompositionLocalsKt.LocalHapticFeedback$lambda$0();
                return LocalHapticFeedback$lambda$0;
            case 7:
                LocalInputModeManager$lambda$0 = CompositionLocalsKt.LocalInputModeManager$lambda$0();
                return LocalInputModeManager$lambda$0;
            case 8:
                return ComputedProvidableCompositionLocal.a();
            case 9:
                return ContextMenuAreaKt.a();
            case 10:
                return Calendar.getInstance();
            case 11:
                return DateInputKt.a();
            case 12:
                DatePickerContent$lambda$25$lambda$24 = DatePickerKt.DatePickerContent$lambda$25$lambda$24();
                return DatePickerContent$lambda$25$lambda$24;
            case 13:
                SingleRowTopAppBar$lambda$15$lambda$14$lambda$13 = DefaultSingleRowTopAppBarOverride.SingleRowTopAppBar$lambda$15$lambda$14$lambda$13();
                return Float.valueOf(SingleRowTopAppBar$lambda$15$lambda$14$lambda$13);
            case 14:
                vy2Var = vy2.a;
                return vy2Var;
            case 15:
                vy2Var2 = vy2.a;
                return vy2Var2;
            case 16:
                vy2Var3 = vy2.a;
                return vy2Var3;
            case 17:
                vy2Var4 = vy2.a;
                return vy2Var4;
            case 18:
                vy2Var5 = vy2.a;
                return vy2Var5;
            case 19:
                vy2Var6 = vy2.a;
                return vy2Var6;
            case 20:
                vy2Var7 = vy2.a;
                return vy2Var7;
            case 21:
                vy2Var8 = vy2.a;
                return vy2Var8;
            case 22:
                detectDragGestures$lambda$5 = DragGestureDetectorKt.detectDragGestures$lambda$5();
                return Boolean.valueOf(detectDragGestures$lambda$5);
            case 23:
                vy2Var9 = vy2.a;
                return vy2Var9;
            case 24:
                detectDragGestures$lambda$9 = DragGestureDetectorKt.detectDragGestures$lambda$9();
                return Boolean.valueOf(detectDragGestures$lambda$9);
            case 25:
                return Boolean.FALSE;
            case 26:
                threadSessionMethod_delegate$lambda$7 = FrameworkSQLiteDatabase.getThreadSessionMethod_delegate$lambda$7();
                return threadSessionMethod_delegate$lambda$7;
            case 27:
                beginTransactionMethod_delegate$lambda$8 = FrameworkSQLiteDatabase.beginTransactionMethod_delegate$lambda$8();
                return beginTransactionMethod_delegate$lambda$8;
            case 28:
                return HostDefaultProviderKt.a();
            default:
                return vy2.a;
        }
    }
}
