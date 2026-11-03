package androidx.compose.runtime.composer.gapbuffer;

import defpackage.fa1;
import java.util.Iterator;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class SlotWriter$groupSlots$1 implements Iterator<Object>, fa1 {
    final /* synthetic */ int $end;
    private int current;
    final /* synthetic */ SlotWriter this$0;

    public SlotWriter$groupSlots$1(int i, int i2, SlotWriter slotWriter) {
        this.$end = i2;
        this.this$0 = slotWriter;
        this.current = i;
    }

    public final int getCurrent() {
        return this.current;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.current < this.$end;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!hasNext()) {
            return null;
        }
        Object[] objArr = this.this$0.slots;
        SlotWriter slotWriter = this.this$0;
        int i = this.current;
        this.current = i + 1;
        return objArr[slotWriter.dataIndexToDataAddress(i)];
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setCurrent(int i) {
        this.current = i;
    }
}
