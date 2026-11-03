package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.FilterQuality;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import defpackage.jh2;
import defpackage.kh0;
import defpackage.lt;
import defpackage.sb0;
import defpackage.v5;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class BitmapPainter extends Painter {
    public static final int $stable = 8;
    private float alpha;
    private ColorFilter colorFilter;
    private int filterQuality;
    private final ImageBitmap image;
    private final long size;
    private final long srcOffset;
    private final long srcSize;

    private BitmapPainter(ImageBitmap imageBitmap, long j, long j2) {
        this.image = imageBitmap;
        this.srcOffset = j;
        this.srcSize = j2;
        this.filterQuality = FilterQuality.Companion.m5432getLowfv9h1I();
        this.size = m5967validateSizeN5eqBDc(j, j2);
        this.alpha = 1.0f;
    }

    public /* synthetic */ BitmapPainter(ImageBitmap imageBitmap, long j, long j2, int i, sb0 sb0Var) {
        this(imageBitmap, (i & 2) != 0 ? IntOffset.Companion.m8184getZeronOccac() : j, (i & 4) != 0 ? IntSize.m8211constructorimpl((imageBitmap.getHeight() & 4294967295L) | (imageBitmap.getWidth() << 32)) : j2, null);
    }

    public /* synthetic */ BitmapPainter(ImageBitmap imageBitmap, long j, long j2, sb0 sb0Var) {
        this(imageBitmap, j, j2);
    }

    /* renamed from: validateSize-N5eqBDc, reason: not valid java name */
    private final long m5967validateSizeN5eqBDc(long j, long j2) {
        int i;
        int i2;
        if (IntOffset.m8173getXimpl(j) >= 0 && IntOffset.m8174getYimpl(j) >= 0 && (i = (int) (j2 >> 32)) >= 0 && (i2 = (int) (4294967295L & j2)) >= 0 && i <= this.image.getWidth() && i2 <= this.image.getHeight()) {
            return j2;
        }
        v5.m("Failed requirement.");
        return 0L;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public boolean applyAlpha(float f) {
        this.alpha = f;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public boolean applyColorFilter(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BitmapPainter)) {
            return false;
        }
        BitmapPainter bitmapPainter = (BitmapPainter) obj;
        return jh2.k(this.image, bitmapPainter.image) && IntOffset.m8172equalsimpl0(this.srcOffset, bitmapPainter.srcOffset) && IntSize.m8214equalsimpl0(this.srcSize, bitmapPainter.srcSize) && FilterQuality.m5427equalsimpl0(this.filterQuality, bitmapPainter.filterQuality);
    }

    /* renamed from: getFilterQuality-f-v9h1I$ui_graphics, reason: not valid java name */
    public final int m5968getFilterQualityfv9h1I$ui_graphics() {
        return this.filterQuality;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long mo5598getIntrinsicSizeNHjbRc() {
        return IntSizeKt.m8228toSizeozmzZPI(this.size);
    }

    public int hashCode() {
        return FilterQuality.m5428hashCodeimpl(this.filterQuality) + ((IntSize.m8217hashCodeimpl(this.srcSize) + ((IntOffset.m8175hashCodeimpl(this.srcOffset) + (this.image.hashCode() * 31)) * 31)) * 31);
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public void onDraw(DrawScope drawScope) {
        kh0.d(drawScope, this.image, this.srcOffset, this.srcSize, 0L, IntSize.m8211constructorimpl((Math.round(Float.intBitsToFloat((int) (drawScope.mo5824getSizeNHjbRc() & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (drawScope.mo5824getSizeNHjbRc() >> 32))) << 32)), this.alpha, null, this.colorFilter, 0, this.filterQuality, 328, null);
    }

    /* renamed from: setFilterQuality-vDHp3xo$ui_graphics, reason: not valid java name */
    public final void m5969setFilterQualityvDHp3xo$ui_graphics(int i) {
        this.filterQuality = i;
    }

    public String toString() {
        ImageBitmap imageBitmap = this.image;
        String m8180toStringimpl = IntOffset.m8180toStringimpl(this.srcOffset);
        String m8219toStringimpl = IntSize.m8219toStringimpl(this.srcSize);
        String m5429toStringimpl = FilterQuality.m5429toStringimpl(this.filterQuality);
        StringBuilder sb = new StringBuilder("BitmapPainter(image=");
        sb.append(imageBitmap);
        sb.append(", srcOffset=");
        sb.append(m8180toStringimpl);
        sb.append(", srcSize=");
        return lt.B(sb, m8219toStringimpl, ", filterQuality=", m5429toStringimpl, ")");
    }
}
