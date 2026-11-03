package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class au2 extends g {
    public static final au2 d = new Object();

    @Override // defpackage.g
    public final String c(String str) {
        if (str.length() % 24 <= 0) {
            return str;
        }
        char[] cArr = new char[24 - (str.length() % 24)];
        Arrays.fill(cArr, '0');
        return str.concat(new String(cArr));
    }
}
