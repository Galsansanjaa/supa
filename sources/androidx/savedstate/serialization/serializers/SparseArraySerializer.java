package androidx.savedstate.serialization.serializers;

import android.util.SparseArray;
import defpackage.bg2;
import defpackage.j61;
import defpackage.kz;
import defpackage.nb0;
import defpackage.nb1;
import defpackage.ob0;
import defpackage.sb0;
import defpackage.ta1;
import defpackage.ta3;
import defpackage.td;
import defpackage.tf2;
import defpackage.uc1;
import defpackage.ux1;
import defpackage.v5;
import defpackage.yi0;
import defpackage.zf2;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class SparseArraySerializer<T> implements ta1 {
    private final tf2 descriptor;
    private final ta1 surrogateSerializer;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes4.dex */
    public static final class SparseArraySurrogate<T> {
        private static final tf2 $cachedDescriptor;
        private final List<Integer> keys;
        private final List<T> values;
        public static final Companion Companion = new Companion(null);
        private static final nb1[] $childSerializers = {ta3.w(uc1.a, new Object()), null};

        /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
        /* loaded from: classes4.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(sb0 sb0Var) {
                this();
            }

            public final <T> ta1 serializer(ta1 ta1Var) {
                ta1Var.getClass();
                return new SparseArraySerializer$SparseArraySurrogate$$serializer(ta1Var);
            }
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, os0] */
        static {
            ux1 ux1Var = new ux1("androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate", null, 2);
            ux1Var.j("keys", false);
            ux1Var.j("values", false);
            $cachedDescriptor = ux1Var;
        }

        public /* synthetic */ SparseArraySurrogate(int i, List list, List list2, zf2 zf2Var) {
            if (3 != (i & 3)) {
                nb0.P($cachedDescriptor, i, 3);
                throw null;
            }
            this.keys = list;
            this.values = list2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SparseArraySurrogate(List<Integer> list, List<? extends T> list2) {
            list.getClass();
            list2.getClass();
            this.keys = list;
            this.values = list2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ ta1 _childSerializers$_anonymous_() {
            return new td(j61.a);
        }

        public static final /* synthetic */ void write$Self$savedstate(SparseArraySurrogate sparseArraySurrogate, kz kzVar, tf2 tf2Var, ta1 ta1Var) {
            kzVar.encodeSerializableElement(tf2Var, 0, (bg2) $childSerializers[0].getValue(), sparseArraySurrogate.keys);
            kzVar.encodeSerializableElement(tf2Var, 1, new td(ta1Var), sparseArraySurrogate.values);
        }

        public final List<Integer> getKeys() {
            return this.keys;
        }

        public final List<T> getValues() {
            return this.values;
        }
    }

    public SparseArraySerializer(ta1 ta1Var) {
        ta1Var.getClass();
        ta1 serializer = SparseArraySurrogate.Companion.serializer(ta1Var);
        this.surrogateSerializer = serializer;
        this.descriptor = serializer.getDescriptor();
    }

    @Override // defpackage.nd0
    public SparseArray<T> deserialize(ob0 ob0Var) {
        ob0Var.getClass();
        SparseArraySurrogate sparseArraySurrogate = (SparseArraySurrogate) ob0Var.decodeSerializableValue(this.surrogateSerializer);
        if (sparseArraySurrogate.getKeys().size() != sparseArraySurrogate.getValues().size()) {
            v5.m("Failed requirement.");
            return null;
        }
        SparseArray<T> sparseArray = new SparseArray<>(sparseArraySurrogate.getKeys().size());
        int size = sparseArraySurrogate.getKeys().size();
        for (int i = 0; i < size; i++) {
            sparseArray.append(sparseArraySurrogate.getKeys().get(i).intValue(), sparseArraySurrogate.getValues().get(i));
        }
        return sparseArray;
    }

    @Override // defpackage.bg2, defpackage.nd0
    public tf2 getDescriptor() {
        return this.descriptor;
    }

    @Override // defpackage.bg2
    public void serialize(yi0 yi0Var, SparseArray<T> sparseArray) {
        yi0Var.getClass();
        sparseArray.getClass();
        int size = sparseArray.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(Integer.valueOf(sparseArray.keyAt(i)));
        }
        int size2 = sparseArray.size();
        ArrayList arrayList2 = new ArrayList(size2);
        for (int i2 = 0; i2 < size2; i2++) {
            arrayList2.add(sparseArray.valueAt(i2));
        }
        yi0Var.encodeSerializableValue(this.surrogateSerializer, new SparseArraySurrogate(arrayList, arrayList2));
    }
}
