package androidx.compose.runtime.composer.linkbuffer;

import androidx.compose.runtime.Anchor;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class LinkAnchor implements Anchor {
    public static final int $stable = 8;
    private int address;

    public LinkAnchor(int i) {
        this.address = i;
    }

    public final int getAddress() {
        return this.address;
    }

    @Override // androidx.compose.runtime.Anchor
    public boolean getValid() {
        return this.address != -1;
    }

    public final void setAddress(int i) {
        this.address = i;
    }

    public String toString() {
        return super.toString() + "{ address: " + this.address + " }";
    }
}
