package androidx.tracing;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class TraceApi29Impl {
    private TraceApi29Impl() {
    }

    public static void beginAsyncSection(String str, int i) {
        android.os.Trace.beginAsyncSection(str, i);
    }

    public static void endAsyncSection(String str, int i) {
        android.os.Trace.endAsyncSection(str, i);
    }

    public static boolean isEnabled() {
        return android.os.Trace.isEnabled();
    }

    public static void setCounter(String str, int i) {
        android.os.Trace.setCounter(str, i);
    }
}
