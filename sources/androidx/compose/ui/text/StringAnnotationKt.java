package androidx.compose.ui.text;

import androidx.compose.ui.text.AnnotatedString;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class StringAnnotationKt {
    public static final AnnotatedString.Range<String> unbox(AnnotatedString.Range<? extends AnnotatedString.Annotation> range) {
        AnnotatedString.Annotation item = range.getItem();
        item.getClass();
        return new AnnotatedString.Range<>(((StringAnnotation) item).m7440unboximpl(), range.getStart(), range.getEnd(), range.getTag());
    }
}
