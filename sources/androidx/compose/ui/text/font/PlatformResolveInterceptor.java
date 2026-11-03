package androidx.compose.ui.text.font;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public interface PlatformResolveInterceptor {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final PlatformResolveInterceptor Default = new PlatformResolveInterceptor() { // from class: androidx.compose.ui.text.font.PlatformResolveInterceptor$Companion$Default$1
            @Override // androidx.compose.ui.text.font.PlatformResolveInterceptor
            public final FontFamily interceptFontFamily(FontFamily fontFamily) {
                return fontFamily;
            }

            @Override // androidx.compose.ui.text.font.PlatformResolveInterceptor
            /* renamed from: interceptFontStyle-T2F_aPo */
            public final int mo7550interceptFontStyleT2F_aPo(int i) {
                return i;
            }

            @Override // androidx.compose.ui.text.font.PlatformResolveInterceptor
            /* renamed from: interceptFontSynthesis-Mscr08Y */
            public final int mo7551interceptFontSynthesisMscr08Y(int i) {
                return i;
            }

            @Override // androidx.compose.ui.text.font.PlatformResolveInterceptor
            public final FontWeight interceptFontWeight(FontWeight fontWeight) {
                return fontWeight;
            }
        };

        private Companion() {
        }

        public final PlatformResolveInterceptor getDefault$ui_text() {
            return Default;
        }
    }

    FontFamily interceptFontFamily(FontFamily fontFamily);

    /* renamed from: interceptFontStyle-T2F_aPo */
    int mo7550interceptFontStyleT2F_aPo(int i);

    /* renamed from: interceptFontSynthesis-Mscr08Y */
    int mo7551interceptFontSynthesisMscr08Y(int i);

    FontWeight interceptFontWeight(FontWeight fontWeight);
}
