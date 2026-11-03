package defpackage;

import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import androidx.compose.foundation.gestures.TransformableStateKt;
import androidx.compose.foundation.text.selection.Selectable;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.foundation.text.selection.SelectionManager;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.AndroidParagraphIntrinsics;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class c6 implements vs0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c6(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.vs0
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        Selection updateSubSelections$lambda$2;
        vy2 _init_$lambda$1;
        int i = this.a;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                return AndroidParagraphIntrinsics.a((AndroidParagraphIntrinsics) obj5, (FontFamily) obj, (FontWeight) obj2, (FontStyle) obj3, (FontSynthesis) obj4);
            case 1:
                return FrameworkSQLiteDatabase.j((SupportSQLiteQuery) obj5, (SQLiteDatabase) obj, (SQLiteCursorDriver) obj2, (String) obj3, (SQLiteQuery) obj4);
            case 2:
                updateSubSelections$lambda$2 = SelectionManager.updateSubSelections$lambda$2((Selection) obj5, (Selectable) obj, ((Boolean) obj2).booleanValue(), ((Integer) obj3).intValue(), ((Boolean) obj4).booleanValue());
                return updateSubSelections$lambda$2;
            case 3:
                _init_$lambda$1 = SelectionManager._init_$lambda$1((SelectionManager) obj5, ((Boolean) obj).booleanValue(), (LayoutCoordinates) obj2, (Offset) obj3, (SelectionAdjustment) obj4);
                return _init_$lambda$1;
            default:
                return TransformableStateKt.c((State) obj5, (Offset) obj, ((Float) obj2).floatValue(), (Offset) obj3, ((Float) obj4).floatValue());
        }
    }
}
