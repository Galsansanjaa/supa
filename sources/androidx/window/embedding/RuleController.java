package androidx.window.embedding;

import android.content.Context;
import androidx.window.embedding.EmbeddingBackend;
import defpackage.ri0;
import defpackage.sb0;
import java.util.Set;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class RuleController {
    public static final Companion Companion = new Companion(null);
    private final EmbeddingBackend embeddingBackend;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        public final RuleController getInstance(Context context) {
            context.getClass();
            Context applicationContext = context.getApplicationContext();
            EmbeddingBackend.Companion companion = EmbeddingBackend.Companion;
            applicationContext.getClass();
            return new RuleController(companion.getInstance(applicationContext));
        }

        public final Set<EmbeddingRule> parseRules(Context context, int i) {
            context.getClass();
            RuleParser ruleParser = RuleParser.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            Set<EmbeddingRule> parseRules$window_release = ruleParser.parseRules$window_release(applicationContext, i);
            return parseRules$window_release == null ? ri0.a : parseRules$window_release;
        }
    }

    public RuleController(EmbeddingBackend embeddingBackend) {
        embeddingBackend.getClass();
        this.embeddingBackend = embeddingBackend;
    }

    public static final RuleController getInstance(Context context) {
        return Companion.getInstance(context);
    }

    public static final Set<EmbeddingRule> parseRules(Context context, int i) {
        return Companion.parseRules(context, i);
    }

    public final void addRule(EmbeddingRule embeddingRule) {
        embeddingRule.getClass();
        this.embeddingBackend.addRule(embeddingRule);
    }

    public final void clearRules() {
        this.embeddingBackend.setRules(ri0.a);
    }

    public final Set<EmbeddingRule> getRules() {
        return this.embeddingBackend.getRules();
    }

    public final void removeRule(EmbeddingRule embeddingRule) {
        embeddingRule.getClass();
        this.embeddingBackend.removeRule(embeddingRule);
    }

    public final void setRules(Set<? extends EmbeddingRule> set) {
        set.getClass();
        this.embeddingBackend.setRules(set);
    }
}
