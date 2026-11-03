package defpackage;

import android.content.ClipData;
import android.content.ComponentName;
import android.content.UriMatcher;
import android.net.Uri;
import androidx.core.content.UriMatcherCompat;
import androidx.core.util.Predicate;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k00 implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k00(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.core.util.Predicate
    public final /* synthetic */ Predicate and(Predicate predicate) {
        int i = this.a;
        return vg1.b(this, predicate);
    }

    @Override // androidx.core.util.Predicate
    public final Predicate negate() {
        switch (this.a) {
            case 0:
                return new k00(this, 2);
            case 1:
                return new k00(this, 2);
            case 2:
                return new k00(this, 2);
            default:
                return new k00(this, 2);
        }
    }

    @Override // androidx.core.util.Predicate
    public final /* synthetic */ Predicate or(Predicate predicate) {
        int i = this.a;
        return vg1.o(this, predicate);
    }

    @Override // androidx.core.util.Predicate
    public final boolean test(Object obj) {
        boolean lambda$asPredicate$0;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return ((java.util.function.Predicate) obj2).test((ClipData.Item) obj);
            case 1:
                return ((ComponentName) obj2).equals((ComponentName) obj);
            case 2:
                return !((Predicate) obj2).test(obj);
            default:
                lambda$asPredicate$0 = UriMatcherCompat.lambda$asPredicate$0((UriMatcher) obj2, (Uri) obj);
                return lambda$asPredicate$0;
        }
    }
}
