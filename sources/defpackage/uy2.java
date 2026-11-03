package defpackage;

import java.util.function.Predicate;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class uy2 implements ia0 {
    public final /* synthetic */ int a;
    public Predicate b;
    public Object c;

    public uy2(Predicate predicate) {
        this.a = 0;
        this.c = null;
        this.b = predicate;
        setValue('-');
    }

    @Override // defpackage.ia0
    public final Object getValue() {
        switch (this.a) {
            case 0:
                return (Character) this.c;
            default:
                return (Integer) this.c;
        }
    }

    @Override // defpackage.ia0
    public final void setValue(Object obj) {
        switch (this.a) {
            case 0:
                Character valueOf = Character.valueOf(obj.toString().charAt(0));
                if (this.b.test(valueOf)) {
                    this.c = valueOf;
                    return;
                }
                throw new RuntimeException("Invalid value '" + valueOf + "'");
            default:
                ((s50) this.b).getClass();
                this.c = (Integer) obj;
                return;
        }
    }
}
