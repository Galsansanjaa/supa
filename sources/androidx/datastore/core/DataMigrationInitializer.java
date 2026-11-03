package androidx.datastore.core;

import defpackage.sb0;
import defpackage.ts0;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class DataMigrationInitializer<T> {
    public static final Companion Companion = new Companion(null);

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0093  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0096  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0081 -> B:13:0x0064). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0084 -> B:13:0x0064). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final <T> java.lang.Object runMigrations(java.util.List<? extends androidx.datastore.core.DataMigration<T>> r6, androidx.datastore.core.InitializerApi<T> r7, defpackage.a10 r8) {
            /*
                r5 = this;
                boolean r0 = r8 instanceof androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1
                if (r0 == 0) goto L13
                r0 = r8
                androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1 r0 = (androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1 r0 = new androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1
                r0.<init>(r5, r8)
            L18:
                java.lang.Object r5 = r0.result
                int r8 = r0.label
                r1 = 0
                r2 = 2
                r3 = 1
                e50 r4 = defpackage.e50.a
                if (r8 == 0) goto L43
                if (r8 == r3) goto L3b
                if (r8 != r2) goto L35
                java.lang.Object r6 = r0.L$1
                java.util.Iterator r6 = (java.util.Iterator) r6
                java.lang.Object r7 = r0.L$0
                z42 r7 = (defpackage.z42) r7
                defpackage.ta3.H(r5)     // Catch: java.lang.Throwable -> L33
                goto L64
            L33:
                r5 = move-exception
                goto L7d
            L35:
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.hu2.h(r5)
                return r1
            L3b:
                java.lang.Object r6 = r0.L$0
                java.util.List r6 = (java.util.List) r6
                defpackage.ta3.H(r5)
                goto L58
            L43:
                java.util.ArrayList r5 = defpackage.lt.E(r5)
                androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2 r8 = new androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2
                r8.<init>(r6, r5, r1)
                r0.L$0 = r5
                r0.label = r3
                java.lang.Object r6 = r7.updateData(r8, r0)
                if (r6 != r4) goto L57
                goto L7c
            L57:
                r6 = r5
            L58:
                z42 r5 = new z42
                r5.<init>()
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                java.util.Iterator r6 = r6.iterator()
                r7 = r5
            L64:
                boolean r5 = r6.hasNext()
                if (r5 == 0) goto L8d
                java.lang.Object r5 = r6.next()
                ps0 r5 = (defpackage.ps0) r5
                r0.L$0 = r7     // Catch: java.lang.Throwable -> L33
                r0.L$1 = r6     // Catch: java.lang.Throwable -> L33
                r0.label = r2     // Catch: java.lang.Throwable -> L33
                java.lang.Object r5 = r5.invoke(r0)     // Catch: java.lang.Throwable -> L33
                if (r5 != r4) goto L64
            L7c:
                return r4
            L7d:
                java.lang.Object r8 = r7.a
                if (r8 != 0) goto L84
                r7.a = r5
                goto L64
            L84:
                r8.getClass()
                java.lang.Throwable r8 = (java.lang.Throwable) r8
                defpackage.jh2.i(r8, r5)
                goto L64
            L8d:
                java.lang.Object r5 = r7.a
                java.lang.Throwable r5 = (java.lang.Throwable) r5
                if (r5 != 0) goto L96
                vy2 r5 = defpackage.vy2.a
                return r5
            L96:
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataMigrationInitializer.Companion.runMigrations(java.util.List, androidx.datastore.core.InitializerApi, a10):java.lang.Object");
        }

        public final <T> ts0 getInitializer(List<? extends DataMigration<T>> list) {
            list.getClass();
            return new DataMigrationInitializer$Companion$getInitializer$1(list, null);
        }
    }
}
