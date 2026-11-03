package androidx.credentials;

import android.graphics.drawable.Icon;
import android.os.Bundle;
import androidx.autofill.HintConstants;
import androidx.credentials.CreateCredentialRequest;
import androidx.credentials.internal.FrameworkClassParsingException;
import androidx.credentials.internal.RequestValidationHelper;
import defpackage.sb0;
import defpackage.v5;
import org.json.JSONObject;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class CreatePublicKeyCredentialRequest extends CreateCredentialRequest {
    public static final String BUNDLE_KEY_CLIENT_DATA_HASH = "androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH";
    public static final String BUNDLE_KEY_CONDITIONAL_CREATE = "androidx.credentials.BUNDLE_KEY_IS_CONDITIONAL_REQUEST";
    public static final String BUNDLE_KEY_REQUEST_JSON = "androidx.credentials.BUNDLE_KEY_REQUEST_JSON";
    public static final String BUNDLE_VALUE_SUBTYPE_CREATE_PUBLIC_KEY_CREDENTIAL_REQUEST = "androidx.credentials.BUNDLE_VALUE_SUBTYPE_CREATE_PUBLIC_KEY_CREDENTIAL_REQUEST";
    public static final Companion Companion = new Companion(null);
    private final byte[] clientDataHash;
    private final boolean isConditional;
    private final String requestJson;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        public static /* synthetic */ CreateCredentialRequest.DisplayInfo getRequestDisplayInfo$credentials$default(Companion companion, String str, String str2, int i, Object obj) {
            if ((i & 2) != 0) {
                str2 = null;
            }
            return companion.getRequestDisplayInfo$credentials(str, str2);
        }

        public static /* synthetic */ Bundle toCredentialDataBundle$credentials$default(Companion companion, String str, byte[] bArr, int i, Object obj) {
            if ((i & 2) != 0) {
                bArr = null;
            }
            return companion.toCredentialDataBundle$credentials(str, bArr);
        }

        public final CreatePublicKeyCredentialRequest createFrom$credentials(Bundle bundle, String str, Bundle bundle2) {
            CreateCredentialRequest.DisplayInfo requestDisplayInfo$credentials$default;
            bundle.getClass();
            bundle2.getClass();
            try {
                String string = bundle.getString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON");
                string.getClass();
                byte[] byteArray = bundle.getByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH");
                boolean z = bundle.getBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
                try {
                    requestDisplayInfo$credentials$default = CreateCredentialRequest.DisplayInfo.Companion.createFrom(bundle);
                } catch (IllegalArgumentException unused) {
                    requestDisplayInfo$credentials$default = getRequestDisplayInfo$credentials$default(this, string, null, 2, null);
                }
                return new CreatePublicKeyCredentialRequest(string, byteArray, bundle.getBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false), z, requestDisplayInfo$credentials$default, str, bundle, bundle2, bundle.getBoolean(CreatePublicKeyCredentialRequest.BUNDLE_KEY_CONDITIONAL_CREATE), null);
            } catch (Exception unused2) {
                throw new FrameworkClassParsingException();
            }
        }

        public final CreateCredentialRequest.DisplayInfo getRequestDisplayInfo$credentials(String str, String str2) {
            str.getClass();
            try {
                JSONObject jSONObject = new JSONObject(str).getJSONObject("user");
                String string = jSONObject.getString(HintConstants.AUTOFILL_HINT_NAME);
                String string2 = jSONObject.isNull("displayName") ? null : jSONObject.getString("displayName");
                string.getClass();
                return new CreateCredentialRequest.DisplayInfo(string, string2, (Icon) null, str2);
            } catch (Exception unused) {
                v5.m("user.name must be defined in requestJson");
                return null;
            }
        }

        public final Bundle toCandidateDataBundle$credentials(String str, byte[] bArr) {
            str.getClass();
            Bundle bundle = new Bundle();
            bundle.putString(PublicKeyCredential.BUNDLE_KEY_SUBTYPE, CreatePublicKeyCredentialRequest.BUNDLE_VALUE_SUBTYPE_CREATE_PUBLIC_KEY_CREDENTIAL_REQUEST);
            bundle.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", str);
            bundle.putByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH", bArr);
            return bundle;
        }

        public final Bundle toCredentialDataBundle$credentials(String str, byte[] bArr) {
            str.getClass();
            Bundle bundle = new Bundle();
            bundle.putString(PublicKeyCredential.BUNDLE_KEY_SUBTYPE, CreatePublicKeyCredentialRequest.BUNDLE_VALUE_SUBTYPE_CREATE_PUBLIC_KEY_CREDENTIAL_REQUEST);
            bundle.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", str);
            bundle.putByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH", bArr);
            return bundle;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreatePublicKeyCredentialRequest(String str) {
        this(str, null, false, null, false, false, 62, null);
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreatePublicKeyCredentialRequest(String str, byte[] bArr) {
        this(str, bArr, false, null, false, false, 60, null);
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreatePublicKeyCredentialRequest(String str, byte[] bArr, boolean z) {
        this(str, bArr, z, null, false, false, 56, null);
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreatePublicKeyCredentialRequest(String str, byte[] bArr, boolean z, String str2) {
        this(str, bArr, z, str2, false, false, 48, null);
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreatePublicKeyCredentialRequest(String str, byte[] bArr, boolean z, String str2, String str3, boolean z2) {
        this(str, bArr, z2, z, Companion.getRequestDisplayInfo$credentials(str, str3), str2, null, null, false, 448, null);
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreatePublicKeyCredentialRequest(String str, byte[] bArr, boolean z, String str2, boolean z2) {
        this(str, bArr, z, str2, z2, false, 32, null);
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreatePublicKeyCredentialRequest(String str, byte[] bArr, boolean z, String str2, boolean z2, boolean z3) {
        this(str, bArr, z2, z, Companion.getRequestDisplayInfo$credentials$default(Companion, str, null, 2, null), str2, null, null, z3, 192, null);
        str.getClass();
    }

    public /* synthetic */ CreatePublicKeyCredentialRequest(String str, byte[] bArr, boolean z, String str2, boolean z2, boolean z3, int i, sb0 sb0Var) {
        this(str, (i & 2) != 0 ? null : bArr, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? false : z3);
    }

    private CreatePublicKeyCredentialRequest(String str, byte[] bArr, boolean z, boolean z2, CreateCredentialRequest.DisplayInfo displayInfo, String str2, Bundle bundle, Bundle bundle2, boolean z3) {
        super(PublicKeyCredential.TYPE_PUBLIC_KEY_CREDENTIAL, bundle, bundle2, false, z, displayInfo, str2, z2);
        this.requestJson = str;
        this.clientDataHash = bArr;
        this.isConditional = z3;
        if (!RequestValidationHelper.Companion.isValidJSON(str)) {
            v5.m("requestJson must not be empty, and must be a valid JSON");
            throw null;
        }
        if (z3) {
            bundle2.putBoolean(BUNDLE_KEY_CONDITIONAL_CREATE, true);
            bundle.putBoolean(BUNDLE_KEY_CONDITIONAL_CREATE, true);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ CreatePublicKeyCredentialRequest(java.lang.String r11, byte[] r12, boolean r13, boolean r14, androidx.credentials.CreateCredentialRequest.DisplayInfo r15, java.lang.String r16, android.os.Bundle r17, android.os.Bundle r18, boolean r19, int r20, defpackage.sb0 r21) {
        /*
            r10 = this;
            r0 = r20
            r3 = r0 & 32
            if (r3 == 0) goto L9
            r3 = 0
            r6 = r3
            goto Lb
        L9:
            r6 = r16
        Lb:
            r3 = r0 & 64
            if (r3 == 0) goto L17
            androidx.credentials.CreatePublicKeyCredentialRequest$Companion r3 = androidx.credentials.CreatePublicKeyCredentialRequest.Companion
            android.os.Bundle r3 = r3.toCredentialDataBundle$credentials(r11, r12)
            r7 = r3
            goto L19
        L17:
            r7 = r17
        L19:
            r3 = r0 & 128(0x80, float:1.794E-43)
            if (r3 == 0) goto L25
            androidx.credentials.CreatePublicKeyCredentialRequest$Companion r3 = androidx.credentials.CreatePublicKeyCredentialRequest.Companion
            android.os.Bundle r3 = r3.toCandidateDataBundle$credentials(r11, r12)
            r8 = r3
            goto L27
        L25:
            r8 = r18
        L27:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L34
            r0 = 0
            r9 = r0
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r0 = r10
            goto L3c
        L34:
            r9 = r19
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
        L3c:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.credentials.CreatePublicKeyCredentialRequest.<init>(java.lang.String, byte[], boolean, boolean, androidx.credentials.CreateCredentialRequest$DisplayInfo, java.lang.String, android.os.Bundle, android.os.Bundle, boolean, int, sb0):void");
    }

    public /* synthetic */ CreatePublicKeyCredentialRequest(String str, byte[] bArr, boolean z, boolean z2, CreateCredentialRequest.DisplayInfo displayInfo, String str2, Bundle bundle, Bundle bundle2, boolean z3, sb0 sb0Var) {
        this(str, bArr, z, z2, displayInfo, str2, bundle, bundle2, z3);
    }

    public final byte[] getClientDataHash() {
        return this.clientDataHash;
    }

    public final String getRequestJson() {
        return this.requestJson;
    }

    public final boolean isConditional() {
        return this.isConditional;
    }
}
