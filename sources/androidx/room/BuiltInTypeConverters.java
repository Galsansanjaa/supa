package androidx.room;

import defpackage.ej0;
import defpackage.nb0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
@Target({})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes4.dex */
public @interface BuiltInTypeConverters {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes4.dex */
    public static final class State {
        private static final /* synthetic */ ej0 $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State ENABLED = new State("ENABLED", 0);
        public static final State DISABLED = new State("DISABLED", 1);
        public static final State INHERITED = new State("INHERITED", 2);

        private static final /* synthetic */ State[] $values() {
            return new State[]{ENABLED, DISABLED, INHERITED};
        }

        static {
            State[] $values = $values();
            $VALUES = $values;
            $ENTRIES = nb0.s($values);
        }

        private State(String str, int i) {
        }

        public static ej0 getEntries() {
            return $ENTRIES;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    State byteBuffer() default State.INHERITED;

    State enums() default State.INHERITED;

    State uuid() default State.INHERITED;
}
