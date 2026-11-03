package androidx.leanback.app;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
class GuidedStepRootLayout extends LinearLayout {
    private boolean mFocusOutEnd;
    private boolean mFocusOutStart;

    public GuidedStepRootLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mFocusOutStart = false;
        this.mFocusOutEnd = false;
    }

    public GuidedStepRootLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mFocusOutStart = false;
        this.mFocusOutEnd = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0020, code lost:
    
        if (r4.mFocusOutStart != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0027 A[RETURN] */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View focusSearch(android.view.View r5, int r6) {
        /*
            r4 = this;
            android.view.View r0 = super.focusSearch(r5, r6)
            r1 = 66
            r2 = 17
            if (r6 == r2) goto Lc
            if (r6 != r1) goto L28
        Lc:
            boolean r3 = androidx.leanback.widget.Util.isDescendant(r4, r0)
            if (r3 == 0) goto L13
            goto L28
        L13:
            int r3 = r4.getLayoutDirection()
            if (r3 != 0) goto L1c
            if (r6 != r2) goto L23
            goto L1e
        L1c:
            if (r6 != r1) goto L23
        L1e:
            boolean r4 = r4.mFocusOutStart
            if (r4 != 0) goto L28
            goto L27
        L23:
            boolean r4 = r4.mFocusOutEnd
            if (r4 != 0) goto L28
        L27:
            return r5
        L28:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.app.GuidedStepRootLayout.focusSearch(android.view.View, int):android.view.View");
    }

    public void setFocusOutEnd(boolean z) {
        this.mFocusOutEnd = z;
    }

    public void setFocusOutStart(boolean z) {
        this.mFocusOutStart = z;
    }
}
