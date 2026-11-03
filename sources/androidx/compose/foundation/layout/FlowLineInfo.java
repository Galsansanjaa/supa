package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Dp;
import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class FlowLineInfo {
    public static final int $stable = 8;
    private int lineIndex;
    private float maxCrossAxisSize;
    private float maxMainAxisSize;
    private int positionInLine;

    private FlowLineInfo(int i, int i2, float f, float f2) {
        this.lineIndex = i;
        this.positionInLine = i2;
        this.maxMainAxisSize = f;
        this.maxCrossAxisSize = f2;
    }

    public /* synthetic */ FlowLineInfo(int i, int i2, float f, float f2, int i3, sb0 sb0Var) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? Dp.m8049constructorimpl(0.0f) : f, (i3 & 8) != 0 ? Dp.m8049constructorimpl(0.0f) : f2, null);
    }

    public /* synthetic */ FlowLineInfo(int i, int i2, float f, float f2, sb0 sb0Var) {
        this(i, i2, f, f2);
    }

    public final int getLineIndex$foundation_layout() {
        return this.lineIndex;
    }

    /* renamed from: getMaxCrossAxisSize-D9Ej5fM$foundation_layout, reason: not valid java name */
    public final float m922getMaxCrossAxisSizeD9Ej5fM$foundation_layout() {
        return this.maxCrossAxisSize;
    }

    /* renamed from: getMaxMainAxisSize-D9Ej5fM$foundation_layout, reason: not valid java name */
    public final float m923getMaxMainAxisSizeD9Ej5fM$foundation_layout() {
        return this.maxMainAxisSize;
    }

    public final int getPositionInLine$foundation_layout() {
        return this.positionInLine;
    }

    public final void setLineIndex$foundation_layout(int i) {
        this.lineIndex = i;
    }

    /* renamed from: setMaxCrossAxisSize-0680j_4$foundation_layout, reason: not valid java name */
    public final void m924setMaxCrossAxisSize0680j_4$foundation_layout(float f) {
        this.maxCrossAxisSize = f;
    }

    /* renamed from: setMaxMainAxisSize-0680j_4$foundation_layout, reason: not valid java name */
    public final void m925setMaxMainAxisSize0680j_4$foundation_layout(float f) {
        this.maxMainAxisSize = f;
    }

    public final void setPositionInLine$foundation_layout(int i) {
        this.positionInLine = i;
    }

    /* renamed from: update-4j6BHR0$foundation_layout, reason: not valid java name */
    public final void m926update4j6BHR0$foundation_layout(int i, int i2, float f, float f2) {
        this.lineIndex = i;
        this.positionInLine = i2;
        this.maxMainAxisSize = f;
        this.maxCrossAxisSize = f2;
    }
}
