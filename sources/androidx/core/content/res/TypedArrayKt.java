package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import defpackage.hu2;
import defpackage.ps0;
import defpackage.v5;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class TypedArrayKt {
    private static final void checkAttribute(TypedArray typedArray, int i) {
        if (typedArray.hasValue(i)) {
            return;
        }
        v5.m("Attribute not defined in set.");
    }

    public static final boolean getBooleanOrThrow(TypedArray typedArray, int i) {
        checkAttribute(typedArray, i);
        return typedArray.getBoolean(i, false);
    }

    public static final int getColorOrThrow(TypedArray typedArray, int i) {
        checkAttribute(typedArray, i);
        return typedArray.getColor(i, 0);
    }

    public static final ColorStateList getColorStateListOrThrow(TypedArray typedArray, int i) {
        checkAttribute(typedArray, i);
        ColorStateList colorStateList = typedArray.getColorStateList(i);
        if (colorStateList != null) {
            return colorStateList;
        }
        hu2.h("Attribute value was not a color or color state list.");
        return null;
    }

    public static final float getDimensionOrThrow(TypedArray typedArray, int i) {
        checkAttribute(typedArray, i);
        return typedArray.getDimension(i, 0.0f);
    }

    public static final int getDimensionPixelOffsetOrThrow(TypedArray typedArray, int i) {
        checkAttribute(typedArray, i);
        return typedArray.getDimensionPixelOffset(i, 0);
    }

    public static final int getDimensionPixelSizeOrThrow(TypedArray typedArray, int i) {
        checkAttribute(typedArray, i);
        return typedArray.getDimensionPixelSize(i, 0);
    }

    public static final Drawable getDrawableOrThrow(TypedArray typedArray, int i) {
        checkAttribute(typedArray, i);
        Drawable drawable = typedArray.getDrawable(i);
        drawable.getClass();
        return drawable;
    }

    public static final float getFloatOrThrow(TypedArray typedArray, int i) {
        checkAttribute(typedArray, i);
        return typedArray.getFloat(i, 0.0f);
    }

    public static final Typeface getFontOrThrow(TypedArray typedArray, int i) {
        checkAttribute(typedArray, i);
        return TypedArrayApi26ImplKt.getFont(typedArray, i);
    }

    public static final int getIntOrThrow(TypedArray typedArray, int i) {
        checkAttribute(typedArray, i);
        return typedArray.getInt(i, 0);
    }

    public static final int getIntegerOrThrow(TypedArray typedArray, int i) {
        checkAttribute(typedArray, i);
        return typedArray.getInteger(i, 0);
    }

    public static final int getResourceIdOrThrow(TypedArray typedArray, int i) {
        checkAttribute(typedArray, i);
        return typedArray.getResourceId(i, 0);
    }

    public static final String getStringOrThrow(TypedArray typedArray, int i) {
        checkAttribute(typedArray, i);
        String string = typedArray.getString(i);
        if (string != null) {
            return string;
        }
        hu2.h("Attribute value could not be coerced to String.");
        return null;
    }

    public static final CharSequence[] getTextArrayOrThrow(TypedArray typedArray, int i) {
        checkAttribute(typedArray, i);
        return typedArray.getTextArray(i);
    }

    public static final CharSequence getTextOrThrow(TypedArray typedArray, int i) {
        checkAttribute(typedArray, i);
        CharSequence text = typedArray.getText(i);
        if (text != null) {
            return text;
        }
        hu2.h("Attribute value could not be coerced to CharSequence.");
        return null;
    }

    public static final <R> R use(TypedArray typedArray, ps0 ps0Var) {
        R r = (R) ps0Var.invoke(typedArray);
        typedArray.recycle();
        return r;
    }
}
