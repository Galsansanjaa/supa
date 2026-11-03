package defpackage;

import java.util.List;
import java.util.regex.Matcher;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class oi1 implements ki1 {
    public final Matcher a;
    public final CharSequence b;
    public final ni1 c;
    public li1 d;

    public oi1(Matcher matcher, CharSequence charSequence) {
        charSequence.getClass();
        this.a = matcher;
        this.b = charSequence;
        this.c = new ni1(this, 0);
    }

    public final List a() {
        li1 li1Var = this.d;
        if (li1Var != null) {
            return li1Var;
        }
        li1 li1Var2 = new li1(this);
        this.d = li1Var2;
        return li1Var2;
    }

    public final i61 b() {
        Matcher matcher = this.a;
        return ea0.M(matcher.start(), matcher.end());
    }

    public final oi1 c() {
        Matcher matcher = this.a;
        int end = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        CharSequence charSequence = this.b;
        if (end > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        matcher2.getClass();
        return jh2.w(matcher2, end, charSequence);
    }
}
