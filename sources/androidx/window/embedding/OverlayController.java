package androidx.window.embedding;

import android.content.Context;
import android.os.Bundle;
import defpackage.ea0;
import defpackage.jp0;
import defpackage.ps0;
import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class OverlayController {
    public static final Companion Companion = new Companion(null);
    public static final int OVERLAY_FEATURE_VERSION = 8;
    private final EmbeddingBackend backend;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        public final OverlayController getInstance(Context context) {
            context.getClass();
            return new OverlayController(EmbeddingBackend.Companion.getInstance(context));
        }
    }

    public OverlayController(EmbeddingBackend embeddingBackend) {
        embeddingBackend.getClass();
        this.backend = embeddingBackend;
    }

    public static final /* synthetic */ EmbeddingBackend access$getBackend$p(OverlayController overlayController) {
        return overlayController.backend;
    }

    public static final OverlayController getInstance(Context context) {
        return Companion.getInstance(context);
    }

    public final void clearOverlayAttributesCalculator() {
        this.backend.clearOverlayAttributesCalculator();
    }

    public final jp0 overlayInfo(String str) {
        str.getClass();
        return ea0.i(new OverlayController$overlayInfo$1(this, str, null));
    }

    public final void setOverlayAttributesCalculator(ps0 ps0Var) {
        ps0Var.getClass();
        this.backend.setOverlayAttributesCalculator(ps0Var);
    }

    public final Bundle setOverlayCreateParams$window_release(Bundle bundle, OverlayCreateParams overlayCreateParams) {
        bundle.getClass();
        overlayCreateParams.getClass();
        return this.backend.setOverlayCreateParams(bundle, overlayCreateParams);
    }

    public final void updateOverlayAttributes(String str, OverlayAttributes overlayAttributes) {
        str.getClass();
        overlayAttributes.getClass();
        this.backend.updateOverlayAttributes(str, overlayAttributes);
    }
}
