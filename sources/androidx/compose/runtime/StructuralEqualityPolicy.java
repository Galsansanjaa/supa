package androidx.compose.runtime;

import defpackage.jh2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
final class StructuralEqualityPolicy implements SnapshotMutationPolicy<Object> {
    public static final StructuralEqualityPolicy INSTANCE = new StructuralEqualityPolicy();

    private StructuralEqualityPolicy() {
    }

    @Override // androidx.compose.runtime.SnapshotMutationPolicy
    public boolean equivalent(Object obj, Object obj2) {
        return jh2.k(obj, obj2);
    }

    @Override // androidx.compose.runtime.SnapshotMutationPolicy
    public final Object merge(Object obj, Object obj2, Object obj3) {
        return null;
    }

    public String toString() {
        return "StructuralEqualityPolicy";
    }
}
