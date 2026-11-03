package androidx.vectordrawable.graphics.drawable;

import android.content.Context;
import android.content.res.Resources;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public class AnimationUtilsCompat {
    private AnimationUtilsCompat() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x00ba, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.view.animation.Interpolator createInterpolatorFromXml(android.content.Context r3, android.content.res.Resources r4, android.content.res.Resources.Theme r5, org.xmlpull.v1.XmlPullParser r6) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            int r4 = r6.getDepth()
            r5 = 0
            r0 = r5
        L6:
            int r1 = r6.next()
            r2 = 3
            if (r1 != r2) goto L13
            int r2 = r6.getDepth()
            if (r2 <= r4) goto Lba
        L13:
            r2 = 1
            if (r1 == r2) goto Lba
            r2 = 2
            if (r1 == r2) goto L1a
            goto L6
        L1a:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r6)
            java.lang.String r1 = r6.getName()
            java.lang.String r2 = "linearInterpolator"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L30
            android.view.animation.LinearInterpolator r0 = new android.view.animation.LinearInterpolator
            r0.<init>()
            goto L6
        L30:
            java.lang.String r2 = "accelerateInterpolator"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L3f
            android.view.animation.AccelerateInterpolator r1 = new android.view.animation.AccelerateInterpolator
            r1.<init>(r3, r0)
        L3d:
            r0 = r1
            goto L6
        L3f:
            java.lang.String r2 = "decelerateInterpolator"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L4d
            android.view.animation.DecelerateInterpolator r1 = new android.view.animation.DecelerateInterpolator
            r1.<init>(r3, r0)
            goto L3d
        L4d:
            java.lang.String r2 = "accelerateDecelerateInterpolator"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L5b
            android.view.animation.AccelerateDecelerateInterpolator r0 = new android.view.animation.AccelerateDecelerateInterpolator
            r0.<init>()
            goto L6
        L5b:
            java.lang.String r2 = "cycleInterpolator"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L69
            android.view.animation.CycleInterpolator r1 = new android.view.animation.CycleInterpolator
            r1.<init>(r3, r0)
            goto L3d
        L69:
            java.lang.String r2 = "anticipateInterpolator"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L77
            android.view.animation.AnticipateInterpolator r1 = new android.view.animation.AnticipateInterpolator
            r1.<init>(r3, r0)
            goto L3d
        L77:
            java.lang.String r2 = "overshootInterpolator"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L85
            android.view.animation.OvershootInterpolator r1 = new android.view.animation.OvershootInterpolator
            r1.<init>(r3, r0)
            goto L3d
        L85:
            java.lang.String r2 = "anticipateOvershootInterpolator"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L93
            android.view.animation.AnticipateOvershootInterpolator r1 = new android.view.animation.AnticipateOvershootInterpolator
            r1.<init>(r3, r0)
            goto L3d
        L93:
            java.lang.String r2 = "bounceInterpolator"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto La2
            android.view.animation.BounceInterpolator r0 = new android.view.animation.BounceInterpolator
            r0.<init>()
            goto L6
        La2:
            java.lang.String r2 = "pathInterpolator"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Lb0
            androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat r1 = new androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat
            r1.<init>(r3, r0, r6)
            goto L3d
        Lb0:
            java.lang.String r3 = "Unknown interpolator name: "
            java.lang.String r4 = r6.getName()
            defpackage.hu2.g(r4, r3)
            return r5
        Lba:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.graphics.drawable.AnimationUtilsCompat.createInterpolatorFromXml(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser):android.view.animation.Interpolator");
    }

    public static Interpolator loadInterpolator(Context context, int i) throws Resources.NotFoundException {
        return AnimationUtils.loadInterpolator(context, i);
    }
}
