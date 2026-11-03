package androidx.compose.foundation.text.selection;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public interface MouseSelectionObserver {
    /* renamed from: onDrag-3MmeM6k */
    boolean mo2024onDrag3MmeM6k(long j, SelectionAdjustment selectionAdjustment);

    void onDragDone();

    /* renamed from: onExtend-k-4lQ0M */
    boolean mo2025onExtendk4lQ0M(long j);

    /* renamed from: onExtendDrag-k-4lQ0M */
    boolean mo2026onExtendDragk4lQ0M(long j);

    /* renamed from: onStart-9KIMszo */
    boolean mo2027onStart9KIMszo(long j, SelectionAdjustment selectionAdjustment, int i);
}
