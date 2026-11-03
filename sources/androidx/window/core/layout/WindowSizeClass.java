package androidx.window.core.layout;

import defpackage.hd0;
import defpackage.kw;
import defpackage.lw;
import defpackage.nb0;
import defpackage.pw;
import defpackage.sb0;
import defpackage.sg3;
import defpackage.z72;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class WindowSizeClass {
    public static final Set<WindowSizeClass> BREAKPOINTS_V1;
    public static final Set<WindowSizeClass> BREAKPOINTS_V2;
    public static final Companion Companion;
    private static final List<Integer> HEIGHT_DP_BREAKPOINTS_V1;
    private static final List<Integer> HEIGHT_DP_BREAKPOINTS_V2;
    public static final int HEIGHT_DP_EXPANDED_LOWER_BOUND = 900;
    public static final int HEIGHT_DP_MEDIUM_LOWER_BOUND = 480;
    private static final List<Integer> WIDTH_DP_BREAKPOINTS_V1;
    private static final List<Integer> WIDTH_DP_BREAKPOINTS_V2;
    public static final int WIDTH_DP_EXPANDED_LOWER_BOUND = 840;
    public static final int WIDTH_DP_EXTRA_LARGE_LOWER_BOUND = 1600;
    public static final int WIDTH_DP_LARGE_LOWER_BOUND = 1200;
    public static final int WIDTH_DP_MEDIUM_LOWER_BOUND = 600;
    private final int minHeightDp;
    private final int minWidthDp;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Set<WindowSizeClass> createBreakpointSet(List<Integer> list, List<Integer> list2) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                List<Integer> list3 = list2;
                ArrayList arrayList2 = new ArrayList(lw.Z(list3, 10));
                Iterator<T> it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new WindowSizeClass(intValue, ((Number) it2.next()).intValue()));
                }
                pw.c0(arrayList2, arrayList);
            }
            return kw.P0(arrayList);
        }

        @hd0
        public final WindowSizeClass compute(float f, float f2) {
            int i = 0;
            int i2 = f >= 840.0f ? WindowSizeClass.WIDTH_DP_EXPANDED_LOWER_BOUND : f >= 600.0f ? 600 : 0;
            if (f2 >= 900.0f) {
                i = 900;
            } else if (f2 >= 480.0f) {
                i = WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND;
            }
            return new WindowSizeClass(i2, i);
        }
    }

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        List<Integer> D = nb0.D(0, 600, Integer.valueOf(WIDTH_DP_EXPANDED_LOWER_BOUND));
        WIDTH_DP_BREAKPOINTS_V1 = D;
        ArrayList B0 = kw.B0(nb0.D(Integer.valueOf(WIDTH_DP_LARGE_LOWER_BOUND), Integer.valueOf(WIDTH_DP_EXTRA_LARGE_LOWER_BOUND)), D);
        WIDTH_DP_BREAKPOINTS_V2 = B0;
        List<Integer> D2 = nb0.D(0, Integer.valueOf(HEIGHT_DP_MEDIUM_LOWER_BOUND), 900);
        HEIGHT_DP_BREAKPOINTS_V1 = D2;
        HEIGHT_DP_BREAKPOINTS_V2 = D2;
        BREAKPOINTS_V1 = companion.createBreakpointSet(D, D2);
        BREAKPOINTS_V2 = companion.createBreakpointSet(B0, D2);
    }

    public WindowSizeClass(float f, float f2) {
        this((int) f, (int) f2);
    }

    public WindowSizeClass(int i, int i2) {
        this.minWidthDp = i;
        this.minHeightDp = i2;
        if (i < 0) {
            z72.l(i, "Expected minWidthDp to be at least 0, minWidthDp: ");
            throw null;
        }
        if (i2 >= 0) {
            return;
        }
        z72.l(i2, "Expected minHeightDp to be at least 0, minHeightDp: ");
        throw null;
    }

    @hd0
    public static final WindowSizeClass compute(float f, float f2) {
        return Companion.compute(f, f2);
    }

    @hd0
    public static /* synthetic */ void getWindowHeightSizeClass$annotations() {
    }

    @hd0
    public static /* synthetic */ void getWindowWidthSizeClass$annotations() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WindowSizeClass.class != obj.getClass()) {
            return false;
        }
        WindowSizeClass windowSizeClass = (WindowSizeClass) obj;
        return this.minWidthDp == windowSizeClass.minWidthDp && this.minHeightDp == windowSizeClass.minHeightDp;
    }

    public final int getMinHeightDp() {
        return this.minHeightDp;
    }

    public final int getMinWidthDp() {
        return this.minWidthDp;
    }

    public final WindowHeightSizeClass getWindowHeightSizeClass() {
        return WindowHeightSizeClass.Companion.compute$window_core(this.minHeightDp);
    }

    public final WindowWidthSizeClass getWindowWidthSizeClass() {
        return WindowWidthSizeClass.Companion.compute$window_core(this.minWidthDp);
    }

    public int hashCode() {
        return (this.minWidthDp * 31) + this.minHeightDp;
    }

    public final boolean isAtLeastBreakpoint(int i, int i2) {
        return isWidthAtLeastBreakpoint(i) && isHeightAtLeastBreakpoint(i2);
    }

    public final boolean isHeightAtLeastBreakpoint(int i) {
        return this.minHeightDp >= i;
    }

    public final boolean isWidthAtLeastBreakpoint(int i) {
        return this.minWidthDp >= i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WindowSizeClass(minWidthDp=");
        sb.append(this.minWidthDp);
        sb.append(", minHeightDp=");
        return sg3.r(sb, this.minHeightDp, ')');
    }
}
