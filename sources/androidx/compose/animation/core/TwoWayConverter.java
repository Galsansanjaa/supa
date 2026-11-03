package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public interface TwoWayConverter<T, V extends AnimationVector> {
    ps0 getConvertFromVector();

    ps0 getConvertToVector();
}
