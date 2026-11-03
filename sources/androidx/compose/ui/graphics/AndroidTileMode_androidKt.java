package androidx.compose.ui.graphics;

import android.graphics.Shader;
import android.os.Build;
import androidx.compose.ui.graphics.TileMode;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class AndroidTileMode_androidKt {

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Shader.TileMode.values().length];
            try {
                iArr[Shader.TileMode.CLAMP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Shader.TileMode.MIRROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Shader.TileMode.REPEAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: isSupported-0vamqd0, reason: not valid java name */
    public static final boolean m5240isSupported0vamqd0(int i) {
        return Build.VERSION.SDK_INT >= 31 || !TileMode.m5722equalsimpl0(i, TileMode.Companion.m5727getDecal3opZhB0());
    }

    /* renamed from: toAndroidTileMode-0vamqd0, reason: not valid java name */
    public static final Shader.TileMode m5241toAndroidTileMode0vamqd0(int i) {
        TileMode.Companion companion = TileMode.Companion;
        if (TileMode.m5722equalsimpl0(i, companion.m5726getClamp3opZhB0())) {
            return Shader.TileMode.CLAMP;
        }
        if (TileMode.m5722equalsimpl0(i, companion.m5729getRepeated3opZhB0())) {
            return Shader.TileMode.REPEAT;
        }
        if (TileMode.m5722equalsimpl0(i, companion.m5728getMirror3opZhB0())) {
            return Shader.TileMode.MIRROR;
        }
        if (TileMode.m5722equalsimpl0(i, companion.m5727getDecal3opZhB0()) && Build.VERSION.SDK_INT >= 31) {
            return TileModeVerificationHelper.INSTANCE.getFrameworkTileModeDecal();
        }
        return Shader.TileMode.CLAMP;
    }

    public static final int toComposeTileMode(Shader.TileMode tileMode) {
        Shader.TileMode tileMode2;
        int i = WhenMappings.$EnumSwitchMapping$0[tileMode.ordinal()];
        if (i == 1) {
            return TileMode.Companion.m5726getClamp3opZhB0();
        }
        if (i == 2) {
            return TileMode.Companion.m5728getMirror3opZhB0();
        }
        if (i == 3) {
            return TileMode.Companion.m5729getRepeated3opZhB0();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            tileMode2 = Shader.TileMode.DECAL;
            if (tileMode == tileMode2) {
                return TileModeVerificationHelper.INSTANCE.m5730getComposeTileModeDecal3opZhB0();
            }
        }
        return TileMode.Companion.m5726getClamp3opZhB0();
    }
}
