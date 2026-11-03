package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import com.uptodown.UptodownApp;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class yl extends RecyclerView.ViewHolder {
    public final Context a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yl(View view, Context context) {
        super(view);
        view.getClass();
        context.getClass();
        this.a = context;
    }

    public static void a(RelativeLayout.LayoutParams layoutParams, Context context, int i, int i2) {
        context.getClass();
        int dimension = (int) context.getResources().getDimension(R.dimen.margin_m);
        String str = null;
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences("SettingsPreferences", 0);
            if (sharedPreferences.contains("Language")) {
                str = sharedPreferences.getString("Language", null);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (!jh2.k(str, "ar")) {
            if (i == i2) {
                layoutParams.setMargins(dimension, 0, dimension, 0);
                return;
            } else {
                layoutParams.setMargins(dimension, 0, 0, 0);
                return;
            }
        }
        if (i == i2) {
            layoutParams.setMargins(dimension, 0, 0, 0);
        } else if (i == 1) {
            layoutParams.setMargins(dimension, 0, dimension, 0);
        } else {
            layoutParams.setMargins(dimension, 0, 0, 0);
        }
    }

    public static void b(View view, dc dcVar, cc ccVar) {
        view.getClass();
        dcVar.getClass();
        ccVar.getClass();
        view.setOnClickListener(new f9(15, dcVar, ccVar));
    }

    public static void e(cc ccVar, TextView textView, TextView textView2) {
        ccVar.getClass();
        textView.getClass();
        textView2.getClass();
        textView.setText(ccVar.b);
        String str = ccVar.p;
        if (str == null) {
            str = ccVar.x;
        }
        if (str == null || str.length() == 0) {
            str = ccVar.w;
        }
        textView2.setText(str);
    }

    public final void c(String str, TextView textView, TextView textView2) {
        textView.getClass();
        textView2.getClass();
        Context context = this.a;
        PackageInfo packageInfo = null;
        if (str != null && context != null) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    packageInfo = zu0.i(packageManager, str, 0);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (!(packageInfo != null)) {
            textView.setVisibility(8);
            textView2.setVisibility(0);
            return;
        }
        z90 r = z90.E.r(context);
        r.a();
        str.getClass();
        gz2 Y = r.Y(str);
        r7 B = r.B(str);
        r.d();
        if (B == null) {
            textView.setVisibility(0);
            textView2.setVisibility(8);
            return;
        }
        if (B.d()) {
            textView.setVisibility(8);
            textView2.setVisibility(0);
            return;
        }
        if (B.L) {
            textView.setText(context.getString(R.string.dark_mode_disabled));
            textView.setTextColor(ContextCompat.getColor(context, R.color.grey_70));
            textView.setBackground(ContextCompat.getDrawable(context, R.drawable.bg_status_download_installed));
        } else if (Y == null || Y.c() || B.w != 0) {
            textView.setText(context.getString(R.string.status_download_installed));
            ej1.M(textView);
        } else {
            textView.setText(context.getString(R.string.status_download_update));
            ej1.Q(textView);
        }
        textView.setVisibility(0);
        textView2.setVisibility(8);
    }

    public final void d(ImageView imageView, String str) {
        imageView.getClass();
        Context context = this.a;
        if (str == null) {
            imageView.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_app_icon_placeholder));
            return;
        }
        l72 e = dx1.d().e(str);
        e13 e13Var = UptodownApp.J;
        e.g(e13.f(context));
        e.h(e13.w(context));
        e.e(imageView, null);
    }
}
