package androidx.window.embedding;

import android.graphics.Rect;
import defpackage.jh2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class EmbeddedActivityWindowInfo {
    private final Rect boundsInParentHost;
    private final boolean isEmbedded;
    private final Rect parentHostBounds;

    public EmbeddedActivityWindowInfo(boolean z, Rect rect, Rect rect2) {
        rect.getClass();
        rect2.getClass();
        this.isEmbedded = z;
        this.parentHostBounds = rect;
        this.boundsInParentHost = rect2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmbeddedActivityWindowInfo)) {
            return false;
        }
        EmbeddedActivityWindowInfo embeddedActivityWindowInfo = (EmbeddedActivityWindowInfo) obj;
        return this.isEmbedded == embeddedActivityWindowInfo.isEmbedded && jh2.k(this.parentHostBounds, embeddedActivityWindowInfo.parentHostBounds) && jh2.k(this.boundsInParentHost, embeddedActivityWindowInfo.boundsInParentHost);
    }

    public final Rect getBoundsInParentHost() {
        return this.boundsInParentHost;
    }

    public final Rect getParentHostBounds() {
        return this.parentHostBounds;
    }

    public int hashCode() {
        int i = this.isEmbedded ? 1231 : 1237;
        return this.boundsInParentHost.hashCode() + ((this.parentHostBounds.hashCode() + (i * 31)) * 31);
    }

    public final boolean isEmbedded() {
        return this.isEmbedded;
    }

    public String toString() {
        return "EmbeddedActivityWindowInfo{isEmbedded=" + this.isEmbedded + ", parentHostBounds=" + this.parentHostBounds + ", boundsInParentHost=" + this.boundsInParentHost + '}';
    }
}
