package defpackage;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateSet;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class z0 implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Collection b;

    public /* synthetic */ z0(Collection collection, int i) {
        this.a = i;
        this.b = collection;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        boolean e;
        int i = this.a;
        Collection collection = this.b;
        switch (i) {
            case 0:
                e = AbstractPersistentList.e(collection, obj);
                break;
            case 1:
                e = AbstractPersistentList.c(collection, obj);
                break;
            case 2:
                e = collection.contains(obj);
                break;
            case 3:
                e = PersistentVectorBuilder.c(collection, obj);
                break;
            case 4:
                e = SnapshotStateList.e(collection, (List) obj);
                break;
            default:
                e = SnapshotStateSet.c(collection, (Set) obj);
                break;
        }
        return Boolean.valueOf(e);
    }
}
