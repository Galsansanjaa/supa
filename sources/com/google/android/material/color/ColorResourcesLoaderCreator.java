package com.google.android.material.color;

import android.content.Context;
import android.content.res.loader.ResourcesLoader;
import android.content.res.loader.ResourcesProvider;
import android.os.ParcelFileDescriptor;
import android.system.Os;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.util.Map;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
final class ColorResourcesLoaderCreator {
    private static final String TAG = "ColorResLoaderCreator";

    private ColorResourcesLoaderCreator() {
    }

    public static ResourcesLoader create(Context context, Map<Integer, Integer> map) {
        FileDescriptor fileDescriptor;
        try {
            byte[] create = ColorResourcesTableCreator.create(context, map);
            Log.i(TAG, "Table created, length: " + create.length);
            if (create.length != 0) {
                try {
                    fileDescriptor = Os.memfd_create("temp.arsc", 0);
                    try {
                        if (fileDescriptor != null) {
                            FileOutputStream fileOutputStream = new FileOutputStream(fileDescriptor);
                            try {
                                fileOutputStream.write(create);
                                ParcelFileDescriptor dup = ParcelFileDescriptor.dup(fileDescriptor);
                                try {
                                    ResourcesLoader resourcesLoader = new ResourcesLoader();
                                    resourcesLoader.addProvider(ResourcesProvider.loadFromTable(dup, null));
                                    if (dup != null) {
                                        dup.close();
                                    }
                                    fileOutputStream.close();
                                    Os.close(fileDescriptor);
                                    return resourcesLoader;
                                } finally {
                                }
                            } catch (Throwable th) {
                                try {
                                    fileOutputStream.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        }
                        Log.w(TAG, "Cannot create memory file descriptor.");
                        if (fileDescriptor != null) {
                            Os.close(fileDescriptor);
                            return null;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (fileDescriptor != null) {
                            Os.close(fileDescriptor);
                        }
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    fileDescriptor = null;
                }
            }
            return null;
        } catch (Exception e) {
            Log.e(TAG, "Failed to create the ColorResourcesTableCreator.", e);
            return null;
        }
    }
}
