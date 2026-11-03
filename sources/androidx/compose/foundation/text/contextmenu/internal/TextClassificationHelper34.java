package androidx.compose.foundation.text.contextmenu.internal;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.os.Build;
import android.util.Log;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
final class TextClassificationHelper34 {
    public static final TextClassificationHelper34 INSTANCE = new TextClassificationHelper34();

    private TextClassificationHelper34() {
    }

    public final void sendIntentAllowBackgroundActivityStart(PendingIntent pendingIntent) {
        try {
            ActivityOptions makeBasic = ActivityOptions.makeBasic();
            if (Build.VERSION.SDK_INT >= 36) {
                makeBasic.setPendingIntentBackgroundActivityStartMode(4);
            } else {
                makeBasic.setPendingIntentBackgroundActivityStartMode(1);
            }
            pendingIntent.send(makeBasic.toBundle());
        } catch (PendingIntent.CanceledException e) {
            Log.e(TextContextMenuTextClassificationHelper_androidKt.TAG, "error sending pendingIntent: " + pendingIntent + " error: " + e);
        }
    }
}
