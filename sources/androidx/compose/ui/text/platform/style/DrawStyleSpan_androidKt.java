package androidx.compose.ui.text.platform.style;

import android.graphics.Paint;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class DrawStyleSpan_androidKt {
    /* renamed from: toAndroidCap-BeK7IIE, reason: not valid java name */
    public static final Paint.Cap m7797toAndroidCapBeK7IIE(int i) {
        StrokeCap.Companion companion = StrokeCap.Companion;
        return StrokeCap.m5701equalsimpl0(i, companion.m5705getButtKaPHkGw()) ? Paint.Cap.BUTT : StrokeCap.m5701equalsimpl0(i, companion.m5706getRoundKaPHkGw()) ? Paint.Cap.ROUND : StrokeCap.m5701equalsimpl0(i, companion.m5707getSquareKaPHkGw()) ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
    }

    /* renamed from: toAndroidJoin-Ww9F2mQ, reason: not valid java name */
    public static final Paint.Join m7798toAndroidJoinWw9F2mQ(int i) {
        StrokeJoin.Companion companion = StrokeJoin.Companion;
        return StrokeJoin.m5711equalsimpl0(i, companion.m5716getMiterLxFBmk8()) ? Paint.Join.MITER : StrokeJoin.m5711equalsimpl0(i, companion.m5717getRoundLxFBmk8()) ? Paint.Join.ROUND : StrokeJoin.m5711equalsimpl0(i, companion.m5715getBevelLxFBmk8()) ? Paint.Join.BEVEL : Paint.Join.MITER;
    }
}
