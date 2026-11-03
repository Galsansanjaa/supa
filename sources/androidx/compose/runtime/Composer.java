package androidx.compose.runtime;

import androidx.compose.runtime.tooling.ComposeStackTraceMode;
import androidx.compose.runtime.tooling.CompositionData;
import defpackage.dv1;
import defpackage.hd0;
import defpackage.j20;
import defpackage.os0;
import defpackage.ts0;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public interface Composer {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final Object Empty = new Object() { // from class: androidx.compose.runtime.Composer$Companion$Empty$1
            public String toString() {
                return "Empty";
            }
        };

        private Companion() {
        }

        public final Object getEmpty() {
            return Empty;
        }

        @hd0
        public final void setDiagnosticStackTraceEnabled(boolean z) {
            ComposeStackTraceMode.Companion companion = ComposeStackTraceMode.Companion;
            ComposerKt.m4460setComposeStackTraceMode76WK1J0(z ? companion.m4800getSourceInformationMD5MrJc() : companion.m4799getNoneMD5MrJc());
        }

        /* renamed from: setDiagnosticStackTraceMode-76WK1J0, reason: not valid java name */
        public final void m4459setDiagnosticStackTraceMode76WK1J0(int i) {
            ComposerKt.m4460setComposeStackTraceMode76WK1J0(i);
        }

        public final void setTracer(CompositionTracer compositionTracer) {
            ComposerKt.access$setCompositionTracer$p(compositionTracer);
        }
    }

    @ComposeCompilerApi
    <V, T> void apply(V v, ts0 ts0Var);

    CompositionContext buildContext();

    @ComposeCompilerApi
    boolean changed(byte b);

    @ComposeCompilerApi
    boolean changed(char c);

    @ComposeCompilerApi
    boolean changed(double d);

    @ComposeCompilerApi
    boolean changed(float f);

    @ComposeCompilerApi
    boolean changed(int i);

    @ComposeCompilerApi
    boolean changed(long j);

    @ComposeCompilerApi
    boolean changed(Object obj);

    @ComposeCompilerApi
    boolean changed(short s);

    @ComposeCompilerApi
    boolean changed(boolean z);

    @ComposeCompilerApi
    boolean changedInstance(Object obj);

    void collectParameterInformation();

    <T> T consume(CompositionLocal<T> compositionLocal);

    @ComposeCompilerApi
    <T> void createNode(os0 os0Var);

    @ComposeCompilerApi
    void deactivateToEndGroup(boolean z);

    @ComposeCompilerApi
    void disableReusing();

    void disableSourceInformation();

    @ComposeCompilerApi
    void enableReusing();

    @ComposeCompilerApi
    void endDefaults();

    @ComposeCompilerApi
    void endMovableGroup();

    @ComposeCompilerApi
    void endNode();

    void endProvider();

    void endProviders();

    @ComposeCompilerApi
    void endReplaceGroup();

    @ComposeCompilerApi
    void endReplaceableGroup();

    @ComposeCompilerApi
    ScopeUpdateScope endRestartGroup();

    @ComposeCompilerApi
    void endReusableGroup();

    @ComposeCompilerApi
    void endToMarker(int i);

    Applier<?> getApplier();

    j20 getApplyCoroutineContext();

    long getCompositeKeyHashCode();

    ControlledComposition getComposition();

    CompositionData getCompositionData();

    int getCompoundKeyHash();

    CompositionLocalMap getCurrentCompositionLocalMap();

    int getCurrentMarker();

    boolean getDefaultsInvalid();

    boolean getInserting();

    RecomposeScope getRecomposeScope();

    Object getRecomposeScopeIdentity();

    boolean getSkipping();

    void insertMovableContent(MovableContent<?> movableContent, Object obj);

    void insertMovableContentReferences(List<dv1> list);

    @ComposeCompilerApi
    Object joinKey(Object obj, Object obj2);

    void recordSideEffect(os0 os0Var);

    void recordUsed(RecomposeScope recomposeScope);

    @ComposeCompilerApi
    Object rememberedValue();

    CancellationHandle scheduleFrameEndCallback(os0 os0Var);

    boolean shouldExecute(boolean z, int i);

    @ComposeCompilerApi
    void skipCurrentGroup();

    @ComposeCompilerApi
    void skipToGroupEnd();

    void sourceInformation(String str);

    void sourceInformationMarkerEnd();

    void sourceInformationMarkerStart(int i, String str);

    @ComposeCompilerApi
    void startDefaults();

    @ComposeCompilerApi
    void startMovableGroup(int i, Object obj);

    @ComposeCompilerApi
    void startNode();

    void startProvider(ProvidedValue<?> providedValue);

    void startProviders(ProvidedValue<?>[] providedValueArr);

    @ComposeCompilerApi
    void startReplaceGroup(int i);

    @ComposeCompilerApi
    void startReplaceableGroup(int i);

    @ComposeCompilerApi
    Composer startRestartGroup(int i);

    @ComposeCompilerApi
    void startReusableGroup(int i, Object obj);

    @ComposeCompilerApi
    void startReusableNode();

    @ComposeCompilerApi
    void updateRememberedValue(Object obj);

    @ComposeCompilerApi
    void useNode();
}
