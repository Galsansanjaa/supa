package androidx.window.layout;

import androidx.core.util.Consumer;
import defpackage.os0;
import defpackage.vy2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements os0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ WindowInfoTrackerImpl b;
    public final /* synthetic */ Consumer m;

    public /* synthetic */ b(WindowInfoTrackerImpl windowInfoTrackerImpl, Consumer consumer, int i) {
        this.a = i;
        this.b = windowInfoTrackerImpl;
        this.m = consumer;
    }

    @Override // defpackage.os0
    public final Object invoke() {
        vy2 invokeSuspend$lambda$1;
        vy2 invokeSuspend$lambda$12;
        int i = this.a;
        Consumer consumer = this.m;
        WindowInfoTrackerImpl windowInfoTrackerImpl = this.b;
        a aVar = (a) consumer;
        switch (i) {
            case 0:
                invokeSuspend$lambda$1 = WindowInfoTrackerImpl$windowLayoutInfo$1.invokeSuspend$lambda$1(windowInfoTrackerImpl, aVar);
                return invokeSuspend$lambda$1;
            default:
                invokeSuspend$lambda$12 = WindowInfoTrackerImpl$windowLayoutInfo$2.invokeSuspend$lambda$1(windowInfoTrackerImpl, aVar);
                return invokeSuspend$lambda$12;
        }
    }
}
