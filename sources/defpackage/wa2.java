package defpackage;

import androidx.compose.animation.core.AnimationKt;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.TransformScope;
import androidx.compose.foundation.gestures.TransformableState;
import androidx.compose.foundation.text.input.internal.IntIntervalTree;
import androidx.compose.foundation.text.input.internal.Node;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.text.TextStyle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.savedstate.SavedStateReaderKt;
import androidx.sqlite.SQLiteStatement;
import androidx.work.ListenableWorker;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkRequest;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class wa2 {
    public static /* synthetic */ void A(TextToolbar textToolbar, Rect rect, os0 os0Var, os0 os0Var2, os0 os0Var3, os0 os0Var4, os0 os0Var5, int i, Object obj) {
        if (obj != null) {
            f31.f("Super calls with default arguments not supported in this target, function: showMenu");
            return;
        }
        if ((i & 2) != 0) {
            os0Var = null;
        }
        if ((i & 4) != 0) {
            os0Var2 = null;
        }
        if ((i & 8) != 0) {
            os0Var3 = null;
        }
        if ((i & 16) != 0) {
            os0Var4 = null;
        }
        if ((i & 32) != 0) {
            os0Var5 = null;
        }
        textToolbar.showMenu(rect, os0Var, os0Var2, os0Var3, os0Var4, os0Var5);
    }

    public static /* synthetic */ String B(int i) {
        switch (i) {
            case 1:
                return "NORMAL";
            case 2:
                return "SHELL";
            case 3:
                return "SYSTEM_SERVER";
            case 4:
                return "SYSTEM_APP";
            case 5:
                return "PLATFORM_APP";
            case 6:
                return "UNTRUSTED_APP";
            case 7:
                return "RECOVERY";
            default:
                return "null";
        }
    }

    public static /* synthetic */ Object C(TransformableState transformableState, MutatePriority mutatePriority, ts0 ts0Var, a10 a10Var, int i, Object obj) {
        if (obj != null) {
            f31.f("Super calls with default arguments not supported in this target, function: transform");
            return null;
        }
        if ((i & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return transformableState.transform(mutatePriority, ts0Var, a10Var);
    }

    public static /* synthetic */ void D(TransformScope transformScope, long j, float f, long j2, float f2, int i, Object obj) {
        if (obj != null) {
            f31.f("Super calls with default arguments not supported in this target, function: transformByWithCentroid-IEwrmTk");
            return;
        }
        if ((i & 1) != 0) {
            j = Offset.Companion.m5105getUnspecifiedF1C5BW0();
        }
        long j3 = j;
        if ((i & 2) != 0) {
            f = 1.0f;
        }
        float f3 = f;
        if ((i & 4) != 0) {
            j2 = Offset.Companion.m5106getZeroF1C5BW0();
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            f2 = 0.0f;
        }
        transformScope.mo517transformByWithCentroidIEwrmTk(j3, f3, j4, f2);
    }

    public static ViewModel a(ViewModelProvider.Factory factory, ca1 ca1Var, CreationExtras creationExtras) {
        ca1Var.getClass();
        creationExtras.getClass();
        return factory.create(ej1.u(ca1Var), creationExtras);
    }

    public static ViewModel b(ViewModelProvider.Factory factory, Class cls, CreationExtras creationExtras) {
        cls.getClass();
        creationExtras.getClass();
        return factory.create(cls);
    }

    public static boolean c(SQLiteStatement sQLiteStatement, int i) {
        return sQLiteStatement.getLong(i) != 0;
    }

    public static ArrayList d(SQLiteStatement sQLiteStatement) {
        int columnCount = sQLiteStatement.getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i = 0; i < columnCount; i++) {
            arrayList.add(sQLiteStatement.getColumnName(i));
        }
        return arrayList;
    }

    public static long e(VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec) {
        return (vectorizedDurationBasedAnimationSpec.getDurationMillis() + vectorizedDurationBasedAnimationSpec.getDelayMillis()) * AnimationKt.MillisToNanos;
    }

    public static boolean f(Transition.Segment segment, Object obj, Object obj2) {
        return jh2.k(obj, segment.getInitialState()) && jh2.k(obj2, segment.getTargetState());
    }

    public static Number g(int i, q91 q91Var) {
        if (i == 1) {
            return Double.valueOf(q91Var.y());
        }
        if (i == 2) {
            return new mb1(q91Var.F());
        }
        if (i == 3) {
            String F = q91Var.F();
            if (F.indexOf(46) >= 0) {
                return h(F, q91Var);
            }
            try {
                return Long.valueOf(Long.parseLong(F));
            } catch (NumberFormatException unused) {
                return h(F, q91Var);
            }
        }
        String F2 = q91Var.F();
        try {
            return dn3.M(F2);
        } catch (NumberFormatException e) {
            StringBuilder w = sg3.w("Cannot parse ", F2, "; at path ");
            w.append(q91Var.n(true));
            throw new rx(3, w.toString(), e);
        }
    }

    public static Double h(String str, q91 q91Var) {
        try {
            Double valueOf = Double.valueOf(str);
            if (!valueOf.isInfinite()) {
                if (valueOf.isNaN()) {
                }
                return valueOf;
            }
            if (q91Var.y != 1) {
                throw new IOException("JSON forbids NaN and infinities: " + valueOf + "; at path " + q91Var.n(true));
            }
            return valueOf;
        } catch (NumberFormatException e) {
            StringBuilder w = sg3.w("Cannot parse ", str, "; at path ");
            w.append(q91Var.n(true));
            throw new rx(3, w.toString(), e);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int i(String str) {
        char c;
        str.getClass();
        switch (str.hashCode()) {
            case -1310311125:
                if (str.equals("easing")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1249320806:
                if (str.equals("rotationX")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1249320804:
                if (str.equals("rotationZ")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -987906986:
                if (str.equals("pivotX")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -987906985:
                if (str.equals("pivotY")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -880905839:
                if (str.equals(TypedValues.AttributesType.S_TARGET)) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 97692013:
                if (str.equals(TypedValues.AttributesType.S_FRAME)) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 579057826:
                if (str.equals("curveFit")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 803192288:
                if (str.equals("pathRotate")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 1167159411:
                if (str.equals(TypedValues.AttributesType.S_PIVOT_TARGET)) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 1941332754:
                if (str.equals("visibility")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return TypedValues.AttributesType.TYPE_EASING;
            case 1:
                return 308;
            case 2:
                return 309;
            case 3:
                return 310;
            case 4:
                return 304;
            case 5:
                return 305;
            case 6:
                return 306;
            case 7:
                return 315;
            case '\b':
                return 313;
            case '\t':
                return 314;
            case '\n':
                return 311;
            case 11:
                return 312;
            case '\f':
                return TypedValues.TYPE_TARGET;
            case '\r':
                return 307;
            case 14:
                return 303;
            case 15:
                return 100;
            case 16:
                return 301;
            case 17:
                return TypedValues.AttributesType.TYPE_PATH_ROTATE;
            case 18:
                return TypedValues.AttributesType.TYPE_PIVOT_TARGET;
            case 19:
                return 302;
            default:
                return -1;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int j(String str) {
        char c;
        str.getClass();
        switch (str.hashCode()) {
            case -1310311125:
                if (str.equals("easing")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1249320806:
                if (str.equals("rotationX")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1249320804:
                if (str.equals("rotationZ")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -987906986:
                if (str.equals("pivotX")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -987906985:
                if (str.equals("pivotY")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 579057826:
                if (str.equals("curveFit")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 803192288:
                if (str.equals("pathRotate")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 1941332754:
                if (str.equals("visibility")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return TypedValues.CycleType.TYPE_EASING;
            case 1:
                return 308;
            case 2:
                return 309;
            case 3:
                return 310;
            case 4:
                return 304;
            case 5:
                return 305;
            case 6:
                return 306;
            case 7:
                return 315;
            case '\b':
                return 313;
            case '\t':
                return 314;
            case '\n':
                return 311;
            case 11:
                return 312;
            case '\f':
                return TypedValues.CycleType.TYPE_ALPHA;
            case '\r':
                return TypedValues.CycleType.TYPE_CURVE_FIT;
            case 14:
                return TypedValues.CycleType.TYPE_PATH_ROTATE;
            case 15:
                return TypedValues.CycleType.TYPE_VISIBILITY;
            default:
                return -1;
        }
    }

    public static double k(double d, double d2, double d3) {
        return (Math.sin(d) * d2) + d3;
    }

    public static float l(float f, float f2, float f3, float f4) {
        return ((f * f2) + f3) * f4;
    }

    public static int m(TextStyle textStyle, int i, int i2) {
        return (textStyle.hashCode() + i) * i2;
    }

    public static rx n(String str) {
        SavedStateReaderKt.keyOrValueNotFoundError(str);
        return new rx(4);
    }

    public static vi0 o(ui0 ui0Var, String str, vi0 vi0Var, int i, Integer num) {
        ui0Var.b(str, vi0Var);
        return new vi0(i, num);
    }

    public static WorkRequest.Builder p(Class cls, String str) {
        return new OneTimeWorkRequest.Builder((Class<? extends ListenableWorker>) cls).addTag(str);
    }

    public static String q(String str, String str2) {
        return str + str2;
    }

    public static String r(String str, String str2, char c) {
        return str + str2 + c;
    }

    public static String s(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String t(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static String u(StringBuilder sb, String str, int i) {
        sb.append(str);
        sb.append(i);
        return sb.toString();
    }

    public static String v(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static StringBuilder w(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static boolean x(IntIntervalTree intIntervalTree, int i, int i2) {
        return Node.m1903equalsimpl0(i2, intIntervalTree.m1844getLeftbLpG9ms(intIntervalTree.m1848getParentbLpG9ms(i)));
    }

    public static String y(String str, String str2) {
        return str + str2;
    }

    public static /* synthetic */ Object z(ScrollableState scrollableState, MutatePriority mutatePriority, ts0 ts0Var, a10 a10Var, int i, Object obj) {
        if (obj != null) {
            f31.f("Super calls with default arguments not supported in this target, function: scroll");
            return null;
        }
        if ((i & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return scrollableState.scroll(mutatePriority, ts0Var, a10Var);
    }
}
