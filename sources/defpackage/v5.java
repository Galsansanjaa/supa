package defpackage;

import android.service.credentials.BeginGetCredentialOption;
import android.view.View;
import android.view.autofill.AutofillId;
import android.window.OnBackInvokedDispatcher;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.room.support.AutoCloser;
import java.io.EOFException;
import java.io.IOException;
import java.util.ConcurrentModificationException;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v5 implements Arrangement.SpacingAlignmentCalculator, AutoCloser.Watch, OnApplyWindowInsetsListener {
    public final /* synthetic */ int a;

    public /* synthetic */ v5(int i) {
        this.a = i;
    }

    public static /* bridge */ /* synthetic */ BeginGetCredentialOption d(Object obj) {
        return (BeginGetCredentialOption) obj;
    }

    public static /* bridge */ /* synthetic */ AutofillId e(Object obj) {
        return (AutofillId) obj;
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher f(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }

    public static /* synthetic */ void g() {
        throw new ConcurrentModificationException();
    }

    public static /* synthetic */ void h(int i, String str) {
        throw new IllegalArgumentException(str + i);
    }

    public static /* synthetic */ void j(Fragment fragment, String str) {
        throw new IllegalStateException(str + ((Object) fragment.toString()) + ((Object) " is already attached to a FragmentManager."));
    }

    public static /* synthetic */ void k(Object obj, String str) {
        throw new IOException(str + obj);
    }

    public static /* synthetic */ void l(Object obj, String str, Object obj2) {
        throw new IllegalArgumentException(str + obj + obj2);
    }

    public static /* synthetic */ void m(String str) {
        throw new IllegalArgumentException(str);
    }

    public static /* synthetic */ void n(String str, Object[] objArr) {
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    public static /* synthetic */ void p() {
        throw new EOFException();
    }

    public static /* synthetic */ void q(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void r(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    @Override // androidx.compose.foundation.layout.Arrangement.SpacingAlignmentCalculator
    public int align(int i, LayoutDirection layoutDirection) {
        int spacedBy_0680j_4$lambda$0;
        spacedBy_0680j_4$lambda$0 = Arrangement.spacedBy_0680j_4$lambda$0(i, layoutDirection);
        return spacedBy_0680j_4$lambda$0;
    }

    @Override // androidx.room.support.AutoCloser.Watch
    public long getMillis() {
        long _init_$lambda$0;
        _init_$lambda$0 = AutoCloser._init_$lambda$0();
        return _init_$lambda$0;
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        switch (this.a) {
            case 19:
                view.getClass();
                windowInsetsCompat.getClass();
                view.setPadding(0, 0, 0, 0);
                return windowInsetsCompat;
            case 20:
                view.getClass();
                windowInsetsCompat.getClass();
                Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
                insets.getClass();
                Insets insets2 = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.ime());
                insets2.getClass();
                view.setPadding(insets.left, insets.top, insets.right, Math.max(insets.bottom, insets2.bottom));
                return windowInsetsCompat;
            default:
                view.getClass();
                windowInsetsCompat.getClass();
                Insets insets3 = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
                insets3.getClass();
                view.setPadding(insets3.left, insets3.top, insets3.right, insets3.bottom);
                return windowInsetsCompat;
        }
    }
}
