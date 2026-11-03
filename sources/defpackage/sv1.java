package defpackage;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.graphics.Path;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class sv1 {
    public static final /* synthetic */ int a = 0;

    static {
        Path.Companion companion = Path.Companion;
    }

    public static /* synthetic */ void a(Path path, Path path2, long j, int i, Object obj) {
        if (obj != null) {
            f31.f("Super calls with default arguments not supported in this target, function: addPath-Uv8p0NA");
            return;
        }
        if ((i & 2) != 0) {
            j = Offset.Companion.m5106getZeroF1C5BW0();
        }
        path.mo5225addPathUv8p0NA(path2, j);
    }

    public static /* synthetic */ void b(Path path, Rect rect, Path.Direction direction, int i, Object obj) {
        if (obj != null) {
            f31.f("Super calls with default arguments not supported in this target, function: addRect");
            return;
        }
        if ((i & 2) != 0) {
            direction = Path.Direction.CounterClockwise;
        }
        path.addRect(rect, direction);
    }

    public static /* synthetic */ void c(Path path, RoundRect roundRect, Path.Direction direction, int i, Object obj) {
        if (obj != null) {
            f31.f("Super calls with default arguments not supported in this target, function: addRoundRect");
            return;
        }
        if ((i & 2) != 0) {
            direction = Path.Direction.CounterClockwise;
        }
        path.addRoundRect(roundRect, direction);
    }
}
