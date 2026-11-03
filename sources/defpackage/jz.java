package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public interface jz {
    boolean decodeBooleanElement(tf2 tf2Var, int i);

    byte decodeByteElement(tf2 tf2Var, int i);

    char decodeCharElement(tf2 tf2Var, int i);

    int decodeCollectionSize(tf2 tf2Var);

    double decodeDoubleElement(tf2 tf2Var, int i);

    int decodeElementIndex(tf2 tf2Var);

    float decodeFloatElement(tf2 tf2Var, int i);

    ob0 decodeInlineElement(tf2 tf2Var, int i);

    int decodeIntElement(tf2 tf2Var, int i);

    long decodeLongElement(tf2 tf2Var, int i);

    Object decodeNullableSerializableElement(tf2 tf2Var, int i, nd0 nd0Var, Object obj);

    boolean decodeSequentially();

    Object decodeSerializableElement(tf2 tf2Var, int i, nd0 nd0Var, Object obj);

    short decodeShortElement(tf2 tf2Var, int i);

    String decodeStringElement(tf2 tf2Var, int i);

    void endStructure(tf2 tf2Var);

    eg2 getSerializersModule();
}
