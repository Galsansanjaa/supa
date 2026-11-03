package androidx.work;

import defpackage.a52;
import defpackage.cq;
import defpackage.hd0;
import defpackage.hu2;
import defpackage.i70;
import defpackage.jh2;
import defpackage.kw;
import defpackage.kx;
import defpackage.lt;
import defpackage.mv;
import defpackage.ps0;
import defpackage.sb0;
import defpackage.ts0;
import defpackage.wa2;
import defpackage.wd;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class Data {
    public static final Companion Companion = new Companion(null);
    public static final Data EMPTY = new Builder().build();
    public static final int MAX_DATA_BYTES = 10240;
    private static final String NULL_STRING_V1 = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
    private static final short STREAM_MAGIC = -21521;
    private static final short STREAM_VERSION = 1;
    private static final byte TYPE_BOOLEAN = 1;
    private static final byte TYPE_BOOLEAN_ARRAY = 8;
    private static final byte TYPE_BYTE = 2;
    private static final byte TYPE_BYTE_ARRAY = 9;
    private static final byte TYPE_DOUBLE = 6;
    private static final byte TYPE_DOUBLE_ARRAY = 13;
    private static final byte TYPE_FLOAT = 5;
    private static final byte TYPE_FLOAT_ARRAY = 12;
    private static final byte TYPE_INTEGER = 3;
    private static final byte TYPE_INTEGER_ARRAY = 10;
    private static final byte TYPE_LONG = 4;
    private static final byte TYPE_LONG_ARRAY = 11;
    private static final byte TYPE_NULL = 0;
    private static final byte TYPE_STRING = 7;
    private static final byte TYPE_STRING_ARRAY = 14;
    private final Map<String, Object> values;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes4.dex */
    public static final class Builder {
        private final Map<String, Object> values = new LinkedHashMap();

        private final Builder putDirect(String str, Object obj) {
            this.values.put(str, obj);
            return this;
        }

        public final Data build() {
            Data data = new Data((Map<String, ?>) this.values);
            Data.Companion.toByteArrayInternalV1(data);
            return data;
        }

        public final Builder put(String str, Object obj) {
            str.getClass();
            Map<String, Object> map = this.values;
            if (obj == null) {
                obj = null;
            } else {
                mv a = a52.a(obj.getClass());
                if (!a.equals(a52.a(Boolean.TYPE)) && !a.equals(a52.a(Byte.TYPE)) && !a.equals(a52.a(Integer.TYPE)) && !a.equals(a52.a(Long.TYPE)) && !a.equals(a52.a(Float.TYPE)) && !a.equals(a52.a(Double.TYPE)) && !a.equals(a52.a(String.class)) && !a.equals(a52.a(Boolean[].class)) && !a.equals(a52.a(Byte[].class)) && !a.equals(a52.a(Integer[].class)) && !a.equals(a52.a(Long[].class)) && !a.equals(a52.a(Float[].class)) && !a.equals(a52.a(Double[].class)) && !a.equals(a52.a(String[].class))) {
                    if (a.equals(a52.a(boolean[].class))) {
                        obj = Data_Kt.convertPrimitiveArray((boolean[]) obj);
                    } else if (a.equals(a52.a(byte[].class))) {
                        obj = Data_Kt.convertPrimitiveArray((byte[]) obj);
                    } else if (a.equals(a52.a(int[].class))) {
                        obj = Data_Kt.convertPrimitiveArray((int[]) obj);
                    } else if (a.equals(a52.a(long[].class))) {
                        obj = Data_Kt.convertPrimitiveArray((long[]) obj);
                    } else if (a.equals(a52.a(float[].class))) {
                        obj = Data_Kt.convertPrimitiveArray((float[]) obj);
                    } else {
                        if (!a.equals(a52.a(double[].class))) {
                            i70.m("Key ", str, " has invalid type ", a);
                            return null;
                        }
                        obj = Data_Kt.convertPrimitiveArray((double[]) obj);
                    }
                }
            }
            map.put(str, obj);
            return this;
        }

        public final Builder putAll(Data data) {
            data.getClass();
            putAll(data.values);
            return this;
        }

        public final Builder putAll(Map<String, ? extends Object> map) {
            map.getClass();
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
            return this;
        }

        public final Builder putBoolean(String str, boolean z) {
            str.getClass();
            return putDirect(str, Boolean.valueOf(z));
        }

        public final Builder putBooleanArray(String str, boolean[] zArr) {
            Boolean[] convertPrimitiveArray;
            str.getClass();
            zArr.getClass();
            Map<String, Object> map = this.values;
            convertPrimitiveArray = Data_Kt.convertPrimitiveArray(zArr);
            map.put(str, convertPrimitiveArray);
            return this;
        }

        public final Builder putByte(String str, byte b) {
            str.getClass();
            return putDirect(str, Byte.valueOf(b));
        }

        public final Builder putByteArray(String str, byte[] bArr) {
            Byte[] convertPrimitiveArray;
            str.getClass();
            bArr.getClass();
            Map<String, Object> map = this.values;
            convertPrimitiveArray = Data_Kt.convertPrimitiveArray(bArr);
            map.put(str, convertPrimitiveArray);
            return this;
        }

        public final Builder putDouble(String str, double d) {
            str.getClass();
            return putDirect(str, Double.valueOf(d));
        }

        public final Builder putDoubleArray(String str, double[] dArr) {
            Double[] convertPrimitiveArray;
            str.getClass();
            dArr.getClass();
            Map<String, Object> map = this.values;
            convertPrimitiveArray = Data_Kt.convertPrimitiveArray(dArr);
            map.put(str, convertPrimitiveArray);
            return this;
        }

        public final Builder putFloat(String str, float f) {
            str.getClass();
            return putDirect(str, Float.valueOf(f));
        }

        public final Builder putFloatArray(String str, float[] fArr) {
            Float[] convertPrimitiveArray;
            str.getClass();
            fArr.getClass();
            Map<String, Object> map = this.values;
            convertPrimitiveArray = Data_Kt.convertPrimitiveArray(fArr);
            map.put(str, convertPrimitiveArray);
            return this;
        }

        public final Builder putInt(String str, int i) {
            str.getClass();
            return putDirect(str, Integer.valueOf(i));
        }

        public final Builder putIntArray(String str, int[] iArr) {
            Integer[] convertPrimitiveArray;
            str.getClass();
            iArr.getClass();
            Map<String, Object> map = this.values;
            convertPrimitiveArray = Data_Kt.convertPrimitiveArray(iArr);
            map.put(str, convertPrimitiveArray);
            return this;
        }

        public final Builder putLong(String str, long j) {
            str.getClass();
            return putDirect(str, Long.valueOf(j));
        }

        public final Builder putLongArray(String str, long[] jArr) {
            Long[] convertPrimitiveArray;
            str.getClass();
            jArr.getClass();
            Map<String, Object> map = this.values;
            convertPrimitiveArray = Data_Kt.convertPrimitiveArray(jArr);
            map.put(str, convertPrimitiveArray);
            return this;
        }

        public final Builder putString(String str, String str2) {
            str.getClass();
            return putDirect(str, str2);
        }

        public final Builder putStringArray(String str, String[] strArr) {
            str.getClass();
            strArr.getClass();
            return putDirect(str, strArr);
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        private static final boolean fromByteArray$isObjectStream(ByteArrayInputStream byteArrayInputStream) {
            byte[] bArr = new byte[2];
            byteArrayInputStream.read(bArr);
            boolean z = false;
            if (bArr[0] == -84 && bArr[1] == -19) {
                z = true;
            }
            byteArrayInputStream.reset();
            return z;
        }

        private static final void fromByteArray$readHeader(DataInputStream dataInputStream) {
            short readShort = dataInputStream.readShort();
            if (readShort != -21521) {
                i70.k(lt.w(readShort, "Magic number doesn't match: "));
                return;
            }
            short readShort2 = dataInputStream.readShort();
            if (readShort2 == 1) {
                return;
            }
            i70.k(lt.w(readShort2, "Unsupported version number: "));
        }

        private static final Object fromByteArray$readValue(DataInputStream dataInputStream, byte b) {
            if (b == 0) {
                return null;
            }
            if (b == 1) {
                return Boolean.valueOf(dataInputStream.readBoolean());
            }
            if (b == 2) {
                return Byte.valueOf(dataInputStream.readByte());
            }
            if (b == 3) {
                return Integer.valueOf(dataInputStream.readInt());
            }
            if (b == 4) {
                return Long.valueOf(dataInputStream.readLong());
            }
            if (b == 5) {
                return Float.valueOf(dataInputStream.readFloat());
            }
            if (b == 6) {
                return Double.valueOf(dataInputStream.readDouble());
            }
            if (b == 7) {
                return dataInputStream.readUTF();
            }
            int i = 0;
            if (b == 8) {
                int readInt = dataInputStream.readInt();
                Boolean[] boolArr = new Boolean[readInt];
                while (i < readInt) {
                    boolArr[i] = Boolean.valueOf(dataInputStream.readBoolean());
                    i++;
                }
                return boolArr;
            }
            if (b == 9) {
                int readInt2 = dataInputStream.readInt();
                Byte[] bArr = new Byte[readInt2];
                while (i < readInt2) {
                    bArr[i] = Byte.valueOf(dataInputStream.readByte());
                    i++;
                }
                return bArr;
            }
            if (b == 10) {
                int readInt3 = dataInputStream.readInt();
                Integer[] numArr = new Integer[readInt3];
                while (i < readInt3) {
                    numArr[i] = Integer.valueOf(dataInputStream.readInt());
                    i++;
                }
                return numArr;
            }
            if (b == 11) {
                int readInt4 = dataInputStream.readInt();
                Long[] lArr = new Long[readInt4];
                while (i < readInt4) {
                    lArr[i] = Long.valueOf(dataInputStream.readLong());
                    i++;
                }
                return lArr;
            }
            if (b == 12) {
                int readInt5 = dataInputStream.readInt();
                Float[] fArr = new Float[readInt5];
                while (i < readInt5) {
                    fArr[i] = Float.valueOf(dataInputStream.readFloat());
                    i++;
                }
                return fArr;
            }
            if (b == 13) {
                int readInt6 = dataInputStream.readInt();
                Double[] dArr = new Double[readInt6];
                while (i < readInt6) {
                    dArr[i] = Double.valueOf(dataInputStream.readDouble());
                    i++;
                }
                return dArr;
            }
            if (b != 14) {
                hu2.h(lt.w(b, "Unsupported type "));
                return null;
            }
            int readInt7 = dataInputStream.readInt();
            String[] strArr = new String[readInt7];
            while (i < readInt7) {
                String readUTF = dataInputStream.readUTF();
                if (jh2.k(readUTF, Data.NULL_STRING_V1)) {
                    readUTF = null;
                }
                strArr[i] = readUTF;
                i++;
            }
            return strArr;
        }

        private static final void toByteArrayInternalV1$writeArray(DataOutputStream dataOutputStream, Object[] objArr) {
            int i;
            mv a = a52.a(objArr.getClass());
            if (a.equals(a52.a(Boolean[].class))) {
                i = 8;
            } else if (a.equals(a52.a(Byte[].class))) {
                i = 9;
            } else if (a.equals(a52.a(Integer[].class))) {
                i = 10;
            } else if (a.equals(a52.a(Long[].class))) {
                i = 11;
            } else if (a.equals(a52.a(Float[].class))) {
                i = 12;
            } else if (a.equals(a52.a(Double[].class))) {
                i = 13;
            } else {
                if (!a.equals(a52.a(String[].class))) {
                    i70.l(a52.a(objArr.getClass()).b(), "Unsupported value type ");
                    return;
                }
                i = 14;
            }
            dataOutputStream.writeByte(i);
            dataOutputStream.writeInt(objArr.length);
            for (Object obj : objArr) {
                if (i == 8) {
                    Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
                    dataOutputStream.writeBoolean(bool != null ? bool.booleanValue() : false);
                } else if (i == 9) {
                    Byte b = obj instanceof Byte ? (Byte) obj : null;
                    dataOutputStream.writeByte(b != null ? b.byteValue() : (byte) 0);
                } else if (i == 10) {
                    Integer num = obj instanceof Integer ? (Integer) obj : null;
                    dataOutputStream.writeInt(num != null ? num.intValue() : 0);
                } else if (i == 11) {
                    Long l = obj instanceof Long ? (Long) obj : null;
                    dataOutputStream.writeLong(l != null ? l.longValue() : 0L);
                } else if (i == 12) {
                    Float f = obj instanceof Float ? (Float) obj : null;
                    dataOutputStream.writeFloat(f != null ? f.floatValue() : 0.0f);
                } else if (i == 13) {
                    Double d = obj instanceof Double ? (Double) obj : null;
                    dataOutputStream.writeDouble(d != null ? d.doubleValue() : 0.0d);
                } else if (i == 14) {
                    String str = obj instanceof String ? (String) obj : null;
                    if (str == null) {
                        str = Data.NULL_STRING_V1;
                    }
                    dataOutputStream.writeUTF(str);
                }
            }
        }

        private static final void toByteArrayInternalV1$writeEntry(DataOutputStream dataOutputStream, String str, Object obj) {
            if (obj == null) {
                dataOutputStream.writeByte(0);
            } else if (obj instanceof Boolean) {
                dataOutputStream.writeByte(1);
                dataOutputStream.writeBoolean(((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                dataOutputStream.writeByte(2);
                dataOutputStream.writeByte(((Number) obj).byteValue());
            } else if (obj instanceof Integer) {
                dataOutputStream.writeByte(3);
                dataOutputStream.writeInt(((Number) obj).intValue());
            } else if (obj instanceof Long) {
                dataOutputStream.writeByte(4);
                dataOutputStream.writeLong(((Number) obj).longValue());
            } else if (obj instanceof Float) {
                dataOutputStream.writeByte(5);
                dataOutputStream.writeFloat(((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                dataOutputStream.writeByte(6);
                dataOutputStream.writeDouble(((Number) obj).doubleValue());
            } else if (obj instanceof String) {
                dataOutputStream.writeByte(7);
                dataOutputStream.writeUTF((String) obj);
            } else {
                if (!(obj instanceof Object[])) {
                    i70.l(a52.a(obj.getClass()).c(), "Unsupported value type ");
                    return;
                }
                toByteArrayInternalV1$writeArray(dataOutputStream, (Object[]) obj);
            }
            dataOutputStream.writeUTF(str);
        }

        private static final void toByteArrayInternalV1$writeHeader(DataOutputStream dataOutputStream) {
            dataOutputStream.writeShort(-21521);
            dataOutputStream.writeShort(1);
        }

        public final Data fromByteArray(byte[] bArr) {
            String str;
            String str2;
            bArr.getClass();
            if (bArr.length > 10240) {
                hu2.h("Data cannot occupy more than 10240 bytes when serialized");
                return null;
            }
            if (bArr.length == 0) {
                return Data.EMPTY;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                int i = 0;
                if (fromByteArray$isObjectStream(byteArrayInputStream)) {
                    ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        int readInt = objectInputStream.readInt();
                        while (i < readInt) {
                            linkedHashMap.put(objectInputStream.readUTF(), objectInputStream.readObject());
                            i++;
                        }
                        objectInputStream.close();
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            kx.o(objectInputStream, th);
                            throw th2;
                        }
                    }
                } else {
                    DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
                    try {
                        fromByteArray$readHeader(dataInputStream);
                        int readInt2 = dataInputStream.readInt();
                        while (i < readInt2) {
                            linkedHashMap.put(dataInputStream.readUTF(), fromByteArray$readValue(dataInputStream, dataInputStream.readByte()));
                            i++;
                        }
                        dataInputStream.close();
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            kx.o(dataInputStream, th3);
                            throw th4;
                        }
                    }
                }
            } catch (IOException e) {
                str2 = Data_Kt.TAG;
                Logger.get().error(str2, "Error in Data#fromByteArray: ", e);
            } catch (ClassNotFoundException e2) {
                str = Data_Kt.TAG;
                Logger.get().error(str, "Error in Data#fromByteArray: ", e2);
            }
            return new Data(linkedHashMap);
        }

        @hd0
        public final byte[] toByteArrayInternalV0(Data data) {
            String str;
            data.getClass();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                    try {
                        objectOutputStream.writeInt(data.size());
                        for (Map.Entry entry : data.values.entrySet()) {
                            String str2 = (String) entry.getKey();
                            Object value = entry.getValue();
                            objectOutputStream.writeUTF(str2);
                            objectOutputStream.writeObject(value);
                        }
                        objectOutputStream.close();
                        byteArrayOutputStream.close();
                        if (byteArrayOutputStream.size() > 10240) {
                            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArray.getClass();
                        return byteArray;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            kx.o(objectOutputStream, th);
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        kx.o(byteArrayOutputStream, th3);
                        throw th4;
                    }
                }
            } catch (IOException e) {
                str = Data_Kt.TAG;
                Logger.get().error(str, "Error in Data#toByteArray: ", e);
                return new byte[0];
            }
        }

        public final byte[] toByteArrayInternalV1(Data data) {
            String str;
            data.getClass();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                try {
                    toByteArrayInternalV1$writeHeader(dataOutputStream);
                    dataOutputStream.writeInt(data.size());
                    for (Map.Entry entry : data.values.entrySet()) {
                        toByteArrayInternalV1$writeEntry(dataOutputStream, (String) entry.getKey(), entry.getValue());
                    }
                    dataOutputStream.flush();
                    if (dataOutputStream.size() > 10240) {
                        throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    dataOutputStream.close();
                    byteArray.getClass();
                    return byteArray;
                } finally {
                }
            } catch (IOException e) {
                str = Data_Kt.TAG;
                Logger.get().error(str, "Error in Data#toByteArray: ", e);
                return new byte[0];
            }
        }
    }

    public Data(Data data) {
        data.getClass();
        this.values = new HashMap(data.values);
    }

    public Data(Map<String, ?> map) {
        map.getClass();
        this.values = new HashMap(map);
    }

    public static final Data fromByteArray(byte[] bArr) {
        return Companion.fromByteArray(bArr);
    }

    private final <T> T getOrDefault(String str, T t) {
        this.values.get(str);
        jh2.a0();
        throw null;
    }

    private final <T, TArray> TArray getTypedArray(String str, ts0 ts0Var) {
        if (!(this.values.get(str) instanceof Object[])) {
            return null;
        }
        jh2.a0();
        throw null;
    }

    @hd0
    public static final byte[] toByteArrayInternalV0(Data data) {
        return Companion.toByteArrayInternalV0(data);
    }

    public static final byte[] toByteArrayInternalV1(Data data) {
        return Companion.toByteArrayInternalV1(data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence toString$lambda$7$lambda$6(Map.Entry entry) {
        entry.getClass();
        String str = (String) entry.getKey();
        Object value = entry.getValue();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" : ");
        if (value instanceof Object[]) {
            value = Arrays.toString((Object[]) value);
            value.getClass();
        }
        sb.append(value);
        return sb.toString();
    }

    public boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (obj == null || !Data.class.equals(obj.getClass())) {
            return false;
        }
        Data data = (Data) obj;
        Set<String> keySet = this.values.keySet();
        if (!jh2.k(keySet, data.values.keySet())) {
            return false;
        }
        for (String str : keySet) {
            Object obj2 = this.values.get(str);
            Object obj3 = data.values.get(str);
            if (obj2 == null || obj3 == null) {
                z = obj2 == obj3;
            } else {
                if (obj2 instanceof Object[]) {
                    Object[] objArr = (Object[]) obj2;
                    if (obj3 instanceof Object[]) {
                        z = wd.c0(objArr, (Object[]) obj3);
                    }
                }
                z = obj2.equals(obj3);
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public final boolean getBoolean(String str, boolean z) {
        str.getClass();
        Object valueOf = Boolean.valueOf(z);
        Object obj = this.values.get(str);
        if (obj instanceof Boolean) {
            valueOf = obj;
        }
        return ((Boolean) valueOf).booleanValue();
    }

    public final boolean[] getBooleanArray(String str) {
        str.getClass();
        final Object obj = this.values.get(str);
        if (!(obj instanceof Object[])) {
            return null;
        }
        int length = ((Object[]) obj).length;
        ps0 ps0Var = new ps0() { // from class: androidx.work.Data$getBooleanArray$$inlined$getTypedArray$1
            public final Boolean invoke(int i) {
                Object obj2 = ((Object[]) obj)[i];
                if (obj2 != null) {
                    return (Boolean) obj2;
                }
                hu2.q("null cannot be cast to non-null type kotlin.Boolean");
                return null;
            }

            @Override // defpackage.ps0
            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                return invoke(((Number) obj2).intValue());
            }
        };
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = ((Boolean) ps0Var.invoke(Integer.valueOf(i))).booleanValue();
        }
        return zArr;
    }

    public final byte getByte(String str, byte b) {
        str.getClass();
        Object valueOf = Byte.valueOf(b);
        Object obj = this.values.get(str);
        if (obj instanceof Byte) {
            valueOf = obj;
        }
        return ((Number) valueOf).byteValue();
    }

    public final byte[] getByteArray(String str) {
        str.getClass();
        final Object obj = this.values.get(str);
        if (!(obj instanceof Object[])) {
            return null;
        }
        int length = ((Object[]) obj).length;
        ps0 ps0Var = new ps0() { // from class: androidx.work.Data$getByteArray$$inlined$getTypedArray$1
            public final Byte invoke(int i) {
                Object obj2 = ((Object[]) obj)[i];
                if (obj2 != null) {
                    return (Byte) obj2;
                }
                hu2.q("null cannot be cast to non-null type kotlin.Byte");
                return null;
            }

            @Override // defpackage.ps0
            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                return invoke(((Number) obj2).intValue());
            }
        };
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = ((Number) ps0Var.invoke(Integer.valueOf(i))).byteValue();
        }
        return bArr;
    }

    public final double getDouble(String str, double d) {
        str.getClass();
        Object valueOf = Double.valueOf(d);
        Object obj = this.values.get(str);
        if (obj instanceof Double) {
            valueOf = obj;
        }
        return ((Number) valueOf).doubleValue();
    }

    public final double[] getDoubleArray(String str) {
        str.getClass();
        final Object obj = this.values.get(str);
        if (!(obj instanceof Object[])) {
            return null;
        }
        int length = ((Object[]) obj).length;
        ps0 ps0Var = new ps0() { // from class: androidx.work.Data$getDoubleArray$$inlined$getTypedArray$1
            public final Double invoke(int i) {
                Object obj2 = ((Object[]) obj)[i];
                if (obj2 != null) {
                    return (Double) obj2;
                }
                hu2.q("null cannot be cast to non-null type kotlin.Double");
                return null;
            }

            @Override // defpackage.ps0
            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                return invoke(((Number) obj2).intValue());
            }
        };
        double[] dArr = new double[length];
        for (int i = 0; i < length; i++) {
            dArr[i] = ((Number) ps0Var.invoke(Integer.valueOf(i))).doubleValue();
        }
        return dArr;
    }

    public final float getFloat(String str, float f) {
        str.getClass();
        Object valueOf = Float.valueOf(f);
        Object obj = this.values.get(str);
        if (obj instanceof Float) {
            valueOf = obj;
        }
        return ((Number) valueOf).floatValue();
    }

    public final float[] getFloatArray(String str) {
        str.getClass();
        final Object obj = this.values.get(str);
        if (!(obj instanceof Object[])) {
            return null;
        }
        int length = ((Object[]) obj).length;
        ps0 ps0Var = new ps0() { // from class: androidx.work.Data$getFloatArray$$inlined$getTypedArray$1
            public final Float invoke(int i) {
                Object obj2 = ((Object[]) obj)[i];
                if (obj2 != null) {
                    return (Float) obj2;
                }
                hu2.q("null cannot be cast to non-null type kotlin.Float");
                return null;
            }

            @Override // defpackage.ps0
            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                return invoke(((Number) obj2).intValue());
            }
        };
        float[] fArr = new float[length];
        for (int i = 0; i < length; i++) {
            fArr[i] = ((Number) ps0Var.invoke(Integer.valueOf(i))).floatValue();
        }
        return fArr;
    }

    public final int getInt(String str, int i) {
        str.getClass();
        Object valueOf = Integer.valueOf(i);
        Object obj = this.values.get(str);
        if (obj instanceof Integer) {
            valueOf = obj;
        }
        return ((Number) valueOf).intValue();
    }

    public final int[] getIntArray(String str) {
        str.getClass();
        final Object obj = this.values.get(str);
        if (!(obj instanceof Object[])) {
            return null;
        }
        int length = ((Object[]) obj).length;
        ps0 ps0Var = new ps0() { // from class: androidx.work.Data$getIntArray$$inlined$getTypedArray$1
            public final Integer invoke(int i) {
                Object obj2 = ((Object[]) obj)[i];
                if (obj2 != null) {
                    return (Integer) obj2;
                }
                hu2.q("null cannot be cast to non-null type kotlin.Int");
                return null;
            }

            @Override // defpackage.ps0
            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                return invoke(((Number) obj2).intValue());
            }
        };
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = ((Number) ps0Var.invoke(Integer.valueOf(i))).intValue();
        }
        return iArr;
    }

    public final Map<String, Object> getKeyValueMap() {
        Map<String, Object> unmodifiableMap = DesugarCollections.unmodifiableMap(this.values);
        unmodifiableMap.getClass();
        return unmodifiableMap;
    }

    public final long getLong(String str, long j) {
        str.getClass();
        Object valueOf = Long.valueOf(j);
        Object obj = this.values.get(str);
        if (obj instanceof Long) {
            valueOf = obj;
        }
        return ((Number) valueOf).longValue();
    }

    public final long[] getLongArray(String str) {
        str.getClass();
        final Object obj = this.values.get(str);
        if (!(obj instanceof Object[])) {
            return null;
        }
        int length = ((Object[]) obj).length;
        ps0 ps0Var = new ps0() { // from class: androidx.work.Data$getLongArray$$inlined$getTypedArray$1
            public final Long invoke(int i) {
                Object obj2 = ((Object[]) obj)[i];
                if (obj2 != null) {
                    return (Long) obj2;
                }
                hu2.q("null cannot be cast to non-null type kotlin.Long");
                return null;
            }

            @Override // defpackage.ps0
            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                return invoke(((Number) obj2).intValue());
            }
        };
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            jArr[i] = ((Number) ps0Var.invoke(Integer.valueOf(i))).longValue();
        }
        return jArr;
    }

    public final String getString(String str) {
        str.getClass();
        Object obj = this.values.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String[] getStringArray(String str) {
        str.getClass();
        final Object obj = this.values.get(str);
        if (!(obj instanceof Object[])) {
            return null;
        }
        int length = ((Object[]) obj).length;
        ps0 ps0Var = new ps0() { // from class: androidx.work.Data$getStringArray$$inlined$getTypedArray$1
            public final String invoke(int i) {
                Object obj2 = ((Object[]) obj)[i];
                if (obj2 != null) {
                    return (String) obj2;
                }
                hu2.q("null cannot be cast to non-null type kotlin.String");
                return null;
            }

            @Override // defpackage.ps0
            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                return invoke(((Number) obj2).intValue());
            }
        };
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = ps0Var.invoke(Integer.valueOf(i));
        }
        return strArr;
    }

    public final <T> boolean hasKey$work_runtime_release(String str) {
        str.getClass();
        jh2.a0();
        throw null;
    }

    public final <T> boolean hasKeyWithValueOfType(String str, Class<T> cls) {
        str.getClass();
        cls.getClass();
        Object obj = this.values.get(str);
        return obj != null && cls.isAssignableFrom(obj.getClass());
    }

    public int hashCode() {
        int i = 0;
        for (Map.Entry<String, Object> entry : this.values.entrySet()) {
            Object value = entry.getValue();
            i += value instanceof Object[] ? Objects.hashCode(entry.getKey()) ^ Arrays.deepHashCode((Object[]) value) : entry.hashCode();
        }
        return i * 31;
    }

    public final int size() {
        return this.values.size();
    }

    public final byte[] toByteArray() {
        return Companion.toByteArrayInternalV1(this);
    }

    public String toString() {
        return wa2.v(new StringBuilder("Data {"), kw.w0(this.values.entrySet(), null, null, null, new cq(28), 31), "}");
    }
}
