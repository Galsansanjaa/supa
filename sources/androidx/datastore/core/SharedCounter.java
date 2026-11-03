package androidx.datastore.core;

import android.os.ParcelFileDescriptor;
import defpackage.hu2;
import defpackage.os0;
import defpackage.sb0;
import java.io.File;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class SharedCounter {
    public static final Factory Factory = new Factory(null);
    private static final NativeSharedCounter nativeSharedCounter = new NativeSharedCounter();
    private final long mappedAddress;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Factory {
        private Factory() {
        }

        public /* synthetic */ Factory(sb0 sb0Var) {
            this();
        }

        private final SharedCounter createCounterFromFd(ParcelFileDescriptor parcelFileDescriptor) {
            int fd = parcelFileDescriptor.getFd();
            if (getNativeSharedCounter$datastore_core_release().nativeTruncateFile(fd) != 0) {
                hu2.p("Failed to truncate counter file");
                return null;
            }
            long nativeCreateSharedCounter = getNativeSharedCounter$datastore_core_release().nativeCreateSharedCounter(fd);
            if (nativeCreateSharedCounter >= 0) {
                return new SharedCounter(nativeCreateSharedCounter, null);
            }
            hu2.p("Failed to mmap counter file");
            return null;
        }

        public final SharedCounter create$datastore_core_release(os0 os0Var) {
            ParcelFileDescriptor parcelFileDescriptor;
            os0Var.getClass();
            try {
                parcelFileDescriptor = ParcelFileDescriptor.open((File) os0Var.invoke(), 939524096);
                try {
                    SharedCounter createCounterFromFd = createCounterFromFd(parcelFileDescriptor);
                    if (parcelFileDescriptor != null) {
                        parcelFileDescriptor.close();
                    }
                    return createCounterFromFd;
                } catch (Throwable th) {
                    th = th;
                    if (parcelFileDescriptor != null) {
                        parcelFileDescriptor.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                parcelFileDescriptor = null;
            }
        }

        public final NativeSharedCounter getNativeSharedCounter$datastore_core_release() {
            return SharedCounter.nativeSharedCounter;
        }

        public final void loadLib() {
            System.loadLibrary("datastore_shared_counter");
        }
    }

    private SharedCounter(long j) {
        this.mappedAddress = j;
    }

    public /* synthetic */ SharedCounter(long j, sb0 sb0Var) {
        this(j);
    }

    public final int getValue() {
        return nativeSharedCounter.nativeGetCounterValue(this.mappedAddress);
    }

    public final int incrementAndGetValue() {
        return nativeSharedCounter.nativeIncrementAndGetCounterValue(this.mappedAddress);
    }
}
