package defpackage;

import androidx.compose.foundation.lazy.layout.AndroidPrefetchScheduler;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemKt;
import androidx.compose.foundation.lazy.layout.PriorityTask;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.text.android.LayoutIntrinsics_androidKt;
import androidx.constraintlayout.core.utils.GridCore;
import java.io.File;
import java.util.Comparator;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class m6 implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ m6(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int IntRangeComparator$lambda$0;
        int ZComparator$lambda$0;
        switch (this.a) {
            case 0:
                return AndroidPrefetchScheduler.a((PriorityTask) obj, (PriorityTask) obj2);
            case 1:
                r7 r7Var = (r7) obj;
                r7 r7Var2 = (r7) obj2;
                r7Var.getClass();
                r7Var2.getClass();
                String str = r7Var.b;
                if (str == null) {
                    return 1;
                }
                String str2 = r7Var2.b;
                if (str2 == null) {
                    return -1;
                }
                str2.getClass();
                return str.compareToIgnoreCase(str2);
            case 2:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
            case 3:
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            case 4:
                String name = ((File) obj).getName();
                int i = k70.f;
                return name.substring(0, i).compareTo(((File) obj2).getName().substring(0, i));
            case 5:
                r7 r7Var3 = (r7) obj;
                r7 r7Var4 = (r7) obj2;
                r7Var3.getClass();
                r7Var4.getClass();
                String str3 = r7Var3.b;
                if (str3 == null) {
                    return 1;
                }
                String str4 = r7Var4.b;
                if (str4 == null) {
                    return -1;
                }
                str4.getClass();
                return str3.compareToIgnoreCase(str4);
            case 6:
                return GridCore.a((String) obj, (String) obj2);
            case 7:
                IntRangeComparator$lambda$0 = LayoutIntrinsics_androidKt.IntRangeComparator$lambda$0((i61) obj, (i61) obj2);
                return IntRangeComparator$lambda$0;
            case 8:
                ZComparator$lambda$0 = LayoutNode.ZComparator$lambda$0((LayoutNode) obj, (LayoutNode) obj2);
                return ZComparator$lambda$0;
            case 9:
                return LazyLayoutMeasuredItemKt.a((LazyLayoutMeasuredItem) obj, (LazyLayoutMeasuredItem) obj2);
            case 10:
                return ((oh) ((h60) obj)).a.compareTo(((oh) ((h60) obj2)).a);
            case 11:
                d71 d71Var = (d71) obj;
                d71 d71Var2 = (d71) obj2;
                d71Var.getClass();
                d71Var2.getClass();
                File file = d71Var.a;
                if (file == null) {
                    return 1;
                }
                if (d71Var2.a == null) {
                    return -1;
                }
                String name2 = file.getName();
                name2.getClass();
                File file2 = d71Var2.a;
                file2.getClass();
                String name3 = file2.getName();
                name3.getClass();
                return name2.compareToIgnoreCase(name3);
            case 12:
                d71 d71Var3 = (d71) obj;
                d71 d71Var4 = (d71) obj2;
                d71Var3.getClass();
                d71Var4.getClass();
                if (d71Var3.a == null) {
                    return 1;
                }
                if (d71Var4.a == null) {
                    return -1;
                }
                return Boolean.compare(!d71Var3.b, !d71Var4.b);
            case 13:
                d71 d71Var5 = (d71) obj;
                d71 d71Var6 = (d71) obj2;
                d71Var5.getClass();
                d71Var6.getClass();
                File file3 = d71Var5.a;
                if (file3 == null) {
                    return 1;
                }
                if (d71Var6.a == null) {
                    return -1;
                }
                String name4 = file3.getName();
                name4.getClass();
                File file4 = d71Var6.a;
                file4.getClass();
                String name5 = file4.getName();
                name5.getClass();
                return name4.compareToIgnoreCase(name5);
            case 14:
                d71 d71Var7 = (d71) obj;
                d71 d71Var8 = (d71) obj2;
                d71Var7.getClass();
                d71Var8.getClass();
                File file5 = d71Var7.a;
                if (file5 == null) {
                    return 1;
                }
                if (d71Var8.a == null) {
                    return -1;
                }
                String name6 = file5.getName();
                name6.getClass();
                File file6 = d71Var8.a;
                file6.getClass();
                String name7 = file6.getName();
                name7.getClass();
                return name6.compareToIgnoreCase(name7);
            case 15:
                d71 d71Var9 = (d71) obj;
                d71 d71Var10 = (d71) obj2;
                d71Var9.getClass();
                d71Var10.getClass();
                File file7 = d71Var9.a;
                if (file7 == null) {
                    return 1;
                }
                if (d71Var10.a == null) {
                    return -1;
                }
                String name8 = file7.getName();
                name8.getClass();
                File file8 = d71Var10.a;
                file8.getClass();
                String name9 = file8.getName();
                name9.getClass();
                return name8.compareToIgnoreCase(name9);
            case 16:
                return ((Double) obj).compareTo((Double) obj2);
            default:
                r7 r7Var5 = (r7) obj;
                r7 r7Var6 = (r7) obj2;
                r7Var5.getClass();
                r7Var6.getClass();
                String str5 = r7Var5.b;
                if (str5 == null) {
                    return 1;
                }
                String str6 = r7Var6.b;
                if (str6 == null) {
                    return -1;
                }
                str6.getClass();
                return str5.compareToIgnoreCase(str6);
        }
    }
}
