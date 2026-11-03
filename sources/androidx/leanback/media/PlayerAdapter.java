package androidx.leanback.media;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public abstract class PlayerAdapter {
    Callback mCallback;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static class Callback {
        public void onBufferedPositionChanged(PlayerAdapter playerAdapter) {
        }

        public void onBufferingStateChanged(PlayerAdapter playerAdapter, boolean z) {
        }

        public void onCurrentPositionChanged(PlayerAdapter playerAdapter) {
        }

        public void onDurationChanged(PlayerAdapter playerAdapter) {
        }

        public void onError(PlayerAdapter playerAdapter, int i, String str) {
        }

        public void onMetadataChanged(PlayerAdapter playerAdapter) {
        }

        public void onPlayCompleted(PlayerAdapter playerAdapter) {
        }

        public void onPlayStateChanged(PlayerAdapter playerAdapter) {
        }

        public void onPreparedStateChanged(PlayerAdapter playerAdapter) {
        }

        public void onVideoSizeChanged(PlayerAdapter playerAdapter, int i, int i2) {
        }
    }

    public void fastForward() {
    }

    public long getBufferedPosition() {
        return 0L;
    }

    public final Callback getCallback() {
        return this.mCallback;
    }

    public long getCurrentPosition() {
        return 0L;
    }

    public long getDuration() {
        return 0L;
    }

    public long getSupportedActions() {
        return 64L;
    }

    public boolean isPlaying() {
        return false;
    }

    public boolean isPrepared() {
        return true;
    }

    public void next() {
    }

    public void onAttachedToHost(PlaybackGlueHost playbackGlueHost) {
    }

    public void onDetachedFromHost() {
    }

    public abstract void pause();

    public abstract void play();

    public void previous() {
    }

    public void rewind() {
    }

    public void seekTo(long j) {
    }

    public final void setCallback(Callback callback) {
        this.mCallback = callback;
    }

    public void setProgressUpdatingEnabled(boolean z) {
    }

    public void setRepeatAction(int i) {
    }

    public void setShuffleAction(int i) {
    }
}
