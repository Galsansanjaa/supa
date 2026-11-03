package defpackage;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowMetrics;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.uptodown.core.activities.FileExplorerActivity;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class lh0 implements eu2, gy, b10, OnApplyWindowInsetsListener {
    public final /* synthetic */ int a;

    public /* synthetic */ lh0(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void d(int i, String str) {
        throw new IllegalArgumentException(str + ((char) i));
    }

    public static /* synthetic */ void f(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    public static /* bridge */ /* synthetic */ Class j() {
        return WindowMetrics.class;
    }

    @Override // defpackage.eu2
    public Object apply(Object obj) {
        String h = tg2.b.h((sg2) obj);
        h.getClass();
        Log.d("FirebaseSessions", "Session Event Type: SESSION_START");
        byte[] bytes = h.getBytes(ru.a);
        bytes.getClass();
        return bytes;
    }

    @Override // defpackage.gy
    public Object b(gn0 gn0Var) {
        switch (this.a) {
            case 16:
                return (ScheduledExecutorService) ExecutorsRegistrar.a.get();
            case 17:
                return (ScheduledExecutorService) ExecutorsRegistrar.c.get();
            case 18:
                return (ScheduledExecutorService) ExecutorsRegistrar.b.get();
            default:
                ob1 ob1Var = ExecutorsRegistrar.a;
                return py2.a;
        }
    }

    @Override // defpackage.b10
    public Object h(zc4 zc4Var) {
        int i;
        switch (this.a) {
            case 20:
                i = TypedValues.CycleType.TYPE_ALPHA;
                break;
            default:
                i = -1;
                break;
        }
        return Integer.valueOf(i);
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        int i = FileExplorerActivity.p0;
        view.getClass();
        windowInsetsCompat.getClass();
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        insets.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            hu2.q("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.leftMargin = insets.left;
        marginLayoutParams.bottomMargin = insets.bottom;
        marginLayoutParams.rightMargin = insets.right;
        marginLayoutParams.topMargin = insets.top;
        view.setLayoutParams(marginLayoutParams);
        return WindowInsetsCompat.CONSUMED;
    }
}
