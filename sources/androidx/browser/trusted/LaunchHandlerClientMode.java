package androidx.browser.trusted;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class LaunchHandlerClientMode {
    public static final int AUTO = 0;
    public static final int FOCUS_EXISTING = 2;
    public static final int NAVIGATE_EXISTING = 1;
    public static final int NAVIGATE_NEW = 3;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface ClientMode {
    }

    private LaunchHandlerClientMode() {
    }
}
