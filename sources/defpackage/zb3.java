package defpackage;

import com.inmobi.cmp.model.ChoiceError;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class zb3 extends Exception {
    public final ChoiceError a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zb3(ChoiceError choiceError) {
        super(choiceError.getMessage());
        choiceError.getClass();
        this.a = choiceError;
    }
}
