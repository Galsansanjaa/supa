package androidx.compose.foundation.layout;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class Fr {
    private final float value;

    private /* synthetic */ Fr(float f) {
        this.value = f;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Fr m938boximpl(float f) {
        return new Fr(f);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static float m939constructorimpl(float f) {
        return f;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m940equalsimpl(float f, Object obj) {
        return (obj instanceof Fr) && Float.compare(f, ((Fr) obj).m944unboximpl()) == 0;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m941equalsimpl0(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m942hashCodeimpl(float f) {
        return Float.floatToIntBits(f);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m943toStringimpl(float f) {
        return f + ".fr";
    }

    public boolean equals(Object obj) {
        return m940equalsimpl(this.value, obj);
    }

    public final float getValue() {
        return this.value;
    }

    public int hashCode() {
        return m942hashCodeimpl(this.value);
    }

    public String toString() {
        return m943toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ float m944unboximpl() {
        return this.value;
    }
}
