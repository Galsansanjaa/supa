package androidx.activity;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.a10;
import defpackage.c10;
import defpackage.lb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
@lb0(c = "androidx.activity.FullyDrawnReporterKt", f = "FullyDrawnReporter.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "reportWhenComplete")
/* loaded from: classes.dex */
public final class FullyDrawnReporterKt$reportWhenComplete$1 extends c10 {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public FullyDrawnReporterKt$reportWhenComplete$1(a10 a10Var) {
        super(a10Var);
    }

    @Override // defpackage.cm
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return FullyDrawnReporterKt.reportWhenComplete(null, null, this);
    }
}
