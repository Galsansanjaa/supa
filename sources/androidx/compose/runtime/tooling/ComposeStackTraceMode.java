package androidx.compose.runtime.tooling;

import defpackage.sb0;
import defpackage.sg3;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class ComposeStackTraceMode {
    private static boolean isMinified;
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int None = m4791constructorimpl(0);
    private static final int GroupKeys = m4791constructorimpl(1);
    private static final int SourceInformation = m4791constructorimpl(2);

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        /* renamed from: getAuto-MD5MrJc, reason: not valid java name */
        public final int m4797getAutoMD5MrJc() {
            return ComposeStackTraceMode.access$isMinified$cp() ? m4798getGroupKeysMD5MrJc() : m4799getNoneMD5MrJc();
        }

        /* renamed from: getGroupKeys-MD5MrJc, reason: not valid java name */
        public final int m4798getGroupKeysMD5MrJc() {
            return ComposeStackTraceMode.GroupKeys;
        }

        /* renamed from: getNone-MD5MrJc, reason: not valid java name */
        public final int m4799getNoneMD5MrJc() {
            return ComposeStackTraceMode.None;
        }

        /* renamed from: getSourceInformation-MD5MrJc, reason: not valid java name */
        public final int m4800getSourceInformationMD5MrJc() {
            return ComposeStackTraceMode.SourceInformation;
        }
    }

    private /* synthetic */ ComposeStackTraceMode(int i) {
        this.value = i;
    }

    public static final /* synthetic */ boolean access$isMinified$cp() {
        return true;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ComposeStackTraceMode m4790boximpl(int i) {
        return new ComposeStackTraceMode(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m4791constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4792equalsimpl(int i, Object obj) {
        return (obj instanceof ComposeStackTraceMode) && i == ((ComposeStackTraceMode) obj).m4796unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4793equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4794hashCodeimpl(int i) {
        return i;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4795toStringimpl(int i) {
        return sg3.o(i, "ComposeStackTraceMode(value=", ")");
    }

    public boolean equals(Object obj) {
        return m4792equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m4794hashCodeimpl(this.value);
    }

    public String toString() {
        return m4795toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4796unboximpl() {
        return this.value;
    }
}
