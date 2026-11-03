package defpackage;

import android.os.StrictMode;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class ka4 {
    public static final md0 h = new md0(1);
    public static final s94 i;
    public volatile tr a;
    public final o64 b;
    public final String c;
    public final boolean d;
    public final k21 e;
    public final s83 f;
    public final hb4 g;

    static {
        rr3 rr3Var = rr3.c;
        int i2 = k21.m;
        i = new s94(rr3Var, false, y52.t);
    }

    public ka4(o64 o64Var, s94 s94Var) {
        this.b = o64Var;
        String a = s94Var.a(o64Var.b);
        this.c = a;
        this.d = s94Var.b;
        this.e = s94Var.c;
        this.a = null;
        this.f = new s83();
        this.g = new hb4(o64Var, a);
    }

    public final tr a() {
        tr trVar;
        tr trVar2 = this.a;
        if (trVar2 != null) {
            return trVar2;
        }
        synchronized (this) {
            try {
                trVar = this.a;
                if (trVar == null) {
                    StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
                    try {
                        tr a = this.g.a();
                        StrictMode.setThreadPolicy(allowThreadDiskWrites);
                        int i2 = ((a32) a.e).c - 2;
                        if (i2 != 15 && i2 != 16) {
                            o64 o64Var = this.b;
                            o64Var.g.a();
                            if (this.d || this.g.b() || !((String) a.b).isEmpty()) {
                                final int i3 = 2;
                                o64Var.a().execute(new Runnable(this) { // from class: v94
                                    public final /* synthetic */ ka4 b;

                                    {
                                        this.b = this;
                                    }

                                    /* JADX WARN: Removed duplicated region for block: B:65:0x015e A[Catch: all -> 0x0148, TryCatch #1 {all -> 0x0148, blocks: (B:55:0x013f, B:58:0x0145, B:59:0x014a, B:61:0x0152, B:65:0x015e, B:66:0x0196, B:67:0x0183, B:69:0x0159, B:70:0x01a6), top: B:54:0x013f }] */
                                    /* JADX WARN: Removed duplicated region for block: B:67:0x0183 A[Catch: all -> 0x0148, TryCatch #1 {all -> 0x0148, blocks: (B:55:0x013f, B:58:0x0145, B:59:0x014a, B:61:0x0152, B:65:0x015e, B:66:0x0196, B:67:0x0183, B:69:0x0159, B:70:0x01a6), top: B:54:0x013f }] */
                                    @Override // java.lang.Runnable
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                        To view partially-correct add '--show-bad-code' argument
                                    */
                                    public final void run() {
                                        /*
                                            Method dump skipped, instructions count: 440
                                            To view this dump add '--comments-level debug' option
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: defpackage.v94.run():void");
                                    }
                                });
                                o64Var.a.e((vo3) a.c, this.e, this.c);
                                if (this.g.b()) {
                                    final int i4 = 1;
                                    o64Var.a().execute(new Runnable(this) { // from class: v94
                                        public final /* synthetic */ ka4 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            /*  JADX ERROR: Method code generation error
                                                java.lang.NullPointerException
                                                	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
                                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
                                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                                */
                                            /*
                                                Method dump skipped, instructions count: 440
                                                To view this dump add '--comments-level debug' option
                                            */
                                            throw new UnsupportedOperationException("Method not decompiled: defpackage.v94.run():void");
                                        }
                                    });
                                }
                            } else {
                                final int i5 = 0;
                                o64Var.a().execute(new Runnable(this) { // from class: v94
                                    public final /* synthetic */ ka4 b;

                                    {
                                        this.b = this;
                                    }

                                    /*  JADX ERROR: Method code generation error
                                        java.lang.NullPointerException
                                        	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
                                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                        */
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        /*
                                            Method dump skipped, instructions count: 440
                                            To view this dump add '--comments-level debug' option
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: defpackage.v94.run():void");
                                    }
                                });
                                trVar = new tr(jb4.y(), (a32) a.e);
                                if (this.d || ((a32) trVar.e).c != 17) {
                                    this.a = trVar;
                                }
                            }
                        }
                        trVar = a;
                        if (this.d) {
                        }
                        this.a = trVar;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(allowThreadDiskWrites);
                        throw th;
                    }
                }
            } finally {
            }
        }
        return trVar;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [y41, java.lang.Object] */
    public final void b() {
        hb4 hb4Var = this.g;
        o64 o64Var = hb4Var.a;
        s74 s74Var = (s74) o64Var.d.get();
        String str = hb4Var.c;
        s74Var.getClass();
        str.getClass();
        v54 v54Var = s74Var.a;
        ll2 b = ll2.b();
        ?? obj = new Object();
        obj.a = str;
        b.c = obj;
        i b2 = s74.b(v54Var.b(0, b.a()).e(zd0.a, new q14(7)));
        rr3 rr3Var = rr3.d;
        hl1 a = o64Var.a();
        int i2 = k1.u;
        k1 k1Var = new k1(b2, rr3Var);
        b2.addListener(k1Var, ej1.H(a, k1Var));
        y94 y94Var = new y94(hb4Var, 1);
        o64 o64Var2 = this.b;
        k1.p(k1Var, y94Var, o64Var2.a()).addListener(new d84(5, this, k1Var), o64Var2.a());
    }
}
