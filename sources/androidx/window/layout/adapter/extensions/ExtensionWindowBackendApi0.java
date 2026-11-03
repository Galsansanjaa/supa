package androidx.window.layout.adapter.extensions;

import android.content.Context;
import androidx.core.util.Consumer;
import androidx.window.layout.SupportedPosture;
import androidx.window.layout.WindowLayoutInfo;
import androidx.window.layout.adapter.WindowBackend;
import defpackage.oi0;
import defpackage.r;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public class ExtensionWindowBackendApi0 implements WindowBackend {
    public static /* synthetic */ void a(Consumer consumer) {
        registerLayoutChangeCallback$lambda$0(consumer);
    }

    public static final void registerLayoutChangeCallback$lambda$0(Consumer consumer) {
        consumer.accept(new WindowLayoutInfo(oi0.a));
    }

    @Override // androidx.window.layout.adapter.WindowBackend
    public WindowLayoutInfo getCurrentWindowLayoutInfo(Context context) {
        context.getClass();
        throw new UnsupportedOperationException("Extensions version must be at least 9");
    }

    @Override // androidx.window.layout.adapter.WindowBackend
    public List<SupportedPosture> getSupportedPostures() {
        throw new UnsupportedOperationException("Extensions version must be at least 6");
    }

    @Override // androidx.window.layout.adapter.WindowBackend
    public boolean hasRegisteredListeners() {
        return false;
    }

    @Override // androidx.window.layout.adapter.WindowBackend
    public void registerLayoutChangeCallback(Context context, Executor executor, Consumer<WindowLayoutInfo> consumer) {
        context.getClass();
        executor.getClass();
        consumer.getClass();
        executor.execute(new r(consumer, 14));
    }

    @Override // androidx.window.layout.adapter.WindowBackend
    public void unregisterLayoutChangeCallback(Consumer<WindowLayoutInfo> consumer) {
        consumer.getClass();
    }
}
