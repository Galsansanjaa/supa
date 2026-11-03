package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public class gz implements c32 {
    public boolean a = true;
    public final Object b;

    public /* synthetic */ gz(Object obj) {
        this.b = obj;
    }

    @Override // defpackage.c32
    public void a(b32 b32Var, int i) {
        StringBuilder sb = (StringBuilder) this.b;
        if (this.a) {
            this.a = false;
        } else {
            sb.append(", ");
        }
        sb.append(i);
    }

    public void b() {
        this.a = false;
    }

    public void c(byte b) {
        ((zo) this.b).i(String.valueOf(b));
    }

    public void d(char c) {
        zo zoVar = (zo) this.b;
        zoVar.a(zoVar.b, 1);
        char[] cArr = (char[]) zoVar.c;
        int i = zoVar.b;
        zoVar.b = i + 1;
        cArr[i] = c;
    }

    public void e(int i) {
        ((zo) this.b).i(String.valueOf(i));
    }

    public void f(long j) {
        ((zo) this.b).i(String.valueOf(j));
    }

    public void g(short s) {
        ((zo) this.b).i(String.valueOf(s));
    }

    public void h(String str) {
        int i;
        str.getClass();
        zo zoVar = (zo) this.b;
        zoVar.a(zoVar.b, str.length() + 2);
        char[] cArr = (char[]) zoVar.c;
        int i2 = zoVar.b;
        int i3 = i2 + 1;
        cArr[i2] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i3);
        int i4 = length + i3;
        int i5 = i3;
        while (i5 < i4) {
            char c = cArr[i5];
            byte[] bArr = rm2.b;
            if (c < bArr.length && bArr[c] != 0) {
                int length2 = str.length();
                for (int i6 = i5 - i3; i6 < length2; i6++) {
                    zoVar.a(i5, 2);
                    char charAt = str.charAt(i6);
                    byte[] bArr2 = rm2.b;
                    if (charAt < bArr2.length) {
                        byte b = bArr2[charAt];
                        if (b == 0) {
                            i = i5 + 1;
                            ((char[]) zoVar.c)[i5] = charAt;
                        } else {
                            if (b == 1) {
                                String str2 = rm2.a[charAt];
                                str2.getClass();
                                zoVar.a(i5, str2.length());
                                str2.getChars(0, str2.length(), (char[]) zoVar.c, i5);
                                int length3 = str2.length() + i5;
                                zoVar.b = length3;
                                i5 = length3;
                            } else {
                                char[] cArr2 = (char[]) zoVar.c;
                                cArr2[i5] = '\\';
                                cArr2[i5 + 1] = (char) b;
                                i5 += 2;
                                zoVar.b = i5;
                            }
                        }
                    } else {
                        i = i5 + 1;
                        ((char[]) zoVar.c)[i5] = charAt;
                    }
                    i5 = i;
                }
                zoVar.a(i5, 1);
                ((char[]) zoVar.c)[i5] = '\"';
                zoVar.b = i5 + 1;
                return;
            }
            i5++;
        }
        cArr[i4] = '\"';
        zoVar.b = i4 + 1;
    }

    public void i() {
    }

    public void j() {
    }
}
