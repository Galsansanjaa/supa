package androidx.window.embedding;

import androidx.window.embedding.OverlayAttributes;
import defpackage.a52;
import defpackage.g61;
import defpackage.sb0;
import defpackage.um2;
import java.util.UUID;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class OverlayCreateParams {
    public static final Companion Companion = new Companion(null);
    private final OverlayAttributes overlayAttributes;
    private final String tag;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes4.dex */
    public static final class Builder {
        private OverlayAttributes launchAttrs;
        private String tag;

        public final OverlayCreateParams build() {
            String str = this.tag;
            if (str == null) {
                str = OverlayCreateParams.Companion.generateOverlayTag();
            }
            OverlayAttributes overlayAttributes = this.launchAttrs;
            if (overlayAttributes == null) {
                overlayAttributes = new OverlayAttributes.Builder().build();
            }
            return new OverlayCreateParams(str, overlayAttributes);
        }

        public final Builder setOverlayAttributes(OverlayAttributes overlayAttributes) {
            overlayAttributes.getClass();
            this.launchAttrs = overlayAttributes;
            return this;
        }

        public final Builder setTag(String str) {
            str.getClass();
            this.tag = str;
            return this;
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [g61, i61] */
        public final String generateOverlayTag() {
            String uuid = UUID.randomUUID().toString();
            uuid.getClass();
            return um2.G0(uuid, new g61(0, 32, 1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OverlayCreateParams() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OverlayCreateParams(String str) {
        this(str, null, 2, 0 == true ? 1 : 0);
        str.getClass();
    }

    public OverlayCreateParams(String str, OverlayAttributes overlayAttributes) {
        str.getClass();
        overlayAttributes.getClass();
        this.tag = str;
        this.overlayAttributes = overlayAttributes;
    }

    public /* synthetic */ OverlayCreateParams(String str, OverlayAttributes overlayAttributes, int i, sb0 sb0Var) {
        this((i & 1) != 0 ? Companion.generateOverlayTag() : str, (i & 2) != 0 ? new OverlayAttributes.Builder().build() : overlayAttributes);
    }

    public static final String generateOverlayTag() {
        return Companion.generateOverlayTag();
    }

    public final OverlayAttributes getOverlayAttributes() {
        return this.overlayAttributes;
    }

    public final String getTag() {
        return this.tag;
    }

    public String toString() {
        return a52.a(OverlayCreateParams.class).c() + ":{ , tag=" + this.tag + ", attrs=" + this.overlayAttributes + '}';
    }
}
