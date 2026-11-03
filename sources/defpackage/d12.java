package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class d12 implements r63 {
    public boolean a = false;
    public boolean b = false;
    public em0 c;
    public final c12 d;

    public d12(c12 c12Var) {
        this.d = c12Var;
    }

    @Override // defpackage.r63
    public final r63 b(String str) {
        if (this.a) {
            throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.a = true;
        this.d.i(this.c, str, this.b);
        return this;
    }

    @Override // defpackage.r63
    public final r63 c(boolean z) {
        if (this.a) {
            throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.a = true;
        this.d.c(this.c, z ? 1 : 0, this.b);
        return this;
    }
}
