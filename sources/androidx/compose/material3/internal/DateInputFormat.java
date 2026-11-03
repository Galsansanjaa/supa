package androidx.compose.material3.internal;

import defpackage.bn2;
import defpackage.jh2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class DateInputFormat {
    public static final int $stable = 0;
    private final char delimiter;
    private final String patternWithDelimiters;
    private final String patternWithoutDelimiters;

    public DateInputFormat(String str, char c) {
        this.patternWithDelimiters = str;
        this.delimiter = c;
        this.patternWithoutDelimiters = bn2.g0(str, String.valueOf(c), "", false);
    }

    public static /* synthetic */ DateInputFormat copy$default(DateInputFormat dateInputFormat, String str, char c, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dateInputFormat.patternWithDelimiters;
        }
        if ((i & 2) != 0) {
            c = dateInputFormat.delimiter;
        }
        return dateInputFormat.copy(str, c);
    }

    public final String component1() {
        return this.patternWithDelimiters;
    }

    public final char component2() {
        return this.delimiter;
    }

    public final DateInputFormat copy(String str, char c) {
        return new DateInputFormat(str, c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DateInputFormat)) {
            return false;
        }
        DateInputFormat dateInputFormat = (DateInputFormat) obj;
        return jh2.k(this.patternWithDelimiters, dateInputFormat.patternWithDelimiters) && this.delimiter == dateInputFormat.delimiter;
    }

    public final char getDelimiter() {
        return this.delimiter;
    }

    public final String getPatternWithDelimiters() {
        return this.patternWithDelimiters;
    }

    public final String getPatternWithoutDelimiters() {
        return this.patternWithoutDelimiters;
    }

    public int hashCode() {
        return (this.patternWithDelimiters.hashCode() * 31) + this.delimiter;
    }

    public String toString() {
        return "DateInputFormat(patternWithDelimiters=" + this.patternWithDelimiters + ", delimiter=" + this.delimiter + ')';
    }
}
