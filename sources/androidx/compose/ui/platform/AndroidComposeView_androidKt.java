package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.contentcapture.ContentCaptureSessionWrapper;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.platform.coreshims.ViewCompatShims;
import androidx.compose.ui.text.input.PlatformTextInputService;
import defpackage.d1;
import defpackage.jh2;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class AndroidComposeView_androidKt {
    private static final long ONE_FRAME_120_HERTZ_IN_MILLISECONDS = 8;
    private static ps0 platformTextInputServiceInterceptor = new d1(18);

    public static /* synthetic */ PlatformTextInputService a(PlatformTextInputService platformTextInputService) {
        return platformTextInputServiceInterceptor$lambda$0(platformTextInputService);
    }

    public static final /* synthetic */ boolean access$containsDescendant(View view, View view2) {
        return containsDescendant(view, view2);
    }

    /* renamed from: access$preTranslate-cG2Xzmc */
    public static final /* synthetic */ void m7138access$preTranslatecG2Xzmc(float[] fArr, float f, float f2, float[] fArr2) {
        m7141preTranslatecG2Xzmc(fArr, f, f2, fArr2);
    }

    public static final boolean containsDescendant(View view, View view2) {
        if (jh2.k(view2, view)) {
            return false;
        }
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: dot-p89u6pk */
    private static final float m7139dotp89u6pk(float[] fArr, int i, float[] fArr2, int i2) {
        int i3 = i * 4;
        return (fArr[i3 + 3] * fArr2[12 + i2]) + (fArr[i3 + 2] * fArr2[8 + i2]) + (fArr[i3 + 1] * fArr2[4 + i2]) + (fArr[i3] * fArr2[i2]);
    }

    public static final ContentCaptureSessionWrapper getContentCaptureSessionCompat(View view) {
        ViewCompatShims.setImportantForContentCapture(view, 1);
        return ViewCompatShims.getContentCaptureSession(view);
    }

    public static final ps0 getPlatformTextInputServiceInterceptor() {
        return platformTextInputServiceInterceptor;
    }

    public static final PlatformTextInputService platformTextInputServiceInterceptor$lambda$0(PlatformTextInputService platformTextInputService) {
        return platformTextInputService;
    }

    /* renamed from: preTransform-JiSxe2E */
    public static final void m7140preTransformJiSxe2E(float[] fArr, float[] fArr2) {
        float m7139dotp89u6pk = m7139dotp89u6pk(fArr2, 0, fArr, 0);
        float m7139dotp89u6pk2 = m7139dotp89u6pk(fArr2, 0, fArr, 1);
        float m7139dotp89u6pk3 = m7139dotp89u6pk(fArr2, 0, fArr, 2);
        float m7139dotp89u6pk4 = m7139dotp89u6pk(fArr2, 0, fArr, 3);
        float m7139dotp89u6pk5 = m7139dotp89u6pk(fArr2, 1, fArr, 0);
        float m7139dotp89u6pk6 = m7139dotp89u6pk(fArr2, 1, fArr, 1);
        float m7139dotp89u6pk7 = m7139dotp89u6pk(fArr2, 1, fArr, 2);
        float m7139dotp89u6pk8 = m7139dotp89u6pk(fArr2, 1, fArr, 3);
        float m7139dotp89u6pk9 = m7139dotp89u6pk(fArr2, 2, fArr, 0);
        float m7139dotp89u6pk10 = m7139dotp89u6pk(fArr2, 2, fArr, 1);
        float m7139dotp89u6pk11 = m7139dotp89u6pk(fArr2, 2, fArr, 2);
        float m7139dotp89u6pk12 = m7139dotp89u6pk(fArr2, 2, fArr, 3);
        float m7139dotp89u6pk13 = m7139dotp89u6pk(fArr2, 3, fArr, 0);
        float m7139dotp89u6pk14 = m7139dotp89u6pk(fArr2, 3, fArr, 1);
        float m7139dotp89u6pk15 = m7139dotp89u6pk(fArr2, 3, fArr, 2);
        float m7139dotp89u6pk16 = m7139dotp89u6pk(fArr2, 3, fArr, 3);
        fArr[0] = m7139dotp89u6pk;
        fArr[1] = m7139dotp89u6pk2;
        fArr[2] = m7139dotp89u6pk3;
        fArr[3] = m7139dotp89u6pk4;
        fArr[4] = m7139dotp89u6pk5;
        fArr[5] = m7139dotp89u6pk6;
        fArr[6] = m7139dotp89u6pk7;
        fArr[7] = m7139dotp89u6pk8;
        fArr[8] = m7139dotp89u6pk9;
        fArr[9] = m7139dotp89u6pk10;
        fArr[10] = m7139dotp89u6pk11;
        fArr[11] = m7139dotp89u6pk12;
        fArr[12] = m7139dotp89u6pk13;
        fArr[13] = m7139dotp89u6pk14;
        fArr[14] = m7139dotp89u6pk15;
        fArr[15] = m7139dotp89u6pk16;
    }

    /* renamed from: preTranslate-cG2Xzmc */
    public static final void m7141preTranslatecG2Xzmc(float[] fArr, float f, float f2, float[] fArr2) {
        Matrix.m5575resetimpl(fArr2);
        Matrix.m5588translateimpl$default(fArr2, f, f2, 0.0f, 4, null);
        m7140preTransformJiSxe2E(fArr, fArr2);
    }

    public static final void setPlatformTextInputServiceInterceptor(ps0 ps0Var) {
        platformTextInputServiceInterceptor = ps0Var;
    }
}
