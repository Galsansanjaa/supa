package androidx.lifecycle;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public class MethodCallsLogger {
    private final Map<String, Integer> calledMethods = new HashMap();

    public boolean approveCall(String str, int i) {
        str.getClass();
        Integer num = this.calledMethods.get(str);
        int intValue = num != null ? num.intValue() : 0;
        boolean z = (intValue & i) != 0;
        this.calledMethods.put(str, Integer.valueOf(i | intValue));
        return !z;
    }
}
