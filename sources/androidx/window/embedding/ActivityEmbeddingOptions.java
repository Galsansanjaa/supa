package androidx.window.embedding;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class ActivityEmbeddingOptions {
    public static final Bundle setLaunchingActivityStack(Bundle bundle, Context context, ActivityStack activityStack) {
        bundle.getClass();
        context.getClass();
        activityStack.getClass();
        return ActivityEmbeddingController.Companion.getInstance(context).setLaunchingActivityStack$window_release(bundle, activityStack);
    }

    public static final Bundle setOverlayCreateParams(Bundle bundle, Activity activity, OverlayCreateParams overlayCreateParams) {
        bundle.getClass();
        activity.getClass();
        overlayCreateParams.getClass();
        return OverlayController.Companion.getInstance(activity).setOverlayCreateParams$window_release(bundle, overlayCreateParams);
    }
}
