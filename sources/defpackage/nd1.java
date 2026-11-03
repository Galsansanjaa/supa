package defpackage;

import java.io.BufferedReader;
import java.util.Iterator;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class nd1 implements Iterator, fa1 {
    public String a;
    public boolean b;
    public final /* synthetic */ yd m;

    public nd1(yd ydVar) {
        this.m = ydVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str = this.a;
        if (str == null && !this.b) {
            str = ((BufferedReader) this.m.b).readLine();
            this.a = str;
            if (str == null) {
                this.b = true;
            }
        }
        return str != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            f31.b();
            return null;
        }
        String str = this.a;
        this.a = null;
        str.getClass();
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
