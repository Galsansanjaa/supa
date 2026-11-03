package androidx.window.embedding;

import defpackage.jh2;
import defpackage.lt;
import defpackage.sb0;
import defpackage.v5;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class EmbeddingAspectRatio {
    private final String description;
    private final float value;
    public static final Companion Companion = new Companion(null);
    public static final EmbeddingAspectRatio ALWAYS_ALLOW = new EmbeddingAspectRatio("ALWAYS_ALLOW", 0.0f);
    public static final EmbeddingAspectRatio ALWAYS_DISALLOW = new EmbeddingAspectRatio("ALWAYS_DISALLOW", -1.0f);

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        public final EmbeddingAspectRatio buildAspectRatioFromValue$window_release(float f) {
            EmbeddingAspectRatio embeddingAspectRatio = EmbeddingAspectRatio.ALWAYS_ALLOW;
            if (f == embeddingAspectRatio.getValue$window_release()) {
                return embeddingAspectRatio;
            }
            EmbeddingAspectRatio embeddingAspectRatio2 = EmbeddingAspectRatio.ALWAYS_DISALLOW;
            return f == embeddingAspectRatio2.getValue$window_release() ? embeddingAspectRatio2 : ratio(f);
        }

        public final EmbeddingAspectRatio ratio(float f) {
            sb0 sb0Var = null;
            if (f <= 1.0f) {
                v5.m("Ratio must be greater than 1.");
                return null;
            }
            return new EmbeddingAspectRatio("ratio:" + f, f, sb0Var);
        }
    }

    private EmbeddingAspectRatio(String str, float f) {
        this.description = str;
        this.value = f;
    }

    public /* synthetic */ EmbeddingAspectRatio(String str, float f, sb0 sb0Var) {
        this(str, f);
    }

    public static final EmbeddingAspectRatio ratio(float f) {
        return Companion.ratio(f);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EmbeddingAspectRatio)) {
            return false;
        }
        EmbeddingAspectRatio embeddingAspectRatio = (EmbeddingAspectRatio) obj;
        return this.value == embeddingAspectRatio.value && jh2.k(this.description, embeddingAspectRatio.description);
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
        return lt.z(new StringBuilder("EmbeddingAspectRatio("), this.description, ')');
    }
}
