package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class p93 {
    public static final p93 m;
    public static final p93 n;
    public static final p93 o;
    public static final p93 p;
    public static final /* synthetic */ p93[] q;
    public static final /* synthetic */ fj0 r;
    public final char a;
    public final char b;

    static {
        p93 p93Var = new p93("OBJ", 0, '{', '}');
        m = p93Var;
        p93 p93Var2 = new p93("LIST", 1, '[', ']');
        n = p93Var2;
        p93 p93Var3 = new p93("MAP", 2, '{', '}');
        o = p93Var3;
        p93 p93Var4 = new p93("POLY_OBJ", 3, '[', ']');
        p = p93Var4;
        p93[] p93VarArr = {p93Var, p93Var2, p93Var3, p93Var4};
        q = p93VarArr;
        r = new fj0(p93VarArr);
    }

    public p93(String str, int i, char c, char c2) {
        this.a = c;
        this.b = c2;
    }

    public static p93 valueOf(String str) {
        return (p93) Enum.valueOf(p93.class, str);
    }

    public static p93[] values() {
        return (p93[]) q.clone();
    }
}
