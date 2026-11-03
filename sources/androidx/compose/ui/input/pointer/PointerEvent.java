package androidx.compose.ui.input.pointer;

import android.os.Build;
import android.view.MotionEvent;
import androidx.collection.LongSparseArray;
import androidx.compose.ui.ComposeUiFlags;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class PointerEvent {
    public static final int $stable = 8;
    private final int buttons;
    private final List<PointerInputChange> changes;
    private final int classification;
    private final InternalPointerEvent internalPointerEvent;
    private final int keyboardModifiers;
    private int type;

    public PointerEvent(List<PointerInputChange> list) {
        this(list, null);
    }

    public PointerEvent(List<PointerInputChange> list, InternalPointerEvent internalPointerEvent) {
        MotionEvent motionEvent;
        this.changes = list;
        this.internalPointerEvent = internalPointerEvent;
        this.classification = (Build.VERSION.SDK_INT < 29 || (motionEvent = getMotionEvent()) == null) ? 0 : motionEvent.getClassification();
        MotionEvent motionEvent2 = getMotionEvent();
        this.buttons = PointerButtons.m6514constructorimpl(motionEvent2 != null ? motionEvent2.getButtonState() : 0);
        MotionEvent motionEvent3 = getMotionEvent();
        this.keyboardModifiers = PointerKeyboardModifiers.m6642constructorimpl(motionEvent3 != null ? motionEvent3.getMetaState() : 0);
        this.type = m6521calculatePointerEventType7fucELk();
    }

    /* renamed from: calculatePointerEventType-7fucELk, reason: not valid java name */
    private final int m6521calculatePointerEventType7fucELk() {
        MotionEvent motionEvent = getMotionEvent();
        int i = 0;
        if (motionEvent == null) {
            List<PointerInputChange> list = this.changes;
            int size = list.size();
            while (i < size) {
                PointerInputChange pointerInputChange = list.get(i);
                if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                    return PointerEventType.Companion.m6542getRelease7fucELk();
                }
                if (PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange)) {
                    return PointerEventType.Companion.m6541getPress7fucELk();
                }
                i++;
            }
            return PointerEventType.Companion.m6537getMove7fucELk();
        }
        int i2 = Build.VERSION.SDK_INT;
        boolean z = i2 >= 34 && motionEvent.getClassification() == 3;
        boolean z2 = i2 >= 34 && motionEvent.getClassification() == 5;
        if (z2 && ComposeUiFlags.isTrackpadPinchReinterpretationEnabled) {
            i = 1;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            return z ? PointerEventType.Companion.m6540getPanStart7fucELk() : (z2 && i == 0) ? PointerEventType.Companion.m6545getScaleStart7fucELk() : PointerEventType.Companion.m6541getPress7fucELk();
        }
        if (actionMasked == 1) {
            return z ? PointerEventType.Companion.m6538getPanEnd7fucELk() : (z2 && i == 0) ? PointerEventType.Companion.m6544getScaleEnd7fucELk() : PointerEventType.Companion.m6542getRelease7fucELk();
        }
        if (actionMasked != 2) {
            switch (actionMasked) {
                case 5:
                    return z ? PointerEventType.Companion.m6540getPanStart7fucELk() : i != 0 ? PointerEventType.Companion.m6545getScaleStart7fucELk() : z2 ? PointerEventType.Companion.m6543getScaleChange7fucELk() : PointerEventType.Companion.m6541getPress7fucELk();
                case 6:
                    return z ? PointerEventType.Companion.m6538getPanEnd7fucELk() : i != 0 ? PointerEventType.Companion.m6544getScaleEnd7fucELk() : z2 ? PointerEventType.Companion.m6543getScaleChange7fucELk() : PointerEventType.Companion.m6542getRelease7fucELk();
                case 7:
                    break;
                case 8:
                    return PointerEventType.Companion.m6546getScroll7fucELk();
                case 9:
                    return PointerEventType.Companion.m6535getEnter7fucELk();
                case 10:
                    return PointerEventType.Companion.m6536getExit7fucELk();
                default:
                    return PointerEventType.Companion.m6547getUnknown7fucELk();
            }
        }
        return z ? PointerEventType.Companion.m6539getPanMove7fucELk() : z2 ? PointerEventType.Companion.m6543getScaleChange7fucELk() : PointerEventType.Companion.m6537getMove7fucELk();
    }

    public final List<PointerInputChange> component1() {
        return this.changes;
    }

    public final PointerEvent copy(List<PointerInputChange> list, MotionEvent motionEvent) {
        if (motionEvent == null) {
            return new PointerEvent(list, null);
        }
        if (motionEvent.equals(getMotionEvent())) {
            return new PointerEvent(list, this.internalPointerEvent);
        }
        LongSparseArray longSparseArray = new LongSparseArray(list.size());
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i = 0;
        while (i < size) {
            PointerInputChange pointerInputChange = list.get(i);
            longSparseArray.put(pointerInputChange.m6588getIdJ3iCeTQ(), pointerInputChange);
            long m6588getIdJ3iCeTQ = pointerInputChange.m6588getIdJ3iCeTQ();
            long uptimeMillis = pointerInputChange.getUptimeMillis();
            long m6591getPositionF1C5BW0 = pointerInputChange.m6591getPositionF1C5BW0();
            long m6591getPositionF1C5BW02 = pointerInputChange.m6591getPositionF1C5BW0();
            boolean pressed = pointerInputChange.getPressed();
            float pressure = pointerInputChange.getPressure();
            int m6594getTypeT8wyACA = pointerInputChange.m6594getTypeT8wyACA();
            InternalPointerEvent internalPointerEvent = this.internalPointerEvent;
            int i2 = i;
            arrayList.add(new PointerInputEventData(m6588getIdJ3iCeTQ, uptimeMillis, m6591getPositionF1C5BW0, m6591getPositionF1C5BW02, pressed, pressure, m6594getTypeT8wyACA, internalPointerEvent != null && internalPointerEvent.m6495activeHoverEvent0FcD4WY(pointerInputChange.m6588getIdJ3iCeTQ()), null, 0L, pointerInputChange.getScaleFactor(), pointerInputChange.m6590getPanOffsetF1C5BW0(), 0L, 4864, null));
            i = i2 + 1;
        }
        return new PointerEvent(list, new InternalPointerEvent(longSparseArray, new PointerInputEvent(motionEvent.getEventTime(), arrayList, motionEvent)));
    }

    /* renamed from: getButtons-ry648PA, reason: not valid java name */
    public final int m6522getButtonsry648PA() {
        return this.buttons;
    }

    public final List<PointerInputChange> getChanges() {
        return this.changes;
    }

    public final int getClassification() {
        return this.classification;
    }

    public final InternalPointerEvent getInternalPointerEvent$ui() {
        return this.internalPointerEvent;
    }

    /* renamed from: getKeyboardModifiers-k7X9c1A, reason: not valid java name */
    public final int m6523getKeyboardModifiersk7X9c1A() {
        return this.keyboardModifiers;
    }

    public final MotionEvent getMotionEvent() {
        InternalPointerEvent internalPointerEvent = this.internalPointerEvent;
        if (internalPointerEvent != null) {
            return internalPointerEvent.getMotionEvent();
        }
        return null;
    }

    /* renamed from: getType-7fucELk, reason: not valid java name */
    public final int m6524getType7fucELk() {
        return this.type;
    }

    /* renamed from: setType-EhbLWgg$ui, reason: not valid java name */
    public final void m6525setTypeEhbLWgg$ui(int i) {
        this.type = i;
    }
}
