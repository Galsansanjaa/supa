package com.mikepenz.aboutlibraries.entity;

import defpackage.a52;
import defpackage.bg2;
import defpackage.e21;
import defpackage.j21;
import defpackage.jh2;
import defpackage.k93;
import defpackage.kz;
import defpackage.lt;
import defpackage.nb0;
import defpackage.nb1;
import defpackage.sb0;
import defpackage.sm2;
import defpackage.t21;
import defpackage.ta1;
import defpackage.ta3;
import defpackage.tf2;
import defpackage.uc1;
import defpackage.um2;
import defpackage.vw1;
import defpackage.wa2;
import defpackage.xx1;
import defpackage.zf2;
import java.lang.annotation.Annotation;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class Library {
    private static final nb1[] $childSerializers;
    public static final Companion Companion = new Companion(null);
    private final String artifactVersion;
    private final String description;
    private final e21 developers;
    private final j21 funding;
    private final j21 licenses;
    private final String name;
    private final Organization organization;
    private final Scm scm;
    private final String tag;
    private final String uniqueId;
    private final String website;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        public final ta1 serializer() {
            return Library$$serializer.INSTANCE;
        }
    }

    static {
        t21 t21Var = new t21(13);
        uc1 uc1Var = uc1.a;
        $childSerializers = new nb1[]{null, null, null, null, null, ta3.w(uc1Var, t21Var), null, null, ta3.w(uc1Var, new t21(14)), ta3.w(uc1Var, new t21(15)), null};
    }

    public Library(int i, String str, String str2, String str3, String str4, String str5, e21 e21Var, Organization organization, Scm scm, j21 j21Var, j21 j21Var2, String str6, zf2 zf2Var) {
        if (255 != (i & 255)) {
            nb0.P(Library$$serializer.INSTANCE.getDescriptor(), i, 255);
            throw null;
        }
        this.uniqueId = str;
        this.artifactVersion = str2;
        this.name = str3;
        this.description = str4;
        this.website = str5;
        this.developers = e21Var;
        this.organization = organization;
        this.scm = scm;
        if ((i & 256) == 0) {
            this.licenses = vw1.n;
        } else {
            this.licenses = j21Var;
        }
        if ((i & 512) == 0) {
            this.funding = vw1.n;
        } else {
            this.funding = j21Var2;
        }
        if ((i & 1024) == 0) {
            this.tag = null;
        } else {
            this.tag = str6;
        }
    }

    public Library(String str, String str2, String str3, String str4, String str5, e21 e21Var, Organization organization, Scm scm, j21 j21Var, j21 j21Var2, String str6) {
        str.getClass();
        str3.getClass();
        e21Var.getClass();
        j21Var.getClass();
        j21Var2.getClass();
        this.uniqueId = str;
        this.artifactVersion = str2;
        this.name = str3;
        this.description = str4;
        this.website = str5;
        this.developers = e21Var;
        this.organization = organization;
        this.scm = scm;
        this.licenses = j21Var;
        this.funding = j21Var2;
        this.tag = str6;
    }

    public Library(String str, String str2, String str3, String str4, String str5, e21 e21Var, Organization organization, Scm scm, j21 j21Var, j21 j21Var2, String str6, int i, sb0 sb0Var) {
        this(str, str2, str3, str4, str5, e21Var, organization, scm, (i & 256) != 0 ? vw1.n : j21Var, (i & 512) != 0 ? vw1.n : j21Var2, (i & 1024) != 0 ? null : str6);
    }

    public static final /* synthetic */ ta1 _childSerializers$_anonymous_() {
        return new xx1(a52.a(e21.class), new Annotation[0]);
    }

    public static final /* synthetic */ ta1 _childSerializers$_anonymous_$0() {
        return new xx1(a52.a(j21.class), new Annotation[0]);
    }

    public static final /* synthetic */ ta1 _childSerializers$_anonymous_$1() {
        return new xx1(a52.a(j21.class), new Annotation[0]);
    }

    public static /* synthetic */ ta1 a() {
        return _childSerializers$_anonymous_$0();
    }

    public static /* synthetic */ ta1 b() {
        return _childSerializers$_anonymous_();
    }

    public static /* synthetic */ ta1 c() {
        return _childSerializers$_anonymous_$1();
    }

    public static /* synthetic */ Library copy$default(Library library, String str, String str2, String str3, String str4, String str5, e21 e21Var, Organization organization, Scm scm, j21 j21Var, j21 j21Var2, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = library.uniqueId;
        }
        if ((i & 2) != 0) {
            str2 = library.artifactVersion;
        }
        if ((i & 4) != 0) {
            str3 = library.name;
        }
        if ((i & 8) != 0) {
            str4 = library.description;
        }
        if ((i & 16) != 0) {
            str5 = library.website;
        }
        if ((i & 32) != 0) {
            e21Var = library.developers;
        }
        if ((i & 64) != 0) {
            organization = library.organization;
        }
        if ((i & 128) != 0) {
            scm = library.scm;
        }
        if ((i & 256) != 0) {
            j21Var = library.licenses;
        }
        if ((i & 512) != 0) {
            j21Var2 = library.funding;
        }
        if ((i & 1024) != 0) {
            str6 = library.tag;
        }
        j21 j21Var3 = j21Var2;
        String str7 = str6;
        Scm scm2 = scm;
        j21 j21Var4 = j21Var;
        e21 e21Var2 = e21Var;
        Organization organization2 = organization;
        String str8 = str5;
        String str9 = str3;
        return library.copy(str, str2, str9, str4, str8, e21Var2, organization2, scm2, j21Var4, j21Var3, str7);
    }

    public static /* synthetic */ void getArtifactVersion$annotations() {
    }

    public static /* synthetic */ void getDescription$annotations() {
    }

    public static /* synthetic */ void getDevelopers$annotations() {
    }

    public static /* synthetic */ void getFunding$annotations() {
    }

    public static /* synthetic */ void getLicenses$annotations() {
    }

    public static /* synthetic */ void getName$annotations() {
    }

    public static /* synthetic */ void getOrganization$annotations() {
    }

    public static /* synthetic */ void getScm$annotations() {
    }

    public static /* synthetic */ void getTag$annotations() {
    }

    public static /* synthetic */ void getUniqueId$annotations() {
    }

    public static /* synthetic */ void getWebsite$annotations() {
    }

    public static final void write$Self$aboutlibraries_core_release(Library library, kz kzVar, tf2 tf2Var) {
        nb1[] nb1VarArr = $childSerializers;
        kzVar.encodeStringElement(tf2Var, 0, library.uniqueId);
        sm2 sm2Var = sm2.a;
        kzVar.encodeNullableSerializableElement(tf2Var, 1, sm2Var, library.artifactVersion);
        kzVar.encodeStringElement(tf2Var, 2, library.name);
        kzVar.encodeNullableSerializableElement(tf2Var, 3, sm2Var, library.description);
        kzVar.encodeNullableSerializableElement(tf2Var, 4, sm2Var, library.website);
        kzVar.encodeSerializableElement(tf2Var, 5, (bg2) nb1VarArr[5].getValue(), library.developers);
        kzVar.encodeNullableSerializableElement(tf2Var, 6, Organization$$serializer.INSTANCE, library.organization);
        kzVar.encodeNullableSerializableElement(tf2Var, 7, Scm$$serializer.INSTANCE, library.scm);
        if (kzVar.shouldEncodeElementDefault(tf2Var, 8) || !jh2.k(library.licenses, vw1.n)) {
            kzVar.encodeSerializableElement(tf2Var, 8, (bg2) nb1VarArr[8].getValue(), library.licenses);
        }
        if (kzVar.shouldEncodeElementDefault(tf2Var, 9) || !jh2.k(library.funding, vw1.n)) {
            kzVar.encodeSerializableElement(tf2Var, 9, (bg2) nb1VarArr[9].getValue(), library.funding);
        }
        if (!kzVar.shouldEncodeElementDefault(tf2Var, 10) && library.tag == null) {
            return;
        }
        kzVar.encodeNullableSerializableElement(tf2Var, 10, sm2Var, library.tag);
    }

    public final String component1() {
        return this.uniqueId;
    }

    public final j21 component10() {
        return this.funding;
    }

    public final String component11() {
        return this.tag;
    }

    public final String component2() {
        return this.artifactVersion;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.description;
    }

    public final String component5() {
        return this.website;
    }

    public final e21 component6() {
        return this.developers;
    }

    public final Organization component7() {
        return this.organization;
    }

    public final Scm component8() {
        return this.scm;
    }

    public final j21 component9() {
        return this.licenses;
    }

    public final Library copy(String str, String str2, String str3, String str4, String str5, e21 e21Var, Organization organization, Scm scm, j21 j21Var, j21 j21Var2, String str6) {
        str.getClass();
        str3.getClass();
        e21Var.getClass();
        j21Var.getClass();
        j21Var2.getClass();
        return new Library(str, str2, str3, str4, str5, e21Var, organization, scm, j21Var, j21Var2, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Library)) {
            return false;
        }
        Library library = (Library) obj;
        return jh2.k(this.uniqueId, library.uniqueId) && jh2.k(this.artifactVersion, library.artifactVersion) && jh2.k(this.name, library.name) && jh2.k(this.description, library.description) && jh2.k(this.website, library.website) && jh2.k(this.developers, library.developers) && jh2.k(this.organization, library.organization) && jh2.k(this.scm, library.scm) && jh2.k(this.licenses, library.licenses) && jh2.k(this.funding, library.funding) && jh2.k(this.tag, library.tag);
    }

    public final String getArtifactId() {
        String str = this.uniqueId;
        String str2 = this.artifactVersion;
        if (str2 == null) {
            str2 = "";
        }
        return wa2.s(str, ":", str2);
    }

    public final String getArtifactVersion() {
        return this.artifactVersion;
    }

    public final String getDescription() {
        return this.description;
    }

    public final e21 getDevelopers() {
        return this.developers;
    }

    public final j21 getFunding() {
        return this.funding;
    }

    public final j21 getLicenses() {
        return this.licenses;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getOpenSource() {
        String url;
        Scm scm = this.scm;
        return (scm == null || (url = scm.getUrl()) == null || !(um2.v0(url) ^ true)) ? false : true;
    }

    public final Organization getOrganization() {
        return this.organization;
    }

    public final Scm getScm() {
        return this.scm;
    }

    public final String getTag() {
        return this.tag;
    }

    public final String getUniqueId() {
        return this.uniqueId;
    }

    public final String getWebsite() {
        return this.website;
    }

    public int hashCode() {
        int hashCode = this.uniqueId.hashCode() * 31;
        String str = this.artifactVersion;
        int j = k93.j((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.name);
        String str2 = this.description;
        int hashCode2 = (j + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.website;
        int hashCode3 = (this.developers.hashCode() + ((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        Organization organization = this.organization;
        int hashCode4 = (hashCode3 + (organization == null ? 0 : organization.hashCode())) * 31;
        Scm scm = this.scm;
        int hashCode5 = (this.funding.hashCode() + ((this.licenses.hashCode() + ((hashCode4 + (scm == null ? 0 : scm.hashCode())) * 31)) * 31)) * 31;
        String str4 = this.tag;
        return hashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        String str = this.uniqueId;
        String str2 = this.artifactVersion;
        String str3 = this.name;
        String str4 = this.description;
        String str5 = this.website;
        e21 e21Var = this.developers;
        Organization organization = this.organization;
        Scm scm = this.scm;
        j21 j21Var = this.licenses;
        j21 j21Var2 = this.funding;
        String str6 = this.tag;
        StringBuilder D = lt.D("Library(uniqueId=", str, ", artifactVersion=", str2, ", name=");
        lt.L(D, str3, ", description=", str4, ", website=");
        D.append(str5);
        D.append(", developers=");
        D.append(e21Var);
        D.append(", organization=");
        D.append(organization);
        D.append(", scm=");
        D.append(scm);
        D.append(", licenses=");
        D.append(j21Var);
        D.append(", funding=");
        D.append(j21Var2);
        D.append(", tag=");
        return wa2.v(D, str6, ")");
    }
}
