package androidx.compose.ui.text;

import androidx.compose.ui.text.AnnotatedString;
import defpackage.jh2;
import defpackage.k93;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class StringAnnotation implements AnnotatedString.Annotation {
    private final String value;

    private /* synthetic */ StringAnnotation(String str) {
        this.value = str;
    }

    /* renamed from: box-impl */
    public static final /* synthetic */ StringAnnotation m7434boximpl(String str) {
        return new StringAnnotation(str);
    }

    /* renamed from: constructor-impl */
    public static String m7435constructorimpl(String str) {
        return str;
    }

    /* renamed from: equals-impl */
    public static boolean m7436equalsimpl(String str, Object obj) {
        return (obj instanceof StringAnnotation) && jh2.k(str, ((StringAnnotation) obj).m7440unboximpl());
    }

    /* renamed from: equals-impl0 */
    public static final boolean m7437equalsimpl0(String str, String str2) {
        return jh2.k(str, str2);
    }

    /* renamed from: hashCode-impl */
    public static int m7438hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl */
    public static String m7439toStringimpl(String str) {
        return k93.m("StringAnnotation(value=", str, ")");
    }

    public boolean equals(Object obj) {
        return m7436equalsimpl(this.value, obj);
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return m7438hashCodeimpl(this.value);
    }

    public String toString() {
        return m7439toStringimpl(this.value);
    }

    /* renamed from: unbox-impl */
    public final /* synthetic */ String m7440unboximpl() {
        return this.value;
    }
}
