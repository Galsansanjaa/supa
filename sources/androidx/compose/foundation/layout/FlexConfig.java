package androidx.compose.foundation.layout;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public interface FlexConfig {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class Companion implements FlexConfig {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @Override // androidx.compose.foundation.layout.FlexConfig
        public void configure(FlexConfigScope flexConfigScope) {
        }

        @Override // androidx.compose.foundation.layout.FlexConfig
        public FlexConfig then(FlexConfig flexConfig) {
            return flexConfig;
        }
    }

    void configure(FlexConfigScope flexConfigScope);

    FlexConfig then(FlexConfig flexConfig);
}
