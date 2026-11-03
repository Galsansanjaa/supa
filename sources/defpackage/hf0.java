package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import com.uptodown.activities.MyDownloads;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class hf0 implements Parcelable {
    public static Parcelable.Creator<hf0> CREATOR = new sm3(19);
    public int B;
    public int C;
    public Drawable F;
    public String b;
    public int m;
    public String p;
    public int q;
    public int s;
    public String t;
    public String u;
    public int v;
    public String w;
    public String x;
    public long y;
    public ArrayList z;
    public int a = -1;
    public int n = 1;
    public long o = -1;
    public long r = -1;
    public long A = -1;
    public long D = -1;
    public long E = -1;
    public ArrayList G = new ArrayList();

    public final void a(cc ccVar) {
        ccVar.getClass();
        this.b = ccVar.F;
        this.r = ccVar.a;
        this.x = ccVar.b;
        if (this.t == null) {
            this.t = ccVar.M;
        }
        if (ccVar.E0.isEmpty()) {
            gg0 gg0Var = new gg0();
            if (gg0Var.q == null) {
                gg0Var.q = ccVar.P;
            }
            gg0Var.m = ccVar.J;
            String str = ccVar.q;
            if (str != null && str.length() != 0) {
                try {
                    String str2 = ccVar.q;
                    str2.getClass();
                    gg0Var.o = Long.parseLong(str2);
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
            ArrayList arrayList = new ArrayList();
            this.G = arrayList;
            arrayList.add(gg0Var);
        } else {
            this.G = ccVar.E0;
        }
        this.w = ccVar.h();
        this.z = ccVar.S;
        if (!kx.A) {
            this.s = 1;
        }
        if (this.o <= 0) {
            long j = ccVar.K;
            if (j > 0) {
                this.o = j;
            } else {
                long j2 = ccVar.n;
                if (j2 > 0) {
                    this.o = j2;
                }
            }
        }
        this.p = ccVar.m;
        this.u = null;
        ArrayList arrayList2 = ccVar.T;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            ArrayList arrayList3 = ccVar.T;
            arrayList3.getClass();
            int size = arrayList3.size();
            for (int i = 0; i < size; i++) {
                String str3 = this.u;
                ArrayList arrayList4 = ccVar.T;
                if (str3 == null) {
                    arrayList4.getClass();
                    this.u = (String) arrayList4.get(i);
                } else {
                    arrayList4.getClass();
                    this.u = String.format("%s,%s", Arrays.copyOf(new Object[]{str3, arrayList4.get(i)}, 2));
                }
            }
        }
        String str4 = ccVar.I;
        if (str4 != null) {
            try {
                this.v = Integer.parseInt(str4);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public final void b(cc ccVar, ms1 ms1Var) {
        ccVar.getClass();
        ms1Var.getClass();
        this.b = ccVar.F;
        this.r = ccVar.a;
        this.x = ccVar.b;
        this.w = ccVar.u;
        this.t = ccVar.M;
        this.o = ms1Var.n;
        this.p = ms1Var.a;
        this.C = 1;
        if (!bn2.d0(ms1Var.p, "apk", true)) {
            this.G = ms1Var.s;
            return;
        }
        this.G = new ArrayList();
        gg0 gg0Var = new gg0();
        String str = ms1Var.q;
        str.getClass();
        gg0Var.m = Long.parseLong(str);
        gg0Var.o = ms1Var.b;
        this.G.add(gg0Var);
    }

    public final boolean c() {
        return this.n == 0;
    }

    public final void d(Context context) {
        File externalFilesDir;
        File externalFilesDir2;
        context.getClass();
        if (!this.G.isEmpty()) {
            Iterator it = this.G.iterator();
            it.getClass();
            File file = null;
            while (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                gg0 gg0Var = (gg0) next;
                String str = gg0Var.r;
                if (str != null) {
                    try {
                        File file2 = new File(str);
                        if (file2.exists()) {
                            file2.delete();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                String str2 = gg0Var.r;
                if (str2 != null && str2.length() != 0 && file == null) {
                    String str3 = gg0Var.r;
                    str3.getClass();
                    file = new File(str3).getParentFile();
                }
            }
            if ((file != null ? file.getAbsolutePath() : null) != null && file.exists() && file.isDirectory()) {
                String[] list = file.list();
                if (list == null || list.length == 0) {
                    file.delete();
                    return;
                }
                return;
            }
            return;
        }
        if (n()) {
            r10 r10Var = new r10(context);
            if (r10Var.d()) {
                File[] externalFilesDirs = context.getExternalFilesDirs(null);
                if (externalFilesDirs.length > 1) {
                    externalFilesDir = externalFilesDirs[1];
                } else {
                    externalFilesDir = context.getExternalFilesDir(null);
                    r10Var.g();
                    r10Var.f();
                }
            } else {
                externalFilesDir = context.getExternalFilesDir(null);
            }
            File file3 = new File(externalFilesDir, "Apps");
            if (!file3.exists()) {
                file3.mkdirs();
            }
            File file4 = new File(file3, this.b + this.o);
            if (file4.exists() && file4.isDirectory()) {
                file4.delete();
                return;
            }
            return;
        }
        r10 r10Var2 = new r10(context);
        if (r10Var2.d()) {
            File[] externalFilesDirs2 = context.getExternalFilesDirs(null);
            if (externalFilesDirs2.length > 1) {
                externalFilesDir2 = externalFilesDirs2[1];
            } else {
                externalFilesDir2 = context.getExternalFilesDir(null);
                r10Var2.g();
                r10Var2.f();
            }
        } else {
            externalFilesDir2 = context.getExternalFilesDir(null);
        }
        File file5 = new File(externalFilesDir2, "Updates");
        if (!file5.exists()) {
            file5.mkdirs();
        }
        File file6 = new File(file5, this.b + this.o);
        if (file6.exists() && file6.isDirectory()) {
            file6.delete();
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return hashCode();
    }

    public final File e() {
        String str = !this.G.isEmpty() ? ((gg0) this.G.get(0)).r : null;
        if (str == null) {
            return null;
        }
        File file = new File(str);
        if (file.exists()) {
            return file;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hf0)) {
            return false;
        }
        hf0 hf0Var = (hf0) obj;
        return jh2.k(this.b, hf0Var.b) && this.o == hf0Var.o;
    }

    public final File f() {
        if (this.G.size() == 1 && ((gg0) this.G.get(0)).r != null) {
            String str = ((gg0) this.G.get(0)).r;
            str.getClass();
            return new File(str);
        }
        if (this.G.size() <= 1 || ((gg0) this.G.get(0)).r == null) {
            return null;
        }
        String str2 = ((gg0) this.G.get(0)).r;
        str2.getClass();
        return new File(str2).getParentFile();
    }

    public final void g(MyDownloads myDownloads, File file) {
        if (this.b != null) {
            long j = this.o;
            if (j > 0) {
                this.D = j;
                o(myDownloads);
                return;
            }
            String name = file.getName();
            name.getClass();
            if (bn2.b0(name, ".apk", false)) {
                try {
                    PackageManager packageManager = myDownloads.getPackageManager();
                    packageManager.getClass();
                    String absolutePath = file.getAbsolutePath();
                    absolutePath.getClass();
                    PackageInfo h = zu0.h(packageManager, absolutePath, 128);
                    if (h != null) {
                        this.D = ow0.e(h);
                    }
                    if (h == null || !bn2.d0(this.b, h.packageName, false)) {
                        return;
                    }
                    o(myDownloads);
                } catch (Exception unused) {
                }
            }
        }
    }

    public final int h() {
        long j;
        long j2;
        if (this.G.isEmpty()) {
            j = 0;
            j2 = 0;
        } else {
            Iterator it = this.G.iterator();
            it.getClass();
            j = 0;
            j2 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                gg0 gg0Var = (gg0) next;
                j += gg0Var.o;
                j2 += gg0Var.p;
            }
        }
        if (j2 <= 0 || j <= 0) {
            return 0;
        }
        return (int) ((j2 * 100.0d) / j);
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = str != null ? str.hashCode() : 0;
        long j = this.o;
        return (hashCode * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final long i() {
        long j = 0;
        if (!this.G.isEmpty()) {
            Iterator it = this.G.iterator();
            it.getClass();
            while (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                j += ((gg0) next).p;
            }
        }
        return j;
    }

    public final long j() {
        long j = 0;
        if (!this.G.isEmpty()) {
            Iterator it = this.G.iterator();
            it.getClass();
            while (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                j += ((gg0) next).o;
            }
        }
        return j;
    }

    public final void k(Context context) {
        context.getClass();
        z90 r = z90.E.r(context);
        r.a();
        this.q++;
        this.y = System.currentTimeMillis() + 1800000;
        r.n(this);
        if (this.q >= 4) {
            r(context);
        } else {
            r.b0(this);
        }
        r.d();
    }

    public final boolean l() {
        return this.b != null && n() && !c() && this.t != null && this.o > 0 && this.q < 4 && System.currentTimeMillis() > this.y;
    }

    public final boolean m() {
        String str;
        p41 p41Var = (p41) m41.a.getValue();
        hf0 hf0Var = p41Var instanceof o41 ? ((o41) p41Var).a : null;
        return this.o > 0 && (str = this.b) != null && hf0Var != null && bn2.d0(hf0Var.b, str, true) && hf0Var.o == this.o;
    }

    public final boolean n() {
        return this.A == -1;
    }

    public final void o(MyDownloads myDownloads) {
        PackageInfo packageInfo;
        try {
            PackageManager packageManager = myDownloads.getPackageManager();
            if (packageManager != null) {
                String str = this.b;
                str.getClass();
                packageInfo = zu0.i(packageManager, str, 0);
            } else {
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.E = ow0.e(packageInfo);
            }
        } catch (Exception unused) {
        }
    }

    public final int p(Context context) {
        context.getClass();
        z90 r = z90.E.r(context);
        r.a();
        String str = this.b;
        str.getClass();
        hf0 K = r.K(this.o, str);
        if (K == null) {
            r.b0(this);
        } else {
            this = K;
        }
        r.d();
        return this.a;
    }

    public final void q(Context context) {
        z90 r = z90.E.r(context);
        r.a();
        r.n(this);
        r.d();
    }

    public final void r(Context context) {
        File file;
        context.getClass();
        z90 r = z90.E.r(context);
        r.a();
        this.n = 1;
        r.q0(this);
        if (this.G.isEmpty()) {
            file = null;
        } else {
            Iterator it = this.G.iterator();
            it.getClass();
            file = null;
            while (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                gg0 gg0Var = (gg0) next;
                String str = gg0Var.r;
                if (str != null) {
                    try {
                        File file2 = new File(str);
                        if (file2.exists()) {
                            file2.delete();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                String str2 = gg0Var.r;
                if (str2 != null && str2.length() != 0 && file == null) {
                    String str3 = gg0Var.r;
                    str3.getClass();
                    file = new File(str3).getParentFile();
                }
                if (this.A > 0) {
                    gg0Var.p = 0L;
                    gg0Var.s = 0;
                    gg0Var.t = 0L;
                    r.r0(gg0Var);
                }
            }
        }
        r.d();
        if ((file != null ? file.getAbsolutePath() : null) != null && file.exists() && file.isDirectory()) {
            String[] list = file.list();
            if (list == null || list.length == 0) {
                file.delete();
            }
        }
    }

    public final String toString() {
        int i = this.a;
        String str = this.b;
        int i2 = this.m;
        int i3 = this.n;
        long j = this.o;
        String str2 = this.p;
        int i4 = this.q;
        long j2 = this.r;
        int i5 = this.s;
        String str3 = this.t;
        String str4 = this.u;
        int i6 = this.v;
        String str5 = this.w;
        String str6 = this.x;
        long j3 = this.D;
        long j4 = this.E;
        long j5 = this.y;
        long j6 = this.A;
        int i7 = this.B;
        int i8 = this.C;
        ArrayList arrayList = this.G;
        StringBuilder sb = new StringBuilder("{id='");
        sb.append(i);
        sb.append("', packagename='");
        sb.append(str);
        sb.append("', checkedByUser=");
        sb.append(i2);
        sb.append(", incomplete=");
        sb.append(i3);
        sb.append(", versioncode='");
        sb.append(j);
        sb.append("', versionname='");
        sb.append(str2);
        sb.append("', attempts=");
        sb.append(i4);
        sb.append(", appId=");
        sb.append(j2);
        sb.append(", downloadAnyway=");
        sb.append(i5);
        lt.L(sb, ", md5signature='", str3, "', supportedAbis='", str4);
        sb.append("', minsdk=");
        sb.append(i6);
        sb.append(", urlIcon='");
        sb.append(str5);
        sb.append("', appName='");
        sb.append(str6);
        sb.append("', versioncodeFile=");
        sb.append(j3);
        sb.append(", versioncodeInstalled=");
        sb.append(j4);
        sb.append(", nextAttemptTimeStamp=");
        sb.append(j5);
        sb.append(", updateId=");
        sb.append(j6);
        sb.append(", isDeepLink=");
        sb.append(i7);
        sb.append(", isRollback=");
        sb.append(i8);
        sb.append(", files=");
        sb.append(arrayList);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.m);
        parcel.writeInt(this.n);
        parcel.writeLong(this.o);
        parcel.writeString(this.p);
        parcel.writeInt(this.q);
        parcel.writeLong(this.r);
        parcel.writeInt(this.s);
        parcel.writeString(this.t);
        parcel.writeString(this.u);
        parcel.writeInt(this.v);
        parcel.writeString(this.w);
        parcel.writeString(this.x);
        parcel.writeLong(this.y);
        parcel.writeStringList(this.z);
        parcel.writeTypedList(this.G);
        parcel.writeLong(this.A);
        parcel.writeInt(this.B);
        parcel.writeInt(this.C);
    }
}
