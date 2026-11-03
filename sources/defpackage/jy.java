package defpackage;

import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class jy implements i12 {
    public final /* synthetic */ int a;

    public /* synthetic */ jy(int i) {
        this.a = i;
    }

    @Override // defpackage.i12
    public final Object get() {
        switch (this.a) {
            case 0:
                return Collections.EMPTY_SET;
            case 1:
                return ExecutorsRegistrar.a();
            case 2:
                ob1 ob1Var = ExecutorsRegistrar.a;
                return new xc0(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new u90("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 3:
                ob1 ob1Var2 = ExecutorsRegistrar.a;
                return new xc0(Executors.newCachedThreadPool(new u90("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 4:
                ob1 ob1Var3 = ExecutorsRegistrar.a;
                return Executors.newSingleThreadScheduledExecutor(new u90("Firebase Scheduler", 0, null));
            case 5:
            default:
                return null;
        }
    }
}
