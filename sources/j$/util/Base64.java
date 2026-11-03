package j$.util;

import java.util.Arrays;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes2.dex */
public class Base64 {

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes2.dex */
    public static class Decoder {
        public static final int[] a;
        public static final int[] b;
        public static final Decoder c;

        /* JADX WARN: Type inference failed for: r0v3, types: [j$.util.Base64$Decoder, java.lang.Object] */
        static {
            int[] iArr = new int[256];
            a = iArr;
            Arrays.fill(iArr, -1);
            for (int i = 0; i < 64; i++) {
                a[c.a[i]] = i;
            }
            a[61] = -2;
            int[] iArr2 = new int[256];
            b = iArr2;
            Arrays.fill(iArr2, -1);
            for (int i2 = 0; i2 < 64; i2++) {
                b[c.b[i2]] = i2;
            }
            b[61] = -2;
            c = new Object();
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x00be, code lost:
        
            if (r0[r2] == 61) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00c5, code lost:
        
            if (r10 != 18) goto L58;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00e8  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00b3 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public byte[] decode(java.lang.String r21) {
            /*
                Method dump skipped, instructions count: 335
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: j$.util.Base64.Decoder.decode(java.lang.String):byte[]");
        }
    }

    public static Decoder getUrlDecoder() {
        return Decoder.c;
    }
}
