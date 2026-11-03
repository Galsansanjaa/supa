package defpackage;

import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class j00 extends n72 {
    public static final UriMatcher b;
    public final Context a;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        b = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "display_photo/#", 4);
    }

    public j00(Context context) {
        this.a = context;
    }

    @Override // defpackage.n72
    public final boolean b(xx0 xx0Var) {
        Uri uri = (Uri) xx0Var.h;
        return "content".equals(uri.getScheme()) && ContactsContract.Contacts.CONTENT_URI.getHost().equals(uri.getHost()) && b.match(uri) != -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0037 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    @Override // defpackage.n72
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.m72 e(defpackage.xx0 r5, int r6) {
        /*
            r4 = this;
            android.content.Context r4 = r4.a
            android.content.ContentResolver r4 = r4.getContentResolver()
            java.lang.Object r5 = r5.h
            android.net.Uri r5 = (android.net.Uri) r5
            android.content.UriMatcher r6 = defpackage.j00.b
            int r6 = r6.match(r5)
            r0 = 2
            r1 = 0
            r2 = 1
            if (r6 == r2) goto L29
            if (r6 == r0) goto L24
            r3 = 3
            if (r6 == r3) goto L31
            r2 = 4
            if (r6 != r2) goto L1e
            goto L24
        L1e:
            java.lang.String r4 = "Invalid uri: "
            defpackage.v5.r(r5, r4)
            return r1
        L24:
            java.io.InputStream r4 = r4.openInputStream(r5)
            goto L35
        L29:
            android.net.Uri r5 = android.provider.ContactsContract.Contacts.lookupContact(r4, r5)
            if (r5 != 0) goto L31
            r4 = r1
            goto L35
        L31:
            java.io.InputStream r4 = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(r4, r5, r2)
        L35:
            if (r4 != 0) goto L38
            return r1
        L38:
            m72 r5 = new m72
            fe r4 = defpackage.ls1.b(r4)
            r5.<init>(r4, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j00.e(xx0, int):m72");
    }
}
