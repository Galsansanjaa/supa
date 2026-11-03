package androidx.compose.ui.text.input;

import androidx.exifinterface.media.ExifInterface;
import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class KeyboardType {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Unspecified = m7703constructorimpl(0);
    private static final int Text = m7703constructorimpl(1);
    private static final int Ascii = m7703constructorimpl(2);
    private static final int Number = m7703constructorimpl(3);
    private static final int Phone = m7703constructorimpl(4);
    private static final int Uri = m7703constructorimpl(5);
    private static final int Email = m7703constructorimpl(6);
    private static final int Password = m7703constructorimpl(7);
    private static final int NumberPassword = m7703constructorimpl(8);
    private static final int Decimal = m7703constructorimpl(9);
    private static final int PasswordVisible = m7703constructorimpl(10);
    private static final int PostalAddress = m7703constructorimpl(11);
    private static final int PersonName = m7703constructorimpl(12);
    private static final int EmailSubject = m7703constructorimpl(13);
    private static final int ShortMessage = m7703constructorimpl(14);
    private static final int LongMessage = m7703constructorimpl(15);
    private static final int Filter = m7703constructorimpl(16);
    private static final int Phonetic = m7703constructorimpl(17);
    private static final int DateTime = m7703constructorimpl(18);
    private static final int Date = m7703constructorimpl(19);
    private static final int Time = m7703constructorimpl(20);
    private static final int NumberSigned = m7703constructorimpl(21);
    private static final int DecimalSigned = m7703constructorimpl(22);
    private static final int DecimalPassword = m7703constructorimpl(23);
    private static final int NumberPasswordSigned = m7703constructorimpl(24);
    private static final int DecimalPasswordSigned = m7703constructorimpl(25);

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        /* renamed from: getAscii-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m7709getAsciiPjHm6EE$annotations() {
        }

        /* renamed from: getDate-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m7710getDatePjHm6EE$annotations() {
        }

        /* renamed from: getDateTime-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m7711getDateTimePjHm6EE$annotations() {
        }

        /* renamed from: getDecimal-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m7712getDecimalPjHm6EE$annotations() {
        }

        /* renamed from: getDecimalPassword-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m7713getDecimalPasswordPjHm6EE$annotations() {
        }

        /* renamed from: getDecimalPasswordSigned-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m7714getDecimalPasswordSignedPjHm6EE$annotations() {
        }

        /* renamed from: getDecimalSigned-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m7715getDecimalSignedPjHm6EE$annotations() {
        }

        /* renamed from: getEmail-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m7716getEmailPjHm6EE$annotations() {
        }

        /* renamed from: getEmailSubject-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m7717getEmailSubjectPjHm6EE$annotations() {
        }

        /* renamed from: getFilter-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m7718getFilterPjHm6EE$annotations() {
        }

        /* renamed from: getLongMessage-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m7719getLongMessagePjHm6EE$annotations() {
        }

        /* renamed from: getNumber-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m7720getNumberPjHm6EE$annotations() {
        }

        /* renamed from: getNumberPassword-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m7721getNumberPasswordPjHm6EE$annotations() {
        }

        /* renamed from: getNumberPasswordSigned-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m7722getNumberPasswordSignedPjHm6EE$annotations() {
        }

        /* renamed from: getNumberSigned-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m7723getNumberSignedPjHm6EE$annotations() {
        }

        /* renamed from: getPassword-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m7724getPasswordPjHm6EE$annotations() {
        }

        /* renamed from: getPasswordVisible-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m7725getPasswordVisiblePjHm6EE$annotations() {
        }

        /* renamed from: getPersonName-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m7726getPersonNamePjHm6EE$annotations() {
        }

        /* renamed from: getPhone-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m7727getPhonePjHm6EE$annotations() {
        }

        /* renamed from: getPhonetic-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m7728getPhoneticPjHm6EE$annotations() {
        }

        /* renamed from: getPostalAddress-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m7729getPostalAddressPjHm6EE$annotations() {
        }

        /* renamed from: getShortMessage-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m7730getShortMessagePjHm6EE$annotations() {
        }

        /* renamed from: getText-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m7731getTextPjHm6EE$annotations() {
        }

        /* renamed from: getTime-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m7732getTimePjHm6EE$annotations() {
        }

        /* renamed from: getUnspecified-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m7733getUnspecifiedPjHm6EE$annotations() {
        }

        /* renamed from: getUri-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m7734getUriPjHm6EE$annotations() {
        }

        /* renamed from: getAscii-PjHm6EE, reason: not valid java name */
        public final int m7735getAsciiPjHm6EE() {
            return KeyboardType.Ascii;
        }

        /* renamed from: getDate-PjHm6EE, reason: not valid java name */
        public final int m7736getDatePjHm6EE() {
            return KeyboardType.Date;
        }

        /* renamed from: getDateTime-PjHm6EE, reason: not valid java name */
        public final int m7737getDateTimePjHm6EE() {
            return KeyboardType.DateTime;
        }

        /* renamed from: getDecimal-PjHm6EE, reason: not valid java name */
        public final int m7738getDecimalPjHm6EE() {
            return KeyboardType.Decimal;
        }

        /* renamed from: getDecimalPassword-PjHm6EE, reason: not valid java name */
        public final int m7739getDecimalPasswordPjHm6EE() {
            return KeyboardType.DecimalPassword;
        }

        /* renamed from: getDecimalPasswordSigned-PjHm6EE, reason: not valid java name */
        public final int m7740getDecimalPasswordSignedPjHm6EE() {
            return KeyboardType.DecimalPasswordSigned;
        }

        /* renamed from: getDecimalSigned-PjHm6EE, reason: not valid java name */
        public final int m7741getDecimalSignedPjHm6EE() {
            return KeyboardType.DecimalSigned;
        }

        /* renamed from: getEmail-PjHm6EE, reason: not valid java name */
        public final int m7742getEmailPjHm6EE() {
            return KeyboardType.Email;
        }

        /* renamed from: getEmailSubject-PjHm6EE, reason: not valid java name */
        public final int m7743getEmailSubjectPjHm6EE() {
            return KeyboardType.EmailSubject;
        }

        /* renamed from: getFilter-PjHm6EE, reason: not valid java name */
        public final int m7744getFilterPjHm6EE() {
            return KeyboardType.Filter;
        }

        /* renamed from: getLongMessage-PjHm6EE, reason: not valid java name */
        public final int m7745getLongMessagePjHm6EE() {
            return KeyboardType.LongMessage;
        }

        /* renamed from: getNumber-PjHm6EE, reason: not valid java name */
        public final int m7746getNumberPjHm6EE() {
            return KeyboardType.Number;
        }

        /* renamed from: getNumberPassword-PjHm6EE, reason: not valid java name */
        public final int m7747getNumberPasswordPjHm6EE() {
            return KeyboardType.NumberPassword;
        }

        /* renamed from: getNumberPasswordSigned-PjHm6EE, reason: not valid java name */
        public final int m7748getNumberPasswordSignedPjHm6EE() {
            return KeyboardType.NumberPasswordSigned;
        }

        /* renamed from: getNumberSigned-PjHm6EE, reason: not valid java name */
        public final int m7749getNumberSignedPjHm6EE() {
            return KeyboardType.NumberSigned;
        }

        /* renamed from: getPassword-PjHm6EE, reason: not valid java name */
        public final int m7750getPasswordPjHm6EE() {
            return KeyboardType.Password;
        }

        /* renamed from: getPasswordVisible-PjHm6EE, reason: not valid java name */
        public final int m7751getPasswordVisiblePjHm6EE() {
            return KeyboardType.PasswordVisible;
        }

        /* renamed from: getPersonName-PjHm6EE, reason: not valid java name */
        public final int m7752getPersonNamePjHm6EE() {
            return KeyboardType.PersonName;
        }

        /* renamed from: getPhone-PjHm6EE, reason: not valid java name */
        public final int m7753getPhonePjHm6EE() {
            return KeyboardType.Phone;
        }

        /* renamed from: getPhonetic-PjHm6EE, reason: not valid java name */
        public final int m7754getPhoneticPjHm6EE() {
            return KeyboardType.Phonetic;
        }

        /* renamed from: getPostalAddress-PjHm6EE, reason: not valid java name */
        public final int m7755getPostalAddressPjHm6EE() {
            return KeyboardType.PostalAddress;
        }

        /* renamed from: getShortMessage-PjHm6EE, reason: not valid java name */
        public final int m7756getShortMessagePjHm6EE() {
            return KeyboardType.ShortMessage;
        }

        /* renamed from: getText-PjHm6EE, reason: not valid java name */
        public final int m7757getTextPjHm6EE() {
            return KeyboardType.Text;
        }

        /* renamed from: getTime-PjHm6EE, reason: not valid java name */
        public final int m7758getTimePjHm6EE() {
            return KeyboardType.Time;
        }

        /* renamed from: getUnspecified-PjHm6EE, reason: not valid java name */
        public final int m7759getUnspecifiedPjHm6EE() {
            return KeyboardType.Unspecified;
        }

        /* renamed from: getUri-PjHm6EE, reason: not valid java name */
        public final int m7760getUriPjHm6EE() {
            return KeyboardType.Uri;
        }
    }

    private /* synthetic */ KeyboardType(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ KeyboardType m7702boximpl(int i) {
        return new KeyboardType(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m7703constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7704equalsimpl(int i, Object obj) {
        return (obj instanceof KeyboardType) && i == ((KeyboardType) obj).m7708unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7705equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7706hashCodeimpl(int i) {
        return i;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7707toStringimpl(int i) {
        return m7705equalsimpl0(i, Unspecified) ? "Unspecified" : m7705equalsimpl0(i, Text) ? "Text" : m7705equalsimpl0(i, Ascii) ? "Ascii" : m7705equalsimpl0(i, Number) ? "Number" : m7705equalsimpl0(i, Phone) ? "Phone" : m7705equalsimpl0(i, Uri) ? "Uri" : m7705equalsimpl0(i, Email) ? "Email" : m7705equalsimpl0(i, Password) ? "Password" : m7705equalsimpl0(i, NumberPassword) ? "NumberPassword" : m7705equalsimpl0(i, Decimal) ? "Decimal" : m7705equalsimpl0(i, PasswordVisible) ? "PasswordVisible" : m7705equalsimpl0(i, PostalAddress) ? "PostalAddress" : m7705equalsimpl0(i, PersonName) ? "PersonName" : m7705equalsimpl0(i, EmailSubject) ? "EmailSubject" : m7705equalsimpl0(i, ShortMessage) ? "ShortMessage" : m7705equalsimpl0(i, LongMessage) ? "LongMessage" : m7705equalsimpl0(i, Filter) ? "Filter" : m7705equalsimpl0(i, Phonetic) ? "Phonetic" : m7705equalsimpl0(i, DateTime) ? ExifInterface.TAG_DATETIME : m7705equalsimpl0(i, Date) ? "Date" : m7705equalsimpl0(i, Time) ? "Time" : m7705equalsimpl0(i, NumberSigned) ? "NumberSigned" : m7705equalsimpl0(i, DecimalSigned) ? "DecimalSigned" : m7705equalsimpl0(i, DecimalPassword) ? "DecimalPassword" : m7705equalsimpl0(i, NumberPasswordSigned) ? "NumberPasswordSigned" : m7705equalsimpl0(i, DecimalPasswordSigned) ? "DecimalPasswordSigned" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m7704equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m7706hashCodeimpl(this.value);
    }

    public String toString() {
        return m7707toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m7708unboximpl() {
        return this.value;
    }
}
