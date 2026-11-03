package androidx.compose.runtime.retain;

import java.util.Arrays;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
final class RetainKeys {
    private final Object[] keys;
    private final long positionalKey;
    private final int typeHash;

    public RetainKeys(Object[] objArr, long j, int i) {
        this.keys = objArr;
        this.positionalKey = j;
        this.typeHash = i;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof RetainKeys)) {
            return false;
        }
        RetainKeys retainKeys = (RetainKeys) obj;
        return retainKeys.positionalKey == this.positionalKey && retainKeys.typeHash == this.typeHash && Arrays.equals(retainKeys.keys, this.keys);
    }

    public final long getPositionalKey() {
        return this.positionalKey;
    }

    public final int getTypeHash() {
        return this.typeHash;
    }

    public int hashCode() {
        Object[] objArr = this.keys;
        int hashCode = objArr != null ? Arrays.hashCode(objArr) : 0;
        long j = this.positionalKey;
        return (((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.typeHash;
    }
}
