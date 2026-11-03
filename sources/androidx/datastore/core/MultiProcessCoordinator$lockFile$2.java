package androidx.datastore.core;

import defpackage.bb1;
import defpackage.os0;
import java.io.File;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class MultiProcessCoordinator$lockFile$2 extends bb1 implements os0 {
    final /* synthetic */ MultiProcessCoordinator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiProcessCoordinator$lockFile$2(MultiProcessCoordinator multiProcessCoordinator) {
        super(0);
        this.this$0 = multiProcessCoordinator;
    }

    @Override // defpackage.os0
    public final File invoke() {
        String str;
        File fileWithSuffix;
        MultiProcessCoordinator multiProcessCoordinator = this.this$0;
        str = multiProcessCoordinator.LOCK_SUFFIX;
        fileWithSuffix = multiProcessCoordinator.fileWithSuffix(str);
        this.this$0.createIfNotExists(fileWithSuffix);
        return fileWithSuffix;
    }
}
