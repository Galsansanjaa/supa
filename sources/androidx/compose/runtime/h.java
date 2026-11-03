package androidx.compose.runtime;

import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(NestedContentMap.a((MovableContentStateReference) obj2, (NestedMovableContent) obj));
            default:
                return SingleSubscriptionSnapshotFlowManager.b((SingleSubscriptionSnapshotFlowManager) obj2, obj);
        }
    }
}
