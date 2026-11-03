package androidx.core.graphics;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class CanvasKt {
    public static final void withClip(Canvas canvas, float f, float f2, float f3, float f4, ps0 ps0Var) {
        int save = canvas.save();
        canvas.clipRect(f, f2, f3, f4);
        try {
            ps0Var.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void withClip(Canvas canvas, int i, int i2, int i3, int i4, ps0 ps0Var) {
        int save = canvas.save();
        canvas.clipRect(i, i2, i3, i4);
        try {
            ps0Var.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void withClip(Canvas canvas, Path path, ps0 ps0Var) {
        int save = canvas.save();
        canvas.clipPath(path);
        try {
            ps0Var.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void withClip(Canvas canvas, Rect rect, ps0 ps0Var) {
        int save = canvas.save();
        canvas.clipRect(rect);
        try {
            ps0Var.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void withClip(Canvas canvas, RectF rectF, ps0 ps0Var) {
        int save = canvas.save();
        canvas.clipRect(rectF);
        try {
            ps0Var.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void withMatrix(Canvas canvas, Matrix matrix, ps0 ps0Var) {
        int save = canvas.save();
        canvas.concat(matrix);
        try {
            ps0Var.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static void withMatrix$default(Canvas canvas, Matrix matrix, ps0 ps0Var, int i, Object obj) {
        if ((i & 1) != 0) {
            matrix = new Matrix();
        }
        int save = canvas.save();
        canvas.concat(matrix);
        try {
            ps0Var.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void withRotation(Canvas canvas, float f, float f2, float f3, ps0 ps0Var) {
        int save = canvas.save();
        canvas.rotate(f, f2, f3);
        try {
            ps0Var.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static void withRotation$default(Canvas canvas, float f, float f2, float f3, ps0 ps0Var, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        int save = canvas.save();
        canvas.rotate(f, f2, f3);
        try {
            ps0Var.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void withSave(Canvas canvas, ps0 ps0Var) {
        int save = canvas.save();
        try {
            ps0Var.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void withScale(Canvas canvas, float f, float f2, float f3, float f4, ps0 ps0Var) {
        int save = canvas.save();
        canvas.scale(f, f2, f3, f4);
        try {
            ps0Var.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static void withScale$default(Canvas canvas, float f, float f2, float f3, float f4, ps0 ps0Var, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        int save = canvas.save();
        canvas.scale(f, f2, f3, f4);
        try {
            ps0Var.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void withSkew(Canvas canvas, float f, float f2, ps0 ps0Var) {
        int save = canvas.save();
        canvas.skew(f, f2);
        try {
            ps0Var.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static void withSkew$default(Canvas canvas, float f, float f2, ps0 ps0Var, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        int save = canvas.save();
        canvas.skew(f, f2);
        try {
            ps0Var.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void withTranslation(Canvas canvas, float f, float f2, ps0 ps0Var) {
        int save = canvas.save();
        canvas.translate(f, f2);
        try {
            ps0Var.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static void withTranslation$default(Canvas canvas, float f, float f2, ps0 ps0Var, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        int save = canvas.save();
        canvas.translate(f, f2);
        try {
            ps0Var.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }
}
