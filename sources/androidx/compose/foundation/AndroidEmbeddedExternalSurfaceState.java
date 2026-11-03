package androidx.compose.foundation;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import androidx.compose.ui.unit.IntSize;
import defpackage.y40;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class AndroidEmbeddedExternalSurfaceState extends BaseAndroidExternalSurfaceState implements TextureView.SurfaceTextureListener {
    private final Matrix matrix;
    private long surfaceSize;
    private Surface surfaceTextureSurface;

    public AndroidEmbeddedExternalSurfaceState(y40 y40Var) {
        super(y40Var);
        this.surfaceSize = IntSize.Companion.m8221getZeroYbymL2g();
        this.matrix = new Matrix();
    }

    public final Matrix getMatrix() {
        return this.matrix;
    }

    /* renamed from: getSurfaceSize-YbymL2g, reason: not valid java name */
    public final long m302getSurfaceSizeYbymL2g() {
        return this.surfaceSize;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (!IntSize.m8214equalsimpl0(this.surfaceSize, IntSize.Companion.m8221getZeroYbymL2g())) {
            long j = this.surfaceSize;
            int i3 = (int) (j >> 32);
            i2 = (int) (j & 4294967295L);
            surfaceTexture.setDefaultBufferSize(i3, i2);
            i = i3;
        }
        Surface surface = new Surface(surfaceTexture);
        this.surfaceTextureSurface = surface;
        dispatchSurfaceCreated(surface, i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        Surface surface = this.surfaceTextureSurface;
        surface.getClass();
        dispatchSurfaceDestroyed(surface);
        this.surfaceTextureSurface = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        if (!IntSize.m8214equalsimpl0(this.surfaceSize, IntSize.Companion.m8221getZeroYbymL2g())) {
            long j = this.surfaceSize;
            int i3 = (int) (j >> 32);
            i2 = (int) (j & 4294967295L);
            surfaceTexture.setDefaultBufferSize(i3, i2);
            i = i3;
        }
        Surface surface = this.surfaceTextureSurface;
        surface.getClass();
        dispatchSurfaceChanged(surface, i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    /* renamed from: setSurfaceSize-ozmzZPI, reason: not valid java name */
    public final void m303setSurfaceSizeozmzZPI(long j) {
        this.surfaceSize = j;
    }
}
