package com.google.gson.internal.sql;

import defpackage.ml2;
import j$.util.DesugarCollections;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class a {
    public static final List a;

    static {
        boolean z;
        try {
            Class.forName("java.sql.Date");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        if (!z) {
            a = Collections.EMPTY_LIST;
            return;
        }
        new ml2(Date.class, 0);
        new ml2(Timestamp.class, 1);
        a = DesugarCollections.unmodifiableList(Arrays.asList(SqlTimeTypeAdapter.b, SqlDateTypeAdapter.b, SqlTimestampTypeAdapter.b));
    }
}
