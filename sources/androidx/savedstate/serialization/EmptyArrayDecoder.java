package androidx.savedstate.serialization;

import defpackage.eg2;
import defpackage.gg2;
import defpackage.nd0;
import defpackage.tf2;
import defpackage.u;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
final class EmptyArrayDecoder extends u {
    public static final EmptyArrayDecoder INSTANCE = new EmptyArrayDecoder();
    private static final eg2 serializersModule = gg2.a;

    private EmptyArrayDecoder() {
    }

    @Override // defpackage.u, defpackage.jz
    public int decodeCollectionSize(tf2 tf2Var) {
        tf2Var.getClass();
        return -1;
    }

    @Override // defpackage.jz
    public int decodeElementIndex(tf2 tf2Var) {
        tf2Var.getClass();
        return -1;
    }

    public Object decodeNullableSerializableValue(nd0 nd0Var) {
        nd0Var.getClass();
        return (nd0Var.getDescriptor().b() || decodeNotNullMark()) ? decodeSerializableValue(nd0Var) : decodeNull();
    }

    @Override // defpackage.u, defpackage.jz
    public boolean decodeSequentially() {
        return false;
    }

    @Override // defpackage.u, defpackage.ob0
    public Object decodeSerializableValue(nd0 nd0Var) {
        nd0Var.getClass();
        return nd0Var.deserialize(this);
    }

    @Override // defpackage.jz
    public eg2 getSerializersModule() {
        return serializersModule;
    }
}
