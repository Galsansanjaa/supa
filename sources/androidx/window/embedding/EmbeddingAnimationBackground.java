package androidx.window.embedding;

import android.graphics.Color;
import defpackage.sb0;
import defpackage.v5;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class EmbeddingAnimationBackground {
    public static final Companion Companion = new Companion(null);
    public static final EmbeddingAnimationBackground DEFAULT = new DefaultBackground();

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes4.dex */
    public static final class ColorBackground extends EmbeddingAnimationBackground {
        private final int color;

        public ColorBackground(int i) {
            super(null);
            this.color = i;
            if (Color.alpha(i) == 255) {
                return;
            }
            v5.m("Background color must be opaque");
            throw null;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof ColorBackground) && this.color == ((ColorBackground) obj).color;
        }

        public final int getColor() {
            return this.color;
        }

        public int hashCode() {
            return this.color;
        }

        public String toString() {
            return "ColorBackground{color:" + Integer.toHexString(this.color) + '}';
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

        public final EmbeddingAnimationBackground buildFromValue$window_release(int i) {
            return Color.alpha(i) != 255 ? EmbeddingAnimationBackground.DEFAULT : createColorBackground(i);
        }

        public final ColorBackground createColorBackground(int i) {
            return new ColorBackground(i);
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes4.dex */
    public static final class DefaultBackground extends EmbeddingAnimationBackground {
        public DefaultBackground() {
            super(null);
        }

        public int hashCode() {
            return toString().hashCode();
        }

        public String toString() {
            return "DefaultBackground";
        }
    }

    private EmbeddingAnimationBackground() {
    }

    public /* synthetic */ EmbeddingAnimationBackground(sb0 sb0Var) {
        this();
    }

    public static final ColorBackground createColorBackground(int i) {
        return Companion.createColorBackground(i);
    }
}
