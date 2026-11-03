package androidx.credentials.provider;

import androidx.credentials.provider.CallingAppInfo;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements ps0 {
    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        CharSequence convertToFingerprints$lambda$0;
        convertToFingerprints$lambda$0 = CallingAppInfo.SignatureVerifier.convertToFingerprints$lambda$0(((Byte) obj).byteValue());
        return convertToFingerprints$lambda$0;
    }
}
