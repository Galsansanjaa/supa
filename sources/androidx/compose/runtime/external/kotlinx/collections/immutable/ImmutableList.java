package androidx.compose.runtime.external.kotlinx.collections.immutable;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
import defpackage.fa1;
import defpackage.r0;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public interface ImmutableList<E> extends List<E>, ImmutableCollection<E>, fa1 {

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class SubList<E> extends r0 implements ImmutableList<E> {
        private int _size;
        private final int fromIndex;
        private final ImmutableList<E> source;
        private final int toIndex;

        /* JADX WARN: Multi-variable type inference failed */
        public SubList(ImmutableList<? extends E> immutableList, int i, int i2) {
            this.source = immutableList;
            this.fromIndex = i;
            this.toIndex = i2;
            ListImplementation.checkRangeIndexes$runtime(i, i2, immutableList.size());
            this._size = i2 - i;
        }

        @Override // defpackage.r0, java.util.List
        public E get(int i) {
            ListImplementation.checkElementIndex$runtime(i, this._size);
            return this.source.get(this.fromIndex + i);
        }

        @Override // defpackage.r0, defpackage.o
        public int getSize() {
            return this._size;
        }

        @Override // defpackage.r0, java.util.List
        public ImmutableList<E> subList(int i, int i2) {
            ListImplementation.checkRangeIndexes$runtime(i, i2, this._size);
            ImmutableList<E> immutableList = this.source;
            int i3 = this.fromIndex;
            return new SubList(immutableList, i + i3, i3 + i2);
        }
    }

    @Override // java.util.List
    ImmutableList<E> subList(int i, int i2);

    @Override // java.util.List
    /* bridge */ /* synthetic */ List subList(int i, int i2);
}
