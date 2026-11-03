package androidx.compose.ui.node;

import defpackage.ej0;
import defpackage.nb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public interface TraversableNode extends DelegatableNode {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
        /* loaded from: classes3.dex */
        public static final class TraverseDescendantsAction {
            private static final /* synthetic */ ej0 $ENTRIES;
            private static final /* synthetic */ TraverseDescendantsAction[] $VALUES;
            public static final TraverseDescendantsAction ContinueTraversal = new TraverseDescendantsAction("ContinueTraversal", 0);
            public static final TraverseDescendantsAction SkipSubtreeAndContinueTraversal = new TraverseDescendantsAction("SkipSubtreeAndContinueTraversal", 1);
            public static final TraverseDescendantsAction CancelTraversal = new TraverseDescendantsAction("CancelTraversal", 2);

            private static final /* synthetic */ TraverseDescendantsAction[] $values() {
                return new TraverseDescendantsAction[]{ContinueTraversal, SkipSubtreeAndContinueTraversal, CancelTraversal};
            }

            static {
                TraverseDescendantsAction[] $values = $values();
                $VALUES = $values;
                $ENTRIES = nb0.s($values);
            }

            private TraverseDescendantsAction(String str, int i) {
            }

            public static ej0 getEntries() {
                return $ENTRIES;
            }

            public static TraverseDescendantsAction valueOf(String str) {
                return (TraverseDescendantsAction) Enum.valueOf(TraverseDescendantsAction.class, str);
            }

            public static TraverseDescendantsAction[] values() {
                return (TraverseDescendantsAction[]) $VALUES.clone();
            }
        }

        private Companion() {
        }
    }

    Object getTraverseKey();
}
