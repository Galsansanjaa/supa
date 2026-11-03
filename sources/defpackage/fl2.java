package defpackage;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import j$.util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class fl2 implements Appendable, CharSequence {
    public final ArrayDeque b = new ArrayDeque(8);
    public final StringBuilder a = new StringBuilder((CharSequence) "");

    public fl2() {
        b(0, "");
    }

    public static void c(fl2 fl2Var, Object obj, int i, int i2) {
        if (obj != null) {
            if (!obj.getClass().isArray()) {
                fl2Var.b.push(new dl2(i, i2, 33, obj));
                return;
            }
            for (Object obj2 : (Object[]) obj) {
                c(fl2Var, obj2, i, i2);
            }
        }
    }

    public final void a(char c) {
        this.a.append(c);
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        this.a.append(c);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        StringBuilder sb = this.a;
        b(sb.length(), charSequence);
        sb.append(charSequence);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        CharSequence subSequence = charSequence.subSequence(i, i2);
        StringBuilder sb = this.a;
        b(sb.length(), subSequence);
        sb.append(subSequence);
        return this;
    }

    public final void b(int i, CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            boolean z = spanned instanceof el2;
            Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
            int length = spans != null ? spans.length : 0;
            if (length > 0) {
                ArrayDeque arrayDeque = this.b;
                if (!z) {
                    for (int i2 = 0; i2 < length; i2++) {
                        Object obj = spans[i2];
                        arrayDeque.push(new dl2(spanned.getSpanStart(obj) + i, spanned.getSpanEnd(obj) + i, spanned.getSpanFlags(obj), obj));
                    }
                    return;
                }
                for (int i3 = length - 1; i3 >= 0; i3--) {
                    Object obj2 = spans[i3];
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) spanned;
                    arrayDeque.push(new dl2(spannableStringBuilder.getSpanStart(obj2) + i, spannableStringBuilder.getSpanEnd(obj2) + i, spannableStringBuilder.getSpanFlags(obj2), obj2));
                }
            }
        }
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.a.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.a.length();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        List<dl2> list;
        int i3;
        StringBuilder sb = this.a;
        int length = sb.length();
        if (i2 <= i || i < 0 || i2 > length) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayDeque arrayDeque = this.b;
            if (i == 0 && length == i2) {
                ArrayList arrayList = new ArrayList(arrayDeque);
                Collections.reverse(arrayList);
                list = DesugarCollections.unmodifiableList(arrayList);
            } else {
                ArrayList arrayList2 = new ArrayList(0);
                Iterator descendingIterator = arrayDeque.descendingIterator();
                while (descendingIterator.hasNext()) {
                    dl2 dl2Var = (dl2) descendingIterator.next();
                    int i4 = dl2Var.b;
                    if ((i4 >= i && i4 < i2) || (((i3 = dl2Var.c) <= i2 && i3 > i) || (i4 < i && i3 > i2))) {
                        arrayList2.add(dl2Var);
                    }
                }
                list = DesugarCollections.unmodifiableList(arrayList2);
            }
        }
        if (list.isEmpty()) {
            return sb.subSequence(i, i2);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb.subSequence(i, i2));
        int length2 = spannableStringBuilder.length();
        for (dl2 dl2Var2 : list) {
            int max = Math.max(0, dl2Var2.b - i);
            spannableStringBuilder.setSpan(dl2Var2.a, max, Math.min(length2, (dl2Var2.c - dl2Var2.b) + max), dl2Var2.d);
        }
        return spannableStringBuilder;
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.a.toString();
    }
}
