package androidx.compose.runtime.tooling;

import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class ComposeStackTrace {
    public static final int $stable = 8;
    private final List<ComposeStackTraceFrame> frames;
    private final boolean hasSourceInformation;

    public ComposeStackTrace(List<ComposeStackTraceFrame> list, boolean z) {
        this.frames = list;
        this.hasSourceInformation = z;
    }

    public final List<ComposeStackTraceFrame> getFrames() {
        return this.frames;
    }

    public final boolean getHasSourceInformation() {
        return this.hasSourceInformation;
    }
}
