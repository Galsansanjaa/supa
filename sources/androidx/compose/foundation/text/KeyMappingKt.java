package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.foundation.text.KeyModifiers;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent_androidKt;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class KeyMappingKt {
    private static final KeyMapping defaultKeyMapping;

    static {
        final KeyMapping m1541commonKeyMappingVSD1kLU = m1541commonKeyMappingVSD1kLU(KeyModifiers.Companion.m1577getCtrlAuQ4EfA());
        defaultKeyMapping = new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$1$1
            @Override // androidx.compose.foundation.text.KeyMapping
            /* renamed from: map-ZmokQxo */
            public KeyCommand mo1540mapZmokQxo(KeyEvent keyEvent) {
                KeyCommand keyCommand;
                int m1585getModifiersZmokQxo = KeyModifiersKt.m1585getModifiersZmokQxo(keyEvent);
                long m6441getKeyZmokQxo = KeyEvent_androidKt.m6441getKeyZmokQxo(keyEvent);
                Key.Companion companion = Key.Companion;
                KeyCommand keyCommand2 = null;
                if (Key.m6121equalsimpl0(m6441getKeyZmokQxo, companion.m6139getBackspaceEK5gGoQ())) {
                    KeyModifiers.Companion companion2 = KeyModifiers.Companion;
                    if (KeyModifiers.m1547equalsimpl0(m1585getModifiersZmokQxo, companion2.m1582getNoneAuQ4EfA()) || KeyModifiers.m1547equalsimpl0(m1585getModifiersZmokQxo, companion2.m1583getShiftAuQ4EfA()) || KeyModifiers.m1547equalsimpl0(m1585getModifiersZmokQxo, companion2.m1584getShiftMetaAuQ4EfA())) {
                        keyCommand = KeyCommand.DELETE_PREV_CHAR;
                    } else {
                        if (KeyModifiers.m1547equalsimpl0(m1585getModifiersZmokQxo, companion2.m1577getCtrlAuQ4EfA()) || KeyModifiers.m1547equalsimpl0(m1585getModifiersZmokQxo, companion2.m1580getCtrlShiftAuQ4EfA())) {
                            keyCommand = KeyCommand.DELETE_PREV_WORD;
                        }
                        keyCommand = null;
                    }
                } else {
                    if (Key.m6121equalsimpl0(m6441getKeyZmokQxo, companion.m6208getEnterEK5gGoQ()) || Key.m6121equalsimpl0(m6441getKeyZmokQxo, companion.m6305getNumPadEnterEK5gGoQ())) {
                        KeyModifiers.Companion companion3 = KeyModifiers.Companion;
                        if (KeyModifiers.m1547equalsimpl0(m1585getModifiersZmokQxo, companion3.m1582getNoneAuQ4EfA()) || KeyModifiers.m1547equalsimpl0(m1585getModifiersZmokQxo, companion3.m1583getShiftAuQ4EfA()) || KeyModifiers.m1547equalsimpl0(m1585getModifiersZmokQxo, companion3.m1577getCtrlAuQ4EfA()) || KeyModifiers.m1547equalsimpl0(m1585getModifiersZmokQxo, companion3.m1580getCtrlShiftAuQ4EfA())) {
                            keyCommand = KeyCommand.NEW_LINE;
                        }
                    }
                    keyCommand = null;
                }
                if (keyCommand != null) {
                    return keyCommand;
                }
                int m1585getModifiersZmokQxo2 = KeyModifiersKt.m1585getModifiersZmokQxo(keyEvent);
                KeyModifiers.Companion companion4 = KeyModifiers.Companion;
                if (KeyModifiers.m1547equalsimpl0(m1585getModifiersZmokQxo2, companion4.m1580getCtrlShiftAuQ4EfA())) {
                    long m6441getKeyZmokQxo2 = KeyEvent_androidKt.m6441getKeyZmokQxo(keyEvent);
                    if (Key.m6121equalsimpl0(m6441getKeyZmokQxo2, companion.m6198getDirectionLeftEK5gGoQ()) || Key.m6121equalsimpl0(m6441getKeyZmokQxo2, companion.m6300getNumPadDirectionLeftEK5gGoQ())) {
                        keyCommand2 = KeyCommand.SELECT_LEFT_WORD;
                    } else if (Key.m6121equalsimpl0(m6441getKeyZmokQxo2, companion.m6199getDirectionRightEK5gGoQ()) || Key.m6121equalsimpl0(m6441getKeyZmokQxo2, companion.m6301getNumPadDirectionRightEK5gGoQ())) {
                        keyCommand2 = KeyCommand.SELECT_RIGHT_WORD;
                    } else if (Key.m6121equalsimpl0(m6441getKeyZmokQxo2, companion.m6200getDirectionUpEK5gGoQ()) || Key.m6121equalsimpl0(m6441getKeyZmokQxo2, companion.m6302getNumPadDirectionUpEK5gGoQ())) {
                        keyCommand2 = KeyCommand.SELECT_PREV_PARAGRAPH;
                    } else if (Key.m6121equalsimpl0(m6441getKeyZmokQxo2, companion.m6195getDirectionDownEK5gGoQ()) || Key.m6121equalsimpl0(m6441getKeyZmokQxo2, companion.m6299getNumPadDirectionDownEK5gGoQ())) {
                        keyCommand2 = KeyCommand.SELECT_NEXT_PARAGRAPH;
                    }
                } else if (KeyModifiers.m1547equalsimpl0(m1585getModifiersZmokQxo2, companion4.m1577getCtrlAuQ4EfA())) {
                    long m6441getKeyZmokQxo3 = KeyEvent_androidKt.m6441getKeyZmokQxo(keyEvent);
                    if (Key.m6121equalsimpl0(m6441getKeyZmokQxo3, companion.m6198getDirectionLeftEK5gGoQ()) || Key.m6121equalsimpl0(m6441getKeyZmokQxo3, companion.m6300getNumPadDirectionLeftEK5gGoQ())) {
                        keyCommand2 = KeyCommand.LEFT_WORD;
                    } else if (Key.m6121equalsimpl0(m6441getKeyZmokQxo3, companion.m6199getDirectionRightEK5gGoQ()) || Key.m6121equalsimpl0(m6441getKeyZmokQxo3, companion.m6301getNumPadDirectionRightEK5gGoQ())) {
                        keyCommand2 = KeyCommand.RIGHT_WORD;
                    } else if (Key.m6121equalsimpl0(m6441getKeyZmokQxo3, companion.m6200getDirectionUpEK5gGoQ()) || Key.m6121equalsimpl0(m6441getKeyZmokQxo3, companion.m6302getNumPadDirectionUpEK5gGoQ())) {
                        keyCommand2 = KeyCommand.PREV_PARAGRAPH;
                    } else if (Key.m6121equalsimpl0(m6441getKeyZmokQxo3, companion.m6195getDirectionDownEK5gGoQ()) || Key.m6121equalsimpl0(m6441getKeyZmokQxo3, companion.m6299getNumPadDirectionDownEK5gGoQ())) {
                        keyCommand2 = KeyCommand.NEXT_PARAGRAPH;
                    } else if (Key.m6121equalsimpl0(m6441getKeyZmokQxo3, companion.m6233getHEK5gGoQ())) {
                        keyCommand2 = KeyCommand.DELETE_PREV_CHAR;
                    } else if (Key.m6121equalsimpl0(m6441getKeyZmokQxo3, companion.m6193getDeleteEK5gGoQ())) {
                        keyCommand2 = KeyCommand.DELETE_NEXT_WORD;
                    } else if (Key.m6121equalsimpl0(m6441getKeyZmokQxo3, companion.m6138getBackslashEK5gGoQ())) {
                        keyCommand2 = KeyCommand.DESELECT;
                    }
                } else if (KeyModifiers.m1547equalsimpl0(m1585getModifiersZmokQxo2, companion4.m1583getShiftAuQ4EfA())) {
                    long m6441getKeyZmokQxo4 = KeyEvent_androidKt.m6441getKeyZmokQxo(keyEvent);
                    if (Key.m6121equalsimpl0(m6441getKeyZmokQxo4, companion.m6274getMoveHomeEK5gGoQ()) || Key.m6121equalsimpl0(m6441getKeyZmokQxo4, companion.m6310getNumPadMoveHomeEK5gGoQ())) {
                        keyCommand2 = KeyCommand.SELECT_LINE_START;
                    } else if (Key.m6121equalsimpl0(m6441getKeyZmokQxo4, companion.m6273getMoveEndEK5gGoQ()) || Key.m6121equalsimpl0(m6441getKeyZmokQxo4, companion.m6309getNumPadMoveEndEK5gGoQ())) {
                        keyCommand2 = KeyCommand.SELECT_LINE_END;
                    }
                } else if (KeyModifiers.m1547equalsimpl0(m1585getModifiersZmokQxo2, companion4.m1574getAltAuQ4EfA()) && Key.m6121equalsimpl0(KeyEvent_androidKt.m6441getKeyZmokQxo(keyEvent), companion.m6193getDeleteEK5gGoQ())) {
                    keyCommand2 = KeyCommand.DELETE_TO_LINE_END;
                }
                return keyCommand2 == null ? KeyMapping.this.mo1540mapZmokQxo(keyEvent) : keyCommand2;
            }
        };
    }

    /* renamed from: commonKeyMapping-VSD1kLU, reason: not valid java name */
    public static final KeyMapping m1541commonKeyMappingVSD1kLU(final int i) {
        return new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt$commonKeyMapping$1
            @Override // androidx.compose.foundation.text.KeyMapping
            /* renamed from: map-ZmokQxo */
            public KeyCommand mo1540mapZmokQxo(KeyEvent keyEvent) {
                int m1585getModifiersZmokQxo = KeyModifiersKt.m1585getModifiersZmokQxo(keyEvent);
                int i2 = i;
                KeyModifiers.Companion companion = KeyModifiers.Companion;
                if (KeyModifiers.m1547equalsimpl0(m1585getModifiersZmokQxo, KeyModifiers.m1560plus1uj4btU(i2, companion.m1583getShiftAuQ4EfA()))) {
                    if (Key.m6121equalsimpl0(KeyEvent_androidKt.m6441getKeyZmokQxo(keyEvent), Key.Companion.m6419getZEK5gGoQ())) {
                        return KeyCommand.REDO;
                    }
                    return null;
                }
                if (KeyModifiers.m1547equalsimpl0(m1585getModifiersZmokQxo, i)) {
                    long m6441getKeyZmokQxo = KeyEvent_androidKt.m6441getKeyZmokQxo(keyEvent);
                    Key.Companion companion2 = Key.Companion;
                    if (Key.m6121equalsimpl0(m6441getKeyZmokQxo, companion2.m6176getCEK5gGoQ()) || Key.m6121equalsimpl0(m6441getKeyZmokQxo, companion2.m6240getInsertEK5gGoQ()) || Key.m6121equalsimpl0(m6441getKeyZmokQxo, companion2.m6307getNumPadInsertEK5gGoQ())) {
                        return KeyCommand.COPY;
                    }
                    if (Key.m6121equalsimpl0(m6441getKeyZmokQxo, companion2.m6408getVEK5gGoQ())) {
                        return KeyCommand.PASTE;
                    }
                    if (Key.m6121equalsimpl0(m6441getKeyZmokQxo, companion2.m6416getXEK5gGoQ())) {
                        return KeyCommand.CUT;
                    }
                    if (Key.m6121equalsimpl0(m6441getKeyZmokQxo, companion2.m6126getAEK5gGoQ())) {
                        return KeyCommand.SELECT_ALL;
                    }
                    if (Key.m6121equalsimpl0(m6441getKeyZmokQxo, companion2.m6417getYEK5gGoQ())) {
                        return KeyCommand.REDO;
                    }
                    if (Key.m6121equalsimpl0(m6441getKeyZmokQxo, companion2.m6419getZEK5gGoQ())) {
                        return KeyCommand.UNDO;
                    }
                    return null;
                }
                if (KeyModifiers.m1547equalsimpl0(m1585getModifiersZmokQxo, companion.m1583getShiftAuQ4EfA())) {
                    long m6441getKeyZmokQxo2 = KeyEvent_androidKt.m6441getKeyZmokQxo(keyEvent);
                    Key.Companion companion3 = Key.Companion;
                    if (Key.m6121equalsimpl0(m6441getKeyZmokQxo2, companion3.m6198getDirectionLeftEK5gGoQ()) || Key.m6121equalsimpl0(m6441getKeyZmokQxo2, companion3.m6300getNumPadDirectionLeftEK5gGoQ())) {
                        return KeyCommand.SELECT_LEFT_CHAR;
                    }
                    if (Key.m6121equalsimpl0(m6441getKeyZmokQxo2, companion3.m6199getDirectionRightEK5gGoQ()) || Key.m6121equalsimpl0(m6441getKeyZmokQxo2, companion3.m6301getNumPadDirectionRightEK5gGoQ())) {
                        return KeyCommand.SELECT_RIGHT_CHAR;
                    }
                    if (Key.m6121equalsimpl0(m6441getKeyZmokQxo2, companion3.m6200getDirectionUpEK5gGoQ()) || Key.m6121equalsimpl0(m6441getKeyZmokQxo2, companion3.m6302getNumPadDirectionUpEK5gGoQ())) {
                        return KeyCommand.SELECT_UP;
                    }
                    if (Key.m6121equalsimpl0(m6441getKeyZmokQxo2, companion3.m6195getDirectionDownEK5gGoQ()) || Key.m6121equalsimpl0(m6441getKeyZmokQxo2, companion3.m6299getNumPadDirectionDownEK5gGoQ())) {
                        return KeyCommand.SELECT_DOWN;
                    }
                    if (Key.m6121equalsimpl0(m6441getKeyZmokQxo2, companion3.m6321getPageUpEK5gGoQ()) || Key.m6121equalsimpl0(m6441getKeyZmokQxo2, companion3.m6313getNumPadPageUpEK5gGoQ())) {
                        return KeyCommand.SELECT_PAGE_UP;
                    }
                    if (Key.m6121equalsimpl0(m6441getKeyZmokQxo2, companion3.m6320getPageDownEK5gGoQ()) || Key.m6121equalsimpl0(m6441getKeyZmokQxo2, companion3.m6312getNumPadPageDownEK5gGoQ())) {
                        return KeyCommand.SELECT_PAGE_DOWN;
                    }
                    if (Key.m6121equalsimpl0(m6441getKeyZmokQxo2, companion3.m6274getMoveHomeEK5gGoQ()) || Key.m6121equalsimpl0(m6441getKeyZmokQxo2, companion3.m6310getNumPadMoveHomeEK5gGoQ())) {
                        return KeyCommand.SELECT_LINE_START;
                    }
                    if (Key.m6121equalsimpl0(m6441getKeyZmokQxo2, companion3.m6273getMoveEndEK5gGoQ()) || Key.m6121equalsimpl0(m6441getKeyZmokQxo2, companion3.m6309getNumPadMoveEndEK5gGoQ())) {
                        return KeyCommand.SELECT_LINE_END;
                    }
                    if (Key.m6121equalsimpl0(m6441getKeyZmokQxo2, companion3.m6240getInsertEK5gGoQ()) || Key.m6121equalsimpl0(m6441getKeyZmokQxo2, companion3.m6307getNumPadInsertEK5gGoQ())) {
                        return KeyCommand.PASTE;
                    }
                    return null;
                }
                if (!KeyModifiers.m1547equalsimpl0(m1585getModifiersZmokQxo, companion.m1582getNoneAuQ4EfA())) {
                    return null;
                }
                long m6441getKeyZmokQxo3 = KeyEvent_androidKt.m6441getKeyZmokQxo(keyEvent);
                Key.Companion companion4 = Key.Companion;
                if (Key.m6121equalsimpl0(m6441getKeyZmokQxo3, companion4.m6198getDirectionLeftEK5gGoQ()) || Key.m6121equalsimpl0(m6441getKeyZmokQxo3, companion4.m6300getNumPadDirectionLeftEK5gGoQ())) {
                    return KeyCommand.LEFT_CHAR;
                }
                if (Key.m6121equalsimpl0(m6441getKeyZmokQxo3, companion4.m6199getDirectionRightEK5gGoQ()) || Key.m6121equalsimpl0(m6441getKeyZmokQxo3, companion4.m6301getNumPadDirectionRightEK5gGoQ())) {
                    return KeyCommand.RIGHT_CHAR;
                }
                if (Key.m6121equalsimpl0(m6441getKeyZmokQxo3, companion4.m6200getDirectionUpEK5gGoQ()) || Key.m6121equalsimpl0(m6441getKeyZmokQxo3, companion4.m6302getNumPadDirectionUpEK5gGoQ())) {
                    return KeyCommand.UP;
                }
                if (Key.m6121equalsimpl0(m6441getKeyZmokQxo3, companion4.m6195getDirectionDownEK5gGoQ()) || Key.m6121equalsimpl0(m6441getKeyZmokQxo3, companion4.m6299getNumPadDirectionDownEK5gGoQ())) {
                    return KeyCommand.DOWN;
                }
                if (Key.m6121equalsimpl0(m6441getKeyZmokQxo3, companion4.m6194getDirectionCenterEK5gGoQ())) {
                    return KeyCommand.CENTER;
                }
                if (Key.m6121equalsimpl0(m6441getKeyZmokQxo3, companion4.m6321getPageUpEK5gGoQ()) || Key.m6121equalsimpl0(m6441getKeyZmokQxo3, companion4.m6313getNumPadPageUpEK5gGoQ())) {
                    return KeyCommand.PAGE_UP;
                }
                if (Key.m6121equalsimpl0(m6441getKeyZmokQxo3, companion4.m6320getPageDownEK5gGoQ()) || Key.m6121equalsimpl0(m6441getKeyZmokQxo3, companion4.m6312getNumPadPageDownEK5gGoQ())) {
                    return KeyCommand.PAGE_DOWN;
                }
                if (Key.m6121equalsimpl0(m6441getKeyZmokQxo3, companion4.m6274getMoveHomeEK5gGoQ()) || Key.m6121equalsimpl0(m6441getKeyZmokQxo3, companion4.m6310getNumPadMoveHomeEK5gGoQ())) {
                    return KeyCommand.LINE_START;
                }
                if (Key.m6121equalsimpl0(m6441getKeyZmokQxo3, companion4.m6273getMoveEndEK5gGoQ()) || Key.m6121equalsimpl0(m6441getKeyZmokQxo3, companion4.m6309getNumPadMoveEndEK5gGoQ())) {
                    return KeyCommand.LINE_END;
                }
                if (Key.m6121equalsimpl0(m6441getKeyZmokQxo3, companion4.m6208getEnterEK5gGoQ()) || Key.m6121equalsimpl0(m6441getKeyZmokQxo3, companion4.m6305getNumPadEnterEK5gGoQ())) {
                    return KeyCommand.NEW_LINE;
                }
                if (Key.m6121equalsimpl0(m6441getKeyZmokQxo3, companion4.m6139getBackspaceEK5gGoQ())) {
                    return KeyCommand.DELETE_PREV_CHAR;
                }
                if (Key.m6121equalsimpl0(m6441getKeyZmokQxo3, companion4.m6193getDeleteEK5gGoQ())) {
                    return KeyCommand.DELETE_NEXT_CHAR;
                }
                if (Key.m6121equalsimpl0(m6441getKeyZmokQxo3, companion4.m6323getPasteEK5gGoQ())) {
                    return KeyCommand.PASTE;
                }
                if (Key.m6121equalsimpl0(m6441getKeyZmokQxo3, companion4.m6191getCutEK5gGoQ())) {
                    return KeyCommand.CUT;
                }
                if (Key.m6121equalsimpl0(m6441getKeyZmokQxo3, companion4.m6188getCopyEK5gGoQ())) {
                    return KeyCommand.COPY;
                }
                if (Key.m6121equalsimpl0(m6441getKeyZmokQxo3, companion4.m6369getTabEK5gGoQ())) {
                    return KeyCommand.TAB;
                }
                return null;
            }
        };
    }

    public static final KeyMapping getDefaultKeyMapping() {
        return defaultKeyMapping;
    }
}
