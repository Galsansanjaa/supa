package androidx.credentials.exceptions.domerrors;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public abstract class DomError {
    private final String type;

    public DomError(String str) {
        str.getClass();
        this.type = str;
    }

    public String getType() {
        return this.type;
    }
}
