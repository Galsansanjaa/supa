package androidx.credentials.internal;

import defpackage.sb0;
import org.json.JSONObject;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class RequestValidationHelper {
    public static final Companion Companion = new Companion(null);

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        public final boolean isValidJSON(String str) {
            str.getClass();
            if (str.length() == 0) {
                return false;
            }
            try {
                new JSONObject(str);
                return true;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    public static final boolean isValidJSON(String str) {
        return Companion.isValidJSON(str);
    }
}
