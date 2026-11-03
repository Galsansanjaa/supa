package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class w implements yi0, kz {
    @Override // defpackage.yi0
    public kz beginCollection(tf2 tf2Var, int i) {
        tf2Var.getClass();
        return beginStructure(tf2Var);
    }

    @Override // defpackage.yi0
    public kz beginStructure(tf2 tf2Var) {
        tf2Var.getClass();
        return this;
    }

    @Override // defpackage.yi0
    public abstract void encodeBoolean(boolean z);

    @Override // defpackage.kz
    public final void encodeBooleanElement(tf2 tf2Var, int i, boolean z) {
        tf2Var.getClass();
        if (encodeElement(tf2Var, i)) {
            encodeBoolean(z);
        }
    }

    @Override // defpackage.yi0
    public abstract void encodeByte(byte b);

    @Override // defpackage.kz
    public final void encodeByteElement(tf2 tf2Var, int i, byte b) {
        tf2Var.getClass();
        if (encodeElement(tf2Var, i)) {
            encodeByte(b);
        }
    }

    @Override // defpackage.yi0
    public abstract void encodeChar(char c);

    @Override // defpackage.kz
    public final void encodeCharElement(tf2 tf2Var, int i, char c) {
        tf2Var.getClass();
        if (encodeElement(tf2Var, i)) {
            encodeChar(c);
        }
    }

    @Override // defpackage.yi0
    public abstract void encodeDouble(double d);

    @Override // defpackage.kz
    public final void encodeDoubleElement(tf2 tf2Var, int i, double d) {
        tf2Var.getClass();
        if (encodeElement(tf2Var, i)) {
            encodeDouble(d);
        }
    }

    public boolean encodeElement(tf2 tf2Var, int i) {
        tf2Var.getClass();
        return true;
    }

    @Override // defpackage.yi0
    public abstract void encodeFloat(float f);

    @Override // defpackage.kz
    public final void encodeFloatElement(tf2 tf2Var, int i, float f) {
        tf2Var.getClass();
        if (encodeElement(tf2Var, i)) {
            encodeFloat(f);
        }
    }

    @Override // defpackage.yi0
    public yi0 encodeInline(tf2 tf2Var) {
        tf2Var.getClass();
        return this;
    }

    @Override // defpackage.kz
    public final yi0 encodeInlineElement(tf2 tf2Var, int i) {
        tf2Var.getClass();
        return encodeElement(tf2Var, i) ? encodeInline(tf2Var.g(i)) : mq1.a;
    }

    @Override // defpackage.yi0
    public abstract void encodeInt(int i);

    @Override // defpackage.kz
    public final void encodeIntElement(tf2 tf2Var, int i, int i2) {
        tf2Var.getClass();
        if (encodeElement(tf2Var, i)) {
            encodeInt(i2);
        }
    }

    @Override // defpackage.yi0
    public abstract void encodeLong(long j);

    @Override // defpackage.kz
    public final void encodeLongElement(tf2 tf2Var, int i, long j) {
        tf2Var.getClass();
        if (encodeElement(tf2Var, i)) {
            encodeLong(j);
        }
    }

    @Override // defpackage.yi0
    public void encodeNotNullMark() {
    }

    public <T> void encodeNullableSerializableElement(tf2 tf2Var, int i, bg2 bg2Var, T t) {
        tf2Var.getClass();
        bg2Var.getClass();
        if (encodeElement(tf2Var, i)) {
            encodeNullableSerializableValue(bg2Var, t);
        }
    }

    public void encodeNullableSerializableValue(bg2 bg2Var, Object obj) {
        if (bg2Var.getDescriptor().b()) {
            encodeSerializableValue(bg2Var, obj);
        } else if (obj == null) {
            encodeNull();
        } else {
            encodeNotNullMark();
            encodeSerializableValue(bg2Var, obj);
        }
    }

    @Override // defpackage.kz
    public <T> void encodeSerializableElement(tf2 tf2Var, int i, bg2 bg2Var, T t) {
        tf2Var.getClass();
        bg2Var.getClass();
        if (encodeElement(tf2Var, i)) {
            encodeSerializableValue(bg2Var, t);
        }
    }

    @Override // defpackage.yi0
    public void encodeSerializableValue(bg2 bg2Var, Object obj) {
        bg2Var.getClass();
        bg2Var.serialize(this, obj);
    }

    @Override // defpackage.yi0
    public abstract void encodeShort(short s);

    @Override // defpackage.kz
    public final void encodeShortElement(tf2 tf2Var, int i, short s) {
        tf2Var.getClass();
        if (encodeElement(tf2Var, i)) {
            encodeShort(s);
        }
    }

    @Override // defpackage.yi0
    public abstract void encodeString(String str);

    @Override // defpackage.kz
    public final void encodeStringElement(tf2 tf2Var, int i, String str) {
        tf2Var.getClass();
        str.getClass();
        if (encodeElement(tf2Var, i)) {
            encodeString(str);
        }
    }

    public void encodeValue(Object obj) {
        obj.getClass();
        throw new IllegalArgumentException("Non-serializable " + a52.a(obj.getClass()) + " is not supported by " + a52.a(getClass()) + " encoder");
    }

    public void endStructure(tf2 tf2Var) {
        tf2Var.getClass();
    }

    public boolean shouldEncodeElementDefault(tf2 tf2Var, int i) {
        tf2Var.getClass();
        return true;
    }
}
