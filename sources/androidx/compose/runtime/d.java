package androidx.compose.runtime;

import java.util.Comparator;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int InvalidationLocationAscending$lambda$0;
        InvalidationLocationAscending$lambda$0 = GapComposerKt.InvalidationLocationAscending$lambda$0((Invalidation) obj, (Invalidation) obj2);
        return InvalidationLocationAscending$lambda$0;
    }
}
