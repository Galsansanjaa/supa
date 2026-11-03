package androidx.window.embedding;

import defpackage.jh2;
import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class OverlayAttributes {
    private final EmbeddingBounds bounds;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes4.dex */
    public static final class Builder {
        private EmbeddingBounds bounds = EmbeddingBounds.BOUNDS_EXPANDED;

        public final OverlayAttributes build() {
            return new OverlayAttributes(this.bounds);
        }

        public final Builder setBounds(EmbeddingBounds embeddingBounds) {
            embeddingBounds.getClass();
            this.bounds = embeddingBounds;
            return this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OverlayAttributes() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public OverlayAttributes(EmbeddingBounds embeddingBounds) {
        embeddingBounds.getClass();
        this.bounds = embeddingBounds;
    }

    public /* synthetic */ OverlayAttributes(EmbeddingBounds embeddingBounds, int i, sb0 sb0Var) {
        this((i & 1) != 0 ? EmbeddingBounds.BOUNDS_EXPANDED : embeddingBounds);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OverlayAttributes) {
            return jh2.k(this.bounds, ((OverlayAttributes) obj).bounds);
        }
        return false;
    }

    public final EmbeddingBounds getBounds() {
        return this.bounds;
    }

    public int hashCode() {
        return this.bounds.hashCode();
    }

    public String toString() {
        return "OverlayAttributes: {bounds=" + this.bounds + '}';
    }
}
