package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import defpackage.a10;
import defpackage.jh2;
import defpackage.nm1;
import defpackage.os;
import defpackage.sm1;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class SnackbarHostState {
    public static final int $stable = 0;
    private final MutableState currentSnackbarData$delegate;
    private final nm1 mutex = new sm1();

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class SnackbarDataImpl implements SnackbarData {
        private final os continuation;
        private final SnackbarVisuals visuals;

        public SnackbarDataImpl(SnackbarVisuals snackbarVisuals, os osVar) {
            this.visuals = snackbarVisuals;
            this.continuation = osVar;
        }

        @Override // androidx.compose.material3.SnackbarData
        public void dismiss() {
            if (this.continuation.isActive()) {
                this.continuation.resumeWith(SnackbarResult.Dismissed);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || SnackbarDataImpl.class != obj.getClass()) {
                return false;
            }
            SnackbarDataImpl snackbarDataImpl = (SnackbarDataImpl) obj;
            return jh2.k(getVisuals(), snackbarDataImpl.getVisuals()) && jh2.k(this.continuation, snackbarDataImpl.continuation);
        }

        @Override // androidx.compose.material3.SnackbarData
        public SnackbarVisuals getVisuals() {
            return this.visuals;
        }

        public int hashCode() {
            return this.continuation.hashCode() + (getVisuals().hashCode() * 31);
        }

        @Override // androidx.compose.material3.SnackbarData
        public void performAction() {
            if (this.continuation.isActive()) {
                this.continuation.resumeWith(SnackbarResult.ActionPerformed);
            }
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class SnackbarVisualsImpl implements SnackbarVisuals {
        private final String actionLabel;
        private final SnackbarDuration duration;
        private final String message;
        private final boolean withDismissAction;

        public SnackbarVisualsImpl(String str, String str2, boolean z, SnackbarDuration snackbarDuration) {
            this.message = str;
            this.actionLabel = str2;
            this.withDismissAction = z;
            this.duration = snackbarDuration;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || SnackbarVisualsImpl.class != obj.getClass()) {
                return false;
            }
            SnackbarVisualsImpl snackbarVisualsImpl = (SnackbarVisualsImpl) obj;
            return jh2.k(getMessage(), snackbarVisualsImpl.getMessage()) && jh2.k(getActionLabel(), snackbarVisualsImpl.getActionLabel()) && getWithDismissAction() == snackbarVisualsImpl.getWithDismissAction() && getDuration() == snackbarVisualsImpl.getDuration();
        }

        @Override // androidx.compose.material3.SnackbarVisuals
        public String getActionLabel() {
            return this.actionLabel;
        }

        @Override // androidx.compose.material3.SnackbarVisuals
        public SnackbarDuration getDuration() {
            return this.duration;
        }

        @Override // androidx.compose.material3.SnackbarVisuals
        public String getMessage() {
            return this.message;
        }

        @Override // androidx.compose.material3.SnackbarVisuals
        public boolean getWithDismissAction() {
            return this.withDismissAction;
        }

        public int hashCode() {
            int hashCode = getMessage().hashCode() * 31;
            String actionLabel = getActionLabel();
            return getDuration().hashCode() + ((((hashCode + (actionLabel != null ? actionLabel.hashCode() : 0)) * 31) + (getWithDismissAction() ? 1231 : 1237)) * 31);
        }
    }

    public SnackbarHostState() {
        MutableState mutableStateOf$default;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.currentSnackbarData$delegate = mutableStateOf$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCurrentSnackbarData(SnackbarData snackbarData) {
        this.currentSnackbarData$delegate.setValue(snackbarData);
    }

    public static /* synthetic */ Object showSnackbar$default(SnackbarHostState snackbarHostState, String str, String str2, boolean z, SnackbarDuration snackbarDuration, a10 a10Var, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            snackbarDuration = str3 == null ? SnackbarDuration.Short : SnackbarDuration.Indefinite;
        }
        return snackbarHostState.showSnackbar(str, str3, z2, snackbarDuration, a10Var);
    }

    public final SnackbarData getCurrentSnackbarData() {
        return (SnackbarData) this.currentSnackbarData$delegate.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x005c, code lost:
    
        if (r9.lock(null, r0) == r5) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object showSnackbar(androidx.compose.material3.SnackbarVisuals r8, defpackage.a10 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof androidx.compose.material3.SnackbarHostState$showSnackbar$2
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.material3.SnackbarHostState$showSnackbar$2 r0 = (androidx.compose.material3.SnackbarHostState$showSnackbar$2) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material3.SnackbarHostState$showSnackbar$2 r0 = new androidx.compose.material3.SnackbarHostState$showSnackbar$2
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.result
            int r1 = r0.label
            r2 = 2
            r3 = 1
            r4 = 0
            e50 r5 = defpackage.e50.a
            if (r1 == 0) goto L4d
            if (r1 == r3) goto L3f
            if (r1 != r2) goto L39
            java.lang.Object r8 = r0.L$2
            androidx.compose.material3.SnackbarHostState$showSnackbar$2 r8 = (androidx.compose.material3.SnackbarHostState$showSnackbar$2) r8
            java.lang.Object r8 = r0.L$1
            nm1 r8 = (defpackage.nm1) r8
            java.lang.Object r0 = r0.L$0
            androidx.compose.material3.SnackbarVisuals r0 = (androidx.compose.material3.SnackbarVisuals) r0
            defpackage.ta3.H(r9)     // Catch: java.lang.Throwable -> L37
            goto L85
        L37:
            r9 = move-exception
            goto L92
        L39:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.hu2.h(r7)
            return r4
        L3f:
            java.lang.Object r8 = r0.L$1
            nm1 r8 = (defpackage.nm1) r8
            java.lang.Object r1 = r0.L$0
            androidx.compose.material3.SnackbarVisuals r1 = (androidx.compose.material3.SnackbarVisuals) r1
            defpackage.ta3.H(r9)
            r9 = r8
            r8 = r1
            goto L5f
        L4d:
            defpackage.ta3.H(r9)
            nm1 r9 = r7.mutex
            r0.L$0 = r8
            r0.L$1 = r9
            r0.label = r3
            java.lang.Object r1 = r9.lock(r4, r0)
            if (r1 != r5) goto L5f
            goto L81
        L5f:
            r0.L$0 = r8     // Catch: java.lang.Throwable -> L8e
            r0.L$1 = r9     // Catch: java.lang.Throwable -> L8e
            r0.L$2 = r0     // Catch: java.lang.Throwable -> L8e
            r0.label = r2     // Catch: java.lang.Throwable -> L8e
            qs r1 = new qs     // Catch: java.lang.Throwable -> L8e
            a10 r0 = defpackage.m60.u(r0)     // Catch: java.lang.Throwable -> L8e
            r1.<init>(r3, r0)     // Catch: java.lang.Throwable -> L8e
            r1.u()     // Catch: java.lang.Throwable -> L8e
            androidx.compose.material3.SnackbarHostState$SnackbarDataImpl r0 = new androidx.compose.material3.SnackbarHostState$SnackbarDataImpl     // Catch: java.lang.Throwable -> L8e
            r0.<init>(r8, r1)     // Catch: java.lang.Throwable -> L8e
            access$setCurrentSnackbarData(r7, r0)     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r8 = r1.s()     // Catch: java.lang.Throwable -> L8e
            if (r8 != r5) goto L82
        L81:
            return r5
        L82:
            r6 = r9
            r9 = r8
            r8 = r6
        L85:
            r7.setCurrentSnackbarData(r4)     // Catch: java.lang.Throwable -> L8c
            r8.unlock(r4)
            return r9
        L8c:
            r7 = move-exception
            goto L96
        L8e:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L92:
            r7.setCurrentSnackbarData(r4)     // Catch: java.lang.Throwable -> L8c
            throw r9     // Catch: java.lang.Throwable -> L8c
        L96:
            r8.unlock(r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SnackbarHostState.showSnackbar(androidx.compose.material3.SnackbarVisuals, a10):java.lang.Object");
    }

    public final Object showSnackbar(String str, String str2, boolean z, SnackbarDuration snackbarDuration, a10 a10Var) {
        return showSnackbar(new SnackbarVisualsImpl(str, str2, z, snackbarDuration), a10Var);
    }
}
