package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import android.widget.ImageView;
import androidx.compose.animation.core.Animation;
import androidx.compose.foundation.text.selection.BaseTextPreparedSelection;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.util.ListUtilsKt;
import androidx.core.content.ContextCompat;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class sg3 {
    public static final /* synthetic */ int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93};

    public static void A(ts0 ts0Var, int i, Composer composer, int i2) {
        composer.updateRememberedValue(Integer.valueOf(i));
        composer.apply(Integer.valueOf(i2), ts0Var);
    }

    public static void B(Window window, int i) {
        window.setBackgroundDrawable(new ColorDrawable(i));
    }

    public static boolean C(ts0 ts0Var, Composer composer, int i) {
        ts0Var.invoke(composer, Integer.valueOf(i));
        composer.endNode();
        return ComposerKt.isTraceInProgress();
    }

    public static rx D(String str) {
        ListUtilsKt.throwNoSuchElementException(str);
        return new rx(4);
    }

    public static /* synthetic */ int E(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    public static /* synthetic */ int[] F(int i) {
        int[] iArr = new int[i];
        System.arraycopy(a, 0, iArr, 0, i);
        return iArr;
    }

    public static boolean a(Animation animation, long j) {
        return j >= animation.getDurationNanos();
    }

    public static void b(Applier applier) {
        Object current = applier.getCurrent();
        ComposeNodeLifecycleCallback composeNodeLifecycleCallback = current instanceof ComposeNodeLifecycleCallback ? (ComposeNodeLifecycleCallback) current : null;
        if (composeNodeLifecycleCallback != null) {
            composeNodeLifecycleCallback.onReuse();
        }
    }

    public static /* synthetic */ Object c(AwaitPointerEventScope awaitPointerEventScope, PointerEventPass pointerEventPass, a10 a10Var, int i, Object obj) {
        if (obj != null) {
            f31.f("Super calls with default arguments not supported in this target, function: awaitPointerEvent");
            return null;
        }
        if ((i & 1) != 0) {
            pointerEventPass = PointerEventPass.Main;
        }
        return awaitPointerEventScope.awaitPointerEvent(pointerEventPass, a10Var);
    }

    public static /* synthetic */ void d(Canvas canvas, Path path, int i, int i2, Object obj) {
        if (obj != null) {
            f31.f("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
            return;
        }
        if ((i2 & 2) != 0) {
            i = ClipOp.Companion.m5321getIntersectrtfAjoo();
        }
        canvas.mo5184clipPathmtrdDE(path, i);
    }

    public static /* synthetic */ void e(Canvas canvas, float f, float f2, float f3, float f4, int i, int i2, Object obj) {
        if (obj != null) {
            f31.f("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
            return;
        }
        if ((i2 & 16) != 0) {
            i = ClipOp.Companion.m5321getIntersectrtfAjoo();
        }
        canvas.mo5185clipRectN_I0leg(f, f2, f3, f4, i);
    }

    public static /* synthetic */ void f(Canvas canvas, Rect rect, int i, int i2, Object obj) {
        if (obj != null) {
            f31.f("Super calls with default arguments not supported in this target, function: clipRect-mtrdD-E");
            return;
        }
        if ((i2 & 2) != 0) {
            i = ClipOp.Companion.m5321getIntersectrtfAjoo();
        }
        canvas.mo5186clipRectmtrdDE(rect, i);
    }

    public static /* synthetic */ boolean i(int i, int i2) {
        if (i != 0) {
            return i == i2;
        }
        throw null;
    }

    public static int j(BaseTextPreparedSelection baseTextPreparedSelection) {
        baseTextPreparedSelection.getState().resetCachedX();
        return baseTextPreparedSelection.getText$foundation().length();
    }

    public static int k(LayoutNode layoutNode) {
        return layoutNode.getNodes$ui().getHead$ui().getAggregateChildKindSet$ui();
    }

    public static rx l(String str) {
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck(str);
        return new rx(4);
    }

    public static ts0 m(ComposeUiNode.Companion companion, Composer composer, MeasurePolicy measurePolicy, Composer composer2, CompositionLocalMap compositionLocalMap) {
        Updater.m4509setimpl(composer, measurePolicy, companion.getSetMeasurePolicy());
        Updater.m4509setimpl(composer2, compositionLocalMap, companion.getSetResolvedCompositionLocals());
        return companion.getSetCompositeKeyHash();
    }

    public static ts0 n(ComposeUiNode.Companion companion, Composer composer, Integer num, Composer composer2) {
        Updater.m4509setimpl(composer, num, companion.getSetCompositeKeyHash());
        Updater.m4507reconcileimpl(composer2, companion.getApplyOnDeactivatedNodeAssertion());
        return companion.getSetModifier();
    }

    public static String o(int i, String str, String str2) {
        return str + i + str2;
    }

    public static String p(String str, float f, String str2) {
        return str + f + str2;
    }

    public static String q(String str, float f, String str2, float f2, String str3) {
        return str + f + str2 + f2 + str3;
    }

    public static String r(StringBuilder sb, int i, char c) {
        sb.append(i);
        sb.append(c);
        return sb.toString();
    }

    public static String s(StringBuilder sb, String str, float f) {
        sb.append(f);
        sb.append(str);
        return sb.toString();
    }

    public static String t(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    public static String u(StringBuilder sb, boolean z, String str) {
        sb.append(z);
        sb.append(str);
        return sb.toString();
    }

    public static StringBuilder v(String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder w(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static HashMap x(Class cls, he heVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, heVar);
        return hashMap;
    }

    public static Map y(HashMap hashMap) {
        return DesugarCollections.unmodifiableMap(new HashMap(hashMap));
    }

    public static void z(va vaVar, int i, ImageView imageView) {
        imageView.setImageDrawable(ContextCompat.getDrawable(vaVar.requireContext(), i));
    }
}
