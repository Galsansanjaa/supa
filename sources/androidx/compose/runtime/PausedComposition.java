package androidx.compose.runtime;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public interface PausedComposition {
    void apply();

    void cancel();

    boolean isApplied();

    boolean isCancelled();

    boolean isComplete();

    boolean resume(ShouldPauseCallback shouldPauseCallback);
}
