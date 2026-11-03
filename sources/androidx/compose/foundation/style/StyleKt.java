package androidx.compose.foundation.style;

import androidx.compose.foundation.style.Style;
import defpackage.ew0;
import defpackage.hu2;
import defpackage.ps0;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class StyleKt {
    public static final Style Style(Style style, Style style2) {
        Style.Companion companion = Style.Companion;
        if (style == companion) {
            return style2;
        }
        if (style2 == companion) {
            return style;
        }
        boolean z = style instanceof CombinedStyle;
        if (z && (style2 instanceof CombinedStyle)) {
            ew0 ew0Var = new ew0(2);
            ew0Var.d(((CombinedStyle) style).getStyles());
            ew0Var.d(((CombinedStyle) style2).getStyles());
            ArrayList arrayList = ew0Var.a;
            return Style((Style[]) arrayList.toArray(new Style[arrayList.size()]));
        }
        if (z) {
            ew0 ew0Var2 = new ew0(2);
            ew0Var2.d(((CombinedStyle) style).getStyles());
            ew0Var2.a(style2);
            ArrayList arrayList2 = ew0Var2.a;
            return Style((Style[]) arrayList2.toArray(new Style[arrayList2.size()]));
        }
        if (!(style2 instanceof CombinedStyle)) {
            return new CombinedStyle(style, style2);
        }
        ew0 ew0Var3 = new ew0(2);
        ew0Var3.a(style);
        ew0Var3.d(((CombinedStyle) style2).getStyles());
        ArrayList arrayList3 = ew0Var3.a;
        return Style((Style[]) arrayList3.toArray(new Style[arrayList3.size()]));
    }

    public static final Style Style(Style style, Style style2, Style style3) {
        Style.Companion companion = Style.Companion;
        if (style == companion) {
            return Style(style2, style3);
        }
        if (style2 == companion) {
            return Style(style, style3);
        }
        if (style3 == companion) {
            return Style(style, style2);
        }
        boolean z = style instanceof CombinedStyle;
        if (z && (style2 instanceof CombinedStyle) && (style3 instanceof CombinedStyle)) {
            ew0 ew0Var = new ew0(3);
            ew0Var.d(((CombinedStyle) style).getStyles());
            ew0Var.d(((CombinedStyle) style2).getStyles());
            ew0Var.d(((CombinedStyle) style3).getStyles());
            ArrayList arrayList = ew0Var.a;
            return Style((Style[]) arrayList.toArray(new Style[arrayList.size()]));
        }
        if (z && (style2 instanceof CombinedStyle)) {
            ew0 ew0Var2 = new ew0(3);
            ew0Var2.d(((CombinedStyle) style).getStyles());
            ew0Var2.d(((CombinedStyle) style2).getStyles());
            ew0Var2.a(style3);
            ArrayList arrayList2 = ew0Var2.a;
            return Style((Style[]) arrayList2.toArray(new Style[arrayList2.size()]));
        }
        if (z && (style3 instanceof CombinedStyle)) {
            ew0 ew0Var3 = new ew0(3);
            ew0Var3.d(((CombinedStyle) style).getStyles());
            ew0Var3.a(style2);
            ew0Var3.d(((CombinedStyle) style3).getStyles());
            ArrayList arrayList3 = ew0Var3.a;
            return Style((Style[]) arrayList3.toArray(new Style[arrayList3.size()]));
        }
        boolean z2 = style2 instanceof CombinedStyle;
        if (z2 && (style3 instanceof CombinedStyle)) {
            ew0 ew0Var4 = new ew0(3);
            ew0Var4.a(style);
            ew0Var4.d(((CombinedStyle) style2).getStyles());
            ew0Var4.d(((CombinedStyle) style3).getStyles());
            ArrayList arrayList4 = ew0Var4.a;
            return Style((Style[]) arrayList4.toArray(new Style[arrayList4.size()]));
        }
        if (z) {
            ew0 ew0Var5 = new ew0(3);
            ew0Var5.d(((CombinedStyle) style).getStyles());
            ew0Var5.a(style2);
            ew0Var5.a(style3);
            ArrayList arrayList5 = ew0Var5.a;
            return Style((Style[]) arrayList5.toArray(new Style[arrayList5.size()]));
        }
        if (z2) {
            ew0 ew0Var6 = new ew0(3);
            ew0Var6.a(style);
            ew0Var6.d(((CombinedStyle) style2).getStyles());
            ew0Var6.a(style3);
            ArrayList arrayList6 = ew0Var6.a;
            return Style((Style[]) arrayList6.toArray(new Style[arrayList6.size()]));
        }
        if (!(style3 instanceof CombinedStyle)) {
            return Style(style, style2, style3);
        }
        ew0 ew0Var7 = new ew0(3);
        ew0Var7.a(style);
        ew0Var7.a(style2);
        ew0Var7.d(((CombinedStyle) style3).getStyles());
        ArrayList arrayList7 = ew0Var7.a;
        return Style((Style[]) arrayList7.toArray(new Style[arrayList7.size()]));
    }

    public static final Style Style(Style... styleArr) {
        int i = 0;
        for (Style style : styleArr) {
            if (style == Style.Companion) {
                int i2 = 0;
                for (Style style2 : styleArr) {
                    if (style2 != Style.Companion) {
                        i2++;
                    }
                }
                if (i2 == 0) {
                    return Style.Companion;
                }
                if (i2 == 1) {
                    int length = styleArr.length;
                    while (i < length) {
                        Style style3 = styleArr[i];
                        if (style3 != Style.Companion) {
                            return style3;
                        }
                        i++;
                    }
                    hu2.n("Array contains no element matching the predicate.");
                    return null;
                }
                Style[] styleArr2 = new Style[i2];
                int length2 = styleArr.length;
                int i3 = 0;
                while (i < length2) {
                    Style style4 = styleArr[i];
                    if (style4 != Style.Companion) {
                        styleArr2[i3] = style4;
                        i3++;
                    }
                    i++;
                }
                return new CombinedStyle((Style[]) Arrays.copyOf(styleArr2, i2));
            }
        }
        return new CombinedStyle((Style[]) Arrays.copyOf(styleArr, styleArr.length));
    }

    private static final <T> boolean fastAny(T[] tArr, ps0 ps0Var) {
        for (T t : tArr) {
            if (((Boolean) ps0Var.invoke(t)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    private static final <T> int fastCount(T[] tArr, ps0 ps0Var) {
        int i = 0;
        for (T t : tArr) {
            if (((Boolean) ps0Var.invoke(t)).booleanValue()) {
                i++;
            }
        }
        return i;
    }

    private static final <T> T fastFirst(T[] tArr, ps0 ps0Var) {
        for (T t : tArr) {
            if (((Boolean) ps0Var.invoke(t)).booleanValue()) {
                return t;
            }
        }
        hu2.n("Array contains no element matching the predicate.");
        return null;
    }

    private static final <T> void fastForEach(T[] tArr, ps0 ps0Var) {
        for (T t : tArr) {
            ps0Var.invoke(t);
        }
    }

    public static final Style then(Style style, Style style2) {
        return Style(style, style2);
    }
}
