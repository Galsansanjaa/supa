package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.ui.input.pointer.PointerInputChange;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements ps0 {
    public final /* synthetic */ int a;

    public /* synthetic */ d(int i) {
        this.a = i;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        AnimationVector4D _get_convertToVector_$lambda$0;
        AnimationData _get_convertFromVector_$lambda$0;
        switch (this.a) {
            case 0:
                _get_convertToVector_$lambda$0 = AnimationDataConverter._get_convertToVector_$lambda$0((AnimationData) obj);
                return _get_convertToVector_$lambda$0;
            case 1:
                _get_convertFromVector_$lambda$0 = AnimationDataConverter._get_convertFromVector_$lambda$0((AnimationVector4D) obj);
                return _get_convertFromVector_$lambda$0;
            case 2:
                return NonTouchScrollingLogicKt$busyReceive$2$job$1.d(((Long) obj).longValue());
            case 3:
                return Boolean.valueOf(TransformableKt$detectNonTouchGestures$2.e((PointerInputChange) obj));
            case 4:
                return Boolean.valueOf(TransformableKt$detectNonTouchGestures$2.d((PointerInputChange) obj));
            default:
                return Boolean.valueOf(TransformableKt$detectNonTouchGestures$2.f((PointerInputChange) obj));
        }
    }
}
