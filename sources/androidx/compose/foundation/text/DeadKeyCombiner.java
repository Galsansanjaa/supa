package androidx.compose.foundation.text;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import androidx.compose.ui.input.key.KeyEvent_androidKt;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class DeadKeyCombiner {
    public static final int $stable = 8;
    private Integer deadKeyCode;

    /* renamed from: consume-ZmokQxo, reason: not valid java name */
    public final Integer m1537consumeZmokQxo(KeyEvent keyEvent) {
        int m6443getUtf16CodePointZmokQxo = KeyEvent_androidKt.m6443getUtf16CodePointZmokQxo(keyEvent);
        if ((Integer.MIN_VALUE & m6443getUtf16CodePointZmokQxo) != 0) {
            this.deadKeyCode = Integer.valueOf(m6443getUtf16CodePointZmokQxo & Integer.MAX_VALUE);
            return null;
        }
        Integer num = this.deadKeyCode;
        if (num == null) {
            return Integer.valueOf(m6443getUtf16CodePointZmokQxo);
        }
        this.deadKeyCode = null;
        Integer valueOf = Integer.valueOf(KeyCharacterMap.getDeadChar(num.intValue(), m6443getUtf16CodePointZmokQxo));
        Integer num2 = valueOf.intValue() != 0 ? valueOf : null;
        if (num2 != null) {
            m6443getUtf16CodePointZmokQxo = num2.intValue();
        }
        return Integer.valueOf(m6443getUtf16CodePointZmokQxo);
    }
}
