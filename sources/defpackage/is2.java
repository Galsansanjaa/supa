package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class is2 {
    public nt a;
    public ArrayList b;
    public int c;
    public hs2 d;
    public gs2 e;
    public ArrayList f;

    public is2(nt ntVar, ArrayList arrayList, int i) {
        ntVar = (i & 1) != 0 ? new nt(0, (String) null, 7) : ntVar;
        arrayList = (i & 2) != 0 ? new ArrayList() : arrayList;
        ntVar.getClass();
        arrayList.getClass();
        this.a = ntVar;
        this.b = arrayList;
        this.c = 0;
        this.d = hs2.a;
    }

    public final void a(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -816400034:
                    if (str.equals("latestsUpdates")) {
                        this.d = hs2.m;
                        return;
                    }
                    break;
                case 115029:
                    if (str.equals("top")) {
                        this.d = hs2.n;
                        return;
                    }
                    break;
                case 50511102:
                    if (str.equals("category")) {
                        this.d = hs2.o;
                        return;
                    }
                    break;
                case 500931502:
                    if (str.equals("featuredCarousel")) {
                        this.d = hs2.b;
                        return;
                    }
                    break;
                case 705447692:
                    if (str.equals("newReleases")) {
                        this.d = hs2.r;
                        return;
                    }
                    break;
                case 830993832:
                    if (str.equals("mainApp")) {
                        this.d = hs2.s;
                        return;
                    }
                    break;
                case 1090493483:
                    if (str.equals("related")) {
                        this.d = hs2.p;
                        return;
                    }
                    break;
                case 1270858532:
                    if (str.equals("floatingCategory")) {
                        this.d = hs2.q;
                        return;
                    }
                    break;
            }
        }
        this.d = hs2.a;
    }
}
