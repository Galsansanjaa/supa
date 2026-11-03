package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Messenger;
import android.support.v4.media.session.MediaSessionCompat$Token;
import androidx.collection.ArrayMap;
import androidx.media.MediaBrowserProtocol;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public class jj1 implements hj1 {
    public final Context a;
    public final MediaBrowser b;
    public final Bundle c;
    public final gj1 d = new gj1(this);
    public final ArrayMap e = new ArrayMap();
    public xk0 f;
    public Messenger g;
    public MediaSessionCompat$Token h;

    public jj1(Context context, ComponentName componentName, ij1 ij1Var) {
        this.a = context;
        Bundle bundle = new Bundle();
        this.c = bundle;
        bundle.putInt(MediaBrowserProtocol.EXTRA_CLIENT_VERSION, 1);
        ij1Var.setInternalConnectionCallback(this);
        this.b = new MediaBrowser(context, componentName, (MediaBrowser.ConnectionCallback) ij1Var.mConnectionCallbackObj, bundle);
    }
}
