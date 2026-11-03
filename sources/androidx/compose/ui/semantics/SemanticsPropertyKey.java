package androidx.compose.ui.semantics;

import defpackage.nb2;
import defpackage.sa1;
import defpackage.sb0;
import defpackage.ts0;
import defpackage.wa2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class SemanticsPropertyKey<T> {
    public static final int $stable = 8;
    private String accessibilityExtraKey;
    private boolean isImportantForAccessibility;
    private final ts0 mergePolicy;
    private final String name;

    public SemanticsPropertyKey(String str, ts0 ts0Var) {
        this.name = str;
        this.mergePolicy = ts0Var;
    }

    public /* synthetic */ SemanticsPropertyKey(String str, ts0 ts0Var, int i, sb0 sb0Var) {
        this(str, (i & 2) != 0 ? new nb2(27) : ts0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SemanticsPropertyKey(String str, boolean z) {
        this(str, (ts0) null, 2, (sb0) (0 == true ? 1 : 0));
        this.isImportantForAccessibility = z;
    }

    public SemanticsPropertyKey(String str, boolean z, ts0 ts0Var, String str2) {
        this(str, ts0Var);
        this.isImportantForAccessibility = z;
        this.accessibilityExtraKey = str2;
    }

    public /* synthetic */ SemanticsPropertyKey(String str, boolean z, ts0 ts0Var, String str2, int i, sb0 sb0Var) {
        this(str, z, ts0Var, (i & 8) != 0 ? null : str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object _init_$lambda$0(Object obj, Object obj2) {
        return obj == null ? obj2 : obj;
    }

    public final String getAccessibilityExtraKey$ui() {
        return this.accessibilityExtraKey;
    }

    public final ts0 getMergePolicy$ui() {
        return this.mergePolicy;
    }

    public final String getName() {
        return this.name;
    }

    public final T getValue(SemanticsPropertyReceiver semanticsPropertyReceiver, sa1 sa1Var) {
        return (T) SemanticsPropertiesKt.access$throwSemanticsGetNotSupported();
    }

    public final boolean isImportantForAccessibility$ui() {
        return this.isImportantForAccessibility;
    }

    public final T merge(T t, T t2) {
        return (T) this.mergePolicy.invoke(t, t2);
    }

    public final void setAccessibilityExtraKey$ui(String str) {
        this.accessibilityExtraKey = str;
    }

    public final void setValue(SemanticsPropertyReceiver semanticsPropertyReceiver, sa1 sa1Var, T t) {
        semanticsPropertyReceiver.set(this, t);
    }

    public String toString() {
        return wa2.y("AccessibilityKey: ", this.name);
    }
}
