package androidx.compose.ui.platform;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class InspectorInfo {
    public static final int $stable = 8;
    private String name;
    private final ValueElementSequence properties = new ValueElementSequence();
    private Object value;

    public final String getName() {
        return this.name;
    }

    public final ValueElementSequence getProperties() {
        return this.properties;
    }

    public final Object getValue() {
        return this.value;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setValue(Object obj) {
        this.value = obj;
    }
}
