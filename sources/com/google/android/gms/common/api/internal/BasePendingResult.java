package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.Status;
import defpackage.cx1;
import defpackage.dn3;
import defpackage.j82;
import defpackage.ok3;
import defpackage.ol3;
import defpackage.to;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class BasePendingResult<R extends j82> {
    public static final to j = new to(3);
    public j82 e;
    public Status f;
    public volatile boolean g;
    public boolean h;
    public final Object a = new Object();
    public final CountDownLatch b = new CountDownLatch(1);
    public final ArrayList c = new ArrayList();
    public final AtomicReference d = new AtomicReference();
    public boolean i = false;

    public BasePendingResult(ok3 ok3Var) {
        new cx1(ok3Var != null ? ok3Var.a.g : Looper.getMainLooper(), 2);
        new WeakReference(ok3Var);
    }

    public final void a(ol3 ol3Var) {
        synchronized (this.a) {
            try {
                if (d()) {
                    ol3Var.a(this.f);
                } else {
                    this.c.add(ol3Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract j82 b(Status status);

    public final void c(Status status) {
        synchronized (this.a) {
            try {
                if (!d()) {
                    e(b(status));
                    this.h = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d() {
        return this.b.getCount() == 0;
    }

    public final void e(j82 j82Var) {
        synchronized (this.a) {
            try {
                if (this.h) {
                    return;
                }
                d();
                dn3.r(!d(), "Results have already been set");
                dn3.r(!this.g, "Result has already been consumed");
                this.e = j82Var;
                this.f = j82Var.getStatus();
                this.b.countDown();
                ArrayList arrayList = this.c;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((ol3) arrayList.get(i)).a(this.f);
                }
                arrayList.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
