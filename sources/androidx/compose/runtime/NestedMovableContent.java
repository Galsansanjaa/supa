package androidx.compose.runtime;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class NestedMovableContent {
    private final MovableContentStateReference container;
    private final MovableContentStateReference content;

    public NestedMovableContent(MovableContentStateReference movableContentStateReference, MovableContentStateReference movableContentStateReference2) {
        this.content = movableContentStateReference;
        this.container = movableContentStateReference2;
    }

    public final MovableContentStateReference getContainer() {
        return this.container;
    }

    public final MovableContentStateReference getContent() {
        return this.content;
    }
}
