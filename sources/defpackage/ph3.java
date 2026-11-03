package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class ph3 extends ue3 {
    public final String c;
    public final Set d;
    public final Set e;
    public final Set f;
    public final Set g;
    public final Set h;
    public final Set i;
    public final String j;
    public final String k;
    public final int l;
    public final Boolean m;
    public final Set n;
    public final mh2 o;
    public final Set p;
    public final String q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ph3(int i, String str, String str2, Set set, Set set2, Set set3, Set set4, Set set5, Set set6, String str3, String str4, int i2, Boolean bool, Set set7, mh2 mh2Var, Set set8, String str5, int i3) {
        super(i, str);
        String str6 = (i3 & 4) != 0 ? null : str2;
        Set linkedHashSet = (i3 & 8) != 0 ? new LinkedHashSet() : set;
        Set linkedHashSet2 = (i3 & 16) != 0 ? new LinkedHashSet() : set2;
        Set linkedHashSet3 = (i3 & 32) != 0 ? new LinkedHashSet() : set3;
        Set linkedHashSet4 = (i3 & 64) != 0 ? new LinkedHashSet() : set4;
        Set linkedHashSet5 = (i3 & 128) != 0 ? new LinkedHashSet() : set5;
        Set linkedHashSet6 = (i3 & 256) != 0 ? new LinkedHashSet() : set6;
        String str7 = (i3 & 512) != 0 ? "" : str3;
        String str8 = (i3 & 1024) != 0 ? null : str4;
        int i4 = (i3 & 4096) != 0 ? -1 : i2;
        Boolean bool2 = (32768 & i3) == 0 ? bool : null;
        Set linkedHashSet7 = (65536 & i3) != 0 ? new LinkedHashSet() : set7;
        Set linkedHashSet8 = (262144 & i3) != 0 ? new LinkedHashSet() : set8;
        String str9 = (i3 & 524288) == 0 ? str5 : "";
        str.getClass();
        this.c = str6;
        this.d = linkedHashSet;
        this.e = linkedHashSet2;
        this.f = linkedHashSet3;
        this.g = linkedHashSet4;
        this.h = linkedHashSet5;
        this.i = linkedHashSet6;
        this.j = str7;
        this.k = str8;
        this.l = i4;
        this.m = bool2;
        this.n = linkedHashSet7;
        this.o = mh2Var;
        this.p = linkedHashSet8;
        this.q = str9;
    }
}
