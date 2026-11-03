package androidx.compose.runtime;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public interface CancellationHandle {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final CancellationHandle Empty = new Object();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void Empty$lambda$0() {
        }

        public final CancellationHandle getEmpty$runtime() {
            return Empty;
        }
    }

    void cancel();
}
