package defpackage;

import android.app.Notification;
import android.os.IInterface;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public interface k01 extends IInterface {
    public static final String e = "android$support$v4$app$INotificationSideChannel".replace('$', '.');

    void cancel(String str, int i, String str2);

    void cancelAll(String str);

    void notify(String str, int i, String str2, Notification notification);
}
