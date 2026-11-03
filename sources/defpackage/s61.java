package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class s61 implements Runnable {
    public static final /* synthetic */ s61 b = new s61(1);
    public static final /* synthetic */ s61 m = new s61(2);
    public final /* synthetic */ int a;

    public /* synthetic */ s61(int i) {
        this.a = i;
    }

    private final void a() {
    }

    private final /* synthetic */ void b() {
    }

    private final /* synthetic */ void c() {
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r5 = this;
            int r5 = r5.a
            switch(r5) {
                case 0: goto L5b;
                case 1: goto L5b;
                case 2: goto L5b;
                default: goto L5;
            }
        L5:
            java.lang.String r5 = "PhenotypeProcessReaper"
            android.app.ActivityManager$RunningAppProcessInfo r0 = new android.app.ActivityManager$RunningAppProcessInfo
            r0.<init>()
            r1 = 0
            android.app.ActivityManager.getMyMemoryState(r0)     // Catch: java.lang.RuntimeException -> L3a
            int r2 = r0.importance
            java.lang.String r3 = java.lang.String.valueOf(r2)
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r3 = r3 + 17
            r4.<init>(r3)
            java.lang.String r3 = "Memory state is: "
            r4.append(r3)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            android.util.Log.i(r5, r2)
            int r0 = r0.importance
            r2 = 400(0x190, float:5.6E-43)
            if (r0 < r2) goto L38
            r0 = 1
            goto L41
        L38:
            r0 = r1
            goto L41
        L3a:
            r0 = move-exception
            java.lang.String r2 = "Failed to retrieve memory state, not killing process."
            android.util.Log.w(r5, r2, r0)
            goto L38
        L41:
            java.lang.Boolean r2 = new java.lang.Boolean
            r2.<init>(r0)
            boolean r0 = r2.booleanValue()
            if (r0 == 0) goto L5b
            java.lang.String r0 = "Killing process to refresh experiment configuration"
            android.util.Log.i(r5, r0)
            int r5 = android.os.Process.myPid()
            android.os.Process.killProcess(r5)
            java.lang.System.exit(r1)
        L5b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s61.run():void");
    }
}
