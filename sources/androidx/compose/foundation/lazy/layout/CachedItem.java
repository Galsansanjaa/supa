package androidx.compose.foundation.lazy.layout;

import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class CachedItem {
    private Object key;
    private int mainAxisSize;
    public static final NoKey NoKey = new NoKey(null);
    public static final int $stable = 8;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class NoKey {
        private NoKey() {
        }

        public /* synthetic */ NoKey(sb0 sb0Var) {
            this();
        }
    }

    public CachedItem(Object obj, int i) {
        this.key = obj;
        this.mainAxisSize = i;
    }

    public final Object getKey() {
        return this.key;
    }

    public final int getMainAxisSize() {
        return this.mainAxisSize;
    }

    public final void setKey(Object obj) {
        this.key = obj;
    }

    public final void setMainAxisSize(int i) {
        this.mainAxisSize = i;
    }

    public String toString() {
        return "CachedItem(key=" + this.key + ", mainAxisSize=" + this.mainAxisSize + ")";
    }
}
