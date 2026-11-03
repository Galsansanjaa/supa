package androidx.compose.foundation.text;

import defpackage.ps0;
import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class KeyboardActions {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final KeyboardActions Default = new KeyboardActions(null, null, null, null, null, null, 63, null);
    private final ps0 onDone;
    private final ps0 onGo;
    private final ps0 onNext;
    private final ps0 onPrevious;
    private final ps0 onSearch;
    private final ps0 onSend;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        public static /* synthetic */ void getDefault$annotations() {
        }

        public final KeyboardActions getDefault() {
            return KeyboardActions.Default;
        }
    }

    public KeyboardActions() {
        this(null, null, null, null, null, null, 63, null);
    }

    public KeyboardActions(ps0 ps0Var, ps0 ps0Var2, ps0 ps0Var3, ps0 ps0Var4, ps0 ps0Var5, ps0 ps0Var6) {
        this.onDone = ps0Var;
        this.onGo = ps0Var2;
        this.onNext = ps0Var3;
        this.onPrevious = ps0Var4;
        this.onSearch = ps0Var5;
        this.onSend = ps0Var6;
    }

    public /* synthetic */ KeyboardActions(ps0 ps0Var, ps0 ps0Var2, ps0 ps0Var3, ps0 ps0Var4, ps0 ps0Var5, ps0 ps0Var6, int i, sb0 sb0Var) {
        this((i & 1) != 0 ? null : ps0Var, (i & 2) != 0 ? null : ps0Var2, (i & 4) != 0 ? null : ps0Var3, (i & 8) != 0 ? null : ps0Var4, (i & 16) != 0 ? null : ps0Var5, (i & 32) != 0 ? null : ps0Var6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyboardActions)) {
            return false;
        }
        KeyboardActions keyboardActions = (KeyboardActions) obj;
        return this.onDone == keyboardActions.onDone && this.onGo == keyboardActions.onGo && this.onNext == keyboardActions.onNext && this.onPrevious == keyboardActions.onPrevious && this.onSearch == keyboardActions.onSearch && this.onSend == keyboardActions.onSend;
    }

    public final ps0 getOnDone() {
        return this.onDone;
    }

    public final ps0 getOnGo() {
        return this.onGo;
    }

    public final ps0 getOnNext() {
        return this.onNext;
    }

    public final ps0 getOnPrevious() {
        return this.onPrevious;
    }

    public final ps0 getOnSearch() {
        return this.onSearch;
    }

    public final ps0 getOnSend() {
        return this.onSend;
    }

    public int hashCode() {
        ps0 ps0Var = this.onDone;
        int hashCode = (ps0Var != null ? ps0Var.hashCode() : 0) * 31;
        ps0 ps0Var2 = this.onGo;
        int hashCode2 = (hashCode + (ps0Var2 != null ? ps0Var2.hashCode() : 0)) * 31;
        ps0 ps0Var3 = this.onNext;
        int hashCode3 = (hashCode2 + (ps0Var3 != null ? ps0Var3.hashCode() : 0)) * 31;
        ps0 ps0Var4 = this.onPrevious;
        int hashCode4 = (hashCode3 + (ps0Var4 != null ? ps0Var4.hashCode() : 0)) * 31;
        ps0 ps0Var5 = this.onSearch;
        int hashCode5 = (hashCode4 + (ps0Var5 != null ? ps0Var5.hashCode() : 0)) * 31;
        ps0 ps0Var6 = this.onSend;
        return hashCode5 + (ps0Var6 != null ? ps0Var6.hashCode() : 0);
    }
}
