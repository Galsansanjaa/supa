package androidx.compose.ui.input.indirect;

import android.view.InputDevice;
import android.view.MotionEvent;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerId;
import defpackage.v5;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class AndroidIndirectPointerEvent_androidKt {
    private static final float RATIO_CUTOFF = 5.0f;

    /* renamed from: IndirectPointerEvent-eAXfkT4, reason: not valid java name */
    public static final IndirectPointerEvent m6089IndirectPointerEventeAXfkT4(MotionEvent motionEvent, int i, MotionEvent motionEvent2) {
        return new AndroidIndirectPointerEvent(createIndirectPointerInputChangesFromMotionEvents(motionEvent, motionEvent2), convertActionToIndirectPointerEventType(motionEvent.getActionMasked()), i, motionEvent, null);
    }

    /* renamed from: IndirectPointerEvent-eAXfkT4$default, reason: not valid java name */
    public static /* synthetic */ IndirectPointerEvent m6090IndirectPointerEventeAXfkT4$default(MotionEvent motionEvent, int i, MotionEvent motionEvent2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = IndirectPointerEventPrimaryDirectionalMotionAxis.Companion.m6099getNonenZO2Niw();
        }
        if ((i2 & 4) != 0) {
            motionEvent2 = null;
        }
        return m6089IndirectPointerEventeAXfkT4(motionEvent, i, motionEvent2);
    }

    /* renamed from: IndirectPointerEvent-ixkH3tc, reason: not valid java name */
    public static final IndirectPointerEvent m6091IndirectPointerEventixkH3tc(List<IndirectPointerInputChange> list, int i, int i2, MotionEvent motionEvent) {
        return new AndroidIndirectPointerEvent(list, i, i2, motionEvent, null);
    }

    public static final int convertActionToIndirectPointerEventType(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return IndirectPointerEventType.Companion.m6109getMove4ZHQPSE();
                }
                if (i != 5) {
                    if (i != 6) {
                        return IndirectPointerEventType.Companion.m6112getUnknown4ZHQPSE();
                    }
                }
            }
            return IndirectPointerEventType.Companion.m6111getRelease4ZHQPSE();
        }
        return IndirectPointerEventType.Companion.m6110getPress4ZHQPSE();
    }

    public static final List<IndirectPointerInputChange> createIndirectPointerInputChangesFromMotionEvents(MotionEvent motionEvent, MotionEvent motionEvent2) {
        int i;
        long j;
        long j2;
        boolean z;
        MotionEvent motionEvent3 = motionEvent2;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = actionMasked != 1 ? actionMasked != 6 ? -1 : motionEvent.getActionIndex() : 0;
        Integer valueOf = motionEvent3 != null ? Integer.valueOf(motionEvent3.getActionMasked()) : null;
        boolean z2 = (valueOf != null && valueOf.intValue() == 0) || (valueOf != null && valueOf.intValue() == 5) || (valueOf != null && valueOf.intValue() == 2);
        long eventTime = motionEvent.getEventTime();
        int pointerCount = motionEvent.getPointerCount();
        ArrayList arrayList = new ArrayList(pointerCount);
        int i2 = 0;
        while (i2 < pointerCount) {
            int pointerId = motionEvent.getPointerId(i2);
            long m6568constructorimpl = PointerId.m6568constructorimpl(pointerId);
            boolean z3 = z2;
            long m5082constructorimpl = Offset.m5082constructorimpl((Float.floatToRawIntBits(motionEvent.getX(i2)) << 32) | (Float.floatToRawIntBits(motionEvent.getY(i2)) & 4294967295L));
            boolean z4 = i2 != actionIndex;
            if ((motionEvent3 != null ? motionEvent3.findPointerIndex(pointerId) : -1) >= 0) {
                motionEvent3.getClass();
                i = actionIndex;
                j2 = motionEvent3.getEventTime();
                z = z3;
                j = Offset.m5082constructorimpl((Float.floatToRawIntBits(motionEvent3.getX(r12)) << 32) | (Float.floatToRawIntBits(motionEvent3.getY(r12)) & 4294967295L));
            } else {
                i = actionIndex;
                j = m5082constructorimpl;
                j2 = eventTime;
                z = false;
            }
            int i3 = pointerCount;
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new IndirectPointerInputChange(m6568constructorimpl, eventTime, m5082constructorimpl, z4, motionEvent.getPressure(i2), j2, j, z, null));
            i2++;
            pointerCount = i3;
            arrayList = arrayList2;
            z2 = z3;
            actionIndex = i;
            motionEvent3 = motionEvent2;
        }
        return arrayList;
    }

    public static final MotionEvent getNativeEvent(IndirectPointerEvent indirectPointerEvent) {
        indirectPointerEvent.getClass();
        return ((AndroidIndirectPointerEvent) indirectPointerEvent).getNativeEvent$ui();
    }

    public static final int indirectPrimaryDirectionalScrollAxis(MotionEvent motionEvent) {
        if (!motionEvent.isFromSource(2097152)) {
            v5.m("MotionEvent must be a touch navigation source");
            return 0;
        }
        InputDevice device = motionEvent.getDevice();
        if (device != null) {
            InputDevice.MotionRange motionRange = device.getMotionRange(0);
            InputDevice.MotionRange motionRange2 = device.getMotionRange(1);
            if (motionRange != null && motionRange2 == null) {
                return IndirectPointerEventPrimaryDirectionalMotionAxis.Companion.m6100getXnZO2Niw();
            }
            if (motionRange2 != null && motionRange == null) {
                return IndirectPointerEventPrimaryDirectionalMotionAxis.Companion.m6101getYnZO2Niw();
            }
            if (motionRange != null && motionRange2 != null) {
                float range = motionRange.getRange();
                float range2 = motionRange2.getRange();
                if (range > range2 && (range2 == 0.0f || range / range2 >= RATIO_CUTOFF)) {
                    return IndirectPointerEventPrimaryDirectionalMotionAxis.Companion.m6100getXnZO2Niw();
                }
                if (range2 > range && (range == 0.0f || range2 / range >= RATIO_CUTOFF)) {
                    return IndirectPointerEventPrimaryDirectionalMotionAxis.Companion.m6101getYnZO2Niw();
                }
            }
        }
        return IndirectPointerEventPrimaryDirectionalMotionAxis.Companion.m6099getNonenZO2Niw();
    }
}
