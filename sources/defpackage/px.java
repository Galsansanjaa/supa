package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class px implements a10 {
    public static final px b = new px(0);
    public static final px m = new px(1);
    public final /* synthetic */ int a;

    public /* synthetic */ px(int i) {
        this.a = i;
    }

    private final void a(Object obj) {
    }

    @Override // defpackage.a10
    public final j20 getContext() {
        switch (this.a) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return mi0.a;
        }
    }

    @Override // defpackage.a10
    public final void resumeWith(Object obj) {
        switch (this.a) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "This continuation is already complete";
            default:
                return super.toString();
        }
    }
}
