package defpackage;

import androidx.credentials.CustomCredential;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class av0 extends CustomCredential {
    public static final /* synthetic */ int b = 0;
    public final String a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public av0(java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, android.net.Uri r8, java.lang.String r9) {
        /*
            r2 = this;
            r3.getClass()
            r4.getClass()
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID"
            r0.putString(r1, r3)
            java.lang.String r1 = "com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN"
            r0.putString(r1, r4)
            java.lang.String r1 = "com.google.android.libraries.identity.googleid.BUNDLE_KEY_DISPLAY_NAME"
            r0.putString(r1, r5)
            java.lang.String r5 = "com.google.android.libraries.identity.googleid.BUNDLE_KEY_FAMILY_NAME"
            r0.putString(r5, r6)
            java.lang.String r5 = "com.google.android.libraries.identity.googleid.BUNDLE_KEY_GIVEN_NAME"
            r0.putString(r5, r7)
            java.lang.String r5 = "com.google.android.libraries.identity.googleid.BUNDLE_KEY_PHONE_NUMBER"
            r0.putString(r5, r9)
            java.lang.String r5 = "com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI"
            r0.putParcelable(r5, r8)
            java.lang.String r5 = "com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL"
            r2.<init>(r5, r0)
            r2.a = r4
            int r2 = r3.length()
            r3 = 0
            if (r2 <= 0) goto La7
            int r2 = r4.length()
            if (r2 <= 0) goto La1
            java.lang.String r2 = "."
            java.lang.String[] r2 = new java.lang.String[]{r2}
            java.util.List r2 = defpackage.um2.F0(r4, r2)
            int r4 = r2.size()
            r5 = 3
            if (r4 != r5) goto L9b
            r4 = 1
            java.lang.Object r2 = r2.get(r4)     // Catch: org.json.JSONException -> L94
            java.lang.String r2 = (java.lang.String) r2     // Catch: org.json.JSONException -> L94
            r4 = 8
            byte[] r2 = android.util.Base64.decode(r2, r4)     // Catch: org.json.JSONException -> L94
            r2.getClass()     // Catch: org.json.JSONException -> L94
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_8     // Catch: org.json.JSONException -> L94
            r4.getClass()     // Catch: org.json.JSONException -> L94
            java.lang.String r5 = new java.lang.String     // Catch: org.json.JSONException -> L94
            r5.<init>(r2, r4)     // Catch: org.json.JSONException -> L94
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L94
            r2.<init>(r5)     // Catch: org.json.JSONException -> L94
            java.lang.String r4 = "email"
            java.lang.String r4 = r2.optString(r4)     // Catch: org.json.JSONException -> L94
            r4.getClass()     // Catch: org.json.JSONException -> L94
            java.lang.String r4 = "sub"
            java.lang.String r2 = r2.optString(r4)     // Catch: org.json.JSONException -> L94
            int r4 = r2.length()     // Catch: org.json.JSONException -> L94
            if (r4 != 0) goto L88
            goto L89
        L88:
            r3 = r2
        L89:
            if (r3 == 0) goto L8c
            return
        L8c:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch: org.json.JSONException -> L94
            java.lang.String r3 = "ID token missing required field: sub"
            r2.<init>(r3)     // Catch: org.json.JSONException -> L94
            throw r2     // Catch: org.json.JSONException -> L94
        L94:
            r2 = move-exception
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r3.<init>(r2)
            throw r3
        L9b:
            java.lang.String r2 = "Invalid token format"
            defpackage.v5.m(r2)
            throw r3
        La1:
            java.lang.String r2 = "idToken should not be empty"
            defpackage.v5.m(r2)
            throw r3
        La7:
            java.lang.String r2 = "id should not be empty"
            defpackage.v5.m(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.av0.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, android.net.Uri, java.lang.String):void");
    }
}
