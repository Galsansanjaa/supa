package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.selection.SelectionManagerKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import defpackage.os0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class MathUtilsKt {
    public static final int addExactOrElse(int i, int i2, os0 os0Var) {
        int i3 = i + i2;
        return ((i ^ i3) & (i2 ^ i3)) < 0 ? ((Number) os0Var.invoke()).intValue() : i3;
    }

    /* renamed from: distanceSquaredToClosestCornerFromOutside-3MmeM6k, reason: not valid java name */
    private static final float m1898distanceSquaredToClosestCornerFromOutside3MmeM6k(long j, Rect rect) {
        if (SelectionManagerKt.m2157containsInclusiveUv8p0NA(rect, j)) {
            return 0.0f;
        }
        float m5089getDistanceSquaredimpl = Offset.m5089getDistanceSquaredimpl(Offset.m5094minusMKHz9U(rect.m5125getTopLeftF1C5BW0(), j));
        if (m5089getDistanceSquaredimpl >= Float.MAX_VALUE) {
            m5089getDistanceSquaredimpl = Float.MAX_VALUE;
        }
        float m5089getDistanceSquaredimpl2 = Offset.m5089getDistanceSquaredimpl(Offset.m5094minusMKHz9U(rect.m5126getTopRightF1C5BW0(), j));
        if (m5089getDistanceSquaredimpl2 < m5089getDistanceSquaredimpl) {
            m5089getDistanceSquaredimpl = m5089getDistanceSquaredimpl2;
        }
        float m5089getDistanceSquaredimpl3 = Offset.m5089getDistanceSquaredimpl(Offset.m5094minusMKHz9U(rect.m5118getBottomLeftF1C5BW0(), j));
        if (m5089getDistanceSquaredimpl3 < m5089getDistanceSquaredimpl) {
            m5089getDistanceSquaredimpl = m5089getDistanceSquaredimpl3;
        }
        float m5089getDistanceSquaredimpl4 = Offset.m5089getDistanceSquaredimpl(Offset.m5094minusMKHz9U(rect.m5119getBottomRightF1C5BW0(), j));
        return m5089getDistanceSquaredimpl4 < m5089getDistanceSquaredimpl ? m5089getDistanceSquaredimpl4 : m5089getDistanceSquaredimpl;
    }

    /* renamed from: findClosestRect-9KIMszo, reason: not valid java name */
    public static final int m1899findClosestRect9KIMszo(long j, Rect rect, Rect rect2) {
        float m1898distanceSquaredToClosestCornerFromOutside3MmeM6k = m1898distanceSquaredToClosestCornerFromOutside3MmeM6k(j, rect);
        float m1898distanceSquaredToClosestCornerFromOutside3MmeM6k2 = m1898distanceSquaredToClosestCornerFromOutside3MmeM6k(j, rect2);
        if (m1898distanceSquaredToClosestCornerFromOutside3MmeM6k == m1898distanceSquaredToClosestCornerFromOutside3MmeM6k2) {
            return 0;
        }
        return m1898distanceSquaredToClosestCornerFromOutside3MmeM6k < m1898distanceSquaredToClosestCornerFromOutside3MmeM6k2 ? -1 : 1;
    }

    public static final int subtractExactOrElse(int i, int i2, os0 os0Var) {
        int i3 = i - i2;
        return ((i ^ i3) & (i2 ^ i)) < 0 ? ((Number) os0Var.invoke()).intValue() : i3;
    }
}
