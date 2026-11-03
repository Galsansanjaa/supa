package androidx.compose.material3;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import defpackage.bw;
import defpackage.cw;
import defpackage.ea0;
import defpackage.mh0;
import defpackage.nb0;
import defpackage.os0;
import defpackage.p32;
import defpackage.ps0;
import defpackage.q32;
import defpackage.sb0;
import defpackage.vy2;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class RangeSliderState {
    private final MutableFloatState activeRangeEndState$delegate;
    private final MutableFloatState activeRangeStartState$delegate;
    private final MutableFloatState endThumbHeight$delegate;
    private final MutableFloatState endThumbWidth$delegate;
    private final ps0 gestureEndAction;
    private final MutableState isDragging$delegate;
    private final MutableState isRtl$delegate;
    private final MutableFloatState maxPx$delegate;
    private final MutableFloatState minPx$delegate;
    private ps0 onValueChange;
    private os0 onValueChangeFinished;
    private final MutableFloatState rawOffsetEnd$delegate;
    private final MutableFloatState rawOffsetStart$delegate;
    private final MutableFloatState startThumbHeight$delegate;
    private final MutableFloatState startThumbWidth$delegate;
    private final int steps;
    private final float[] tickFractions;
    private final MutableIntState totalWidth$delegate;
    private final cw valueRange;
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

        public static final List Saver$lambda$0(SaverScope saverScope, RangeSliderState rangeSliderState) {
            return nb0.D(Float.valueOf(rangeSliderState.getActiveRangeStart()), Float.valueOf(rangeSliderState.getActiveRangeEnd()), Integer.valueOf(rangeSliderState.getSteps()));
        }

        public static final RangeSliderState Saver$lambda$1(os0 os0Var, cw cwVar, List list) {
            Object obj = list.get(0);
            obj.getClass();
            float floatValue = ((Float) obj).floatValue();
            Object obj2 = list.get(1);
            obj2.getClass();
            float floatValue2 = ((Float) obj2).floatValue();
            Object obj3 = list.get(2);
            obj3.getClass();
            return new RangeSliderState(floatValue, floatValue2, ((Integer) obj3).intValue(), os0Var, cwVar);
        }

        public final Saver<RangeSliderState, ?> Saver(os0 os0Var, cw cwVar) {
            return ListSaverKt.listSaver(new mh0(21), new q32(os0Var, cwVar, 0));
        }
    }

    public RangeSliderState() {
        this(0.0f, 0.0f, 0, null, null, 31, null);
    }

    public RangeSliderState(float f, float f2, int i, os0 os0Var, cw cwVar) {
        float[] stepsToTickFractions;
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        this.steps = i;
        this.onValueChangeFinished = os0Var;
        this.valueRange = cwVar;
        this.activeRangeStartState$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(f);
        this.activeRangeEndState$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(f2);
        stepsToTickFractions = SliderKt.stepsToTickFractions(i);
        this.tickFractions = stepsToTickFractions;
        this.startThumbWidth$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.startThumbHeight$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.endThumbWidth$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.endThumbHeight$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.totalWidth$delegate = SnapshotIntStateKt.mutableIntStateOf(0);
        this.rawOffsetStart$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.rawOffsetEnd$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        Boolean bool = Boolean.FALSE;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.isDragging$delegate = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.isRtl$delegate = mutableStateOf$default2;
        this.gestureEndAction = new p32(this, 0);
        this.maxPx$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.minPx$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
    }

    public RangeSliderState(float f, float f2, int i, os0 os0Var, cw cwVar, int i2, sb0 sb0Var) {
        this((i2 & 1) != 0 ? 0.0f : f, (i2 & 2) != 0 ? 1.0f : f2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : os0Var, (i2 & 16) != 0 ? new bw(0.0f, 1.0f) : cwVar);
    }

    public static final vy2 gestureEndAction$lambda$0(RangeSliderState rangeSliderState, boolean z) {
        os0 os0Var = rangeSliderState.onValueChangeFinished;
        if (os0Var != null) {
            os0Var.invoke();
        }
        return vy2.a;
    }

    private final float getActiveRangeEndState() {
        return this.activeRangeEndState$delegate.getFloatValue();
    }

    private final float getActiveRangeStartState() {
        return this.activeRangeStartState$delegate.getFloatValue();
    }

    private final float getMaxPx() {
        return this.maxPx$delegate.getFloatValue();
    }

    private final float getMinPx() {
        return this.minPx$delegate.getFloatValue();
    }

    private final float scaleToOffset(float f, float f2, float f3) {
        float scale;
        scale = SliderKt.scale(Float.valueOf(((bw) this.valueRange).a).floatValue(), Float.valueOf(((bw) this.valueRange).b).floatValue(), f3, f, f2);
        return scale;
    }

    /* renamed from: scaleToUserValue-8bqG3aw */
    private final long m2911scaleToUserValue8bqG3aw(boolean z, float f, float f2, long j) {
        long m3055scale2geJ7wY;
        m3055scale2geJ7wY = SliderKt.m3055scale2geJ7wY(z, f, f2, j, Float.valueOf(((bw) this.valueRange).a).floatValue(), Float.valueOf(((bw) this.valueRange).b).floatValue());
        return m3055scale2geJ7wY;
    }

    private final void setActiveRangeEndState(float f) {
        this.activeRangeEndState$delegate.setFloatValue(f);
    }

    private final void setActiveRangeStartState(float f) {
        this.activeRangeStartState$delegate.setFloatValue(f);
    }

    private final void setMaxPx(float f) {
        this.maxPx$delegate.setFloatValue(f);
    }

    private final void setMinPx(float f) {
        this.minPx$delegate.setFloatValue(f);
    }

    public final float getActiveRangeEnd() {
        return getActiveRangeEndState();
    }

    public final float getActiveRangeStart() {
        return getActiveRangeStartState();
    }

    public final float getCoercedActiveRangeEndAsFraction$material3() {
        float calcFraction;
        calcFraction = SliderKt.calcFraction(Float.valueOf(((bw) this.valueRange).a).floatValue(), Float.valueOf(((bw) this.valueRange).b).floatValue(), getActiveRangeEnd());
        return calcFraction;
    }

    public final float getCoercedActiveRangeStartAsFraction$material3() {
        float calcFraction;
        calcFraction = SliderKt.calcFraction(Float.valueOf(((bw) this.valueRange).a).floatValue(), Float.valueOf(((bw) this.valueRange).b).floatValue(), getActiveRangeStart());
        return calcFraction;
    }

    public final int getEndSteps$material3() {
        return (int) Math.floor((1.0f - getCoercedActiveRangeStartAsFraction$material3()) * this.steps);
    }

    public final float getEndThumbHeight$material3() {
        return this.endThumbHeight$delegate.getFloatValue();
    }

    public final float getEndThumbWidth$material3() {
        return this.endThumbWidth$delegate.getFloatValue();
    }

    public final ps0 getGestureEndAction$material3() {
        return this.gestureEndAction;
    }

    public final ps0 getOnValueChange$material3() {
        return this.onValueChange;
    }

    public final os0 getOnValueChangeFinished() {
        return this.onValueChangeFinished;
    }

    public final float getRawOffsetEnd$material3() {
        return this.rawOffsetEnd$delegate.getFloatValue();
    }

    public final float getRawOffsetStart$material3() {
        return this.rawOffsetStart$delegate.getFloatValue();
    }

    public final int getStartSteps$material3() {
        return (int) Math.floor(getCoercedActiveRangeEndAsFraction$material3() * this.steps);
    }

    public final float getStartThumbHeight$material3() {
        return this.startThumbHeight$delegate.getFloatValue();
    }

    public final float getStartThumbWidth$material3() {
        return this.startThumbWidth$delegate.getFloatValue();
    }

    public final int getSteps() {
        return this.steps;
    }

    public final float[] getTickFractions$material3() {
        return this.tickFractions;
    }

    public final int getTotalWidth$material3() {
        return this.totalWidth$delegate.getIntValue();
    }

    public final cw getValueRange() {
        return this.valueRange;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isDragging$material3() {
        return ((Boolean) this.isDragging$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isRtl$material3() {
        return ((Boolean) this.isRtl$delegate.getValue()).booleanValue();
    }

    public final void onDrag$material3(boolean z, float f) {
        float snapValueToTick;
        long SliderRange;
        float snapValueToTick2;
        if (z) {
            setRawOffsetStart$material3(getRawOffsetStart$material3() + f);
            setRawOffsetEnd$material3(scaleToOffset(getMinPx(), getMaxPx(), getActiveRangeEnd()));
            float rawOffsetEnd$material3 = getRawOffsetEnd$material3();
            snapValueToTick2 = SliderKt.snapValueToTick(ea0.n(getRawOffsetStart$material3(), getMinPx(), rawOffsetEnd$material3), this.tickFractions, getMinPx(), getMaxPx());
            if (snapValueToTick2 > rawOffsetEnd$material3) {
                snapValueToTick2 = rawOffsetEnd$material3;
            }
            SliderRange = SliderKt.SliderRange(snapValueToTick2, rawOffsetEnd$material3);
        } else {
            setRawOffsetEnd$material3(getRawOffsetEnd$material3() + f);
            setRawOffsetStart$material3(scaleToOffset(getMinPx(), getMaxPx(), getActiveRangeStart()));
            float rawOffsetStart$material3 = getRawOffsetStart$material3();
            snapValueToTick = SliderKt.snapValueToTick(ea0.n(getRawOffsetEnd$material3(), rawOffsetStart$material3, getMaxPx()), this.tickFractions, getMinPx(), getMaxPx());
            if (snapValueToTick < rawOffsetStart$material3) {
                snapValueToTick = rawOffsetStart$material3;
            }
            SliderRange = SliderKt.SliderRange(rawOffsetStart$material3, snapValueToTick);
        }
        long m2911scaleToUserValue8bqG3aw = m2911scaleToUserValue8bqG3aw(z, getMinPx(), getMaxPx(), SliderRange);
        if (SliderRange.m3061equalsimpl0(m2911scaleToUserValue8bqG3aw, SliderKt.SliderRange(getActiveRangeStart(), getActiveRangeEnd()))) {
            return;
        }
        ps0 ps0Var = this.onValueChange;
        if (ps0Var == null) {
            setActiveRangeStart(SliderRange.m3063getStartimpl(m2911scaleToUserValue8bqG3aw));
            setActiveRangeEnd(SliderRange.m3062getEndInclusiveimpl(m2911scaleToUserValue8bqG3aw));
        } else if (ps0Var != null) {
            ps0Var.invoke(SliderRange.m3058boximpl(m2911scaleToUserValue8bqG3aw));
        }
    }

    public final void setActiveRangeEnd(float f) {
        float snapValueToTick;
        snapValueToTick = SliderKt.snapValueToTick(ea0.n(f, getActiveRangeStart(), Float.valueOf(((bw) this.valueRange).b).floatValue()), this.tickFractions, Float.valueOf(((bw) this.valueRange).a).floatValue(), Float.valueOf(((bw) this.valueRange).b).floatValue());
        setActiveRangeEndState(snapValueToTick);
    }

    public final void setActiveRangeStart(float f) {
        float snapValueToTick;
        snapValueToTick = SliderKt.snapValueToTick(ea0.n(f, Float.valueOf(((bw) this.valueRange).a).floatValue(), getActiveRangeEnd()), this.tickFractions, Float.valueOf(((bw) this.valueRange).a).floatValue(), Float.valueOf(((bw) this.valueRange).b).floatValue());
        setActiveRangeStartState(snapValueToTick);
    }

    public final void setDragging$material3(boolean z) {
        this.isDragging$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setEndThumbHeight$material3(float f) {
        this.endThumbHeight$delegate.setFloatValue(f);
    }

    public final void setEndThumbWidth$material3(float f) {
        this.endThumbWidth$delegate.setFloatValue(f);
    }

    public final void setOnValueChange$material3(ps0 ps0Var) {
        this.onValueChange = ps0Var;
    }

    public final void setOnValueChangeFinished(os0 os0Var) {
        this.onValueChangeFinished = os0Var;
    }

    public final void setRawOffsetEnd$material3(float f) {
        this.rawOffsetEnd$delegate.setFloatValue(f);
    }

    public final void setRawOffsetStart$material3(float f) {
        this.rawOffsetStart$delegate.setFloatValue(f);
    }

    public final void setRtl$material3(boolean z) {
        this.isRtl$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setStartThumbHeight$material3(float f) {
        this.startThumbHeight$delegate.setFloatValue(f);
    }

    public final void setStartThumbWidth$material3(float f) {
        this.startThumbWidth$delegate.setFloatValue(f);
    }

    public final void setTotalWidth$material3(int i) {
        this.totalWidth$delegate.setIntValue(i);
    }

    public final void updateMinMaxPx$material3() {
        float max = Math.max(getTotalWidth$material3() - (getEndThumbWidth$material3() / 2.0f), 0.0f);
        float min = Math.min(getStartThumbWidth$material3() / 2.0f, max);
        if (isDragging$material3()) {
            return;
        }
        if (getMinPx() == min && getMaxPx() == max && getActiveRangeStart() == getActiveRangeEnd()) {
            return;
        }
        setMinPx(min);
        setMaxPx(max);
        setRawOffsetStart$material3(scaleToOffset(getMinPx(), getMaxPx(), getActiveRangeStart()));
        setRawOffsetEnd$material3(scaleToOffset(getMinPx(), getMaxPx(), getActiveRangeEnd()));
    }
}
