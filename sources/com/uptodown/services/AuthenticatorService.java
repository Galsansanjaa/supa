package com.uptodown.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import defpackage.p90;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class AuthenticatorService extends Service {
    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        IBinder iBinder = new p90(this).getIBinder();
        iBinder.getClass();
        return iBinder;
    }
}
