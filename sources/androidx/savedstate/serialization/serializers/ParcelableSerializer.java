package androidx.savedstate.serialization.serializers;

import android.os.Parcelable;
import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateWriter;
import androidx.savedstate.serialization.SavedStateDecoder;
import androidx.savedstate.serialization.SavedStateEncoder;
import defpackage.a52;
import defpackage.ea0;
import defpackage.ob0;
import defpackage.qq;
import defpackage.ta1;
import defpackage.tf2;
import defpackage.yi0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class ParcelableSerializer<T extends Parcelable> implements ta1 {
    private final tf2 descriptor = ea0.f("android.os.Parcelable", new tf2[0]);

    @Override // defpackage.nd0
    public final T deserialize(ob0 ob0Var) {
        ob0Var.getClass();
        if (!(ob0Var instanceof SavedStateDecoder)) {
            qq.j(BuiltInSerializerKt.decoderErrorMessage(this.descriptor.h(), ob0Var));
            return null;
        }
        SavedStateDecoder savedStateDecoder = (SavedStateDecoder) ob0Var;
        T t = (T) SavedStateReader.m8419getParcelableimpl(SavedStateReader.m8373constructorimpl(savedStateDecoder.getSavedState$savedstate()), savedStateDecoder.getKey$savedstate(), a52.a(Parcelable.class));
        t.getClass();
        return t;
    }

    @Override // defpackage.bg2, defpackage.nd0
    public final tf2 getDescriptor() {
        return this.descriptor;
    }

    @Override // defpackage.bg2
    public final void serialize(yi0 yi0Var, T t) {
        yi0Var.getClass();
        t.getClass();
        if (!(yi0Var instanceof SavedStateEncoder)) {
            qq.j(BuiltInSerializerKt.encoderErrorMessage(this.descriptor.h(), yi0Var));
        } else {
            SavedStateEncoder savedStateEncoder = (SavedStateEncoder) yi0Var;
            SavedStateWriter.m8483putParcelableimpl(SavedStateWriter.m8459constructorimpl(savedStateEncoder.getSavedState$savedstate()), savedStateEncoder.getKey$savedstate(), t);
        }
    }
}
