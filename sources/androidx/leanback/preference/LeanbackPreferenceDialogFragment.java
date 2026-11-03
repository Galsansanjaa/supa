package androidx.leanback.preference;

import android.app.Fragment;
import android.os.Bundle;
import androidx.preference.DialogPreference;
import defpackage.f31;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
@Deprecated
/* loaded from: classes3.dex */
public class LeanbackPreferenceDialogFragment extends Fragment {
    public static final String ARG_KEY = "key";
    private DialogPreference mPreference;

    public LeanbackPreferenceDialogFragment() {
        LeanbackPreferenceFragmentTransitionHelperApi21.addTransitions(this);
    }

    public DialogPreference getPreference() {
        DialogPreference dialogPreference = this.mPreference;
        if (dialogPreference != null) {
            return dialogPreference;
        }
        DialogPreference dialogPreference2 = (DialogPreference) ((DialogPreference.TargetFragment) getTargetFragment()).findPreference(getArguments().getString("key"));
        this.mPreference = dialogPreference2;
        return dialogPreference2;
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Fragment targetFragment = getTargetFragment();
        if (targetFragment instanceof DialogPreference.TargetFragment) {
            return;
        }
        f31.e(targetFragment, "Target fragment ", " must implement TargetFragment interface");
    }
}
