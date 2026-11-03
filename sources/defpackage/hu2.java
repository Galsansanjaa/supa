package defpackage;

import android.view.View;
import androidx.arch.core.util.Function;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsHeightCalculator;
import androidx.compose.foundation.layout.WindowInsetsSizeKt;
import androidx.compose.foundation.layout.WindowInsetsWidthCalculator;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import androidx.work.impl.model.WorkSpec;
import com.google.firebase.datatransport.TransportRegistrar;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class hu2 implements qu2, gy, VisualTransformation, WindowInsetsWidthCalculator, WindowInsetsHeightCalculator, Function, OnApplyWindowInsetsListener {
    public final /* synthetic */ int a;

    public /* synthetic */ hu2(int i) {
        this.a = i;
    }

    public static /* synthetic */ void e() {
        throw new rx(5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void f(int i, int i2) {
        throw new ArrayIndexOutOfBoundsException("Failed writing " + ((char) i) + ((Object) " at index ") + i2);
    }

    public static /* synthetic */ void g(Object obj, String str) {
        throw new RuntimeException(str + obj);
    }

    public static /* synthetic */ void h(String str) {
        throw new IllegalStateException(str);
    }

    public static /* synthetic */ void i(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalStateException(str + obj + obj2 + obj3 + obj4);
    }

    public static /* synthetic */ void j(String str, Throwable th) {
        throw new RuntimeException(str, th);
    }

    public static /* synthetic */ void k(String str, Object[] objArr) {
        throw new ArrayIndexOutOfBoundsException(String.format(str, objArr));
    }

    public static /* synthetic */ void m(Object obj, String str) {
        throw new IllegalArgumentException((str + obj).toString());
    }

    public static /* synthetic */ void n(String str) {
        throw new NoSuchElementException(str);
    }

    public static /* synthetic */ void o(Object obj, String str) {
        throw new FileNotFoundException(str + obj);
    }

    public static /* synthetic */ void p(String str) {
        throw new IOException(str);
    }

    public static /* synthetic */ void q(String str) {
        throw new NullPointerException(str);
    }

    @Override // defpackage.qu2
    public void a(Exception exc) {
    }

    @Override // androidx.arch.core.util.Function
    public Object apply(Object obj) {
        List WORK_INFO_MAPPER$lambda$1;
        WORK_INFO_MAPPER$lambda$1 = WorkSpec.WORK_INFO_MAPPER$lambda$1((List) obj);
        return WORK_INFO_MAPPER$lambda$1;
    }

    @Override // defpackage.gy
    public Object b(gn0 gn0Var) {
        nu2 lambda$getComponents$0;
        nu2 lambda$getComponents$1;
        nu2 lambda$getComponents$2;
        switch (this.a) {
            case 2:
                lambda$getComponents$0 = TransportRegistrar.lambda$getComponents$0(gn0Var);
                return lambda$getComponents$0;
            case 3:
                lambda$getComponents$1 = TransportRegistrar.lambda$getComponents$1(gn0Var);
                return lambda$getComponents$1;
            default:
                lambda$getComponents$2 = TransportRegistrar.lambda$getComponents$2(gn0Var);
                return lambda$getComponents$2;
        }
    }

    @Override // androidx.compose.foundation.layout.WindowInsetsHeightCalculator
    public int calculate(WindowInsets windowInsets, Density density) {
        int top;
        int bottom;
        switch (this.a) {
            case 19:
                top = windowInsets.getTop(density);
                return top;
            default:
                bottom = windowInsets.getBottom(density);
                return bottom;
        }
    }

    @Override // androidx.compose.foundation.layout.WindowInsetsWidthCalculator
    public int calculate(WindowInsets windowInsets, LayoutDirection layoutDirection, Density density) {
        int startCalc$lambda$0;
        int endCalc$lambda$0;
        switch (this.a) {
            case 17:
                startCalc$lambda$0 = WindowInsetsSizeKt.startCalc$lambda$0(windowInsets, layoutDirection, density);
                return startCalc$lambda$0;
            default:
                endCalc$lambda$0 = WindowInsetsSizeKt.endCalc$lambda$0(windowInsets, layoutDirection, density);
                return endCalc$lambda$0;
        }
    }

    @Override // androidx.compose.ui.text.input.VisualTransformation
    public TransformedText filter(AnnotatedString annotatedString) {
        TransformedText None$lambda$0;
        None$lambda$0 = VisualTransformation.Companion.None$lambda$0(annotatedString);
        return None$lambda$0;
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        insets.getClass();
        view.getClass();
        view.setPadding(insets.left, insets.top, insets.right, insets.bottom);
        return windowInsetsCompat;
    }
}
