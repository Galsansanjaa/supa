package androidx.window.embedding;

import android.content.res.Configuration;
import androidx.window.layout.WindowLayoutInfo;
import androidx.window.layout.WindowMetrics;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class OverlayAttributesCalculatorParams {
    private final OverlayAttributes defaultOverlayAttributes;
    private final String overlayTag;
    private final Configuration parentConfiguration;
    private final WindowLayoutInfo parentWindowLayoutInfo;
    private final WindowMetrics parentWindowMetrics;

    public OverlayAttributesCalculatorParams(WindowMetrics windowMetrics, Configuration configuration, WindowLayoutInfo windowLayoutInfo, String str, OverlayAttributes overlayAttributes) {
        windowMetrics.getClass();
        configuration.getClass();
        windowLayoutInfo.getClass();
        str.getClass();
        overlayAttributes.getClass();
        this.parentWindowMetrics = windowMetrics;
        this.parentConfiguration = configuration;
        this.parentWindowLayoutInfo = windowLayoutInfo;
        this.overlayTag = str;
        this.defaultOverlayAttributes = overlayAttributes;
    }

    public final OverlayAttributes getDefaultOverlayAttributes() {
        return this.defaultOverlayAttributes;
    }

    public final String getOverlayTag() {
        return this.overlayTag;
    }

    public final Configuration getParentConfiguration() {
        return this.parentConfiguration;
    }

    public final WindowLayoutInfo getParentWindowLayoutInfo() {
        return this.parentWindowLayoutInfo;
    }

    public final WindowMetrics getParentWindowMetrics() {
        return this.parentWindowMetrics;
    }

    public String toString() {
        return OverlayAttributesCalculatorParams.class + ":{parentWindowMetrics=" + this.parentWindowMetrics + "parentConfiguration=" + this.parentConfiguration + "parentWindowLayoutInfo=" + this.parentWindowLayoutInfo + "overlayTag=" + this.overlayTag + "defaultOverlayAttributes=" + this.defaultOverlayAttributes;
    }
}
