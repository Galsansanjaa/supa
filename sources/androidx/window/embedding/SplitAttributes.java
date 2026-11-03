package androidx.window.embedding;

import androidx.window.core.SpecificationComputer;
import androidx.window.core.VerificationMode;
import androidx.window.embedding.EmbeddingAnimationParams;
import defpackage.jh2;
import defpackage.lt;
import defpackage.rp1;
import defpackage.sb0;
import defpackage.v5;
import defpackage.wd;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class SplitAttributes {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "SplitAttributes";
    private final EmbeddingAnimationParams animationParams;
    private final DividerAttributes dividerAttributes;
    private final LayoutDirection layoutDirection;
    private final SplitType splitType;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes4.dex */
    public static final class Builder {
        private EmbeddingAnimationParams animationParams;
        private DividerAttributes dividerAttributes;
        private LayoutDirection layoutDirection;
        private SplitType splitType;

        public Builder() {
            this.splitType = SplitType.SPLIT_TYPE_EQUAL;
            this.layoutDirection = LayoutDirection.LOCALE;
            this.animationParams = new EmbeddingAnimationParams.Builder().build();
            this.dividerAttributes = DividerAttributes.NO_DIVIDER;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(SplitAttributes splitAttributes) {
            this();
            splitAttributes.getClass();
            setSplitType(splitAttributes.getSplitType()).setLayoutDirection(splitAttributes.getLayoutDirection()).setAnimationParams(splitAttributes.getAnimationParams()).setDividerAttributes(splitAttributes.getDividerAttributes());
        }

        public final SplitAttributes build() {
            return new SplitAttributes(this.splitType, this.layoutDirection, this.animationParams, this.dividerAttributes, null);
        }

        public final Builder setAnimationParams(EmbeddingAnimationParams embeddingAnimationParams) {
            embeddingAnimationParams.getClass();
            this.animationParams = embeddingAnimationParams;
            return this;
        }

        public final Builder setDividerAttributes(DividerAttributes dividerAttributes) {
            dividerAttributes.getClass();
            this.dividerAttributes = dividerAttributes;
            return this;
        }

        public final Builder setLayoutDirection(LayoutDirection layoutDirection) {
            layoutDirection.getClass();
            this.layoutDirection = layoutDirection;
            return this;
        }

        public final Builder setSplitType(SplitType splitType) {
            splitType.getClass();
            this.splitType = splitType;
            return this;
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes4.dex */
    public static final class LayoutDirection {
        private final String description;
        private final int value;
        public static final Companion Companion = new Companion(null);
        public static final LayoutDirection LOCALE = new LayoutDirection("LOCALE", 0);
        public static final LayoutDirection LEFT_TO_RIGHT = new LayoutDirection("LEFT_TO_RIGHT", 1);
        public static final LayoutDirection RIGHT_TO_LEFT = new LayoutDirection("RIGHT_TO_LEFT", 2);
        public static final LayoutDirection TOP_TO_BOTTOM = new LayoutDirection("TOP_TO_BOTTOM", 3);
        public static final LayoutDirection BOTTOM_TO_TOP = new LayoutDirection("BOTTOM_TO_TOP", 4);

        /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
        /* loaded from: classes4.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(sb0 sb0Var) {
                this();
            }

            public final LayoutDirection getLayoutDirectionFromValue$window_release(int i) {
                LayoutDirection layoutDirection = LayoutDirection.LEFT_TO_RIGHT;
                if (i == layoutDirection.getValue$window_release()) {
                    return layoutDirection;
                }
                LayoutDirection layoutDirection2 = LayoutDirection.RIGHT_TO_LEFT;
                if (i == layoutDirection2.getValue$window_release()) {
                    return layoutDirection2;
                }
                LayoutDirection layoutDirection3 = LayoutDirection.LOCALE;
                if (i == layoutDirection3.getValue$window_release()) {
                    return layoutDirection3;
                }
                LayoutDirection layoutDirection4 = LayoutDirection.TOP_TO_BOTTOM;
                if (i == layoutDirection4.getValue$window_release()) {
                    return layoutDirection4;
                }
                LayoutDirection layoutDirection5 = LayoutDirection.BOTTOM_TO_TOP;
                if (i == layoutDirection5.getValue$window_release()) {
                    return layoutDirection5;
                }
                v5.m(lt.w(i, "Undefined value:"));
                return null;
            }
        }

        private LayoutDirection(String str, int i) {
            this.description = str;
            this.value = i;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LayoutDirection)) {
                return false;
            }
            LayoutDirection layoutDirection = (LayoutDirection) obj;
            return jh2.k(this.description, layoutDirection.description) && this.value == layoutDirection.value;
        }

        public final int getValue$window_release() {
            return this.value;
        }

        public int hashCode() {
            return (this.description.hashCode() * 31) + this.value;
        }

        public String toString() {
            return this.description;
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes4.dex */
    public static final class SplitType {
        public static final Companion Companion;
        public static final SplitType SPLIT_TYPE_EQUAL;
        public static final SplitType SPLIT_TYPE_EXPAND;
        public static final SplitType SPLIT_TYPE_HINGE;
        private final String description;
        private final float value;

        /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
        /* loaded from: classes4.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(sb0 sb0Var) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final boolean ratio$lambda$0(float f, float f2) {
                double d = f;
                return 0.0d <= d && d <= 1.0d && !wd.b0(Float.valueOf(f), new Float[]{Float.valueOf(0.0f), Float.valueOf(1.0f)});
            }

            public final SplitType buildSplitTypeFromValue$window_release(float f) {
                SplitType splitType = SplitType.SPLIT_TYPE_EXPAND;
                return f == splitType.getValue$window_release() ? splitType : ratio(f);
            }

            public final SplitType ratio(float f) {
                SpecificationComputer.Companion companion = SpecificationComputer.Companion;
                Float valueOf = Float.valueOf(f);
                String str = SplitAttributes.TAG;
                str.getClass();
                Object compute = SpecificationComputer.Companion.startSpecification$default(companion, valueOf, str, VerificationMode.STRICT, null, 4, null).require("Ratio must be in range (0.0, 1.0). Use SplitType.expandContainers() instead of 0 or 1.", new rp1(f, 2)).compute();
                compute.getClass();
                float floatValue = ((Number) compute).floatValue();
                return new SplitType("ratio:" + floatValue, floatValue);
            }
        }

        static {
            Companion companion = new Companion(null);
            Companion = companion;
            SPLIT_TYPE_EXPAND = new SplitType("expandContainers", 0.0f);
            SPLIT_TYPE_EQUAL = companion.ratio(0.5f);
            SPLIT_TYPE_HINGE = new SplitType("hinge", -1.0f);
        }

        public SplitType(String str, float f) {
            str.getClass();
            this.description = str;
            this.value = f;
        }

        public static final SplitType ratio(float f) {
            return Companion.ratio(f);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SplitType)) {
                return false;
            }
            SplitType splitType = (SplitType) obj;
            return this.value == splitType.value && jh2.k(this.description, splitType.description);
        }

        public final String getDescription$window_release() {
            return this.description;
        }

        public final float getValue$window_release() {
            return this.value;
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.value) * 31) + this.description.hashCode();
        }

        public String toString() {
            return this.description;
        }
    }

    private SplitAttributes(SplitType splitType, LayoutDirection layoutDirection, EmbeddingAnimationParams embeddingAnimationParams, DividerAttributes dividerAttributes) {
        this.splitType = splitType;
        this.layoutDirection = layoutDirection;
        this.animationParams = embeddingAnimationParams;
        this.dividerAttributes = dividerAttributes;
    }

    public /* synthetic */ SplitAttributes(SplitType splitType, LayoutDirection layoutDirection, EmbeddingAnimationParams embeddingAnimationParams, DividerAttributes dividerAttributes, int i, sb0 sb0Var) {
        this((i & 1) != 0 ? SplitType.SPLIT_TYPE_EQUAL : splitType, (i & 2) != 0 ? LayoutDirection.LOCALE : layoutDirection, (i & 4) != 0 ? new EmbeddingAnimationParams.Builder().build() : embeddingAnimationParams, (i & 8) != 0 ? DividerAttributes.NO_DIVIDER : dividerAttributes);
    }

    public /* synthetic */ SplitAttributes(SplitType splitType, LayoutDirection layoutDirection, EmbeddingAnimationParams embeddingAnimationParams, DividerAttributes dividerAttributes, sb0 sb0Var) {
        this(splitType, layoutDirection, embeddingAnimationParams, dividerAttributes);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplitAttributes)) {
            return false;
        }
        SplitAttributes splitAttributes = (SplitAttributes) obj;
        return jh2.k(this.splitType, splitAttributes.splitType) && jh2.k(this.layoutDirection, splitAttributes.layoutDirection) && jh2.k(this.animationParams, splitAttributes.animationParams) && jh2.k(this.dividerAttributes, splitAttributes.dividerAttributes);
    }

    public final EmbeddingAnimationParams getAnimationParams() {
        return this.animationParams;
    }

    public final DividerAttributes getDividerAttributes() {
        return this.dividerAttributes;
    }

    public final LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    public final SplitType getSplitType() {
        return this.splitType;
    }

    public int hashCode() {
        return this.dividerAttributes.hashCode() + ((this.animationParams.hashCode() + ((this.layoutDirection.hashCode() + (this.splitType.hashCode() * 31)) * 31)) * 31);
    }

    public String toString() {
        return "SplitAttributes:{splitType=" + this.splitType + ", layoutDir=" + this.layoutDirection + ", animationParams=" + this.animationParams + ", dividerAttributes=" + this.dividerAttributes + " }";
    }
}
