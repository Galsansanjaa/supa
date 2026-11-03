package androidx.lifecycle;

import androidx.arch.core.util.Function;
import defpackage.cu2;
import defpackage.vy2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class Transformations$switchMap$2 implements Observer {
    final /* synthetic */ MediatorLiveData $result;
    final /* synthetic */ Function $switchMapFunction;
    private LiveData liveData;

    public Transformations$switchMap$2(Function function, MediatorLiveData mediatorLiveData) {
        this.$switchMapFunction = function;
        this.$result = mediatorLiveData;
    }

    public static final vy2 onChanged$lambda$0(MediatorLiveData mediatorLiveData, Object obj) {
        mediatorLiveData.setValue(obj);
        return vy2.a;
    }

    public final LiveData getLiveData() {
        return this.liveData;
    }

    @Override // androidx.lifecycle.Observer
    public void onChanged(Object obj) {
        LiveData liveData = (LiveData) this.$switchMapFunction.apply(obj);
        LiveData liveData2 = this.liveData;
        if (liveData2 == liveData) {
            return;
        }
        if (liveData2 != null) {
            this.$result.removeSource(liveData2);
        }
        this.liveData = liveData;
        if (liveData != null) {
            MediatorLiveData mediatorLiveData = this.$result;
            mediatorLiveData.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new cu2(mediatorLiveData, 1)));
        }
    }

    public final void setLiveData(LiveData liveData) {
        this.liveData = liveData;
    }
}
