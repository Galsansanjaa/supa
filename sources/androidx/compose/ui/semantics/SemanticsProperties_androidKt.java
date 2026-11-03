package androidx.compose.ui.semantics;

import defpackage.jm1;
import defpackage.nb2;
import defpackage.sa1;
import defpackage.ts0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class SemanticsProperties_androidKt {
    static final /* synthetic */ sa1[] $$delegatedProperties = {new jm1(SemanticsProperties_androidKt.class, "testTagsAsResourceId", "getTestTagsAsResourceId(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new jm1(SemanticsProperties_androidKt.class, "accessibilityClassName", "getAccessibilityClassName(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)};

    static {
        SemanticsPropertiesAndroid semanticsPropertiesAndroid = SemanticsPropertiesAndroid.INSTANCE;
        semanticsPropertiesAndroid.getTestTagsAsResourceId();
        semanticsPropertiesAndroid.getAccessibilityClassName();
    }

    public static final <T> SemanticsPropertyKey<T> SemanticsPropertyKey(String str, String str2, ts0 ts0Var) {
        return new SemanticsPropertyKey<>(str, false, ts0Var, str2);
    }

    public static /* synthetic */ SemanticsPropertyKey SemanticsPropertyKey$default(String str, String str2, ts0 ts0Var, int i, Object obj) {
        if ((i & 4) != 0) {
            ts0Var = new nb2(26);
        }
        return SemanticsPropertyKey(str, str2, ts0Var);
    }

    public static final Object SemanticsPropertyKey$lambda$0(Object obj, Object obj2) {
        return obj;
    }

    public static /* synthetic */ Object a(Object obj, Object obj2) {
        return SemanticsPropertyKey$lambda$0(obj, obj2);
    }

    public static final String getAccessibilityClassName(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsPropertiesAndroid.INSTANCE.getAccessibilityClassName().getValue(semanticsPropertyReceiver, $$delegatedProperties[1]);
    }

    public static final CredentialRequestData getCredentialRequest(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        throw new UnsupportedOperationException("You cannot retrieve a semantics property directly - use one of the SemanticsConfiguration.getOr* methods instead");
    }

    public static final boolean getTestTagsAsResourceId(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsPropertiesAndroid.INSTANCE.getTestTagsAsResourceId().getValue(semanticsPropertyReceiver, $$delegatedProperties[0]).booleanValue();
    }

    public static final void setAccessibilityClassName(SemanticsPropertyReceiver semanticsPropertyReceiver, String str) {
        SemanticsPropertiesAndroid.INSTANCE.getAccessibilityClassName().setValue(semanticsPropertyReceiver, $$delegatedProperties[1], str);
    }

    public static final void setCredentialRequest(SemanticsPropertyReceiver semanticsPropertyReceiver, CredentialRequestData credentialRequestData) {
        semanticsPropertyReceiver.set(SemanticsPropertiesAndroid.INSTANCE.getCredentialRequest(), credentialRequestData);
    }

    public static final void setTestTagsAsResourceId(SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z) {
        SemanticsPropertiesAndroid.INSTANCE.getTestTagsAsResourceId().setValue(semanticsPropertyReceiver, $$delegatedProperties[0], Boolean.valueOf(z));
    }
}
