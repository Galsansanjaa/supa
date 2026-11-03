package androidx.compose.ui.autofill;

import defpackage.ej0;
import defpackage.hd0;
import defpackage.nb0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
@hd0
/* loaded from: classes.dex */
public final class AutofillType {
    private static final /* synthetic */ ej0 $ENTRIES;
    private static final /* synthetic */ AutofillType[] $VALUES;
    public static final AutofillType EmailAddress = new AutofillType("EmailAddress", 0);
    public static final AutofillType Username = new AutofillType("Username", 1);
    public static final AutofillType Password = new AutofillType("Password", 2);
    public static final AutofillType NewUsername = new AutofillType("NewUsername", 3);
    public static final AutofillType NewPassword = new AutofillType("NewPassword", 4);
    public static final AutofillType PostalAddress = new AutofillType("PostalAddress", 5);
    public static final AutofillType PostalCode = new AutofillType("PostalCode", 6);
    public static final AutofillType CreditCardNumber = new AutofillType("CreditCardNumber", 7);
    public static final AutofillType CreditCardSecurityCode = new AutofillType("CreditCardSecurityCode", 8);
    public static final AutofillType CreditCardExpirationDate = new AutofillType("CreditCardExpirationDate", 9);
    public static final AutofillType CreditCardExpirationMonth = new AutofillType("CreditCardExpirationMonth", 10);
    public static final AutofillType CreditCardExpirationYear = new AutofillType("CreditCardExpirationYear", 11);
    public static final AutofillType CreditCardExpirationDay = new AutofillType("CreditCardExpirationDay", 12);
    public static final AutofillType AddressCountry = new AutofillType("AddressCountry", 13);
    public static final AutofillType AddressRegion = new AutofillType("AddressRegion", 14);
    public static final AutofillType AddressLocality = new AutofillType("AddressLocality", 15);
    public static final AutofillType AddressStreet = new AutofillType("AddressStreet", 16);
    public static final AutofillType AddressAuxiliaryDetails = new AutofillType("AddressAuxiliaryDetails", 17);
    public static final AutofillType PostalCodeExtended = new AutofillType("PostalCodeExtended", 18);
    public static final AutofillType PersonFullName = new AutofillType("PersonFullName", 19);
    public static final AutofillType PersonFirstName = new AutofillType("PersonFirstName", 20);
    public static final AutofillType PersonLastName = new AutofillType("PersonLastName", 21);
    public static final AutofillType PersonMiddleName = new AutofillType("PersonMiddleName", 22);
    public static final AutofillType PersonMiddleInitial = new AutofillType("PersonMiddleInitial", 23);
    public static final AutofillType PersonNamePrefix = new AutofillType("PersonNamePrefix", 24);
    public static final AutofillType PersonNameSuffix = new AutofillType("PersonNameSuffix", 25);
    public static final AutofillType PhoneNumber = new AutofillType("PhoneNumber", 26);
    public static final AutofillType PhoneNumberDevice = new AutofillType("PhoneNumberDevice", 27);
    public static final AutofillType PhoneCountryCode = new AutofillType("PhoneCountryCode", 28);
    public static final AutofillType PhoneNumberNational = new AutofillType("PhoneNumberNational", 29);
    public static final AutofillType Gender = new AutofillType("Gender", 30);
    public static final AutofillType BirthDateFull = new AutofillType("BirthDateFull", 31);
    public static final AutofillType BirthDateDay = new AutofillType("BirthDateDay", 32);
    public static final AutofillType BirthDateMonth = new AutofillType("BirthDateMonth", 33);
    public static final AutofillType BirthDateYear = new AutofillType("BirthDateYear", 34);
    public static final AutofillType SmsOtpCode = new AutofillType("SmsOtpCode", 35);

    private static final /* synthetic */ AutofillType[] $values() {
        return new AutofillType[]{EmailAddress, Username, Password, NewUsername, NewPassword, PostalAddress, PostalCode, CreditCardNumber, CreditCardSecurityCode, CreditCardExpirationDate, CreditCardExpirationMonth, CreditCardExpirationYear, CreditCardExpirationDay, AddressCountry, AddressRegion, AddressLocality, AddressStreet, AddressAuxiliaryDetails, PostalCodeExtended, PersonFullName, PersonFirstName, PersonLastName, PersonMiddleName, PersonMiddleInitial, PersonNamePrefix, PersonNameSuffix, PhoneNumber, PhoneNumberDevice, PhoneCountryCode, PhoneNumberNational, Gender, BirthDateFull, BirthDateDay, BirthDateMonth, BirthDateYear, SmsOtpCode};
    }

    static {
        AutofillType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nb0.s($values);
    }

    private AutofillType(String str, int i) {
    }

    public static ej0 getEntries() {
        return $ENTRIES;
    }

    public static AutofillType valueOf(String str) {
        return (AutofillType) Enum.valueOf(AutofillType.class, str);
    }

    public static AutofillType[] values() {
        return (AutofillType[]) $VALUES.clone();
    }
}
