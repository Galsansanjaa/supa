package androidx.compose.foundation.layout;

import defpackage.ej0;
import defpackage.hd0;
import defpackage.nb0;
import defpackage.ps0;
import defpackage.sb0;
import defpackage.ts0;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
@hd0
/* loaded from: classes.dex */
public abstract class FlowLayoutOverflow {
    public static final int $stable = 0;
    private final ps0 collapseGetter;
    private final int minCrossAxisSizeToShowCollapse;
    private final int minLinesToShowCollapse;
    private final ps0 seeMoreGetter;
    private final OverflowType type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class OverflowType {
        private static final /* synthetic */ ej0 $ENTRIES;
        private static final /* synthetic */ OverflowType[] $VALUES;
        public static final OverflowType Visible = new OverflowType("Visible", 0);
        public static final OverflowType Clip = new OverflowType("Clip", 1);
        public static final OverflowType ExpandIndicator = new OverflowType("ExpandIndicator", 2);
        public static final OverflowType ExpandOrCollapseIndicator = new OverflowType("ExpandOrCollapseIndicator", 3);

        private static final /* synthetic */ OverflowType[] $values() {
            return new OverflowType[]{Visible, Clip, ExpandIndicator, ExpandOrCollapseIndicator};
        }

        static {
            OverflowType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = nb0.s($values);
        }

        private OverflowType(String str, int i) {
        }

        public static ej0 getEntries() {
            return $ENTRIES;
        }

        public static OverflowType valueOf(String str) {
            return (OverflowType) Enum.valueOf(OverflowType.class, str);
        }

        public static OverflowType[] values() {
            return (OverflowType[]) $VALUES.clone();
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OverflowType.values().length];
            try {
                iArr[OverflowType.ExpandIndicator.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OverflowType.ExpandOrCollapseIndicator.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private FlowLayoutOverflow(OverflowType overflowType, int i, int i2, ps0 ps0Var, ps0 ps0Var2) {
        this.type = overflowType;
        this.minLinesToShowCollapse = i;
        this.minCrossAxisSizeToShowCollapse = i2;
        this.seeMoreGetter = ps0Var;
        this.collapseGetter = ps0Var2;
    }

    public /* synthetic */ FlowLayoutOverflow(OverflowType overflowType, int i, int i2, ps0 ps0Var, ps0 ps0Var2, int i3, sb0 sb0Var) {
        this(overflowType, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? null : ps0Var, (i3 & 16) != 0 ? null : ps0Var2, null);
    }

    public /* synthetic */ FlowLayoutOverflow(OverflowType overflowType, int i, int i2, ps0 ps0Var, ps0 ps0Var2, sb0 sb0Var) {
        this(overflowType, i, i2, ps0Var, ps0Var2);
    }

    public final void addOverflowComposables$foundation_layout(FlowLayoutOverflowState flowLayoutOverflowState, List<ts0> list) {
        ps0 ps0Var = this.seeMoreGetter;
        ts0 ts0Var = ps0Var != null ? (ts0) ps0Var.invoke(flowLayoutOverflowState) : null;
        ps0 ps0Var2 = this.collapseGetter;
        ts0 ts0Var2 = ps0Var2 != null ? (ts0) ps0Var2.invoke(flowLayoutOverflowState) : null;
        int i = WhenMappings.$EnumSwitchMapping$0[this.type.ordinal()];
        if (i == 1) {
            if (ts0Var != null) {
                list.add(ts0Var);
            }
        } else {
            if (i != 2) {
                return;
            }
            if (ts0Var != null) {
                list.add(ts0Var);
            }
            if (ts0Var2 != null) {
                list.add(ts0Var2);
            }
        }
    }

    public final FlowLayoutOverflowState createOverflowState$foundation_layout() {
        return new FlowLayoutOverflowState(this.type, this.minLinesToShowCollapse, this.minCrossAxisSizeToShowCollapse);
    }

    public final OverflowType getType$foundation_layout() {
        return this.type;
    }
}
