package androidx.compose.ui.autofill;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public interface ContentDataType {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final ContentDataType None = ContentDataType_androidKt.ContentDataType(0);
        private static final ContentDataType Text = ContentDataType_androidKt.ContentDataType(1);
        private static final ContentDataType List = ContentDataType_androidKt.ContentDataType(3);
        private static final ContentDataType Date = ContentDataType_androidKt.ContentDataType(4);
        private static final ContentDataType Toggle = ContentDataType_androidKt.ContentDataType(2);

        private Companion() {
        }

        public final ContentDataType getDate() {
            return Date;
        }

        public final ContentDataType getList() {
            return List;
        }

        public final ContentDataType getNone() {
            return None;
        }

        public final ContentDataType getText() {
            return Text;
        }

        public final ContentDataType getToggle() {
            return Toggle;
        }
    }
}
