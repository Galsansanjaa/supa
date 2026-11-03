package defpackage;

import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.Transformations$switchMap$2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cu2 implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediatorLiveData b;

    public /* synthetic */ cu2(MediatorLiveData mediatorLiveData, int i) {
        this.a = i;
        this.b = mediatorLiveData;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        int i = this.a;
        MediatorLiveData mediatorLiveData = this.b;
        switch (i) {
            case 0:
                return Transformations.e(mediatorLiveData, obj);
            default:
                return Transformations$switchMap$2.a(mediatorLiveData, obj);
        }
    }
}
