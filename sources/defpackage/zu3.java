package defpackage;

import android.os.Bundle;
import j$.util.Objects;
import java.util.EnumMap;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class zu3 {
    public static final zu3 f = new zu3((Boolean) null, 100, (Boolean) null, (String) null);
    public final int a;
    public final String b;
    public final Boolean c;
    public final String d;
    public final EnumMap e;

    public zu3(Boolean bool, int i, Boolean bool2, String str) {
        EnumMap enumMap = new EnumMap(a54.class);
        this.e = enumMap;
        enumMap.put((EnumMap) a54.AD_USER_DATA, (a54) (bool == null ? x44.UNINITIALIZED : bool.booleanValue() ? x44.GRANTED : x44.DENIED));
        this.a = i;
        this.b = d();
        this.c = bool2;
        this.d = str;
    }

    public zu3(EnumMap enumMap, int i, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(a54.class);
        this.e = enumMap2;
        enumMap2.putAll(enumMap);
        this.a = i;
        this.b = d();
        this.c = bool;
        this.d = str;
    }

    public static zu3 b(String str) {
        if (str == null || str.length() <= 0) {
            return f;
        }
        String[] split = str.split(":");
        int parseInt = Integer.parseInt(split[0]);
        EnumMap enumMap = new EnumMap(a54.class);
        a54[] a54VarArr = y44.DMA.a;
        int length = a54VarArr.length;
        int i = 1;
        int i2 = 0;
        while (i2 < length) {
            enumMap.put((EnumMap) a54VarArr[i2], (a54) b54.e(split[i].charAt(0)));
            i2++;
            i++;
        }
        return new zu3(enumMap, parseInt, (Boolean) null, (String) null);
    }

    public static zu3 c(int i, Bundle bundle) {
        if (bundle == null) {
            return new zu3((Boolean) null, i, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(a54.class);
        for (a54 a54Var : y44.DMA.a) {
            enumMap.put((EnumMap) a54Var, (a54) b54.d(bundle.getString(a54Var.a)));
        }
        return new zu3(enumMap, i, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    public final x44 a() {
        x44 x44Var = (x44) this.e.get(a54.AD_USER_DATA);
        return x44Var == null ? x44.UNINITIALIZED : x44Var;
    }

    public final String d() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        for (a54 a54Var : y44.DMA.a) {
            sb.append(":");
            sb.append(b54.h((x44) this.e.get(a54Var)));
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zu3)) {
            return false;
        }
        zu3 zu3Var = (zu3) obj;
        if (this.b.equalsIgnoreCase(zu3Var.b) && Objects.equals(this.c, zu3Var.c)) {
            return Objects.equals(this.d, zu3Var.d);
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = this.c;
        int i = bool == null ? 3 : true != bool.booleanValue() ? 13 : 7;
        String str = this.d;
        return ((str == null ? 17 : str.hashCode()) * 137) + this.b.hashCode() + (i * 29);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(b54.a(this.a));
        for (a54 a54Var : y44.DMA.a) {
            sb.append(",");
            sb.append(a54Var.a);
            sb.append("=");
            x44 x44Var = (x44) this.e.get(a54Var);
            if (x44Var == null) {
                sb.append("uninitialized");
            } else {
                int ordinal = x44Var.ordinal();
                if (ordinal == 0) {
                    sb.append("uninitialized");
                } else if (ordinal == 1) {
                    sb.append("eu_consent_policy");
                } else if (ordinal == 2) {
                    sb.append("denied");
                } else if (ordinal == 3) {
                    sb.append("granted");
                }
            }
        }
        Boolean bool = this.c;
        if (bool != null) {
            sb.append(",isDmaRegion=");
            sb.append(bool);
        }
        String str = this.d;
        if (str != null) {
            sb.append(",cpsDisplayStr=");
            sb.append(str);
        }
        return sb.toString();
    }
}
