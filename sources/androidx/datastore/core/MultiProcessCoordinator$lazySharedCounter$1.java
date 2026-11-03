package androidx.datastore.core;

import androidx.datastore.core.SharedCounter;
import defpackage.bb1;
import defpackage.os0;
import java.io.File;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class MultiProcessCoordinator$lazySharedCounter$1 extends bb1 implements os0 {
    final /* synthetic */ MultiProcessCoordinator this$0;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* renamed from: androidx.datastore.core.MultiProcessCoordinator$lazySharedCounter$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends bb1 implements os0 {
        final /* synthetic */ MultiProcessCoordinator this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MultiProcessCoordinator multiProcessCoordinator) {
            super(0);
            this.this$0 = multiProcessCoordinator;
        }

        @Override // defpackage.os0
        public final File invoke() {
            String str;
            File fileWithSuffix;
            MultiProcessCoordinator multiProcessCoordinator = this.this$0;
            str = multiProcessCoordinator.VERSION_SUFFIX;
            fileWithSuffix = multiProcessCoordinator.fileWithSuffix(str);
            this.this$0.createIfNotExists(fileWithSuffix);
            return fileWithSuffix;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiProcessCoordinator$lazySharedCounter$1(MultiProcessCoordinator multiProcessCoordinator) {
        super(0);
        this.this$0 = multiProcessCoordinator;
    }

    @Override // defpackage.os0
    public final SharedCounter invoke() {
        SharedCounter.Factory factory = SharedCounter.Factory;
        factory.loadLib();
        return factory.create$datastore_core_release(new AnonymousClass1(this.this$0));
    }
}
