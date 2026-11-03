package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public interface kz {
    void encodeBooleanElement(tf2 tf2Var, int i, boolean z);

    void encodeByteElement(tf2 tf2Var, int i, byte b);

    void encodeCharElement(tf2 tf2Var, int i, char c);

    void encodeDoubleElement(tf2 tf2Var, int i, double d);

    void encodeFloatElement(tf2 tf2Var, int i, float f);

    yi0 encodeInlineElement(tf2 tf2Var, int i);

    void encodeIntElement(tf2 tf2Var, int i, int i2);

    void encodeLongElement(tf2 tf2Var, int i, long j);

    void encodeNullableSerializableElement(tf2 tf2Var, int i, bg2 bg2Var, Object obj);

    void encodeSerializableElement(tf2 tf2Var, int i, bg2 bg2Var, Object obj);

    void encodeShortElement(tf2 tf2Var, int i, short s);

    void encodeStringElement(tf2 tf2Var, int i, String str);

    void endStructure(tf2 tf2Var);

    boolean shouldEncodeElementDefault(tf2 tf2Var, int i);
}
