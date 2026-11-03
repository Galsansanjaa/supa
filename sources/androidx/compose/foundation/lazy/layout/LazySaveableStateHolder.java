package androidx.compose.foundation.lazy.layout;

import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import defpackage.os0;
import defpackage.ps0;
import defpackage.qk0;
import defpackage.sb0;
import defpackage.ts0;
import defpackage.vy2;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class LazySaveableStateHolder implements SaveableStateRegistry, SaveableStateHolder {
    public static final Companion Companion = new Companion(null);
    private final MutableScatterSet<Object> previouslyComposedKeys;
    private final SaveableStateHolder wrappedHolder;
    private final SaveableStateRegistry wrappedRegistry;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        public static /* synthetic */ LazySaveableStateHolder a(SaveableStateRegistry saveableStateRegistry, SaveableStateHolder saveableStateHolder, Map map) {
            return saver$lambda$1(saveableStateRegistry, saveableStateHolder, map);
        }

        public static final Map saver$lambda$0(SaverScope saverScope, LazySaveableStateHolder lazySaveableStateHolder) {
            Map<String, List<Object>> performSave = lazySaveableStateHolder.performSave();
            if (performSave.isEmpty()) {
                return null;
            }
            return performSave;
        }

        public static final LazySaveableStateHolder saver$lambda$1(SaveableStateRegistry saveableStateRegistry, SaveableStateHolder saveableStateHolder, Map map) {
            return new LazySaveableStateHolder(saveableStateRegistry, map, saveableStateHolder);
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [ts0, java.lang.Object] */
        public final Saver<LazySaveableStateHolder, Map<String, List<Object>>> saver(SaveableStateRegistry saveableStateRegistry, SaveableStateHolder saveableStateHolder) {
            return SaverKt.Saver(new Object(), new qk0(7, saveableStateRegistry, saveableStateHolder));
        }
    }

    public LazySaveableStateHolder(SaveableStateRegistry saveableStateRegistry, SaveableStateHolder saveableStateHolder) {
        this.wrappedRegistry = saveableStateRegistry;
        this.wrappedHolder = saveableStateHolder;
        this.previouslyComposedKeys = ScatterSetKt.mutableScatterSetOf();
    }

    public LazySaveableStateHolder(SaveableStateRegistry saveableStateRegistry, Map<String, ? extends List<? extends Object>> map, SaveableStateHolder saveableStateHolder) {
        this(SaveableStateRegistryKt.SaveableStateRegistry(map, new e(saveableStateRegistry, 2)), saveableStateHolder);
    }

    public static final DisposableEffectResult SaveableStateProvider$lambda$0$0(LazySaveableStateHolder lazySaveableStateHolder, final Object obj, DisposableEffectScope disposableEffectScope) {
        lazySaveableStateHolder.previouslyComposedKeys.minusAssign((MutableScatterSet<Object>) obj);
        return new DisposableEffectResult() { // from class: androidx.compose.foundation.lazy.layout.LazySaveableStateHolder$SaveableStateProvider$lambda$0$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                MutableScatterSet mutableScatterSet;
                mutableScatterSet = LazySaveableStateHolder.this.previouslyComposedKeys;
                mutableScatterSet.plusAssign((MutableScatterSet) obj);
            }
        };
    }

    public static final vy2 SaveableStateProvider$lambda$1(LazySaveableStateHolder lazySaveableStateHolder, Object obj, ts0 ts0Var, int i, Composer composer, int i2) {
        lazySaveableStateHolder.SaveableStateProvider(obj, ts0Var, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return vy2.a;
    }

    public static final boolean _init_$lambda$0(SaveableStateRegistry saveableStateRegistry, Object obj) {
        if (saveableStateRegistry != null) {
            return saveableStateRegistry.canBeSaved(obj);
        }
        return true;
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateHolder
    public void SaveableStateProvider(final Object obj, final ts0 ts0Var, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-858296452);
        int i3 = 2;
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
                ComposerKt.traceEventStart(-858296452, i2, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolder.SaveableStateProvider (LazySaveableStateHolder.kt:74)");
            }
            int i4 = i2 & 14;
            this.wrappedHolder.SaveableStateProvider(obj, ts0Var, startRestartGroup, i2 & 126);
            boolean changedInstance = startRestartGroup.changedInstance(this) | startRestartGroup.changedInstance(obj);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new b(i3, this, obj);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            EffectsKt.DisposableEffect(obj, (ps0) rememberedValue, startRestartGroup, i4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ts0() { // from class: androidx.compose.foundation.lazy.layout.h
                @Override // defpackage.ts0
                public final Object invoke(Object obj2, Object obj3) {
                    vy2 SaveableStateProvider$lambda$1;
                    int intValue = ((Integer) obj3).intValue();
                    SaveableStateProvider$lambda$1 = LazySaveableStateHolder.SaveableStateProvider$lambda$1(LazySaveableStateHolder.this, obj, ts0Var, i, (Composer) obj2, intValue);
                    return SaveableStateProvider$lambda$1;
                }
            });
        }
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public boolean canBeSaved(Object obj) {
        return this.wrappedRegistry.canBeSaved(obj);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public Object consumeRestored(String str) {
        return this.wrappedRegistry.consumeRestored(str);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public Map<String, List<Object>> performSave() {
        MutableScatterSet<Object> mutableScatterSet = this.previouslyComposedKeys;
        Object[] objArr = mutableScatterSet.elements;
        long[] jArr = mutableScatterSet.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            this.wrappedHolder.removeState(objArr[(i << 3) + i3]);
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
        return this.wrappedRegistry.performSave();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public SaveableStateRegistry.Entry registerProvider(String str, os0 os0Var) {
        return this.wrappedRegistry.registerProvider(str, os0Var);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateHolder
    public void removeState(Object obj) {
        this.wrappedHolder.removeState(obj);
    }
}
