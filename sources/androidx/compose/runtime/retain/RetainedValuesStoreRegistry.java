package androidx.compose.runtime.retain;

import androidx.collection.MutableScatterMap;
import androidx.compose.foundation.style.StylePropertiesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.retain.impl.PreconditionsKt;
import defpackage.i3;
import defpackage.ps0;
import defpackage.qu1;
import defpackage.ts0;
import defpackage.vy2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class RetainedValuesStoreRegistry {
    public static final int $stable = 8;
    private final MutableScatterMap<Object, ManagedRetainedValuesStore> childStores = new MutableScatterMap<>(0, 1, null);
    private boolean isDisposed;

    public static final vy2 LocalRetainedValuesStoreProvider$lambda$0(RetainedValuesStoreRegistry retainedValuesStoreRegistry, Object obj, ts0 ts0Var, int i, Composer composer, int i2) {
        retainedValuesStoreRegistry.LocalRetainedValuesStoreProvider(obj, ts0Var, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return vy2.a;
    }

    public static /* synthetic */ boolean a(Object obj) {
        return dispose$lambda$0(obj);
    }

    public static final boolean dispose$lambda$0(Object obj) {
        return true;
    }

    private final RetainedValuesStore getOrCreateRetainedValuesStoreForChild(Object obj) {
        if (this.isDisposed) {
            PreconditionsKt.throwIllegalStateException("Cannot get a RetainedValuesStore after a RetainedValuesStoreRegistry has been disposed.");
        }
        MutableScatterMap<Object, ManagedRetainedValuesStore> mutableScatterMap = this.childStores;
        ManagedRetainedValuesStore managedRetainedValuesStore = mutableScatterMap.get(obj);
        if (managedRetainedValuesStore == null) {
            managedRetainedValuesStore = new ManagedRetainedValuesStore();
            mutableScatterMap.set(obj, managedRetainedValuesStore);
        }
        return managedRetainedValuesStore;
    }

    public final void LocalRetainedValuesStoreProvider(Object obj, ts0 ts0Var, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1626630244);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(ts0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(this) ? 256 : 128;
        }
        if (startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1626630244, i2, -1, "androidx.compose.runtime.retain.RetainedValuesStoreRegistry.LocalRetainedValuesStoreProvider (RetainedValuesStoreRegistry.kt:70)");
            }
            LocalRetainedValuesStoreKt.LocalRetainedValuesStoreProvider(getOrCreateRetainedValuesStoreForChild(obj), ts0Var, startRestartGroup, i2 & StylePropertiesKt.TextDirectionMask);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new i3(i, 12, this, obj, ts0Var));
        }
    }

    public final void clearChild(Object obj) {
        ManagedRetainedValuesStore remove = this.childStores.remove(obj);
        if (remove != null) {
            remove.dispose();
        }
    }

    public final void clearChildren(ps0 ps0Var) {
        MutableScatterMap<Object, ManagedRetainedValuesStore> mutableScatterMap = this.childStores;
        long[] jArr = mutableScatterMap.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = mutableScatterMap.keys[i4];
                        ManagedRetainedValuesStore managedRetainedValuesStore = (ManagedRetainedValuesStore) mutableScatterMap.values[i4];
                        Boolean bool = (Boolean) ps0Var.invoke(obj);
                        if (bool.booleanValue()) {
                            managedRetainedValuesStore.dispose();
                        }
                        if (bool.booleanValue()) {
                            mutableScatterMap.removeValueAt(i4);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void dispose() {
        this.isDisposed = true;
        clearChildren(new qu1(18));
    }
}
