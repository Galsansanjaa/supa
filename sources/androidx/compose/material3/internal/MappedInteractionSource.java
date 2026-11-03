package androidx.compose.material3.internal;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.ui.geometry.Offset;
import defpackage.a10;
import defpackage.c10;
import defpackage.e50;
import defpackage.jp0;
import defpackage.kp0;
import defpackage.lb0;
import defpackage.sb0;
import defpackage.vy2;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class MappedInteractionSource implements InteractionSource {
    public static final int $stable = 0;
    private final long delta;
    private final jp0 interactions;
    private final Map<PressInteraction.Press, PressInteraction.Press> mappedPresses;

    private MappedInteractionSource(InteractionSource interactionSource, long j) {
        this.delta = j;
        this.mappedPresses = new LinkedHashMap();
        final jp0 interactions = interactionSource.getInteractions();
        this.interactions = new jp0() { // from class: androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1

            /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
            /* renamed from: androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements kp0 {
                final /* synthetic */ kp0 $this_unsafeFlow;
                final /* synthetic */ MappedInteractionSource this$0;

                /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
                @lb0(c = "androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1$2", f = "MappedInteractionSource.kt", l = {219}, m = "emit")
                /* renamed from: androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1$2$1, reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends c10 {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(a10 a10Var) {
                        super(a10Var);
                    }

                    @Override // defpackage.cm
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kp0 kp0Var, MappedInteractionSource mappedInteractionSource) {
                    this.$this_unsafeFlow = kp0Var;
                    this.this$0 = mappedInteractionSource;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                @Override // defpackage.kp0
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, defpackage.a10 r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1$2$1 r0 = (androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1$2$1 r0 = new androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        int r1 = r0.label
                        r2 = 1
                        if (r1 == 0) goto L2d
                        if (r1 != r2) goto L26
                        defpackage.ta3.H(r6)
                        goto L94
                    L26:
                        java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                        defpackage.hu2.h(r4)
                        r4 = 0
                        return r4
                    L2d:
                        defpackage.ta3.H(r6)
                        kp0 r6 = r4.$this_unsafeFlow
                        androidx.compose.foundation.interaction.Interaction r5 = (androidx.compose.foundation.interaction.Interaction) r5
                        boolean r1 = r5 instanceof androidx.compose.foundation.interaction.PressInteraction.Press
                        if (r1 == 0) goto L4c
                        androidx.compose.material3.internal.MappedInteractionSource r1 = r4.this$0
                        r3 = r5
                        androidx.compose.foundation.interaction.PressInteraction$Press r3 = (androidx.compose.foundation.interaction.PressInteraction.Press) r3
                        androidx.compose.foundation.interaction.PressInteraction$Press r1 = androidx.compose.material3.internal.MappedInteractionSource.access$mapPress(r1, r3)
                        androidx.compose.material3.internal.MappedInteractionSource r4 = r4.this$0
                        java.util.Map r4 = androidx.compose.material3.internal.MappedInteractionSource.access$getMappedPresses$p(r4)
                        r4.put(r5, r1)
                        r5 = r1
                        goto L89
                    L4c:
                        boolean r1 = r5 instanceof androidx.compose.foundation.interaction.PressInteraction.Cancel
                        if (r1 == 0) goto L6b
                        androidx.compose.material3.internal.MappedInteractionSource r4 = r4.this$0
                        java.util.Map r4 = androidx.compose.material3.internal.MappedInteractionSource.access$getMappedPresses$p(r4)
                        androidx.compose.foundation.interaction.PressInteraction$Cancel r5 = (androidx.compose.foundation.interaction.PressInteraction.Cancel) r5
                        androidx.compose.foundation.interaction.PressInteraction$Press r1 = r5.getPress()
                        java.lang.Object r4 = r4.remove(r1)
                        androidx.compose.foundation.interaction.PressInteraction$Press r4 = (androidx.compose.foundation.interaction.PressInteraction.Press) r4
                        if (r4 != 0) goto L65
                        goto L89
                    L65:
                        androidx.compose.foundation.interaction.PressInteraction$Cancel r5 = new androidx.compose.foundation.interaction.PressInteraction$Cancel
                        r5.<init>(r4)
                        goto L89
                    L6b:
                        boolean r1 = r5 instanceof androidx.compose.foundation.interaction.PressInteraction.Release
                        if (r1 == 0) goto L89
                        androidx.compose.material3.internal.MappedInteractionSource r4 = r4.this$0
                        java.util.Map r4 = androidx.compose.material3.internal.MappedInteractionSource.access$getMappedPresses$p(r4)
                        androidx.compose.foundation.interaction.PressInteraction$Release r5 = (androidx.compose.foundation.interaction.PressInteraction.Release) r5
                        androidx.compose.foundation.interaction.PressInteraction$Press r1 = r5.getPress()
                        java.lang.Object r4 = r4.remove(r1)
                        androidx.compose.foundation.interaction.PressInteraction$Press r4 = (androidx.compose.foundation.interaction.PressInteraction.Press) r4
                        if (r4 != 0) goto L84
                        goto L89
                    L84:
                        androidx.compose.foundation.interaction.PressInteraction$Release r5 = new androidx.compose.foundation.interaction.PressInteraction$Release
                        r5.<init>(r4)
                    L89:
                        r0.label = r2
                        java.lang.Object r4 = r6.emit(r5, r0)
                        e50 r5 = defpackage.e50.a
                        if (r4 != r5) goto L94
                        return r5
                    L94:
                        vy2 r4 = defpackage.vy2.a
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, a10):java.lang.Object");
                }
            }

            @Override // defpackage.jp0
            public Object collect(kp0 kp0Var, a10 a10Var) {
                Object collect = jp0.this.collect(new AnonymousClass2(kp0Var, this), a10Var);
                return collect == e50.a ? collect : vy2.a;
            }
        };
    }

    public /* synthetic */ MappedInteractionSource(InteractionSource interactionSource, long j, sb0 sb0Var) {
        this(interactionSource, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PressInteraction.Press mapPress(PressInteraction.Press press) {
        return new PressInteraction.Press(Offset.m5094minusMKHz9U(press.m710getPressPositionF1C5BW0(), this.delta), null);
    }

    @Override // androidx.compose.foundation.interaction.InteractionSource
    public jp0 getInteractions() {
        return this.interactions;
    }
}
