package defpackage;

import android.accounts.AbstractAccountAuthenticator;
import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.accounts.AccountManager;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.uptodown.activities.LoginActivity;
import com.uptodown.services.AuthenticatorService;
import org.json.JSONObject;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class p90 extends AbstractAccountAuthenticator {
    public final AuthenticatorService a;

    public p90(AuthenticatorService authenticatorService) {
        super(authenticatorService);
        this.a = authenticatorService;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public final Bundle addAccount(AccountAuthenticatorResponse accountAuthenticatorResponse, String str, String str2, String[] strArr, Bundle bundle) {
        Intent intent = new Intent(this.a, (Class<?>) LoginActivity.class);
        intent.putExtra("accountAuthenticatorResponse", accountAuthenticatorResponse);
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("intent", intent);
        return bundle2;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public final Bundle confirmCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, Bundle bundle) {
        accountAuthenticatorResponse.getClass();
        account.getClass();
        bundle.getClass();
        return null;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public final Bundle editProperties(AccountAuthenticatorResponse accountAuthenticatorResponse, String str) {
        accountAuthenticatorResponse.getClass();
        str.getClass();
        return null;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public final Bundle getAccountRemovalAllowed(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account) {
        accountAuthenticatorResponse.getClass();
        account.getClass();
        Bundle accountRemovalAllowed = super.getAccountRemovalAllowed(accountAuthenticatorResponse, account);
        if (accountRemovalAllowed != null && accountRemovalAllowed.containsKey("booleanResult") && !accountRemovalAllowed.containsKey("intent") && accountRemovalAllowed.getBoolean("booleanResult")) {
            l23.c(this.a);
        }
        accountRemovalAllowed.getClass();
        return accountRemovalAllowed;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public final Bundle getAuthToken(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String str, Bundle bundle) {
        String password;
        JSONObject jSONObject;
        JSONObject optJSONObject;
        accountAuthenticatorResponse.getClass();
        account.getClass();
        str.getClass();
        bundle.getClass();
        AuthenticatorService authenticatorService = this.a;
        AccountManager accountManager = AccountManager.get(authenticatorService);
        String peekAuthToken = accountManager.peekAuthToken(account, str);
        if (TextUtils.isEmpty(peekAuthToken) && (password = accountManager.getPassword(account)) != null) {
            String str2 = account.name;
            str2.getClass();
            w72 F = new w73(authenticatorService, 0, false).F(str2, password);
            if (!F.b() && (jSONObject = F.d) != null && (optJSONObject = jSONObject.optJSONObject("data")) != null) {
                n23 n23Var = new n23();
                n23Var.b(authenticatorService, optJSONObject);
                String str3 = n23Var.a;
                if (str3 != null && str3.length() > 0) {
                    n23Var.e(authenticatorService);
                }
                String str4 = null;
                try {
                    SharedPreferences sharedPreferences = authenticatorService.getSharedPreferences("SettingsPreferences", 0);
                    if (sharedPreferences.contains("UTOKEN")) {
                        str4 = sharedPreferences.getString("UTOKEN", null);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (str4 == null || str4.length() == 0) {
                    l23.c(authenticatorService);
                }
            }
        }
        if (TextUtils.isEmpty(peekAuthToken)) {
            Intent intent = new Intent(authenticatorService, (Class<?>) LoginActivity.class);
            intent.putExtra("accountAuthenticatorResponse", accountAuthenticatorResponse);
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("intent", intent);
            return bundle2;
        }
        Bundle bundle3 = new Bundle();
        bundle3.putString("authAccount", account.name);
        bundle3.putString("accountType", account.type);
        bundle3.putString("authtoken", peekAuthToken);
        return bundle3;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public final String getAuthTokenLabel(String str) {
        str.getClass();
        return "Uptodown login";
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public final Bundle hasFeatures(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String[] strArr) {
        accountAuthenticatorResponse.getClass();
        account.getClass();
        strArr.getClass();
        return null;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public final Bundle updateCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String str, Bundle bundle) {
        accountAuthenticatorResponse.getClass();
        account.getClass();
        str.getClass();
        bundle.getClass();
        return null;
    }
}
