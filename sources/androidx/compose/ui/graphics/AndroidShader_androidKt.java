package androidx.compose.ui.graphics;

import android.graphics.BitmapShader;
import android.graphics.ComposeShader;
import android.graphics.Shader;
import android.os.Build;
import defpackage.kw;
import defpackage.n1;
import defpackage.nb0;
import defpackage.v5;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class AndroidShader_androidKt {
    /* renamed from: ActualCompositeShader-7EN7VTw, reason: not valid java name */
    public static final Shader m5235ActualCompositeShader7EN7VTw(Shader shader, Shader shader2, int i) {
        return Build.VERSION.SDK_INT >= 29 ? n1.b(shader, shader2, AndroidBlendMode_androidKt.m5182toAndroidBlendModes9anfk8(i)) : new ComposeShader(shader, shader2, AndroidBlendMode_androidKt.m5183toPorterDuffModes9anfk8(i));
    }

    /* renamed from: ActualImageShader-F49vj9s, reason: not valid java name */
    public static final Shader m5236ActualImageShaderF49vj9s(ImageBitmap imageBitmap, int i, int i2) {
        return new BitmapShader(AndroidImageBitmap_androidKt.asAndroidBitmap(imageBitmap), AndroidTileMode_androidKt.m5241toAndroidTileMode0vamqd0(i), AndroidTileMode_androidKt.m5241toAndroidTileMode0vamqd0(i2));
    }

    /* renamed from: ActualLinearGradientShader-VjE6UOU, reason: not valid java name */
    public static final Shader m5237ActualLinearGradientShaderVjE6UOU(long j, long j2, List<Color> list, List<Float> list2, int i) {
        validateColorStops(list, list2);
        if (Build.VERSION.SDK_INT >= 29) {
            return GradientColorLongVerifier.INSTANCE.m5480createLinearGradientColorLongVjE6UOU(j, j2, toPlatformLongArray(list), list2 != null ? kw.J0(list2) : null, i);
        }
        int countTransparentColors = countTransparentColors(list);
        return new android.graphics.LinearGradient(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), makeTransparentColors(list, countTransparentColors), makeTransparentStops(list2, list, countTransparentColors), AndroidTileMode_androidKt.m5241toAndroidTileMode0vamqd0(i));
    }

    /* renamed from: ActualRadialGradientShader-8uybcMk, reason: not valid java name */
    public static final Shader m5238ActualRadialGradientShader8uybcMk(long j, float f, List<Color> list, List<Float> list2, int i) {
        validateColorStops(list, list2);
        if (Build.VERSION.SDK_INT >= 29) {
            return GradientColorLongVerifier.INSTANCE.m5481createRadialGradientColorLong8uybcMk(j, f, toPlatformLongArray(list), list2 != null ? kw.J0(list2) : null, i);
        }
        int countTransparentColors = countTransparentColors(list);
        return new android.graphics.RadialGradient(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (4294967295L & j)), f, makeTransparentColors(list, countTransparentColors), makeTransparentStops(list2, list, countTransparentColors), AndroidTileMode_androidKt.m5241toAndroidTileMode0vamqd0(i));
    }

    /* renamed from: ActualSweepGradientShader-9KIMszo, reason: not valid java name */
    public static final Shader m5239ActualSweepGradientShader9KIMszo(long j, List<Color> list, List<Float> list2) {
        validateColorStops(list, list2);
        if (Build.VERSION.SDK_INT >= 29) {
            return GradientColorLongVerifier.INSTANCE.m5482createSweepGradientColorLong9KIMszo(j, toPlatformLongArray(list), list2 != null ? kw.J0(list2) : null);
        }
        int countTransparentColors = countTransparentColors(list);
        return new android.graphics.SweepGradient(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), makeTransparentColors(list, countTransparentColors), makeTransparentStops(list2, list, countTransparentColors));
    }

    public static /* synthetic */ void Shader$annotations() {
    }

    public static final int countTransparentColors(List<Color> list) {
        int i = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            return 0;
        }
        int x = nb0.x(list);
        for (int i2 = 1; i2 < x; i2++) {
            if (Color.m5334getAlphaimpl(list.get(i2).m5342unboximpl()) == 0.0f) {
                i++;
            }
        }
        return i;
    }

    public static final int[] makeTransparentColors(List<Color> list, int i) {
        int i2;
        int i3 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            int size = list.size();
            int[] iArr = new int[size];
            while (i3 < size) {
                iArr[i3] = ColorKt.m5386toArgb8_81llA(list.get(i3).m5342unboximpl());
                i3++;
            }
            return iArr;
        }
        int[] iArr2 = new int[list.size() + i];
        int size2 = list.size() - 1;
        int size3 = list.size();
        int i4 = 0;
        while (i3 < size3) {
            long m5342unboximpl = list.get(i3).m5342unboximpl();
            if (Color.m5334getAlphaimpl(m5342unboximpl) == 0.0f) {
                if (i3 == 0) {
                    i2 = i4 + 1;
                    iArr2[i4] = ColorKt.m5386toArgb8_81llA(Color.m5331copywmQWz5c$default(list.get(1).m5342unboximpl(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                } else if (i3 == size2) {
                    i2 = i4 + 1;
                    iArr2[i4] = ColorKt.m5386toArgb8_81llA(Color.m5331copywmQWz5c$default(list.get(i3 - 1).m5342unboximpl(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                } else {
                    int i5 = i4 + 1;
                    iArr2[i4] = ColorKt.m5386toArgb8_81llA(Color.m5331copywmQWz5c$default(list.get(i3 - 1).m5342unboximpl(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                    i4 += 2;
                    iArr2[i5] = ColorKt.m5386toArgb8_81llA(Color.m5331copywmQWz5c$default(list.get(i3 + 1).m5342unboximpl(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                }
                i4 = i2;
            } else {
                iArr2[i4] = ColorKt.m5386toArgb8_81llA(m5342unboximpl);
                i4++;
            }
            i3++;
        }
        return iArr2;
    }

    public static final float[] makeTransparentStops(List<Float> list, List<Color> list2, int i) {
        if (i == 0) {
            if (list != null) {
                return kw.J0(list);
            }
            return null;
        }
        float[] fArr = new float[list2.size() + i];
        fArr[0] = list != null ? list.get(0).floatValue() : 0.0f;
        int size = list2.size() - 1;
        int i2 = 1;
        for (int i3 = 1; i3 < size; i3++) {
            long m5342unboximpl = list2.get(i3).m5342unboximpl();
            float floatValue = list != null ? list.get(i3).floatValue() : i3 / (list2.size() - 1);
            int i4 = i2 + 1;
            fArr[i2] = floatValue;
            if (Color.m5334getAlphaimpl(m5342unboximpl) == 0.0f) {
                i2 += 2;
                fArr[i4] = floatValue;
            } else {
                i2 = i4;
            }
        }
        fArr[i2] = list != null ? list.get(list2.size() - 1).floatValue() : 1.0f;
        return fArr;
    }

    private static final long[] toPlatformLongArray(List<Color> list) {
        int size = list.size();
        long[] jArr = new long[size];
        for (int i = 0; i < size; i++) {
            jArr[i] = AndroidColor_androidKt.m5201toSupportedColorLong8_81llA(list.get(i).m5342unboximpl());
        }
        return jArr;
    }

    private static final void validateColorStops(List<Color> list, List<Float> list2) {
        if (list2 == null) {
            if (list.size() >= 2) {
                return;
            }
            v5.m("colors must have length of at least 2 if colorStops is omitted.");
        } else {
            if (list.size() == list2.size()) {
                return;
            }
            v5.m("colors and colorStops arguments must have equal length.");
        }
    }
}
