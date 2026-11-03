package defpackage;

import androidx.compose.runtime.ComposerKt;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class xf0 {
    public final hf0 a() {
        if (this instanceof sf0) {
            return ((sf0) this).a;
        }
        if (this instanceof wf0) {
            return ((wf0) this).a;
        }
        if (this instanceof vf0) {
            return ((vf0) this).a;
        }
        if (this instanceof pf0) {
            return ((pf0) this).a;
        }
        if (this instanceof of0) {
            return ((of0) this).a;
        }
        if (this instanceof rf0) {
            return ((rf0) this).a;
        }
        if (this instanceof qf0) {
            return ((qf0) this).a;
        }
        if (this instanceof nf0) {
            return ((nf0) this).a;
        }
        if (!equals(uf0.a) && !equals(tf0.a) && !equals(mf0.a)) {
            hu2.e();
        }
        return null;
    }

    public final String b() {
        hf0 a = a();
        if (a != null) {
            return a.b;
        }
        return null;
    }

    public final int c() {
        if (this instanceof sf0) {
            return 199;
        }
        if (this instanceof wf0) {
            return 200;
        }
        if (this instanceof vf0) {
            return ComposerKt.providerKey;
        }
        if (this instanceof pf0) {
            return 205;
        }
        if (this instanceof of0) {
            return ComposerKt.referenceKey;
        }
        if (this instanceof rf0) {
            return ComposerKt.compositionLocalMapKey;
        }
        if (this instanceof qf0) {
            return ComposerKt.providerValuesKey;
        }
        if (this instanceof nf0) {
            return ComposerKt.reuseKey;
        }
        if (equals(uf0.a)) {
            return 208;
        }
        if (equals(tf0.a)) {
            return 209;
        }
        if (equals(mf0.a)) {
            return 210;
        }
        hu2.e();
        return 0;
    }
}
