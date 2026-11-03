package defpackage;

import android.adservices.topics.TopicsManager;
import android.app.RemoteAction;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.database.Cursor;
import android.text.Editable;
import android.util.Base64;
import android.util.Log;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.compose.ui.text.TextInclusionStrategy;
import androidx.constraintlayout.core.state.Interpolator;
import androidx.constraintlayout.core.state.Transition;
import com.google.android.material.textfield.TextInputLayout;
import java.io.File;
import java.util.ArrayList;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z72 implements DoubleFunction, ta2, b10, TextInclusionStrategy, TextInputLayout.LengthCounter, Interpolator {
    public final /* synthetic */ int a;

    public /* synthetic */ z72(int i) {
        this.a = i;
    }

    public static /* bridge */ /* synthetic */ TopicsManager a(Object obj) {
        return (TopicsManager) obj;
    }

    public static /* bridge */ /* synthetic */ RemoteAction b(Object obj) {
        return (RemoteAction) obj;
    }

    public static /* bridge */ /* synthetic */ ShortcutInfo c(Object obj) {
        return (ShortcutInfo) obj;
    }

    public static /* bridge */ /* synthetic */ ShortcutManager d(Object obj) {
        return (ShortcutManager) obj;
    }

    public static /* bridge */ /* synthetic */ Class e() {
        return ShortcutManager.class;
    }

    public static /* synthetic */ void f() {
        throw new UnsupportedOperationException();
    }

    public static /* synthetic */ void g(int i, String str) {
        throw new IllegalStateException((str + i).toString());
    }

    public static /* synthetic */ void i(Object obj, String str, int i) {
        throw new IllegalStateException((str + i + obj).toString());
    }

    public static /* synthetic */ void j(Object obj, String str, Object obj2) {
        throw new rx(str + obj + obj2, 1);
    }

    public static /* synthetic */ void k() {
        throw new IllegalArgumentException();
    }

    public static /* synthetic */ void l(int i, String str) {
        throw new IllegalArgumentException((str + i + '.').toString());
    }

    public static /* synthetic */ void m(Object obj, String str, Object obj2) {
        throw new IllegalArgumentException((str + obj + obj2).toString());
    }

    public static /* bridge */ /* synthetic */ Class n() {
        return TopicsManager.class;
    }

    @Override // defpackage.ta2
    public Object apply(Object obj) {
        Cursor cursor = (Cursor) obj;
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            String string = cursor.getString(1);
            byte[] bArr = null;
            if (string == null) {
                hu2.q("Null backendName");
                return null;
            }
            gz1 b = hz1.b(cursor.getInt(2));
            String string2 = cursor.getString(3);
            if (string2 != null) {
                bArr = Base64.decode(string2, 0);
            }
            arrayList.add(new bk(string, bArr, b));
        }
        return arrayList;
    }

    @Override // com.google.android.material.textfield.TextInputLayout.LengthCounter
    public int countLength(Editable editable) {
        int lambda$new$0;
        lambda$new$0 = TextInputLayout.lambda$new$0(editable);
        return lambda$new$0;
    }

    @Override // androidx.constraintlayout.core.state.Interpolator
    public float getInterpolation(float f) {
        float lambda$getInterpolator$1;
        float lambda$getInterpolator$2;
        float lambda$getInterpolator$3;
        float lambda$getInterpolator$4;
        float lambda$getInterpolator$5;
        float lambda$getInterpolator$6;
        float lambda$getInterpolator$7;
        switch (this.a) {
            case 23:
                lambda$getInterpolator$1 = Transition.lambda$getInterpolator$1(f);
                return lambda$getInterpolator$1;
            case 24:
                lambda$getInterpolator$2 = Transition.lambda$getInterpolator$2(f);
                return lambda$getInterpolator$2;
            case 25:
                lambda$getInterpolator$3 = Transition.lambda$getInterpolator$3(f);
                return lambda$getInterpolator$3;
            case 26:
                lambda$getInterpolator$4 = Transition.lambda$getInterpolator$4(f);
                return lambda$getInterpolator$4;
            case 27:
                lambda$getInterpolator$5 = Transition.lambda$getInterpolator$5(f);
                return lambda$getInterpolator$5;
            case 28:
                lambda$getInterpolator$6 = Transition.lambda$getInterpolator$6(f);
                return lambda$getInterpolator$6;
            default:
                lambda$getInterpolator$7 = Transition.lambda$getInterpolator$7(f);
                return lambda$getInterpolator$7;
        }
    }

    @Override // defpackage.b10
    public Object h(zc4 zc4Var) {
        boolean z;
        if (zc4Var.j()) {
            kh khVar = (kh) zc4Var.h();
            jw0 jw0Var = jw0.A;
            jw0Var.i("Crashlytics report successfully enqueued to DataTransport: " + khVar.b);
            File file = khVar.c;
            if (file.delete()) {
                jw0Var.i("Deleted report file: " + file.getPath());
            } else {
                jw0Var.p("Crashlytics could not delete report file: " + file.getPath(), null);
            }
            z = true;
        } else {
            Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", zc4Var.g());
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public double invoke(double d) {
        double DoubleIdentity$lambda$0;
        DoubleIdentity$lambda$0 = Rgb.DoubleIdentity$lambda$0(d);
        return DoubleIdentity$lambda$0;
    }

    @Override // androidx.compose.ui.text.TextInclusionStrategy
    public boolean isIncluded(Rect rect, Rect rect2) {
        boolean overlaps;
        boolean ContainsAll$lambda$0;
        boolean ContainsCenter$lambda$0;
        switch (this.a) {
            case 16:
                overlaps = rect.overlaps(rect2);
                return overlaps;
            case 17:
                ContainsAll$lambda$0 = TextInclusionStrategy.Companion.ContainsAll$lambda$0(rect, rect2);
                return ContainsAll$lambda$0;
            default:
                ContainsCenter$lambda$0 = TextInclusionStrategy.Companion.ContainsCenter$lambda$0(rect, rect2);
                return ContainsCenter$lambda$0;
        }
    }
}
