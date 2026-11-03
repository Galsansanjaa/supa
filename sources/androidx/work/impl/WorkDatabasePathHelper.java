package androidx.work.impl;

import android.content.Context;
import androidx.work.Logger;
import defpackage.fi1;
import java.io.File;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class WorkDatabasePathHelper {
    public static final WorkDatabasePathHelper INSTANCE = new WorkDatabasePathHelper();

    private WorkDatabasePathHelper() {
    }

    public static final void migrateDatabase(Context context) {
        String str;
        String str2;
        String str3;
        context.getClass();
        WorkDatabasePathHelper workDatabasePathHelper = INSTANCE;
        if (workDatabasePathHelper.getDefaultDatabasePath(context).exists()) {
            Logger logger = Logger.get();
            str = WorkDatabasePathHelperKt.TAG;
            logger.debug(str, "Migrating WorkDatabase to the no-backup directory");
            for (Map.Entry<File, File> entry : workDatabasePathHelper.migrationPaths(context).entrySet()) {
                File key = entry.getKey();
                File value = entry.getValue();
                if (key.exists()) {
                    if (value.exists()) {
                        Logger logger2 = Logger.get();
                        str3 = WorkDatabasePathHelperKt.TAG;
                        logger2.warning(str3, "Over-writing contents of " + value);
                    }
                    String str4 = key.renameTo(value) ? "Migrated " + key + "to " + value : "Renaming " + key + " to " + value + " failed";
                    Logger logger3 = Logger.get();
                    str2 = WorkDatabasePathHelperKt.TAG;
                    logger3.debug(str2, str4);
                }
            }
        }
    }

    public final File getDatabasePath(Context context) {
        context.getClass();
        File noBackupFilesDir = context.getNoBackupFilesDir();
        noBackupFilesDir.getClass();
        return noBackupFilesDir;
    }

    public final File getDefaultDatabasePath(Context context) {
        context.getClass();
        File databasePath = context.getDatabasePath(WorkDatabasePathHelperKt.WORK_DATABASE_NAME);
        databasePath.getClass();
        return databasePath;
    }

    public final Map<File, File> migrationPaths(Context context) {
        String[] strArr;
        context.getClass();
        File defaultDatabasePath = getDefaultDatabasePath(context);
        File databasePath = getDatabasePath(context);
        strArr = WorkDatabasePathHelperKt.DATABASE_EXTRA_FILES;
        int P = fi1.P(strArr.length);
        if (P < 16) {
            P = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(P);
        for (String str : strArr) {
            linkedHashMap.put(new File(defaultDatabasePath.getPath() + str), new File(databasePath.getPath() + str));
        }
        if (linkedHashMap.isEmpty()) {
            Map<File, File> singletonMap = Collections.singletonMap(defaultDatabasePath, databasePath);
            singletonMap.getClass();
            return singletonMap;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        linkedHashMap2.put(defaultDatabasePath, databasePath);
        return linkedHashMap2;
    }
}
