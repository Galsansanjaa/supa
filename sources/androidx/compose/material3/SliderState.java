package androidx.compose.material3;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.gestures.DragScope;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import defpackage.a10;
import defpackage.bw;
import defpackage.cw;
import defpackage.e50;
import defpackage.ea0;
import defpackage.gk2;
import defpackage.mi2;
import defpackage.nb0;
import defpackage.os0;
import defpackage.ps0;
import defpackage.q32;
import defpackage.sb0;
import defpackage.ts0;
import defpackage.vy2;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class SliderState implements DraggableState {
    private final DragScope dragScope;
    private final os0 gestureEndAction;
    private final MutableState isDragging$delegate;
    private boolean isRtl;
    private ps0 onValueChange;
    private os0 onValueChangeFinished;
    private Orientation orientation;
    private final MutableFloatState pressOffset$delegate;
    private final MutableFloatState rawOffset$delegate;
    private boolean reverseVerticalDirection;
    private final MutatorMutex scrollMutex;
    private boolean shouldAutoSnap;
    private final int steps;
    private final MutableIntState thumbHeight$delegate;
    private final MutableIntState thumbWidth$delegate;
    private final float[] tickFractions;
    private final MutableIntState totalHeight$delegate;
    private final MutableIntState totalWidth$delegate;
    private final cw valueRange;
    private final MutableFloatState valueState$delegate;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        public static final List Saver$lambda$0(SaverScope saverScope, SliderState sliderState) {
            return nb0.D(Float.valueOf(sliderState.getValue()), Integer.valueOf(sliderState.getSteps()));
        }

        public static final SliderState Saver$lambda$1(os0 os0Var, cw cwVar, List list) {
            Object obj = list.get(0);
            obj.getClass();
            float floatValue = ((Float) obj).floatValue();
            Object obj2 = list.get(1);
            obj2.getClass();
            return new SliderState(floatValue, ((Integer) obj2).intValue(), os0Var, cwVar);
        }

        public final Saver<SliderState, ?> Saver(os0 os0Var, cw cwVar) {
            return ListSaverKt.listSaver(new gk2(0), new q32(os0Var, cwVar, 1));
        }
    }

    public SliderState() {
        this(0.0f, 0, null, null, 15, null);
    }

    public SliderState(float f, int i, os0 os0Var, cw cwVar) {
        float[] stepsToTickFractions;
        MutableState mutableStateOf$default;
        this.steps = i;
        this.onValueChangeFinished = os0Var;
        this.valueRange = cwVar;
        this.valueState$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(f);
        this.shouldAutoSnap = true;
        stepsToTickFractions = SliderKt.stepsToTickFractions(i);
        this.tickFractions = stepsToTickFractions;
        this.totalWidth$delegate = SnapshotIntStateKt.mutableIntStateOf(0);
        this.totalHeight$delegate = SnapshotIntStateKt.mutableIntStateOf(0);
        this.thumbWidth$delegate = SnapshotIntStateKt.mutableIntStateOf(0);
        this.thumbHeight$delegate = SnapshotIntStateKt.mutableIntStateOf(0);
        this.orientation = Orientation.Horizontal;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.isDragging$delegate = mutableStateOf$default;
        this.gestureEndAction = new mi2(this, 1);
        this.rawOffset$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(scaleToOffset(0.0f, 0.0f, f));
        this.pressOffset$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.dragScope = new DragScope() { // from class: androidx.compose.material3.SliderState$dragScope$1
            @Override // androidx.compose.foundation.gestures.DragScope
            public void dragBy(float f2) {
                SliderState.this.dispatchRawDelta(f2);
            }
        };
        this.scrollMutex = new MutatorMutex();
    }

    public SliderState(float f, int i, os0 os0Var, cw cwVar, int i2, sb0 sb0Var) {
        this((i2 & 1) != 0 ? 0.0f : f, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : os0Var, (i2 & 8) != 0 ? new bw(0.0f, 1.0f) : cwVar);
    }

    private final float calculateSnappedValue(float f) {
        float snapValueToTick;
        snapValueToTick = SliderKt.snapValueToTick(ea0.n(f, Float.valueOf(((bw) this.valueRange).a).floatValue(), Float.valueOf(((bw) this.valueRange).b).floatValue()), this.tickFractions, Float.valueOf(((bw) this.valueRange).a).floatValue(), Float.valueOf(((bw) this.valueRange).b).floatValue());
        return snapValueToTick;
    }

    public static final vy2 gestureEndAction$lambda$1(SliderState sliderState) {
        os0 os0Var;
        if (!sliderState.isDragging() && (os0Var = sliderState.onValueChangeFinished) != null) {
            os0Var.invoke();
        }
        return vy2.a;
    }

    private final float getPressOffset() {
        return this.pressOffset$delegate.getFloatValue();
    }

    private final float getRawOffset() {
        return this.rawOffset$delegate.getFloatValue();
    }

    private final int getTotalHeight() {
        return this.totalHeight$delegate.getIntValue();
    }

    private final int getTotalWidth() {
        return this.totalWidth$delegate.getIntValue();
    }

    private final float getValueState() {
        return this.valueState$delegate.getFloatValue();
    }

    private final float scaleToOffset(float f, float f2, float f3) {
        float scale;
        scale = SliderKt.scale(Float.valueOf(((bw) this.valueRange).a).floatValue(), Float.valueOf(((bw) this.valueRange).b).floatValue(), f3, f, f2);
        return scale;
    }

    private final float scaleToUserValue(float f, float f2, float f3) {
        float scale;
        scale = SliderKt.scale(f, f2, f3, Float.valueOf(((bw) this.valueRange).a).floatValue(), Float.valueOf(((bw) this.valueRange).b).floatValue());
        return scale;
    }

    public final void setDragging(boolean z) {
        this.isDragging$delegate.setValue(Boolean.valueOf(z));
    }

    private final void setPressOffset(float f) {
        this.pressOffset$delegate.setFloatValue(f);
    }

    private final void setRawOffset(float f) {
        this.rawOffset$delegate.setFloatValue(f);
    }

    private final void setTotalHeight(int i) {
        this.totalHeight$delegate.setIntValue(i);
    }

    private final void setTotalWidth(int i) {
        this.totalWidth$delegate.setIntValue(i);
    }

    private final void setValueState(float f) {
        this.valueState$delegate.setFloatValue(f);
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public void dispatchRawDelta(float f) {
        float max;
        float min;
        float snapValueToTick;
        if (this.orientation == Orientation.Vertical) {
            max = Math.max(getTotalHeight() - (getThumbHeight$material3() / 2.0f), 0.0f);
            min = Math.min(getThumbHeight$material3() / 2.0f, max);
        } else {
            max = Math.max(getTotalWidth() - (getThumbWidth$material3() / 2.0f), 0.0f);
            min = Math.min(getThumbWidth$material3() / 2.0f, max);
        }
        setRawOffset(getRawOffset() + f + getPressOffset());
        setPressOffset(0.0f);
        snapValueToTick = SliderKt.snapValueToTick(getRawOffset(), this.tickFractions, min, max);
        float scaleToUserValue = scaleToUserValue(min, max, snapValueToTick);
        if (scaleToUserValue == getValue()) {
            return;
        }
        ps0 ps0Var = this.onValueChange;
        if (ps0Var == null) {
            setValue(scaleToUserValue);
        } else if (ps0Var != null) {
            ps0Var.invoke(Float.valueOf(scaleToUserValue));
        }
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public Object drag(MutatePriority mutatePriority, ts0 ts0Var, a10 a10Var) {
        Object u = ea0.u(new SliderState$drag$2(this, mutatePriority, ts0Var, null), a10Var);
        return u == e50.a ? u : vy2.a;
    }

    public final float getCoercedValueAsFraction() {
        float calcFraction;
        calcFraction = SliderKt.calcFraction(Float.valueOf(((bw) this.valueRange).a).floatValue(), Float.valueOf(((bw) this.valueRange).b).floatValue(), ea0.n(getValue(), Float.valueOf(((bw) this.valueRange).a).floatValue(), Float.valueOf(((bw) this.valueRange).b).floatValue()));
        return calcFraction;
    }

    public final os0 getGestureEndAction$material3() {
        return this.gestureEndAction;
    }

    public final ps0 getOnValueChange() {
        return this.onValueChange;
    }

    public final os0 getOnValueChangeFinished() {
        return this.onValueChangeFinished;
    }

    public final Orientation getOrientation$material3() {
        return this.orientation;
    }

    public final boolean getReverseVerticalDirection$material3() {
        return this.reverseVerticalDirection;
    }

    public final int getSteps() {
        return this.steps;
    }

    public final int getThumbHeight$material3() {
        return this.thumbHeight$delegate.getIntValue();
    }

    public final int getThumbWidth$material3() {
        return this.thumbWidth$delegate.getIntValue();
    }

    public final float[] getTickFractions$material3() {
        return this.tickFractions;
    }

    public final float getValue() {
        return getValueState();
    }

    public final cw getValueRange() {
        return this.valueRange;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isDragging() {
        return ((Boolean) this.isDragging$delegate.getValue()).booleanValue();
    }

    public final boolean isRtl$material3() {
        return this.isRtl;
    }

    /* renamed from: onPress-k-4lQ0M$material3 */
    public final void m3069onPressk4lQ0M$material3(long j) {
        float intBitsToFloat;
        float totalWidth;
        float intBitsToFloat2;
        if (this.orientation == Orientation.Vertical) {
            if (this.reverseVerticalDirection) {
                totalWidth = getTotalHeight();
                intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
                intBitsToFloat = totalWidth - intBitsToFloat2;
            } else {
                intBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
            }
        } else if (this.isRtl) {
            totalWidth = getTotalWidth();
            intBitsToFloat2 = Float.intBitsToFloat((int) (j >> 32));
            intBitsToFloat = totalWidth - intBitsToFloat2;
        } else {
            intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        }
        setPressOffset(intBitsToFloat - getRawOffset());
    }

    public final void setOnValueChange(ps0 ps0Var) {
        this.onValueChange = ps0Var;
    }

    public final void setOnValueChangeFinished(os0 os0Var) {
        this.onValueChangeFinished = os0Var;
    }

    public final void setOrientation$material3(Orientation orientation) {
        this.orientation = orientation;
    }

    public final void setReverseVerticalDirection$material3(boolean z) {
        this.reverseVerticalDirection = z;
    }

    public final void setRtl$material3(boolean z) {
        this.isRtl = z;
    }

    public final void setShouldAutoSnap(boolean z) {
        this.shouldAutoSnap = z;
    }

    public final void setThumbHeight$material3(int i) {
        this.thumbHeight$delegate.setIntValue(i);
    }

    public final void setThumbWidth$material3(int i) {
        this.thumbWidth$delegate.setIntValue(i);
    }

    public final void setValue(float f) {
        if (this.shouldAutoSnap) {
            f = calculateSnappedValue(f);
        }
        setValueState(f);
    }

    public final boolean shouldAutoSnap() {
        return this.shouldAutoSnap;
    }

    public final void updateDimensions$material3(int i, int i2) {
        setTotalWidth(i);
        setTotalHeight(i2);
    }
}
