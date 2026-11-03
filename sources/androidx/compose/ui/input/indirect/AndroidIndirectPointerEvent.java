package androidx.compose.ui.input.indirect;

import android.view.MotionEvent;
import defpackage.sb0;
import defpackage.v5;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class AndroidIndirectPointerEvent implements PlatformIndirectPointerEvent {
    public static final int $stable = 8;
    private final List<IndirectPointerInputChange> changes;
    private final MotionEvent nativeEvent;
    private final int primaryDirectionalMotionAxis;
    private final int type;

    private AndroidIndirectPointerEvent(List<IndirectPointerInputChange> list, int i, int i2, MotionEvent motionEvent) {
        this.changes = list;
        this.type = i;
        this.primaryDirectionalMotionAxis = i2;
        this.nativeEvent = motionEvent;
        if (getChanges().isEmpty()) {
            v5.m("changes cannot be empty");
            throw null;
        }
    }

    public /* synthetic */ AndroidIndirectPointerEvent(List list, int i, int i2, MotionEvent motionEvent, sb0 sb0Var) {
        this(list, i, i2, motionEvent);
    }

    @Override // androidx.compose.ui.input.indirect.IndirectPointerEvent
    public List<IndirectPointerInputChange> getChanges() {
        return this.changes;
    }

    public final MotionEvent getNativeEvent$ui() {
        return this.nativeEvent;
    }

    @Override // androidx.compose.ui.input.indirect.IndirectPointerEvent
    /* renamed from: getPrimaryDirectionalMotionAxis-nZO2Niw, reason: not valid java name */
    public int mo6087getPrimaryDirectionalMotionAxisnZO2Niw() {
        return this.primaryDirectionalMotionAxis;
    }

    @Override // androidx.compose.ui.input.indirect.IndirectPointerEvent
    /* renamed from: getType-4ZHQPSE, reason: not valid java name */
    public int mo6088getType4ZHQPSE() {
        return this.type;
    }
}
