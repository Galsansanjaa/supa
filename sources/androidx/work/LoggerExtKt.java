package androidx.work;

import defpackage.os0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class LoggerExtKt {
    public static final void logd(String str, Throwable th, os0 os0Var) {
        str.getClass();
        th.getClass();
        os0Var.getClass();
        Logger.get().debug(str, (String) os0Var.invoke(), th);
    }

    public static final void logd(String str, os0 os0Var) {
        str.getClass();
        os0Var.getClass();
        Logger.get().debug(str, (String) os0Var.invoke());
    }

    public static final void loge(String str, Throwable th, os0 os0Var) {
        str.getClass();
        th.getClass();
        os0Var.getClass();
        Logger.get().error(str, (String) os0Var.invoke(), th);
    }

    public static final void loge(String str, os0 os0Var) {
        str.getClass();
        os0Var.getClass();
        Logger.get().error(str, (String) os0Var.invoke());
    }

    public static final void logi(String str, Throwable th, os0 os0Var) {
        str.getClass();
        th.getClass();
        os0Var.getClass();
        Logger.get().info(str, (String) os0Var.invoke(), th);
    }

    public static final void logi(String str, os0 os0Var) {
        str.getClass();
        os0Var.getClass();
        Logger.get().info(str, (String) os0Var.invoke());
    }
}
