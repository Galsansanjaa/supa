package androidx.compose.foundation.text.contextmenu;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import androidx.compose.foundation.ComposeFoundationFlags;
import androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope;
import androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope_androidKt;
import androidx.compose.foundation.text.contextmenu.data.ProcessTextKey;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession;
import androidx.compose.ui.text.TextRange;
import defpackage.rc1;
import defpackage.vy2;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class ProcessText_androidKt {
    /* renamed from: addProcessedTextContextMenuItems-UAq72N0, reason: not valid java name */
    public static final void m1689addProcessedTextContextMenuItemsUAq72N0(TextContextMenuBuilderScope textContextMenuBuilderScope, Context context, boolean z, CharSequence charSequence, long j) {
        if (!ComposeFoundationFlags.isSmartSelectionEnabled || TextRange.m7480getCollapsedimpl(j) || charSequence.length() == 0) {
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        Context context2 = context;
        List<ResolveInfo> queryProcessTextActivities = ProcessTextApi23Impl.INSTANCE.queryProcessTextActivities(context2);
        if (queryProcessTextActivities.isEmpty()) {
            return;
        }
        textContextMenuBuilderScope.separator();
        int size = queryProcessTextActivities.size();
        int i = 0;
        while (i < size) {
            ResolveInfo resolveInfo = queryProcessTextActivities.get(i);
            TextContextMenuBuilderScope_androidKt.item$default(textContextMenuBuilderScope, new ProcessTextKey(i), resolveInfo.loadLabel(packageManager).toString(), 0, new rc1(context2, resolveInfo, z, charSequence, j), 4, null);
            i++;
            context2 = context;
        }
        textContextMenuBuilderScope.separator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vy2 addProcessedTextContextMenuItems_UAq72N0$lambda$0$0(Context context, ResolveInfo resolveInfo, boolean z, CharSequence charSequence, long j, TextContextMenuSession textContextMenuSession) {
        ProcessTextApi23Impl.INSTANCE.getOnClickProcessTextItem().invoke(context, resolveInfo, Boolean.valueOf(z), charSequence, TextRange.m7474boximpl(j));
        textContextMenuSession.close();
        return vy2.a;
    }
}
