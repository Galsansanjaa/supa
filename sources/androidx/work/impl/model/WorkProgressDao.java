package androidx.work.impl.model;

import androidx.work.Data;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public interface WorkProgressDao {
    void delete(String str);

    void deleteAll();

    Data getProgressForWorkSpecId(String str);

    void insert(WorkProgress workProgress);
}
