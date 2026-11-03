package defpackage;

import android.app.AlertDialog;
import android.app.Application;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.Window;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import java.net.Socket;
import java.util.ArrayList;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class rr1 extends m10 {
    public ProgressBar A;
    public AlertDialog B;
    public TextView C;
    public TextView D;
    public TextView z;

    public final void E() {
        View inflate = View.inflate(this, R.layout.core_dialog_sending_file, null);
        this.z = (TextView) inflate.findViewById(R.id.tv_percentage_dialog_sending);
        ProgressBar progressBar = (ProgressBar) inflate.findViewById(R.id.progressbar_dialog_sending);
        this.A = progressBar;
        if (progressBar != null) {
            progressBar.setProgress(0);
        }
        TextView textView = (TextView) inflate.findViewById(R.id.tv_cancel_dialog_sending);
        if (textView != null) {
            textView.setOnClickListener(new pr1(this, 1));
        }
        this.C = (TextView) inflate.findViewById(R.id.tv_sending_app);
        this.D = (TextView) inflate.findViewById(R.id.tv_device_to_sending);
        I(inflate);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.recyclerview.widget.RecyclerView$Adapter, qd0] */
    public final void F() {
        yr1 yr1Var = k13.y;
        Integer valueOf = yr1Var != null ? Integer.valueOf(yr1Var.g.size()) : null;
        valueOf.getClass();
        if (valueOf.intValue() <= 0) {
            l(getString(R.string.nsd_no_devices_available));
            return;
        }
        pn1 pn1Var = (pn1) this;
        jm3 jm3Var = new jm3((Object) pn1Var, 17);
        View inflate = View.inflate(this, R.layout.core_devices_available_nsd, null);
        yr1 yr1Var2 = k13.y;
        yr1Var2.getClass();
        ArrayList arrayList = yr1Var2.g;
        ?? adapter = new RecyclerView.Adapter();
        adapter.a = arrayList;
        adapter.b = jm3Var;
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.rv_devices);
        if (recyclerView != 0) {
            recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), 1, false));
        }
        recyclerView.setAdapter(adapter);
        View findViewById = inflate.findViewById(R.id.tv_cancel);
        findViewById.getClass();
        ((TextView) findViewById).setOnClickListener(new pr1(pn1Var, 3));
        I(inflate);
    }

    public final void G() {
        AlertDialog alertDialog = this.B;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        this.B = null;
    }

    public void H() {
    }

    public final void I(View view) {
        AlertDialog alertDialog;
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(view);
        builder.setCancelable(false);
        AlertDialog create = builder.create();
        this.B = create;
        Window window = create != null ? create.getWindow() : null;
        window.getClass();
        window.setBackgroundDrawable(new ColorDrawable(0));
        if (isFinishing() || (alertDialog = this.B) == null) {
            return;
        }
        alertDialog.show();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Socket socket;
        yr1 yr1Var;
        super.onResume();
        tr1 tr1Var = k13.z;
        if (tr1Var != null && ((socket = tr1Var.d) == null || socket.isClosed())) {
            Application application = getApplication();
            application.getClass();
            if (!((k13) application).b.get() && (yr1Var = k13.y) != null) {
                yr1Var.a();
            }
        }
        AlertDialog alertDialog = this.B;
        if (alertDialog != null) {
            int i = 1;
            if (alertDialog.isShowing()) {
                int i2 = 0;
                if (k13.A) {
                    k13.A = false;
                    runOnUiThread(new or1(this, i));
                    ux2.z(this, null);
                    return;
                }
                String str = k13.B;
                if (str != null) {
                    runOnUiThread(new z50(this, str, k13.C, 3));
                    k13.B = null;
                    k13.C = null;
                    return;
                }
                String str2 = k13.D;
                if (str2 != null) {
                    runOnUiThread(new qr1(this, str2, i));
                    k13.D = null;
                    return;
                }
                String str3 = k13.E;
                if (str3 != null) {
                    runOnUiThread(new qr1(this, str3, i2));
                    k13.E = null;
                }
            }
        }
    }
}
