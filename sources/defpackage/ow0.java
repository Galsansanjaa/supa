package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.system.Os;
import android.system.StructStatVfs;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import androidx.documentfile.provider.DocumentFile;
import com.uptodown.R;
import java.io.File;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class ow0 {
    public static String a;
    public static int b;
    public static Boolean c;

    public static File a(Context context) {
        File externalStorageDirectory;
        context.getClass();
        r10 r10Var = new r10(context);
        if (r10Var.d()) {
            File[] externalFilesDirs = context.getExternalFilesDirs(null);
            if (externalFilesDirs.length > 1) {
                externalStorageDirectory = externalFilesDirs[1];
            } else {
                File externalStorageDirectory2 = Environment.getExternalStorageDirectory();
                r10Var.g();
                r10Var.f();
                externalStorageDirectory = externalStorageDirectory2;
            }
        } else {
            externalStorageDirectory = Environment.getExternalStorageDirectory();
        }
        if (externalStorageDirectory == null) {
            return context.getExternalFilesDir(null);
        }
        File file = new File(externalStorageDirectory.getAbsolutePath() + DomExceptionUtils.SEPARATOR + context.getResources().getString(R.string.app_name) + "/Backups");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0070, code lost:
    
        if (r2 == null) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String b() {
        /*
            java.lang.String r0 = defpackage.ow0.a
            if (r0 != 0) goto L76
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L11
            java.lang.String r0 = android.app.Application.getProcessName()
            defpackage.ow0.a = r0
            return r0
        L11:
            int r0 = defpackage.ow0.b
            if (r0 != 0) goto L1b
            int r0 = android.os.Process.myPid()
            defpackage.ow0.b = r0
        L1b:
            java.lang.String r1 = "/cmdline"
            java.lang.String r2 = "/proc/"
            r3 = 0
            if (r0 > 0) goto L23
            goto L73
        L23:
            java.lang.String r4 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L62 java.io.IOException -> L6f
            int r4 = r4.length()     // Catch: java.lang.Throwable -> L62 java.io.IOException -> L6f
            int r4 = r4 + 14
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L62 java.io.IOException -> L6f
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L62 java.io.IOException -> L6f
            r5.append(r2)     // Catch: java.lang.Throwable -> L62 java.io.IOException -> L6f
            r5.append(r0)     // Catch: java.lang.Throwable -> L62 java.io.IOException -> L6f
            r5.append(r1)     // Catch: java.lang.Throwable -> L62 java.io.IOException -> L6f
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L62 java.io.IOException -> L6f
            android.os.StrictMode$ThreadPolicy r1 = android.os.StrictMode.allowThreadDiskReads()     // Catch: java.lang.Throwable -> L62 java.io.IOException -> L6f
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L64
            java.io.FileReader r4 = new java.io.FileReader     // Catch: java.lang.Throwable -> L64
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L64
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L64
            android.os.StrictMode.setThreadPolicy(r1)     // Catch: java.lang.Throwable -> L62 java.io.IOException -> L6f
            java.lang.String r0 = r2.readLine()     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L70
            defpackage.dn3.o(r0)     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L70
            java.lang.String r3 = r0.trim()     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L70
        L5b:
            r2.close()     // Catch: java.io.IOException -> L73
            goto L73
        L5f:
            r0 = move-exception
            r3 = r2
            goto L69
        L62:
            r0 = move-exception
            goto L69
        L64:
            r0 = move-exception
            android.os.StrictMode.setThreadPolicy(r1)     // Catch: java.lang.Throwable -> L62 java.io.IOException -> L6f
            throw r0     // Catch: java.lang.Throwable -> L62 java.io.IOException -> L6f
        L69:
            if (r3 == 0) goto L6e
            r3.close()     // Catch: java.io.IOException -> L6e
        L6e:
            throw r0
        L6f:
            r2 = r3
        L70:
            if (r2 == 0) goto L73
            goto L5b
        L73:
            defpackage.ow0.a = r3
            return r3
        L76:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ow0.b():java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String c(android.net.Uri r8, android.content.ContextWrapper r9) {
        /*
            r9.getClass()
            r1 = 0
            android.content.ContentResolver r2 = r9.getContentResolver()     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L48
            r6 = 0
            r7 = 0
            r4 = 0
            r5 = 0
            r3 = r8
            android.database.Cursor r8 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L27
            if (r8 == 0) goto L2a
            java.lang.String r9 = "_display_name"
            int r9 = r8.getColumnIndex(r9)     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L27
            r8.moveToFirst()     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L27
            java.lang.String r1 = r8.getString(r9)     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L27
            r8.close()     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L27
            goto L2a
        L24:
            r0 = move-exception
        L25:
            r8 = r0
            goto L68
        L27:
            r0 = move-exception
        L28:
            r8 = r0
            goto L4b
        L2a:
            if (r1 != 0) goto L44
            java.lang.String r8 = r3.getPath()
            if (r8 == 0) goto L44
            java.lang.String r8 = r3.getPath()
            r8.getClass()
            boolean r8 = f(r8)
            if (r8 == 0) goto L44
            java.lang.String r8 = r3.getLastPathSegment()
            return r8
        L44:
            return r1
        L45:
            r0 = move-exception
            r3 = r8
            goto L25
        L48:
            r0 = move-exception
            r3 = r8
            goto L28
        L4b:
            r8.printStackTrace()     // Catch: java.lang.Throwable -> L24
            if (r1 != 0) goto L67
            java.lang.String r8 = r3.getPath()
            if (r8 == 0) goto L67
            java.lang.String r8 = r3.getPath()
            r8.getClass()
            boolean r8 = f(r8)
            if (r8 == 0) goto L67
            java.lang.String r1 = r3.getLastPathSegment()
        L67:
            return r1
        L68:
            if (r1 != 0) goto L80
            java.lang.String r9 = r3.getPath()
            if (r9 == 0) goto L80
            java.lang.String r9 = r3.getPath()
            r9.getClass()
            boolean r9 = f(r9)
            if (r9 == 0) goto L80
            r3.getLastPathSegment()
        L80:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ow0.c(android.net.Uri, android.content.ContextWrapper):java.lang.String");
    }

    public static long d(Context context, DocumentFile documentFile) {
        context.getClass();
        documentFile.getClass();
        Uri uri = documentFile.getUri();
        uri.getClass();
        long j = 0;
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r");
            if (openFileDescriptor == null) {
                return 0L;
            }
            StructStatVfs fstatvfs = Os.fstatvfs(openFileDescriptor.getFileDescriptor());
            j = fstatvfs.f_bsize * fstatvfs.f_bavail;
            openFileDescriptor.close();
            return j;
        } catch (Exception e) {
            e.printStackTrace();
            return j;
        }
    }

    public static long e(PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode;
    }

    public static boolean f(String str) {
        return bn2.b0(str, ".apk", true) || bn2.b0(str, ".xapk", true) || bn2.b0(str, ".apks", true) || bn2.b0(str, ".apkm", true) || bn2.b0(str, ".zip", true);
    }

    public static boolean g() {
        Boolean bool = c;
        if (bool == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                bool = Boolean.valueOf(Process.isIsolated());
            } else {
                try {
                    Object W = np3.W(Process.class, "isIsolated", new dq1[0]);
                    Object[] objArr = new Object[0];
                    if (W == null) {
                        throw new rx(ta3.L("expected a non-null reference", objArr), 9);
                    }
                    bool = (Boolean) W;
                } catch (ReflectiveOperationException unused) {
                    bool = Boolean.FALSE;
                }
            }
            c = bool;
        }
        return bool.booleanValue();
    }
}
