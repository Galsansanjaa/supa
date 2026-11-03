package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Velocity;
import defpackage.a10;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public interface NestedScrollConnection {

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: onPostFling-RZ2iAVY, reason: not valid java name */
        public static Object m6449onPostFlingRZ2iAVY(NestedScrollConnection nestedScrollConnection, long j, long j2, a10 a10Var) {
            Velocity m8274boximpl;
            m8274boximpl = Velocity.m8274boximpl(Velocity.Companion.m8294getZero9UxMQ8M());
            return m8274boximpl;
        }

        @Deprecated
        /* renamed from: onPostScroll-DzOQY0M, reason: not valid java name */
        public static long m6450onPostScrollDzOQY0M(NestedScrollConnection nestedScrollConnection, long j, long j2, int i) {
            return Offset.Companion.m5106getZeroF1C5BW0();
        }

        @Deprecated
        /* renamed from: onPreFling-QWom1Mo, reason: not valid java name */
        public static Object m6451onPreFlingQWom1Mo(NestedScrollConnection nestedScrollConnection, long j, a10 a10Var) {
            Velocity m8274boximpl;
            m8274boximpl = Velocity.m8274boximpl(Velocity.Companion.m8294getZero9UxMQ8M());
            return m8274boximpl;
        }

        @Deprecated
        /* renamed from: onPreScroll-OzD1aCk, reason: not valid java name */
        public static long m6452onPreScrollOzD1aCk(NestedScrollConnection nestedScrollConnection, long j, int i) {
            return Offset.Companion.m5106getZeroF1C5BW0();
        }
    }

    /* renamed from: onPostFling-RZ2iAVY */
    Object mo632onPostFlingRZ2iAVY(long j, long j2, a10 a10Var);

    /* renamed from: onPostScroll-DzOQY0M */
    long mo633onPostScrollDzOQY0M(long j, long j2, int i);

    /* renamed from: onPreFling-QWom1Mo */
    Object mo634onPreFlingQWom1Mo(long j, a10 a10Var);

    /* renamed from: onPreScroll-OzD1aCk */
    long mo635onPreScrollOzD1aCk(long j, int i);
}
