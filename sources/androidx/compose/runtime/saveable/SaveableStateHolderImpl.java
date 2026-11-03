package androidx.compose.runtime.saveable;

import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.foundation.style.StylePropertiesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.savedstate.compose.LocalSavedStateRegistryOwnerKt;
import defpackage.ps0;
import defpackage.sb0;
import defpackage.ts0;
import defpackage.vy2;
import defpackage.z72;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class SaveableStateHolderImpl implements SaveableStateHolder {
    public static final Companion Companion = new Companion(null);
    private static final Saver<SaveableStateHolderImpl, ?> Saver = SaverKt.Saver(new Object(), new Object());
    private final ps0 canBeSaved;
    private SaveableStateRegistry parentSaveableStateRegistry;
    private final MutableScatterMap<Object, SaveableStateRegistry> registries;
    private final Map<Object, Map<String, List<Object>>> savedStates;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        public final Saver<SaveableStateHolderImpl, ?> getSaver() {
            return SaveableStateHolderImpl.Saver;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SaveableStateHolderImpl() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public SaveableStateHolderImpl(Map<Object, Map<String, List<Object>>> map) {
        this.savedStates = map;
        this.registries = ScatterMapKt.mutableScatterMapOf();
        this.canBeSaved = new ps0() { // from class: androidx.compose.runtime.saveable.c
            @Override // defpackage.ps0
            public final Object invoke(Object obj) {
                boolean canBeSaved$lambda$0;
                canBeSaved$lambda$0 = SaveableStateHolderImpl.canBeSaved$lambda$0(SaveableStateHolderImpl.this, obj);
                return Boolean.valueOf(canBeSaved$lambda$0);
            }
        };
    }

    public /* synthetic */ SaveableStateHolderImpl(Map map, int i, sb0 sb0Var) {
        this((i & 1) != 0 ? new LinkedHashMap() : map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult SaveableStateProvider$lambda$0$1$0(final SaveableStateHolderImpl saveableStateHolderImpl, final Object obj, final SaveableStateRegistryWrapper saveableStateRegistryWrapper, DisposableEffectScope disposableEffectScope) {
        if (saveableStateHolderImpl.registries.contains(obj)) {
            z72.m(obj, "Key ", " was used multiple times ");
            return null;
        }
        saveableStateHolderImpl.savedStates.remove(obj);
        saveableStateHolderImpl.registries.set(obj, saveableStateRegistryWrapper);
        return new DisposableEffectResult() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderImpl$SaveableStateProvider$lambda$0$1$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                MutableScatterMap mutableScatterMap;
                Map map;
                mutableScatterMap = SaveableStateHolderImpl.this.registries;
                Object remove = mutableScatterMap.remove(obj);
                SaveableStateRegistryWrapper saveableStateRegistryWrapper2 = saveableStateRegistryWrapper;
                if (remove == saveableStateRegistryWrapper2) {
                    SaveableStateHolderImpl saveableStateHolderImpl2 = SaveableStateHolderImpl.this;
                    map = saveableStateHolderImpl2.savedStates;
                    saveableStateHolderImpl2.saveTo(saveableStateRegistryWrapper2, map, obj);
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vy2 SaveableStateProvider$lambda$1(SaveableStateHolderImpl saveableStateHolderImpl, Object obj, ts0 ts0Var, int i, Composer composer, int i2) {
        saveableStateHolderImpl.SaveableStateProvider(obj, ts0Var, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return vy2.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map Saver$lambda$0(SaverScope saverScope, SaveableStateHolderImpl saveableStateHolderImpl) {
        return saveableStateHolderImpl.saveAll();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SaveableStateHolderImpl Saver$lambda$1(Map map) {
        return new SaveableStateHolderImpl(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean canBeSaved$lambda$0(SaveableStateHolderImpl saveableStateHolderImpl, Object obj) {
        SaveableStateRegistry saveableStateRegistry = saveableStateHolderImpl.parentSaveableStateRegistry;
        if (saveableStateRegistry != null) {
            return saveableStateRegistry.canBeSaved(obj);
        }
        return true;
    }

    private final Map<Object, Map<String, List<Object>>> saveAll() {
        Map<Object, Map<String, List<Object>>> map = this.savedStates;
        MutableScatterMap<Object, SaveableStateRegistry> mutableScatterMap = this.registries;
        Object[] objArr = mutableScatterMap.keys;
        Object[] objArr2 = mutableScatterMap.values;
        long[] jArr = mutableScatterMap.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            saveTo((SaveableStateRegistry) objArr2[i4], map, objArr[i4]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        if (map.isEmpty()) {
            return null;
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveTo(SaveableStateRegistry saveableStateRegistry, Map<Object, Map<String, List<Object>>> map, Object obj) {
        Map<String, List<Object>> performSave = saveableStateRegistry.performSave();
        if (performSave.isEmpty()) {
            map.remove(obj);
        } else {
            map.put(obj, performSave);
        }
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateHolder
    public void SaveableStateProvider(final Object obj, final ts0 ts0Var, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(533563200);
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
                ComposerKt.traceEventStart(533563200, i2, -1, "androidx.compose.runtime.saveable.SaveableStateHolderImpl.SaveableStateProvider (SaveableStateHolder.kt:70)");
            }
            startRestartGroup.startReusableGroup(ComposerKt.reuseKey, obj);
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                if (!((Boolean) this.canBeSaved.invoke(obj)).booleanValue()) {
                    z72.m(obj, "Type of the key ", " is not supported. On Android you can only use types which can be stored inside the Bundle.");
                    return;
                } else {
                    rememberedValue = new SaveableStateRegistryWrapper(SaveableStateRegistryKt.SaveableStateRegistry(this.savedStates.get(obj), this.canBeSaved));
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
            }
            final SaveableStateRegistryWrapper saveableStateRegistryWrapper = (SaveableStateRegistryWrapper) rememberedValue;
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{SaveableStateRegistryKt.getLocalSaveableStateRegistry().provides(saveableStateRegistryWrapper), LocalSavedStateRegistryOwnerKt.getLocalSavedStateRegistryOwner().provides(saveableStateRegistryWrapper)}, ts0Var, startRestartGroup, (i2 & StylePropertiesKt.TextDirectionMask) | ProvidedValue.$stable);
            boolean changedInstance = startRestartGroup.changedInstance(this) | startRestartGroup.changedInstance(obj) | startRestartGroup.changedInstance(saveableStateRegistryWrapper);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new ps0() { // from class: androidx.compose.runtime.saveable.d
                    @Override // defpackage.ps0
                    public final Object invoke(Object obj2) {
                        DisposableEffectResult SaveableStateProvider$lambda$0$1$0;
                        SaveableStateProvider$lambda$0$1$0 = SaveableStateHolderImpl.SaveableStateProvider$lambda$0$1$0(SaveableStateHolderImpl.this, obj, saveableStateRegistryWrapper, (DisposableEffectScope) obj2);
                        return SaveableStateProvider$lambda$0$1$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            EffectsKt.DisposableEffect(vy2.a, (ps0) rememberedValue2, startRestartGroup, 6);
            startRestartGroup.endReusableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ts0() { // from class: androidx.compose.runtime.saveable.e
                @Override // defpackage.ts0
                public final Object invoke(Object obj2, Object obj3) {
                    vy2 SaveableStateProvider$lambda$1;
                    int intValue = ((Integer) obj3).intValue();
                    SaveableStateProvider$lambda$1 = SaveableStateHolderImpl.SaveableStateProvider$lambda$1(SaveableStateHolderImpl.this, obj, ts0Var, i, (Composer) obj2, intValue);
                    return SaveableStateProvider$lambda$1;
                }
            });
        }
    }

    public final SaveableStateRegistry getParentSaveableStateRegistry() {
        return this.parentSaveableStateRegistry;
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateHolder
    public void removeState(Object obj) {
        if (this.registries.remove(obj) == null) {
            this.savedStates.remove(obj);
        }
    }

    public final void setParentSaveableStateRegistry(SaveableStateRegistry saveableStateRegistry) {
        this.parentSaveableStateRegistry = saveableStateRegistry;
    }
}
