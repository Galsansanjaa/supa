package androidx.window.embedding;

import android.app.Activity;
import androidx.window.WindowSdkExtensions;
import androidx.window.extensions.embedding.ActivityStack;
import defpackage.jh2;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class ActivityStack {
    private final List<Activity> activitiesInProcess;
    private final boolean isEmpty;
    private final ActivityStack.Token token;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActivityStack(List<? extends Activity> list, boolean z) {
        this(list, z, null);
        list.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ActivityStack(List<? extends Activity> list, boolean z, ActivityStack.Token token) {
        list.getClass();
        this.activitiesInProcess = list;
        this.isEmpty = z;
        this.token = token;
    }

    public final boolean contains(Activity activity) {
        activity.getClass();
        return this.activitiesInProcess.contains(activity);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityStack)) {
            return false;
        }
        ActivityStack activityStack = (ActivityStack) obj;
        return jh2.k(this.activitiesInProcess, activityStack.activitiesInProcess) && this.isEmpty == activityStack.isEmpty && jh2.k(this.token, activityStack.token);
    }

    public final List<Activity> getActivitiesInProcess$window_release() {
        return this.activitiesInProcess;
    }

    public final ActivityStack.Token getToken$window_release() {
        WindowSdkExtensions.Companion.getInstance().requireExtensionVersion$window_release(5);
        ActivityStack.Token token = this.token;
        token.getClass();
        return token;
    }

    public int hashCode() {
        int hashCode = ((this.activitiesInProcess.hashCode() * 31) + (this.isEmpty ? 1231 : 1237)) * 31;
        ActivityStack.Token token = this.token;
        return hashCode + (token != null ? token.hashCode() : 0);
    }

    public final boolean isEmpty() {
        return this.isEmpty;
    }

    public String toString() {
        return "ActivityStack{activitiesInProcess=" + this.activitiesInProcess + ", isEmpty=" + this.isEmpty + ", token=" + this.token + '}';
    }
}
