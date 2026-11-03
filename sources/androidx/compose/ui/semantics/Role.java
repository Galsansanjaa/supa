package androidx.compose.ui.semantics;

import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class Role {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Button = m7244constructorimpl(0);
    private static final int Checkbox = m7244constructorimpl(1);
    private static final int Switch = m7244constructorimpl(2);
    private static final int RadioButton = m7244constructorimpl(3);
    private static final int Tab = m7244constructorimpl(4);
    private static final int Image = m7244constructorimpl(5);
    private static final int DropdownList = m7244constructorimpl(6);
    private static final int ValuePicker = m7244constructorimpl(7);
    private static final int Carousel = m7244constructorimpl(8);

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        /* renamed from: getButton-o7Vup1c, reason: not valid java name */
        public final int m7250getButtono7Vup1c() {
            return Role.Button;
        }

        /* renamed from: getCarousel-o7Vup1c, reason: not valid java name */
        public final int m7251getCarouselo7Vup1c() {
            return Role.Carousel;
        }

        /* renamed from: getCheckbox-o7Vup1c, reason: not valid java name */
        public final int m7252getCheckboxo7Vup1c() {
            return Role.Checkbox;
        }

        /* renamed from: getDropdownList-o7Vup1c, reason: not valid java name */
        public final int m7253getDropdownListo7Vup1c() {
            return Role.DropdownList;
        }

        /* renamed from: getImage-o7Vup1c, reason: not valid java name */
        public final int m7254getImageo7Vup1c() {
            return Role.Image;
        }

        /* renamed from: getRadioButton-o7Vup1c, reason: not valid java name */
        public final int m7255getRadioButtono7Vup1c() {
            return Role.RadioButton;
        }

        /* renamed from: getSwitch-o7Vup1c, reason: not valid java name */
        public final int m7256getSwitcho7Vup1c() {
            return Role.Switch;
        }

        /* renamed from: getTab-o7Vup1c, reason: not valid java name */
        public final int m7257getTabo7Vup1c() {
            return Role.Tab;
        }

        /* renamed from: getValuePicker-o7Vup1c, reason: not valid java name */
        public final int m7258getValuePickero7Vup1c() {
            return Role.ValuePicker;
        }
    }

    private /* synthetic */ Role(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Role m7243boximpl(int i) {
        return new Role(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m7244constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7245equalsimpl(int i, Object obj) {
        return (obj instanceof Role) && i == ((Role) obj).m7249unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7246equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7247hashCodeimpl(int i) {
        return i;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7248toStringimpl(int i) {
        return m7246equalsimpl0(i, Button) ? "Button" : m7246equalsimpl0(i, Checkbox) ? "Checkbox" : m7246equalsimpl0(i, Switch) ? "Switch" : m7246equalsimpl0(i, RadioButton) ? "RadioButton" : m7246equalsimpl0(i, Tab) ? "Tab" : m7246equalsimpl0(i, Image) ? "Image" : m7246equalsimpl0(i, DropdownList) ? "DropdownList" : m7246equalsimpl0(i, ValuePicker) ? "Picker" : m7246equalsimpl0(i, Carousel) ? "Carousel" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m7245equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m7247hashCodeimpl(this.value);
    }

    public String toString() {
        return m7248toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m7249unboximpl() {
        return this.value;
    }
}
