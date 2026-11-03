package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class nz extends g {
    public static final nz d = new Object();

    @Override // defpackage.g
    public final String c(String str) {
        char[] cArr = str.length() % 8 > 0 ? new char[8 - (str.length() % 8)] : new char[0];
        Arrays.fill(cArr, '0');
        char[] cArr2 = (str.length() + cArr.length) % 6 > 0 ? new char[6 - ((str.length() + cArr.length) % 6)] : new char[0];
        Arrays.fill(cArr2, '0');
        return str + new String(cArr) + new String(cArr2);
    }
}
