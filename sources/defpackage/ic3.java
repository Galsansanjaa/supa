package defpackage;

import android.text.Editable;
import android.text.Html;
import java.util.ArrayList;
import org.xml.sax.XMLReader;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class ic3 implements Html.TagHandler {
    public final ArrayList a = new ArrayList();

    /* JADX WARN: Type inference failed for: r5v4, types: [he3, java.lang.Object, md3] */
    @Override // android.text.Html.TagHandler
    public final void handleTag(boolean z, String str, Editable editable, XMLReader xMLReader) {
        editable.getClass();
        boolean equals = "customUl".equals(str);
        int i = 0;
        ArrayList arrayList = this.a;
        if (equals && z) {
            arrayList.add(0, new md3());
            return;
        }
        if ("customOl".equals(str) && z) {
            ?? md3Var = new md3();
            md3Var.b = 1;
            arrayList.add(0, md3Var);
            return;
        }
        if (("customUl".equals(str) || "customOl".equals(str)) && !z) {
            arrayList.remove(0);
            return;
        }
        if ("customLi".equals(str) && z) {
            ((md3) kw.p0(arrayList)).a(editable);
            return;
        }
        if (!"customLi".equals(str) || z) {
            return;
        }
        md3 md3Var2 = (md3) kw.p0(arrayList);
        int size = arrayList.size();
        md3Var2.getClass();
        if (editable.length() > 0 && editable.charAt(editable.length() - 1) != '\n') {
            editable.append("\n");
        }
        md3[] md3VarArr = (md3[]) editable.getSpans(0, editable.length(), md3.class);
        md3VarArr.getClass();
        md3 md3Var3 = md3VarArr.length == 0 ? null : md3VarArr[md3VarArr.length - 1];
        int spanStart = editable.getSpanStart(md3Var3);
        editable.removeSpan(md3Var3);
        if (spanStart != editable.length()) {
            Object[] b = md3Var2.b(size);
            int length = b.length;
            while (i < length) {
                Object obj = b[i];
                i++;
                editable.setSpan(obj, spanStart, editable.length(), 33);
            }
        }
    }
}
