package com.google.android.material.textfield;

import android.widget.EditText;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
class EditTextUtils {
    private EditTextUtils() {
    }

    public static boolean isEditable(EditText editText) {
        return editText.getInputType() != 0;
    }
}
