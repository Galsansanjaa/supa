package androidx.appcompat.text;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import android.text.style.TextAppearanceSpan;
import androidx.appcompat.R;
import androidx.appcompat.text.TextAppearanceSpanCompat;
import androidx.core.content.res.ResourcesCompat;
import defpackage.sb0;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class TextAppearanceSpanCompat extends MetricAffectingSpan {
    public static final Companion Companion = new Companion(null);
    private static final TextAppearanceSpanCompat$Companion$DEFAULT_FONT_FETCHER$1 DEFAULT_FONT_FETCHER = new Companion.FontFetcher() { // from class: androidx.appcompat.text.TextAppearanceSpanCompat$Companion$DEFAULT_FONT_FETCHER$1
        @Override // androidx.appcompat.text.TextAppearanceSpanCompat.Companion.FontFetcher
        public Typeface getCachedFont(Context context, int i) {
            context.getClass();
            return ResourcesCompat.getCachedFont(context, i);
        }

        @Override // androidx.appcompat.text.TextAppearanceSpanCompat.Companion.FontFetcher
        public Typeface getFont(Context context, int i) {
            context.getClass();
            return ResourcesCompat.getFont(context, i);
        }
    };
    private final AtomicReference<Typeface> appCompatTypeface;
    private final int fontResId;
    private final TextAppearanceSpan platformTextAppearanceSpan;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class Companion {

        /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
        /* loaded from: classes.dex */
        public interface FontFetcher {
            Typeface getCachedFont(Context context, int i);

            Typeface getFont(Context context, int i);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void createInternal$lambda$0(FontFetcher fontFetcher, Context context, int i, AtomicReference atomicReference, Runnable runnable) {
            context.getClass();
            Typeface font = fontFetcher.getFont(context, i);
            if (font != null) {
                atomicReference.set(font);
            }
            runnable.run();
        }

        private final int extractFontFamilyAttribute(Context context, int i) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, R.styleable.TextAppearance);
            obtainStyledAttributes.getClass();
            try {
                return obtainStyledAttributes.getResourceId(R.styleable.TextAppearance_android_fontFamily, -1);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }

        public final TextAppearanceSpanCompat create(Context context, int i, int i2, Executor executor, Runnable runnable) {
            context.getClass();
            executor.getClass();
            runnable.getClass();
            return createInternal$appcompat(context, i, i2, executor, runnable, TextAppearanceSpanCompat.DEFAULT_FONT_FETCHER);
        }

        public final TextAppearanceSpanCompat createInternal$appcompat(Context context, int i, int i2, Executor executor, final Runnable runnable, final FontFetcher fontFetcher) {
            context.getClass();
            executor.getClass();
            runnable.getClass();
            fontFetcher.getClass();
            final int extractFontFamilyAttribute = extractFontFamilyAttribute(context, i);
            if (extractFontFamilyAttribute == -1) {
                return new TextAppearanceSpanCompat(context, i, i2, extractFontFamilyAttribute, new AtomicReference(null), null);
            }
            Typeface cachedFont = fontFetcher.getCachedFont(context, extractFontFamilyAttribute);
            if (cachedFont != null) {
                return new TextAppearanceSpanCompat(context, i, i2, extractFontFamilyAttribute, new AtomicReference(cachedFont), null);
            }
            final AtomicReference atomicReference = new AtomicReference(null);
            final Context applicationContext = context.getApplicationContext();
            executor.execute(new Runnable() { // from class: gp2
                @Override // java.lang.Runnable
                public final void run() {
                    TextAppearanceSpanCompat.Companion.createInternal$lambda$0(TextAppearanceSpanCompat.Companion.FontFetcher.this, applicationContext, extractFontFamilyAttribute, atomicReference, runnable);
                }
            });
            return new TextAppearanceSpanCompat(context, i, i2, extractFontFamilyAttribute, atomicReference, null);
        }
    }

    private TextAppearanceSpanCompat(Context context, int i, int i2, int i3, AtomicReference<Typeface> atomicReference) {
        this.fontResId = i3;
        this.appCompatTypeface = atomicReference;
        this.platformTextAppearanceSpan = new TextAppearanceSpan(context, i, i2);
    }

    public /* synthetic */ TextAppearanceSpanCompat(Context context, int i, int i2, int i3, AtomicReference atomicReference, sb0 sb0Var) {
        this(context, i, i2, i3, atomicReference);
    }

    public static final TextAppearanceSpanCompat create(Context context, int i, int i2, Executor executor, Runnable runnable) {
        return Companion.create(context, i, i2, executor, runnable);
    }

    private final void updateTypefaceIfNecessary(Paint paint) {
        Typeface typeface;
        if (paint == null || this.fontResId == -1) {
            return;
        }
        if ((Build.VERSION.SDK_INT < 29 || this.platformTextAppearanceSpan.getTypeface() == null) && (typeface = this.appCompatTypeface.get()) != null) {
            paint.setTypeface(typeface);
        }
    }

    public final AtomicReference<Typeface> getAppCompatTypeface$appcompat() {
        return this.appCompatTypeface;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        this.platformTextAppearanceSpan.updateDrawState(textPaint);
        updateTypefaceIfNecessary(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        textPaint.getClass();
        this.platformTextAppearanceSpan.updateMeasureState(textPaint);
        updateTypefaceIfNecessary(textPaint);
    }
}
