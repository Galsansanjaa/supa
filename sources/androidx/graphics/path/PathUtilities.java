package androidx.graphics.path;

import android.graphics.Path;
import androidx.graphics.path.PathIterator;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class PathUtilities {
    public static final PathIterator iterator(Path path) {
        path.getClass();
        return new PathIterator(path, null, 0.0f, 6, null);
    }

    public static final PathIterator iterator(Path path, PathIterator.ConicEvaluation conicEvaluation, float f) {
        path.getClass();
        conicEvaluation.getClass();
        return new PathIterator(path, conicEvaluation, f);
    }

    public static /* synthetic */ PathIterator iterator$default(Path path, PathIterator.ConicEvaluation conicEvaluation, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 0.25f;
        }
        return iterator(path, conicEvaluation, f);
    }
}
