package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.unit.Density;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public interface FlexConfigScope extends Density {
    void alignSelf(AlignmentLine alignmentLine);

    void alignSelf(ps0 ps0Var);

    /* renamed from: alignSelf-aKVMlHY, reason: not valid java name */
    void mo875alignSelfaKVMlHY(int i);

    void basis(float f);

    /* renamed from: basis-0680j_4, reason: not valid java name */
    void mo876basis0680j_4(float f);

    /* renamed from: basis-MFoeH6Y, reason: not valid java name */
    void mo877basisMFoeH6Y(long j);

    int getFlexBoxCrossAxisMax();

    int getFlexBoxCrossAxisMin();

    int getFlexBoxMainAxisMax();

    int getFlexBoxMainAxisMin();

    void grow(float f);

    void order(int i);

    void shrink(float f);
}
