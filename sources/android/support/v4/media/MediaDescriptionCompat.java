package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.sj1;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new sj1(0);
    public final String a;
    public final CharSequence b;
    public final CharSequence m;
    public final CharSequence n;
    public final Bitmap o;
    public final Uri p;
    public final Bundle q;
    public final Uri r;
    public Object s;

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.a = str;
        this.b = charSequence;
        this.m = charSequence2;
        this.n = charSequence3;
        this.o = bitmap;
        this.p = uri;
        this.q = bundle;
        this.r = uri2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.support.v4.media.MediaDescriptionCompat a(java.lang.Object r14) {
        /*
            r0 = 0
            if (r14 == 0) goto L5a
            r1 = r14
            android.media.MediaDescription r1 = (android.media.MediaDescription) r1
            java.lang.String r3 = r1.getMediaId()
            java.lang.CharSequence r4 = r1.getTitle()
            java.lang.CharSequence r5 = r1.getSubtitle()
            java.lang.CharSequence r6 = r1.getDescription()
            android.graphics.Bitmap r7 = r1.getIconBitmap()
            android.net.Uri r8 = r1.getIconUri()
            android.os.Bundle r2 = r1.getExtras()
            java.lang.String r9 = "android.support.v4.media.description.MEDIA_URI"
            if (r2 == 0) goto L30
            defpackage.vj1.a(r2)
            android.os.Parcelable r10 = r2.getParcelable(r9)
            android.net.Uri r10 = (android.net.Uri) r10
            goto L31
        L30:
            r10 = r0
        L31:
            if (r10 == 0) goto L4a
            java.lang.String r11 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r12 = r2.containsKey(r11)
            if (r12 == 0) goto L44
            int r12 = r2.size()
            r13 = 2
            if (r12 != r13) goto L44
            r9 = r0
            goto L4b
        L44:
            r2.remove(r9)
            r2.remove(r11)
        L4a:
            r9 = r2
        L4b:
            if (r10 == 0) goto L4e
            goto L52
        L4e:
            android.net.Uri r10 = r1.getMediaUri()
        L52:
            android.support.v4.media.MediaDescriptionCompat r2 = new android.support.v4.media.MediaDescriptionCompat
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r2.s = r14
            return r2
        L5a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaDescriptionCompat.a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.b) + ", " + ((Object) this.m) + ", " + ((Object) this.n);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Object obj = this.s;
        if (obj == null) {
            MediaDescription.Builder builder = new MediaDescription.Builder();
            builder.setMediaId(this.a);
            builder.setTitle(this.b);
            builder.setSubtitle(this.m);
            builder.setDescription(this.n);
            builder.setIconBitmap(this.o);
            builder.setIconUri(this.p);
            builder.setExtras(this.q);
            builder.setMediaUri(this.r);
            obj = builder.build();
            this.s = obj;
        }
        ((MediaDescription) obj).writeToParcel(parcel, i);
    }
}
