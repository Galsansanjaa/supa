package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.autofill.HintConstants;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.uptodown.UptodownApp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class cc implements Parcelable {
    public static Parcelable.Creator<cc> CREATOR = new sm3(2);
    public int A;
    public int A0;
    public int B;
    public int B0;
    public int C;
    public ArrayList C0;
    public int D;
    public transient ArrayList D0;
    public int E;
    public ArrayList E0;
    public String F;
    public r32 F0;
    public nt G;
    public String G0;
    public int H;
    public int H0;
    public String I;
    public String I0;
    public long J;
    public we0 J0;
    public long K;
    public int K0;
    public int L;
    public int L0;
    public String M;
    public String M0;
    public String N;
    public String O;
    public String P;
    public String Q;
    public String R;
    public ArrayList S;
    public ArrayList T;
    public ArrayList U;
    public String V;
    public String W;
    public ArrayList X;
    public ArrayList Y;
    public j72 Z;
    public long a;
    public String a0;
    public String b;
    public String b0;
    public String c0;
    public int d0;
    public ArrayList e0;
    public String f0;
    public String g0;
    public String h0;
    public String i0;
    public String j0;
    public long k0;
    public String l0;
    public String m;
    public String m0;
    public long n;
    public String n0;
    public String o;
    public int o0;
    public String p;
    public String p0;
    public String q;
    public int q0;
    public int r;
    public String r0;
    public int s;
    public bc s0;
    public String t;
    public HashMap t0;
    public String u;
    public int u0;
    public String v;
    public String v0;
    public String w;
    public int w0;
    public String x;
    public boolean x0;
    public int y;
    public int y0;
    public int z;
    public boolean z0;

    public cc() {
        this.n = -1L;
        this.J = -1L;
        this.K = -1L;
        this.s0 = bc.p;
        this.t0 = new HashMap();
        this.E0 = new ArrayList();
        this.H0 = 1;
    }

    public cc(Parcel parcel) {
        this.n = -1L;
        this.J = -1L;
        this.K = -1L;
        this.s0 = bc.p;
        this.t0 = new HashMap();
        this.E0 = new ArrayList();
        this.H0 = 1;
        this.a = parcel.readLong();
        this.b = parcel.readString();
        this.m = parcel.readString();
        this.n = parcel.readLong();
        this.o = parcel.readString();
        this.p = parcel.readString();
        this.q = parcel.readString();
        this.r = parcel.readInt();
        this.s = parcel.readInt();
        this.t = parcel.readString();
        this.u = parcel.readString();
        this.v = parcel.readString();
        this.w = parcel.readString();
        this.x = parcel.readString();
        this.y = parcel.readInt();
        this.z = parcel.readInt();
        this.A = parcel.readInt();
        this.B = parcel.readInt();
        this.C = parcel.readInt();
        this.D = parcel.readInt();
        this.E = parcel.readInt();
        this.F = parcel.readString();
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            this.G = (nt) parcel.readParcelable(nt.class.getClassLoader(), nt.class);
        } else {
            this.G = (nt) parcel.readParcelable(nt.class.getClassLoader());
        }
        this.H = parcel.readInt();
        this.I = parcel.readString();
        this.M = parcel.readString();
        this.N = parcel.readString();
        this.J = parcel.readLong();
        this.L = parcel.readInt();
        this.P = parcel.readString();
        this.Q = parcel.readString();
        this.R = parcel.readString();
        this.S = parcel.createStringArrayList();
        this.T = parcel.createStringArrayList();
        this.U = parcel.createStringArrayList();
        this.V = parcel.readString();
        this.W = parcel.readString();
        this.O = parcel.readString();
        this.d0 = parcel.readInt();
        this.g0 = parcel.readString();
        HashMap readHashMap = parcel.readHashMap(ClassLoader.getSystemClassLoader());
        readHashMap.getClass();
        this.t0 = readHashMap;
        this.h0 = parcel.readString();
        this.i0 = parcel.readString();
        this.j0 = parcel.readString();
        this.k0 = parcel.readLong();
        this.l0 = parcel.readString();
        this.o0 = parcel.readInt();
        this.e0 = parcel.createStringArrayList();
        this.c0 = parcel.readString();
        this.a0 = parcel.readString();
        this.b0 = parcel.readString();
        this.m0 = parcel.readString();
        this.n0 = parcel.readString();
        this.p0 = parcel.readString();
        this.q0 = parcel.readInt();
        this.y0 = parcel.readInt();
        this.A0 = parcel.readInt();
        this.C0 = parcel.createStringArrayList();
        this.B0 = parcel.readInt();
        this.u0 = parcel.readInt();
        this.v0 = parcel.readString();
        this.w0 = parcel.readInt();
        parcel.readTypedList(this.E0, gg0.CREATOR);
        if (i >= 34) {
            this.F0 = (r32) parcel.readParcelable(r32.class.getClassLoader(), r32.class);
        } else {
            this.F0 = (r32) parcel.readParcelable(r32.class.getClassLoader());
        }
        this.G0 = parcel.readString();
        this.H0 = parcel.readInt();
        this.I0 = parcel.readString();
        if (i >= 34) {
            this.J0 = (we0) parcel.readParcelable(we0.class.getClassLoader(), we0.class);
        } else {
            this.J0 = (we0) parcel.readParcelable(we0.class.getClassLoader());
        }
        this.K0 = parcel.readInt();
        this.L0 = parcel.readInt();
        this.M0 = parcel.readString();
    }

    public static long c(w72 w72Var) {
        JSONObject jSONObject;
        try {
            if (w72Var.b() || (jSONObject = w72Var.d) == null) {
                return 0L;
            }
            int optInt = !jSONObject.isNull("success") ? jSONObject.optInt("success") : 0;
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optInt != 1 || optJSONObject == null || optJSONObject.isNull("appID")) {
                return 0L;
            }
            return optJSONObject.optLong("appID");
        } catch (JSONException e) {
            e.printStackTrace();
            return -1L;
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [xb2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [d73, java.lang.Object] */
    public final void a(Context context, JSONObject jSONObject) {
        if (jSONObject.has("app")) {
            JSONObject optJSONObject = jSONObject.optJSONObject("app");
            if (optJSONObject != null) {
                o(context, optJSONObject);
            }
        } else {
            o(context, jSONObject);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("videos");
        if (optJSONArray != null) {
            this.Y = new ArrayList();
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                if (optJSONArray.get(i) instanceof JSONObject) {
                    Object obj = optJSONArray.get(i);
                    obj.getClass();
                    JSONObject jSONObject2 = (JSONObject) obj;
                    ?? obj2 = new Object();
                    if (!jSONObject2.isNull("youtubeID")) {
                        obj2.a = jSONObject2.optString("youtubeID");
                    }
                    if (!jSONObject2.isNull("image")) {
                        obj2.b = jSONObject2.optString("image");
                    }
                    ArrayList arrayList = this.Y;
                    arrayList.getClass();
                    arrayList.add(obj2);
                }
            }
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("screenshots");
        if (optJSONArray2 != null) {
            this.X = new ArrayList();
            int length2 = optJSONArray2.length();
            for (int i2 = 0; i2 < length2; i2++) {
                if (optJSONArray2.get(i2) instanceof JSONObject) {
                    Object obj3 = optJSONArray2.get(i2);
                    obj3.getClass();
                    JSONObject jSONObject3 = (JSONObject) obj3;
                    ?? obj4 = new Object();
                    if (!jSONObject3.isNull("screenshotURL")) {
                        obj4.a = jSONObject3.optString("screenshotURL");
                    }
                    if (!jSONObject3.isNull("isVertical")) {
                        obj4.n = jSONObject3.optInt("isVertical");
                    }
                    ArrayList arrayList2 = this.X;
                    if (arrayList2 != null) {
                        arrayList2.add(obj4);
                    }
                }
            }
        }
    }

    public final boolean b() {
        return (n() || jh2.k(this.W, "ExternalDownload") || this.o0 <= 1 || jh2.k(this.W, "AppNotAvailableInThisCountry") || l()) ? false : true;
    }

    public final String d() {
        String str = this.v;
        if (str == null) {
            return null;
        }
        e13 e13Var = UptodownApp.J;
        int i = UptodownApp.W;
        if (i <= 0) {
            return e();
        }
        return str + ":" + i + ":webp";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return hashCode();
    }

    public final String e() {
        String str = this.v;
        if (str == null) {
            return null;
        }
        e13 e13Var = UptodownApp.J;
        return wa2.s(str, UptodownApp.N, ":webp");
    }

    public final String f() {
        String str = this.v;
        if (str == null) {
            return null;
        }
        e13 e13Var = UptodownApp.J;
        return wa2.s(str, UptodownApp.P, ":webp");
    }

    public final String g(int i) {
        if (this.u == null) {
            return null;
        }
        return wa2.s(this.u, lt.w(i, ":"), ":webp");
    }

    public final String h() {
        String str = this.u;
        if (str == null) {
            return null;
        }
        e13 e13Var = UptodownApp.J;
        return wa2.s(str, UptodownApp.M, ":webp");
    }

    public final String i() {
        String str = this.u;
        if (str == null) {
            return null;
        }
        e13 e13Var = UptodownApp.J;
        return wa2.s(str, UptodownApp.L, ":webp");
    }

    public final boolean j() {
        return this.J >= 0;
    }

    public final boolean k() {
        String str = this.W;
        return (str == null || str.equals("PreRegister") || str.equals("Discontinued") || str.equals("ExternalDownload") || str.equals("ReadingMode") || str.equals("AppNotAvailableInThisCountry")) ? false : true;
    }

    public final boolean l() {
        return jh2.k(this.W, "PreRegister");
    }

    public final boolean m() {
        return this.u0 == 1;
    }

    public final boolean n() {
        return jh2.k(this.W, "ReadingMode");
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [we0, java.lang.Object] */
    public final void o(Context context, JSONObject jSONObject) {
        JSONObject optJSONObject;
        ArrayList arrayList;
        if (!jSONObject.isNull("appID")) {
            this.a = jSONObject.optLong("appID");
        } else if (!jSONObject.isNull("id")) {
            this.a = jSONObject.optLong("id");
        }
        if (!jSONObject.isNull(HintConstants.AUTOFILL_HINT_NAME)) {
            this.b = jSONObject.optString(HintConstants.AUTOFILL_HINT_NAME);
        }
        if (!jSONObject.isNull("lastVersionCode")) {
            this.n = jSONObject.optLong("lastVersionCode");
        }
        if (!jSONObject.isNull("shortDescription")) {
            this.p = jSONObject.optString("shortDescription");
        }
        if (!jSONObject.isNull("iconURL")) {
            this.u = jSONObject.optString("iconURL");
        } else if (!jSONObject.isNull("icon")) {
            this.u = jSONObject.optString("icon");
        }
        if (!jSONObject.isNull("feature")) {
            this.v = jSONObject.optString("feature");
        } else if (!jSONObject.isNull("imageURL")) {
            this.v = jSONObject.optString("imageURL");
        } else if (!jSONObject.isNull("featuredImageURL")) {
            this.v = jSONObject.optString("featuredImageURL");
        }
        if (!jSONObject.isNull("author")) {
            this.w = jSONObject.optString("author");
        } else if (!jSONObject.isNull("authorName")) {
            this.w = jSONObject.optString("authorName");
        }
        if (!jSONObject.isNull("size")) {
            this.q = jSONObject.optString("size");
        }
        if (!jSONObject.isNull("downloads")) {
            this.r = jSONObject.optInt("downloads");
        }
        if (!jSONObject.isNull("weeklyDownloads")) {
            this.s = jSONObject.optInt("weeklyDownloads");
        }
        if (!jSONObject.isNull("lastUpdate")) {
            this.t = jSONObject.optString("lastUpdate");
        }
        if (!jSONObject.isNull("urlShare")) {
            this.o = jSONObject.optString("urlShare");
        } else if (!jSONObject.isNull("url")) {
            this.o = jSONObject.optString("url");
        }
        int i = 0;
        if (!jSONObject.isNull("description")) {
            String optString = jSONObject.optString("description");
            optString.getClass();
            this.x = bn2.g0(optString, "\n", "<br />", false);
        }
        if (!jSONObject.isNull("rating")) {
            this.y = jSONObject.optInt("rating");
        }
        if (!jSONObject.isNull("ratingCount")) {
            this.z = jSONObject.optInt("ratingCount");
        }
        if (!jSONObject.isNull("ratingCount1")) {
            this.A = jSONObject.optInt("ratingCount1");
        }
        if (!jSONObject.isNull("ratingCount2")) {
            this.B = jSONObject.optInt("ratingCount2");
        }
        if (!jSONObject.isNull("ratingCount3")) {
            this.C = jSONObject.optInt("ratingCount3");
        }
        if (!jSONObject.isNull("ratingCount4")) {
            this.D = jSONObject.optInt("ratingCount4");
        }
        if (!jSONObject.isNull("ratingCount5")) {
            this.E = jSONObject.optInt("ratingCount5");
        }
        if (!jSONObject.isNull("packagename")) {
            this.F = jSONObject.optString("packagename");
        } else if (!jSONObject.isNull("packageName")) {
            this.F = jSONObject.optString("packageName");
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("categoryData");
        if (optJSONObject2 != null) {
            nt ntVar = new nt(i, (String) null, 7);
            this.G = ntVar;
            if (!optJSONObject2.isNull(HintConstants.AUTOFILL_HINT_NAME)) {
                ntVar.b = optJSONObject2.optString(HintConstants.AUTOFILL_HINT_NAME);
            }
            if (!optJSONObject2.isNull("id")) {
                ntVar.a = optJSONObject2.optInt("id");
            }
            if (!optJSONObject2.isNull("isGame")) {
                ntVar.q = optJSONObject2.optInt("isGame");
            }
        }
        if (!jSONObject.isNull("permissionCount")) {
            this.H = jSONObject.optInt("permissionCount");
        }
        if (!jSONObject.isNull("md5Signature")) {
            this.M = jSONObject.optString("md5Signature");
        }
        if (!jSONObject.isNull("activeADEX")) {
            this.L = jSONObject.optInt("activeADEX");
        }
        if (!jSONObject.isNull("pegi")) {
            this.O = jSONObject.optString("pegi");
        }
        if (!jSONObject.isNull("technicalData")) {
            this.Q = jSONObject.optString("technicalData");
        }
        if (!jSONObject.isNull("versionRequired")) {
            this.R = jSONObject.optString("versionRequired");
        }
        JSONObject optJSONObject3 = jSONObject.optJSONObject("compatibleFile");
        if (optJSONObject3 != null) {
            JSONArray optJSONArray = optJSONObject3.optJSONArray("densities");
            if (optJSONArray != null) {
                this.S = new ArrayList();
                int length = optJSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    ArrayList arrayList2 = this.S;
                    if (arrayList2 != null) {
                        arrayList2.add(optJSONArray.optString(i2));
                    }
                }
            }
            JSONArray optJSONArray2 = optJSONObject3.optJSONArray("abis");
            if (optJSONArray2 != null) {
                this.T = new ArrayList();
                int length2 = optJSONArray2.length();
                for (int i3 = 0; i3 < length2; i3++) {
                    ArrayList arrayList3 = this.T;
                    if (arrayList3 != null) {
                        arrayList3.add(optJSONArray2.optString(i3));
                    }
                }
            }
            if (!optJSONObject3.isNull("fileID")) {
                this.J = optJSONObject3.optLong("fileID");
            }
            if (!optJSONObject3.isNull("minSDK")) {
                this.I = optJSONObject3.optString("minSDK");
            }
            if (!optJSONObject3.isNull("fileType")) {
                this.G0 = optJSONObject3.optString("fileType");
            }
            if (!optJSONObject3.isNull("version")) {
                this.m = optJSONObject3.optString("version");
            }
            if (!optJSONObject3.isNull("versionCode")) {
                this.K = optJSONObject3.optLong("versionCode");
            }
            if (!optJSONObject3.isNull("sha256")) {
                this.P = optJSONObject3.optString("sha256");
            }
            if (!optJSONObject3.isNull("url_apk")) {
                this.N = optJSONObject3.optString("url_apk");
            }
            JSONArray optJSONArray3 = optJSONObject3.optJSONArray("requiredFeatures");
            if (optJSONArray3 != null) {
                this.U = new ArrayList();
                int length3 = optJSONArray3.length();
                int i4 = 0;
                while (true) {
                    arrayList = this.U;
                    if (i4 >= length3) {
                        break;
                    }
                    if (arrayList != null) {
                        arrayList.add(optJSONArray3.optString(i4));
                    }
                    i4++;
                }
                arrayList.getClass();
                if (!arrayList.isEmpty() && context != null) {
                    ArrayList arrayList4 = this.U;
                    arrayList4.getClass();
                    ArrayList c = rd0.c(context, arrayList4);
                    if (!c.isEmpty()) {
                        Iterator it = c.iterator();
                        it.getClass();
                        while (it.hasNext()) {
                            Object next = it.next();
                            next.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putInt("update", 0);
                            bundle.putString("feature", (String) next);
                            new xk0(context, 23).w(bundle, "required_features_not_supported");
                        }
                    }
                }
            }
            JSONArray optJSONArray4 = optJSONObject3.optJSONArray("containedFiles");
            if (optJSONArray4 != null) {
                this.E0 = new ArrayList();
                int length4 = optJSONArray4.length();
                for (int i5 = 0; i5 < length4; i5++) {
                    JSONObject jSONObject2 = optJSONArray4.getJSONObject(i5);
                    jSONObject2.getClass();
                    gg0 gg0Var = new gg0();
                    if (!jSONObject2.isNull("fileID")) {
                        gg0Var.m = jSONObject2.optLong("fileID");
                    }
                    if (!jSONObject2.isNull(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY)) {
                        gg0Var.n = jSONObject2.optString(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
                    }
                    if (!jSONObject2.isNull("size")) {
                        gg0Var.o = jSONObject2.optLong("size");
                    }
                    if (!jSONObject2.isNull("sha256")) {
                        gg0Var.q = jSONObject2.optString("sha256");
                    }
                    this.E0.add(gg0Var);
                }
            }
            if (!optJSONObject3.isNull("isGplayFile")) {
                this.L0 = optJSONObject3.optInt("isGplayFile");
            }
            if (!optJSONObject3.isNull("gplayURL")) {
                this.M0 = optJSONObject3.optString("gplayURL");
            }
        }
        if (!jSONObject.isNull("website")) {
            this.V = jSONObject.optString("website");
        }
        if (!jSONObject.isNull("downloadStatus")) {
            String optString2 = jSONObject.optString("downloadStatus");
            this.W = optString2;
            if (bn2.d0(optString2, "PreRegister", false) && (optJSONObject = jSONObject.optJSONObject("preRegister")) != null) {
                if (!optJSONObject.isNull("date")) {
                    this.a0 = optJSONObject.optString("date");
                }
                if (!optJSONObject.isNull("countPreRegistered")) {
                    this.b0 = optJSONObject.optString("countPreRegistered");
                }
            }
        }
        if (!jSONObject.isNull("newFeatures")) {
            this.c0 = jSONObject.optString("newFeatures");
        }
        if (!jSONObject.isNull("onBoard")) {
            this.d0 = jSONObject.optInt("onBoard");
        }
        if (!jSONObject.isNull("responsibilitiesTexts")) {
            this.e0 = new ArrayList();
            JSONArray optJSONArray5 = jSONObject.optJSONArray("responsibilitiesTexts");
            if (optJSONArray5 != null) {
                int length5 = optJSONArray5.length();
                for (int i6 = 0; i6 < length5; i6++) {
                    ArrayList arrayList5 = this.e0;
                    arrayList5.getClass();
                    arrayList5.add(optJSONArray5.getString(i6));
                }
            }
        }
        if (!jSONObject.isNull(TypedValues.CycleType.S_WAVE_PHASE)) {
            this.f0 = jSONObject.optString(TypedValues.CycleType.S_WAVE_PHASE);
        }
        if (!jSONObject.isNull("deviceType")) {
            this.g0 = jSONObject.optString("deviceType");
        }
        JSONObject optJSONObject4 = jSONObject.optJSONObject("translations");
        if (optJSONObject4 != null) {
            this.t0 = new HashMap();
            if (!optJSONObject4.isNull("try")) {
                HashMap hashMap = this.t0;
                hashMap.getClass();
                hashMap.put("try", optJSONObject4.optString("try"));
            }
            if (!optJSONObject4.isNull("supportedDevice")) {
                HashMap hashMap2 = this.t0;
                hashMap2.getClass();
                hashMap2.put("supportedDevice", optJSONObject4.optString("supportedDevice"));
            }
        }
        if (!jSONObject.isNull("readingModeText")) {
            this.h0 = jSONObject.optString("readingModeText");
        }
        if (!jSONObject.isNull("externalDownloadURL")) {
            this.i0 = jSONObject.optString("externalDownloadURL");
        }
        if (!jSONObject.isNull("externalDownloadText")) {
            this.j0 = jSONObject.optString("externalDownloadText");
        }
        if (!jSONObject.isNull("organizationID")) {
            this.k0 = jSONObject.optLong("organizationID");
        }
        if (!jSONObject.isNull("editorNameNew")) {
            this.l0 = jSONObject.optString("editorNameNew");
        }
        if (!jSONObject.isNull("editorAvatar")) {
            this.m0 = jSONObject.optString("editorAvatar");
        }
        if (!jSONObject.isNull("showReviewedBy")) {
            this.q0 = jSONObject.optInt("showReviewedBy");
        }
        if (!jSONObject.isNull("editorJobTitle")) {
            this.n0 = jSONObject.optString("editorJobTitle");
        }
        if (!jSONObject.isNull("totalVersions")) {
            this.o0 = jSONObject.optInt("totalVersions");
        }
        if (!jSONObject.isNull("disclaimerText")) {
            this.p0 = jSONObject.optString("disclaimerText");
        }
        if (!jSONObject.isNull("tagID")) {
            int optInt = jSONObject.optInt("tagID");
            if (optInt == 0) {
                this.s0 = bc.p;
            } else if (optInt == 1) {
                this.s0 = bc.o;
            } else if (optInt == 2) {
                this.s0 = bc.m;
            } else if (optInt == 3) {
                this.s0 = bc.a;
            } else if (optInt == 4) {
                this.s0 = bc.b;
            } else if (optInt == 5) {
                this.s0 = bc.n;
            }
            if (!jSONObject.isNull("tag")) {
                this.r0 = jSONObject.optString("tag");
            }
        }
        if (!jSONObject.isNull("promoted")) {
            this.u0 = jSONObject.optInt("promoted");
        }
        if (this.u0 == 1 && !jSONObject.isNull("positionPromoted")) {
            this.w0 = jSONObject.optInt("positionPromoted");
        }
        if (!jSONObject.isNull("hasAlternatives")) {
            if (jSONObject.optBoolean("hasAlternatives")) {
                this.y0 = 1;
            } else {
                this.y0 = 0;
            }
        }
        if (!jSONObject.isNull("wishlist")) {
            this.A0 = jSONObject.optInt("wishlist");
        }
        JSONArray optJSONArray6 = jSONObject.optJSONArray("userSays");
        if (optJSONArray6 != null) {
            this.C0 = new ArrayList();
            int length6 = optJSONArray6.length();
            for (int i7 = 0; i7 < length6; i7++) {
                ArrayList arrayList6 = this.C0;
                arrayList6.getClass();
                arrayList6.add(optJSONArray6.getString(i7));
            }
        }
        if (!jSONObject.isNull("recommended-apps")) {
            this.B0 = jSONObject.optInt("recommended-apps");
        }
        JSONObject optJSONObject5 = jSONObject.optJSONObject("ranking");
        if (optJSONObject5 != null) {
            r32 r32Var = new r32();
            if (!optJSONObject5.isNull("text")) {
                r32Var.a = optJSONObject5.optString("text");
            }
            if (!optJSONObject5.isNull("floatingCategoryID")) {
                r32Var.b = optJSONObject5.optInt("floatingCategoryID");
            }
            if (!optJSONObject5.isNull("categoryID")) {
                r32Var.m = optJSONObject5.optInt("categoryID");
            }
            if (!optJSONObject5.isNull(HintConstants.AUTOFILL_HINT_NAME)) {
                r32Var.n = optJSONObject5.optString(HintConstants.AUTOFILL_HINT_NAME);
            }
            if (!optJSONObject5.isNull("parentCategoryID")) {
                r32Var.o = optJSONObject5.optInt("parentCategoryID");
            }
            this.F0 = r32Var;
        }
        if (!jSONObject.isNull("ads")) {
            if (jSONObject.optBoolean("ads")) {
                this.H0 = 1;
            } else {
                this.H0 = 0;
            }
        }
        if (!jSONObject.isNull("isForYouIf")) {
            this.I0 = jSONObject.optString("isForYouIf");
        }
        JSONObject optJSONObject6 = jSONObject.optJSONObject("distributionDetail");
        if (optJSONObject6 != null) {
            ?? obj = new Object();
            if (!optJSONObject6.isNull("licenseName")) {
                obj.a = optJSONObject6.optString("licenseName");
            }
            if (!optJSONObject6.isNull("licenseFileURL")) {
                obj.b = optJSONObject6.optString("licenseFileURL");
            }
            if (!optJSONObject6.isNull("sourceCodeLink")) {
                obj.m = optJSONObject6.optString("sourceCodeLink");
            }
            if (!optJSONObject6.isNull("noticeFileURL")) {
                obj.n = optJSONObject6.optString("noticeFileURL");
            }
            if (!optJSONObject6.isNull("distributionModelName")) {
                obj.o = optJSONObject6.optString("distributionModelName");
            }
            if (!optJSONObject6.isNull("iap")) {
                obj.p = optJSONObject6.optInt("iap");
            }
            if (!optJSONObject6.isNull("subscription")) {
                obj.q = optJSONObject6.optInt("subscription");
            }
            if (!optJSONObject6.isNull("containAds")) {
                obj.r = optJSONObject6.optInt("containAds");
            }
            if (!optJSONObject6.isNull("copyright")) {
                obj.s = optJSONObject6.optString("copyright");
            }
            this.J0 = obj;
        }
        if (jSONObject.isNull("openSource")) {
            return;
        }
        this.K0 = jSONObject.optInt("openSource");
    }

    public final String toString() {
        long j = this.a;
        String str = this.b;
        String str2 = this.m;
        long j2 = this.n;
        String str3 = this.o;
        String str4 = this.p;
        String str5 = this.q;
        int i = this.r;
        int i2 = this.s;
        String str6 = this.t;
        String str7 = this.u;
        String str8 = this.v;
        String str9 = this.w;
        String str10 = this.x;
        int i3 = this.y;
        int i4 = this.z;
        int i5 = this.A;
        int i6 = this.B;
        int i7 = this.C;
        int i8 = this.D;
        int i9 = this.E;
        String str11 = this.F;
        ArrayList arrayList = this.X;
        nt ntVar = this.G;
        int i10 = this.H;
        String str12 = this.I;
        String str13 = this.G0;
        String str14 = this.M;
        String str15 = this.N;
        long j3 = this.J;
        ArrayList arrayList2 = this.D0;
        int i11 = this.L;
        String str16 = this.P;
        String str17 = this.Q;
        String str18 = this.R;
        String str19 = this.V;
        String str20 = this.W;
        int i12 = this.d0;
        ArrayList arrayList3 = this.e0;
        String str21 = this.f0;
        String str22 = this.h0;
        String str23 = this.i0;
        String str24 = this.c0;
        String str25 = this.a0;
        String str26 = this.b0;
        String str27 = this.m0;
        String str28 = this.n0;
        int i13 = this.q0;
        int i14 = this.y0;
        int i15 = this.A0;
        String str29 = this.g0;
        HashMap hashMap = this.t0;
        ArrayList arrayList4 = this.S;
        ArrayList arrayList5 = this.T;
        ArrayList arrayList6 = this.U;
        String str30 = this.O;
        String str31 = this.j0;
        long j4 = this.k0;
        String str32 = this.l0;
        int i16 = this.o0;
        String str33 = this.p0;
        int i17 = this.u0;
        int i18 = this.H0;
        String str34 = this.v0;
        String str35 = this.I0;
        we0 we0Var = this.J0;
        int i19 = this.K0;
        int i20 = this.L0;
        String str36 = this.M0;
        StringBuilder sb = new StringBuilder("AppInfo(appID=");
        sb.append(j);
        sb.append(", name=");
        sb.append(str);
        sb.append(", versionName=");
        sb.append(str2);
        sb.append(", lastVersionCode=");
        sb.append(j2);
        sb.append(", urlShare=");
        sb.append(str3);
        lt.L(sb, ", shortDescription=", str4, ", size=", str5);
        sb.append(", downloads=");
        sb.append(i);
        sb.append(", weeklyDownloads=");
        sb.append(i2);
        lt.L(sb, ", lastUpdate=", str6, ", icon=", str7);
        lt.L(sb, ", feature=", str8, ", author=", str9);
        sb.append(", description=");
        sb.append(str10);
        sb.append(", rating=");
        sb.append(i3);
        sb.append(", ratingCount=");
        sb.append(i4);
        sb.append(", ratingCount1=");
        sb.append(i5);
        sb.append(", ratingCount2=");
        sb.append(i6);
        sb.append(", ratingCount3=");
        sb.append(i7);
        sb.append(", ratingCount4=");
        sb.append(i8);
        sb.append(", ratingCount5=");
        sb.append(i9);
        sb.append(", packagename=");
        sb.append(str11);
        sb.append(", screenShots=");
        sb.append(arrayList);
        sb.append(", category=");
        sb.append(ntVar);
        sb.append(", permissionCount=");
        sb.append(i10);
        lt.L(sb, ", minsdk=", str12, ", fileType=", str13);
        lt.L(sb, ", md5signature=", str14, ", downloadUrl=", str15);
        sb.append(", fileID=");
        sb.append(j3);
        sb.append(", oldVersions=");
        sb.append(arrayList2);
        sb.append(", activeADEX=");
        sb.append(i11);
        sb.append(", sha256=");
        lt.L(sb, str16, ", technicalData=", str17, ", versionRequired=");
        lt.L(sb, str18, ", webAuthor=", str19, ", downloadStatus=");
        sb.append(str20);
        sb.append(", devOnBoard=");
        sb.append(i12);
        sb.append(", responsibilities=");
        sb.append(arrayList3);
        sb.append(", phase=");
        sb.append(str21);
        sb.append(", readingModeText=");
        lt.L(sb, str22, ", externalDownloadUrl=", str23, ", newFeatures=");
        lt.L(sb, str24, ", preRegisterDate=", str25, ", preRegistersCount=");
        lt.L(sb, str26, ", editorAvatar=", str27, ", editorJobTitle=");
        sb.append(str28);
        sb.append(", showReviewedBy=");
        sb.append(i13);
        sb.append(", hasAlternatives=");
        sb.append(i14);
        sb.append(", wishlist=");
        sb.append(i15);
        sb.append(", deviceType=");
        sb.append(str29);
        sb.append(", translations=");
        sb.append(hashMap);
        sb.append(", supportedDensities=");
        sb.append(arrayList4);
        sb.append(", supportedAbis=");
        sb.append(arrayList5);
        sb.append(", requiredFeatures=");
        sb.append(arrayList6);
        sb.append(", pegi=");
        sb.append(str30);
        sb.append(", externalDownloadText=");
        sb.append(str31);
        sb.append(", organizationID=");
        sb.append(j4);
        sb.append(", editorName=");
        sb.append(str32);
        sb.append(", totalVersions=");
        sb.append(i16);
        sb.append(", disclaimerText=");
        sb.append(str33);
        sb.append(", promoted=");
        sb.append(i17);
        sb.append(", showAds=");
        sb.append(i18);
        sb.append(", promotedFrom=");
        sb.append(str34);
        sb.append(", isForYouIf=");
        sb.append(str35);
        sb.append(", distributionDetails=");
        sb.append(we0Var);
        sb.append(", openSource=");
        sb.append(i19);
        sb.append(", isGplayFile=");
        sb.append(i20);
        return sg3.t(sb, ", gplayURL=", str36, ")");
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
        parcel.writeString(this.q);
        parcel.writeInt(this.r);
        parcel.writeInt(this.s);
        parcel.writeString(this.t);
        parcel.writeString(this.u);
        parcel.writeString(this.v);
        parcel.writeString(this.w);
        parcel.writeString(this.x);
        parcel.writeInt(this.y);
        parcel.writeInt(this.z);
        parcel.writeInt(this.A);
        parcel.writeInt(this.B);
        parcel.writeInt(this.C);
        parcel.writeInt(this.D);
        parcel.writeInt(this.E);
        parcel.writeString(this.F);
        parcel.writeParcelable(this.G, i);
        parcel.writeInt(this.H);
        parcel.writeString(this.I);
        parcel.writeString(this.M);
        parcel.writeString(this.N);
        parcel.writeLong(this.J);
        parcel.writeInt(this.L);
        parcel.writeString(this.P);
        parcel.writeString(this.Q);
        parcel.writeString(this.R);
        parcel.writeStringList(this.S);
        parcel.writeStringList(this.T);
        parcel.writeStringList(this.U);
        parcel.writeString(this.V);
        parcel.writeString(this.W);
        parcel.writeString(this.O);
        parcel.writeInt(this.d0);
        parcel.writeString(this.g0);
        parcel.writeMap(this.t0);
        parcel.writeString(this.h0);
        parcel.writeString(this.i0);
        parcel.writeString(this.j0);
        parcel.writeLong(this.k0);
        parcel.writeString(this.l0);
        parcel.writeInt(this.o0);
        parcel.writeStringList(this.e0);
        parcel.writeString(this.c0);
        parcel.writeString(this.a0);
        parcel.writeString(this.b0);
        parcel.writeString(this.m0);
        parcel.writeString(this.n0);
        parcel.writeString(this.p0);
        parcel.writeInt(this.q0);
        parcel.writeInt(this.y0);
        parcel.writeInt(this.A0);
        parcel.writeStringList(this.C0);
        parcel.writeInt(this.B0);
        parcel.writeInt(this.u0);
        parcel.writeString(this.v0);
        parcel.writeInt(this.w0);
        parcel.writeTypedList(this.E0);
        parcel.writeParcelable(this.F0, i);
        parcel.writeString(this.G0);
        parcel.writeInt(this.H0);
        parcel.writeString(this.I0);
        parcel.writeParcelable(this.J0, i);
        parcel.writeInt(this.K0);
        parcel.writeInt(this.L0);
        parcel.writeString(this.M0);
    }
}
