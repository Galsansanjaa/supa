package androidx.datastore;

import androidx.datastore.core.Serializer;
import androidx.datastore.core.okio.OkioSerializer;
import defpackage.a10;
import defpackage.cr;
import defpackage.dr;
import defpackage.e50;
import defpackage.vy2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class OkioSerializerWrapper<T> implements OkioSerializer<T> {
    private final Serializer<T> delegate;

    public OkioSerializerWrapper(Serializer<T> serializer) {
        serializer.getClass();
        this.delegate = serializer;
    }

    @Override // androidx.datastore.core.okio.OkioSerializer
    public T getDefaultValue() {
        return this.delegate.getDefaultValue();
    }

    @Override // androidx.datastore.core.okio.OkioSerializer
    public Object readFrom(dr drVar, a10 a10Var) {
        return this.delegate.readFrom(drVar.u(), a10Var);
    }

    @Override // androidx.datastore.core.okio.OkioSerializer
    public Object writeTo(T t, cr crVar, a10 a10Var) {
        Object writeTo = this.delegate.writeTo(t, crVar.s(), a10Var);
        return writeTo == e50.a ? writeTo : vy2.a;
    }
}
