package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public class q91 implements Closeable {
    public final StringReader a;
    public long r;
    public int s;
    public String t;
    public int[] u;
    public String[] w;
    public int[] x;
    public int y = 2;
    public final char[] b = new char[1024];
    public int m = 0;
    public int n = 0;
    public int o = 0;
    public int p = 0;
    public int q = 0;
    public int v = 1;

    static {
        bp.b = new bp(19);
    }

    public q91(StringReader stringReader) {
        int[] iArr = new int[32];
        this.u = iArr;
        iArr[0] = 6;
        this.w = new String[32];
        this.x = new int[32];
        this.a = stringReader;
    }

    public final long A() {
        String E;
        int i = this.q;
        if (i == 0) {
            i = g();
        }
        if (i == 15) {
            this.q = 0;
            int[] iArr = this.x;
            int i2 = this.v - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.r;
        }
        if (i == 16) {
            this.t = new String(this.b, this.m, this.s);
            this.m += this.s;
        } else {
            if (i != 8 && i != 9 && i != 10) {
                throw P("a long");
            }
            if (i == 10) {
                E = G();
                this.t = E;
            } else {
                E = E(i == 8 ? '\'' : '\"');
                this.t = E;
            }
            Q(E);
            try {
                long parseLong = Long.parseLong(this.t);
                this.q = 0;
                int[] iArr2 = this.x;
                int i3 = this.v - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.q = 11;
        double parseDouble = Double.parseDouble(this.t);
        long j = (long) parseDouble;
        if (j == parseDouble) {
            this.t = null;
            this.q = 0;
            int[] iArr3 = this.x;
            int i4 = this.v - 1;
            iArr3[i4] = iArr3[i4] + 1;
            return j;
        }
        throw new NumberFormatException("Expected a long but was " + this.t + w());
    }

    public final String B() {
        String E;
        int i = this.q;
        if (i == 0) {
            i = g();
        }
        if (i == 14) {
            E = G();
        } else if (i == 12) {
            E = E('\'');
        } else {
            if (i != 13) {
                throw P("a name");
            }
            E = E('\"');
        }
        this.q = 0;
        this.w[this.v - 1] = E;
        return E;
    }

    public final int C(boolean z) {
        char c;
        int i = this.m;
        int i2 = this.n;
        while (true) {
            if (i == i2) {
                this.m = i;
                if (!m(1)) {
                    if (z) {
                        throw new EOFException("End of input".concat(w()));
                    }
                    return -1;
                }
                i = this.m;
                i2 = this.n;
            }
            int i3 = i + 1;
            char[] cArr = this.b;
            c = cArr[i];
            if (c == '\n') {
                this.o++;
                this.p = i3;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.m = i3;
                    if (i3 == i2) {
                        this.m = i;
                        boolean m = m(2);
                        this.m++;
                        if (!m) {
                            break;
                        }
                    }
                    e();
                    int i4 = this.m;
                    char c2 = cArr[i4];
                    if (c2 == '*') {
                        this.m = i4 + 1;
                        while (true) {
                            if (this.m + 2 > this.n && !m(2)) {
                                O("Unterminated comment");
                                throw null;
                            }
                            int i5 = this.m;
                            if (cArr[i5] != '\n') {
                                int i6 = 0;
                                while (true) {
                                    int i7 = this.m;
                                    if (i6 >= 2) {
                                        i = i7 + 2;
                                        i2 = this.n;
                                        break;
                                    }
                                    if (cArr[i7 + i6] != "*/".charAt(i6)) {
                                        break;
                                    }
                                    i6++;
                                }
                            } else {
                                this.o++;
                                this.p = i5 + 1;
                            }
                            this.m++;
                        }
                    } else {
                        if (c2 != '/') {
                            break;
                        }
                        this.m = i4 + 1;
                        L();
                        i = this.m;
                        i2 = this.n;
                    }
                } else {
                    if (c != '#') {
                        this.m = i3;
                        return c;
                    }
                    this.m = i3;
                    e();
                    L();
                    i = this.m;
                    i2 = this.n;
                }
            }
            i = i3;
        }
        return c;
    }

    public final void D() {
        int i = this.q;
        if (i == 0) {
            i = g();
        }
        if (i != 7) {
            throw P("null");
        }
        this.q = 0;
        int[] iArr = this.x;
        int i2 = this.v - 1;
        iArr[i2] = iArr[i2] + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x003d, code lost:
    
        r11.m = r8;
        r8 = r8 - r3;
        r2 = r8 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0042, code lost:
    
        if (r1 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0044, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max(r8 * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006b, code lost:
    
        if (r1 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006d, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007b, code lost:
    
        r1.append(r7, r3, r2 - r3);
        r11.m = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String E(char r12) {
        /*
            r11 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r11.m
            int r3 = r11.n
        L6:
            r4 = r3
            r3 = r2
        L8:
            r5 = 16
            r6 = 1
            char[] r7 = r11.b
            if (r2 >= r4) goto L6b
            int r8 = r2 + 1
            char r2 = r7[r2]
            int r9 = r11.y
            r10 = 3
            if (r9 != r10) goto L23
            r9 = 32
            if (r2 < r9) goto L1d
            goto L23
        L1d:
            java.lang.String r12 = "Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode"
            r11.O(r12)
            throw r0
        L23:
            if (r2 != r12) goto L39
            r11.m = r8
            int r8 = r8 - r3
            int r8 = r8 - r6
            if (r1 != 0) goto L31
            java.lang.String r11 = new java.lang.String
            r11.<init>(r7, r3, r8)
            return r11
        L31:
            r1.append(r7, r3, r8)
            java.lang.String r11 = r1.toString()
            return r11
        L39:
            r9 = 92
            if (r2 != r9) goto L5e
            r11.m = r8
            int r8 = r8 - r3
            int r2 = r8 + (-1)
            if (r1 != 0) goto L4f
            int r8 = r8 * 2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r4 = java.lang.Math.max(r8, r5)
            r1.<init>(r4)
        L4f:
            r1.append(r7, r3, r2)
            char r2 = r11.J()
            r1.append(r2)
            int r2 = r11.m
            int r3 = r11.n
            goto L6
        L5e:
            r5 = 10
            if (r2 != r5) goto L69
            int r2 = r11.o
            int r2 = r2 + r6
            r11.o = r2
            r11.p = r8
        L69:
            r2 = r8
            goto L8
        L6b:
            if (r1 != 0) goto L7b
            int r1 = r2 - r3
            int r1 = r1 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r5)
            r4.<init>(r1)
            r1 = r4
        L7b:
            int r4 = r2 - r3
            r1.append(r7, r3, r4)
            r11.m = r2
            boolean r2 = r11.m(r6)
            if (r2 == 0) goto L8a
            goto L2
        L8a:
            java.lang.String r12 = "Unterminated string"
            r11.O(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q91.E(char):java.lang.String");
    }

    public final String F() {
        String str;
        int i = this.q;
        if (i == 0) {
            i = g();
        }
        if (i == 10) {
            str = G();
        } else if (i == 8) {
            str = E('\'');
        } else if (i == 9) {
            str = E('\"');
        } else if (i == 11) {
            str = this.t;
            this.t = null;
        } else if (i == 15) {
            str = Long.toString(this.r);
        } else {
            if (i != 16) {
                throw P("a string");
            }
            str = new String(this.b, this.m, this.s);
            this.m += this.s;
        }
        this.q = 0;
        int[] iArr = this.x;
        int i2 = this.v - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0048, code lost:
    
        e();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:55:0x0042. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String G() {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r1
        L3:
            int r3 = r6.m
            int r3 = r3 + r2
            int r4 = r6.n
            char[] r5 = r6.b
            if (r3 >= r4) goto L4c
            char r3 = r5[r3]
            r4 = 9
            if (r3 == r4) goto L58
            r4 = 10
            if (r3 == r4) goto L58
            r4 = 12
            if (r3 == r4) goto L58
            r4 = 13
            if (r3 == r4) goto L58
            r4 = 32
            if (r3 == r4) goto L58
            r4 = 35
            if (r3 == r4) goto L48
            r4 = 44
            if (r3 == r4) goto L58
            r4 = 47
            if (r3 == r4) goto L48
            r4 = 61
            if (r3 == r4) goto L48
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L58
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L58
            r4 = 58
            if (r3 == r4) goto L58
            r4 = 59
            if (r3 == r4) goto L48
            switch(r3) {
                case 91: goto L58;
                case 92: goto L48;
                case 93: goto L58;
                default: goto L45;
            }
        L45:
            int r2 = r2 + 1
            goto L3
        L48:
            r6.e()
            goto L58
        L4c:
            int r3 = r5.length
            if (r2 >= r3) goto L5a
            int r3 = r2 + 1
            boolean r3 = r6.m(r3)
            if (r3 == 0) goto L58
            goto L3
        L58:
            r1 = r2
            goto L78
        L5a:
            if (r0 != 0) goto L67
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L67:
            int r3 = r6.m
            r0.append(r5, r3, r2)
            int r3 = r6.m
            int r3 = r3 + r2
            r6.m = r3
            r2 = 1
            boolean r2 = r6.m(r2)
            if (r2 != 0) goto L2
        L78:
            int r2 = r6.m
            if (r0 != 0) goto L82
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r2, r1)
            goto L89
        L82:
            r0.append(r5, r2, r1)
            java.lang.String r0 = r0.toString()
        L89:
            int r2 = r6.m
            int r2 = r2 + r1
            r6.m = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q91.G():java.lang.String");
    }

    public final int H() {
        int i = this.q;
        if (i == 0) {
            i = g();
        }
        switch (i) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            case 17:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    public final void I(int i) {
        int i2 = this.v;
        if (i2 - 1 >= 255) {
            throw new IOException("Nesting limit 255 reached".concat(w()));
        }
        int[] iArr = this.u;
        if (i2 == iArr.length) {
            int i3 = i2 * 2;
            this.u = Arrays.copyOf(iArr, i3);
            this.x = Arrays.copyOf(this.x, i3);
            this.w = (String[]) Arrays.copyOf(this.w, i3);
        }
        int[] iArr2 = this.u;
        int i4 = this.v;
        this.v = i4 + 1;
        iArr2[i4] = i;
    }

    public final char J() {
        int i;
        if (this.m == this.n && !m(1)) {
            O("Unterminated escape sequence");
            throw null;
        }
        int i2 = this.m;
        int i3 = i2 + 1;
        this.m = i3;
        char[] cArr = this.b;
        char c = cArr[i2];
        if (c != '\n') {
            if (c != '\"') {
                if (c != '\'') {
                    if (c != '/' && c != '\\') {
                        if (c == 'b') {
                            return '\b';
                        }
                        if (c == 'f') {
                            return '\f';
                        }
                        if (c == 'n') {
                            return '\n';
                        }
                        if (c == 'r') {
                            return '\r';
                        }
                        if (c == 't') {
                            return '\t';
                        }
                        if (c != 'u') {
                            O("Invalid escape sequence");
                            throw null;
                        }
                        if (i2 + 5 > this.n && !m(4)) {
                            O("Unterminated escape sequence");
                            throw null;
                        }
                        int i4 = this.m;
                        int i5 = i4 + 4;
                        int i6 = 0;
                        while (i4 < i5) {
                            char c2 = cArr[i4];
                            int i7 = i6 << 4;
                            if (c2 >= '0' && c2 <= '9') {
                                i = c2 - '0';
                            } else if (c2 >= 'a' && c2 <= 'f') {
                                i = c2 - 'W';
                            } else {
                                if (c2 < 'A' || c2 > 'F') {
                                    O("Malformed Unicode escape \\u".concat(new String(cArr, this.m, 4)));
                                    throw null;
                                }
                                i = c2 - '7';
                            }
                            i6 = i + i7;
                            i4++;
                        }
                        this.m += 4;
                        return (char) i6;
                    }
                }
            }
            return c;
        }
        if (this.y == 3) {
            O("Cannot escape a newline character in strict mode");
            throw null;
        }
        this.o++;
        this.p = i3;
        if (this.y == 3) {
            O("Invalid escaped character \"'\" in strict mode");
            throw null;
        }
        return c;
    }

    public final void K(char c) {
        do {
            int i = this.m;
            int i2 = this.n;
            while (i < i2) {
                int i3 = i + 1;
                char c2 = this.b[i];
                if (c2 == c) {
                    this.m = i3;
                    return;
                }
                if (c2 == '\\') {
                    this.m = i3;
                    J();
                    i = this.m;
                    i2 = this.n;
                } else {
                    if (c2 == '\n') {
                        this.o++;
                        this.p = i3;
                    }
                    i = i3;
                }
            }
            this.m = i;
        } while (m(1));
        O("Unterminated string");
        throw null;
    }

    public final void L() {
        char c;
        do {
            if (this.m >= this.n && !m(1)) {
                return;
            }
            int i = this.m;
            int i2 = i + 1;
            this.m = i2;
            c = this.b[i];
            if (c == '\n') {
                this.o++;
                this.p = i2;
                return;
            }
        } while (c != '\r');
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.RegionMaker.calcSwitchOut(RegionMaker.java:923)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:797)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:157)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:740)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:740)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:411)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:201)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:135)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:242)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:135)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    public final void M() {
        /*
            r3 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r3.m
            int r1 = r1 + r0
            int r2 = r3.n
            if (r1 >= r2) goto L4f
            char[] r2 = r3.b
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L49
            r2 = 10
            if (r1 == r2) goto L49
            r2 = 12
            if (r1 == r2) goto L49
            r2 = 13
            if (r1 == r2) goto L49
            r2 = 32
            if (r1 == r2) goto L49
            r2 = 35
            if (r1 == r2) goto L46
            r2 = 44
            if (r1 == r2) goto L49
            r2 = 47
            if (r1 == r2) goto L46
            r2 = 61
            if (r1 == r2) goto L46
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L49
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L49
            r2 = 58
            if (r1 == r2) goto L49
            r2 = 59
            if (r1 == r2) goto L46
            switch(r1) {
                case 91: goto L49;
                case 92: goto L46;
                case 93: goto L49;
                default: goto L43;
            }
        L43:
            int r0 = r0 + 1
            goto L1
        L46:
            r3.e()
        L49:
            int r1 = r3.m
            int r1 = r1 + r0
            r3.m = r1
            return
        L4f:
            r3.m = r1
            r0 = 1
            boolean r0 = r3.m(r0)
            if (r0 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q91.M():void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0011. Please report as an issue. */
    public final void N() {
        int i = 0;
        do {
            int i2 = this.q;
            if (i2 == 0) {
                i2 = g();
            }
            switch (i2) {
                case 1:
                    I(3);
                    i++;
                    this.q = 0;
                    break;
                case 2:
                    if (i == 0) {
                        this.w[this.v - 1] = null;
                    }
                    this.v--;
                    i--;
                    this.q = 0;
                    break;
                case 3:
                    I(1);
                    i++;
                    this.q = 0;
                    break;
                case 4:
                    this.v--;
                    i--;
                    this.q = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.q = 0;
                    break;
                case 8:
                    K('\'');
                    this.q = 0;
                    break;
                case 9:
                    K('\"');
                    this.q = 0;
                    break;
                case 10:
                    M();
                    this.q = 0;
                    break;
                case 12:
                    K('\'');
                    if (i == 0) {
                        this.w[this.v - 1] = "<skipped>";
                    }
                    this.q = 0;
                    break;
                case 13:
                    K('\"');
                    if (i == 0) {
                        this.w[this.v - 1] = "<skipped>";
                    }
                    this.q = 0;
                    break;
                case 14:
                    M();
                    if (i == 0) {
                        this.w[this.v - 1] = "<skipped>";
                    }
                    this.q = 0;
                    break;
                case 16:
                    this.m += this.s;
                    this.q = 0;
                    break;
                case 17:
                    return;
            }
        } while (i > 0);
        int[] iArr = this.x;
        int i3 = this.v - 1;
        iArr[i3] = iArr[i3] + 1;
    }

    public final void O(String str) {
        throw new IOException(str + w() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("malformed-json"));
    }

    public final IllegalStateException P(String str) {
        String str2 = H() == 9 ? "adapter-not-null-safe" : "unexpected-json-structure";
        StringBuilder w = sg3.w("Expected ", str, " but was ");
        w.append(yo0.B(H()));
        w.append(w());
        w.append("\nSee ");
        w.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(str2));
        return new IllegalStateException(w.toString());
    }

    public final void Q(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > 127) {
                O("String contains non-ASCII characters: ".concat(str));
                throw null;
            }
        }
    }

    public final void a() {
        int i = this.q;
        if (i == 0) {
            i = g();
        }
        if (i != 3) {
            throw P("BEGIN_ARRAY");
        }
        I(1);
        this.x[this.v - 1] = 0;
        this.q = 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.q = 0;
        this.u[0] = 8;
        this.v = 1;
        this.a.close();
    }

    public final void d() {
        int i = this.q;
        if (i == 0) {
            i = g();
        }
        if (i != 1) {
            throw P("BEGIN_OBJECT");
        }
        I(3);
        this.q = 0;
    }

    public final void e() {
        if (this.y == 1) {
            return;
        }
        O("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x01cd, code lost:
    
        r24 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0222, code lost:
    
        if (v(r14) != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01a6, code lost:
    
        r8 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0225, code lost:
    
        if (r12 != 2) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0227, code lost:
    
        if (r13 == false) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x022d, code lost:
    
        if (r24 != Long.MIN_VALUE) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x022f, code lost:
    
        if (r7 == false) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0236, code lost:
    
        if (r24 != 0) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0238, code lost:
    
        if (r7 != false) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x023a, code lost:
    
        r4 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x023c, code lost:
    
        if (r7 == false) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x023f, code lost:
    
        r4 = -r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0240, code lost:
    
        r26.r = r4;
        r26.m += r2;
        r9 = 15;
        r26.q = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0232, code lost:
    
        r8 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x024c, code lost:
    
        if (r12 == r8) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x024f, code lost:
    
        if (r12 == 4) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0252, code lost:
    
        if (r12 != 7) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0254, code lost:
    
        r26.s = r2;
        r9 = 16;
        r26.q = 16;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0184 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x027e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x027f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g() {
        /*
            Method dump skipped, instructions count: 813
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q91.g():int");
    }

    public final void j() {
        int i = this.q;
        if (i == 0) {
            i = g();
        }
        if (i != 4) {
            throw P("END_ARRAY");
        }
        int i2 = this.v;
        this.v = i2 - 1;
        int[] iArr = this.x;
        int i3 = i2 - 2;
        iArr[i3] = iArr[i3] + 1;
        this.q = 0;
    }

    public final void l() {
        int i = this.q;
        if (i == 0) {
            i = g();
        }
        if (i != 2) {
            throw P("END_OBJECT");
        }
        int i2 = this.v;
        int i3 = i2 - 1;
        this.v = i3;
        this.w[i3] = null;
        int[] iArr = this.x;
        int i4 = i2 - 2;
        iArr[i4] = iArr[i4] + 1;
        this.q = 0;
    }

    public final boolean m(int i) {
        int i2;
        int i3;
        int i4 = this.p;
        int i5 = this.m;
        this.p = i4 - i5;
        int i6 = this.n;
        char[] cArr = this.b;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.n = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.n = 0;
        }
        this.m = 0;
        do {
            int i8 = this.n;
            int read = this.a.read(cArr, i8, cArr.length - i8);
            if (read == -1) {
                return false;
            }
            i2 = this.n + read;
            this.n = i2;
            if (this.o == 0 && (i3 = this.p) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.m++;
                this.p = i3 + 1;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    public final String n(boolean z) {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (true) {
            int i2 = this.v;
            if (i >= i2) {
                return sb.toString();
            }
            int i3 = this.u[i];
            switch (i3) {
                case 1:
                case 2:
                    int i4 = this.x[i];
                    if (z && i4 > 0 && i == i2 - 1) {
                        i4--;
                    }
                    sb.append('[');
                    sb.append(i4);
                    sb.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb.append('.');
                    String str = this.w[i];
                    if (str == null) {
                        break;
                    } else {
                        sb.append(str);
                        break;
                    }
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    qq.e(lt.w(i3, "Unknown scope value: "));
                    return null;
            }
            i++;
        }
    }

    public final boolean q() {
        int i = this.q;
        if (i == 0) {
            i = g();
        }
        return (i == 2 || i == 4 || i == 17) ? false : true;
    }

    public final String toString() {
        return q91.class.getSimpleName().concat(w());
    }

    public final boolean v(char c) {
        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (c != '/' && c != '=') {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        e();
        return false;
    }

    public final String w() {
        StringBuilder E = vg1.E(" at line ", this.o + 1, " column ", (this.m - this.p) + 1, " path ");
        E.append(n(false));
        return E.toString();
    }

    public final boolean x() {
        int i = this.q;
        if (i == 0) {
            i = g();
        }
        if (i == 5) {
            this.q = 0;
            int[] iArr = this.x;
            int i2 = this.v - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        }
        if (i != 6) {
            throw P("a boolean");
        }
        this.q = 0;
        int[] iArr2 = this.x;
        int i3 = this.v - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return false;
    }

    public final double y() {
        int i = this.q;
        if (i == 0) {
            i = g();
        }
        if (i == 15) {
            this.q = 0;
            int[] iArr = this.x;
            int i2 = this.v - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.r;
        }
        if (i == 16) {
            this.t = new String(this.b, this.m, this.s);
            this.m += this.s;
        } else if (i == 8 || i == 9) {
            this.t = E(i == 8 ? '\'' : '\"');
        } else if (i == 10) {
            this.t = G();
        } else if (i != 11) {
            throw P("a double");
        }
        this.q = 11;
        double parseDouble = Double.parseDouble(this.t);
        if (this.y != 1 && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            O("JSON forbids NaN and infinities: " + parseDouble);
            throw null;
        }
        this.t = null;
        this.q = 0;
        int[] iArr2 = this.x;
        int i3 = this.v - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return parseDouble;
    }

    public final int z() {
        String E;
        int i = this.q;
        if (i == 0) {
            i = g();
        }
        if (i == 15) {
            long j = this.r;
            int i2 = (int) j;
            if (j == i2) {
                this.q = 0;
                int[] iArr = this.x;
                int i3 = this.v - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new NumberFormatException("Expected an int but was " + this.r + w());
        }
        if (i == 16) {
            this.t = new String(this.b, this.m, this.s);
            this.m += this.s;
        } else {
            if (i != 8 && i != 9 && i != 10) {
                throw P("an int");
            }
            if (i == 10) {
                E = G();
                this.t = E;
            } else {
                E = E(i == 8 ? '\'' : '\"');
                this.t = E;
            }
            Q(E);
            try {
                int parseInt = Integer.parseInt(this.t);
                this.q = 0;
                int[] iArr2 = this.x;
                int i4 = this.v - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.q = 11;
        double parseDouble = Double.parseDouble(this.t);
        int i5 = (int) parseDouble;
        if (i5 == parseDouble) {
            this.t = null;
            this.q = 0;
            int[] iArr3 = this.x;
            int i6 = this.v - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        }
        throw new NumberFormatException("Expected an int but was " + this.t + w());
    }
}
