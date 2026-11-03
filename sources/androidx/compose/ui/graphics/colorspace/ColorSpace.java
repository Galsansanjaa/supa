package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.ColorKt;
import defpackage.jh2;
import defpackage.sb0;
import defpackage.v5;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public abstract class ColorSpace {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public static final int MaxId = 63;
    public static final int MinId = -1;
    private final int id;
    private final long model;
    private final String name;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }
    }

    private ColorSpace(String str, long j) {
        this(str, j, -1, null);
    }

    private ColorSpace(String str, long j, int i) {
        this.name = str;
        this.model = j;
        this.id = i;
        if (str.length() == 0) {
            v5.m("The name of a color space cannot be null and must contain at least 1 character");
            throw null;
        }
        if (i < -1 || i > 63) {
            v5.m("The id must be between -1 and 63");
            throw null;
        }
    }

    public /* synthetic */ ColorSpace(String str, long j, int i, sb0 sb0Var) {
        this(str, j, i);
    }

    public /* synthetic */ ColorSpace(String str, long j, sb0 sb0Var) {
        this(str, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ColorSpace colorSpace = (ColorSpace) obj;
        if (this.id == colorSpace.id && jh2.k(this.name, colorSpace.name)) {
            return ColorModel.m5763equalsimpl0(this.model, colorSpace.model);
        }
        return false;
    }

    public final float[] fromXyz(float f, float f2, float f3) {
        float[] fArr = new float[ColorModel.m5764getComponentCountimpl(this.model)];
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        return fromXyz(fArr);
    }

    public abstract float[] fromXyz(float[] fArr);

    public final int getComponentCount() {
        return ColorModel.m5764getComponentCountimpl(this.model);
    }

    public final int getId$ui_graphics() {
        return this.id;
    }

    public abstract float getMaxValue(int i);

    public abstract float getMinValue(int i);

    /* renamed from: getModel-xdoWZVw, reason: not valid java name */
    public final long m5772getModelxdoWZVw() {
        return this.model;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return ((ColorModel.m5765hashCodeimpl(this.model) + (this.name.hashCode() * 31)) * 31) + this.id;
    }

    public boolean isSrgb() {
        return false;
    }

    public abstract boolean isWideGamut();

    public String toString() {
        return this.name + " (id=" + this.id + ", model=" + ColorModel.m5766toStringimpl(this.model) + ")";
    }

    public long toXy$ui_graphics(float f, float f2, float f3) {
        float[] xyz = toXyz(f, f2, f3);
        float f4 = xyz[0];
        float f5 = xyz[1];
        return (Float.floatToRawIntBits(f4) << 32) | (4294967295L & Float.floatToRawIntBits(f5));
    }

    public final float[] toXyz(float f, float f2, float f3) {
        return toXyz(new float[]{f, f2, f3});
    }

    public abstract float[] toXyz(float[] fArr);

    public float toZ$ui_graphics(float f, float f2, float f3) {
        return toXyz(f, f2, f3)[2];
    }

    /* renamed from: xyzaToColor-JlNiLsg$ui_graphics, reason: not valid java name */
    public long mo5773xyzaToColorJlNiLsg$ui_graphics(float f, float f2, float f3, float f4, ColorSpace colorSpace) {
        float[] fromXyz = fromXyz(f, f2, f3);
        return ColorKt.Color(fromXyz[0], fromXyz[1], fromXyz[2], f4, colorSpace);
    }
}
