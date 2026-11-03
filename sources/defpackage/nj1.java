package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.a;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class nj1 extends Handler {
    public boolean a;
    public final /* synthetic */ a b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nj1(a aVar, Looper looper) {
        super(looper);
        this.b = aVar;
        this.a = false;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.a) {
            int i = message.what;
            a aVar = this.b;
            switch (i) {
                case 1:
                    Bundle data = message.getData();
                    vj1.a(data);
                    aVar.onSessionEvent((String) message.obj, data);
                    return;
                case 2:
                    aVar.onPlaybackStateChanged((PlaybackStateCompat) message.obj);
                    return;
                case 3:
                    aVar.onMetadataChanged((MediaMetadataCompat) message.obj);
                    return;
                case 4:
                    aVar.onAudioInfoChanged((qj1) message.obj);
                    return;
                case 5:
                    aVar.onQueueChanged((List) message.obj);
                    return;
                case 6:
                    aVar.onQueueTitleChanged((CharSequence) message.obj);
                    return;
                case 7:
                    Bundle bundle = (Bundle) message.obj;
                    vj1.a(bundle);
                    aVar.onExtrasChanged(bundle);
                    return;
                case 8:
                    aVar.onSessionDestroyed();
                    return;
                case 9:
                    aVar.onRepeatModeChanged(((Integer) message.obj).intValue());
                    return;
                case 10:
                default:
                    return;
                case 11:
                    aVar.onCaptioningEnabledChanged(((Boolean) message.obj).booleanValue());
                    return;
                case 12:
                    aVar.onShuffleModeChanged(((Integer) message.obj).intValue());
                    return;
                case 13:
                    aVar.onSessionReady();
                    return;
            }
        }
    }
}
