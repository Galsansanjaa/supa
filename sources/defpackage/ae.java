package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class ae extends n72 {
    public final Context a;
    public final Object b = new Object();
    public AssetManager c;

    public ae(Context context) {
        this.a = context;
    }

    @Override // defpackage.n72
    public final boolean b(xx0 xx0Var) {
        Uri uri = (Uri) xx0Var.h;
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }

    @Override // defpackage.n72
    public final m72 e(xx0 xx0Var, int i) {
        AssetManager assetManager = this.c;
        if (assetManager == null) {
            synchronized (this.b) {
                try {
                    assetManager = this.c;
                    if (assetManager == null) {
                        assetManager = this.a.getAssets();
                        this.c = assetManager;
                    }
                } finally {
                }
            }
        }
        return new m72(ls1.b(assetManager.open(((Uri) xx0Var.h).toString().substring(22))), 2);
    }
}
