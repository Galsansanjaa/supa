package androidx.compose.foundation.layout;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public interface FlexBoxConfig {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class Companion implements FlexBoxConfig {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @Override // androidx.compose.foundation.layout.FlexBoxConfig
        public void configure(FlexBoxConfigScope flexBoxConfigScope) {
        }

        @Override // androidx.compose.foundation.layout.FlexBoxConfig
        public FlexBoxConfig then(FlexBoxConfig flexBoxConfig) {
            return flexBoxConfig;
        }
    }

    void configure(FlexBoxConfigScope flexBoxConfigScope);

    FlexBoxConfig then(FlexBoxConfig flexBoxConfig);
}
