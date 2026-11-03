package androidx.graphics.shapes;

import androidx.collection.MutableFloatList;
import defpackage.dv1;
import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class DoubleMapper {
    public static final Companion Companion = new Companion(null);
    public static final DoubleMapper Identity;
    private final MutableFloatList sourceValues;
    private final MutableFloatList targetValues;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }
    }

    static {
        Float valueOf = Float.valueOf(0.0f);
        dv1 dv1Var = new dv1(valueOf, valueOf);
        Float valueOf2 = Float.valueOf(0.5f);
        Identity = new DoubleMapper(dv1Var, new dv1(valueOf2, valueOf2));
    }

    public DoubleMapper(dv1... dv1VarArr) {
        dv1VarArr.getClass();
        this.sourceValues = new MutableFloatList(dv1VarArr.length);
        this.targetValues = new MutableFloatList(dv1VarArr.length);
        int length = dv1VarArr.length;
        int i = 0;
        while (true) {
            MutableFloatList mutableFloatList = this.sourceValues;
            if (i >= length) {
                FloatMappingKt.validateProgress(mutableFloatList);
                FloatMappingKt.validateProgress(this.targetValues);
                return;
            } else {
                mutableFloatList.add(((Number) dv1VarArr[i].a).floatValue());
                this.targetValues.add(((Number) dv1VarArr[i].b).floatValue());
                i++;
            }
        }
    }

    public final float map(float f) {
        return FloatMappingKt.linearMap(this.sourceValues, this.targetValues, f);
    }

    public final float mapBack(float f) {
        return FloatMappingKt.linearMap(this.targetValues, this.sourceValues, f);
    }
}
