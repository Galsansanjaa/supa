package androidx.graphics.shapes;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class MutableCubic extends Cubic {
    public MutableCubic() {
        super(null, 1, null);
    }

    private final void transformOnePoint(PointTransformer pointTransformer, int i) {
        int i2 = i + 1;
        long mo8344transformXgqJiTY = pointTransformer.mo8344transformXgqJiTY(getPoints$graphics_shapes_release()[i], getPoints$graphics_shapes_release()[i2]);
        getPoints$graphics_shapes_release()[i] = Float.intBitsToFloat((int) (mo8344transformXgqJiTY >> 32));
        getPoints$graphics_shapes_release()[i2] = Float.intBitsToFloat((int) (4294967295L & mo8344transformXgqJiTY));
    }

    public final void interpolate(Cubic cubic, Cubic cubic2, float f) {
        cubic.getClass();
        cubic2.getClass();
        for (int i = 0; i < 8; i++) {
            getPoints$graphics_shapes_release()[i] = Utils.interpolate(cubic.getPoints$graphics_shapes_release()[i], cubic2.getPoints$graphics_shapes_release()[i], f);
        }
    }

    public final void transform(PointTransformer pointTransformer) {
        pointTransformer.getClass();
        transformOnePoint(pointTransformer, 0);
        transformOnePoint(pointTransformer, 2);
        transformOnePoint(pointTransformer, 4);
        transformOnePoint(pointTransformer, 6);
    }
}
