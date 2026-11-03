package androidx.sqlite.db;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import defpackage.hd0;
import java.io.File;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class SupportSQLiteCompat {

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    @hd0
    /* loaded from: classes4.dex */
    public static final class Api16Impl {
        public static final Api16Impl INSTANCE = new Api16Impl();

        private Api16Impl() {
        }

        public static final void cancel(CancellationSignal cancellationSignal) {
            cancellationSignal.getClass();
            cancellationSignal.cancel();
        }

        public static final CancellationSignal createCancellationSignal() {
            return new CancellationSignal();
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    @hd0
    /* loaded from: classes4.dex */
    public static final class Api19Impl {
        public static final Api19Impl INSTANCE = new Api19Impl();

        private Api19Impl() {
        }

        public static final Uri getNotificationUri(Cursor cursor) {
            cursor.getClass();
            Uri notificationUri = cursor.getNotificationUri();
            notificationUri.getClass();
            return notificationUri;
        }

        public static final boolean isLowRamDevice(ActivityManager activityManager) {
            activityManager.getClass();
            return activityManager.isLowRamDevice();
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes4.dex */
    public static final class Api21Impl {
        public static final Api21Impl INSTANCE = new Api21Impl();

        private Api21Impl() {
        }

        public static final File getNoBackupFilesDir(Context context) {
            context.getClass();
            File noBackupFilesDir = context.getNoBackupFilesDir();
            noBackupFilesDir.getClass();
            return noBackupFilesDir;
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes4.dex */
    public static final class Api23Impl {
        public static final Api23Impl INSTANCE = new Api23Impl();

        private Api23Impl() {
        }

        public static final void setExtras(Cursor cursor, Bundle bundle) {
            cursor.getClass();
            bundle.getClass();
            cursor.setExtras(bundle);
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes4.dex */
    public static final class Api29Impl {
        public static final Api29Impl INSTANCE = new Api29Impl();

        private Api29Impl() {
        }

        public static final List<Uri> getNotificationUris(Cursor cursor) {
            cursor.getClass();
            List<Uri> notificationUris = cursor.getNotificationUris();
            notificationUris.getClass();
            return notificationUris;
        }

        public static final void setNotificationUris(Cursor cursor, ContentResolver contentResolver, List<? extends Uri> list) {
            cursor.getClass();
            contentResolver.getClass();
            list.getClass();
            cursor.setNotificationUris(contentResolver, list);
        }
    }

    private SupportSQLiteCompat() {
    }
}
