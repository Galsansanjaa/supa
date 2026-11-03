package com.google.android.material.shape;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public interface ShapeAppearance {
    ShapeAppearanceModel getDefaultShape();

    ShapeAppearanceModel[] getShapeAppearanceModels();

    ShapeAppearanceModel getShapeForState(int[] iArr);

    boolean isStateful();

    ShapeAppearanceModel withCornerSize(float f);

    ShapeAppearanceModel withCornerSize(CornerSize cornerSize);
}
