package androidx.compose.foundation.text.contextmenu.data;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class ProcessTextKey {
    public static final int $stable = 0;
    private final int id;

    public ProcessTextKey(int i) {
        this.id = i;
    }

    public boolean equals(Object obj) {
        return (obj instanceof ProcessTextKey) && this.id == ((ProcessTextKey) obj).id;
    }

    public final int getId() {
        return this.id;
    }

    public int hashCode() {
        return this.id;
    }
}
