package defpackage;

import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultCallerKt;
import androidx.compose.foundation.layout.AlignmentLineProviderBlock;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.ResolvedFlexBoxConfig;
import androidx.compose.foundation.layout.ResolvedFlexItemInfo;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.compose.ui.layout.Measured;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class b2 implements ActivityResultCallback, AlignmentLineProviderBlock, DoubleFunction {
    public final /* synthetic */ int a;
    public final /* synthetic */ ps0 b;

    public /* synthetic */ b2(ps0 ps0Var, int i) {
        this.a = i;
        this.b = ps0Var;
    }

    @Override // androidx.compose.foundation.layout.AlignmentLineProviderBlock
    public int calculateAlignmentLinePosition(Measured measured) {
        int i = this.a;
        ps0 ps0Var = this.b;
        switch (i) {
            case 2:
                return ColumnScopeInstance.a(ps0Var, measured);
            case 3:
                return ResolvedFlexBoxConfig.a(ps0Var, measured);
            case 4:
                return ResolvedFlexItemInfo.a(ps0Var, measured);
            default:
                return RowScopeInstance.a(ps0Var, measured);
        }
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public double invoke(double d) {
        double _init_$lambda$0;
        double _init_$lambda$1;
        double _init_$lambda$2;
        double _init_$lambda$3;
        int i = this.a;
        ps0 ps0Var = this.b;
        switch (i) {
            case 5:
                _init_$lambda$0 = Rgb._init_$lambda$0(ps0Var, d);
                return _init_$lambda$0;
            case 6:
                _init_$lambda$1 = Rgb._init_$lambda$1(ps0Var, d);
                return _init_$lambda$1;
            case 7:
                _init_$lambda$2 = Rgb._init_$lambda$2(ps0Var, d);
                return _init_$lambda$2;
            default:
                _init_$lambda$3 = Rgb._init_$lambda$3(ps0Var, d);
                return _init_$lambda$3;
        }
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public void onActivityResult(Object obj) {
        int i = this.a;
        ps0 ps0Var = this.b;
        switch (i) {
            case 0:
                ActivityResultCallerKt.a(ps0Var, obj);
                return;
            default:
                ActivityResultCallerKt.b(ps0Var, obj);
                return;
        }
    }
}
