package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.mi2;
import defpackage.ts0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class TextLayoutState implements HeightForSingleLineFieldProvider {
    public static final int $stable = 8;
    private final BringIntoViewRequester bringIntoViewRequester;
    private final MutableState coreNodeCoordinates$delegate;
    private final MutableState decoratorNodeCoordinates$delegate;
    private final MutableState heightForSingleLineField$delegate;
    private TextFieldLayoutStateCache layoutCache;
    private final TextFieldLayoutStateCache layoutResult$delegate;
    private ts0 onTextLayout;
    private final MutableState textLayoutNodeCoordinates$delegate;

    public TextLayoutState() {
        MutableState mutableStateOf$default;
        TextFieldLayoutStateCache textFieldLayoutStateCache = new TextFieldLayoutStateCache();
        this.layoutCache = textFieldLayoutStateCache;
        this.layoutResult$delegate = textFieldLayoutStateCache;
        this.textLayoutNodeCoordinates$delegate = SnapshotStateKt.mutableStateOf(null, SnapshotStateKt.neverEqualPolicy());
        this.coreNodeCoordinates$delegate = SnapshotStateKt.mutableStateOf(null, SnapshotStateKt.neverEqualPolicy());
        this.decoratorNodeCoordinates$delegate = SnapshotStateKt.mutableStateOf(null, SnapshotStateKt.neverEqualPolicy());
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Dp.m8047boximpl(Dp.m8049constructorimpl(0.0f)), null, 2, null);
        this.heightForSingleLineField$delegate = mutableStateOf$default;
        this.bringIntoViewRequester = BringIntoViewRequesterKt.BringIntoViewRequester();
    }

    public static /* synthetic */ TextLayoutResult a(TextLayoutState textLayoutState) {
        return layoutWithNewMeasureInputs__hBUhpc$lambda$0$0(textLayoutState);
    }

    /* renamed from: getOffsetForPosition-3MmeM6k$default */
    public static /* synthetic */ int m1946getOffsetForPosition3MmeM6k$default(TextLayoutState textLayoutState, long j, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return textLayoutState.m1948getOffsetForPosition3MmeM6k(j, z);
    }

    public static final TextLayoutResult layoutWithNewMeasureInputs__hBUhpc$lambda$0$0(TextLayoutState textLayoutState) {
        return textLayoutState.layoutCache.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        if (r1 == null) goto L25;
     */
    /* renamed from: coercedInVisibleBoundsOfInputText-MK-Hz9U$foundation */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long m1947coercedInVisibleBoundsOfInputTextMKHz9U$foundation(long r5) {
        /*
            r4 = this;
            androidx.compose.ui.layout.LayoutCoordinates r0 = r4.getTextLayoutNodeCoordinates()
            if (r0 == 0) goto L22
            boolean r1 = r0.isAttached()
            if (r1 == 0) goto L1a
            androidx.compose.ui.layout.LayoutCoordinates r4 = r4.getDecoratorNodeCoordinates()
            r1 = 0
            if (r4 == 0) goto L20
            r2 = 0
            r3 = 2
            androidx.compose.ui.geometry.Rect r1 = defpackage.yo0.g(r4, r0, r2, r3, r1)
            goto L20
        L1a:
            androidx.compose.ui.geometry.Rect$Companion r4 = androidx.compose.ui.geometry.Rect.Companion
            androidx.compose.ui.geometry.Rect r1 = r4.getZero()
        L20:
            if (r1 != 0) goto L28
        L22:
            androidx.compose.ui.geometry.Rect$Companion r4 = androidx.compose.ui.geometry.Rect.Companion
            androidx.compose.ui.geometry.Rect r1 = r4.getZero()
        L28:
            long r4 = androidx.compose.foundation.text.input.internal.TextLayoutStateKt.m1952coerceIn3MmeM6k(r5, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.TextLayoutState.m1947coercedInVisibleBoundsOfInputTextMKHz9U$foundation(long):long");
    }

    public final BringIntoViewRequester getBringIntoViewRequester() {
        return this.bringIntoViewRequester;
    }

    public final LayoutCoordinates getCoreNodeCoordinates() {
        return (LayoutCoordinates) this.coreNodeCoordinates$delegate.getValue();
    }

    public final LayoutCoordinates getDecoratorNodeCoordinates() {
        return (LayoutCoordinates) this.decoratorNodeCoordinates$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.text.input.internal.HeightForSingleLineFieldProvider
    /* renamed from: getHeightForSingleLineField-D9Ej5fM */
    public float mo1606getHeightForSingleLineFieldD9Ej5fM() {
        return ((Dp) this.heightForSingleLineField$delegate.getValue()).m8063unboximpl();
    }

    public final TextLayoutResult getLayoutResult() {
        return this.layoutResult$delegate.getValue();
    }

    /* renamed from: getOffsetForPosition-3MmeM6k */
    public final int m1948getOffsetForPosition3MmeM6k(long j, boolean z) {
        TextLayoutResult layoutResult = getLayoutResult();
        if (layoutResult == null) {
            return -1;
        }
        if (z) {
            j = m1947coercedInVisibleBoundsOfInputTextMKHz9U$foundation(j);
        }
        return layoutResult.m7456getOffsetForPositionk4lQ0M(TextLayoutStateKt.m1953fromDecorationToTextLayoutUv8p0NA(this, j));
    }

    public final ts0 getOnTextLayout() {
        return this.onTextLayout;
    }

    public final LayoutCoordinates getTextLayoutNodeCoordinates() {
        return (LayoutCoordinates) this.textLayoutNodeCoordinates$delegate.getValue();
    }

    /* renamed from: isPositionOnText-k-4lQ0M */
    public final boolean m1949isPositionOnTextk4lQ0M(long j) {
        TextLayoutResult layoutResult = getLayoutResult();
        if (layoutResult == null) {
            return false;
        }
        long m1953fromDecorationToTextLayoutUv8p0NA = TextLayoutStateKt.m1953fromDecorationToTextLayoutUv8p0NA(this, m1947coercedInVisibleBoundsOfInputTextMKHz9U$foundation(j));
        int lineForVerticalPosition = layoutResult.getLineForVerticalPosition(Float.intBitsToFloat((int) (4294967295L & m1953fromDecorationToTextLayoutUv8p0NA)));
        int i = (int) (m1953fromDecorationToTextLayoutUv8p0NA >> 32);
        return Float.intBitsToFloat(i) >= layoutResult.getLineLeft(lineForVerticalPosition) && Float.intBitsToFloat(i) <= layoutResult.getLineRight(lineForVerticalPosition);
    }

    /* renamed from: layoutWithNewMeasureInputs--hBUhpc */
    public final TextLayoutResult m1950layoutWithNewMeasureInputshBUhpc(Density density, LayoutDirection layoutDirection, FontFamily.Resolver resolver, long j) {
        TextLayoutResult m1940layoutWithNewMeasureInputshBUhpc = this.layoutCache.m1940layoutWithNewMeasureInputshBUhpc(density, layoutDirection, resolver, j);
        ts0 ts0Var = this.onTextLayout;
        if (ts0Var != null) {
            ts0Var.invoke(density, new mi2(this, 11));
        }
        return m1940layoutWithNewMeasureInputshBUhpc;
    }

    public final void setCoreNodeCoordinates(LayoutCoordinates layoutCoordinates) {
        this.coreNodeCoordinates$delegate.setValue(layoutCoordinates);
    }

    public final void setDecoratorNodeCoordinates(LayoutCoordinates layoutCoordinates) {
        this.decoratorNodeCoordinates$delegate.setValue(layoutCoordinates);
    }

    /* renamed from: setHeightForSingleLineField-0680j_4 */
    public void m1951setHeightForSingleLineField0680j_4(float f) {
        this.heightForSingleLineField$delegate.setValue(Dp.m8047boximpl(f));
    }

    public final void setOnTextLayout(ts0 ts0Var) {
        this.onTextLayout = ts0Var;
    }

    public final void setTextLayoutNodeCoordinates(LayoutCoordinates layoutCoordinates) {
        this.textLayoutNodeCoordinates$delegate.setValue(layoutCoordinates);
    }

    public final void updateNonMeasureInputs(TransformedTextFieldState transformedTextFieldState, TextStyle textStyle, boolean z, boolean z2, KeyboardOptions keyboardOptions) {
        this.layoutCache.updateNonMeasureInputs(transformedTextFieldState, textStyle, z, z2, keyboardOptions);
    }
}
