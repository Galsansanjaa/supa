package androidx.browser.trusted;

import java.util.Comparator;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int compareByteArrays;
        compareByteArrays = TokenContents.compareByteArrays((byte[]) obj, (byte[]) obj2);
        return compareByteArrays;
    }
}
