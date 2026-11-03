package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.loader.content.AsyncTaskLoader;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class yl3 extends AsyncTaskLoader {
    public final Semaphore a;
    public final Set b;

    public yl3(Context context, Set set) {
        super(context);
        this.a = new Semaphore(0);
        this.b = set;
    }

    @Override // androidx.loader.content.AsyncTaskLoader
    public final Object loadInBackground() {
        Iterator it = this.b.iterator();
        if (it.hasNext()) {
            ((ok3) it.next()).getClass();
            z72.f();
            return null;
        }
        try {
            this.a.tryAcquire(0, 5L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e);
            Thread.currentThread().interrupt();
        }
        return null;
    }

    @Override // androidx.loader.content.Loader
    public final void onStartLoading() {
        this.a.drainPermits();
        forceLoad();
    }
}
