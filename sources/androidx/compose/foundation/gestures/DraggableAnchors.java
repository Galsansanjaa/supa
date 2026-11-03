package androidx.compose.foundation.gestures;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public interface DraggableAnchors<T> {
    T anchorAt(int i);

    T closestAnchor(float f);

    T closestAnchor(float f, boolean z);

    int getSize();

    boolean hasPositionFor(T t);

    float maxPosition();

    float minPosition();

    float positionAt(int i);

    float positionOf(T t);
}
