package androidx.window.layout.adapter;

import android.content.Context;
import androidx.core.util.Consumer;
import androidx.window.layout.SupportedPosture;
import androidx.window.layout.WindowLayoutInfo;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public interface WindowBackend {
    WindowLayoutInfo getCurrentWindowLayoutInfo(Context context);

    List<SupportedPosture> getSupportedPostures();

    boolean hasRegisteredListeners();

    void registerLayoutChangeCallback(Context context, Executor executor, Consumer<WindowLayoutInfo> consumer);

    void unregisterLayoutChangeCallback(Consumer<WindowLayoutInfo> consumer);
}
