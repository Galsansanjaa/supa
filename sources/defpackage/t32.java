package defpackage;

import androidx.room.RoomRawQuery;
import androidx.sqlite.SQLiteConnection;
import androidx.work.impl.model.RawWorkInfoDao_Impl;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t32 implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ RoomRawQuery m;
    public final /* synthetic */ RawWorkInfoDao_Impl n;

    public /* synthetic */ t32(String str, RoomRawQuery roomRawQuery, RawWorkInfoDao_Impl rawWorkInfoDao_Impl, int i) {
        this.a = i;
        this.b = str;
        this.m = roomRawQuery;
        this.n = rawWorkInfoDao_Impl;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        int i = this.a;
        RawWorkInfoDao_Impl rawWorkInfoDao_Impl = this.n;
        RoomRawQuery roomRawQuery = this.m;
        String str = this.b;
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj;
        switch (i) {
            case 0:
                return RawWorkInfoDao_Impl.d(str, roomRawQuery, rawWorkInfoDao_Impl, sQLiteConnection);
            case 1:
                return RawWorkInfoDao_Impl.b(str, roomRawQuery, rawWorkInfoDao_Impl, sQLiteConnection);
            default:
                return RawWorkInfoDao_Impl.c(str, roomRawQuery, rawWorkInfoDao_Impl, sQLiteConnection);
        }
    }
}
