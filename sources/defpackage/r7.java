package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.database.sqlite.SQLiteDatabase;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class r7 implements Parcelable {
    public static Parcelable.Creator<r7> CREATOR = new sm3(1);
    public String A;
    public long B;
    public String C;
    public int D;
    public zx1 E;
    public boolean F;
    public long G;
    public int H;
    public ArrayList J;
    public ArrayList K;
    public boolean L;
    public String b;
    public String m;
    public String o;
    public String p;
    public int r;
    public int s;
    public int t;
    public int u;
    public String v;
    public int w;
    public long x;
    public long y;
    public int z;
    public long a = -1;
    public long n = -1;
    public q7 q = q7.b;
    public int I = -1;

    /* JADX WARN: Type inference failed for: r0v0, types: [cn0, java.lang.Object] */
    public static void a(String str, ArrayList arrayList, z90 z90Var, r7 r7Var, ArrayList arrayList2) {
        arrayList2.getClass();
        ?? obj = new Object();
        obj.b = new File(str).length();
        obj.c = str;
        Iterator it = arrayList.iterator();
        int i = -1;
        int i2 = 0;
        while (it.hasNext()) {
            int i3 = i2 + 1;
            cn0 cn0Var = (cn0) it.next();
            if (bn2.d0(cn0Var.c, obj.c, false) && cn0Var.b == obj.b) {
                String str2 = cn0Var.a;
                if (str2 != null) {
                    obj.a = str2;
                }
                i = i2;
            }
            i2 = i3;
        }
        if (i != -1) {
            arrayList.remove(i);
            arrayList2.add(obj);
            return;
        }
        long j = r7Var.a;
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", String.valueOf(j));
        contentValues.put("sha256", obj.a);
        contentValues.put("size", String.valueOf(obj.b));
        contentValues.put("path", obj.c);
        SQLiteDatabase sQLiteDatabase = z90Var.a;
        sQLiteDatabase.getClass();
        if (sQLiteDatabase.insert("app_files", null, contentValues) >= 0) {
            arrayList2.add(obj);
        }
    }

    public final boolean b(Context context) {
        context.getClass();
        if (this.m == null) {
            return false;
        }
        if (d()) {
            try {
                SharedPreferences sharedPreferences = context.getSharedPreferences("SettingsPreferences", 0);
                if (sharedPreferences.contains("show_system_services")) {
                    return sharedPreferences.getBoolean("show_system_services", false);
                }
                return false;
            } catch (Exception unused) {
                return false;
            }
        }
        if (!c()) {
            return true;
        }
        try {
            SharedPreferences sharedPreferences2 = context.getSharedPreferences("SettingsPreferences", 0);
            if (sharedPreferences2.contains("show_system_apps")) {
                return sharedPreferences2.getBoolean("show_system_apps", false);
            }
            return false;
        } catch (Exception unused2) {
            return false;
        }
    }

    public final boolean c() {
        return this.r == 1;
    }

    public final boolean d() {
        return this.s == 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return hashCode();
    }

    public final void e(z90 z90Var) {
        this.K = new ArrayList();
        String str = this.m;
        str.getClass();
        ArrayList F = dn3.F(str);
        if (F.isEmpty()) {
            return;
        }
        String str2 = this.m;
        str2.getClass();
        r7 B = z90Var.B(str2);
        if (B != null) {
            ArrayList C = z90Var.C(B.a);
            Iterator it = F.iterator();
            it.getClass();
            while (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                File file = (File) next;
                if (file.isFile()) {
                    String name = file.getName();
                    name.getClass();
                    if (bn2.b0(name, ".obb", false)) {
                        String absolutePath = file.getAbsolutePath();
                        absolutePath.getClass();
                        ArrayList arrayList = this.K;
                        arrayList.getClass();
                        a(absolutePath, C, z90Var, B, arrayList);
                    }
                }
            }
        }
    }

    public final void f(ApplicationInfo applicationInfo, z90 z90Var) {
        applicationInfo.getClass();
        this.J = new ArrayList();
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr != null) {
            String str = this.m;
            str.getClass();
            r7 B = z90Var.B(str);
            if (B != null) {
                ArrayList C = z90Var.C(B.a);
                int i = 0;
                while (i < strArr.length) {
                    int i2 = i + 1;
                    try {
                        String str2 = strArr[i];
                        str2.getClass();
                        if (bn2.b0(str2, ".apk", false)) {
                            ArrayList arrayList = this.J;
                            arrayList.getClass();
                            a(str2, C, z90Var, B, arrayList);
                        }
                        i = i2;
                    } catch (ArrayIndexOutOfBoundsException e) {
                        hu2.n(e.getMessage());
                        return;
                    }
                }
                if (C.isEmpty()) {
                    return;
                }
                Iterator it = C.iterator();
                it.getClass();
                while (it.hasNext()) {
                    Object next = it.next();
                    next.getClass();
                    z90Var.l((cn0) next);
                }
            }
        }
    }

    public final void g(boolean z, boolean z2) {
        if (c()) {
            if (z) {
                this.z = 0;
            } else {
                this.z = 1;
            }
        }
        if (d()) {
            if (z2) {
                this.z = 0;
            } else {
                this.z = 1;
            }
        }
    }

    public final String toString() {
        return "{id='" + this.a + "', name='" + this.b + "', packagename='" + this.m + "', versionCode=" + this.n + ", versionName='" + this.o + "', urlFicha='" + this.p + "', status=" + this.q + ", isSystemApp=" + this.r + ", isSystemService=" + this.s + ", minSdkVersion=" + this.t + ", targetSdkVersion=" + this.u + ", md5signature='" + this.v + "', exclude=" + this.w + ", size=" + this.x + ", lastUpdateTime=" + this.y + ", excludeFromTracking=" + this.z + ", defaultName='" + this.A + "', firstInstallTime=" + this.B + ", sha256='" + this.C + "', appID=" + this.G + ", hasOldVersions=" + this.H + ", trackInfoRegistered=" + this.I + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.m);
        parcel.writeLong(this.n);
        parcel.writeString(this.o);
        parcel.writeString(this.p);
        int ordinal = this.q.ordinal();
        if (ordinal == 0) {
            parcel.writeInt(0);
        } else if (ordinal != 1) {
            parcel.writeInt(2);
        } else {
            parcel.writeInt(1);
        }
        parcel.writeInt(this.r);
        parcel.writeInt(this.s);
        parcel.writeInt(this.t);
        parcel.writeInt(this.u);
        parcel.writeString(this.v);
        parcel.writeInt(this.w);
        parcel.writeLong(this.x);
        parcel.writeLong(this.y);
        parcel.writeInt(this.z);
        parcel.writeString(this.A);
        parcel.writeLong(this.B);
        parcel.writeString(this.C);
        parcel.writeInt(this.D);
        parcel.writeLong(this.G);
        parcel.writeInt(this.H);
        parcel.writeInt(this.L ? 1 : 0);
    }
}
