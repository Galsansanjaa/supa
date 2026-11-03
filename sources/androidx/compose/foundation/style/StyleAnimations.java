package androidx.compose.foundation.style;

import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import defpackage.ej0;
import defpackage.jh2;
import defpackage.nb0;
import defpackage.od4;
import defpackage.r71;
import defpackage.y40;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class StyleAnimations {
    public static final int $stable = 8;
    private final Object lock = new Object();
    private MutableIntObjectMap<Entry> entries = IntObjectMapKt.mutableIntObjectMapOf();

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public final class Entry {
        private r71 job;
        private AnimationSpec<Float> spec;
        private Animatable<Float, AnimationVector1D> animation = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        private EntryState state = EntryState.Inserted;

        public Entry(AnimationSpec<Float> animationSpec) {
            this.spec = animationSpec;
        }

        public final void animate(y40 y40Var) {
            r71 r71Var = this.job;
            if (r71Var != null) {
                r71Var.cancel(null);
            }
            this.job = od4.s(y40Var, null, null, new StyleAnimations$Entry$animate$1(StyleAnimations.this, this, null), 3);
        }

        public final void close() {
            r71 r71Var = this.job;
            if (r71Var != null) {
                r71Var.cancel(null);
            }
            this.job = null;
        }

        public final Animatable<Float, AnimationVector1D> getAnimation() {
            return this.animation;
        }

        public final r71 getJob() {
            return this.job;
        }

        public final AnimationSpec<Float> getSpec() {
            return this.spec;
        }

        public final EntryState getState() {
            return this.state;
        }

        public final void interrupted(y40 y40Var) {
            animate(y40Var);
        }

        public final void setAnimation(Animatable<Float, AnimationVector1D> animatable) {
            this.animation = animatable;
        }

        public final void setJob(r71 r71Var) {
            this.job = r71Var;
        }

        public final void setSpec(AnimationSpec<Float> animationSpec) {
            this.spec = animationSpec;
        }

        public final void setState(EntryState entryState) {
            this.state = entryState;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class EntryState {
        private static final /* synthetic */ ej0 $ENTRIES;
        private static final /* synthetic */ EntryState[] $VALUES;
        public static final EntryState Untouched = new EntryState("Untouched", 0);
        public static final EntryState Unchanged = new EntryState("Unchanged", 1);
        public static final EntryState Changed = new EntryState("Changed", 2);
        public static final EntryState Inserted = new EntryState("Inserted", 3);
        public static final EntryState Interrupted = new EntryState("Interrupted", 4);
        public static final EntryState Removing = new EntryState("Removing", 5);

        private static final /* synthetic */ EntryState[] $values() {
            return new EntryState[]{Untouched, Unchanged, Changed, Inserted, Interrupted, Removing};
        }

        static {
            EntryState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = nb0.s($values);
        }

        private EntryState(String str, int i) {
        }

        public static ej0 getEntries() {
            return $ENTRIES;
        }

        public static EntryState valueOf(String str) {
            return (EntryState) Enum.valueOf(EntryState.class, str);
        }

        public static EntryState[] values() {
            return (EntryState[]) $VALUES.clone();
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EntryState.values().length];
            try {
                iArr[EntryState.Inserted.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EntryState.Unchanged.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EntryState.Changed.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EntryState.Untouched.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cleanupAnimations() {
        synchronized (this.lock) {
            MutableIntObjectMap<Entry> mutableIntObjectMap = this.entries;
            long[] jArr = mutableIntObjectMap.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                int i4 = (i << 3) + i3;
                                int i5 = mutableIntObjectMap.keys[i4];
                                Entry entry = (Entry) mutableIntObjectMap.values[i4];
                                if (entry.getState() != EntryState.Interrupted && !entry.getAnimation().isRunning()) {
                                    mutableIntObjectMap.removeValueAt(i4);
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
    }

    private final boolean recordLocked(int i, boolean z, AnimationSpec<Float> animationSpec) {
        Entry entry = this.entries.get(i);
        if (entry == null) {
            if (z) {
                this.entries.set(i, new Entry(animationSpec));
            }
            return true;
        }
        if (!z && jh2.k(entry.getSpec(), animationSpec)) {
            entry.setState(EntryState.Unchanged);
            return false;
        }
        entry.setSpec(animationSpec);
        entry.setState(EntryState.Changed);
        return true;
    }

    public final void close() {
        synchronized (this.lock) {
            try {
                MutableIntObjectMap<Entry> mutableIntObjectMap = this.entries;
                int[] iArr = mutableIntObjectMap.keys;
                Object[] objArr = mutableIntObjectMap.values;
                long[] jArr = mutableIntObjectMap.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    int i4 = (i << 3) + i3;
                                    int i5 = iArr[i4];
                                    ((Entry) objArr[i4]).close();
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            }
                        }
                        if (i == length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                this.entries.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final long inFlight() {
        long j;
        int i;
        synchronized (this.lock) {
            MutableIntObjectMap<Entry> mutableIntObjectMap = this.entries;
            int[] iArr = mutableIntObjectMap.keys;
            Object[] objArr = mutableIntObjectMap.values;
            long[] jArr = mutableIntObjectMap.metadata;
            int length = jArr.length - 2;
            j = 0;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j2 = jArr[i2];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8;
                        int i4 = 8 - ((~(i2 - length)) >>> 31);
                        int i5 = 0;
                        while (i5 < i4) {
                            if ((255 & j2) < 128) {
                                int i6 = (i2 << 3) + i5;
                                int i7 = iArr[i6];
                                Entry entry = (Entry) objArr[i6];
                                i = i3;
                                if (entry.getState() == EntryState.Interrupted || entry.getAnimation().isRunning()) {
                                    j |= 1 << i7;
                                }
                            } else {
                                i = i3;
                            }
                            j2 >>= i;
                            i5++;
                            i3 = i;
                        }
                        if (i4 != i3) {
                            break;
                        }
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return j;
    }

    public final boolean isEmpty() {
        boolean isEmpty;
        synchronized (this.lock) {
            isEmpty = this.entries.isEmpty();
        }
        return isEmpty;
    }

    public final int phaseFlags() {
        int i;
        MutableIntObjectMap<Entry> mutableIntObjectMap = this.entries;
        int[] iArr = mutableIntObjectMap.keys;
        Object[] objArr = mutableIntObjectMap.values;
        long[] jArr = mutableIntObjectMap.metadata;
        int length = jArr.length - 2;
        long j = 0;
        int i2 = 0;
        if (length >= 0) {
            int i3 = 0;
            i = 0;
            while (true) {
                long j2 = jArr[i3];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j2) < 128) {
                            int i6 = (i3 << 3) + i5;
                            int i7 = iArr[i6];
                            if (i7 < 50) {
                                j |= 1 << ((byte) i7);
                            } else {
                                i |= 1 << (i7 - 50);
                            }
                        }
                        j2 >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    i2 = i;
                    break;
                }
                i3++;
            }
        }
        i = i2;
        return StylePropertiesKt.objectPhaseFlagsOf(i) | StylePropertiesKt.primitivePhaseFlagsOf(j);
    }

    public final void postRecordLocked(StyleOuterNode styleOuterNode) {
        MutableIntObjectMap<Entry> mutableIntObjectMap = this.entries;
        int[] iArr = mutableIntObjectMap.keys;
        Object[] objArr = mutableIntObjectMap.values;
        long[] jArr = mutableIntObjectMap.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        int i5 = iArr[i4];
                        Entry entry = (Entry) objArr[i4];
                        int i6 = WhenMappings.$EnumSwitchMapping$0[entry.getState().ordinal()];
                        if (i6 == 1) {
                            entry.animate(styleOuterNode.getAnimationScope$foundation());
                        } else if (i6 == 3) {
                            entry.setState(EntryState.Interrupted);
                            entry.interrupted(styleOuterNode.getAnimationScope$foundation());
                        } else if (i6 == 4) {
                            entry.setState(EntryState.Removing);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void preRecordLocked() {
        MutableIntObjectMap<Entry> mutableIntObjectMap = this.entries;
        int[] iArr = mutableIntObjectMap.keys;
        Object[] objArr = mutableIntObjectMap.values;
        long[] jArr = mutableIntObjectMap.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        int i5 = iArr[i4];
                        Entry entry = (Entry) objArr[i4];
                        int i6 = WhenMappings.$EnumSwitchMapping$0[entry.getState().ordinal()];
                        if (i6 == 1 || i6 == 2 || i6 == 3) {
                            entry.setState(EntryState.Untouched);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b A[Catch: all -> 0x002a, TryCatch #0 {all -> 0x002a, blocks: (B:4:0x000b, B:9:0x001b, B:11:0x0021, B:14:0x0049, B:17:0x0055, B:19:0x005b, B:21:0x005c, B:26:0x002f, B:29:0x003b, B:31:0x0043, B:36:0x005f), top: B:3:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long recordAnimations(long r18, long r20, androidx.collection.IntObjectMap<androidx.compose.animation.core.AnimationSpec<java.lang.Float>> r22, androidx.collection.IntObjectMap<androidx.compose.animation.core.AnimationSpec<java.lang.Float>> r23, androidx.collection.IntObjectMap<androidx.compose.animation.core.AnimationSpec<java.lang.Float>> r24, androidx.compose.foundation.style.StyleOuterNode r25) {
        /*
            r17 = this;
            r0 = r17
            r1 = r22
            r2 = r23
            r3 = r24
            java.lang.Object r4 = r0.lock
            monitor-enter(r4)
            r0.preRecordLocked()     // Catch: java.lang.Throwable -> L2a
            r5 = 0
            int r7 = (r18 > r5 ? 1 : (r18 == r5 ? 0 : -1))
            if (r7 == 0) goto L5f
            r7 = r18
            r9 = r5
        L17:
            int r11 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r11 == 0) goto L5e
            int r11 = java.lang.Long.numberOfTrailingZeros(r7)     // Catch: java.lang.Throwable -> L2a
            if (r1 == 0) goto L2c
            java.lang.Object r12 = r1.get(r11)     // Catch: java.lang.Throwable -> L2a
            androidx.compose.animation.core.AnimationSpec r12 = (androidx.compose.animation.core.AnimationSpec) r12     // Catch: java.lang.Throwable -> L2a
            if (r12 != 0) goto L49
            goto L2c
        L2a:
            r0 = move-exception
            goto L66
        L2c:
            r12 = 0
            if (r3 == 0) goto L36
            java.lang.Object r13 = r3.get(r11)     // Catch: java.lang.Throwable -> L2a
            androidx.compose.animation.core.AnimationSpec r13 = (androidx.compose.animation.core.AnimationSpec) r13     // Catch: java.lang.Throwable -> L2a
            goto L37
        L36:
            r13 = r12
        L37:
            if (r13 != 0) goto L48
            if (r2 == 0) goto L41
            java.lang.Object r12 = r2.get(r11)     // Catch: java.lang.Throwable -> L2a
            androidx.compose.animation.core.AnimationSpec r12 = (androidx.compose.animation.core.AnimationSpec) r12     // Catch: java.lang.Throwable -> L2a
        L41:
            if (r12 != 0) goto L49
            androidx.compose.animation.core.SpringSpec r12 = androidx.compose.foundation.style.ResolvedStyleKt.getDefaultSpringSpec()     // Catch: java.lang.Throwable -> L2a
            goto L49
        L48:
            r12 = r13
        L49:
            r13 = 1
            long r13 = r13 << r11
            long r15 = r20 & r13
            int r15 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
            if (r15 == 0) goto L54
            r15 = 1
            goto L55
        L54:
            r15 = 0
        L55:
            boolean r11 = r0.recordLocked(r11, r15, r12)     // Catch: java.lang.Throwable -> L2a
            if (r11 == 0) goto L5c
            long r9 = r9 | r13
        L5c:
            long r7 = r7 ^ r13
            goto L17
        L5e:
            r5 = r9
        L5f:
            r1 = r25
            r0.postRecordLocked(r1)     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r4)
            return r5
        L66:
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.style.StyleAnimations.recordAnimations(long, long, androidx.collection.IntObjectMap, androidx.collection.IntObjectMap, androidx.collection.IntObjectMap, androidx.compose.foundation.style.StyleOuterNode):long");
    }

    public final float timeOf(byte b) {
        return timeOf((int) b);
    }

    public final float timeOf(int i) {
        synchronized (this.lock) {
            Entry entry = this.entries.get(i);
            float f = 0.0f;
            if (entry == null) {
                return 0.0f;
            }
            if (entry.getState() != EntryState.Interrupted) {
                f = entry.getAnimation().getValue().floatValue();
            }
            return f;
        }
    }
}
