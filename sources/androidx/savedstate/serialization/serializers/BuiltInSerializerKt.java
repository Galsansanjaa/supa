package androidx.savedstate.serialization.serializers;

import defpackage.a52;
import defpackage.ob0;
import defpackage.yi0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class BuiltInSerializerKt {
    public static final String decoderErrorMessage(String str, ob0 ob0Var) {
        str.getClass();
        ob0Var.getClass();
        return "Cannot deserialize " + str + " with '" + a52.a(ob0Var.getClass()).c() + "'. This serializer can only be used with SavedStateDecoder. Use 'decodeFromSavedState' instead.";
    }

    public static final String encoderErrorMessage(String str, yi0 yi0Var) {
        str.getClass();
        yi0Var.getClass();
        return "Cannot serialize " + str + " with '" + a52.a(yi0Var.getClass()).c() + "'. This serializer can only be used with SavedStateEncoder. Use 'encodeToSavedState' instead.";
    }
}
