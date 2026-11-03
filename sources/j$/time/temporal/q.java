package j$.time.temporal;

import j$.time.format.a0;
import j$.time.format.b0;
import java.util.Map;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes2.dex */
public interface q {
    boolean e(TemporalAccessor temporalAccessor);

    u f(TemporalAccessor temporalAccessor);

    TemporalAccessor g(Map map, a0 a0Var, b0 b0Var);

    boolean isDateBased();

    long j(TemporalAccessor temporalAccessor);

    u range();

    m t(m mVar, long j);
}
