package defpackage;

import androidx.compose.animation.core.AnimationKt;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class ph0 implements Comparable {
    public static final long b;
    public static final long m;
    public static final /* synthetic */ int n = 0;
    public final long a;

    static {
        int i = qh0.a;
        b = m60.h(4611686018427387903L);
        m = m60.h(-4611686018427387903L);
    }

    public static final long a(long j, long j2) {
        long j3 = j2 / AnimationKt.MillisToNanos;
        long j4 = j + j3;
        if (-4611686018426L > j4 || j4 >= 4611686018427L) {
            return m60.h(ea0.p(j4, -4611686018427387903L, 4611686018427387903L));
        }
        return m60.j((j4 * AnimationKt.MillisToNanos) + (j2 - (j3 * AnimationKt.MillisToNanos)));
    }

    public static final void b(StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String B0 = um2.B0(i3, String.valueOf(i2));
            int i4 = -1;
            int length = B0.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (B0.charAt(length) != '0') {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (z || i6 >= 3) {
                sb.append((CharSequence) B0, 0, ((i4 + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) B0, 0, i6);
            }
        }
        sb.append(str);
    }

    public static int c(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return jh2.t(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return j < 0 ? -i : i;
    }

    public static final int d(long j) {
        if (e(j)) {
            return 0;
        }
        return (int) ((((int) j) & 1) == 1 ? ((j >> 1) % 1000) * AnimationKt.MillisToNanos : (j >> 1) % 1000000000);
    }

    public static final boolean e(long j) {
        return j == b || j == m;
    }

    public static final long f(long j, long j2) {
        if (e(j)) {
            if (!e(j2) || (j2 ^ j) >= 0) {
                return j;
            }
            v5.m("Summing infinite durations of different signs yields an undefined result.");
            return 0L;
        }
        if (e(j2)) {
            return j2;
        }
        int i = ((int) j) & 1;
        if (i != (((int) j2) & 1)) {
            return i == 1 ? a(j >> 1, j2 >> 1) : a(j2 >> 1, j >> 1);
        }
        long j3 = (j >> 1) + (j2 >> 1);
        return i == 0 ? (-4611686018426999999L > j3 || j3 >= 4611686018427000000L) ? m60.h(j3 / AnimationKt.MillisToNanos) : m60.j(j3) : m60.i(j3);
    }

    public static final long g(long j, sh0 sh0Var) {
        if (j == b) {
            return Long.MAX_VALUE;
        }
        if (j == m) {
            return Long.MIN_VALUE;
        }
        return sh0Var.a.convert(j >> 1, ((((int) j) & 1) == 0 ? sh0.NANOSECONDS : sh0.MILLISECONDS).a);
    }

    public static final long h(long j) {
        long j2 = ((-(j >> 1)) << 1) + (((int) j) & 1);
        int i = qh0.a;
        return j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return c(this.a, ((ph0) obj).a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ph0) {
            return this.a == ((ph0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        long j = this.a;
        if (j == 0) {
            return "0s";
        }
        if (j == b) {
            return "Infinity";
        }
        if (j == m) {
            return "-Infinity";
        }
        int i = 0;
        boolean z = j < 0;
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append('-');
        }
        if (j < 0) {
            j = h(j);
        }
        long g = g(j, sh0.DAYS);
        int g2 = e(j) ? 0 : (int) (g(j, sh0.HOURS) % 24);
        int g3 = e(j) ? 0 : (int) (g(j, sh0.MINUTES) % 60);
        int g4 = e(j) ? 0 : (int) (g(j, sh0.SECONDS) % 60);
        int d = d(j);
        boolean z2 = g != 0;
        boolean z3 = g2 != 0;
        boolean z4 = g3 != 0;
        boolean z5 = (g4 == 0 && d == 0) ? false : true;
        if (z2) {
            sb.append(g);
            sb.append('d');
            i = 1;
        }
        if (z3 || (z2 && (z4 || z5))) {
            int i2 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(g2);
            sb.append('h');
            i = i2;
        }
        if (z4 || (z5 && (z3 || z2))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(g3);
            sb.append('m');
            i = i3;
        }
        if (z5) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (g4 != 0 || z2 || z3 || z4) {
                b(sb, g4, d, 9, "s", false);
            } else if (d >= 1000000) {
                b(sb, d / 1000000, d % 1000000, 6, "ms", false);
            } else if (d >= 1000) {
                b(sb, d / 1000, d % 1000, 3, "us", false);
            } else {
                sb.append(d);
                sb.append("ns");
            }
            i = i4;
        }
        if (z && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }
}
