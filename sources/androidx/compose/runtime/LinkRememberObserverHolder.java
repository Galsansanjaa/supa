package androidx.compose.runtime;

import androidx.compose.runtime.composer.linkbuffer.LinkAnchor;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public class LinkRememberObserverHolder implements RememberObserverHolder {
    public static final int $stable = 8;
    private LinkAnchor after;
    private RememberObserver wrapped;

    public LinkRememberObserverHolder(RememberObserver rememberObserver, LinkAnchor linkAnchor) {
        this.wrapped = rememberObserver;
        this.after = linkAnchor;
    }

    public final LinkAnchor getAfter() {
        return this.after;
    }

    @Override // androidx.compose.runtime.RememberObserverHolder
    public RememberObserver getWrapped() {
        return this.wrapped;
    }

    public final void setAfter(LinkAnchor linkAnchor) {
        this.after = linkAnchor;
    }

    @Override // androidx.compose.runtime.RememberObserverHolder
    public void setWrapped(RememberObserver rememberObserver) {
        this.wrapped = rememberObserver;
    }
}
