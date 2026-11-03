package androidx.compose.ui.node;

import android.view.KeyEvent;
import androidx.compose.ui.input.indirect.IndirectPointerEvent;
import androidx.compose.ui.semantics.SemanticsOwner;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.unit.Density;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public interface RootForTest {

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public interface UncaughtExceptionHandler {
        void onUncaughtException(Throwable th);
    }

    void forceAccessibilityForTesting(boolean z);

    Density getDensity();

    SemanticsOwner getSemanticsOwner();

    TextInputService getTextInputService();

    void measureAndLayoutForTest();

    boolean sendIndirectPointerEvent(IndirectPointerEvent indirectPointerEvent);

    /* renamed from: sendKeyEvent-ZmokQxo, reason: not valid java name */
    boolean mo7075sendKeyEventZmokQxo(KeyEvent keyEvent);

    void setAccessibilityEventBatchIntervalMillis(long j);

    void setUncaughtExceptionHandler(UncaughtExceptionHandler uncaughtExceptionHandler);
}
