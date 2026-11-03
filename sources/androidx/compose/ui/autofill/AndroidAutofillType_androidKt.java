package androidx.compose.ui.autofill;

import androidx.autofill.HintConstants;
import defpackage.dv1;
import defpackage.fi1;
import defpackage.v5;
import java.util.HashMap;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class AndroidAutofillType_androidKt {
    private static final HashMap<AutofillType, String> androidAutofillTypes;

    static {
        dv1[] dv1VarArr = {new dv1(AutofillType.EmailAddress, HintConstants.AUTOFILL_HINT_EMAIL_ADDRESS), new dv1(AutofillType.Username, HintConstants.AUTOFILL_HINT_USERNAME), new dv1(AutofillType.Password, HintConstants.AUTOFILL_HINT_PASSWORD), new dv1(AutofillType.NewUsername, HintConstants.AUTOFILL_HINT_NEW_USERNAME), new dv1(AutofillType.NewPassword, HintConstants.AUTOFILL_HINT_NEW_PASSWORD), new dv1(AutofillType.PostalAddress, HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS), new dv1(AutofillType.PostalCode, HintConstants.AUTOFILL_HINT_POSTAL_CODE), new dv1(AutofillType.CreditCardNumber, HintConstants.AUTOFILL_HINT_CREDIT_CARD_NUMBER), new dv1(AutofillType.CreditCardSecurityCode, HintConstants.AUTOFILL_HINT_CREDIT_CARD_SECURITY_CODE), new dv1(AutofillType.CreditCardExpirationDate, HintConstants.AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_DATE), new dv1(AutofillType.CreditCardExpirationMonth, HintConstants.AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_MONTH), new dv1(AutofillType.CreditCardExpirationYear, HintConstants.AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_YEAR), new dv1(AutofillType.CreditCardExpirationDay, HintConstants.AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_DAY), new dv1(AutofillType.AddressCountry, HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_COUNTRY), new dv1(AutofillType.AddressRegion, HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_REGION), new dv1(AutofillType.AddressLocality, HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_LOCALITY), new dv1(AutofillType.AddressStreet, HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_STREET_ADDRESS), new dv1(AutofillType.AddressAuxiliaryDetails, HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_EXTENDED_ADDRESS), new dv1(AutofillType.PostalCodeExtended, HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_EXTENDED_POSTAL_CODE), new dv1(AutofillType.PersonFullName, HintConstants.AUTOFILL_HINT_PERSON_NAME), new dv1(AutofillType.PersonFirstName, HintConstants.AUTOFILL_HINT_PERSON_NAME_GIVEN), new dv1(AutofillType.PersonLastName, HintConstants.AUTOFILL_HINT_PERSON_NAME_FAMILY), new dv1(AutofillType.PersonMiddleName, HintConstants.AUTOFILL_HINT_PERSON_NAME_MIDDLE), new dv1(AutofillType.PersonMiddleInitial, HintConstants.AUTOFILL_HINT_PERSON_NAME_MIDDLE_INITIAL), new dv1(AutofillType.PersonNamePrefix, HintConstants.AUTOFILL_HINT_PERSON_NAME_PREFIX), new dv1(AutofillType.PersonNameSuffix, HintConstants.AUTOFILL_HINT_PERSON_NAME_SUFFIX), new dv1(AutofillType.PhoneNumber, HintConstants.AUTOFILL_HINT_PHONE_NUMBER), new dv1(AutofillType.PhoneNumberDevice, HintConstants.AUTOFILL_HINT_PHONE_NUMBER_DEVICE), new dv1(AutofillType.PhoneCountryCode, HintConstants.AUTOFILL_HINT_PHONE_COUNTRY_CODE), new dv1(AutofillType.PhoneNumberNational, HintConstants.AUTOFILL_HINT_PHONE_NATIONAL), new dv1(AutofillType.Gender, HintConstants.AUTOFILL_HINT_GENDER), new dv1(AutofillType.BirthDateFull, HintConstants.AUTOFILL_HINT_BIRTH_DATE_FULL), new dv1(AutofillType.BirthDateDay, HintConstants.AUTOFILL_HINT_BIRTH_DATE_DAY), new dv1(AutofillType.BirthDateMonth, HintConstants.AUTOFILL_HINT_BIRTH_DATE_MONTH), new dv1(AutofillType.BirthDateYear, HintConstants.AUTOFILL_HINT_BIRTH_DATE_YEAR), new dv1(AutofillType.SmsOtpCode, HintConstants.AUTOFILL_HINT_SMS_OTP)};
        HashMap<AutofillType, String> hashMap = new HashMap<>(fi1.P(36));
        fi1.S(hashMap, dv1VarArr);
        androidAutofillTypes = hashMap;
    }

    private static /* synthetic */ void getAndroidAutofillTypes$annotations() {
    }

    public static final String getAndroidType(AutofillType autofillType) {
        String str = androidAutofillTypes.get(autofillType);
        if (str != null) {
            return str;
        }
        v5.m("Unsupported autofill type");
        return null;
    }

    public static /* synthetic */ void getAndroidType$annotations(AutofillType autofillType) {
    }
}
