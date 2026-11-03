package defpackage;

import android.view.MotionEvent;
import android.view.View;
import androidx.core.view.DragStartHelper;
import com.google.android.material.search.SearchView;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class jh0 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jh0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((DragStartHelper) obj).onTouch(view, motionEvent);
            default:
                return SearchView.i((SearchView) obj, view, motionEvent);
        }
    }
}
