package androidx.compose.runtime.composer.linkbuffer.changelist;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class OperationArgContainerKt {
    public static final long getLong(OperationArgContainer operationArgContainer, int i, int i2) {
        return (operationArgContainer.getInt(i) << 32) | (operationArgContainer.getInt(i2) & 4294967295L);
    }
}
