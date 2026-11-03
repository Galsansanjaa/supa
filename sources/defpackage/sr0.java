package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class sr0 {
    public static final sr0 d = new sr0("", "", false);
    public final String a;
    public final String b;
    public final boolean c;

    static {
        new sr0("\n", "  ", true);
    }

    public sr0(String str, String str2, boolean z) {
        if (!str.matches("[\r\n]*")) {
            v5.m("Only combinations of \\n and \\r are allowed in newline.");
            throw null;
        }
        if (!str2.matches("[ \t]*")) {
            v5.m("Only combinations of spaces and tabs are allowed in indent.");
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = z;
    }
}
