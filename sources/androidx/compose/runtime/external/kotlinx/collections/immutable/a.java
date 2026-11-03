package androidx.compose.runtime.external.kotlinx.collections.immutable;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static ImmutableList a(AbstractPersistentList abstractPersistentList, int i, int i2) {
        return new ImmutableList.SubList(abstractPersistentList, i, i2);
    }
}
