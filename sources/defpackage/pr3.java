package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF2' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class pr3 {
    public static final pr3 m;
    public static final pr3 n;
    public static final pr3 o;
    public static final /* synthetic */ pr3[] p;
    public final qr3 a;
    public final int b;

    /* JADX INFO: Fake field, exist only in values array */
    pr3 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    pr3 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    pr3 EF2;

    static {
        pr3 pr3Var = new pr3("DOUBLE", 0, qr3.n, 1);
        pr3 pr3Var2 = new pr3("FLOAT", 1, qr3.m, 5);
        qr3 qr3Var = qr3.b;
        pr3 pr3Var3 = new pr3("INT64", 2, qr3Var, 0);
        pr3 pr3Var4 = new pr3("UINT64", 3, qr3Var, 0);
        qr3 qr3Var2 = qr3.a;
        pr3 pr3Var5 = new pr3("INT32", 4, qr3Var2, 0);
        pr3 pr3Var6 = new pr3("FIXED64", 5, qr3Var, 1);
        pr3 pr3Var7 = new pr3("FIXED32", 6, qr3Var2, 5);
        pr3 pr3Var8 = new pr3("BOOL", 7, qr3.o, 0);
        pr3 pr3Var9 = new pr3("STRING", 8, qr3.p, 2);
        m = pr3Var9;
        qr3 qr3Var3 = qr3.s;
        pr3 pr3Var10 = new pr3("GROUP", 9, qr3Var3, 3);
        n = pr3Var10;
        pr3 pr3Var11 = new pr3("MESSAGE", 10, qr3Var3, 2);
        o = pr3Var11;
        p = new pr3[]{pr3Var, pr3Var2, pr3Var3, pr3Var4, pr3Var5, pr3Var6, pr3Var7, pr3Var8, pr3Var9, pr3Var10, pr3Var11, new pr3("BYTES", 11, qr3.q, 2), new pr3("UINT32", 12, qr3Var2, 0), new pr3("ENUM", 13, qr3.r, 0), new pr3("SFIXED32", 14, qr3Var2, 5), new pr3("SFIXED64", 15, qr3Var, 1), new pr3("SINT32", 16, qr3Var2, 0), new pr3("SINT64", 17, qr3Var, 0)};
    }

    public pr3(String str, int i, qr3 qr3Var, int i2) {
        this.a = qr3Var;
        this.b = i2;
    }

    public static pr3[] values() {
        return (pr3[]) p.clone();
    }
}
