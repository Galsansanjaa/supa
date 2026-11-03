package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.internal.SavedStateHandleImpl;
import androidx.lifecycle.internal.SavedStateHandleImpl_androidKt;
import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateRegistry;
import defpackage.jh2;
import defpackage.mm1;
import defpackage.np3;
import defpackage.qq;
import defpackage.sb0;
import defpackage.xl2;
import defpackage.z72;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class SavedStateHandle {
    public static final Companion Companion = new Companion(null);
    private SavedStateHandleImpl impl;
    private final Map<String, SavingStateLiveData<?>> liveDatas;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        public final SavedStateHandle createHandle(Bundle bundle, Bundle bundle2) {
            if (bundle == null) {
                bundle = bundle2;
            }
            if (bundle == null) {
                return new SavedStateHandle();
            }
            ClassLoader classLoader = SavedStateHandle.class.getClassLoader();
            classLoader.getClass();
            bundle.setClassLoader(classLoader);
            return new SavedStateHandle(SavedStateReader.m8454toMapimpl(SavedStateReader.m8373constructorimpl(bundle)));
        }

        public final boolean validateValue(Object obj) {
            return SavedStateHandleImpl_androidKt.isAcceptableType(obj);
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class SavingStateLiveData<T> extends MutableLiveData<T> {
        private SavedStateHandle handle;
        private String key;

        public SavingStateLiveData(SavedStateHandle savedStateHandle, String str) {
            str.getClass();
            this.key = str;
            this.handle = savedStateHandle;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavingStateLiveData(SavedStateHandle savedStateHandle, String str, T t) {
            super(t);
            str.getClass();
            this.key = str;
            this.handle = savedStateHandle;
        }

        public final void detach() {
            this.handle = null;
        }

        @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
        public void setValue(T t) {
            SavedStateHandleImpl savedStateHandleImpl;
            SavedStateHandle savedStateHandle = this.handle;
            if (savedStateHandle != null && (savedStateHandleImpl = savedStateHandle.impl) != null) {
                savedStateHandleImpl.set(this.key, t);
            }
            super.setValue(t);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SavedStateHandle() {
        this.liveDatas = new LinkedHashMap();
        this.impl = new SavedStateHandleImpl(null, 1, 0 == true ? 1 : 0);
    }

    public SavedStateHandle(Map<String, ? extends Object> map) {
        map.getClass();
        this.liveDatas = new LinkedHashMap();
        this.impl = new SavedStateHandleImpl(map);
    }

    public static final SavedStateHandle createHandle(Bundle bundle, Bundle bundle2) {
        return Companion.createHandle(bundle, bundle2);
    }

    private final <T> MutableLiveData<T> getLiveDataInternal(String str, boolean z, T t) {
        String createMutuallyExclusiveErrorMessage;
        SavingStateLiveData<?> savingStateLiveData;
        if (this.impl.getMutableFlows().containsKey(str)) {
            createMutuallyExclusiveErrorMessage = SavedStateHandle_androidKt.createMutuallyExclusiveErrorMessage(str);
            qq.j(createMutuallyExclusiveErrorMessage);
            return null;
        }
        Map<String, SavingStateLiveData<?>> map = this.liveDatas;
        SavingStateLiveData<?> savingStateLiveData2 = map.get(str);
        if (savingStateLiveData2 == null) {
            if (this.impl.getRegular().containsKey(str)) {
                savingStateLiveData = new SavingStateLiveData<>(this, str, this.impl.getRegular().get(str));
            } else if (z) {
                this.impl.getRegular().put(str, t);
                savingStateLiveData = new SavingStateLiveData<>(this, str, t);
            } else {
                savingStateLiveData = new SavingStateLiveData<>(this, str);
            }
            savingStateLiveData2 = savingStateLiveData;
            map.put(str, savingStateLiveData2);
        }
        return savingStateLiveData2;
    }

    public final void clearSavedStateProvider(String str) {
        str.getClass();
        this.impl.clearSavedStateProvider(str);
    }

    public final boolean contains(String str) {
        str.getClass();
        return this.impl.contains(str);
    }

    public final <T> T get(String str) {
        str.getClass();
        return (T) this.impl.get(str);
    }

    public final <T> MutableLiveData<T> getLiveData(String str) {
        str.getClass();
        MutableLiveData<T> liveDataInternal = getLiveDataInternal(str, false, null);
        liveDataInternal.getClass();
        return liveDataInternal;
    }

    public final <T> MutableLiveData<T> getLiveData(String str, T t) {
        str.getClass();
        return getLiveDataInternal(str, true, t);
    }

    public final <T> mm1 getMutableStateFlow(String str, T t) {
        String createMutuallyExclusiveErrorMessage;
        str.getClass();
        if (!this.liveDatas.containsKey(str)) {
            return this.impl.getMutableStateFlow(str, t);
        }
        createMutuallyExclusiveErrorMessage = SavedStateHandle_androidKt.createMutuallyExclusiveErrorMessage(str);
        qq.j(createMutuallyExclusiveErrorMessage);
        return null;
    }

    public final <T> xl2 getStateFlow(String str, T t) {
        str.getClass();
        boolean containsKey = this.impl.getMutableFlows().containsKey(str);
        SavedStateHandleImpl savedStateHandleImpl = this.impl;
        return containsKey ? np3.f(savedStateHandleImpl.getMutableStateFlow(str, t)) : savedStateHandleImpl.getStateFlow(str, t);
    }

    public final Set<String> keys() {
        return jh2.P(this.impl.keys(), this.liveDatas.keySet());
    }

    public final <T> T remove(String str) {
        str.getClass();
        T t = (T) this.impl.remove(str);
        SavingStateLiveData<?> remove = this.liveDatas.remove(str);
        if (remove != null) {
            remove.detach();
        }
        return t;
    }

    public final SavedStateRegistry.SavedStateProvider savedStateProvider() {
        return this.impl.getSavedStateProvider();
    }

    public final <T> void set(String str, T t) {
        str.getClass();
        if (!Companion.validateValue(t)) {
            t.getClass();
            z72.m(t.getClass(), "Can't put value with type ", " into saved state");
            return;
        }
        SavingStateLiveData<?> savingStateLiveData = this.liveDatas.get(str);
        SavingStateLiveData<?> savingStateLiveData2 = savingStateLiveData instanceof MutableLiveData ? savingStateLiveData : null;
        if (savingStateLiveData2 != null) {
            savingStateLiveData2.setValue(t);
        }
        this.impl.set(str, t);
    }

    public final void setSavedStateProvider(String str, SavedStateRegistry.SavedStateProvider savedStateProvider) {
        str.getClass();
        savedStateProvider.getClass();
        this.impl.setSavedStateProvider(str, savedStateProvider);
    }
}
