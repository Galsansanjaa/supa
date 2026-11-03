package defpackage;

import android.content.ContentProviderClient;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.compose.foundation.layout.CombinedFlexConfig;
import androidx.compose.foundation.layout.FlexConfig;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawTransform;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.ValueElementSequence;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import androidx.core.content.ContextCompat;
import androidx.sqlite.SQLite;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class lt {
    public static String A(StringBuilder sb, String str, int i) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    public static String B(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb.toString();
    }

    public static StringBuilder C(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, CharSequence charSequence5) {
        charSequence.getClass();
        charSequence2.getClass();
        charSequence3.getClass();
        charSequence4.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence5);
        return sb;
    }

    public static StringBuilder D(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    public static ArrayList E(Object obj) {
        ta3.H(obj);
        return new ArrayList();
    }

    public static void F(int i, String str, String str2) {
        Log.w(str2, str + i);
    }

    public static void G(long j, String str, StringBuilder sb) {
        sb.append((Object) Color.m5340toStringimpl(j));
        sb.append(str);
    }

    public static void H(View view, int i, ImageView imageView) {
        imageView.setImageDrawable(ContextCompat.getDrawable(view.getContext(), i));
    }

    public static void I(ComposeUiNode.Companion companion, Composer composer, MeasurePolicy measurePolicy, Composer composer2, CompositionLocalMap compositionLocalMap) {
        Updater.m4509setimpl(composer, measurePolicy, companion.getSetMeasurePolicy());
        Updater.m4509setimpl(composer2, compositionLocalMap, companion.getSetResolvedCompositionLocals());
    }

    public static /* synthetic */ void J(AutoCloseable autoCloseable) {
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (autoCloseable instanceof ExecutorService) {
            rc0.i((ExecutorService) autoCloseable);
            return;
        }
        if (autoCloseable instanceof TypedArray) {
            ((TypedArray) autoCloseable).recycle();
            return;
        }
        if (autoCloseable instanceof MediaMetadataRetriever) {
            ((MediaMetadataRetriever) autoCloseable).release();
            return;
        }
        if (autoCloseable instanceof MediaDrm) {
            ((MediaDrm) autoCloseable).release();
            return;
        }
        if (autoCloseable instanceof DrmManagerClient) {
            ((DrmManagerClient) autoCloseable).release();
        } else if (autoCloseable instanceof ContentProviderClient) {
            ((ContentProviderClient) autoCloseable).release();
        } else {
            z72.k();
        }
    }

    public static void K(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        charSequence.getClass();
        charSequence2.getClass();
        charSequence3.getClass();
    }

    public static void L(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    public static float M(float f, float f2, float f3, float f4) {
        return ((f - f2) * f3) + f4;
    }

    public static void N(EditText... editTextArr) {
        if (editTextArr.length == 0) {
            return;
        }
        jb0 jb0Var = new jb0(editTextArr, 0);
        for (EditText editText : editTextArr) {
            editText.setOnFocusChangeListener(jb0Var);
        }
        EditText editText2 = editTextArr[0];
        editText2.postDelayed(new bq(editText2, 1), 100L);
    }

    public static /* synthetic */ void O(DrawTransform drawTransform, float f, float f2, int i, Object obj) {
        if (obj != null) {
            f31.f("Super calls with default arguments not supported in this target, function: translate");
            return;
        }
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        drawTransform.translate(f, f2);
    }

    public static int a(Density density, long j) {
        return Math.round(density.mo472toPxR2X_6o(j));
    }

    public static int b(Density density, float f) {
        float mo473toPx0680j_4 = density.mo473toPx0680j_4(f);
        if (Float.isInfinite(mo473toPx0680j_4)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(mo473toPx0680j_4);
    }

    public static FlexConfig c(FlexConfig flexConfig, FlexConfig flexConfig2) {
        if (flexConfig2 == FlexConfig.Companion) {
            return flexConfig;
        }
        if (!(flexConfig2 instanceof CombinedFlexConfig)) {
            return new CombinedFlexConfig(flexConfig, flexConfig2);
        }
        ew0 ew0Var = new ew0(2);
        ew0Var.a(flexConfig);
        ew0Var.d(((CombinedFlexConfig) flexConfig2).getConfigs());
        ArrayList arrayList = ew0Var.a;
        return new CombinedFlexConfig((FlexConfig[]) arrayList.toArray(new FlexConfig[arrayList.size()]));
    }

    public static float d(Density density, float f) {
        return Dp.m8049constructorimpl(f / density.getDensity());
    }

    public static float e(Density density, int i) {
        return Dp.m8049constructorimpl(i / density.getDensity());
    }

    public static long f(Density density, long j) {
        return j != InlineClassHelperKt.UnspecifiedPackedFloats ? DpKt.m8071DpSizeYgX7TsA(density.mo469toDpu2uoSUM(Float.intBitsToFloat((int) (j >> 32))), density.mo469toDpu2uoSUM(Float.intBitsToFloat((int) (j & 4294967295L)))) : DpSize.Companion.m8156getUnspecifiedMYxV2XQ();
    }

    public static float g(Density density, long j) {
        if (!TextUnitType.m8267equalsimpl0(TextUnit.m8238getTypeUIouoOA(j), TextUnitType.Companion.m8272getSpUIouoOA())) {
            androidx.compose.ui.unit.InlineClassHelperKt.throwIllegalStateException("Only Sp can convert to Px");
        }
        return density.mo473toPx0680j_4(density.mo468toDpGaN1DYA(j));
    }

    public static Rect h(Density density, DpRect dpRect) {
        return new Rect(density.mo473toPx0680j_4(dpRect.m8132getLeftD9Ej5fM()), density.mo473toPx0680j_4(dpRect.m8134getTopD9Ej5fM()), density.mo473toPx0680j_4(dpRect.m8133getRightD9Ej5fM()), density.mo473toPx0680j_4(dpRect.m8131getBottomD9Ej5fM()));
    }

    public static long i(Density density, long j) {
        if (j == InlineClassHelperKt.UnspecifiedPackedFloats) {
            return Size.Companion.m5167getUnspecifiedNHjbRc();
        }
        float mo473toPx0680j_4 = density.mo473toPx0680j_4(DpSize.m8147getWidthD9Ej5fM(j));
        float mo473toPx0680j_42 = density.mo473toPx0680j_4(DpSize.m8145getHeightD9Ej5fM(j));
        return Size.m5150constructorimpl((Float.floatToRawIntBits(mo473toPx0680j_4) << 32) | (Float.floatToRawIntBits(mo473toPx0680j_42) & 4294967295L));
    }

    public static long j(Density density, float f) {
        return density.mo475toSp0xMU5do(density.mo469toDpu2uoSUM(f));
    }

    public static long k(Density density, int i) {
        return density.mo475toSp0xMU5do(density.mo470toDpu2uoSUM(i));
    }

    public static String l(String str, char c) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(c);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    public static String m(String str) {
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            char charAt = str.charAt(i);
            if (!Character.isLetter(charAt)) {
                i++;
            } else if (!Character.isUpperCase(charAt)) {
                char upperCase = Character.toUpperCase(charAt);
                if (i == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i) + upperCase + str.substring(i + 1);
            }
        }
        return str;
    }

    public static /* synthetic */ void n(DrawTransform drawTransform, float f, float f2, float f3, float f4, int i, int i2, Object obj) {
        if (obj != null) {
            f31.f("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
            return;
        }
        if ((i2 & 1) != 0) {
            f = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f3 = Float.intBitsToFloat((int) (drawTransform.mo5836getSizeNHjbRc() >> 32));
        }
        if ((i2 & 8) != 0) {
            f4 = Float.intBitsToFloat((int) (drawTransform.mo5836getSizeNHjbRc() & 4294967295L));
        }
        if ((i2 & 16) != 0) {
            i = ClipOp.Companion.m5321getIntersectrtfAjoo();
        }
        drawTransform.mo5834clipRectN_I0leg(f, f2, f3, f4, i);
    }

    public static /* synthetic */ int o(int i) {
        switch (i) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 7;
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
                return 10;
            case 9:
                return 11;
            case 10:
                return 12;
            case 11:
                return 13;
            default:
                throw null;
        }
    }

    public static /* synthetic */ int p(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    if (i == 4) {
                        return 4;
                    }
                    throw null;
                }
            }
        }
        return i2;
    }

    public static float q(float f, float f2, float f3, float f4) {
        return (f3 - (f * f2)) / f4;
    }

    public static rx r(int i, String str) {
        SQLite.throwSQLiteException(i, str);
        return new rx(4);
    }

    public static rx s(String str) {
        ComposerKt.composeRuntimeError(str);
        return new rx(4);
    }

    public static ValueElementSequence t(boolean z, ValueElementSequence valueElementSequence, String str, InspectorInfo inspectorInfo) {
        valueElementSequence.set(str, Boolean.valueOf(z));
        return inspectorInfo.getProperties();
    }

    public static ClassCastException u(Iterator it) {
        it.next().getClass();
        return new ClassCastException();
    }

    public static Object v(int i, List list) {
        return list.get(list.size() - i);
    }

    public static String w(int i, String str) {
        return str + i;
    }

    public static String x(String str, int i, String str2, int i2, String str3) {
        return str + i + str2 + i2 + str3;
    }

    public static String y(StringBuilder sb, String str) {
        return str + ((Object) sb);
    }

    public static String z(StringBuilder sb, String str, char c) {
        sb.append(str);
        sb.append(c);
        return sb.toString();
    }
}
