package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import androidx.documentfile.provider.DocumentFile;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.uptodown.R;
import java.io.File;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class m10 extends AppCompatActivity {
    public AlertDialog a;
    public TextView b;
    public RadioButton m;
    public RadioButton n;
    public RadioButton o;
    public CheckBox p;
    public CheckBox q;
    public TextView r;
    public TextView s;
    public Boolean t;
    public String u;
    public final ActivityResultLauncher v;
    public final ActivityResultLauncher w;
    public final ActivityResultLauncher x;
    public final ActivityResultLauncher y;

    public m10() {
        final int i = 0;
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback(this) { // from class: g10
            public final /* synthetic */ m10 b;

            {
                this.b = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                Bundle extras;
                Bundle extras2;
                Bundle extras3;
                int i2 = i;
                boolean z = false;
                m10 m10Var = this.b;
                ActivityResult activityResult = (ActivityResult) obj;
                switch (i2) {
                    case 0:
                        if (m10Var.o()) {
                            m10Var.w();
                            return;
                        } else {
                            m10Var.u();
                            return;
                        }
                    case 1:
                        if (activityResult.getResultCode() == -1) {
                            Intent data = activityResult.getData();
                            Uri data2 = data != null ? data.getData() : null;
                            if (data2 == null) {
                                m10Var.r();
                                return;
                            }
                            Intent data3 = activityResult.getData();
                            Integer valueOf = data3 != null ? Integer.valueOf(data3.getFlags()) : null;
                            if (valueOf != null) {
                                valueOf = Integer.valueOf(valueOf.intValue() & 3);
                            }
                            ContentResolver contentResolver = m10Var.getContentResolver();
                            valueOf.getClass();
                            contentResolver.takePersistableUriPermission(data2, valueOf.intValue());
                            String path = data2.getPath();
                            if (path != null) {
                                Pattern compile = Pattern.compile(".*\\b[ABCDEF[0-9]][ABCDEF[0-9]][ABCDEF[0-9]][ABCDEF[0-9]]-[ABCDEF[0-9]][ABCDEF[0-9]][ABCDEF[0-9]][ABCDEF[0-9]]:.*");
                                compile.getClass();
                                z = compile.matcher(path).matches();
                            }
                            if (z) {
                                m10Var.s();
                                return;
                            } else {
                                m10Var.t();
                                return;
                            }
                        }
                        return;
                    case 2:
                        m10Var.y();
                        return;
                    default:
                        activityResult.getClass();
                        if (activityResult.getResultCode() == 145) {
                            Intent data4 = activityResult.getData();
                            m10Var.u = (data4 == null || (extras3 = data4.getExtras()) == null) ? null : extras3.getString("path_selected");
                            Intent data5 = activityResult.getData();
                            m10Var.t = (data5 == null || (extras2 = data5.getExtras()) == null) ? null : Boolean.valueOf(extras2.getBoolean("sdcard_selected"));
                            Intent data6 = activityResult.getData();
                            Uri data7 = data6 != null ? data6.getData() : null;
                            if (m10Var.u != null) {
                                String str = m10Var.u;
                                str.getClass();
                                File file = new File(str);
                                TextView textView = m10Var.r;
                                if (textView == null) {
                                    jh2.b0("tvPath");
                                    throw null;
                                }
                                textView.setText(m10Var.u);
                                if (file.exists() && file.isDirectory() && file.canWrite()) {
                                    TextView textView2 = m10Var.s;
                                    if (textView2 != null) {
                                        textView2.setVisibility(8);
                                        return;
                                    } else {
                                        jh2.b0("tvErrorPath");
                                        throw null;
                                    }
                                }
                                TextView textView3 = m10Var.s;
                                if (textView3 != null) {
                                    textView3.setVisibility(0);
                                    return;
                                } else {
                                    jh2.b0("tvErrorPath");
                                    throw null;
                                }
                            }
                            if (data7 == null) {
                                TextView textView4 = m10Var.s;
                                if (textView4 != null) {
                                    textView4.setVisibility(0);
                                    return;
                                } else {
                                    jh2.b0("tvErrorPath");
                                    throw null;
                                }
                            }
                            String lastPathSegment = data7.getLastPathSegment();
                            Intent data8 = activityResult.getData();
                            m10Var.t = (data8 == null || (extras = data8.getExtras()) == null) ? null : Boolean.valueOf(extras.getBoolean("sdcard_selected"));
                            m10Var.u = lastPathSegment != null ? lastPathSegment.substring(um2.y0(":", lastPathSegment, 6) + 1) : null;
                            boolean k = jh2.k(m10Var.t, Boolean.TRUE);
                            TextView textView5 = m10Var.r;
                            if (k) {
                                if (textView5 == null) {
                                    jh2.b0("tvPath");
                                    throw null;
                                }
                                textView5.setText(m10Var.getString(R.string.sd_card) + DomExceptionUtils.SEPARATOR + m10Var.u);
                            } else {
                                if (textView5 == null) {
                                    jh2.b0("tvPath");
                                    throw null;
                                }
                                textView5.setText(m10Var.getString(R.string.internal_storage) + DomExceptionUtils.SEPARATOR + m10Var.u);
                            }
                            DocumentFile fromSingleUri = DocumentFile.fromSingleUri(m10Var, data7);
                            if (fromSingleUri != null && fromSingleUri.exists() && fromSingleUri.isDirectory() && fromSingleUri.canWrite()) {
                                TextView textView6 = m10Var.s;
                                if (textView6 != null) {
                                    textView6.setVisibility(8);
                                    return;
                                } else {
                                    jh2.b0("tvErrorPath");
                                    throw null;
                                }
                            }
                            TextView textView7 = m10Var.s;
                            if (textView7 != null) {
                                textView7.setVisibility(0);
                                return;
                            } else {
                                jh2.b0("tvErrorPath");
                                throw null;
                            }
                        }
                        return;
                }
            }
        });
        registerForActivityResult.getClass();
        this.v = registerForActivityResult;
        final int i2 = 1;
        ActivityResultLauncher registerForActivityResult2 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback(this) { // from class: g10
            public final /* synthetic */ m10 b;

            {
                this.b = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                Bundle extras;
                Bundle extras2;
                Bundle extras3;
                int i22 = i2;
                boolean z = false;
                m10 m10Var = this.b;
                ActivityResult activityResult = (ActivityResult) obj;
                switch (i22) {
                    case 0:
                        if (m10Var.o()) {
                            m10Var.w();
                            return;
                        } else {
                            m10Var.u();
                            return;
                        }
                    case 1:
                        if (activityResult.getResultCode() == -1) {
                            Intent data = activityResult.getData();
                            Uri data2 = data != null ? data.getData() : null;
                            if (data2 == null) {
                                m10Var.r();
                                return;
                            }
                            Intent data3 = activityResult.getData();
                            Integer valueOf = data3 != null ? Integer.valueOf(data3.getFlags()) : null;
                            if (valueOf != null) {
                                valueOf = Integer.valueOf(valueOf.intValue() & 3);
                            }
                            ContentResolver contentResolver = m10Var.getContentResolver();
                            valueOf.getClass();
                            contentResolver.takePersistableUriPermission(data2, valueOf.intValue());
                            String path = data2.getPath();
                            if (path != null) {
                                Pattern compile = Pattern.compile(".*\\b[ABCDEF[0-9]][ABCDEF[0-9]][ABCDEF[0-9]][ABCDEF[0-9]]-[ABCDEF[0-9]][ABCDEF[0-9]][ABCDEF[0-9]][ABCDEF[0-9]]:.*");
                                compile.getClass();
                                z = compile.matcher(path).matches();
                            }
                            if (z) {
                                m10Var.s();
                                return;
                            } else {
                                m10Var.t();
                                return;
                            }
                        }
                        return;
                    case 2:
                        m10Var.y();
                        return;
                    default:
                        activityResult.getClass();
                        if (activityResult.getResultCode() == 145) {
                            Intent data4 = activityResult.getData();
                            m10Var.u = (data4 == null || (extras3 = data4.getExtras()) == null) ? null : extras3.getString("path_selected");
                            Intent data5 = activityResult.getData();
                            m10Var.t = (data5 == null || (extras2 = data5.getExtras()) == null) ? null : Boolean.valueOf(extras2.getBoolean("sdcard_selected"));
                            Intent data6 = activityResult.getData();
                            Uri data7 = data6 != null ? data6.getData() : null;
                            if (m10Var.u != null) {
                                String str = m10Var.u;
                                str.getClass();
                                File file = new File(str);
                                TextView textView = m10Var.r;
                                if (textView == null) {
                                    jh2.b0("tvPath");
                                    throw null;
                                }
                                textView.setText(m10Var.u);
                                if (file.exists() && file.isDirectory() && file.canWrite()) {
                                    TextView textView2 = m10Var.s;
                                    if (textView2 != null) {
                                        textView2.setVisibility(8);
                                        return;
                                    } else {
                                        jh2.b0("tvErrorPath");
                                        throw null;
                                    }
                                }
                                TextView textView3 = m10Var.s;
                                if (textView3 != null) {
                                    textView3.setVisibility(0);
                                    return;
                                } else {
                                    jh2.b0("tvErrorPath");
                                    throw null;
                                }
                            }
                            if (data7 == null) {
                                TextView textView4 = m10Var.s;
                                if (textView4 != null) {
                                    textView4.setVisibility(0);
                                    return;
                                } else {
                                    jh2.b0("tvErrorPath");
                                    throw null;
                                }
                            }
                            String lastPathSegment = data7.getLastPathSegment();
                            Intent data8 = activityResult.getData();
                            m10Var.t = (data8 == null || (extras = data8.getExtras()) == null) ? null : Boolean.valueOf(extras.getBoolean("sdcard_selected"));
                            m10Var.u = lastPathSegment != null ? lastPathSegment.substring(um2.y0(":", lastPathSegment, 6) + 1) : null;
                            boolean k = jh2.k(m10Var.t, Boolean.TRUE);
                            TextView textView5 = m10Var.r;
                            if (k) {
                                if (textView5 == null) {
                                    jh2.b0("tvPath");
                                    throw null;
                                }
                                textView5.setText(m10Var.getString(R.string.sd_card) + DomExceptionUtils.SEPARATOR + m10Var.u);
                            } else {
                                if (textView5 == null) {
                                    jh2.b0("tvPath");
                                    throw null;
                                }
                                textView5.setText(m10Var.getString(R.string.internal_storage) + DomExceptionUtils.SEPARATOR + m10Var.u);
                            }
                            DocumentFile fromSingleUri = DocumentFile.fromSingleUri(m10Var, data7);
                            if (fromSingleUri != null && fromSingleUri.exists() && fromSingleUri.isDirectory() && fromSingleUri.canWrite()) {
                                TextView textView6 = m10Var.s;
                                if (textView6 != null) {
                                    textView6.setVisibility(8);
                                    return;
                                } else {
                                    jh2.b0("tvErrorPath");
                                    throw null;
                                }
                            }
                            TextView textView7 = m10Var.s;
                            if (textView7 != null) {
                                textView7.setVisibility(0);
                                return;
                            } else {
                                jh2.b0("tvErrorPath");
                                throw null;
                            }
                        }
                        return;
                }
            }
        });
        registerForActivityResult2.getClass();
        this.w = registerForActivityResult2;
        final int i3 = 2;
        ActivityResultLauncher registerForActivityResult3 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback(this) { // from class: g10
            public final /* synthetic */ m10 b;

            {
                this.b = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                Bundle extras;
                Bundle extras2;
                Bundle extras3;
                int i22 = i3;
                boolean z = false;
                m10 m10Var = this.b;
                ActivityResult activityResult = (ActivityResult) obj;
                switch (i22) {
                    case 0:
                        if (m10Var.o()) {
                            m10Var.w();
                            return;
                        } else {
                            m10Var.u();
                            return;
                        }
                    case 1:
                        if (activityResult.getResultCode() == -1) {
                            Intent data = activityResult.getData();
                            Uri data2 = data != null ? data.getData() : null;
                            if (data2 == null) {
                                m10Var.r();
                                return;
                            }
                            Intent data3 = activityResult.getData();
                            Integer valueOf = data3 != null ? Integer.valueOf(data3.getFlags()) : null;
                            if (valueOf != null) {
                                valueOf = Integer.valueOf(valueOf.intValue() & 3);
                            }
                            ContentResolver contentResolver = m10Var.getContentResolver();
                            valueOf.getClass();
                            contentResolver.takePersistableUriPermission(data2, valueOf.intValue());
                            String path = data2.getPath();
                            if (path != null) {
                                Pattern compile = Pattern.compile(".*\\b[ABCDEF[0-9]][ABCDEF[0-9]][ABCDEF[0-9]][ABCDEF[0-9]]-[ABCDEF[0-9]][ABCDEF[0-9]][ABCDEF[0-9]][ABCDEF[0-9]]:.*");
                                compile.getClass();
                                z = compile.matcher(path).matches();
                            }
                            if (z) {
                                m10Var.s();
                                return;
                            } else {
                                m10Var.t();
                                return;
                            }
                        }
                        return;
                    case 2:
                        m10Var.y();
                        return;
                    default:
                        activityResult.getClass();
                        if (activityResult.getResultCode() == 145) {
                            Intent data4 = activityResult.getData();
                            m10Var.u = (data4 == null || (extras3 = data4.getExtras()) == null) ? null : extras3.getString("path_selected");
                            Intent data5 = activityResult.getData();
                            m10Var.t = (data5 == null || (extras2 = data5.getExtras()) == null) ? null : Boolean.valueOf(extras2.getBoolean("sdcard_selected"));
                            Intent data6 = activityResult.getData();
                            Uri data7 = data6 != null ? data6.getData() : null;
                            if (m10Var.u != null) {
                                String str = m10Var.u;
                                str.getClass();
                                File file = new File(str);
                                TextView textView = m10Var.r;
                                if (textView == null) {
                                    jh2.b0("tvPath");
                                    throw null;
                                }
                                textView.setText(m10Var.u);
                                if (file.exists() && file.isDirectory() && file.canWrite()) {
                                    TextView textView2 = m10Var.s;
                                    if (textView2 != null) {
                                        textView2.setVisibility(8);
                                        return;
                                    } else {
                                        jh2.b0("tvErrorPath");
                                        throw null;
                                    }
                                }
                                TextView textView3 = m10Var.s;
                                if (textView3 != null) {
                                    textView3.setVisibility(0);
                                    return;
                                } else {
                                    jh2.b0("tvErrorPath");
                                    throw null;
                                }
                            }
                            if (data7 == null) {
                                TextView textView4 = m10Var.s;
                                if (textView4 != null) {
                                    textView4.setVisibility(0);
                                    return;
                                } else {
                                    jh2.b0("tvErrorPath");
                                    throw null;
                                }
                            }
                            String lastPathSegment = data7.getLastPathSegment();
                            Intent data8 = activityResult.getData();
                            m10Var.t = (data8 == null || (extras = data8.getExtras()) == null) ? null : Boolean.valueOf(extras.getBoolean("sdcard_selected"));
                            m10Var.u = lastPathSegment != null ? lastPathSegment.substring(um2.y0(":", lastPathSegment, 6) + 1) : null;
                            boolean k = jh2.k(m10Var.t, Boolean.TRUE);
                            TextView textView5 = m10Var.r;
                            if (k) {
                                if (textView5 == null) {
                                    jh2.b0("tvPath");
                                    throw null;
                                }
                                textView5.setText(m10Var.getString(R.string.sd_card) + DomExceptionUtils.SEPARATOR + m10Var.u);
                            } else {
                                if (textView5 == null) {
                                    jh2.b0("tvPath");
                                    throw null;
                                }
                                textView5.setText(m10Var.getString(R.string.internal_storage) + DomExceptionUtils.SEPARATOR + m10Var.u);
                            }
                            DocumentFile fromSingleUri = DocumentFile.fromSingleUri(m10Var, data7);
                            if (fromSingleUri != null && fromSingleUri.exists() && fromSingleUri.isDirectory() && fromSingleUri.canWrite()) {
                                TextView textView6 = m10Var.s;
                                if (textView6 != null) {
                                    textView6.setVisibility(8);
                                    return;
                                } else {
                                    jh2.b0("tvErrorPath");
                                    throw null;
                                }
                            }
                            TextView textView7 = m10Var.s;
                            if (textView7 != null) {
                                textView7.setVisibility(0);
                                return;
                            } else {
                                jh2.b0("tvErrorPath");
                                throw null;
                            }
                        }
                        return;
                }
            }
        });
        registerForActivityResult3.getClass();
        this.x = registerForActivityResult3;
        final int i4 = 3;
        ActivityResultLauncher registerForActivityResult4 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback(this) { // from class: g10
            public final /* synthetic */ m10 b;

            {
                this.b = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                Bundle extras;
                Bundle extras2;
                Bundle extras3;
                int i22 = i4;
                boolean z = false;
                m10 m10Var = this.b;
                ActivityResult activityResult = (ActivityResult) obj;
                switch (i22) {
                    case 0:
                        if (m10Var.o()) {
                            m10Var.w();
                            return;
                        } else {
                            m10Var.u();
                            return;
                        }
                    case 1:
                        if (activityResult.getResultCode() == -1) {
                            Intent data = activityResult.getData();
                            Uri data2 = data != null ? data.getData() : null;
                            if (data2 == null) {
                                m10Var.r();
                                return;
                            }
                            Intent data3 = activityResult.getData();
                            Integer valueOf = data3 != null ? Integer.valueOf(data3.getFlags()) : null;
                            if (valueOf != null) {
                                valueOf = Integer.valueOf(valueOf.intValue() & 3);
                            }
                            ContentResolver contentResolver = m10Var.getContentResolver();
                            valueOf.getClass();
                            contentResolver.takePersistableUriPermission(data2, valueOf.intValue());
                            String path = data2.getPath();
                            if (path != null) {
                                Pattern compile = Pattern.compile(".*\\b[ABCDEF[0-9]][ABCDEF[0-9]][ABCDEF[0-9]][ABCDEF[0-9]]-[ABCDEF[0-9]][ABCDEF[0-9]][ABCDEF[0-9]][ABCDEF[0-9]]:.*");
                                compile.getClass();
                                z = compile.matcher(path).matches();
                            }
                            if (z) {
                                m10Var.s();
                                return;
                            } else {
                                m10Var.t();
                                return;
                            }
                        }
                        return;
                    case 2:
                        m10Var.y();
                        return;
                    default:
                        activityResult.getClass();
                        if (activityResult.getResultCode() == 145) {
                            Intent data4 = activityResult.getData();
                            m10Var.u = (data4 == null || (extras3 = data4.getExtras()) == null) ? null : extras3.getString("path_selected");
                            Intent data5 = activityResult.getData();
                            m10Var.t = (data5 == null || (extras2 = data5.getExtras()) == null) ? null : Boolean.valueOf(extras2.getBoolean("sdcard_selected"));
                            Intent data6 = activityResult.getData();
                            Uri data7 = data6 != null ? data6.getData() : null;
                            if (m10Var.u != null) {
                                String str = m10Var.u;
                                str.getClass();
                                File file = new File(str);
                                TextView textView = m10Var.r;
                                if (textView == null) {
                                    jh2.b0("tvPath");
                                    throw null;
                                }
                                textView.setText(m10Var.u);
                                if (file.exists() && file.isDirectory() && file.canWrite()) {
                                    TextView textView2 = m10Var.s;
                                    if (textView2 != null) {
                                        textView2.setVisibility(8);
                                        return;
                                    } else {
                                        jh2.b0("tvErrorPath");
                                        throw null;
                                    }
                                }
                                TextView textView3 = m10Var.s;
                                if (textView3 != null) {
                                    textView3.setVisibility(0);
                                    return;
                                } else {
                                    jh2.b0("tvErrorPath");
                                    throw null;
                                }
                            }
                            if (data7 == null) {
                                TextView textView4 = m10Var.s;
                                if (textView4 != null) {
                                    textView4.setVisibility(0);
                                    return;
                                } else {
                                    jh2.b0("tvErrorPath");
                                    throw null;
                                }
                            }
                            String lastPathSegment = data7.getLastPathSegment();
                            Intent data8 = activityResult.getData();
                            m10Var.t = (data8 == null || (extras = data8.getExtras()) == null) ? null : Boolean.valueOf(extras.getBoolean("sdcard_selected"));
                            m10Var.u = lastPathSegment != null ? lastPathSegment.substring(um2.y0(":", lastPathSegment, 6) + 1) : null;
                            boolean k = jh2.k(m10Var.t, Boolean.TRUE);
                            TextView textView5 = m10Var.r;
                            if (k) {
                                if (textView5 == null) {
                                    jh2.b0("tvPath");
                                    throw null;
                                }
                                textView5.setText(m10Var.getString(R.string.sd_card) + DomExceptionUtils.SEPARATOR + m10Var.u);
                            } else {
                                if (textView5 == null) {
                                    jh2.b0("tvPath");
                                    throw null;
                                }
                                textView5.setText(m10Var.getString(R.string.internal_storage) + DomExceptionUtils.SEPARATOR + m10Var.u);
                            }
                            DocumentFile fromSingleUri = DocumentFile.fromSingleUri(m10Var, data7);
                            if (fromSingleUri != null && fromSingleUri.exists() && fromSingleUri.isDirectory() && fromSingleUri.canWrite()) {
                                TextView textView6 = m10Var.s;
                                if (textView6 != null) {
                                    textView6.setVisibility(8);
                                    return;
                                } else {
                                    jh2.b0("tvErrorPath");
                                    throw null;
                                }
                            }
                            TextView textView7 = m10Var.s;
                            if (textView7 != null) {
                                textView7.setVisibility(0);
                                return;
                            } else {
                                jh2.b0("tvErrorPath");
                                throw null;
                            }
                        }
                        return;
                }
            }
        });
        registerForActivityResult4.getClass();
        this.y = registerForActivityResult4;
    }

    public final void A() {
        try {
            int i = Build.VERSION.SDK_INT;
            ActivityResultLauncher activityResultLauncher = this.x;
            if (i < 26) {
                activityResultLauncher.launch(new Intent("android.settings.SECURITY_SETTINGS"));
                return;
            }
            activityResultLauncher.launch(new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", Uri.parse("package:" + getPackageName())));
        } catch (ActivityNotFoundException e) {
            e.printStackTrace();
        }
    }

    public final void B() {
        if (Build.VERSION.SDK_INT < 30) {
            if (n()) {
                return;
            }
            ActivityCompat.requestPermissions(this, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 645);
        } else {
            if (Environment.isExternalStorageManager()) {
                if (n()) {
                    return;
                }
                ActivityCompat.requestPermissions(this, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 645);
                return;
            }
            try {
                this.v.launch(new Intent("android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION", Uri.parse("package:" + getPackageName())));
            } catch (ActivityNotFoundException e) {
                e.printStackTrace();
                ActivityCompat.requestPermissions(this, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 645);
            }
        }
    }

    public final void C(String str) {
        str.getClass();
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        bc0 bc0Var = oe0.a;
        od4.s(lifecycleScope, wh1.a, null, new f4(this, str, null, 11, false), 2);
    }

    public final void D(String str, String str2, long j, String str3, boolean z) {
        String concat;
        String str4;
        long j2;
        RadioButton radioButton = this.m;
        if (radioButton == null) {
            jh2.b0("rbAppName");
            throw null;
        }
        if (radioButton.isChecked()) {
            if (str == null) {
                str = getString(R.string.app_name);
                str.getClass();
            }
        } else if (str2 != null) {
            str = str2;
        } else {
            str = getPackageName();
            str.getClass();
        }
        CheckBox checkBox = this.p;
        if (checkBox == null) {
            jh2.b0("cbVersioncode");
            throw null;
        }
        if (checkBox.isChecked()) {
            if (j > -1) {
                str = str + "_" + j;
            } else {
                try {
                    PackageManager packageManager = getPackageManager();
                    packageManager.getClass();
                    String packageName = getPackageName();
                    packageName.getClass();
                    j2 = ow0.e(zu0.i(packageManager, packageName, 0));
                } catch (PackageManager.NameNotFoundException e) {
                    e.printStackTrace();
                    j2 = 0;
                }
                str = str + "_" + j2;
            }
        }
        CheckBox checkBox2 = this.q;
        if (checkBox2 == null) {
            jh2.b0("cbVersionname");
            throw null;
        }
        if (checkBox2.isChecked()) {
            if (str3 != null) {
                str = k93.m(str, "_", str3);
            } else {
                try {
                    PackageManager packageManager2 = getPackageManager();
                    packageManager2.getClass();
                    String packageName2 = getPackageName();
                    packageName2.getClass();
                    str4 = zu0.i(packageManager2, packageName2, 0).versionName;
                } catch (PackageManager.NameNotFoundException e2) {
                    e2.printStackTrace();
                    str4 = null;
                }
                str = k93.m(str, "_", str4);
            }
        }
        if (z) {
            RadioButton radioButton2 = this.o;
            if (radioButton2 == null) {
                jh2.b0("rbXapkExtension");
                throw null;
            }
            concat = radioButton2.isChecked() ? str.concat(".xapk") : str.concat(".apks");
        } else {
            concat = str.concat(".apk");
        }
        TextView textView = this.b;
        if (textView != null) {
            textView.setText(concat);
        } else {
            jh2.b0("tvResult");
            throw null;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        if (context != null) {
            Activity activity = k13.p;
            context = ux2.h(context);
        }
        super.attachBaseContext(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(final java.lang.String r22, final java.lang.String r23, final long r24, final java.lang.String r26, final boolean r27) {
        /*
            Method dump skipped, instructions count: 609
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m10.k(java.lang.String, java.lang.String, long, java.lang.String, boolean):void");
    }

    public final void l(String str) {
        AlertDialog alertDialog = this.a;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        View inflate = getLayoutInflater().inflate(R.layout.core_dialog_accept, (ViewGroup) null, false);
        TextView textView = (TextView) inflate.findViewById(R.id.tv_dialog_accept_msg);
        if (str == null) {
            textView.setText(getString(R.string.error_unknown));
        } else {
            textView.setText(str);
        }
        ((TextView) inflate.findViewById(R.id.tv_accept_option)).setOnClickListener(new k10(this, 2));
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(inflate);
        builder.setCancelable(false);
        this.a = builder.create();
        if (isFinishing()) {
            return;
        }
        AlertDialog alertDialog2 = this.a;
        alertDialog2.getClass();
        Window window = alertDialog2.getWindow();
        if (window != null) {
            sg3.B(window, 0);
        }
        AlertDialog alertDialog3 = this.a;
        alertDialog3.getClass();
        alertDialog3.show();
    }

    public final void m() {
        try {
            if (a61.a(this)) {
                return;
            }
            AlertDialog alertDialog = this.a;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
            View inflate = getLayoutInflater().inflate(R.layout.core_dialog_title_accept_cancel, (ViewGroup) null, false);
            ((TextView) inflate.findViewById(R.id.tv_dialog_title)).setText(getString(R.string.title_unknown_source_dialog, getString(R.string.app_name)));
            ((TextView) inflate.findViewById(R.id.tv_dialog_msg)).setText(getString(R.string.msg_install_from_unknown_source, getString(R.string.app_name)));
            ((TextView) inflate.findViewById(R.id.tv_accept_option)).setOnClickListener(new k10(this, 0));
            ((TextView) inflate.findViewById(R.id.tv_cancel_option)).setOnClickListener(new k10(this, 1));
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setView(inflate);
            AlertDialog create = builder.create();
            this.a = create;
            create.getClass();
            Window window = create.getWindow();
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
            if (isFinishing()) {
                return;
            }
            AlertDialog alertDialog2 = this.a;
            alertDialog2.getClass();
            alertDialog2.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final boolean n() {
        return Build.VERSION.SDK_INT >= 33 || ContextCompat.checkSelfPermission(this, "android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    public final boolean o() {
        return Build.VERSION.SDK_INT >= 30 ? Environment.isExternalStorageManager() : n();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 645) {
            if (iArr.length != 0 && iArr[0] == 0) {
                x();
                return;
            } else {
                v();
                return;
            }
        }
        if (i != 646) {
            return;
        }
        if (iArr.length != 0 && iArr[0] == 0) {
            q();
        } else {
            p();
        }
    }

    public void p() {
    }

    public void q() {
    }

    public abstract void r();

    public abstract void s();

    public abstract void t();

    public abstract void u();

    public void v() {
    }

    public abstract void w();

    public void x() {
    }

    public void y() {
    }

    public final void z() {
        ActivityCompat.requestPermissions(this, new String[]{"android.permission.POST_NOTIFICATIONS"}, 646);
        try {
            SharedPreferences.Editor edit = getSharedPreferences("CoreSettings", 0).edit();
            edit.putBoolean("notification_permission_request", true);
            edit.apply();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
