package androidx.window.area;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class EmptyDecorator implements WindowAreaControllerDecorator {
    public static final EmptyDecorator INSTANCE = new EmptyDecorator();

    private EmptyDecorator() {
    }

    @Override // androidx.window.area.WindowAreaControllerDecorator
    public WindowAreaController decorate(WindowAreaController windowAreaController) {
        windowAreaController.getClass();
        return windowAreaController;
    }
}
