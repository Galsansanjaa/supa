package androidx.datastore.core;

import defpackage.hu2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class Data<T> extends State<T> {
    private final int hashCode;
    private final T value;

    public Data(T t, int i, int i2) {
        super(i2, null);
        this.value = t;
        this.hashCode = i;
    }

    public final void checkHashCode() {
        T t = this.value;
        if ((t != null ? t.hashCode() : 0) == this.hashCode) {
            return;
        }
        hu2.h("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
    }

    public final int getHashCode() {
        return this.hashCode;
    }

    public final T getValue() {
        return this.value;
    }
}
