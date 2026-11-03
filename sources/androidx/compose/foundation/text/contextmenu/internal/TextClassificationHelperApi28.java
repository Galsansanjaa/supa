package androidx.compose.foundation.text.contextmenu.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.view.textclassifier.TextClassification;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class TextClassificationHelperApi28 {
    public static final int $stable = 0;
    public static final TextClassificationHelperApi28 INSTANCE = new TextClassificationHelperApi28();

    private TextClassificationHelperApi28() {
    }

    public final void sendLegacyIntent(Context context, TextClassification textClassification) {
        String text = textClassification.getText();
        sendPendingIntent(PendingIntent.getActivity(context, text != null ? text.hashCode() : 0, textClassification.getIntent(), 201326592));
    }

    public final void sendPendingIntent(PendingIntent pendingIntent) {
        if (Build.VERSION.SDK_INT >= 34) {
            TextClassificationHelper34.INSTANCE.sendIntentAllowBackgroundActivityStart(pendingIntent);
        } else {
            pendingIntent.send();
        }
    }
}
