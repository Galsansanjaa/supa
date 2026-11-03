package androidx.window.core.layout;

import java.util.Set;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class WindowSizeClassSelectors {
    public static final WindowSizeClass computeWindowSizeClass(Set<WindowSizeClass> set, float f, float f2) {
        set.getClass();
        return computeWindowSizeClass(set, (int) f, (int) f2);
    }

    public static final WindowSizeClass computeWindowSizeClass(Set<WindowSizeClass> set, int i, int i2) {
        set.getClass();
        Set<WindowSizeClass> set2 = set;
        int i3 = 0;
        for (WindowSizeClass windowSizeClass : set2) {
            if (windowSizeClass.getMinWidthDp() <= i && windowSizeClass.getMinWidthDp() > i3) {
                i3 = windowSizeClass.getMinWidthDp();
            }
        }
        WindowSizeClass windowSizeClass2 = new WindowSizeClass(0, 0);
        for (WindowSizeClass windowSizeClass3 : set2) {
            if (windowSizeClass3.getMinWidthDp() == i3 && windowSizeClass3.getMinHeightDp() <= i2 && windowSizeClass2.getMinHeightDp() <= windowSizeClass3.getMinHeightDp()) {
                windowSizeClass2 = windowSizeClass3;
            }
        }
        return windowSizeClass2;
    }

    public static final WindowSizeClass computeWindowSizeClassPreferHeight(Set<WindowSizeClass> set, int i, int i2) {
        set.getClass();
        Set<WindowSizeClass> set2 = set;
        int i3 = 0;
        for (WindowSizeClass windowSizeClass : set2) {
            if (windowSizeClass.getMinHeightDp() <= i2 && windowSizeClass.getMinHeightDp() > i3) {
                i3 = windowSizeClass.getMinHeightDp();
            }
        }
        WindowSizeClass windowSizeClass2 = new WindowSizeClass(0, 0);
        for (WindowSizeClass windowSizeClass3 : set2) {
            if (windowSizeClass3.getMinHeightDp() == i3 && windowSizeClass3.getMinWidthDp() <= i && windowSizeClass2.getMinWidthDp() <= windowSizeClass3.getMinWidthDp()) {
                windowSizeClass2 = windowSizeClass3;
            }
        }
        return windowSizeClass2;
    }
}
