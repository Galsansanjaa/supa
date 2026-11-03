package androidx.compose.foundation.text.contextmenu;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import androidx.compose.ui.text.TextRange;
import defpackage.dz;
import defpackage.ps0;
import defpackage.qu1;
import defpackage.vy2;
import defpackage.ws0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class ProcessTextApi23Impl {
    public static final ProcessTextApi23Impl INSTANCE = new ProcessTextApi23Impl();
    private static ps0 processTextActivitiesQuery = new qu1(7);
    private static ws0 onClickProcessTextItem = new dz(3);
    public static final int $stable = 8;

    private ProcessTextApi23Impl() {
    }

    public static /* synthetic */ List a(Context context) {
        return processTextActivitiesQuery$lambda$0(context);
    }

    private final Intent createProcessTextIntent() {
        return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
    }

    public static /* synthetic */ void getOnClickProcessTextItem$annotations() {
    }

    public static /* synthetic */ void getProcessTextActivitiesQuery$annotations() {
    }

    private final boolean hasPermission(ActivityInfo activityInfo, Context context) {
        if (!activityInfo.exported) {
            return false;
        }
        String str = activityInfo.permission;
        return str == null || context.checkSelfPermission(str) == 0;
    }

    private final boolean hasPermission(ResolveInfo resolveInfo, Context context) {
        return context.getPackageName().equals(resolveInfo.activityInfo.packageName) || hasPermission(resolveInfo.activityInfo, context);
    }

    public static final vy2 onClickProcessTextItem$lambda$0(Context context, ResolveInfo resolveInfo, boolean z, CharSequence charSequence, TextRange textRange) {
        String obj = charSequence.subSequence(TextRange.m7484getMinimpl(textRange.m7490unboximpl()), TextRange.m7483getMaximpl(textRange.m7490unboximpl())).toString();
        Intent createProcessTextIntentForResolveInfo = INSTANCE.createProcessTextIntentForResolveInfo(resolveInfo, z);
        createProcessTextIntentForResolveInfo.putExtra("android.intent.extra.PROCESS_TEXT", obj);
        context.startActivity(createProcessTextIntentForResolveInfo);
        return vy2.a;
    }

    public static final List processTextActivitiesQuery$lambda$0(Context context) {
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(INSTANCE.createProcessTextIntent(), 0);
        ArrayList arrayList = new ArrayList(queryIntentActivities.size());
        int size = queryIntentActivities.size();
        for (int i = 0; i < size; i++) {
            ResolveInfo resolveInfo = queryIntentActivities.get(i);
            if (INSTANCE.hasPermission(resolveInfo, context)) {
                arrayList.add(resolveInfo);
            }
        }
        return arrayList;
    }

    public final Intent createProcessTextIntentForResolveInfo(ResolveInfo resolveInfo, boolean z) {
        Intent putExtra = createProcessTextIntent().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", z);
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        return putExtra.setClassName(activityInfo.packageName, activityInfo.name);
    }

    public final ws0 getOnClickProcessTextItem() {
        return onClickProcessTextItem;
    }

    public final ps0 getProcessTextActivitiesQuery() {
        return processTextActivitiesQuery;
    }

    public final List<ResolveInfo> queryProcessTextActivities(Context context) {
        return (List) processTextActivitiesQuery.invoke(context);
    }

    public final void setOnClickProcessTextItem(ws0 ws0Var) {
        onClickProcessTextItem = ws0Var;
    }

    public final void setProcessTextActivitiesQuery(ps0 ps0Var) {
        processTextActivitiesQuery = ps0Var;
    }
}
