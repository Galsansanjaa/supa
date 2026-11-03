package defpackage;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class ql2 implements dd0 {
    public final char a;
    public int b = 0;
    public final LinkedList c = new LinkedList();

    public ql2(char c) {
        this.a = c;
    }

    @Override // defpackage.dd0
    public final void a(ep2 ep2Var, ep2 ep2Var2, int i) {
        dd0 dd0Var;
        LinkedList linkedList = this.c;
        Iterator it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                dd0Var = (dd0) linkedList.getFirst();
                break;
            } else {
                dd0Var = (dd0) it.next();
                if (dd0Var.c() <= i) {
                    break;
                }
            }
        }
        dd0Var.a(ep2Var, ep2Var2, i);
    }

    @Override // defpackage.dd0
    public final char b() {
        return this.a;
    }

    @Override // defpackage.dd0
    public final int c() {
        return this.b;
    }

    @Override // defpackage.dd0
    public final int d(cd0 cd0Var, cd0 cd0Var2) {
        dd0 dd0Var;
        int i = cd0Var.g;
        LinkedList linkedList = this.c;
        Iterator it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                dd0Var = (dd0) linkedList.getFirst();
                break;
            }
            dd0Var = (dd0) it.next();
            if (dd0Var.c() <= i) {
                break;
            }
        }
        return dd0Var.d(cd0Var, cd0Var2);
    }

    @Override // defpackage.dd0
    public final char e() {
        return this.a;
    }

    public final void f(dd0 dd0Var) {
        int c = dd0Var.c();
        LinkedList linkedList = this.c;
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            int c2 = ((dd0) listIterator.next()).c();
            if (c > c2) {
                listIterator.previous();
                listIterator.add(dd0Var);
                return;
            } else if (c == c2) {
                throw new IllegalArgumentException("Cannot add two delimiter processors for char '" + this.a + "' and minimum length " + c);
            }
        }
        linkedList.add(dd0Var);
        this.b = c;
    }
}
