package androidx.lifecycle.viewmodel;

import androidx.lifecycle.viewmodel.CreationExtras;
import defpackage.cq;
import defpackage.ps0;
import defpackage.vy2;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class CreationExtrasKt {
    public static final CreationExtras CreationExtras() {
        return CreationExtras$default(null, null, 3, null);
    }

    public static final CreationExtras CreationExtras(CreationExtras creationExtras) {
        creationExtras.getClass();
        return CreationExtras$default(creationExtras, null, 2, null);
    }

    public static final CreationExtras CreationExtras(CreationExtras creationExtras, ps0 ps0Var) {
        creationExtras.getClass();
        ps0Var.getClass();
        MutableCreationExtras mutableCreationExtras = new MutableCreationExtras(creationExtras);
        ps0Var.invoke(mutableCreationExtras);
        return mutableCreationExtras;
    }

    public static /* synthetic */ CreationExtras CreationExtras$default(CreationExtras creationExtras, ps0 ps0Var, int i, Object obj) {
        if ((i & 1) != 0) {
            creationExtras = CreationExtras.Empty.INSTANCE;
        }
        if ((i & 2) != 0) {
            ps0Var = new cq(27);
        }
        return CreationExtras(creationExtras, ps0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vy2 CreationExtras$lambda$0(MutableCreationExtras mutableCreationExtras) {
        mutableCreationExtras.getClass();
        return vy2.a;
    }

    public static final boolean contains(CreationExtras creationExtras, CreationExtras.Key<?> key) {
        creationExtras.getClass();
        key.getClass();
        return creationExtras.getExtras$lifecycle_viewmodel().containsKey(key);
    }

    public static final MutableCreationExtras plus(CreationExtras creationExtras, CreationExtras creationExtras2) {
        creationExtras.getClass();
        creationExtras2.getClass();
        Map<CreationExtras.Key<?>, Object> extras$lifecycle_viewmodel = creationExtras.getExtras$lifecycle_viewmodel();
        Map<CreationExtras.Key<?>, Object> extras$lifecycle_viewmodel2 = creationExtras2.getExtras$lifecycle_viewmodel();
        extras$lifecycle_viewmodel.getClass();
        extras$lifecycle_viewmodel2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(extras$lifecycle_viewmodel);
        linkedHashMap.putAll(extras$lifecycle_viewmodel2);
        return new MutableCreationExtras(linkedHashMap);
    }

    public static final void plusAssign(MutableCreationExtras mutableCreationExtras, CreationExtras creationExtras) {
        mutableCreationExtras.getClass();
        creationExtras.getClass();
        mutableCreationExtras.getExtras$lifecycle_viewmodel().putAll(creationExtras.getExtras$lifecycle_viewmodel());
    }
}
