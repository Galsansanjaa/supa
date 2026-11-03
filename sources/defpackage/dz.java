package defpackage;

import android.content.Context;
import android.content.pm.ResolveInfo;
import androidx.compose.foundation.text.contextmenu.ProcessTextApi23Impl;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession;
import androidx.compose.foundation.text.contextmenu.internal.ComposableSingletons$DefaultTextContextMenuDropdownProvider_androidKt;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.text.TextRange;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class dz implements ws0 {
    public final /* synthetic */ int a;

    public /* synthetic */ dz(int i) {
        this.a = i;
    }

    @Override // defpackage.ws0
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        vy2 onClickProcessTextItem$lambda$0;
        switch (this.a) {
            case 0:
                return ComposableSingletons$DefaultTextContextMenuDropdownProvider_androidKt.b((TextContextMenuSession) obj, (TextContextMenuDataProvider) obj2, (os0) obj3, (Composer) obj4, ((Integer) obj5).intValue());
            case 1:
                return ComposableSingletons$DefaultTextContextMenuDropdownProvider_androidKt.c((TextContextMenuSession) obj, (TextContextMenuDataProvider) obj2, (os0) obj3, (Composer) obj4, ((Integer) obj5).intValue());
            case 2:
                return ComposableSingletons$DefaultTextContextMenuDropdownProvider_androidKt.a((TextContextMenuSession) obj, (TextContextMenuDataProvider) obj2, (os0) obj3, (Composer) obj4, ((Integer) obj5).intValue());
            default:
                onClickProcessTextItem$lambda$0 = ProcessTextApi23Impl.onClickProcessTextItem$lambda$0((Context) obj, (ResolveInfo) obj2, ((Boolean) obj3).booleanValue(), (CharSequence) obj4, (TextRange) obj5);
                return onClickProcessTextItem$lambda$0;
        }
    }
}
