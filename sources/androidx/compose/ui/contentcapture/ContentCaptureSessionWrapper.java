package androidx.compose.ui.contentcapture;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import androidx.compose.ui.platform.coreshims.ViewStructureCompat;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public interface ContentCaptureSessionWrapper {
    void flush();

    AutofillId newAutofillId(long j);

    ViewStructureCompat newVirtualViewStructure(AutofillId autofillId, long j);

    void notifyViewAppeared(ViewStructure viewStructure);

    void notifyViewDisappeared(AutofillId autofillId);

    void notifyViewTextChanged(AutofillId autofillId, CharSequence charSequence);

    void notifyViewsAppeared(List<ViewStructure> list);

    void notifyViewsDisappeared(long[] jArr);
}
