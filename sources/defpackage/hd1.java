package defpackage;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import java.util.Map;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hd1 implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LifecycleRegistry b;
    public final /* synthetic */ LifecycleOwner m;

    public /* synthetic */ hd1(LifecycleRegistry lifecycleRegistry, LifecycleOwner lifecycleOwner, int i) {
        this.a = i;
        this.b = lifecycleRegistry;
        this.m = lifecycleOwner;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        int i = this.a;
        LifecycleOwner lifecycleOwner = this.m;
        LifecycleRegistry lifecycleRegistry = this.b;
        Map.Entry entry = (Map.Entry) obj;
        switch (i) {
            case 0:
                return LifecycleRegistry.b(lifecycleRegistry, lifecycleOwner, entry);
            default:
                return LifecycleRegistry.c(lifecycleRegistry, lifecycleOwner, entry);
        }
    }
}
