package androidx.compose.runtime.tooling;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public interface CompositionGroup extends CompositionData {

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static CompositionGroup find(CompositionGroup compositionGroup, Object obj) {
            return null;
        }

        @Deprecated
        public static int getGroupSize(CompositionGroup compositionGroup) {
            return 0;
        }

        @Deprecated
        public static Object getIdentity(CompositionGroup compositionGroup) {
            return null;
        }

        @Deprecated
        public static int getSlotsSize(CompositionGroup compositionGroup) {
            return 0;
        }
    }

    Iterable<Object> getData();

    int getGroupSize();

    Object getIdentity();

    Object getKey();

    Object getNode();

    int getSlotsSize();

    String getSourceInfo();
}
