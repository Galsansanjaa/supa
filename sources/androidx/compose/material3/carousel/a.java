package androidx.compose.material3.carousel;

import defpackage.os0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements os0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CarouselPageSize b;

    public /* synthetic */ a(CarouselPageSize carouselPageSize, int i) {
        this.a = i;
        this.b = carouselPageSize;
    }

    @Override // defpackage.os0
    public final Object invoke() {
        int i = this.a;
        CarouselPageSize carouselPageSize = this.b;
        switch (i) {
            case 0:
                return CarouselKt$Carousel$2.a(carouselPageSize);
            default:
                return CarouselKt$Carousel$4.a(carouselPageSize);
        }
    }
}
