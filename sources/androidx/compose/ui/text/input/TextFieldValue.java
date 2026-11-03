package androidx.compose.ui.text.input;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.NonNullValueClassSaver;
import androidx.compose.ui.text.SaversKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import defpackage.gk2;
import defpackage.jh2;
import defpackage.nb0;
import defpackage.pp2;
import defpackage.sb0;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class TextFieldValue {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final Saver<TextFieldValue, Object> Saver = SaverKt.Saver(new gk2(16), new pp2(10));
    private final AnnotatedString annotatedString;
    private final TextRange composition;
    private final long selection;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        public final Saver<TextFieldValue, Object> getSaver() {
            return TextFieldValue.Saver;
        }
    }

    private TextFieldValue(AnnotatedString annotatedString, long j, TextRange textRange) {
        this.annotatedString = annotatedString;
        this.selection = TextRangeKt.m7492coerceIn8ffj60Q(j, 0, getText().length());
        this.composition = textRange != null ? TextRange.m7474boximpl(TextRangeKt.m7492coerceIn8ffj60Q(textRange.m7490unboximpl(), 0, getText().length())) : null;
    }

    public /* synthetic */ TextFieldValue(AnnotatedString annotatedString, long j, TextRange textRange, int i, sb0 sb0Var) {
        this(annotatedString, (i & 2) != 0 ? TextRange.Companion.m7491getZerod9O1mEE() : j, (i & 4) != 0 ? null : textRange, (sb0) null);
    }

    public /* synthetic */ TextFieldValue(AnnotatedString annotatedString, long j, TextRange textRange, sb0 sb0Var) {
        this(annotatedString, j, textRange);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private TextFieldValue(String str, long j, TextRange textRange) {
        this(new AnnotatedString(str, null, 2, 0 == true ? 1 : 0), j, textRange, (sb0) null);
    }

    public /* synthetic */ TextFieldValue(String str, long j, TextRange textRange, int i, sb0 sb0Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? TextRange.Companion.m7491getZerod9O1mEE() : j, (i & 4) != 0 ? null : textRange, (sb0) null);
    }

    public /* synthetic */ TextFieldValue(String str, long j, TextRange textRange, sb0 sb0Var) {
        this(str, j, textRange);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object Saver$lambda$0(SaverScope saverScope, TextFieldValue textFieldValue) {
        return nb0.h(SaversKt.save(textFieldValue.annotatedString, SaversKt.getAnnotatedStringSaver(), saverScope), SaversKt.save(TextRange.m7474boximpl(textFieldValue.selection), SaversKt.getSaver(TextRange.Companion), saverScope));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldValue Saver$lambda$1(Object obj) {
        obj.getClass();
        List list = (List) obj;
        Object obj2 = list.get(0);
        Saver<AnnotatedString, Object> annotatedStringSaver = SaversKt.getAnnotatedStringSaver();
        Boolean bool = Boolean.FALSE;
        TextRange textRange = null;
        AnnotatedString restore = ((!jh2.k(obj2, bool) || (annotatedStringSaver instanceof NonNullValueClassSaver)) && obj2 != null) ? annotatedStringSaver.restore(obj2) : null;
        restore.getClass();
        Object obj3 = list.get(1);
        Saver<TextRange, Object> saver = SaversKt.getSaver(TextRange.Companion);
        if ((!jh2.k(obj3, bool) || (saver instanceof NonNullValueClassSaver)) && obj3 != null) {
            textRange = saver.restore(obj3);
        }
        textRange.getClass();
        return new TextFieldValue(restore, textRange.m7490unboximpl(), (TextRange) null, 4, (sb0) null);
    }

    /* renamed from: copy-3r_uNRQ$default, reason: not valid java name */
    public static /* synthetic */ TextFieldValue m7761copy3r_uNRQ$default(TextFieldValue textFieldValue, AnnotatedString annotatedString, long j, TextRange textRange, int i, Object obj) {
        if ((i & 1) != 0) {
            annotatedString = textFieldValue.annotatedString;
        }
        if ((i & 2) != 0) {
            j = textFieldValue.selection;
        }
        if ((i & 4) != 0) {
            textRange = textFieldValue.composition;
        }
        return textFieldValue.m7763copy3r_uNRQ(annotatedString, j, textRange);
    }

    /* renamed from: copy-3r_uNRQ$default, reason: not valid java name */
    public static /* synthetic */ TextFieldValue m7762copy3r_uNRQ$default(TextFieldValue textFieldValue, String str, long j, TextRange textRange, int i, Object obj) {
        if ((i & 2) != 0) {
            j = textFieldValue.selection;
        }
        if ((i & 4) != 0) {
            textRange = textFieldValue.composition;
        }
        return textFieldValue.m7764copy3r_uNRQ(str, j, textRange);
    }

    /* renamed from: copy-3r_uNRQ, reason: not valid java name */
    public final TextFieldValue m7763copy3r_uNRQ(AnnotatedString annotatedString, long j, TextRange textRange) {
        return new TextFieldValue(annotatedString, j, textRange, (sb0) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: copy-3r_uNRQ, reason: not valid java name */
    public final TextFieldValue m7764copy3r_uNRQ(String str, long j, TextRange textRange) {
        return new TextFieldValue(new AnnotatedString(str, null, 2, 0 == true ? 1 : 0), j, textRange, (sb0) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldValue)) {
            return false;
        }
        TextFieldValue textFieldValue = (TextFieldValue) obj;
        return TextRange.m7479equalsimpl0(this.selection, textFieldValue.selection) && jh2.k(this.composition, textFieldValue.composition) && jh2.k(this.annotatedString, textFieldValue.annotatedString);
    }

    public final AnnotatedString getAnnotatedString() {
        return this.annotatedString;
    }

    /* renamed from: getComposition-MzsxiRA, reason: not valid java name */
    public final TextRange m7765getCompositionMzsxiRA() {
        return this.composition;
    }

    /* renamed from: getSelection-d9O1mEE, reason: not valid java name */
    public final long m7766getSelectiond9O1mEE() {
        return this.selection;
    }

    public final String getText() {
        return this.annotatedString.getText();
    }

    public int hashCode() {
        int m7487hashCodeimpl = (TextRange.m7487hashCodeimpl(this.selection) + (this.annotatedString.hashCode() * 31)) * 31;
        TextRange textRange = this.composition;
        return m7487hashCodeimpl + (textRange != null ? TextRange.m7487hashCodeimpl(textRange.m7490unboximpl()) : 0);
    }

    public String toString() {
        AnnotatedString annotatedString = this.annotatedString;
        return "TextFieldValue(text='" + ((Object) annotatedString) + "', selection=" + TextRange.m7489toStringimpl(this.selection) + ", composition=" + this.composition + ")";
    }
}
