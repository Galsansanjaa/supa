package j$.time.temporal;

import androidx.collection.SieveCacheKt;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes2.dex */
public final class u implements Serializable {
    private static final long serialVersionUID = -7317881728594519368L;
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public u(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public static u f(long j, long j2) {
        if (j <= j2) {
            return new u(j, j, j2, j2);
        }
        j$.time.f.c("Minimum value must be less than maximum value");
        return null;
    }

    public static u g(long j, long j2, long j3) {
        if (j > 1) {
            j$.time.f.c("Smallest minimum value must be less than largest minimum value");
            return null;
        }
        if (j2 > j3) {
            j$.time.f.c("Smallest maximum value must be less than largest maximum value");
            return null;
        }
        if (1 <= j3) {
            return new u(j, 1L, j2, j3);
        }
        j$.time.f.c("Minimum value must be less than maximum value");
        return null;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        long j = this.a;
        long j2 = this.b;
        if (j > j2) {
            throw new InvalidObjectException("Smallest minimum value must be less than largest minimum value");
        }
        long j3 = this.c;
        long j4 = this.d;
        if (j3 > j4) {
            throw new InvalidObjectException("Smallest maximum value must be less than largest maximum value");
        }
        if (j2 > j4) {
            throw new InvalidObjectException("Minimum value must be less than maximum value");
        }
    }

    public final int a(long j, q qVar) {
        if (d() && e(j)) {
            return (int) j;
        }
        j$.time.f.k(c(j, qVar));
        return 0;
    }

    public final void b(long j, q qVar) {
        if (e(j)) {
            return;
        }
        j$.time.f.k(c(j, qVar));
    }

    public final String c(long j, q qVar) {
        if (qVar == null) {
            return "Invalid value (valid values " + this + "): " + j;
        }
        return "Invalid value for " + qVar + " (valid values " + this + "): " + j;
    }

    public final boolean d() {
        return this.a >= SieveCacheKt.NodeMetaAndPreviousMask && this.d <= SieveCacheKt.NodeLinkMask;
    }

    public final boolean e(long j) {
        return j >= this.a && j <= this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (this.a == uVar.a && this.b == uVar.b && this.c == uVar.c && this.d == uVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        long j3 = j + (j2 << 16) + (j2 >> 48);
        long j4 = this.c;
        long j5 = j3 + (j4 << 32) + (j4 >> 32);
        long j6 = this.d;
        long j7 = j5 + (j6 << 48) + (j6 >> 16);
        return (int) (j7 ^ (j7 >>> 32));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        if (this.a != this.b) {
            sb.append('/');
            sb.append(this.b);
        }
        sb.append(" - ");
        sb.append(this.c);
        if (this.c != this.d) {
            sb.append('/');
            sb.append(this.d);
        }
        return sb.toString();
    }
}
