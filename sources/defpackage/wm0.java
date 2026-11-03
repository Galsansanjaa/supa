package defpackage;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.uptodown.R;
import com.uptodown.core.activities.FileExplorerActivity;
import com.uptodown.core.view.UptodownCheckBox;
import com.uptodown.core.view.UptodownEditText;
import com.uptodown.core.view.UptodownTextView;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class wm0 implements ViewBinding {
    public final Object a;
    public final Object b;
    public final Object m;
    public final Object n;
    public final Object o;
    public final Object p;
    public final Object q;
    public final Object r;

    public wm0(Context context, uh2 uh2Var, r82 r82Var, mu0 mu0Var, ea2 ea2Var, sa4 sa4Var, ca0 ca0Var) {
        AtomicReference atomicReference = new AtomicReference();
        this.q = atomicReference;
        this.r = new AtomicReference(new uo2());
        this.a = context;
        this.b = uh2Var;
        this.m = mu0Var;
        this.n = ea2Var;
        this.o = sa4Var;
        this.p = ca0Var;
        atomicReference.set(bp.m(r82Var));
    }

    public wm0(LinearLayout linearLayout, UptodownCheckBox uptodownCheckBox, UptodownEditText uptodownEditText, UptodownEditText uptodownEditText2, UptodownEditText uptodownEditText3, RelativeLayout relativeLayout, UptodownTextView uptodownTextView, UptodownTextView uptodownTextView2) {
        this.a = linearLayout;
        this.b = uptodownCheckBox;
        this.m = uptodownEditText;
        this.n = uptodownEditText2;
        this.o = uptodownEditText3;
        this.r = relativeLayout;
        this.p = uptodownTextView;
        this.q = uptodownTextView2;
    }

    public wm0(ProgressBar progressBar, TextView textView, EditText editText, FileExplorerActivity fileExplorerActivity, TextView textView2, TextView textView3, RelativeLayout relativeLayout, TextView textView4) {
        this.a = progressBar;
        this.b = textView;
        this.p = editText;
        this.q = fileExplorerActivity;
        this.m = textView2;
        this.n = textView3;
        this.r = relativeLayout;
        this.o = textView4;
    }

    public static void e(JSONObject jSONObject, String str) {
        String str2 = str + jSONObject.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str2, null);
        }
    }

    public void a(String str) {
        ((TextView) this.n).setText(str);
        ((RelativeLayout) this.r).setVisibility(8);
        ((TextView) this.m).setVisibility(8);
        ((TextView) this.o).setText(((FileExplorerActivity) this.q).getString(R.string.close));
    }

    public void b(String str) {
        str.getClass();
        EditText editText = (EditText) this.p;
        editText.setFocusable(false);
        editText.setFocusableInTouchMode(false);
        editText.clearFocus();
        ((ProgressBar) this.a).setVisibility(0);
        TextView textView = (TextView) this.b;
        textView.setVisibility(0);
        textView.setText(((FileExplorerActivity) this.q).getString(R.string.core_start_counting_value, str));
        ((TextView) this.m).setVisibility(8);
    }

    public nh2 c(int i) {
        nh2 nh2Var = null;
        try {
            if (!sg3.i(2, i)) {
                JSONObject b0 = ((ea2) this.n).b0();
                if (b0 != null) {
                    nh2 v = ((mu0) this.m).v(b0);
                    e(b0, "Loaded cached settings: ");
                    long currentTimeMillis = System.currentTimeMillis();
                    if (sg3.i(3, i) || v.c >= currentTimeMillis) {
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                            }
                            return v;
                        } catch (Exception e) {
                            nh2Var = v;
                            e = e;
                            Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                            return nh2Var;
                        }
                    }
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Cached settings have expired.", null);
                        return null;
                    }
                } else if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "No cached settings data found.", null);
                }
            }
            return null;
        } catch (Exception e2) {
            e = e2;
        }
    }

    public nh2 d() {
        return (nh2) ((AtomicReference) this.q).get();
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return (LinearLayout) this.a;
    }
}
