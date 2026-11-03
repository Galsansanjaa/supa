package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import com.uptodown.activities.UsernameEditActivity;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class r53 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ UsernameEditActivity b;

    public /* synthetic */ r53(UsernameEditActivity usernameEditActivity, int i) {
        this.a = i;
        this.b = usernameEditActivity;
    }

    private final void a(Editable editable) {
    }

    private final void b(Editable editable) {
    }

    private final void c(CharSequence charSequence, int i, int i2, int i3) {
    }

    private final void d(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i = this.a;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.a;
        UsernameEditActivity usernameEditActivity = this.b;
        switch (i4) {
            case 0:
                int i5 = UsernameEditActivity.V;
                usernameEditActivity.C0().F.setText(charSequence);
                usernameEditActivity.C0().G.setText(charSequence);
                usernameEditActivity.C0().H.setText(charSequence);
                usernameEditActivity.C0().I.setText(charSequence);
                return;
            default:
                if (charSequence != null) {
                    String obj = charSequence.toString();
                    int i6 = UsernameEditActivity.V;
                    usernameEditActivity.D0(obj);
                    return;
                }
                return;
        }
    }
}
