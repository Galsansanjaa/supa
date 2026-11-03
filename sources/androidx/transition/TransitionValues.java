package androidx.transition;

import android.view.View;
import defpackage.sg3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public class TransitionValues {
    public View view;
    public final Map<String, Object> values = new HashMap();
    final ArrayList<Transition> mTargetedTransitions = new ArrayList<>();

    @Deprecated
    public TransitionValues() {
    }

    public TransitionValues(View view) {
        this.view = view;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TransitionValues)) {
            return false;
        }
        TransitionValues transitionValues = (TransitionValues) obj;
        return this.view == transitionValues.view && this.values.equals(transitionValues.values);
    }

    public int hashCode() {
        return this.values.hashCode() + (this.view.hashCode() * 31);
    }

    public String toString() {
        StringBuilder v = sg3.v("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        v.append(this.view);
        v.append("\n");
        String concat = v.toString().concat("    values:");
        for (String str : this.values.keySet()) {
            concat = concat + "    " + str + ": " + this.values.get(str) + "\n";
        }
        return concat;
    }
}
