package androidx.compose.material3;

import androidx.compose.ui.unit.Dp;
import defpackage.sb0;
import defpackage.vg1;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class TabPosition {
    public static final int $stable = 0;
    private final float contentWidth;
    private final float left;
    private final float width;

    private TabPosition(float f, float f2, float f3) {
        this.left = f;
        this.width = f2;
        this.contentWidth = f3;
    }

    public /* synthetic */ TabPosition(float f, float f2, float f3, sb0 sb0Var) {
        this(f, f2, f3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabPosition)) {
            return false;
        }
        TabPosition tabPosition = (TabPosition) obj;
        return Dp.m8054equalsimpl0(this.left, tabPosition.left) && Dp.m8054equalsimpl0(this.width, tabPosition.width) && Dp.m8054equalsimpl0(this.contentWidth, tabPosition.contentWidth);
    }

    /* renamed from: getContentWidth-D9Ej5fM, reason: not valid java name */
    public final float m3123getContentWidthD9Ej5fM() {
        return this.contentWidth;
    }

    /* renamed from: getLeft-D9Ej5fM, reason: not valid java name */
    public final float m3124getLeftD9Ej5fM() {
        return this.left;
    }

    /* renamed from: getRight-D9Ej5fM, reason: not valid java name */
    public final float m3125getRightD9Ej5fM() {
        return Dp.m8049constructorimpl(this.left + this.width);
    }

    /* renamed from: getWidth-D9Ej5fM, reason: not valid java name */
    public final float m3126getWidthD9Ej5fM() {
        return this.width;
    }

    public int hashCode() {
        return Dp.m8055hashCodeimpl(this.contentWidth) + vg1.t(this.width, Dp.m8055hashCodeimpl(this.left) * 31, 31);
    }

    public String toString() {
        return "TabPosition(left=" + ((Object) Dp.m8060toStringimpl(this.left)) + ", right=" + ((Object) Dp.m8060toStringimpl(m3125getRightD9Ej5fM())) + ", width=" + ((Object) Dp.m8060toStringimpl(this.width)) + ", contentWidth=" + ((Object) Dp.m8060toStringimpl(this.contentWidth)) + ')';
    }
}
