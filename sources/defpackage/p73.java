package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.View;
import androidx.core.view.DragStartHelper;
import com.uptodown.activities.VirusTotalReport;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p73 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p73(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                VirusTotalReport virusTotalReport = (VirusTotalReport) obj;
                int i2 = VirusTotalReport.U;
                String obj2 = virusTotalReport.C0().w.getText().toString();
                if (obj2 != null && obj2.length() != 0) {
                    Object systemService = virusTotalReport.getSystemService("clipboard");
                    ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
                    if (clipboardManager != null) {
                        clipboardManager.setPrimaryClip(ClipData.newPlainText(null, obj2));
                    }
                }
                return true;
            case 1:
                VirusTotalReport virusTotalReport2 = (VirusTotalReport) obj;
                int i3 = VirusTotalReport.U;
                String obj3 = virusTotalReport2.C0().y.getText().toString();
                if (obj3 != null && obj3.length() != 0) {
                    Object systemService2 = virusTotalReport2.getSystemService("clipboard");
                    ClipboardManager clipboardManager2 = systemService2 instanceof ClipboardManager ? (ClipboardManager) systemService2 : null;
                    if (clipboardManager2 != null) {
                        clipboardManager2.setPrimaryClip(ClipData.newPlainText(null, obj3));
                    }
                }
                return true;
            default:
                return ((DragStartHelper) obj).onLongClick(view);
        }
    }
}
