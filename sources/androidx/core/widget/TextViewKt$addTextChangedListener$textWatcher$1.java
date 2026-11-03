package androidx.core.widget;

import android.text.Editable;
import android.text.TextWatcher;
import defpackage.ps0;
import defpackage.vs0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class TextViewKt$addTextChangedListener$textWatcher$1 implements TextWatcher {
    final /* synthetic */ ps0 $afterTextChanged;
    final /* synthetic */ vs0 $beforeTextChanged;
    final /* synthetic */ vs0 $onTextChanged;

    public TextViewKt$addTextChangedListener$textWatcher$1(ps0 ps0Var, vs0 vs0Var, vs0 vs0Var2) {
        this.$afterTextChanged = ps0Var;
        this.$beforeTextChanged = vs0Var;
        this.$onTextChanged = vs0Var2;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        this.$afterTextChanged.invoke(editable);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.$beforeTextChanged.invoke(charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.$onTextChanged.invoke(charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }
}
