package androidx.window.embedding;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import defpackage.ea0;
import defpackage.jp0;
import defpackage.sb0;
import java.util.Set;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class ActivityEmbeddingController {
    public static final Companion Companion = new Companion(null);
    private final EmbeddingBackend backend;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        public final ActivityEmbeddingController getInstance(Context context) {
            context.getClass();
            return new ActivityEmbeddingController(EmbeddingBackend.Companion.getInstance(context));
        }
    }

    public ActivityEmbeddingController(EmbeddingBackend embeddingBackend) {
        embeddingBackend.getClass();
        this.backend = embeddingBackend;
    }

    public static final /* synthetic */ EmbeddingBackend access$getBackend$p(ActivityEmbeddingController activityEmbeddingController) {
        return activityEmbeddingController.backend;
    }

    public static final ActivityEmbeddingController getInstance(Context context) {
        return Companion.getInstance(context);
    }

    public final jp0 embeddedActivityWindowInfo(Activity activity) {
        activity.getClass();
        return ea0.i(new ActivityEmbeddingController$embeddedActivityWindowInfo$1(this, activity, null));
    }

    public final void finishActivityStacks(Set<ActivityStack> set) {
        set.getClass();
        this.backend.finishActivityStacks(set);
    }

    public final ActivityStack getActivityStack(Activity activity) {
        activity.getClass();
        return this.backend.getActivityStack(activity);
    }

    public final void invalidateVisibleActivityStacks() {
        this.backend.invalidateVisibleActivityStacks();
    }

    public final boolean isActivityEmbedded(Activity activity) {
        activity.getClass();
        return this.backend.isActivityEmbedded(activity);
    }

    public final void setEmbeddingConfiguration(EmbeddingConfiguration embeddingConfiguration) {
        embeddingConfiguration.getClass();
        this.backend.setEmbeddingConfiguration(embeddingConfiguration);
    }

    public final Bundle setLaunchingActivityStack$window_release(Bundle bundle, ActivityStack activityStack) {
        bundle.getClass();
        activityStack.getClass();
        return this.backend.setLaunchingActivityStack(bundle, activityStack);
    }
}
