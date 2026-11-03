package androidx.datastore.core;

import defpackage.nm1;
import defpackage.v42;
import defpackage.z42;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class DataStoreImpl$InitDataStore$doRun$initData$1$api$1<T> implements InitializerApi<T> {
    final /* synthetic */ z42 $currentData;
    final /* synthetic */ v42 $initializationComplete;
    final /* synthetic */ nm1 $updateLock;
    final /* synthetic */ DataStoreImpl<T> this$0;

    public DataStoreImpl$InitDataStore$doRun$initData$1$api$1(nm1 nm1Var, v42 v42Var, z42 z42Var, DataStoreImpl<T> dataStoreImpl) {
        this.$updateLock = nm1Var;
        this.$initializationComplete = v42Var;
        this.$currentData = z42Var;
        this.this$0 = dataStoreImpl;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x008d, code lost:
    
        if (r10.lock(null, r0) == r6) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b4 A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #1 {all -> 0x0052, blocks: (B:27:0x004e, B:28:0x00ac, B:30:0x00b4), top: B:26:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0094 A[Catch: all -> 0x00d0, TRY_LEAVE, TryCatch #0 {all -> 0x00d0, blocks: (B:40:0x0090, B:42:0x0094, B:45:0x00d3, B:46:0x00da), top: B:39:0x0090 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d3 A[Catch: all -> 0x00d0, TRY_ENTER, TryCatch #0 {all -> 0x00d0, blocks: (B:40:0x0090, B:42:0x0094, B:45:0x00d3, B:46:0x00da), top: B:39:0x0090 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // androidx.datastore.core.InitializerApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object updateData(defpackage.ts0 r9, defpackage.a10 r10) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1$api$1.updateData(ts0, a10):java.lang.Object");
    }
}
