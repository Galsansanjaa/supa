package androidx.datastore.core;

import androidx.compose.foundation.style.StylePropertiesKt;
import androidx.datastore.core.DataMigrationInitializer;
import defpackage.a10;
import defpackage.c10;
import defpackage.lb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
@lb0(c = "androidx.datastore.core.DataMigrationInitializer$Companion", f = "DataMigrationInitializer.kt", l = {42, StylePropertiesKt.ContentBrushId}, m = "runMigrations")
/* loaded from: classes3.dex */
public final class DataMigrationInitializer$Companion$runMigrations$1<T> extends c10 {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DataMigrationInitializer.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataMigrationInitializer$Companion$runMigrations$1(DataMigrationInitializer.Companion companion, a10 a10Var) {
        super(a10Var);
        this.this$0 = companion;
    }

    @Override // defpackage.cm
    public final Object invokeSuspend(Object obj) {
        Object runMigrations;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        runMigrations = this.this$0.runMigrations(null, null, this);
        return runMigrations;
    }
}
