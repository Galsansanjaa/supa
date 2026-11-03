package androidx.compose.foundation.content;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public interface ReceiveContentListener {
    void onDragEnd();

    void onDragEnter();

    void onDragExit();

    void onDragStart();

    TransferableContent onReceive(TransferableContent transferableContent);
}
