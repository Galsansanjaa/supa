package defpackage;

import android.content.Context;
import android.view.WindowMetrics;
import androidx.window.embedding.EmbeddingAdapter;
import androidx.window.embedding.SplitPairRule;
import androidx.window.embedding.SplitPinRule;
import androidx.window.embedding.SplitPlaceholderRule;
import androidx.window.embedding.SplitRule;
import androidx.window.reflection.Predicate2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class bi0 implements Predicate2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ SplitRule c;

    public /* synthetic */ bi0(SplitRule splitRule, Context context, int i) {
        this.a = i;
        this.c = splitRule;
        this.b = context;
    }

    @Override // androidx.window.reflection.Predicate2
    public final boolean test(Object obj) {
        boolean translateSplitPinRule$lambda$8;
        boolean translateSplitPlaceholderRule$lambda$14;
        boolean translateSplitPairRule$lambda$7;
        switch (this.a) {
            case 0:
                translateSplitPinRule$lambda$8 = EmbeddingAdapter.translateSplitPinRule$lambda$8((SplitPinRule) this.c, this.b, (WindowMetrics) obj);
                return translateSplitPinRule$lambda$8;
            case 1:
                translateSplitPlaceholderRule$lambda$14 = EmbeddingAdapter.translateSplitPlaceholderRule$lambda$14((SplitPlaceholderRule) this.c, this.b, (WindowMetrics) obj);
                return translateSplitPlaceholderRule$lambda$14;
            default:
                translateSplitPairRule$lambda$7 = EmbeddingAdapter.translateSplitPairRule$lambda$7((SplitPairRule) this.c, this.b, (WindowMetrics) obj);
                return translateSplitPairRule$lambda$7;
        }
    }
}
