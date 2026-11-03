package androidx.compose.ui.text.font;

import defpackage.hd0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public interface Font {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final long MaximumAsyncTimeoutMillis = 15000;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final long MaximumAsyncTimeoutMillis = 15000;

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    @hd0
    /* loaded from: classes3.dex */
    public interface ResourceLoader {
        @hd0
        Object load(Font font);
    }

    /* renamed from: getLoadingStrategy-PKNRLFQ */
    int mo7543getLoadingStrategyPKNRLFQ();

    /* renamed from: getStyle-_-LCdwA */
    int mo7553getStyle_LCdwA();

    FontWeight getWeight();
}
