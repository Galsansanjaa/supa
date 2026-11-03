package com.mikepenz.aboutlibraries.entity;

import defpackage.jh2;
import defpackage.kz;
import defpackage.lt;
import defpackage.nb0;
import defpackage.sb0;
import defpackage.sm2;
import defpackage.ta1;
import defpackage.tf2;
import defpackage.zf2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class License {
    public static final Companion Companion = new Companion(null);
    private final String hash;
    private final String licenseContent;
    private final String name;
    private final String spdxId;
    private final String url;
    private final String year;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        public final ta1 serializer() {
            return License$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ License(int i, String str, String str2, String str3, String str4, String str5, String str6, zf2 zf2Var) {
        if (35 != (i & 35)) {
            nb0.P(License$$serializer.INSTANCE.getDescriptor(), i, 35);
            throw null;
        }
        this.name = str;
        this.url = str2;
        if ((i & 4) == 0) {
            this.year = null;
        } else {
            this.year = str3;
        }
        if ((i & 8) == 0) {
            this.spdxId = null;
        } else {
            this.spdxId = str4;
        }
        if ((i & 16) == 0) {
            this.licenseContent = null;
        } else {
            this.licenseContent = str5;
        }
        this.hash = str6;
    }

    public License(String str, String str2, String str3, String str4, String str5, String str6) {
        str.getClass();
        str6.getClass();
        this.name = str;
        this.url = str2;
        this.year = str3;
        this.spdxId = str4;
        this.licenseContent = str5;
        this.hash = str6;
    }

    public /* synthetic */ License(String str, String str2, String str3, String str4, String str5, String str6, int i, sb0 sb0Var) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, str6);
    }

    public static /* synthetic */ License copy$default(License license, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = license.name;
        }
        if ((i & 2) != 0) {
            str2 = license.url;
        }
        if ((i & 4) != 0) {
            str3 = license.year;
        }
        if ((i & 8) != 0) {
            str4 = license.spdxId;
        }
        if ((i & 16) != 0) {
            str5 = license.licenseContent;
        }
        if ((i & 32) != 0) {
            str6 = license.hash;
        }
        String str7 = str5;
        String str8 = str6;
        return license.copy(str, str2, str3, str4, str7, str8);
    }

    public static /* synthetic */ void getHash$annotations() {
    }

    public static /* synthetic */ void getLicenseContent$annotations() {
    }

    public static /* synthetic */ void getName$annotations() {
    }

    public static /* synthetic */ void getSpdxId$annotations() {
    }

    public static /* synthetic */ void getUrl$annotations() {
    }

    public static /* synthetic */ void getYear$annotations() {
    }

    public static final /* synthetic */ void write$Self$aboutlibraries_core_release(License license, kz kzVar, tf2 tf2Var) {
        kzVar.encodeStringElement(tf2Var, 0, license.name);
        sm2 sm2Var = sm2.a;
        kzVar.encodeNullableSerializableElement(tf2Var, 1, sm2Var, license.url);
        if (kzVar.shouldEncodeElementDefault(tf2Var, 2) || license.year != null) {
            kzVar.encodeNullableSerializableElement(tf2Var, 2, sm2Var, license.year);
        }
        if (kzVar.shouldEncodeElementDefault(tf2Var, 3) || license.spdxId != null) {
            kzVar.encodeNullableSerializableElement(tf2Var, 3, sm2Var, license.spdxId);
        }
        if (kzVar.shouldEncodeElementDefault(tf2Var, 4) || license.licenseContent != null) {
            kzVar.encodeNullableSerializableElement(tf2Var, 4, sm2Var, license.licenseContent);
        }
        kzVar.encodeStringElement(tf2Var, 5, license.hash);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.url;
    }

    public final String component3() {
        return this.year;
    }

    public final String component4() {
        return this.spdxId;
    }

    public final String component5() {
        return this.licenseContent;
    }

    public final String component6() {
        return this.hash;
    }

    public final License copy(String str, String str2, String str3, String str4, String str5, String str6) {
        str.getClass();
        str6.getClass();
        return new License(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && License.class == obj.getClass() && jh2.k(this.hash, ((License) obj).hash);
    }

    public final String getHash() {
        return this.hash;
    }

    public final String getLicenseContent() {
        return this.licenseContent;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSpdxId() {
        return this.spdxId;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getYear() {
        return this.year;
    }

    public int hashCode() {
        return this.hash.hashCode();
    }

    public String toString() {
        String str = this.name;
        String str2 = this.url;
        String str3 = this.year;
        String str4 = this.spdxId;
        String str5 = this.licenseContent;
        String str6 = this.hash;
        StringBuilder D = lt.D("License(name=", str, ", url=", str2, ", year=");
        lt.L(D, str3, ", spdxId=", str4, ", licenseContent=");
        return lt.B(D, str5, ", hash=", str6, ")");
    }
}
