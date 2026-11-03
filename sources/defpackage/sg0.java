package defpackage;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.compose.runtime.ComposerKt;
import androidx.core.location.LocationRequestCompat;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class sg0 {
    public final hf0 a() {
        if (this instanceof rg0) {
            return ((rg0) this).a;
        }
        if (this instanceof qg0) {
            return ((qg0) this).a;
        }
        if (this instanceof pg0) {
            return ((pg0) this).a;
        }
        if (this instanceof kg0) {
            return ((kg0) this).a;
        }
        if (this instanceof og0) {
            return ((og0) this).a;
        }
        if (this instanceof lg0) {
            return ((lg0) this).a;
        }
        return null;
    }

    public final String b() {
        if (this instanceof rg0) {
            hf0 hf0Var = ((rg0) this).a;
            if (hf0Var != null) {
                return hf0Var.b;
            }
            return null;
        }
        if (this instanceof qg0) {
            hf0 hf0Var2 = ((qg0) this).a;
            if (hf0Var2 != null) {
                return hf0Var2.b;
            }
            return null;
        }
        if (this instanceof pg0) {
            hf0 hf0Var3 = ((pg0) this).a;
            if (hf0Var3 != null) {
                return hf0Var3.b;
            }
            return null;
        }
        if (this instanceof kg0) {
            hf0 hf0Var4 = ((kg0) this).a;
            if (hf0Var4 != null) {
                return hf0Var4.b;
            }
            return null;
        }
        if (this instanceof og0) {
            hf0 hf0Var5 = ((og0) this).a;
            if (hf0Var5 != null) {
                return hf0Var5.b;
            }
            return null;
        }
        if (this instanceof lg0) {
            hf0 hf0Var6 = ((lg0) this).a;
            if (hf0Var6 != null) {
                return hf0Var6.b;
            }
            return null;
        }
        if (!(this instanceof ng0) && !equals(jg0.a) && !equals(mg0.a)) {
            hu2.e();
        }
        return null;
    }

    public final int c() {
        if (this instanceof pg0) {
            return LocationRequestCompat.QUALITY_BALANCED_POWER_ACCURACY;
        }
        if (equals(jg0.a)) {
            return 103;
        }
        if (this instanceof lg0) {
            return LocationRequestCompat.QUALITY_LOW_POWER;
        }
        if (this instanceof ng0) {
            return 105;
        }
        if (this instanceof kg0) {
            return 106;
        }
        if (this instanceof rg0) {
            return AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY;
        }
        if (this instanceof qg0) {
            return AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR;
        }
        if (equals(mg0.a)) {
            return 110;
        }
        if (this instanceof og0) {
            return ComposerKt.providerKey;
        }
        hu2.e();
        return 0;
    }
}
