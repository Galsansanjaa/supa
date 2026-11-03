package defpackage;

import java.util.Arrays;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class p94 implements Comparable {
    public static final /* synthetic */ long m = zd.a.objectFieldOffset(p94.class.getDeclaredField("b"));
    public final String a;
    public volatile Object b;

    public /* synthetic */ p94(String str, byte[] bArr) {
        this.a = str;
        this.b = bArr;
    }

    public final /* synthetic */ void a(byte[] bArr) {
        byte[][] bArr2;
        p94 p94Var;
        int i = 0;
        while (true) {
            Object obj = this.b;
            if (!(obj instanceof byte[])) {
                byte[][] bArr3 = (byte[][]) obj;
                while (true) {
                    int length = bArr3.length;
                    if (i >= length) {
                        bArr2 = (byte[][]) Arrays.copyOf(bArr3, length + 1);
                        bArr2[length] = bArr;
                        break;
                    } else if (Arrays.equals(bArr, bArr3[i])) {
                        return;
                    } else {
                        i++;
                    }
                }
            } else {
                byte[] bArr4 = (byte[]) obj;
                if (Arrays.equals(bArr, bArr4)) {
                    return;
                }
                i = 1;
                bArr2 = new byte[][]{bArr4, bArr};
            }
            byte[][] bArr5 = bArr2;
            while (true) {
                Unsafe unsafe = zd.a;
                long j = m;
                p94Var = this;
                if (unsafe.compareAndSwapObject(p94Var, j, obj, bArr5)) {
                    return;
                }
                if (unsafe.getObjectVolatile(p94Var, j) != obj) {
                    break;
                } else {
                    this = p94Var;
                }
            }
            this = p94Var;
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.a.compareTo((String) obj);
    }
}
