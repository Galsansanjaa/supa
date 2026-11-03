package androidx.core.os;

import android.content.Context;
import android.os.ProfilingManager;
import android.os.ProfilingResult;
import defpackage.a10;
import defpackage.ak1;
import defpackage.bb1;
import defpackage.e50;
import defpackage.hu2;
import defpackage.lb0;
import defpackage.os0;
import defpackage.sz1;
import defpackage.ta3;
import defpackage.tn2;
import defpackage.ts0;
import defpackage.tz1;
import defpackage.vy2;
import defpackage.xu3;
import j$.util.function.Consumer$CC;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
@lb0(c = "androidx.core.os.Profiling$registerForAllProfilingResults$1", f = "Profiling.kt", l = {79}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class Profiling$registerForAllProfilingResults$1 extends tn2 implements ts0 {
    final /* synthetic */ Context $context;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* renamed from: androidx.core.os.Profiling$registerForAllProfilingResults$1$2, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass2 extends bb1 implements os0 {
        final /* synthetic */ Consumer<ProfilingResult> $listener;
        final /* synthetic */ ProfilingManager $service;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ProfilingManager profilingManager, Consumer<ProfilingResult> consumer) {
            super(0);
            this.$service = profilingManager;
            this.$listener = consumer;
        }

        @Override // defpackage.os0
        public /* bridge */ /* synthetic */ Object invoke() {
            m8308invoke();
            return vy2.a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m8308invoke() {
            this.$service.unregisterForAllProfilingResults(this.$listener);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Profiling$registerForAllProfilingResults$1(Context context, a10 a10Var) {
        super(2, a10Var);
        this.$context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(tz1 tz1Var, ProfilingResult profilingResult) {
        profilingResult.getClass();
        ((sz1) tz1Var).h(profilingResult);
    }

    @Override // defpackage.cm
    public final a10 create(Object obj, a10 a10Var) {
        Profiling$registerForAllProfilingResults$1 profiling$registerForAllProfilingResults$1 = new Profiling$registerForAllProfilingResults$1(this.$context, a10Var);
        profiling$registerForAllProfilingResults$1.L$0 = obj;
        return profiling$registerForAllProfilingResults$1;
    }

    @Override // defpackage.ts0
    public final Object invoke(tz1 tz1Var, a10 a10Var) {
        return ((Profiling$registerForAllProfilingResults$1) create(tz1Var, a10Var)).invokeSuspend(vy2.a);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // defpackage.cm
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            ta3.H(obj);
            final tz1 tz1Var = (tz1) this.L$0;
            Consumer consumer = new Consumer() { // from class: androidx.core.os.a
                @Override // java.util.function.Consumer
                public final void accept(Object obj2) {
                    Profiling$registerForAllProfilingResults$1.invokeSuspend$lambda$0(tz1.this, (ProfilingResult) obj2);
                }

                public /* synthetic */ Consumer andThen(Consumer consumer2) {
                    return Consumer$CC.$default$andThen(this, consumer2);
                }
            };
            ProfilingManager g = ak1.g(this.$context.getSystemService(ak1.w()));
            g.registerForAllProfilingResults((Executor) new Object(), consumer);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(g, consumer);
            this.label = 1;
            Object d = xu3.d(tz1Var, anonymousClass2, this);
            e50 e50Var = e50.a;
            if (d == e50Var) {
                return e50Var;
            }
        } else {
            if (i != 1) {
                hu2.h("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ta3.H(obj);
        }
        return vy2.a;
    }
}
