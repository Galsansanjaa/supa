package defpackage;

import androidx.collection.ArrayMap;
import androidx.sqlite.SQLiteConnection;
import androidx.work.impl.model.RawWorkInfoDao_Impl;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s32 implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ RawWorkInfoDao_Impl b;
    public final /* synthetic */ SQLiteConnection m;

    public /* synthetic */ s32(RawWorkInfoDao_Impl rawWorkInfoDao_Impl, SQLiteConnection sQLiteConnection, int i) {
        this.a = i;
        this.b = rawWorkInfoDao_Impl;
        this.m = sQLiteConnection;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        vy2 __fetchRelationshipWorkProgressAsandroidxWorkData$lambda$4;
        vy2 __fetchRelationshipWorkTagAsjavaLangString$lambda$3;
        int i = this.a;
        SQLiteConnection sQLiteConnection = this.m;
        RawWorkInfoDao_Impl rawWorkInfoDao_Impl = this.b;
        ArrayMap arrayMap = (ArrayMap) obj;
        switch (i) {
            case 0:
                __fetchRelationshipWorkProgressAsandroidxWorkData$lambda$4 = RawWorkInfoDao_Impl.__fetchRelationshipWorkProgressAsandroidxWorkData$lambda$4(rawWorkInfoDao_Impl, sQLiteConnection, arrayMap);
                return __fetchRelationshipWorkProgressAsandroidxWorkData$lambda$4;
            default:
                __fetchRelationshipWorkTagAsjavaLangString$lambda$3 = RawWorkInfoDao_Impl.__fetchRelationshipWorkTagAsjavaLangString$lambda$3(rawWorkInfoDao_Impl, sQLiteConnection, arrayMap);
                return __fetchRelationshipWorkTagAsjavaLangString$lambda$3;
        }
    }
}
