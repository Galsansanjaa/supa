package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public interface yi0 {
    kz beginCollection(tf2 tf2Var, int i);

    kz beginStructure(tf2 tf2Var);

    void encodeBoolean(boolean z);

    void encodeByte(byte b);

    void encodeChar(char c);

    void encodeDouble(double d);

    void encodeFloat(float f);

    yi0 encodeInline(tf2 tf2Var);

    void encodeInt(int i);

    void encodeLong(long j);

    void encodeNotNullMark();

    void encodeNull();

    void encodeSerializableValue(bg2 bg2Var, Object obj);

    void encodeShort(short s);

    void encodeString(String str);

    eg2 getSerializersModule();
}
