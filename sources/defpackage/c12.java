package defpackage;

import androidx.work.WorkInfo;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class c12 implements ds1 {
    public static final Charset e = Charset.forName("UTF-8");
    public static final em0 f = new em0(sg3.y(sg3.x(b12.class, new he(1))), "key");
    public static final em0 g = new em0(sg3.y(sg3.x(b12.class, new he(2))), "value");
    public static final j81 h = new j81(1);
    public OutputStream a;
    public final HashMap b;
    public final HashMap c;
    public final d12 d = new d12(this);

    public c12(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2) {
        this.a = byteArrayOutputStream;
        this.b = hashMap;
        this.c = hashMap2;
    }

    public static int k(em0 em0Var) {
        b12 b12Var = (b12) ((Annotation) em0Var.b.get(b12.class));
        if (b12Var != null) {
            return b12Var.tag();
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    @Override // defpackage.ds1
    public final ds1 a(em0 em0Var, Object obj) {
        i(em0Var, obj, true);
        return this;
    }

    public final void b(em0 em0Var, double d, boolean z) {
        if (z && d == 0.0d) {
            return;
        }
        l((k(em0Var) << 3) | 1);
        this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    public final void c(em0 em0Var, int i, boolean z) {
        if (z && i == 0) {
            return;
        }
        b12 b12Var = (b12) ((Annotation) em0Var.b.get(b12.class));
        if (b12Var == null) {
            throw new RuntimeException("Field has no @Protobuf config");
        }
        int ordinal = b12Var.intEncoding().ordinal();
        if (ordinal == 0) {
            l(b12Var.tag() << 3);
            l(i);
        } else if (ordinal == 1) {
            l(b12Var.tag() << 3);
            l((i << 1) ^ (i >> 31));
        } else {
            if (ordinal != 2) {
                return;
            }
            l((b12Var.tag() << 3) | 5);
            this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i).array());
        }
    }

    @Override // defpackage.ds1
    public final ds1 d(em0 em0Var, boolean z) {
        c(em0Var, z ? 1 : 0, true);
        return this;
    }

    @Override // defpackage.ds1
    public final ds1 e(em0 em0Var, int i) {
        c(em0Var, i, true);
        return this;
    }

    @Override // defpackage.ds1
    public final ds1 f(em0 em0Var, double d) {
        b(em0Var, d, true);
        return this;
    }

    @Override // defpackage.ds1
    public final ds1 g(em0 em0Var, long j) {
        h(em0Var, j, true);
        return this;
    }

    public final void h(em0 em0Var, long j, boolean z) {
        if (z && j == 0) {
            return;
        }
        b12 b12Var = (b12) ((Annotation) em0Var.b.get(b12.class));
        if (b12Var == null) {
            throw new RuntimeException("Field has no @Protobuf config");
        }
        int ordinal = b12Var.intEncoding().ordinal();
        if (ordinal == 0) {
            l(b12Var.tag() << 3);
            m(j);
        } else if (ordinal == 1) {
            l(b12Var.tag() << 3);
            m((j >> 63) ^ (j << 1));
        } else {
            if (ordinal != 2) {
                return;
            }
            l((b12Var.tag() << 3) | 1);
            this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j).array());
        }
    }

    public final void i(em0 em0Var, Object obj, boolean z) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return;
            }
            l((k(em0Var) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(e);
            l(bytes.length);
            this.a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                i(em0Var, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                j(h, em0Var, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            b(em0Var, ((Double) obj).doubleValue(), z);
            return;
        }
        if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            if (z && floatValue == 0.0f) {
                return;
            }
            l((k(em0Var) << 3) | 5);
            this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
            return;
        }
        if (obj instanceof Number) {
            h(em0Var, ((Number) obj).longValue(), z);
            return;
        }
        if (obj instanceof Boolean) {
            c(em0Var, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return;
            }
            l((k(em0Var) << 3) | 2);
            l(bArr.length);
            this.a.write(bArr);
            return;
        }
        cs1 cs1Var = (cs1) this.b.get(obj.getClass());
        if (cs1Var != null) {
            j(cs1Var, em0Var, obj, z);
            return;
        }
        q63 q63Var = (q63) this.c.get(obj.getClass());
        if (q63Var != null) {
            d12 d12Var = this.d;
            d12Var.a = false;
            d12Var.c = em0Var;
            d12Var.b = z;
            q63Var.a(obj, d12Var);
            return;
        }
        if (obj instanceof z02) {
            c(em0Var, ((z02) obj).getNumber(), true);
        } else if (obj instanceof Enum) {
            c(em0Var, ((Enum) obj).ordinal(), true);
        } else {
            j(xu3.d, em0Var, obj, z);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.OutputStream, zc1] */
    public final void j(cs1 cs1Var, em0 em0Var, Object obj, boolean z) {
        ?? outputStream = new OutputStream();
        outputStream.a = 0L;
        try {
            OutputStream outputStream2 = this.a;
            this.a = outputStream;
            try {
                cs1Var.a(obj, this);
                this.a = outputStream2;
                long j = outputStream.a;
                outputStream.close();
                if (z && j == 0) {
                    return;
                }
                l((k(em0Var) << 3) | 2);
                m(j);
                cs1Var.a(obj, this);
            } catch (Throwable th) {
                this.a = outputStream2;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                outputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void l(int i) {
        while (true) {
            long j = i & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
            OutputStream outputStream = this.a;
            if (j == 0) {
                outputStream.write(i & 127);
                return;
            } else {
                outputStream.write((i & 127) | 128);
                i >>>= 7;
            }
        }
    }

    public final void m(long j) {
        while (true) {
            long j2 = (-128) & j;
            OutputStream outputStream = this.a;
            if (j2 == 0) {
                outputStream.write(((int) j) & 127);
                return;
            } else {
                outputStream.write((((int) j) & 127) | 128);
                j >>>= 7;
            }
        }
    }
}
