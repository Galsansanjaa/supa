package androidx.compose.ui.platform;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.input.indirect.AndroidIndirectPointerEvent_androidKt;
import androidx.compose.ui.input.indirect.IndirectPointerEvent;
import androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class IndirectPointerNavigationGestureDetector {
    public static final int $stable = 8;
    private final GestureDetector gestureDetector;
    private boolean ignoreCurrentGestureStream;
    private final ps0 onMoveFocus;
    private int primaryDirectionalMotionAxis = IndirectPointerEventPrimaryDirectionalMotionAxis.Companion.m6099getNonenZO2Niw();

    public IndirectPointerNavigationGestureDetector(Context context, ps0 ps0Var) {
        this.onMoveFocus = ps0Var;
        this.gestureDetector = new GestureDetector(context, new GestureDetector.OnGestureListener() { // from class: androidx.compose.ui.platform.IndirectPointerNavigationGestureDetector$gestureDetector$1
            @Override // android.view.GestureDetector.OnGestureListener
            public boolean onDown(MotionEvent motionEvent) {
                return true;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                boolean z;
                ps0 ps0Var2;
                ps0 ps0Var3;
                z = IndirectPointerNavigationGestureDetector.this.ignoreCurrentGestureStream;
                if (z) {
                    return true;
                }
                int m7189getPrimaryDirectionalMotionAxisnZO2Niw = IndirectPointerNavigationGestureDetector.this.m7189getPrimaryDirectionalMotionAxisnZO2Niw();
                IndirectPointerEventPrimaryDirectionalMotionAxis.Companion companion = IndirectPointerEventPrimaryDirectionalMotionAxis.Companion;
                if (IndirectPointerEventPrimaryDirectionalMotionAxis.m6095equalsimpl0(m7189getPrimaryDirectionalMotionAxisnZO2Niw, companion.m6100getXnZO2Niw())) {
                    if (Math.abs(f) > Math.abs(f2)) {
                        int m4979getNextdhqQ8s = f > 0.0f ? FocusDirection.Companion.m4979getNextdhqQ8s() : FocusDirection.Companion.m4980getPreviousdhqQ8s();
                        ps0Var3 = IndirectPointerNavigationGestureDetector.this.onMoveFocus;
                        ps0Var3.invoke(FocusDirection.m4968boximpl(m4979getNextdhqQ8s));
                    }
                } else if (IndirectPointerEventPrimaryDirectionalMotionAxis.m6095equalsimpl0(IndirectPointerNavigationGestureDetector.this.m7189getPrimaryDirectionalMotionAxisnZO2Niw(), companion.m6101getYnZO2Niw()) && Math.abs(f2) > Math.abs(f)) {
                    int m4979getNextdhqQ8s2 = f2 > 0.0f ? FocusDirection.Companion.m4979getNextdhqQ8s() : FocusDirection.Companion.m4980getPreviousdhqQ8s();
                    ps0Var2 = IndirectPointerNavigationGestureDetector.this.onMoveFocus;
                    ps0Var2.invoke(FocusDirection.m4968boximpl(m4979getNextdhqQ8s2));
                }
                return true;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public void onLongPress(MotionEvent motionEvent) {
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                return true;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public void onShowPress(MotionEvent motionEvent) {
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(MotionEvent motionEvent) {
                return true;
            }
        });
    }

    public final void cancelCurrentEventStream() {
        this.primaryDirectionalMotionAxis = IndirectPointerEventPrimaryDirectionalMotionAxis.Companion.m6099getNonenZO2Niw();
        this.ignoreCurrentGestureStream = true;
    }

    /* renamed from: getPrimaryDirectionalMotionAxis-nZO2Niw, reason: not valid java name */
    public final int m7189getPrimaryDirectionalMotionAxisnZO2Niw() {
        return this.primaryDirectionalMotionAxis;
    }

    public final boolean onIndirectPointerEvent(IndirectPointerEvent indirectPointerEvent, boolean z) {
        MotionEvent nativeEvent = AndroidIndirectPointerEvent_androidKt.getNativeEvent(indirectPointerEvent);
        int action = nativeEvent.getAction();
        if (action == 0) {
            this.primaryDirectionalMotionAxis = indirectPointerEvent.mo6087getPrimaryDirectionalMotionAxisnZO2Niw();
            this.ignoreCurrentGestureStream = false;
        } else if ((action == 1 || action == 2) && z) {
            cancelCurrentEventStream();
        }
        return this.gestureDetector.onTouchEvent(nativeEvent);
    }

    /* renamed from: setPrimaryDirectionalMotionAxis-WQKaTuc, reason: not valid java name */
    public final void m7190setPrimaryDirectionalMotionAxisWQKaTuc(int i) {
        this.primaryDirectionalMotionAxis = i;
    }
}
