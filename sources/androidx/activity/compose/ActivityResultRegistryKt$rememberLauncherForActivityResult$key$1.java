package androidx.activity.compose;

import defpackage.bb1;
import defpackage.os0;
import java.util.UUID;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class ActivityResultRegistryKt$rememberLauncherForActivityResult$key$1 extends bb1 implements os0 {
    public static final ActivityResultRegistryKt$rememberLauncherForActivityResult$key$1 INSTANCE = new ActivityResultRegistryKt$rememberLauncherForActivityResult$key$1();

    public ActivityResultRegistryKt$rememberLauncherForActivityResult$key$1() {
        super(0);
    }

    @Override // defpackage.os0
    public final String invoke() {
        return UUID.randomUUID().toString();
    }
}
