package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.support.v4.media.MediaMetadataCompat;
import defpackage.e01;
import defpackage.jm3;
import defpackage.nj1;
import defpackage.qj1;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public abstract class a implements IBinder.DeathRecipient {
    final Object mCallbackObj = new c(new jm3(this));
    nj1 mHandler;
    e01 mIControllerCallback;

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
        postToHandler(8, null, null);
    }

    public e01 getIControllerCallback() {
        return this.mIControllerCallback;
    }

    public void onAudioInfoChanged(qj1 qj1Var) {
    }

    public void onCaptioningEnabledChanged(boolean z) {
    }

    public void onExtrasChanged(Bundle bundle) {
    }

    public abstract void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat);

    public abstract void onPlaybackStateChanged(PlaybackStateCompat playbackStateCompat);

    public void onQueueChanged(List<MediaSessionCompat$QueueItem> list) {
    }

    public void onQueueTitleChanged(CharSequence charSequence) {
    }

    public void onRepeatModeChanged(int i) {
    }

    public void onSessionDestroyed() {
    }

    public void onSessionEvent(String str, Bundle bundle) {
    }

    public void onSessionReady() {
    }

    public void onShuffleModeChanged(int i) {
    }

    public void postToHandler(int i, Object obj, Bundle bundle) {
        nj1 nj1Var = this.mHandler;
        if (nj1Var != null) {
            Message obtainMessage = nj1Var.obtainMessage(i, obj);
            obtainMessage.setData(bundle);
            obtainMessage.sendToTarget();
        }
    }

    public void setHandler(Handler handler) {
        if (handler != null) {
            nj1 nj1Var = new nj1(this, handler.getLooper());
            this.mHandler = nj1Var;
            nj1Var.a = true;
        } else {
            nj1 nj1Var2 = this.mHandler;
            if (nj1Var2 != null) {
                nj1Var2.a = false;
                nj1Var2.removeCallbacksAndMessages(null);
                this.mHandler = null;
            }
        }
    }
}
