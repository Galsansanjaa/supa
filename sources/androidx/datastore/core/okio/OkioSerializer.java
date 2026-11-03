package androidx.datastore.core.okio;

import defpackage.a10;
import defpackage.cr;
import defpackage.dr;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public interface OkioSerializer<T> {
    T getDefaultValue();

    Object readFrom(dr drVar, a10 a10Var);

    Object writeTo(T t, cr crVar, a10 a10Var);
}
