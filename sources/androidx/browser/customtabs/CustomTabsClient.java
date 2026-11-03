package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import androidx.browser.auth.AuthTabCallback;
import androidx.browser.auth.AuthTabSession;
import androidx.browser.customtabs.CustomTabsSession;
import defpackage.oz0;
import defpackage.rz0;
import defpackage.t90;
import defpackage.v5;
import defpackage.vz0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public class CustomTabsClient {
    private static final String TAG = "CustomTabsClient";
    private final Context mApplicationContext;
    private final vz0 mService;
    private final ComponentName mServiceComponentName;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* renamed from: androidx.browser.customtabs.CustomTabsClient$1 */
    /* loaded from: classes.dex */
    public class AnonymousClass1 extends CustomTabsServiceConnection {
        final /* synthetic */ Context val$applicationContext;

        public AnonymousClass1(Context context) {
            r1 = context;
        }

        @Override // androidx.browser.customtabs.CustomTabsServiceConnection
        public final void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
            customTabsClient.warmup(0L);
            r1.unbindService(this);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* renamed from: androidx.browser.customtabs.CustomTabsClient$2 */
    /* loaded from: classes.dex */
    public class AnonymousClass2 extends oz0 {
        private final Executor mExecutor;
        final /* synthetic */ AuthTabCallback val$callback;
        final /* synthetic */ Executor val$executor;

        public AnonymousClass2(Executor executor, AuthTabCallback authTabCallback) {
            this.val$executor = executor;
            this.val$callback = authTabCallback;
            this.mExecutor = executor == null ? new t90(new Handler(Looper.getMainLooper()), 0) : executor;
        }

        @Override // defpackage.pz0
        public int getInterfaceVersion() {
            return 1;
        }

        @Override // defpackage.pz0
        public void onExtraCallback(final String str, final Bundle bundle) throws RemoteException {
            if (this.val$callback == null) {
                return;
            }
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                Executor executor = this.mExecutor;
                final AuthTabCallback authTabCallback = this.val$callback;
                executor.execute(new Runnable() { // from class: androidx.browser.customtabs.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        AuthTabCallback.this.onExtraCallback(str, bundle);
                    }
                });
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }

        @Override // defpackage.pz0
        public Bundle onExtraCallbackWithResult(String str, Bundle bundle) throws RemoteException {
            if (this.val$callback == null) {
                return Bundle.EMPTY;
            }
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return this.val$callback.onExtraCallbackWithResult(str, bundle);
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }

        @Override // defpackage.pz0
        public void onNavigationEvent(int i, Bundle bundle) throws RemoteException {
            if (this.val$callback == null) {
                return;
            }
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                this.mExecutor.execute(new e(this.val$callback, i, bundle, 2));
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }

        @Override // defpackage.pz0
        public void onWarmupCompleted(final Bundle bundle) throws RemoteException {
            if (this.val$callback == null) {
                return;
            }
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                Executor executor = this.mExecutor;
                final AuthTabCallback authTabCallback = this.val$callback;
                executor.execute(new Runnable() { // from class: androidx.browser.customtabs.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        AuthTabCallback.this.onWarmupCompleted(bundle);
                    }
                });
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* renamed from: androidx.browser.customtabs.CustomTabsClient$3 */
    /* loaded from: classes.dex */
    public class AnonymousClass3 extends rz0 {
        private Handler mHandler = new Handler(Looper.getMainLooper());
        final /* synthetic */ CustomTabsCallback val$callback;

        /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
        /* renamed from: androidx.browser.customtabs.CustomTabsClient$3$1 */
        /* loaded from: classes.dex */
        public class AnonymousClass1 implements Runnable {
            final /* synthetic */ Bundle val$extras;
            final /* synthetic */ int val$navigationEvent;

            public AnonymousClass1(int i, Bundle bundle) {
                r2 = i;
                r3 = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                r2.onNavigationEvent(r2, r3);
            }
        }

        /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
        /* renamed from: androidx.browser.customtabs.CustomTabsClient$3$10 */
        /* loaded from: classes.dex */
        public class AnonymousClass10 implements Runnable {
            final /* synthetic */ Bundle val$extras;

            public AnonymousClass10(Bundle bundle) {
                r2 = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                r2.onUnminimized(r2);
            }
        }

        /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
        /* renamed from: androidx.browser.customtabs.CustomTabsClient$3$2 */
        /* loaded from: classes.dex */
        public class AnonymousClass2 implements Runnable {
            final /* synthetic */ Bundle val$args;
            final /* synthetic */ String val$callbackName;

            public AnonymousClass2(String str, Bundle bundle) {
                r2 = str;
                r3 = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                r2.extraCallback(r2, r3);
            }
        }

        /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
        /* renamed from: androidx.browser.customtabs.CustomTabsClient$3$3 */
        /* loaded from: classes.dex */
        public class RunnableC00003 implements Runnable {
            final /* synthetic */ Bundle val$extras;

            public RunnableC00003(Bundle bundle) {
                r2 = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                r2.onMessageChannelReady(r2);
            }
        }

        /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
        /* renamed from: androidx.browser.customtabs.CustomTabsClient$3$4 */
        /* loaded from: classes.dex */
        public class AnonymousClass4 implements Runnable {
            final /* synthetic */ Bundle val$extras;
            final /* synthetic */ String val$message;

            public AnonymousClass4(String str, Bundle bundle) {
                r2 = str;
                r3 = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                r2.onPostMessage(r2, r3);
            }
        }

        /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
        /* renamed from: androidx.browser.customtabs.CustomTabsClient$3$5 */
        /* loaded from: classes.dex */
        public class AnonymousClass5 implements Runnable {
            final /* synthetic */ Bundle val$extras;
            final /* synthetic */ int val$relation;
            final /* synthetic */ Uri val$requestedOrigin;
            final /* synthetic */ boolean val$result;

            public AnonymousClass5(int i, Uri uri, boolean z, Bundle bundle) {
                r2 = i;
                r3 = uri;
                r4 = z;
                r5 = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                r2.onRelationshipValidationResult(r2, r3, r4, r5);
            }
        }

        /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
        /* renamed from: androidx.browser.customtabs.CustomTabsClient$3$6 */
        /* loaded from: classes.dex */
        public class AnonymousClass6 implements Runnable {
            final /* synthetic */ Bundle val$extras;
            final /* synthetic */ int val$height;
            final /* synthetic */ int val$width;

            public AnonymousClass6(int i, int i2, Bundle bundle) {
                r2 = i;
                r3 = i2;
                r4 = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                r2.onActivityResized(r2, r3, r4);
            }
        }

        /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
        /* renamed from: androidx.browser.customtabs.CustomTabsClient$3$7 */
        /* loaded from: classes.dex */
        public class AnonymousClass7 implements Runnable {
            final /* synthetic */ Bundle val$extras;

            public AnonymousClass7(Bundle bundle) {
                r2 = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                r2.onWarmupCompleted(r2);
            }
        }

        /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
        /* renamed from: androidx.browser.customtabs.CustomTabsClient$3$8 */
        /* loaded from: classes.dex */
        public class AnonymousClass8 implements Runnable {
            final /* synthetic */ int val$bottom;
            final /* synthetic */ Bundle val$extras;
            final /* synthetic */ int val$left;
            final /* synthetic */ int val$right;
            final /* synthetic */ int val$state;
            final /* synthetic */ int val$top;

            public AnonymousClass8(int i, int i2, int i3, int i4, int i5, Bundle bundle) {
                r2 = i;
                r3 = i2;
                r4 = i3;
                r5 = i4;
                r6 = i5;
                r7 = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                r2.onActivityLayout(r2, r3, r4, r5, r6, r7);
            }
        }

        /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
        /* renamed from: androidx.browser.customtabs.CustomTabsClient$3$9 */
        /* loaded from: classes.dex */
        public class AnonymousClass9 implements Runnable {
            final /* synthetic */ Bundle val$extras;

            public AnonymousClass9(Bundle bundle) {
                r2 = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                r2.onMinimized(r2);
            }
        }

        public AnonymousClass3(CustomTabsCallback customTabsCallback) {
            r2 = customTabsCallback;
        }

        @Override // defpackage.sz0
        public void extraCallback(String str, Bundle bundle) throws RemoteException {
            if (r2 == null) {
                return;
            }
            this.mHandler.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.3.2
                final /* synthetic */ Bundle val$args;
                final /* synthetic */ String val$callbackName;

                public AnonymousClass2(String str2, Bundle bundle2) {
                    r2 = str2;
                    r3 = bundle2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    r2.extraCallback(r2, r3);
                }
            });
        }

        @Override // defpackage.sz0
        public Bundle extraCallbackWithResult(String str, Bundle bundle) throws RemoteException {
            CustomTabsCallback customTabsCallback = r2;
            if (customTabsCallback == null) {
                return null;
            }
            return customTabsCallback.extraCallbackWithResult(str, bundle);
        }

        @Override // defpackage.sz0
        public int getInterfaceVersion() {
            return 1;
        }

        @Override // defpackage.sz0
        public void onActivityLayout(int i, int i2, int i3, int i4, int i5, Bundle bundle) throws RemoteException {
            if (r2 == null) {
                return;
            }
            this.mHandler.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.3.8
                final /* synthetic */ int val$bottom;
                final /* synthetic */ Bundle val$extras;
                final /* synthetic */ int val$left;
                final /* synthetic */ int val$right;
                final /* synthetic */ int val$state;
                final /* synthetic */ int val$top;

                public AnonymousClass8(int i6, int i22, int i32, int i42, int i52, Bundle bundle2) {
                    r2 = i6;
                    r3 = i22;
                    r4 = i32;
                    r5 = i42;
                    r6 = i52;
                    r7 = bundle2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    r2.onActivityLayout(r2, r3, r4, r5, r6, r7);
                }
            });
        }

        @Override // defpackage.sz0
        public void onActivityResized(int i, int i2, Bundle bundle) throws RemoteException {
            if (r2 == null) {
                return;
            }
            this.mHandler.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.3.6
                final /* synthetic */ Bundle val$extras;
                final /* synthetic */ int val$height;
                final /* synthetic */ int val$width;

                public AnonymousClass6(int i3, int i22, Bundle bundle2) {
                    r2 = i3;
                    r3 = i22;
                    r4 = bundle2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    r2.onActivityResized(r2, r3, r4);
                }
            });
        }

        @Override // defpackage.sz0
        public void onMessageChannelReady(Bundle bundle) throws RemoteException {
            if (r2 == null) {
                return;
            }
            this.mHandler.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.3.3
                final /* synthetic */ Bundle val$extras;

                public RunnableC00003(Bundle bundle2) {
                    r2 = bundle2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    r2.onMessageChannelReady(r2);
                }
            });
        }

        @Override // defpackage.sz0
        public void onMinimized(Bundle bundle) throws RemoteException {
            if (r2 == null) {
                return;
            }
            this.mHandler.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.3.9
                final /* synthetic */ Bundle val$extras;

                public AnonymousClass9(Bundle bundle2) {
                    r2 = bundle2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    r2.onMinimized(r2);
                }
            });
        }

        @Override // defpackage.sz0
        public void onNavigationEvent(int i, Bundle bundle) {
            if (r2 == null) {
                return;
            }
            this.mHandler.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.3.1
                final /* synthetic */ Bundle val$extras;
                final /* synthetic */ int val$navigationEvent;

                public AnonymousClass1(int i2, Bundle bundle2) {
                    r2 = i2;
                    r3 = bundle2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    r2.onNavigationEvent(r2, r3);
                }
            });
        }

        @Override // defpackage.sz0
        public void onPostMessage(String str, Bundle bundle) throws RemoteException {
            if (r2 == null) {
                return;
            }
            this.mHandler.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.3.4
                final /* synthetic */ Bundle val$extras;
                final /* synthetic */ String val$message;

                public AnonymousClass4(String str2, Bundle bundle2) {
                    r2 = str2;
                    r3 = bundle2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    r2.onPostMessage(r2, r3);
                }
            });
        }

        @Override // defpackage.sz0
        public void onRelationshipValidationResult(int i, Uri uri, boolean z, Bundle bundle) throws RemoteException {
            if (r2 == null) {
                return;
            }
            this.mHandler.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.3.5
                final /* synthetic */ Bundle val$extras;
                final /* synthetic */ int val$relation;
                final /* synthetic */ Uri val$requestedOrigin;
                final /* synthetic */ boolean val$result;

                public AnonymousClass5(int i2, Uri uri2, boolean z2, Bundle bundle2) {
                    r2 = i2;
                    r3 = uri2;
                    r4 = z2;
                    r5 = bundle2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    r2.onRelationshipValidationResult(r2, r3, r4, r5);
                }
            });
        }

        @Override // defpackage.sz0
        public void onUnminimized(Bundle bundle) throws RemoteException {
            if (r2 == null) {
                return;
            }
            this.mHandler.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.3.10
                final /* synthetic */ Bundle val$extras;

                public AnonymousClass10(Bundle bundle2) {
                    r2 = bundle2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    r2.onUnminimized(r2);
                }
            });
        }

        @Override // defpackage.sz0
        public void onWarmupCompleted(Bundle bundle) throws RemoteException {
            if (r2 == null) {
                return;
            }
            this.mHandler.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.3.7
                final /* synthetic */ Bundle val$extras;

                public AnonymousClass7(Bundle bundle2) {
                    r2 = bundle2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    r2.onWarmupCompleted(r2);
                }
            });
        }
    }

    public CustomTabsClient(vz0 vz0Var, ComponentName componentName, Context context) {
        this.mService = vz0Var;
        this.mServiceComponentName = componentName;
        this.mApplicationContext = context;
    }

    public static boolean bindCustomTabsService(Context context, String str, CustomTabsServiceConnection customTabsServiceConnection) {
        customTabsServiceConnection.setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION);
        if (str.isEmpty()) {
            v5.m("Service Intents must be explicit");
            return false;
        }
        intent.setPackage(str);
        return context.bindService(intent, customTabsServiceConnection, 33);
    }

    public static boolean bindCustomTabsServicePreservePriority(Context context, String str, CustomTabsServiceConnection customTabsServiceConnection) {
        customTabsServiceConnection.setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION);
        if (str.isEmpty()) {
            v5.m("Service Intents must be explicit");
            return false;
        }
        intent.setPackage(str);
        return context.bindService(intent, customTabsServiceConnection, 1);
    }

    public static boolean connectAndInitialize(Context context, String str) {
        if (str == null) {
            return false;
        }
        Context applicationContext = context.getApplicationContext();
        try {
            return bindCustomTabsService(applicationContext, str, new CustomTabsServiceConnection() { // from class: androidx.browser.customtabs.CustomTabsClient.1
                final /* synthetic */ Context val$applicationContext;

                public AnonymousClass1(Context applicationContext2) {
                    r1 = applicationContext2;
                }

                @Override // androidx.browser.customtabs.CustomTabsServiceConnection
                public final void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
                    customTabsClient.warmup(0L);
                    r1.unbindService(this);
                }

                @Override // android.content.ServiceConnection
                public void onServiceDisconnected(ComponentName componentName) {
                }
            });
        } catch (SecurityException unused) {
            return false;
        }
    }

    private oz0 createAuthTabCallbackWrapper(AuthTabCallback authTabCallback, Executor executor) {
        return new AnonymousClass2(executor, authTabCallback);
    }

    private rz0 createCallbackWrapper(CustomTabsCallback customTabsCallback) {
        return new rz0() { // from class: androidx.browser.customtabs.CustomTabsClient.3
            private Handler mHandler = new Handler(Looper.getMainLooper());
            final /* synthetic */ CustomTabsCallback val$callback;

            /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
            /* renamed from: androidx.browser.customtabs.CustomTabsClient$3$1 */
            /* loaded from: classes.dex */
            public class AnonymousClass1 implements Runnable {
                final /* synthetic */ Bundle val$extras;
                final /* synthetic */ int val$navigationEvent;

                public AnonymousClass1(int i2, Bundle bundle2) {
                    r2 = i2;
                    r3 = bundle2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    r2.onNavigationEvent(r2, r3);
                }
            }

            /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
            /* renamed from: androidx.browser.customtabs.CustomTabsClient$3$10 */
            /* loaded from: classes.dex */
            public class AnonymousClass10 implements Runnable {
                final /* synthetic */ Bundle val$extras;

                public AnonymousClass10(Bundle bundle2) {
                    r2 = bundle2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    r2.onUnminimized(r2);
                }
            }

            /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
            /* renamed from: androidx.browser.customtabs.CustomTabsClient$3$2 */
            /* loaded from: classes.dex */
            public class AnonymousClass2 implements Runnable {
                final /* synthetic */ Bundle val$args;
                final /* synthetic */ String val$callbackName;

                public AnonymousClass2(String str2, Bundle bundle2) {
                    r2 = str2;
                    r3 = bundle2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    r2.extraCallback(r2, r3);
                }
            }

            /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
            /* renamed from: androidx.browser.customtabs.CustomTabsClient$3$3 */
            /* loaded from: classes.dex */
            public class RunnableC00003 implements Runnable {
                final /* synthetic */ Bundle val$extras;

                public RunnableC00003(Bundle bundle2) {
                    r2 = bundle2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    r2.onMessageChannelReady(r2);
                }
            }

            /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
            /* renamed from: androidx.browser.customtabs.CustomTabsClient$3$4 */
            /* loaded from: classes.dex */
            public class AnonymousClass4 implements Runnable {
                final /* synthetic */ Bundle val$extras;
                final /* synthetic */ String val$message;

                public AnonymousClass4(String str2, Bundle bundle2) {
                    r2 = str2;
                    r3 = bundle2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    r2.onPostMessage(r2, r3);
                }
            }

            /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
            /* renamed from: androidx.browser.customtabs.CustomTabsClient$3$5 */
            /* loaded from: classes.dex */
            public class AnonymousClass5 implements Runnable {
                final /* synthetic */ Bundle val$extras;
                final /* synthetic */ int val$relation;
                final /* synthetic */ Uri val$requestedOrigin;
                final /* synthetic */ boolean val$result;

                public AnonymousClass5(int i2, Uri uri2, boolean z2, Bundle bundle2) {
                    r2 = i2;
                    r3 = uri2;
                    r4 = z2;
                    r5 = bundle2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    r2.onRelationshipValidationResult(r2, r3, r4, r5);
                }
            }

            /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
            /* renamed from: androidx.browser.customtabs.CustomTabsClient$3$6 */
            /* loaded from: classes.dex */
            public class AnonymousClass6 implements Runnable {
                final /* synthetic */ Bundle val$extras;
                final /* synthetic */ int val$height;
                final /* synthetic */ int val$width;

                public AnonymousClass6(int i3, int i22, Bundle bundle2) {
                    r2 = i3;
                    r3 = i22;
                    r4 = bundle2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    r2.onActivityResized(r2, r3, r4);
                }
            }

            /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
            /* renamed from: androidx.browser.customtabs.CustomTabsClient$3$7 */
            /* loaded from: classes.dex */
            public class AnonymousClass7 implements Runnable {
                final /* synthetic */ Bundle val$extras;

                public AnonymousClass7(Bundle bundle2) {
                    r2 = bundle2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    r2.onWarmupCompleted(r2);
                }
            }

            /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
            /* renamed from: androidx.browser.customtabs.CustomTabsClient$3$8 */
            /* loaded from: classes.dex */
            public class AnonymousClass8 implements Runnable {
                final /* synthetic */ int val$bottom;
                final /* synthetic */ Bundle val$extras;
                final /* synthetic */ int val$left;
                final /* synthetic */ int val$right;
                final /* synthetic */ int val$state;
                final /* synthetic */ int val$top;

                public AnonymousClass8(int i6, int i22, int i32, int i42, int i52, Bundle bundle2) {
                    r2 = i6;
                    r3 = i22;
                    r4 = i32;
                    r5 = i42;
                    r6 = i52;
                    r7 = bundle2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    r2.onActivityLayout(r2, r3, r4, r5, r6, r7);
                }
            }

            /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
            /* renamed from: androidx.browser.customtabs.CustomTabsClient$3$9 */
            /* loaded from: classes.dex */
            public class AnonymousClass9 implements Runnable {
                final /* synthetic */ Bundle val$extras;

                public AnonymousClass9(Bundle bundle2) {
                    r2 = bundle2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    r2.onMinimized(r2);
                }
            }

            public AnonymousClass3(CustomTabsCallback customTabsCallback2) {
                r2 = customTabsCallback2;
            }

            @Override // defpackage.sz0
            public void extraCallback(String str2, Bundle bundle2) throws RemoteException {
                if (r2 == null) {
                    return;
                }
                this.mHandler.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.3.2
                    final /* synthetic */ Bundle val$args;
                    final /* synthetic */ String val$callbackName;

                    public AnonymousClass2(String str22, Bundle bundle22) {
                        r2 = str22;
                        r3 = bundle22;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        r2.extraCallback(r2, r3);
                    }
                });
            }

            @Override // defpackage.sz0
            public Bundle extraCallbackWithResult(String str, Bundle bundle) throws RemoteException {
                CustomTabsCallback customTabsCallback2 = r2;
                if (customTabsCallback2 == null) {
                    return null;
                }
                return customTabsCallback2.extraCallbackWithResult(str, bundle);
            }

            @Override // defpackage.sz0
            public int getInterfaceVersion() {
                return 1;
            }

            @Override // defpackage.sz0
            public void onActivityLayout(int i6, int i22, int i32, int i42, int i52, Bundle bundle2) throws RemoteException {
                if (r2 == null) {
                    return;
                }
                this.mHandler.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.3.8
                    final /* synthetic */ int val$bottom;
                    final /* synthetic */ Bundle val$extras;
                    final /* synthetic */ int val$left;
                    final /* synthetic */ int val$right;
                    final /* synthetic */ int val$state;
                    final /* synthetic */ int val$top;

                    public AnonymousClass8(int i62, int i222, int i322, int i422, int i522, Bundle bundle22) {
                        r2 = i62;
                        r3 = i222;
                        r4 = i322;
                        r5 = i422;
                        r6 = i522;
                        r7 = bundle22;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        r2.onActivityLayout(r2, r3, r4, r5, r6, r7);
                    }
                });
            }

            @Override // defpackage.sz0
            public void onActivityResized(int i3, int i22, Bundle bundle2) throws RemoteException {
                if (r2 == null) {
                    return;
                }
                this.mHandler.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.3.6
                    final /* synthetic */ Bundle val$extras;
                    final /* synthetic */ int val$height;
                    final /* synthetic */ int val$width;

                    public AnonymousClass6(int i32, int i222, Bundle bundle22) {
                        r2 = i32;
                        r3 = i222;
                        r4 = bundle22;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        r2.onActivityResized(r2, r3, r4);
                    }
                });
            }

            @Override // defpackage.sz0
            public void onMessageChannelReady(Bundle bundle2) throws RemoteException {
                if (r2 == null) {
                    return;
                }
                this.mHandler.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.3.3
                    final /* synthetic */ Bundle val$extras;

                    public RunnableC00003(Bundle bundle22) {
                        r2 = bundle22;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        r2.onMessageChannelReady(r2);
                    }
                });
            }

            @Override // defpackage.sz0
            public void onMinimized(Bundle bundle2) throws RemoteException {
                if (r2 == null) {
                    return;
                }
                this.mHandler.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.3.9
                    final /* synthetic */ Bundle val$extras;

                    public AnonymousClass9(Bundle bundle22) {
                        r2 = bundle22;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        r2.onMinimized(r2);
                    }
                });
            }

            @Override // defpackage.sz0
            public void onNavigationEvent(int i2, Bundle bundle2) {
                if (r2 == null) {
                    return;
                }
                this.mHandler.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.3.1
                    final /* synthetic */ Bundle val$extras;
                    final /* synthetic */ int val$navigationEvent;

                    public AnonymousClass1(int i22, Bundle bundle22) {
                        r2 = i22;
                        r3 = bundle22;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        r2.onNavigationEvent(r2, r3);
                    }
                });
            }

            @Override // defpackage.sz0
            public void onPostMessage(String str2, Bundle bundle2) throws RemoteException {
                if (r2 == null) {
                    return;
                }
                this.mHandler.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.3.4
                    final /* synthetic */ Bundle val$extras;
                    final /* synthetic */ String val$message;

                    public AnonymousClass4(String str22, Bundle bundle22) {
                        r2 = str22;
                        r3 = bundle22;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        r2.onPostMessage(r2, r3);
                    }
                });
            }

            @Override // defpackage.sz0
            public void onRelationshipValidationResult(int i2, Uri uri2, boolean z2, Bundle bundle2) throws RemoteException {
                if (r2 == null) {
                    return;
                }
                this.mHandler.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.3.5
                    final /* synthetic */ Bundle val$extras;
                    final /* synthetic */ int val$relation;
                    final /* synthetic */ Uri val$requestedOrigin;
                    final /* synthetic */ boolean val$result;

                    public AnonymousClass5(int i22, Uri uri22, boolean z22, Bundle bundle22) {
                        r2 = i22;
                        r3 = uri22;
                        r4 = z22;
                        r5 = bundle22;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        r2.onRelationshipValidationResult(r2, r3, r4, r5);
                    }
                });
            }

            @Override // defpackage.sz0
            public void onUnminimized(Bundle bundle2) throws RemoteException {
                if (r2 == null) {
                    return;
                }
                this.mHandler.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.3.10
                    final /* synthetic */ Bundle val$extras;

                    public AnonymousClass10(Bundle bundle22) {
                        r2 = bundle22;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        r2.onUnminimized(r2);
                    }
                });
            }

            @Override // defpackage.sz0
            public void onWarmupCompleted(Bundle bundle2) throws RemoteException {
                if (r2 == null) {
                    return;
                }
                this.mHandler.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.3.7
                    final /* synthetic */ Bundle val$extras;

                    public AnonymousClass7(Bundle bundle22) {
                        r2 = bundle22;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        r2.onWarmupCompleted(r2);
                    }
                });
            }
        };
    }

    public static AuthTabSession.PendingSession createPendingAuthTabSession(Context context, int i) {
        return new AuthTabSession.PendingSession(createSessionId(context, i), null, null);
    }

    public static AuthTabSession.PendingSession createPendingAuthTabSession(Context context, int i, Executor executor, AuthTabCallback authTabCallback) {
        return new AuthTabSession.PendingSession(createSessionId(context, i), executor, authTabCallback);
    }

    private static PendingIntent createSessionId(Context context, int i) {
        return PendingIntent.getActivity(context, i, new Intent(), 67108864);
    }

    public static String getPackageName(Context context, List<String> list) {
        return getPackageName(context, list, false);
    }

    public static String getPackageName(Context context, List<String> list, boolean z) {
        ResolveInfo resolveActivity;
        PackageManager packageManager = context.getPackageManager();
        List<String> arrayList = list == null ? new ArrayList<>() : list;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://"));
        if (!z && (resolveActivity = packageManager.resolveActivity(intent, 0)) != null) {
            String str = resolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            if (list != null) {
                arrayList2.addAll(list);
            }
            arrayList = arrayList2;
        }
        Intent intent2 = new Intent(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION);
        for (String str2 : arrayList) {
            intent2.setPackage(str2);
            if (packageManager.resolveService(intent2, 0) != null) {
                return str2;
            }
        }
        if (Build.VERSION.SDK_INT < 30) {
            return null;
        }
        Log.w(TAG, "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
        return null;
    }

    public static boolean isAuthTabSupported(Context context, String str) {
        return packageHasCategory(context, str, CustomTabsService.CATEGORY_AUTH_TAB);
    }

    public static boolean isEphemeralBrowsingSupported(Context context, String str) {
        return packageHasCategory(context, str, CustomTabsService.CATEGORY_EPHEMERAL_BROWSING);
    }

    public static boolean isSetNetworkSupported(Context context, String str) {
        return packageHasCategory(context, str, CustomTabsService.CATEGORY_SET_NETWORK);
    }

    private AuthTabSession newAuthTabSessionInternal(AuthTabCallback authTabCallback, Executor executor, PendingIntent pendingIntent) {
        oz0 createAuthTabCallbackWrapper = createAuthTabCallbackWrapper(authTabCallback, executor);
        try {
            Bundle bundle = new Bundle();
            bundle.putParcelable(CustomTabsIntent.EXTRA_SESSION_ID, pendingIntent);
            if (this.mService.newAuthTabSession(createAuthTabCallbackWrapper, bundle)) {
                return new AuthTabSession(createAuthTabCallbackWrapper, this.mServiceComponentName, pendingIntent);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    public static CustomTabsSession.PendingSession newPendingSession(Context context, CustomTabsCallback customTabsCallback, int i) {
        return new CustomTabsSession.PendingSession(customTabsCallback, createSessionId(context, i));
    }

    private CustomTabsSession newSessionInternal(CustomTabsCallback customTabsCallback, PendingIntent pendingIntent) {
        boolean newSession;
        rz0 createCallbackWrapper = createCallbackWrapper(customTabsCallback);
        try {
            if (pendingIntent != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable(CustomTabsIntent.EXTRA_SESSION_ID, pendingIntent);
                newSession = this.mService.newSessionWithExtras(createCallbackWrapper, bundle);
            } else {
                newSession = this.mService.newSession(createCallbackWrapper);
            }
            if (newSession) {
                return new CustomTabsSession(this.mService, createCallbackWrapper, this.mServiceComponentName, pendingIntent);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    private static boolean packageHasCategory(Context context, String str, String str2) {
        IntentFilter intentFilter;
        for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentServices(new Intent(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION), 64)) {
            ServiceInfo serviceInfo = resolveInfo.serviceInfo;
            if (serviceInfo != null && str.equals(serviceInfo.packageName) && (intentFilter = resolveInfo.filter) != null && intentFilter.hasCategory(str2)) {
                return true;
            }
        }
        return false;
    }

    public AuthTabSession attachAuthTabSession(AuthTabSession.PendingSession pendingSession) {
        return newAuthTabSessionInternal(pendingSession.getCallback(), pendingSession.getExecutor(), pendingSession.getId());
    }

    public CustomTabsSession attachSession(CustomTabsSession.PendingSession pendingSession) {
        return newSessionInternal(pendingSession.getCallback(), pendingSession.getId());
    }

    public Bundle extraCommand(String str, Bundle bundle) {
        try {
            return this.mService.extraCommand(str, bundle);
        } catch (RemoteException unused) {
            return null;
        }
    }

    public AuthTabSession newAuthTabSession(AuthTabCallback authTabCallback, Executor executor) {
        return newAuthTabSessionInternal(authTabCallback, executor, null);
    }

    public AuthTabSession newAuthTabSession(AuthTabCallback authTabCallback, Executor executor, int i) {
        return newAuthTabSessionInternal(authTabCallback, executor, createSessionId(this.mApplicationContext, i));
    }

    public CustomTabsSession newSession(CustomTabsCallback customTabsCallback) {
        return newSessionInternal(customTabsCallback, null);
    }

    public CustomTabsSession newSession(CustomTabsCallback customTabsCallback, int i) {
        return newSessionInternal(customTabsCallback, createSessionId(this.mApplicationContext, i));
    }

    public boolean warmup(long j) {
        try {
            return this.mService.warmup(j);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
