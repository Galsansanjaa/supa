package androidx.compose.foundation.text.input.internal.undo;

import androidx.compose.foundation.text.UndoManager_jvmAndAndroidKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import defpackage.nb0;
import defpackage.sb0;
import defpackage.v5;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class TextUndoOperation {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final Saver<TextUndoOperation, Object> Saver = new Saver<TextUndoOperation, Object>() { // from class: androidx.compose.foundation.text.input.internal.undo.TextUndoOperation$Companion$Saver$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.compose.runtime.saveable.Saver
        public TextUndoOperation restore(Object obj) {
            obj.getClass();
            List list = (List) obj;
            Object obj2 = list.get(0);
            obj2.getClass();
            int intValue = ((Integer) obj2).intValue();
            Object obj3 = list.get(1);
            obj3.getClass();
            String str = (String) obj3;
            Object obj4 = list.get(2);
            obj4.getClass();
            String str2 = (String) obj4;
            Object obj5 = list.get(3);
            obj5.getClass();
            int intValue2 = ((Integer) obj5).intValue();
            Object obj6 = list.get(4);
            obj6.getClass();
            long TextRange = TextRangeKt.TextRange(intValue2, ((Integer) obj6).intValue());
            Object obj7 = list.get(5);
            obj7.getClass();
            int intValue3 = ((Integer) obj7).intValue();
            Object obj8 = list.get(6);
            obj8.getClass();
            long TextRange2 = TextRangeKt.TextRange(intValue3, ((Integer) obj8).intValue());
            Object obj9 = list.get(7);
            obj9.getClass();
            return new TextUndoOperation(intValue, str, str2, TextRange, TextRange2, ((Long) obj9).longValue(), false, 64, null);
        }

        @Override // androidx.compose.runtime.saveable.Saver
        public Object save(SaverScope saverScope, TextUndoOperation textUndoOperation) {
            return nb0.D(Integer.valueOf(textUndoOperation.getIndex()), textUndoOperation.getPreText(), textUndoOperation.getPostText(), Integer.valueOf(TextRange.m7486getStartimpl(textUndoOperation.m2034getPreSelectiond9O1mEE())), Integer.valueOf(TextRange.m7481getEndimpl(textUndoOperation.m2034getPreSelectiond9O1mEE())), Integer.valueOf(TextRange.m7486getStartimpl(textUndoOperation.m2033getPostSelectiond9O1mEE())), Integer.valueOf(TextRange.m7481getEndimpl(textUndoOperation.m2033getPostSelectiond9O1mEE())), Long.valueOf(textUndoOperation.getTimeInMillis()));
        }
    };
    private final boolean canMerge;
    private final int index;
    private final long postSelection;
    private final String postText;
    private final long preSelection;
    private final String preText;
    private final TextEditType textEditType;
    private final long timeInMillis;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        public final Saver<TextUndoOperation, Object> getSaver() {
            return TextUndoOperation.Saver;
        }
    }

    private TextUndoOperation(int i, String str, String str2, long j, long j2, long j3, boolean z) {
        this.index = i;
        this.preText = str;
        this.postText = str2;
        this.preSelection = j;
        this.postSelection = j2;
        this.timeInMillis = j3;
        this.canMerge = z;
        if (str.length() == 0 && str2.length() == 0) {
            v5.m("Either pre or post text must not be empty");
            throw null;
        }
        this.textEditType = (str.length() != 0 || str2.length() <= 0) ? (str.length() <= 0 || str2.length() != 0) ? TextEditType.Replace : TextEditType.Delete : TextEditType.Insert;
    }

    public /* synthetic */ TextUndoOperation(int i, String str, String str2, long j, long j2, long j3, boolean z, int i2, sb0 sb0Var) {
        this(i, str, str2, j, j2, (i2 & 32) != 0 ? UndoManager_jvmAndAndroidKt.timeNowMillis() : j3, (i2 & 64) != 0 ? true : z, null);
    }

    public /* synthetic */ TextUndoOperation(int i, String str, String str2, long j, long j2, long j3, boolean z, sb0 sb0Var) {
        this(i, str, str2, j, j2, j3, z);
    }

    public final boolean getCanMerge() {
        return this.canMerge;
    }

    public final TextDeleteType getDeletionType() {
        if (this.textEditType == TextEditType.Delete && TextRange.m7480getCollapsedimpl(this.postSelection)) {
            boolean m7480getCollapsedimpl = TextRange.m7480getCollapsedimpl(this.preSelection);
            long j = this.preSelection;
            return m7480getCollapsedimpl ? TextRange.m7486getStartimpl(j) > TextRange.m7486getStartimpl(this.postSelection) ? TextDeleteType.Start : TextDeleteType.End : (TextRange.m7486getStartimpl(j) == TextRange.m7486getStartimpl(this.postSelection) && TextRange.m7486getStartimpl(this.preSelection) == this.index) ? TextDeleteType.Inner : TextDeleteType.NotByUser;
        }
        return TextDeleteType.NotByUser;
    }

    public final int getIndex() {
        return this.index;
    }

    /* renamed from: getPostSelection-d9O1mEE, reason: not valid java name */
    public final long m2033getPostSelectiond9O1mEE() {
        return this.postSelection;
    }

    public final String getPostText() {
        return this.postText;
    }

    /* renamed from: getPreSelection-d9O1mEE, reason: not valid java name */
    public final long m2034getPreSelectiond9O1mEE() {
        return this.preSelection;
    }

    public final String getPreText() {
        return this.preText;
    }

    public final TextEditType getTextEditType() {
        return this.textEditType;
    }

    public final long getTimeInMillis() {
        return this.timeInMillis;
    }
}
