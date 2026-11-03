package androidx.compose.ui.autofill;

import defpackage.sg3;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
final class AndroidContentDataType implements ContentDataType {
    private final int androidAutofillType;

    private /* synthetic */ AndroidContentDataType(int i) {
        this.androidAutofillType = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ AndroidContentDataType m4875boximpl(int i) {
        return new AndroidContentDataType(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m4876constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4877equalsimpl(int i, Object obj) {
        return (obj instanceof AndroidContentDataType) && i == ((AndroidContentDataType) obj).m4881unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4878equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4879hashCodeimpl(int i) {
        return i;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4880toStringimpl(int i) {
        return sg3.o(i, "AndroidContentDataType(androidAutofillType=", ")");
    }

    public boolean equals(Object obj) {
        return m4877equalsimpl(this.androidAutofillType, obj);
    }

    public final int getAndroidAutofillType() {
        return this.androidAutofillType;
    }

    public int hashCode() {
        return m4879hashCodeimpl(this.androidAutofillType);
    }

    public String toString() {
        return m4880toStringimpl(this.androidAutofillType);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4881unboximpl() {
        return this.androidAutofillType;
    }
}
