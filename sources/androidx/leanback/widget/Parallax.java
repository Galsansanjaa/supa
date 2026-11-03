package androidx.leanback.widget;

import android.util.Property;
import androidx.leanback.widget.ParallaxEffect;
import defpackage.v5;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public abstract class Parallax<PropertyT extends Property> {
    private final List<ParallaxEffect> mEffects;
    private float[] mFloatValues;
    final List<PropertyT> mProperties;
    final List<PropertyT> mPropertiesReadOnly;
    private int[] mValues;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static class FloatProperty extends Property<Parallax, Float> {
        public static final float UNKNOWN_AFTER = Float.MAX_VALUE;
        public static final float UNKNOWN_BEFORE = -3.4028235E38f;
        private final int mIndex;

        public FloatProperty(String str, int i) {
            super(Float.class, str);
            this.mIndex = i;
        }

        public final PropertyMarkerValue at(float f, float f2) {
            return new FloatPropertyMarkerValue(this, f, f2);
        }

        public final PropertyMarkerValue atAbsolute(float f) {
            return new FloatPropertyMarkerValue(this, f, 0.0f);
        }

        public final PropertyMarkerValue atFraction(float f) {
            return new FloatPropertyMarkerValue(this, 0.0f, f);
        }

        public final PropertyMarkerValue atMax() {
            return new FloatPropertyMarkerValue(this, 0.0f, 1.0f);
        }

        public final PropertyMarkerValue atMin() {
            return new FloatPropertyMarkerValue(this, 0.0f);
        }

        @Override // android.util.Property
        public final Float get(Parallax parallax) {
            return Float.valueOf(parallax.getFloatPropertyValue(this.mIndex));
        }

        public final int getIndex() {
            return this.mIndex;
        }

        public final float getValue(Parallax parallax) {
            return parallax.getFloatPropertyValue(this.mIndex);
        }

        @Override // android.util.Property
        public final void set(Parallax parallax, Float f) {
            parallax.setFloatPropertyValue(this.mIndex, f.floatValue());
        }

        public final void setValue(Parallax parallax, float f) {
            parallax.setFloatPropertyValue(this.mIndex, f);
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static class FloatPropertyMarkerValue extends PropertyMarkerValue<FloatProperty> {
        private final float mFactionOfMax;
        private final float mValue;

        public FloatPropertyMarkerValue(FloatProperty floatProperty, float f) {
            this(floatProperty, f, 0.0f);
        }

        public FloatPropertyMarkerValue(FloatProperty floatProperty, float f, float f2) {
            super(floatProperty);
            this.mValue = f;
            this.mFactionOfMax = f2;
        }

        public final float getMarkerValue(Parallax parallax) {
            float f = this.mFactionOfMax;
            float f2 = this.mValue;
            return f == 0.0f ? f2 : (parallax.getMaxValue() * this.mFactionOfMax) + f2;
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static class IntProperty extends Property<Parallax, Integer> {
        public static final int UNKNOWN_AFTER = Integer.MAX_VALUE;
        public static final int UNKNOWN_BEFORE = Integer.MIN_VALUE;
        private final int mIndex;

        public IntProperty(String str, int i) {
            super(Integer.class, str);
            this.mIndex = i;
        }

        public final PropertyMarkerValue at(int i, float f) {
            return new IntPropertyMarkerValue(this, i, f);
        }

        public final PropertyMarkerValue atAbsolute(int i) {
            return new IntPropertyMarkerValue(this, i, 0.0f);
        }

        public final PropertyMarkerValue atFraction(float f) {
            return new IntPropertyMarkerValue(this, 0, f);
        }

        public final PropertyMarkerValue atMax() {
            return new IntPropertyMarkerValue(this, 0, 1.0f);
        }

        public final PropertyMarkerValue atMin() {
            return new IntPropertyMarkerValue(this, 0);
        }

        @Override // android.util.Property
        public final Integer get(Parallax parallax) {
            return Integer.valueOf(parallax.getIntPropertyValue(this.mIndex));
        }

        public final int getIndex() {
            return this.mIndex;
        }

        public final int getValue(Parallax parallax) {
            return parallax.getIntPropertyValue(this.mIndex);
        }

        @Override // android.util.Property
        public final void set(Parallax parallax, Integer num) {
            parallax.setIntPropertyValue(this.mIndex, num.intValue());
        }

        public final void setValue(Parallax parallax, int i) {
            parallax.setIntPropertyValue(this.mIndex, i);
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static class IntPropertyMarkerValue extends PropertyMarkerValue<IntProperty> {
        private final float mFactionOfMax;
        private final int mValue;

        public IntPropertyMarkerValue(IntProperty intProperty, int i) {
            this(intProperty, i, 0.0f);
        }

        public IntPropertyMarkerValue(IntProperty intProperty, int i, float f) {
            super(intProperty);
            this.mValue = i;
            this.mFactionOfMax = f;
        }

        public final int getMarkerValue(Parallax parallax) {
            float f = this.mFactionOfMax;
            int i = this.mValue;
            return f == 0.0f ? i : Math.round(parallax.getMaxValue() * this.mFactionOfMax) + i;
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static class PropertyMarkerValue<PropertyT> {
        private final PropertyT mProperty;

        public PropertyMarkerValue(PropertyT propertyt) {
            this.mProperty = propertyt;
        }

        public PropertyT getProperty() {
            return this.mProperty;
        }
    }

    public Parallax() {
        ArrayList arrayList = new ArrayList();
        this.mProperties = arrayList;
        this.mPropertiesReadOnly = DesugarCollections.unmodifiableList(arrayList);
        this.mValues = new int[4];
        this.mFloatValues = new float[4];
        this.mEffects = new ArrayList(4);
    }

    public ParallaxEffect addEffect(PropertyMarkerValue... propertyMarkerValueArr) {
        ParallaxEffect intEffect = propertyMarkerValueArr[0].getProperty() instanceof IntProperty ? new ParallaxEffect.IntEffect() : new ParallaxEffect.FloatEffect();
        intEffect.setPropertyRanges(propertyMarkerValueArr);
        this.mEffects.add(intEffect);
        return intEffect;
    }

    public final PropertyT addProperty(String str) {
        int size = this.mProperties.size();
        PropertyT createProperty = createProperty(str, size);
        int i = 0;
        if (createProperty instanceof IntProperty) {
            int[] iArr = this.mValues;
            int length = iArr.length;
            if (length == size) {
                iArr = new int[length * 2];
                while (i < length) {
                    iArr[i] = this.mValues[i];
                    i++;
                }
                this.mValues = iArr;
            }
            iArr[size] = Integer.MAX_VALUE;
        } else {
            if (!(createProperty instanceof FloatProperty)) {
                v5.m("Invalid Property type");
                return null;
            }
            float[] fArr = this.mFloatValues;
            int length2 = fArr.length;
            if (length2 == size) {
                fArr = new float[length2 * 2];
                while (i < length2) {
                    fArr[i] = this.mFloatValues[i];
                    i++;
                }
                this.mFloatValues = fArr;
            }
            fArr[size] = Float.MAX_VALUE;
        }
        this.mProperties.add(createProperty);
        return createProperty;
    }

    public abstract PropertyT createProperty(String str, int i);

    public List<ParallaxEffect> getEffects() {
        return this.mEffects;
    }

    public final float getFloatPropertyValue(int i) {
        return this.mFloatValues[i];
    }

    public final int getIntPropertyValue(int i) {
        return this.mValues[i];
    }

    public abstract float getMaxValue();

    public final List<PropertyT> getProperties() {
        return this.mPropertiesReadOnly;
    }

    public void removeAllEffects() {
        this.mEffects.clear();
    }

    public void removeEffect(ParallaxEffect parallaxEffect) {
        this.mEffects.remove(parallaxEffect);
    }

    public final void setFloatPropertyValue(int i, float f) {
        if (i >= this.mProperties.size()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        this.mFloatValues[i] = f;
    }

    public final void setIntPropertyValue(int i, int i2) {
        if (i >= this.mProperties.size()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        this.mValues[i] = i2;
    }

    public void updateValues() {
        for (int i = 0; i < this.mEffects.size(); i++) {
            this.mEffects.get(i).performMapping(this);
        }
    }

    public final void verifyFloatProperties() throws IllegalStateException {
        if (this.mProperties.size() < 2) {
            return;
        }
        float floatPropertyValue = getFloatPropertyValue(0);
        int i = 1;
        while (i < this.mProperties.size()) {
            float floatPropertyValue2 = getFloatPropertyValue(i);
            if (floatPropertyValue2 < floatPropertyValue) {
                Integer valueOf = Integer.valueOf(i);
                String name = this.mProperties.get(i).getName();
                int i2 = i - 1;
                throw new IllegalStateException(String.format("Parallax Property[%d]\"%s\" is smaller than Property[%d]\"%s\"", valueOf, name, Integer.valueOf(i2), this.mProperties.get(i2).getName()));
            }
            if (floatPropertyValue == -3.4028235E38f && floatPropertyValue2 == Float.MAX_VALUE) {
                int i3 = i - 1;
                throw new IllegalStateException(String.format("Parallax Property[%d]\"%s\" is UNKNOWN_BEFORE and Property[%d]\"%s\" is UNKNOWN_AFTER", Integer.valueOf(i3), this.mProperties.get(i3).getName(), Integer.valueOf(i), this.mProperties.get(i).getName()));
            }
            i++;
            floatPropertyValue = floatPropertyValue2;
        }
    }

    public void verifyIntProperties() throws IllegalStateException {
        if (this.mProperties.size() < 2) {
            return;
        }
        int intPropertyValue = getIntPropertyValue(0);
        int i = 1;
        while (i < this.mProperties.size()) {
            int intPropertyValue2 = getIntPropertyValue(i);
            if (intPropertyValue2 < intPropertyValue) {
                Integer valueOf = Integer.valueOf(i);
                String name = this.mProperties.get(i).getName();
                int i2 = i - 1;
                throw new IllegalStateException(String.format("Parallax Property[%d]\"%s\" is smaller than Property[%d]\"%s\"", valueOf, name, Integer.valueOf(i2), this.mProperties.get(i2).getName()));
            }
            if (intPropertyValue == Integer.MIN_VALUE && intPropertyValue2 == Integer.MAX_VALUE) {
                int i3 = i - 1;
                throw new IllegalStateException(String.format("Parallax Property[%d]\"%s\" is UNKNOWN_BEFORE and Property[%d]\"%s\" is UNKNOWN_AFTER", Integer.valueOf(i3), this.mProperties.get(i3).getName(), Integer.valueOf(i), this.mProperties.get(i).getName()));
            }
            i++;
            intPropertyValue = intPropertyValue2;
        }
    }
}
