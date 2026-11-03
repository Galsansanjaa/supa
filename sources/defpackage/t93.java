package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class t93 {
    public volatile boolean a;

    public static boolean a(File file) {
        try {
            Enumeration<? extends ZipEntry> entries = new ZipFile(file).entries();
            while (entries.hasMoreElements()) {
                String name = entries.nextElement().getName();
                name.getClass();
                if (bn2.b0(name, ".obb", false)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void b(File file, ArrayList arrayList) {
        File[] listFiles = file.listFiles();
        if (listFiles != null && listFiles.length != 0) {
            int i = 0;
            while (true) {
                if (!(i < listFiles.length)) {
                    break;
                }
                int i2 = i + 1;
                try {
                    listFiles[i].delete();
                    i = i2;
                } catch (ArrayIndexOutOfBoundsException e) {
                    hu2.n(e.getMessage());
                    return;
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            ((File) next).delete();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(java.io.File r4) {
        /*
            r0 = 0
            java.util.zip.ZipFile r1 = new java.util.zip.ZipFile     // Catch: java.lang.Exception -> L2b
            r1.<init>(r4)     // Catch: java.lang.Exception -> L2b
            java.util.Enumeration r4 = r1.entries()     // Catch: java.lang.Exception -> L2b
            r1 = r0
        Lb:
            boolean r2 = r4.hasMoreElements()     // Catch: java.lang.Exception -> L29
            if (r2 == 0) goto L30
            java.lang.Object r2 = r4.nextElement()     // Catch: java.lang.Exception -> L29
            java.util.zip.ZipEntry r2 = (java.util.zip.ZipEntry) r2     // Catch: java.lang.Exception -> L29
            java.lang.String r2 = r2.getName()     // Catch: java.lang.Exception -> L29
            r2.getClass()     // Catch: java.lang.Exception -> L29
            java.lang.String r3 = ".apk"
            boolean r2 = defpackage.bn2.b0(r2, r3, r0)     // Catch: java.lang.Exception -> L29
            if (r2 == 0) goto Lb
            int r1 = r1 + 1
            goto Lb
        L29:
            r4 = move-exception
            goto L2d
        L2b:
            r4 = move-exception
            r1 = r0
        L2d:
            r4.printStackTrace()
        L30:
            if (r1 <= 0) goto L33
            r0 = 1
        L33:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t93.c(java.io.File):boolean");
    }

    public static boolean d(File file, File file2) {
        try {
            ZipFile zipFile = new ZipFile(file);
            Enumeration<? extends ZipEntry> entries = zipFile.entries();
            while (entries.hasMoreElements()) {
                ZipEntry nextElement = entries.nextElement();
                String name = nextElement.getName();
                name.getClass();
                if (bn2.b0(name, ".apk", false)) {
                    if (nextElement.getSize() >= file2.getUsableSpace()) {
                        return false;
                    }
                    File file3 = new File(file2, name);
                    InputStream inputStream = zipFile.getInputStream(nextElement);
                    inputStream.getClass();
                    FileOutputStream fileOutputStream = new FileOutputStream(file3);
                    try {
                        try {
                            byte[] bArr = new byte[8192];
                            while (true) {
                                int read = inputStream.read(bArr);
                                if (read == -1) {
                                    break;
                                }
                                fileOutputStream.write(bArr, 0, read);
                            }
                        } finally {
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }
}
