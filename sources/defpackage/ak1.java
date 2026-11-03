package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.Person;
import android.os.ProfilingManager;
import android.text.PrecomputedText;
import android.view.textclassifier.TextClassifier;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class ak1 implements eu2, lc0 {
    public final /* synthetic */ int a;

    public /* synthetic */ ak1(int i) {
        this.a = i;
    }

    private final void a(i12 i12Var) {
    }

    public static /* bridge */ /* synthetic */ NotificationChannel b(Object obj) {
        return (NotificationChannel) obj;
    }

    public static /* bridge */ /* synthetic */ NotificationChannelGroup c(Object obj) {
        return (NotificationChannelGroup) obj;
    }

    public static /* bridge */ /* synthetic */ Person d(Object obj) {
        return (Person) obj;
    }

    public static /* bridge */ /* synthetic */ ProfilingManager g(Object obj) {
        return (ProfilingManager) obj;
    }

    public static /* bridge */ /* synthetic */ TextClassifier h(Object obj) {
        return (TextClassifier) obj;
    }

    public static /* synthetic */ void i() {
        throw new IllegalStateException();
    }

    public static /* synthetic */ void j(int i, int i2, Object obj) {
        throw new IllegalStateException("Separators size: " + i + obj + i2 + ((Object) " + 1"));
    }

    public static /* synthetic */ void k(int i, String str) {
        throw new IllegalStateException(str + i);
    }

    public static /* synthetic */ void l(int i, StringBuilder sb) {
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public static /* synthetic */ void m(Object obj, Object obj2, Object obj3, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(obj3);
        throw new IllegalStateException(sb.toString(), th);
    }

    public static /* synthetic */ void n(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void o(Object obj, String str, Object obj2) {
        throw new IllegalArgumentException(str + obj + obj2);
    }

    public static /* synthetic */ void p(String str, float f) {
        throw new IllegalArgumentException(str + f);
    }

    public static /* synthetic */ void q(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void r(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalStateException((str + obj + obj2 + obj3 + obj4).toString());
    }

    public static /* synthetic */ void s(String str, Throwable th) {
        throw new RuntimeException(str, th);
    }

    public static /* bridge */ /* synthetic */ boolean t(Object obj) {
        return obj instanceof PrecomputedText;
    }

    public static /* bridge */ /* synthetic */ Class u() {
        return Notification.DecoratedCustomViewStyle.class;
    }

    public static /* synthetic */ void v(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3).toString());
    }

    public static /* bridge */ /* synthetic */ Class w() {
        return ProfilingManager.class;
    }

    @Override // defpackage.eu2
    public Object apply(Object obj) {
        fk1 fk1Var = (fk1) obj;
        dq1 dq1Var = x02.a;
        dq1Var.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            dq1Var.e(fk1Var, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // defpackage.lc0
    public void f(i12 i12Var) {
        switch (this.a) {
            case 14:
                return;
            default:
                i12Var.get().getClass();
                throw new ClassCastException();
        }
    }
}
