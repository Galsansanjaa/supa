package androidx.compose.foundation.layout;

import defpackage.hu2;
import defpackage.nb1;
import defpackage.os0;
import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
final class LazyImpl implements nb1 {
    public static final Companion Companion = new Companion(null);
    public static final int UNINITIALIZED_VALUE = -1;
    private int _value = -1;
    private final String errorMessage;
    private final os0 initializer;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }
    }

    public LazyImpl(os0 os0Var, String str) {
        this.initializer = os0Var;
        this.errorMessage = str;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final os0 getInitializer() {
        return this.initializer;
    }

    @Override // defpackage.nb1
    public Integer getValue() {
        int i = this._value;
        if (i == -1) {
            i = ((Number) this.initializer.invoke()).intValue();
            this._value = i;
        }
        if (i != -1) {
            return Integer.valueOf(i);
        }
        hu2.h(this.errorMessage);
        return null;
    }

    @Override // defpackage.nb1
    public boolean isInitialized() {
        return this._value != -1;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue().intValue()) : this.errorMessage;
    }
}
