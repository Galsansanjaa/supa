package androidx.compose.ui.graphics.shadow;

import androidx.collection.MutableScatterMap;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.jh2;
import defpackage.sb0;
import defpackage.yo0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class AndroidShadowContext implements PlatformShadowContext, DropShadowRendererProvider, InnerShadowRendererProvider {
    private MutableScatterMap<ShadowKey, DropShadowRenderer> dropShadowCache;
    private MutableScatterMap<ShadowKey, InnerShadowRenderer> innerShadowCache;
    private ShadowKey shadowKey;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class ShadowKey {
        public static final int $stable = 8;
        private float density;
        private LayoutDirection layoutDirection;
        private Shadow shadow;
        private Shape shape;
        private long size;

        private ShadowKey(Shape shape, long j, LayoutDirection layoutDirection, float f, Shadow shadow) {
            this.shape = shape;
            this.size = j;
            this.layoutDirection = layoutDirection;
            this.density = f;
            this.shadow = shadow;
        }

        public /* synthetic */ ShadowKey(Shape shape, long j, LayoutDirection layoutDirection, float f, Shadow shadow, int i, sb0 sb0Var) {
            this((i & 1) != 0 ? RectangleShapeKt.getRectangleShape() : shape, (i & 2) != 0 ? Size.Companion.m5168getZeroNHjbRc() : j, (i & 4) != 0 ? LayoutDirection.Ltr : layoutDirection, (i & 8) != 0 ? 1.0f : f, (i & 16) != 0 ? null : shadow, null);
        }

        public /* synthetic */ ShadowKey(Shape shape, long j, LayoutDirection layoutDirection, float f, Shadow shadow, sb0 sb0Var) {
            this(shape, j, layoutDirection, f, shadow);
        }

        /* renamed from: copy-eZhPAX0$default, reason: not valid java name */
        public static /* synthetic */ ShadowKey m5977copyeZhPAX0$default(ShadowKey shadowKey, Shape shape, long j, LayoutDirection layoutDirection, float f, Shadow shadow, int i, Object obj) {
            if ((i & 1) != 0) {
                shape = shadowKey.shape;
            }
            if ((i & 2) != 0) {
                j = shadowKey.size;
            }
            if ((i & 4) != 0) {
                layoutDirection = shadowKey.layoutDirection;
            }
            if ((i & 8) != 0) {
                f = shadowKey.density;
            }
            if ((i & 16) != 0) {
                shadow = shadowKey.shadow;
            }
            Shadow shadow2 = shadow;
            LayoutDirection layoutDirection2 = layoutDirection;
            return shadowKey.m5979copyeZhPAX0(shape, j, layoutDirection2, f, shadow2);
        }

        public final Shape component1() {
            return this.shape;
        }

        /* renamed from: component2-NH-jbRc, reason: not valid java name */
        public final long m5978component2NHjbRc() {
            return this.size;
        }

        public final LayoutDirection component3() {
            return this.layoutDirection;
        }

        public final float component4() {
            return this.density;
        }

        public final Shadow component5() {
            return this.shadow;
        }

        /* renamed from: copy-eZhPAX0, reason: not valid java name */
        public final ShadowKey m5979copyeZhPAX0(Shape shape, long j, LayoutDirection layoutDirection, float f, Shadow shadow) {
            return new ShadowKey(shape, j, layoutDirection, f, shadow, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShadowKey)) {
                return false;
            }
            ShadowKey shadowKey = (ShadowKey) obj;
            return jh2.k(this.shape, shadowKey.shape) && Size.m5155equalsimpl0(this.size, shadowKey.size) && this.layoutDirection == shadowKey.layoutDirection && Float.compare(this.density, shadowKey.density) == 0 && jh2.k(this.shadow, shadowKey.shadow);
        }

        public final float getDensity() {
            return this.density;
        }

        public final LayoutDirection getLayoutDirection() {
            return this.layoutDirection;
        }

        public final Shadow getShadow() {
            return this.shadow;
        }

        public final Shape getShape() {
            return this.shape;
        }

        /* renamed from: getSize-NH-jbRc, reason: not valid java name */
        public final long m5980getSizeNHjbRc() {
            return this.size;
        }

        public int hashCode() {
            int i = yo0.i(this.density, (this.layoutDirection.hashCode() + ((Size.m5160hashCodeimpl(this.size) + (this.shape.hashCode() * 31)) * 31)) * 31, 31);
            Shadow shadow = this.shadow;
            return i + (shadow == null ? 0 : shadow.hashCode());
        }

        public final void setDensity(float f) {
            this.density = f;
        }

        public final void setLayoutDirection(LayoutDirection layoutDirection) {
            this.layoutDirection = layoutDirection;
        }

        public final void setShadow(Shadow shadow) {
            this.shadow = shadow;
        }

        public final void setShape(Shape shape) {
            this.shape = shape;
        }

        /* renamed from: setSize-uvyYCjk, reason: not valid java name */
        public final void m5981setSizeuvyYCjk(long j) {
            this.size = j;
        }

        public String toString() {
            return "ShadowKey(shape=" + this.shape + ", size=" + Size.m5163toStringimpl(this.size) + ", layoutDirection=" + this.layoutDirection + ", density=" + this.density + ", shadow=" + this.shadow + ")";
        }
    }

    private final MutableScatterMap<ShadowKey, DropShadowRenderer> obtainDropShadowCache() {
        MutableScatterMap<ShadowKey, DropShadowRenderer> mutableScatterMap = this.dropShadowCache;
        if (mutableScatterMap != null) {
            return mutableScatterMap;
        }
        MutableScatterMap<ShadowKey, DropShadowRenderer> mutableScatterMap2 = new MutableScatterMap<>(0, 1, null);
        this.dropShadowCache = mutableScatterMap2;
        return mutableScatterMap2;
    }

    private final MutableScatterMap<ShadowKey, InnerShadowRenderer> obtainInnerShadowCache() {
        MutableScatterMap<ShadowKey, InnerShadowRenderer> mutableScatterMap = this.innerShadowCache;
        if (mutableScatterMap != null) {
            return mutableScatterMap;
        }
        MutableScatterMap<ShadowKey, InnerShadowRenderer> mutableScatterMap2 = new MutableScatterMap<>(0, 1, null);
        this.innerShadowCache = mutableScatterMap2;
        return mutableScatterMap2;
    }

    private final ShadowKey obtainShadowKey() {
        ShadowKey shadowKey = this.shadowKey;
        if (shadowKey != null) {
            return shadowKey;
        }
        ShadowKey shadowKey2 = new ShadowKey(null, 0L, null, 0.0f, null, 31, null);
        this.shadowKey = shadowKey2;
        return shadowKey2;
    }

    @Override // androidx.compose.ui.graphics.shadow.ShadowContext
    public void clearCache() {
        synchronized (this) {
            try {
                MutableScatterMap<ShadowKey, DropShadowRenderer> mutableScatterMap = this.dropShadowCache;
                if (mutableScatterMap != null) {
                    mutableScatterMap.clear();
                }
                MutableScatterMap<ShadowKey, InnerShadowRenderer> mutableScatterMap2 = this.innerShadowCache;
                if (mutableScatterMap2 != null) {
                    mutableScatterMap2.clear();
                }
                this.shadowKey = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.compose.ui.graphics.shadow.ShadowContext
    public DropShadowPainter createDropShadowPainter(Shape shape, Shadow shadow) {
        return new DropShadowPainter(shape, shadow, this);
    }

    @Override // androidx.compose.ui.graphics.shadow.ShadowContext
    public InnerShadowPainter createInnerShadowPainter(Shape shape, Shadow shadow) {
        return new InnerShadowPainter(shape, shadow, this);
    }

    @Override // androidx.compose.ui.graphics.shadow.DropShadowRendererProvider
    /* renamed from: obtainDropShadowRenderer-eZhPAX0, reason: not valid java name */
    public DropShadowRenderer mo5975obtainDropShadowRenderereZhPAX0(Shape shape, long j, LayoutDirection layoutDirection, Density density, Shadow shadow) {
        DropShadowRenderer dropShadowRenderer;
        synchronized (this) {
            ShadowKey obtainShadowKey = obtainShadowKey();
            obtainShadowKey.setShape(shape);
            obtainShadowKey.m5981setSizeuvyYCjk(j);
            obtainShadowKey.setLayoutDirection(layoutDirection);
            obtainShadowKey.setDensity(density.getDensity());
            obtainShadowKey.setShadow(shadow.copyWithoutOffset$ui_graphics());
            dropShadowRenderer = obtainDropShadowCache().get(obtainShadowKey);
            if (dropShadowRenderer == null) {
                DropShadowRenderer dropShadowRenderer2 = new DropShadowRenderer(shadow, shape.mo385createOutlinePq9zytI(j, layoutDirection, density));
                obtainDropShadowCache().set(ShadowKey.m5977copyeZhPAX0$default(obtainShadowKey, null, 0L, null, 0.0f, null, 31, null), dropShadowRenderer2);
                dropShadowRenderer = dropShadowRenderer2;
            }
        }
        return dropShadowRenderer;
    }

    @Override // androidx.compose.ui.graphics.shadow.InnerShadowRendererProvider
    /* renamed from: obtainInnerShadowRenderer-eZhPAX0, reason: not valid java name */
    public InnerShadowRenderer mo5976obtainInnerShadowRenderereZhPAX0(Shape shape, long j, LayoutDirection layoutDirection, Density density, Shadow shadow) {
        InnerShadowRenderer innerShadowRenderer;
        synchronized (this) {
            ShadowKey obtainShadowKey = obtainShadowKey();
            obtainShadowKey.setShape(shape);
            obtainShadowKey.m5981setSizeuvyYCjk(j);
            obtainShadowKey.setLayoutDirection(layoutDirection);
            obtainShadowKey.setDensity(density.getDensity());
            obtainShadowKey.setShadow(shadow);
            innerShadowRenderer = obtainInnerShadowCache().get(obtainShadowKey);
            if (innerShadowRenderer == null) {
                InnerShadowRenderer innerShadowRenderer2 = new InnerShadowRenderer(shadow, shape.mo385createOutlinePq9zytI(j, layoutDirection, density));
                obtainInnerShadowCache().set(ShadowKey.m5977copyeZhPAX0$default(obtainShadowKey, null, 0L, null, 0.0f, null, 31, null), innerShadowRenderer2);
                innerShadowRenderer = innerShadowRenderer2;
            }
        }
        return innerShadowRenderer;
    }
}
