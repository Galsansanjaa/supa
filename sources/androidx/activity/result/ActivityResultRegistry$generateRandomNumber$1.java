package androidx.activity.result;

import defpackage.b1;
import defpackage.bb1;
import defpackage.m32;
import defpackage.os0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class ActivityResultRegistry$generateRandomNumber$1 extends bb1 implements os0 {
    public static final ActivityResultRegistry$generateRandomNumber$1 INSTANCE = new ActivityResultRegistry$generateRandomNumber$1();

    public ActivityResultRegistry$generateRandomNumber$1() {
        super(0);
    }

    @Override // defpackage.os0
    public final Integer invoke() {
        b1 b1Var = m32.a;
        return Integer.valueOf(m32.a.a().nextInt(2147418112) + 65536);
    }
}
