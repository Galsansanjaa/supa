package defpackage;

import android.accounts.Account;
import androidx.credentials.CreateDigitalCredentialRequest;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class fc4 {
    public static final Pattern a = Pattern.compile("[a-z]+(_[a-z]+)*");
    public static final Account b = zb4.a;
    public static final Set c = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("default", CreateDigitalCredentialRequest.UNUSED_USER_ID, "special", "reserved", "shared", "virtual", "managed")));
    public static final Set d = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("files", "cache", "managed", "directboot-files", "directboot-cache", "external")));
}
