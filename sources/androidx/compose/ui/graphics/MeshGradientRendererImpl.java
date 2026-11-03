package androidx.compose.ui.graphics;

import android.graphics.Canvas;
import android.os.Build;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.IntSize;
import defpackage.ea0;
import defpackage.sb0;
import defpackage.wa2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class MeshGradientRendererImpl implements MeshGradientRenderer {
    private static final int MaxSubdivision = 64;
    private static final int MinSubdivision = 4;
    private static final float TargetPxPerSegment = 8.0f;
    private float[] colorForwardDifferenceRowResults;
    private int[] colorsBuffer;
    private float[] forwardDifferenceRowResultsX;
    private float[] forwardDifferenceRowResultsY;
    private short[] indexBuffer;
    private float[] positionsBuffer;
    private float[] vBernsteinBasis;
    private float[] vCatmullRomBasis;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private final android.graphics.Paint paint = new android.graphics.Paint();
    private int lastSubdivisionU = -1;
    private int lastSubdivisionV = -1;
    private final float[] patchPositions = new float[8];
    private final float[] patchLeftBezierOffsets = new float[8];
    private final float[] patchRightBezierOffsets = new float[8];
    private final float[] patchTopBezierOffsets = new float[8];
    private final float[] patchBottomBezierOffsets = new float[8];
    private final int[] patchColors = new int[16];
    private final float[] okLabPatchColors = new float[64];
    private final float[] controlPoints = new float[32];

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }
    }

    private final void buildControlPointMatrix(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4, float[] fArr5, float[] fArr6) {
        fArr6[buildControlPointMatrix$idx(0, 0, 0)] = fArr[0];
        fArr6[buildControlPointMatrix$idx(0, 0, 1)] = fArr[1];
        fArr6[buildControlPointMatrix$idx(0, 3, 0)] = fArr[2];
        fArr6[buildControlPointMatrix$idx(0, 3, 1)] = fArr[3];
        fArr6[buildControlPointMatrix$idx(3, 0, 0)] = fArr[4];
        fArr6[buildControlPointMatrix$idx(3, 0, 1)] = fArr[5];
        fArr6[buildControlPointMatrix$idx(3, 3, 0)] = fArr[6];
        fArr6[buildControlPointMatrix$idx(3, 3, 1)] = fArr[7];
        fArr6[buildControlPointMatrix$idx(0, 1, 0)] = fArr6[buildControlPointMatrix$idx(0, 0, 0)] + fArr3[0];
        fArr6[buildControlPointMatrix$idx(0, 1, 1)] = fArr6[buildControlPointMatrix$idx(0, 0, 1)] + fArr3[1];
        fArr6[buildControlPointMatrix$idx(0, 2, 0)] = fArr6[buildControlPointMatrix$idx(0, 3, 0)] + fArr2[2];
        fArr6[buildControlPointMatrix$idx(0, 2, 1)] = fArr6[buildControlPointMatrix$idx(0, 3, 1)] + fArr2[3];
        fArr6[buildControlPointMatrix$idx(3, 1, 0)] = fArr6[buildControlPointMatrix$idx(3, 0, 0)] + fArr3[4];
        fArr6[buildControlPointMatrix$idx(3, 1, 1)] = fArr6[buildControlPointMatrix$idx(3, 0, 1)] + fArr3[5];
        fArr6[buildControlPointMatrix$idx(3, 2, 0)] = fArr6[buildControlPointMatrix$idx(3, 3, 0)] + fArr2[6];
        fArr6[buildControlPointMatrix$idx(3, 2, 1)] = fArr6[buildControlPointMatrix$idx(3, 3, 1)] + fArr2[7];
        fArr6[buildControlPointMatrix$idx(1, 0, 0)] = fArr6[buildControlPointMatrix$idx(0, 0, 0)] + fArr5[0];
        fArr6[buildControlPointMatrix$idx(1, 0, 1)] = fArr6[buildControlPointMatrix$idx(0, 0, 1)] + fArr5[1];
        fArr6[buildControlPointMatrix$idx(2, 0, 0)] = fArr6[buildControlPointMatrix$idx(3, 0, 0)] + fArr4[4];
        fArr6[buildControlPointMatrix$idx(2, 0, 1)] = fArr6[buildControlPointMatrix$idx(3, 0, 1)] + fArr4[5];
        fArr6[buildControlPointMatrix$idx(1, 3, 0)] = fArr6[buildControlPointMatrix$idx(0, 3, 0)] + fArr5[2];
        fArr6[buildControlPointMatrix$idx(1, 3, 1)] = fArr6[buildControlPointMatrix$idx(0, 3, 1)] + fArr5[3];
        fArr6[buildControlPointMatrix$idx(2, 3, 0)] = fArr6[buildControlPointMatrix$idx(3, 3, 0)] + fArr4[6];
        fArr6[buildControlPointMatrix$idx(2, 3, 1)] = fArr6[buildControlPointMatrix$idx(3, 3, 1)] + fArr4[7];
        fArr6[buildControlPointMatrix$idx(1, 1, 0)] = (fArr6[buildControlPointMatrix$idx(0, 1, 0)] + fArr6[buildControlPointMatrix$idx(1, 0, 0)]) - fArr6[buildControlPointMatrix$idx(0, 0, 0)];
        fArr6[buildControlPointMatrix$idx(1, 1, 1)] = (fArr6[buildControlPointMatrix$idx(0, 1, 1)] + fArr6[buildControlPointMatrix$idx(1, 0, 1)]) - fArr6[buildControlPointMatrix$idx(0, 0, 1)];
        fArr6[buildControlPointMatrix$idx(1, 2, 0)] = (fArr6[buildControlPointMatrix$idx(0, 2, 0)] + fArr6[buildControlPointMatrix$idx(1, 3, 0)]) - fArr6[buildControlPointMatrix$idx(0, 3, 0)];
        fArr6[buildControlPointMatrix$idx(1, 2, 1)] = (fArr6[buildControlPointMatrix$idx(0, 2, 1)] + fArr6[buildControlPointMatrix$idx(1, 3, 1)]) - fArr6[buildControlPointMatrix$idx(0, 3, 1)];
        fArr6[buildControlPointMatrix$idx(2, 1, 0)] = (fArr6[buildControlPointMatrix$idx(2, 0, 0)] + fArr6[buildControlPointMatrix$idx(3, 1, 0)]) - fArr6[buildControlPointMatrix$idx(3, 0, 0)];
        fArr6[buildControlPointMatrix$idx(2, 1, 1)] = (fArr6[buildControlPointMatrix$idx(2, 0, 1)] + fArr6[buildControlPointMatrix$idx(3, 1, 1)]) - fArr6[buildControlPointMatrix$idx(3, 0, 1)];
        fArr6[buildControlPointMatrix$idx(2, 2, 0)] = (fArr6[buildControlPointMatrix$idx(2, 3, 0)] + fArr6[buildControlPointMatrix$idx(3, 2, 0)]) - fArr6[buildControlPointMatrix$idx(3, 3, 0)];
        fArr6[buildControlPointMatrix$idx(2, 2, 1)] = (fArr6[buildControlPointMatrix$idx(2, 3, 1)] + fArr6[buildControlPointMatrix$idx(3, 2, 1)]) - fArr6[buildControlPointMatrix$idx(3, 3, 1)];
    }

    private static final int buildControlPointMatrix$idx(int i, int i2, int i3) {
        return (((i * 4) + i2) * 2) + i3;
    }

    private final void buildIndexBuffer(int i, int i2) {
        short[] sArr = this.indexBuffer;
        sArr.getClass();
        int i3 = i - 1;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = i2 - 1;
            for (int i7 = 0; i7 < i6; i7++) {
                int i8 = (i5 * i2) + i7;
                short s = (short) i8;
                int i9 = ((i5 + 1) * i2) + i7;
                short s2 = (short) i9;
                short s3 = (short) (i9 + 1);
                sArr[i4] = s;
                sArr[i4 + 1] = s2;
                sArr[i4 + 2] = s3;
                sArr[i4 + 3] = s;
                int i10 = i4 + 5;
                sArr[i4 + 4] = s3;
                i4 += 6;
                sArr[i10] = (short) (i8 + 1);
            }
        }
    }

    /* renamed from: calculateSubdivisions-2kb6nC0, reason: not valid java name */
    private final long m5599calculateSubdivisions2kb6nC0(int i, int i2, float[] fArr, long j) {
        int i3 = i2;
        float f = 0.0f;
        int i4 = 0;
        float f2 = 0.0f;
        for (int i5 = i * i3; i4 < i5; i5 = i5) {
            int i6 = i4 / i3;
            int i7 = i4 % i3;
            int pointIndex = getPointIndex(i6, i7, i3) * 2;
            int i8 = i7 + 1;
            int pointIndex2 = getPointIndex(i6, i8, i3) * 2;
            int i9 = i6 + 1;
            int pointIndex3 = getPointIndex(i9, i7, i3) * 2;
            int pointIndex4 = getPointIndex(i9, i8, i3) * 2;
            int i10 = (int) (j >> 32);
            int i11 = pointIndex + 1;
            int i12 = (int) (j & 4294967295L);
            int i13 = pointIndex2 + 1;
            int i14 = pointIndex3 + 1;
            int i15 = pointIndex4 + 1;
            float dist = (dist(Float.intBitsToFloat(i10) * fArr[pointIndex], Float.intBitsToFloat(i12) * fArr[i11], fArr[pointIndex2] * Float.intBitsToFloat(i10), Float.intBitsToFloat(i12) * fArr[i13]) + dist(Float.intBitsToFloat(i10) * fArr[pointIndex3], fArr[i14] * Float.intBitsToFloat(i12), Float.intBitsToFloat(i10) * fArr[pointIndex4], Float.intBitsToFloat(i12) * fArr[i15])) * 0.5f;
            float dist2 = (dist(Float.intBitsToFloat(i10) * fArr[pointIndex], Float.intBitsToFloat(i12) * fArr[i11], Float.intBitsToFloat(i10) * fArr[pointIndex3], Float.intBitsToFloat(i12) * fArr[i14]) + dist(Float.intBitsToFloat(i10) * fArr[pointIndex2], Float.intBitsToFloat(i12) * fArr[i13], Float.intBitsToFloat(i10) * fArr[pointIndex4], Float.intBitsToFloat(i12) * fArr[i15])) * 0.5f;
            f = Math.max(f, dist);
            f2 = Math.max(f2, dist2);
            i4++;
            i3 = i2;
        }
        return IntSize.m8211constructorimpl((ea0.o((int) Math.ceil(f / 8.0f), 4, 64) << 32) | (ea0.o((int) Math.ceil(f2 / 8.0f), 4, 64) & 4294967295L));
    }

    private final void computeBezierSurfacePoints(float[] fArr, int i, int i2, float[] fArr2) {
        float[] fArr3 = this.forwardDifferenceRowResultsX;
        fArr3.getClass();
        float[] fArr4 = this.forwardDifferenceRowResultsY;
        fArr4.getClass();
        float f = 1.0f / (i - 1);
        float f2 = f * f;
        float f3 = f2 * f;
        for (int i3 = 0; i3 < 4; i3++) {
            int i4 = i3 * 8;
            float f4 = fArr[i4];
            float f5 = fArr[i4 + 2];
            float f6 = fArr[i4 + 4];
            float f7 = ((((f5 * 3.0f) + (-f4)) - (f6 * 3.0f)) + fArr[i4 + 6]) * f3;
            float l = wa2.l(f6, 3.0f, (f4 * 3.0f) - (f5 * 6.0f), f2);
            float f8 = (((f5 * 3.0f) + (f4 * (-3.0f))) * f) + f7 + l;
            float f9 = f7 * 6.0f;
            float f10 = (l * 2.0f) + f9;
            float f11 = fArr[i4 + 1];
            float f12 = fArr[i4 + 3];
            float f13 = fArr[i4 + 5];
            float f14 = ((((f12 * 3.0f) + (-f11)) - (f13 * 3.0f)) + fArr[i4 + 7]) * f3;
            float l2 = wa2.l(f13, 3.0f, (f11 * 3.0f) - (f12 * 6.0f), f2);
            float f15 = (((f12 * 3.0f) + ((-3.0f) * f11)) * f) + f14 + l2;
            float f16 = f14 * 6.0f;
            float f17 = (l2 * 2.0f) + f16;
            int i5 = i3 * i;
            fArr3[i5] = f4;
            fArr4[i5] = f11;
            float f18 = f8;
            float f19 = f4;
            float f20 = f11;
            for (int i6 = 1; i6 < i; i6++) {
                f19 += f18;
                f18 += f10;
                f10 += f9;
                f20 += f15;
                f15 += f17;
                f17 += f16;
                int i7 = i5 + i6;
                fArr3[i7] = f19;
                fArr4[i7] = f20;
            }
        }
        float[] fArr5 = this.vBernsteinBasis;
        fArr5.getClass();
        for (int i8 = 0; i8 < i2; i8++) {
            int i9 = i8 * 4;
            for (int i10 = 0; i10 < i; i10++) {
                int i11 = ((i10 * i2) + i8) * 2;
                int i12 = i9 + 1;
                int i13 = i + i10;
                int i14 = i9 + 2;
                int i15 = (i * 2) + i10;
                float f21 = (fArr5[i14] * fArr3[i15]) + (fArr5[i12] * fArr3[i13]) + (fArr5[i9] * fArr3[i10]);
                int i16 = i9 + 3;
                int i17 = (i * 3) + i10;
                fArr2[i11] = (fArr5[i16] * fArr3[i17]) + f21;
                fArr2[i11 + 1] = (fArr5[i16] * fArr4[i17]) + (fArr5[i14] * fArr4[i15]) + (fArr5[i12] * fArr4[i13]) + (fArr5[i9] * fArr4[i10]);
            }
        }
    }

    private final void computeBilinearSurfaceColors(int[] iArr, int i, int i2, int[] iArr2) {
        float f = i - 1;
        float f2 = i2 - 1;
        long Color = ColorKt.Color(iArr[computeBilinearSurfaceColors$colorIdx(1, 1)]);
        long Color2 = ColorKt.Color(iArr[computeBilinearSurfaceColors$colorIdx(1, 2)]);
        long Color3 = ColorKt.Color(iArr[computeBilinearSurfaceColors$colorIdx(2, 1)]);
        long Color4 = ColorKt.Color(iArr[computeBilinearSurfaceColors$colorIdx(2, 2)]);
        int i3 = 0;
        while (i3 < i) {
            float f3 = i3 / f;
            float f4 = f;
            float f5 = f2;
            long m5383lerpjxsXWHM = ColorKt.m5383lerpjxsXWHM(Color, Color2, f3);
            long j = Color;
            long m5383lerpjxsXWHM2 = ColorKt.m5383lerpjxsXWHM(Color3, Color4, f3);
            for (int i4 = 0; i4 < i2; i4++) {
                iArr2[(i3 * i2) + i4] = ColorKt.m5386toArgb8_81llA(ColorKt.m5383lerpjxsXWHM(m5383lerpjxsXWHM, m5383lerpjxsXWHM2, i4 / f5));
            }
            i3++;
            f = f4;
            f2 = f5;
            Color = j;
        }
    }

    private static final int computeBilinearSurfaceColors$colorIdx(int i, int i2) {
        return (i * 4) + i2;
    }

    private final void computeCatmullRomSurfaceColors(int[] iArr, int i, int i2, int[] iArr2) {
        int i3;
        int i4;
        float f;
        int i5 = 0;
        while (true) {
            i3 = 3;
            if (i5 >= 16) {
                break;
            }
            long m5329convertvNxB06k = Color.m5329convertvNxB06k(ColorKt.Color(iArr[i5]), ColorSpaces.INSTANCE.getOklab());
            int i6 = i5 * 4;
            this.okLabPatchColors[i6] = Color.m5338getRedimpl(m5329convertvNxB06k);
            this.okLabPatchColors[i6 + 1] = Color.m5337getGreenimpl(m5329convertvNxB06k);
            this.okLabPatchColors[i6 + 2] = Color.m5335getBlueimpl(m5329convertvNxB06k);
            this.okLabPatchColors[i6 + 3] = Color.m5334getAlphaimpl(m5329convertvNxB06k);
            i5++;
        }
        float[] fArr = this.colorForwardDifferenceRowResults;
        fArr.getClass();
        float f2 = 1.0f / (i - 1);
        float f3 = f2 * f2;
        float f4 = f3 * f2;
        int i7 = 0;
        while (true) {
            if (i7 >= 4) {
                break;
            }
            int i8 = i7 * 16;
            int i9 = 0;
            for (int i10 = 4; i9 < i10; i10 = 4) {
                float[] fArr2 = this.okLabPatchColors;
                float f5 = fArr2[i8 + i9];
                float f6 = fArr2[i8 + 4 + i9];
                float f7 = fArr2[i8 + 8 + i9];
                float f8 = fArr2[i8 + 12 + i9];
                float f9 = ((((f6 * 3.0f) + (-f5)) - (3.0f * f7)) + f8) * 0.5f * f4;
                float f10 = (((4.0f * f7) + ((f5 * 2.0f) - (5.0f * f6))) - f8) * 0.5f * f3;
                float f11 = (((-f5) + f7) * 0.5f * f2) + f9 + f10;
                float f12 = f9 * 6.0f;
                float f13 = (f10 * 2.0f) + f12;
                int i11 = i7 * i * i10;
                float minValue = i9 < i3 ? ColorSpaces.INSTANCE.getOklab().getMinValue(i9) : 0.0f;
                if (i9 < i3) {
                    i4 = i3;
                    f = ColorSpaces.INSTANCE.getOklab().getMaxValue(i9);
                } else {
                    i4 = i3;
                    f = 1.0f;
                }
                fArr[i11 + i9] = ea0.n(f6, minValue, f);
                for (int i12 = 1; i12 < i; i12++) {
                    f6 += f11;
                    f11 += f13;
                    f13 += f12;
                    fArr[(i12 * 4) + i11 + i9] = ea0.n(f6, minValue, f);
                }
                i9++;
                i3 = i4;
            }
            i7++;
        }
        float[] fArr3 = this.vCatmullRomBasis;
        fArr3.getClass();
        for (int i13 = 0; i13 < i; i13++) {
            int i14 = i13 * 4;
            int i15 = (i * 4) + i14;
            int i16 = (i * 8) + i14;
            int i17 = (i * 12) + i14;
            int i18 = 0;
            while (i18 < i2) {
                int i19 = i18 * 4;
                float f14 = fArr3[i19];
                float f15 = fArr[i14] * f14;
                float f16 = fArr3[i19 + 1];
                float f17 = (fArr[i15] * f16) + f15;
                float f18 = fArr3[i19 + 2];
                float f19 = (fArr[i16] * f18) + f17;
                float f20 = fArr3[i19 + 3];
                float f21 = (fArr[i17] * f20) + f19;
                float f22 = (fArr[i17 + 1] * f20) + (fArr[i16 + 1] * f18) + (fArr[i15 + 1] * f16) + (fArr[i14 + 1] * f14);
                float[] fArr4 = fArr3;
                float f23 = (fArr[i17 + 2] * f20) + (fArr[i16 + 2] * f18) + (fArr[i15 + 2] * f16) + (fArr[i14 + 2] * f14);
                float f24 = (f20 * fArr[i17 + 3]) + (f18 * fArr[i16 + 3]) + (f16 * fArr[i15 + 3]) + (f14 * fArr[i14 + 3]);
                ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
                iArr2[(i13 * i2) + i18] = ColorKt.m5386toArgb8_81llA(Color.m5329convertvNxB06k(ColorKt.Color(f21, f22, f23, f24, colorSpaces.getOklab()), colorSpaces.getSrgb()));
                i18++;
                fArr3 = fArr4;
            }
        }
    }

    private final float dist(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        return (float) Math.sqrt((f6 * f6) + (f5 * f5));
    }

    /* renamed from: drawPatch-W8bZRI4, reason: not valid java name */
    private final void m5600drawPatchW8bZRI4(Canvas canvas, int i, int i2, int i3, boolean z, float[] fArr, int[] iArr, float[] fArr2, float[] fArr3, float[] fArr4, float[] fArr5, long j, int i4, int i5, float[] fArr6, int[] iArr2, short[] sArr) {
        m5601readPatchPositionsyzxVdVo(i, i3, fArr, j, this.patchPositions);
        m5601readPatchPositionsyzxVdVo(i, i3, fArr2, j, this.patchLeftBezierOffsets);
        m5601readPatchPositionsyzxVdVo(i, i3, fArr4, j, this.patchRightBezierOffsets);
        m5601readPatchPositionsyzxVdVo(i, i3, fArr3, j, this.patchTopBezierOffsets);
        m5601readPatchPositionsyzxVdVo(i, i3, fArr5, j, this.patchBottomBezierOffsets);
        readPatchColors(i, i2, i3, iArr, this.patchColors);
        buildControlPointMatrix(this.patchPositions, this.patchLeftBezierOffsets, this.patchRightBezierOffsets, this.patchTopBezierOffsets, this.patchBottomBezierOffsets, this.controlPoints);
        computeBezierSurfacePoints(this.controlPoints, i4, i5, fArr6);
        int[] iArr3 = this.patchColors;
        if (z) {
            computeCatmullRomSurfaceColors(iArr3, i4, i5, iArr2);
        } else {
            computeBilinearSurfaceColors(iArr3, i4, i5, iArr2);
        }
        AndroidCanvas_androidKt.getNativeCanvas(canvas).drawVertices(Canvas.VertexMode.TRIANGLES, fArr6.length, fArr6, 0, null, 0, iArr2, 0, sArr, 0, sArr.length, this.paint);
    }

    private final int getPointIndex(int i, int i2, int i3) {
        return ((i3 + 1) * i) + i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0056, code lost:
    
        if (r0.length != (r14 * 4)) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r0.length != (r14 * 4)) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void precomputeBasisArrays(int r14) {
        /*
            r13 = this;
            float[] r0 = r13.vBernsteinBasis
            if (r0 == 0) goto Lc
            r0.getClass()
            int r0 = r0.length
            int r1 = r14 * 4
            if (r0 == r1) goto L12
        Lc:
            int r0 = r14 * 4
            float[] r0 = new float[r0]
            r13.vBernsteinBasis = r0
        L12:
            float[] r0 = r13.vBernsteinBasis
            r0.getClass()
            int r1 = r14 + (-1)
            float r1 = (float) r1
            r2 = 0
            r3 = r2
        L1c:
            r4 = -1069547520(0xffffffffc0400000, float:-3.0)
            r5 = 1077936128(0x40400000, float:3.0)
            if (r3 >= r14) goto L4c
            float r6 = (float) r3
            float r6 = r6 / r1
            float r7 = r6 * r6
            float r8 = r7 * r6
            int r9 = r3 * 4
            float r10 = -r8
            float r11 = r7 * r5
            float r10 = r10 + r11
            float r6 = r6 * r5
            float r10 = r10 - r6
            r12 = 1065353216(0x3f800000, float:1.0)
            float r10 = r10 + r12
            r0[r9] = r10
            int r10 = r9 + 1
            float r5 = r5 * r8
            r12 = 1086324736(0x40c00000, float:6.0)
            float r7 = r7 * r12
            float r5 = r5 - r7
            float r5 = r5 + r6
            r0[r10] = r5
            int r5 = r9 + 2
            float r4 = r4 * r8
            float r4 = r4 + r11
            r0[r5] = r4
            int r9 = r9 + 3
            r0[r9] = r8
            int r3 = r3 + 1
            goto L1c
        L4c:
            float[] r0 = r13.vCatmullRomBasis
            if (r0 == 0) goto L58
            r0.getClass()
            int r0 = r0.length
            int r3 = r14 * 4
            if (r0 == r3) goto L5e
        L58:
            int r0 = r14 * 4
            float[] r0 = new float[r0]
            r13.vCatmullRomBasis = r0
        L5e:
            float[] r13 = r13.vCatmullRomBasis
            r13.getClass()
        L63:
            if (r2 >= r14) goto L9a
            float r0 = (float) r2
            float r0 = r0 / r1
            float r3 = r0 * r0
            float r6 = r3 * r0
            int r7 = r2 * 4
            float r8 = -r6
            r9 = 1073741824(0x40000000, float:2.0)
            float r10 = r3 * r9
            float r10 = r10 + r8
            float r10 = r10 - r0
            r8 = 1056964608(0x3f000000, float:0.5)
            float r10 = r10 * r8
            r13[r7] = r10
            int r10 = r7 + 1
            float r11 = r6 * r5
            r12 = 1084227584(0x40a00000, float:5.0)
            float r12 = r12 * r3
            float r11 = r11 - r12
            float r11 = r11 + r9
            float r11 = r11 * r8
            r13[r10] = r11
            int r9 = r7 + 2
            float r10 = r6 * r4
            r11 = 1082130432(0x40800000, float:4.0)
            float r11 = r11 * r3
            float r11 = r11 + r10
            float r11 = r11 + r0
            float r11 = r11 * r8
            r13[r9] = r11
            int r7 = r7 + 3
            float r6 = r6 - r3
            float r6 = r6 * r8
            r13[r7] = r6
            int r2 = r2 + 1
            goto L63
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.MeshGradientRendererImpl.precomputeBasisArrays(int):void");
    }

    private final void readPatchColors(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        int i4 = i / i3;
        int i5 = i % i3;
        for (int i6 = 0; i6 < 4; i6++) {
            for (int i7 = 0; i7 < 4; i7++) {
                iArr2[(i6 * 4) + i7] = iArr[getPointIndex(ea0.o((i4 - 1) + i6, 0, i2), ea0.o((i5 - 1) + i7, 0, i3), i3)];
            }
        }
    }

    /* renamed from: readPatchPositions-yzxVdVo, reason: not valid java name */
    private final void m5601readPatchPositionsyzxVdVo(int i, int i2, float[] fArr, long j, float[] fArr2) {
        if (fArr == null) {
            int length = fArr2.length;
            for (int i3 = 0; i3 < length; i3++) {
                fArr2[i3] = 0.0f;
            }
            return;
        }
        int i4 = i / i2;
        int i5 = i % i2;
        int pointIndex = getPointIndex(i4, i5, i2) * 2;
        int i6 = i5 + 1;
        int pointIndex2 = getPointIndex(i4, i6, i2) * 2;
        int i7 = i4 + 1;
        int pointIndex3 = getPointIndex(i7, i5, i2) * 2;
        int pointIndex4 = getPointIndex(i7, i6, i2) * 2;
        int i8 = (int) (j >> 32);
        fArr2[0] = Float.intBitsToFloat(i8) * fArr[pointIndex];
        int i9 = (int) (j & 4294967295L);
        fArr2[1] = Float.intBitsToFloat(i9) * fArr[pointIndex + 1];
        fArr2[2] = Float.intBitsToFloat(i8) * fArr[pointIndex2];
        fArr2[3] = Float.intBitsToFloat(i9) * fArr[pointIndex2 + 1];
        fArr2[4] = Float.intBitsToFloat(i8) * fArr[pointIndex3];
        fArr2[5] = Float.intBitsToFloat(i9) * fArr[pointIndex3 + 1];
        fArr2[6] = Float.intBitsToFloat(i8) * fArr[pointIndex4];
        fArr2[7] = Float.intBitsToFloat(i9) * fArr[pointIndex4 + 1];
    }

    @Override // androidx.compose.ui.graphics.MeshGradientRenderer
    public void draw(DrawScope drawScope, MeshGradientConfig meshGradientConfig) {
        int rows = meshGradientConfig.getRows();
        int columns = meshGradientConfig.getColumns();
        float[] positions = meshGradientConfig.getPositions();
        int[] colors = meshGradientConfig.getColors();
        float[] leftBezierOffsets = meshGradientConfig.getLeftBezierOffsets();
        float[] topBezierOffsets = meshGradientConfig.getTopBezierOffsets();
        float[] rightBezierOffsets = meshGradientConfig.getRightBezierOffsets();
        float[] bottomBezierOffsets = meshGradientConfig.getBottomBezierOffsets();
        boolean hasBicubicColor = meshGradientConfig.hasBicubicColor();
        long m5599calculateSubdivisions2kb6nC0 = m5599calculateSubdivisions2kb6nC0(rows, columns, positions, drawScope.mo5824getSizeNHjbRc());
        int i = (int) (m5599calculateSubdivisions2kb6nC0 >> 32);
        int i2 = (int) (m5599calculateSubdivisions2kb6nC0 & 4294967295L);
        int i3 = i * i2;
        if (this.indexBuffer == null || this.lastSubdivisionU != i || this.lastSubdivisionV != i2) {
            this.indexBuffer = new short[(i2 - 1) * (i - 1) * 6];
            int i4 = i * 4;
            this.forwardDifferenceRowResultsX = new float[i4];
            this.forwardDifferenceRowResultsY = new float[i4];
            this.colorForwardDifferenceRowResults = new float[i * 16];
            int i5 = i3 * 2;
            this.positionsBuffer = new float[i5];
            this.colorsBuffer = Build.VERSION.SDK_INT >= 29 ? new int[i3] : new int[i5];
            buildIndexBuffer(i, i2);
            precomputeBasisArrays(i2);
            this.lastSubdivisionU = i;
            this.lastSubdivisionV = i2;
        }
        short[] sArr = this.indexBuffer;
        sArr.getClass();
        float[] fArr = this.positionsBuffer;
        fArr.getClass();
        int[] iArr = this.colorsBuffer;
        iArr.getClass();
        int i6 = 0;
        for (int i7 = rows * columns; i6 < i7; i7 = i7) {
            int[] iArr2 = iArr;
            float[] fArr2 = positions;
            int i8 = rows;
            float[] fArr3 = fArr;
            boolean z = hasBicubicColor;
            short[] sArr2 = sArr;
            int i9 = columns;
            int i10 = i6;
            m5600drawPatchW8bZRI4(drawScope.getDrawContext().getCanvas(), i10, i8, i9, z, fArr2, colors, leftBezierOffsets, topBezierOffsets, rightBezierOffsets, bottomBezierOffsets, drawScope.mo5824getSizeNHjbRc(), i, i2, fArr3, iArr2, sArr2);
            rows = i8;
            columns = i9;
            positions = fArr2;
            i6 = i10 + 1;
            hasBicubicColor = z;
            fArr = fArr3;
            iArr = iArr2;
            sArr = sArr2;
        }
    }
}
