package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class lp3 {
    public static final lp3 b;
    public static final lp3 m;
    public static final lp3[] n;
    public static final /* synthetic */ lp3[] o;
    public final int a;

    /* JADX INFO: Fake field, exist only in values array */
    lp3 EF0;

    static {
        eq3 eq3Var = eq3.DOUBLE;
        lp3 lp3Var = new lp3("DOUBLE", 0, 0, 1, eq3Var);
        eq3 eq3Var2 = eq3.FLOAT;
        lp3 lp3Var2 = new lp3("FLOAT", 1, 1, 1, eq3Var2);
        eq3 eq3Var3 = eq3.LONG;
        lp3 lp3Var3 = new lp3("INT64", 2, 2, 1, eq3Var3);
        lp3 lp3Var4 = new lp3("UINT64", 3, 3, 1, eq3Var3);
        eq3 eq3Var4 = eq3.INT;
        lp3 lp3Var5 = new lp3("INT32", 4, 4, 1, eq3Var4);
        lp3 lp3Var6 = new lp3("FIXED64", 5, 5, 1, eq3Var3);
        lp3 lp3Var7 = new lp3("FIXED32", 6, 6, 1, eq3Var4);
        eq3 eq3Var5 = eq3.BOOLEAN;
        lp3 lp3Var8 = new lp3("BOOL", 7, 7, 1, eq3Var5);
        eq3 eq3Var6 = eq3.STRING;
        lp3 lp3Var9 = new lp3("STRING", 8, 8, 1, eq3Var6);
        eq3 eq3Var7 = eq3.MESSAGE;
        lp3 lp3Var10 = new lp3("MESSAGE", 9, 9, 1, eq3Var7);
        eq3 eq3Var8 = eq3.BYTE_STRING;
        lp3 lp3Var11 = new lp3("BYTES", 10, 10, 1, eq3Var8);
        lp3 lp3Var12 = new lp3("UINT32", 11, 11, 1, eq3Var4);
        eq3 eq3Var9 = eq3.ENUM;
        lp3 lp3Var13 = new lp3("ENUM", 12, 12, 1, eq3Var9);
        lp3 lp3Var14 = new lp3("SFIXED32", 13, 13, 1, eq3Var4);
        lp3 lp3Var15 = new lp3("SFIXED64", 14, 14, 1, eq3Var3);
        lp3 lp3Var16 = new lp3("SINT32", 15, 15, 1, eq3Var4);
        lp3 lp3Var17 = new lp3("SINT64", 16, 16, 1, eq3Var3);
        lp3 lp3Var18 = new lp3("GROUP", 17, 17, 1, eq3Var7);
        lp3 lp3Var19 = new lp3("DOUBLE_LIST", 18, 18, 2, eq3Var);
        lp3 lp3Var20 = new lp3("FLOAT_LIST", 19, 19, 2, eq3Var2);
        lp3 lp3Var21 = new lp3("INT64_LIST", 20, 20, 2, eq3Var3);
        lp3 lp3Var22 = new lp3("UINT64_LIST", 21, 21, 2, eq3Var3);
        lp3 lp3Var23 = new lp3("INT32_LIST", 22, 22, 2, eq3Var4);
        lp3 lp3Var24 = new lp3("FIXED64_LIST", 23, 23, 2, eq3Var3);
        lp3 lp3Var25 = new lp3("FIXED32_LIST", 24, 24, 2, eq3Var4);
        lp3 lp3Var26 = new lp3("BOOL_LIST", 25, 25, 2, eq3Var5);
        lp3 lp3Var27 = new lp3("STRING_LIST", 26, 26, 2, eq3Var6);
        lp3 lp3Var28 = new lp3("MESSAGE_LIST", 27, 27, 2, eq3Var7);
        lp3 lp3Var29 = new lp3("BYTES_LIST", 28, 28, 2, eq3Var8);
        lp3 lp3Var30 = new lp3("UINT32_LIST", 29, 29, 2, eq3Var4);
        lp3 lp3Var31 = new lp3("ENUM_LIST", 30, 30, 2, eq3Var9);
        lp3 lp3Var32 = new lp3("SFIXED32_LIST", 31, 31, 2, eq3Var4);
        lp3 lp3Var33 = new lp3("SFIXED64_LIST", 32, 32, 2, eq3Var3);
        lp3 lp3Var34 = new lp3("SINT32_LIST", 33, 33, 2, eq3Var4);
        lp3 lp3Var35 = new lp3("SINT64_LIST", 34, 34, 2, eq3Var3);
        lp3 lp3Var36 = new lp3("DOUBLE_LIST_PACKED", 35, 35, 3, eq3Var);
        b = lp3Var36;
        lp3 lp3Var37 = new lp3("FLOAT_LIST_PACKED", 36, 36, 3, eq3Var2);
        lp3 lp3Var38 = new lp3("INT64_LIST_PACKED", 37, 37, 3, eq3Var3);
        lp3 lp3Var39 = new lp3("UINT64_LIST_PACKED", 38, 38, 3, eq3Var3);
        lp3 lp3Var40 = new lp3("INT32_LIST_PACKED", 39, 39, 3, eq3Var4);
        lp3 lp3Var41 = new lp3("FIXED64_LIST_PACKED", 40, 40, 3, eq3Var3);
        lp3 lp3Var42 = new lp3("FIXED32_LIST_PACKED", 41, 41, 3, eq3Var4);
        lp3 lp3Var43 = new lp3("BOOL_LIST_PACKED", 42, 42, 3, eq3Var5);
        lp3 lp3Var44 = new lp3("UINT32_LIST_PACKED", 43, 43, 3, eq3Var4);
        lp3 lp3Var45 = new lp3("ENUM_LIST_PACKED", 44, 44, 3, eq3Var9);
        lp3 lp3Var46 = new lp3("SFIXED32_LIST_PACKED", 45, 45, 3, eq3Var4);
        lp3 lp3Var47 = new lp3("SFIXED64_LIST_PACKED", 46, 46, 3, eq3Var3);
        lp3 lp3Var48 = new lp3("SINT32_LIST_PACKED", 47, 47, 3, eq3Var4);
        lp3 lp3Var49 = new lp3("SINT64_LIST_PACKED", 48, 48, 3, eq3Var3);
        m = lp3Var49;
        o = new lp3[]{lp3Var, lp3Var2, lp3Var3, lp3Var4, lp3Var5, lp3Var6, lp3Var7, lp3Var8, lp3Var9, lp3Var10, lp3Var11, lp3Var12, lp3Var13, lp3Var14, lp3Var15, lp3Var16, lp3Var17, lp3Var18, lp3Var19, lp3Var20, lp3Var21, lp3Var22, lp3Var23, lp3Var24, lp3Var25, lp3Var26, lp3Var27, lp3Var28, lp3Var29, lp3Var30, lp3Var31, lp3Var32, lp3Var33, lp3Var34, lp3Var35, lp3Var36, lp3Var37, lp3Var38, lp3Var39, lp3Var40, lp3Var41, lp3Var42, lp3Var43, lp3Var44, lp3Var45, lp3Var46, lp3Var47, lp3Var48, lp3Var49, new lp3("GROUP_LIST", 49, 49, 2, eq3Var7), new lp3("MAP", 50, 50, 4, eq3.VOID)};
        lp3[] values = values();
        n = new lp3[values.length];
        for (lp3 lp3Var50 : values) {
            n[lp3Var50.a] = lp3Var50;
        }
    }

    public lp3(String str, int i, int i2, int i3, eq3 eq3Var) {
        this.a = i2;
        int i4 = i3 - 1;
        if (i4 == 1) {
            Class cls = eq3Var.a;
        } else if (i4 == 3) {
            Class cls2 = eq3Var.a;
        }
        if (i3 == 1) {
            eq3 eq3Var2 = eq3.VOID;
            eq3Var.ordinal();
        }
    }

    public static lp3[] values() {
        return (lp3[]) o.clone();
    }
}
