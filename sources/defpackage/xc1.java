package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class xc1 {
    public final /* synthetic */ yc1 a;

    public xc1(yc1 yc1Var) {
        this.a = yc1Var;
    }

    public final void a() {
        yc1 yc1Var = this.a;
        if (!yc1Var.n) {
            yc1Var.o.invoke();
            return;
        }
        ox1 ox1Var = yc1Var.m;
        x93 youtubePlayer$core_release = yc1Var.getWebViewYouTubePlayer$core_release().getYoutubePlayer$core_release();
        ox1Var.getClass();
        youtubePlayer$core_release.getClass();
        String str = ox1Var.d;
        if (str == null) {
            return;
        }
        boolean z = ox1Var.b;
        rx1 rx1Var = rx1.m;
        if (z && ox1Var.c == rx1Var) {
            boolean z2 = ox1Var.a;
            float f = ox1Var.e;
            if (z2) {
                ((da3) youtubePlayer$core_release).d(str, f);
            } else {
                ((da3) youtubePlayer$core_release).b(str, f);
            }
        } else if (!z && ox1Var.c == rx1Var) {
            ((da3) youtubePlayer$core_release).b(str, ox1Var.e);
        }
        ox1Var.c = null;
    }
}
