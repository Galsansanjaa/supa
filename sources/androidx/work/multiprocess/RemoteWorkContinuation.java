package androidx.work.multiprocess;

import androidx.work.OneTimeWorkRequest;
import defpackage.se1;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class RemoteWorkContinuation {
    public static RemoteWorkContinuation combine(List<RemoteWorkContinuation> list) {
        return list.get(0).combineInternal(list);
    }

    public abstract RemoteWorkContinuation combineInternal(List<RemoteWorkContinuation> list);

    public abstract se1 enqueue();

    public final RemoteWorkContinuation then(OneTimeWorkRequest oneTimeWorkRequest) {
        return then(Collections.singletonList(oneTimeWorkRequest));
    }

    public abstract RemoteWorkContinuation then(List<OneTimeWorkRequest> list);
}
