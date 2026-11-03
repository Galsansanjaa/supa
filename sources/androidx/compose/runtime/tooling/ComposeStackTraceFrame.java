package androidx.compose.runtime.tooling;

import defpackage.jh2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class ComposeStackTraceFrame {
    public static final int $stable = 8;
    private final int groupKey;
    private final Integer groupOffset;
    private final SourceInformation sourceInfo;

    public ComposeStackTraceFrame(int i, SourceInformation sourceInformation, Integer num) {
        this.groupKey = i;
        this.sourceInfo = sourceInformation;
        this.groupOffset = num;
    }

    public static /* synthetic */ ComposeStackTraceFrame copy$default(ComposeStackTraceFrame composeStackTraceFrame, int i, SourceInformation sourceInformation, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = composeStackTraceFrame.groupKey;
        }
        if ((i2 & 2) != 0) {
            sourceInformation = composeStackTraceFrame.sourceInfo;
        }
        if ((i2 & 4) != 0) {
            num = composeStackTraceFrame.groupOffset;
        }
        return composeStackTraceFrame.copy(i, sourceInformation, num);
    }

    public final int component1() {
        return this.groupKey;
    }

    public final SourceInformation component2() {
        return this.sourceInfo;
    }

    public final Integer component3() {
        return this.groupOffset;
    }

    public final ComposeStackTraceFrame copy(int i, SourceInformation sourceInformation, Integer num) {
        return new ComposeStackTraceFrame(i, sourceInformation, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComposeStackTraceFrame)) {
            return false;
        }
        ComposeStackTraceFrame composeStackTraceFrame = (ComposeStackTraceFrame) obj;
        return this.groupKey == composeStackTraceFrame.groupKey && jh2.k(this.sourceInfo, composeStackTraceFrame.sourceInfo) && jh2.k(this.groupOffset, composeStackTraceFrame.groupOffset);
    }

    public final int getGroupKey() {
        return this.groupKey;
    }

    public final Integer getGroupOffset() {
        return this.groupOffset;
    }

    public final SourceInformation getSourceInfo() {
        return this.sourceInfo;
    }

    public int hashCode() {
        int i = this.groupKey * 31;
        SourceInformation sourceInformation = this.sourceInfo;
        int hashCode = (i + (sourceInformation == null ? 0 : sourceInformation.hashCode())) * 31;
        Integer num = this.groupOffset;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "ComposeStackTraceFrame(groupKey=" + this.groupKey + ", sourceInfo=" + this.sourceInfo + ", groupOffset=" + this.groupOffset + ")";
    }
}
