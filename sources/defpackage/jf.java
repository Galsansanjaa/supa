package defpackage;

import androidx.compose.material3.TimePickerKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.room.support.AutoClosingRoomOpenHelper;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class jf implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ jf(boolean z, int i) {
        this.a = i;
        this.b = z;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        vy2 foreignKeyConstraintsEnabled$lambda$12;
        vy2 ToggleItem$lambda$49$lambda$48;
        int i = this.a;
        boolean z = this.b;
        switch (i) {
            case 0:
                foreignKeyConstraintsEnabled$lambda$12 = AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.setForeignKeyConstraintsEnabled$lambda$12(z, (SupportSQLiteDatabase) obj);
                return foreignKeyConstraintsEnabled$lambda$12;
            default:
                ToggleItem$lambda$49$lambda$48 = TimePickerKt.ToggleItem$lambda$49$lambda$48(z, (SemanticsPropertyReceiver) obj);
                return ToggleItem$lambda$49$lambda$48;
        }
    }
}
