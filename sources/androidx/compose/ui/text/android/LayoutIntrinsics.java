package androidx.compose.ui.text.android;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import defpackage.f31;
import defpackage.g61;
import defpackage.i61;
import java.text.BreakIterator;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class LayoutIntrinsics {
    public static final int $stable = 8;
    private BoringLayout.Metrics _boringMetrics;
    private CharSequence _charSequenceForIntrinsicWidth;
    private float _maxIntrinsicWidth = Float.NaN;
    private float _minIntrinsicWidth = Float.NaN;
    private boolean boringMetricsIsInit;
    private final CharSequence charSequence;
    private final int textDirectionHeuristic;
    private final TextPaint textPaint;

    public LayoutIntrinsics(CharSequence charSequence, TextPaint textPaint, int i) {
        this.charSequence = charSequence;
        this.textPaint = textPaint;
        this.textDirectionHeuristic = i;
    }

    private final float computeMaxIntrinsicWidth() {
        boolean shouldIncreaseMaxIntrinsic;
        BoringLayout.Metrics boringMetrics = getBoringMetrics();
        float f = boringMetrics != null ? boringMetrics.width : -1;
        if (f < 0.0f) {
            f = (float) Math.ceil(getDesiredWidth$default(this, 0, 0, 3, null));
        }
        shouldIncreaseMaxIntrinsic = LayoutIntrinsics_androidKt.shouldIncreaseMaxIntrinsic(f, this.charSequence, this.textPaint);
        return shouldIncreaseMaxIntrinsic ? f + 0.5f : f;
    }

    private final float computeMinIntrinsicWidth() {
        Comparator comparator;
        BreakIterator lineInstance = BreakIterator.getLineInstance(this.textPaint.getTextLocale());
        CharSequence charSequence = this.charSequence;
        int i = 0;
        lineInstance.setText(new CharSequenceCharacterIterator(charSequence, 0, charSequence.length()));
        comparator = LayoutIntrinsics_androidKt.IntRangeComparator;
        PriorityQueue priorityQueue = new PriorityQueue(10, comparator);
        int next = lineInstance.next();
        while (true) {
            int i2 = i;
            i = next;
            if (i == -1) {
                break;
            }
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new g61(i2, i, 1));
            } else {
                i61 i61Var = (i61) priorityQueue.peek();
                if (i61Var != null && i61Var.b - i61Var.a < i - i2) {
                    priorityQueue.poll();
                    priorityQueue.add(new g61(i2, i, 1));
                }
            }
            next = lineInstance.next();
        }
        if (priorityQueue.isEmpty()) {
            return 0.0f;
        }
        Iterator it = priorityQueue.iterator();
        if (!it.hasNext()) {
            f31.b();
            return 0.0f;
        }
        i61 i61Var2 = (i61) it.next();
        float desiredWidth = getDesiredWidth(i61Var2.a, i61Var2.b);
        while (it.hasNext()) {
            i61 i61Var3 = (i61) it.next();
            desiredWidth = Math.max(desiredWidth, getDesiredWidth(i61Var3.a, i61Var3.b));
        }
        return desiredWidth;
    }

    private final CharSequence getCharSequenceForIntrinsicWidth() {
        CharSequence stripNonMetricAffectingCharacterStyleSpans;
        CharSequence charSequence = this._charSequenceForIntrinsicWidth;
        if (charSequence != null) {
            charSequence.getClass();
            return charSequence;
        }
        stripNonMetricAffectingCharacterStyleSpans = LayoutIntrinsics_androidKt.stripNonMetricAffectingCharacterStyleSpans(this.charSequence);
        this._charSequenceForIntrinsicWidth = stripNonMetricAffectingCharacterStyleSpans;
        return stripNonMetricAffectingCharacterStyleSpans;
    }

    private final float getDesiredWidth(int i, int i2) {
        return Layout.getDesiredWidth(getCharSequenceForIntrinsicWidth(), i, i2, this.textPaint);
    }

    public static /* synthetic */ float getDesiredWidth$default(LayoutIntrinsics layoutIntrinsics, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = layoutIntrinsics.getCharSequenceForIntrinsicWidth().length();
        }
        return layoutIntrinsics.getDesiredWidth(i, i2);
    }

    public final BoringLayout.Metrics getBoringMetrics() {
        if (!this.boringMetricsIsInit) {
            this._boringMetrics = BoringLayoutFactory.INSTANCE.measure(this.charSequence, this.textPaint, TextLayout_androidKt.getTextDirectionHeuristic(this.textDirectionHeuristic));
            this.boringMetricsIsInit = true;
        }
        return this._boringMetrics;
    }

    public final float getMaxIntrinsicWidth() {
        if (!Float.isNaN(this._maxIntrinsicWidth)) {
            return this._maxIntrinsicWidth;
        }
        float computeMaxIntrinsicWidth = computeMaxIntrinsicWidth();
        this._maxIntrinsicWidth = computeMaxIntrinsicWidth;
        return computeMaxIntrinsicWidth;
    }

    public final float getMinIntrinsicWidth() {
        if (!Float.isNaN(this._minIntrinsicWidth)) {
            return this._minIntrinsicWidth;
        }
        float computeMinIntrinsicWidth = computeMinIntrinsicWidth();
        this._minIntrinsicWidth = computeMinIntrinsicWidth;
        return computeMinIntrinsicWidth;
    }
}
