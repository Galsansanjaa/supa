package androidx.window.embedding;

import androidx.window.embedding.SplitAttributes;
import androidx.window.embedding.SplitRule;
import defpackage.jh2;
import defpackage.kw;
import defpackage.sb0;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class SplitPairRule extends SplitRule {
    private final boolean clearTop;
    private final Set<SplitPairFilter> filters;
    private final SplitRule.FinishBehavior finishPrimaryWithSecondary;
    private final SplitRule.FinishBehavior finishSecondaryWithPrimary;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes4.dex */
    public static final class Builder {
        private boolean clearTop;
        private SplitAttributes defaultSplitAttributes;
        private final Set<SplitPairFilter> filters;
        private SplitRule.FinishBehavior finishPrimaryWithSecondary;
        private SplitRule.FinishBehavior finishSecondaryWithPrimary;
        private EmbeddingAspectRatio maxAspectRatioInLandscape;
        private EmbeddingAspectRatio maxAspectRatioInPortrait;
        private int minHeightDp;
        private int minSmallestWidthDp;
        private int minWidthDp;
        private String tag;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(SplitPairRule splitPairRule) {
            this(splitPairRule.getFilters());
            splitPairRule.getClass();
            setTag(splitPairRule.getTag()).setMinWidthDp(splitPairRule.getMinWidthDp()).setMinHeightDp(splitPairRule.getMinHeightDp()).setMinSmallestWidthDp(splitPairRule.getMinSmallestWidthDp()).setMaxAspectRatioInPortrait(splitPairRule.getMaxAspectRatioInPortrait()).setMaxAspectRatioInLandscape(splitPairRule.getMaxAspectRatioInLandscape()).setFinishPrimaryWithSecondary(splitPairRule.getFinishPrimaryWithSecondary()).setFinishSecondaryWithPrimary(splitPairRule.getFinishSecondaryWithPrimary()).setClearTop(splitPairRule.getClearTop()).setDefaultSplitAttributes(splitPairRule.getDefaultSplitAttributes());
        }

        public Builder(Set<SplitPairFilter> set) {
            set.getClass();
            this.filters = set;
            this.minWidthDp = 600;
            this.minHeightDp = 600;
            this.minSmallestWidthDp = 600;
            this.maxAspectRatioInPortrait = SplitRule.SPLIT_MAX_ASPECT_RATIO_PORTRAIT_DEFAULT;
            this.maxAspectRatioInLandscape = SplitRule.SPLIT_MAX_ASPECT_RATIO_LANDSCAPE_DEFAULT;
            this.finishPrimaryWithSecondary = SplitRule.FinishBehavior.NEVER;
            this.finishSecondaryWithPrimary = SplitRule.FinishBehavior.ALWAYS;
            this.defaultSplitAttributes = new SplitAttributes.Builder().build();
        }

        public final SplitPairRule build() {
            return new SplitPairRule(this.filters, this.defaultSplitAttributes, this.tag, this.finishPrimaryWithSecondary, this.finishSecondaryWithPrimary, this.clearTop, this.minWidthDp, this.minHeightDp, this.minSmallestWidthDp, this.maxAspectRatioInPortrait, this.maxAspectRatioInLandscape);
        }

        public final Builder setClearTop(boolean z) {
            this.clearTop = z;
            return this;
        }

        public final Builder setDefaultSplitAttributes(SplitAttributes splitAttributes) {
            splitAttributes.getClass();
            this.defaultSplitAttributes = splitAttributes;
            return this;
        }

        public final Builder setFinishPrimaryWithSecondary(SplitRule.FinishBehavior finishBehavior) {
            finishBehavior.getClass();
            this.finishPrimaryWithSecondary = finishBehavior;
            return this;
        }

        public final Builder setFinishSecondaryWithPrimary(SplitRule.FinishBehavior finishBehavior) {
            finishBehavior.getClass();
            this.finishSecondaryWithPrimary = finishBehavior;
            return this;
        }

        public final Builder setMaxAspectRatioInLandscape(EmbeddingAspectRatio embeddingAspectRatio) {
            embeddingAspectRatio.getClass();
            this.maxAspectRatioInLandscape = embeddingAspectRatio;
            return this;
        }

        public final Builder setMaxAspectRatioInPortrait(EmbeddingAspectRatio embeddingAspectRatio) {
            embeddingAspectRatio.getClass();
            this.maxAspectRatioInPortrait = embeddingAspectRatio;
            return this;
        }

        public final Builder setMinHeightDp(int i) {
            this.minHeightDp = i;
            return this;
        }

        public final Builder setMinSmallestWidthDp(int i) {
            this.minSmallestWidthDp = i;
            return this;
        }

        public final Builder setMinWidthDp(int i) {
            this.minWidthDp = i;
            return this;
        }

        public final Builder setTag(String str) {
            this.tag = str;
            return this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplitPairRule(Set<SplitPairFilter> set, SplitAttributes splitAttributes, String str, SplitRule.FinishBehavior finishBehavior, SplitRule.FinishBehavior finishBehavior2, boolean z, int i, int i2, int i3, EmbeddingAspectRatio embeddingAspectRatio, EmbeddingAspectRatio embeddingAspectRatio2) {
        super(str, i, i2, i3, embeddingAspectRatio, embeddingAspectRatio2, splitAttributes);
        set.getClass();
        splitAttributes.getClass();
        finishBehavior.getClass();
        finishBehavior2.getClass();
        embeddingAspectRatio.getClass();
        embeddingAspectRatio2.getClass();
        this.filters = set;
        this.finishPrimaryWithSecondary = finishBehavior;
        this.finishSecondaryWithPrimary = finishBehavior2;
        this.clearTop = z;
    }

    public /* synthetic */ SplitPairRule(Set set, SplitAttributes splitAttributes, String str, SplitRule.FinishBehavior finishBehavior, SplitRule.FinishBehavior finishBehavior2, boolean z, int i, int i2, int i3, EmbeddingAspectRatio embeddingAspectRatio, EmbeddingAspectRatio embeddingAspectRatio2, int i4, sb0 sb0Var) {
        this(set, splitAttributes, (i4 & 4) != 0 ? null : str, (i4 & 8) != 0 ? SplitRule.FinishBehavior.NEVER : finishBehavior, (i4 & 16) != 0 ? SplitRule.FinishBehavior.ALWAYS : finishBehavior2, (i4 & 32) != 0 ? false : z, (i4 & 64) != 0 ? 600 : i, (i4 & 128) != 0 ? 600 : i2, (i4 & 256) != 0 ? 600 : i3, (i4 & 512) != 0 ? SplitRule.SPLIT_MAX_ASPECT_RATIO_PORTRAIT_DEFAULT : embeddingAspectRatio, (i4 & 1024) != 0 ? SplitRule.SPLIT_MAX_ASPECT_RATIO_LANDSCAPE_DEFAULT : embeddingAspectRatio2);
    }

    @Override // androidx.window.embedding.SplitRule, androidx.window.embedding.EmbeddingRule
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplitPairRule) || !super.equals(obj)) {
            return false;
        }
        SplitPairRule splitPairRule = (SplitPairRule) obj;
        return jh2.k(this.filters, splitPairRule.filters) && jh2.k(this.finishPrimaryWithSecondary, splitPairRule.finishPrimaryWithSecondary) && jh2.k(this.finishSecondaryWithPrimary, splitPairRule.finishSecondaryWithPrimary) && this.clearTop == splitPairRule.clearTop;
    }

    public final boolean getClearTop() {
        return this.clearTop;
    }

    public final Set<SplitPairFilter> getFilters() {
        return this.filters;
    }

    public final SplitRule.FinishBehavior getFinishPrimaryWithSecondary() {
        return this.finishPrimaryWithSecondary;
    }

    public final SplitRule.FinishBehavior getFinishSecondaryWithPrimary() {
        return this.finishSecondaryWithPrimary;
    }

    @Override // androidx.window.embedding.SplitRule, androidx.window.embedding.EmbeddingRule
    public int hashCode() {
        return ((this.finishSecondaryWithPrimary.hashCode() + ((this.finishPrimaryWithSecondary.hashCode() + ((this.filters.hashCode() + (super.hashCode() * 31)) * 31)) * 31)) * 31) + (this.clearTop ? 1231 : 1237);
    }

    public final SplitPairRule plus$window_release(SplitPairFilter splitPairFilter) {
        splitPairFilter.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.filters);
        linkedHashSet.add(splitPairFilter);
        return new Builder((Set<SplitPairFilter>) kw.P0(linkedHashSet)).setTag(getTag()).setMinWidthDp(getMinWidthDp()).setMinHeightDp(getMinHeightDp()).setMinSmallestWidthDp(getMinSmallestWidthDp()).setMaxAspectRatioInPortrait(getMaxAspectRatioInPortrait()).setMaxAspectRatioInLandscape(getMaxAspectRatioInLandscape()).setFinishPrimaryWithSecondary(this.finishPrimaryWithSecondary).setFinishSecondaryWithPrimary(this.finishSecondaryWithPrimary).setClearTop(this.clearTop).setDefaultSplitAttributes(getDefaultSplitAttributes()).build();
    }

    @Override // androidx.window.embedding.SplitRule
    public String toString() {
        return "SplitPairRule{tag=" + getTag() + ", defaultSplitAttributes=" + getDefaultSplitAttributes() + ", minWidthDp=" + getMinWidthDp() + ", minHeightDp=" + getMinHeightDp() + ", minSmallestWidthDp=" + getMinSmallestWidthDp() + ", maxAspectRatioInPortrait=" + getMaxAspectRatioInPortrait() + ", maxAspectRatioInLandscape=" + getMaxAspectRatioInLandscape() + ", clearTop=" + this.clearTop + ", finishPrimaryWithSecondary=" + this.finishPrimaryWithSecondary + ", finishSecondaryWithPrimary=" + this.finishSecondaryWithPrimary + ", filters=" + this.filters + '}';
    }
}
