package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.SelectionAdjustment;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public interface TextDragObserver {
    void onCancel();

    /* renamed from: onDown-k-4lQ0M, reason: not valid java name */
    void mo1651onDownk4lQ0M(long j);

    /* renamed from: onDrag-k-4lQ0M, reason: not valid java name */
    void mo1652onDragk4lQ0M(long j);

    /* renamed from: onStart-3MmeM6k, reason: not valid java name */
    void mo1653onStart3MmeM6k(long j, SelectionAdjustment selectionAdjustment);

    void onStop();

    void onUp();
}
