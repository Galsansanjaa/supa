package androidx.core.text;

import android.os.Build;
import android.text.Html;
import android.text.Spanned;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class HtmlCompat {
    public static final int FROM_HTML_MODE_COMPACT = 63;
    public static final int FROM_HTML_MODE_LEGACY = 0;
    public static final int FROM_HTML_OPTION_USE_CSS_COLORS = 256;
    public static final int FROM_HTML_SEPARATOR_LINE_BREAK_BLOCKQUOTE = 32;
    public static final int FROM_HTML_SEPARATOR_LINE_BREAK_DIV = 16;
    public static final int FROM_HTML_SEPARATOR_LINE_BREAK_HEADING = 2;
    public static final int FROM_HTML_SEPARATOR_LINE_BREAK_LIST = 8;
    public static final int FROM_HTML_SEPARATOR_LINE_BREAK_LIST_ITEM = 4;
    public static final int FROM_HTML_SEPARATOR_LINE_BREAK_PARAGRAPH = 1;
    public static final int TO_HTML_PARAGRAPH_LINES_CONSECUTIVE = 0;
    public static final int TO_HTML_PARAGRAPH_LINES_INDIVIDUAL = 1;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static class Api24Impl {
        private Api24Impl() {
        }

        public static Spanned fromHtml(String str, int i) {
            return Html.fromHtml(str, i);
        }

        public static Spanned fromHtml(String str, int i, Html.ImageGetter imageGetter, Html.TagHandler tagHandler) {
            return Html.fromHtml(str, i, imageGetter, tagHandler);
        }

        public static String toHtml(Spanned spanned, int i) {
            return Html.toHtml(spanned, i);
        }
    }

    private HtmlCompat() {
    }

    public static Spanned fromHtml(String str, int i) {
        return Build.VERSION.SDK_INT >= 24 ? Api24Impl.fromHtml(str, i) : Html.fromHtml(str);
    }

    public static Spanned fromHtml(String str, int i, Html.ImageGetter imageGetter, Html.TagHandler tagHandler) {
        return Build.VERSION.SDK_INT >= 24 ? Api24Impl.fromHtml(str, i, imageGetter, tagHandler) : Html.fromHtml(str, imageGetter, tagHandler);
    }

    public static String toHtml(Spanned spanned, int i) {
        return Build.VERSION.SDK_INT >= 24 ? Api24Impl.toHtml(spanned, i) : Html.toHtml(spanned);
    }
}
