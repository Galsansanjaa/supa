package androidx.compose.ui.input.pointer;

import androidx.collection.LongSparseArray;
import defpackage.sb0;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class PointerInputChangeEventProducer {
    private final LongSparseArray<PointerInputData> previousPointerInputData = new LongSparseArray<>(0, 1, null);

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class PointerInputData {
        private final boolean down;
        private final long positionOnScreen;
        private final long uptime;

        private PointerInputData(long j, long j2, boolean z) {
            this.uptime = j;
            this.positionOnScreen = j2;
            this.down = z;
        }

        public /* synthetic */ PointerInputData(long j, long j2, boolean z, sb0 sb0Var) {
            this(j, j2, z);
        }

        public final boolean getDown() {
            return this.down;
        }

        /* renamed from: getPositionOnScreen-F1C5BW0, reason: not valid java name */
        public final long m6596getPositionOnScreenF1C5BW0() {
            return this.positionOnScreen;
        }

        public final long getUptime() {
            return this.uptime;
        }
    }

    public final void clear() {
        this.previousPointerInputData.clear();
    }

    public final InternalPointerEvent produce(PointerInputEvent pointerInputEvent, PositionCalculator positionCalculator) {
        long uptime;
        boolean down;
        long mo6662screenToLocalMKHz9U;
        LongSparseArray longSparseArray = new LongSparseArray(pointerInputEvent.getPointers().size());
        List<PointerInputEventData> pointers = pointerInputEvent.getPointers();
        int size = pointers.size();
        for (int i = 0; i < size; i++) {
            PointerInputEventData pointerInputEventData = pointers.get(i);
            PointerInputData pointerInputData = this.previousPointerInputData.get(pointerInputEventData.m6606getIdJ3iCeTQ());
            if (pointerInputData == null) {
                down = false;
                uptime = pointerInputEventData.getUptime();
                mo6662screenToLocalMKHz9U = pointerInputEventData.m6609getPositionF1C5BW0();
            } else {
                uptime = pointerInputData.getUptime();
                down = pointerInputData.getDown();
                mo6662screenToLocalMKHz9U = positionCalculator.mo6662screenToLocalMKHz9U(pointerInputData.m6596getPositionOnScreenF1C5BW0());
            }
            longSparseArray.put(pointerInputEventData.m6606getIdJ3iCeTQ(), new PointerInputChange(pointerInputEventData.m6606getIdJ3iCeTQ(), pointerInputEventData.getUptime(), pointerInputEventData.m6609getPositionF1C5BW0(), pointerInputEventData.getDown(), pointerInputEventData.getPressure(), uptime, mo6662screenToLocalMKHz9U, down, false, pointerInputEventData.m6612getTypeT8wyACA(), pointerInputEventData.getHistorical(), pointerInputEventData.m6611getScrollDeltaF1C5BW0(), pointerInputEventData.getScaleGestureFactor(), pointerInputEventData.m6608getPanGestureOffsetF1C5BW0(), pointerInputEventData.m6607getOriginalEventPositionF1C5BW0(), null));
            boolean down2 = pointerInputEventData.getDown();
            LongSparseArray<PointerInputData> longSparseArray2 = this.previousPointerInputData;
            if (down2) {
                longSparseArray2.put(pointerInputEventData.m6606getIdJ3iCeTQ(), new PointerInputData(pointerInputEventData.getUptime(), pointerInputEventData.m6610getPositionOnScreenF1C5BW0(), pointerInputEventData.getDown(), null));
            } else {
                longSparseArray2.remove(pointerInputEventData.m6606getIdJ3iCeTQ());
            }
        }
        return new InternalPointerEvent(longSparseArray, pointerInputEvent);
    }
}
