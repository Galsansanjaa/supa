package androidx.compose.ui.platform;

import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.ui.SessionMutex;
import androidx.compose.ui.text.input.TextInputService;
import defpackage.ea0;
import defpackage.j20;
import defpackage.k2;
import defpackage.vy2;
import defpackage.y40;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class AndroidPlatformTextInputSession implements PlatformTextInputSessionScope, y40 {
    public static final int $stable = 8;
    private final y40 coroutineScope;
    private final AtomicReference<SessionMutex.Session<InputMethodSession>> methodSessionMutex = SessionMutex.m4815constructorimpl();
    private final TextInputService textInputService;
    private final View view;

    public AndroidPlatformTextInputSession(View view, TextInputService textInputService, y40 y40Var) {
        this.view = view;
        this.textInputService = textInputService;
        this.coroutineScope = y40Var;
    }

    public static /* synthetic */ InputMethodSession a(PlatformTextInputMethodRequest platformTextInputMethodRequest, AndroidPlatformTextInputSession androidPlatformTextInputSession, y40 y40Var) {
        return startInputMethod$lambda$0(platformTextInputMethodRequest, androidPlatformTextInputSession, y40Var);
    }

    public static /* synthetic */ vy2 b(AndroidPlatformTextInputSession androidPlatformTextInputSession) {
        return startInputMethod$lambda$0$0(androidPlatformTextInputSession);
    }

    public static final InputMethodSession startInputMethod$lambda$0(PlatformTextInputMethodRequest platformTextInputMethodRequest, AndroidPlatformTextInputSession androidPlatformTextInputSession, y40 y40Var) {
        return new InputMethodSession(platformTextInputMethodRequest, new k2(androidPlatformTextInputSession, 3));
    }

    public static final vy2 startInputMethod$lambda$0$0(AndroidPlatformTextInputSession androidPlatformTextInputSession) {
        ea0.j(androidPlatformTextInputSession.coroutineScope, null);
        return vy2.a;
    }

    public final InputConnection createInputConnection(EditorInfo editorInfo) {
        InputMethodSession inputMethodSession = (InputMethodSession) SessionMutex.m4819getCurrentSessionimpl(this.methodSessionMutex);
        if (inputMethodSession != null) {
            return inputMethodSession.createInputConnection(editorInfo);
        }
        return null;
    }

    @Override // androidx.compose.ui.platform.PlatformTextInputSessionScope, defpackage.y40
    public j20 getCoroutineContext() {
        return this.coroutineScope.getCoroutineContext();
    }

    @Override // androidx.compose.ui.platform.PlatformTextInputSession
    public View getView() {
        return this.view;
    }

    public final boolean isReadyForConnection() {
        InputMethodSession inputMethodSession = (InputMethodSession) SessionMutex.m4819getCurrentSessionimpl(this.methodSessionMutex);
        return inputMethodSession != null && inputMethodSession.isActive();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    @Override // androidx.compose.ui.platform.PlatformTextInputSession
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object startInputMethod(androidx.compose.ui.platform.PlatformTextInputMethodRequest r5, defpackage.a10 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$1 r0 = (androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$1 r0 = new androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 == r3) goto L28
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.hu2.h(r4)
            return r2
        L28:
            defpackage.ta3.H(r6)
            goto L46
        L2c:
            defpackage.ta3.H(r6)
            java.util.concurrent.atomic.AtomicReference<androidx.compose.ui.SessionMutex$Session<androidx.compose.ui.platform.InputMethodSession>> r6 = r4.methodSessionMutex
            m r1 = new m
            r1.<init>(r3, r5, r4)
            androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3 r5 = new androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3
            r5.<init>(r4, r2)
            r0.label = r3
            java.lang.Object r4 = androidx.compose.ui.SessionMutex.m4822withSessionCancellingPreviousimpl(r6, r1, r5, r0)
            e50 r5 = defpackage.e50.a
            if (r4 != r5) goto L46
            return r5
        L46:
            defpackage.i70.i()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidPlatformTextInputSession.startInputMethod(androidx.compose.ui.platform.PlatformTextInputMethodRequest, a10):java.lang.Object");
    }
}
