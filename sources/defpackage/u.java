package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class u implements ob0, jz {
    public static /* synthetic */ Object decodeSerializableValue$default(u uVar, nd0 nd0Var, Object obj, int i, Object obj2) {
        if (obj2 != null) {
            f31.f("Super calls with default arguments not supported in this target, function: decodeSerializableValue");
            return null;
        }
        if ((i & 2) != 0) {
            obj = null;
        }
        return uVar.decodeSerializableValue(nd0Var, obj);
    }

    @Override // defpackage.ob0
    public jz beginStructure(tf2 tf2Var) {
        tf2Var.getClass();
        return this;
    }

    @Override // defpackage.ob0
    public boolean decodeBoolean() {
        Object decodeValue = decodeValue();
        decodeValue.getClass();
        return ((Boolean) decodeValue).booleanValue();
    }

    @Override // defpackage.jz
    public final boolean decodeBooleanElement(tf2 tf2Var, int i) {
        tf2Var.getClass();
        return decodeBoolean();
    }

    @Override // defpackage.ob0
    public byte decodeByte() {
        Object decodeValue = decodeValue();
        decodeValue.getClass();
        return ((Byte) decodeValue).byteValue();
    }

    @Override // defpackage.jz
    public final byte decodeByteElement(tf2 tf2Var, int i) {
        tf2Var.getClass();
        return decodeByte();
    }

    @Override // defpackage.ob0
    public char decodeChar() {
        Object decodeValue = decodeValue();
        decodeValue.getClass();
        return ((Character) decodeValue).charValue();
    }

    @Override // defpackage.jz
    public final char decodeCharElement(tf2 tf2Var, int i) {
        tf2Var.getClass();
        return decodeChar();
    }

    public int decodeCollectionSize(tf2 tf2Var) {
        tf2Var.getClass();
        return -1;
    }

    @Override // defpackage.ob0
    public double decodeDouble() {
        Object decodeValue = decodeValue();
        decodeValue.getClass();
        return ((Double) decodeValue).doubleValue();
    }

    @Override // defpackage.jz
    public final double decodeDoubleElement(tf2 tf2Var, int i) {
        tf2Var.getClass();
        return decodeDouble();
    }

    public int decodeEnum(tf2 tf2Var) {
        tf2Var.getClass();
        Object decodeValue = decodeValue();
        decodeValue.getClass();
        return ((Integer) decodeValue).intValue();
    }

    @Override // defpackage.ob0
    public float decodeFloat() {
        Object decodeValue = decodeValue();
        decodeValue.getClass();
        return ((Float) decodeValue).floatValue();
    }

    @Override // defpackage.jz
    public final float decodeFloatElement(tf2 tf2Var, int i) {
        tf2Var.getClass();
        return decodeFloat();
    }

    @Override // defpackage.ob0
    public ob0 decodeInline(tf2 tf2Var) {
        tf2Var.getClass();
        return this;
    }

    @Override // defpackage.jz
    public ob0 decodeInlineElement(tf2 tf2Var, int i) {
        tf2Var.getClass();
        return decodeInline(tf2Var.g(i));
    }

    @Override // defpackage.ob0
    public int decodeInt() {
        Object decodeValue = decodeValue();
        decodeValue.getClass();
        return ((Integer) decodeValue).intValue();
    }

    @Override // defpackage.jz
    public final int decodeIntElement(tf2 tf2Var, int i) {
        tf2Var.getClass();
        return decodeInt();
    }

    @Override // defpackage.ob0
    public long decodeLong() {
        Object decodeValue = decodeValue();
        decodeValue.getClass();
        return ((Long) decodeValue).longValue();
    }

    @Override // defpackage.jz
    public final long decodeLongElement(tf2 tf2Var, int i) {
        tf2Var.getClass();
        return decodeLong();
    }

    @Override // defpackage.ob0
    public boolean decodeNotNullMark() {
        return true;
    }

    @Override // defpackage.ob0
    public Void decodeNull() {
        return null;
    }

    @Override // defpackage.jz
    public final <T> T decodeNullableSerializableElement(tf2 tf2Var, int i, nd0 nd0Var, T t) {
        tf2Var.getClass();
        nd0Var.getClass();
        return (nd0Var.getDescriptor().b() || decodeNotNullMark()) ? (T) decodeSerializableValue(nd0Var, t) : (T) decodeNull();
    }

    public boolean decodeSequentially() {
        return false;
    }

    public <T> T decodeSerializableElement(tf2 tf2Var, int i, nd0 nd0Var, T t) {
        tf2Var.getClass();
        nd0Var.getClass();
        return (T) decodeSerializableValue(nd0Var, t);
    }

    @Override // defpackage.ob0
    public Object decodeSerializableValue(nd0 nd0Var) {
        nd0Var.getClass();
        return nd0Var.deserialize(this);
    }

    public <T> T decodeSerializableValue(nd0 nd0Var, T t) {
        nd0Var.getClass();
        return (T) decodeSerializableValue(nd0Var);
    }

    @Override // defpackage.ob0
    public short decodeShort() {
        Object decodeValue = decodeValue();
        decodeValue.getClass();
        return ((Short) decodeValue).shortValue();
    }

    @Override // defpackage.jz
    public final short decodeShortElement(tf2 tf2Var, int i) {
        tf2Var.getClass();
        return decodeShort();
    }

    @Override // defpackage.ob0
    public String decodeString() {
        Object decodeValue = decodeValue();
        decodeValue.getClass();
        return (String) decodeValue;
    }

    @Override // defpackage.jz
    public final String decodeStringElement(tf2 tf2Var, int i) {
        tf2Var.getClass();
        return decodeString();
    }

    public Object decodeValue() {
        throw new IllegalArgumentException(a52.a(getClass()) + " can't retrieve untyped values");
    }

    public void endStructure(tf2 tf2Var) {
        tf2Var.getClass();
    }
}
