package androidx.compose.foundation.text.selection;

import androidx.collection.LongObjectMap;
import androidx.compose.ui.layout.LayoutCoordinates;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public interface SelectionRegistrar {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final long InvalidSelectableId = 0;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final long InvalidSelectableId = 0;

        private Companion() {
        }
    }

    LongObjectMap<Selection> getSubselections();

    long nextSelectableId();

    void notifyPositionChange(long j);

    void notifySelectableChange(long j);

    /* renamed from: notifySelectionUpdate-njBpvok, reason: not valid java name */
    boolean mo2165notifySelectionUpdatenjBpvok(LayoutCoordinates layoutCoordinates, long j, long j2, boolean z, SelectionAdjustment selectionAdjustment, boolean z2);

    void notifySelectionUpdateEnd();

    void notifySelectionUpdateSelectAll(long j, boolean z);

    /* renamed from: notifySelectionUpdateStart-ubNVwUQ, reason: not valid java name */
    void mo2166notifySelectionUpdateStartubNVwUQ(LayoutCoordinates layoutCoordinates, long j, SelectionAdjustment selectionAdjustment, boolean z);

    Selectable subscribe(Selectable selectable);

    void unsubscribe(Selectable selectable);
}
