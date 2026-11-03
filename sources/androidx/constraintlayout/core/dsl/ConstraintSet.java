package androidx.constraintlayout.core.dsl;

import defpackage.wa2;
import java.util.ArrayList;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public class ConstraintSet {
    ArrayList<Constraint> mConstraints = new ArrayList<>();
    ArrayList<Helper> mHelpers = new ArrayList<>();
    private final String mName;

    public ConstraintSet(String str) {
        this.mName = str;
    }

    public void add(Constraint constraint) {
        this.mConstraints.add(constraint);
    }

    public void add(Helper helper) {
        this.mHelpers.add(helper);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(wa2.v(new StringBuilder(), this.mName, ":{\n"));
        int i = 0;
        if (!this.mConstraints.isEmpty()) {
            ArrayList<Constraint> arrayList = this.mConstraints;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Constraint constraint = arrayList.get(i2);
                i2++;
                sb.append(constraint.toString());
            }
        }
        if (!this.mHelpers.isEmpty()) {
            ArrayList<Helper> arrayList2 = this.mHelpers;
            int size2 = arrayList2.size();
            while (i < size2) {
                Helper helper = arrayList2.get(i);
                i++;
                sb.append(helper.toString());
            }
        }
        sb.append("},\n");
        return sb.toString();
    }
}
