package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.foundation.text.KeyModifiers;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent_androidKt;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class KeyMapping_androidKt {
    private static final KeyMapping platformDefaultKeyMapping = new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMapping_androidKt$platformDefaultKeyMapping$1
        @Override // androidx.compose.foundation.text.KeyMapping
        /* renamed from: map-ZmokQxo */
        public KeyCommand mo1540mapZmokQxo(KeyEvent keyEvent) {
            int m1585getModifiersZmokQxo = KeyModifiersKt.m1585getModifiersZmokQxo(keyEvent);
            KeyModifiers.Companion companion = KeyModifiers.Companion;
            KeyCommand keyCommand = null;
            if (KeyModifiers.m1547equalsimpl0(m1585getModifiersZmokQxo, companion.m1576getAltShiftAuQ4EfA())) {
                long m6441getKeyZmokQxo = KeyEvent_androidKt.m6441getKeyZmokQxo(keyEvent);
                Key.Companion companion2 = Key.Companion;
                if (Key.m6121equalsimpl0(m6441getKeyZmokQxo, companion2.m6198getDirectionLeftEK5gGoQ())) {
                    keyCommand = KeyCommand.SELECT_LINE_LEFT;
                } else if (Key.m6121equalsimpl0(m6441getKeyZmokQxo, companion2.m6199getDirectionRightEK5gGoQ())) {
                    keyCommand = KeyCommand.SELECT_LINE_RIGHT;
                } else if (Key.m6121equalsimpl0(m6441getKeyZmokQxo, companion2.m6200getDirectionUpEK5gGoQ())) {
                    keyCommand = KeyCommand.SELECT_HOME;
                } else if (Key.m6121equalsimpl0(m6441getKeyZmokQxo, companion2.m6195getDirectionDownEK5gGoQ())) {
                    keyCommand = KeyCommand.SELECT_END;
                }
            } else if (KeyModifiers.m1547equalsimpl0(m1585getModifiersZmokQxo, companion.m1574getAltAuQ4EfA())) {
                long m6441getKeyZmokQxo2 = KeyEvent_androidKt.m6441getKeyZmokQxo(keyEvent);
                Key.Companion companion3 = Key.Companion;
                if (Key.m6121equalsimpl0(m6441getKeyZmokQxo2, companion3.m6198getDirectionLeftEK5gGoQ())) {
                    keyCommand = KeyCommand.LINE_LEFT;
                } else if (Key.m6121equalsimpl0(m6441getKeyZmokQxo2, companion3.m6199getDirectionRightEK5gGoQ())) {
                    keyCommand = KeyCommand.LINE_RIGHT;
                } else if (Key.m6121equalsimpl0(m6441getKeyZmokQxo2, companion3.m6200getDirectionUpEK5gGoQ())) {
                    keyCommand = KeyCommand.HOME;
                } else if (Key.m6121equalsimpl0(m6441getKeyZmokQxo2, companion3.m6195getDirectionDownEK5gGoQ())) {
                    keyCommand = KeyCommand.END;
                } else if (Key.m6121equalsimpl0(m6441getKeyZmokQxo2, companion3.m6139getBackspaceEK5gGoQ())) {
                    keyCommand = KeyCommand.DELETE_FROM_LINE_START;
                }
            }
            return keyCommand == null ? KeyMappingKt.getDefaultKeyMapping().mo1540mapZmokQxo(keyEvent) : keyCommand;
        }
    };

    public static final KeyMapping getPlatformDefaultKeyMapping() {
        return platformDefaultKeyMapping;
    }
}
