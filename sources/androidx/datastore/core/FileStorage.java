package androidx.datastore.core;

import defpackage.bb1;
import defpackage.os0;
import defpackage.ps0;
import defpackage.sb0;
import java.io.File;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class FileStorage<T> implements Storage<T> {
    public static final Companion Companion = new Companion(null);
    private static final Set<String> activeFiles = new LinkedHashSet();
    private static final Object activeFilesLock = new Object();
    private final ps0 coordinatorProducer;
    private final os0 produceFile;
    private final Serializer<T> serializer;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* renamed from: androidx.datastore.core.FileStorage$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends bb1 implements ps0 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // defpackage.ps0
        public final InterProcessCoordinator invoke(File file) {
            file.getClass();
            return InterProcessCoordinator_jvmKt.createSingleProcessCoordinator(file);
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        public final Set<String> getActiveFiles$datastore_core_release() {
            return FileStorage.activeFiles;
        }

        public final Object getActiveFilesLock$datastore_core_release() {
            return FileStorage.activeFilesLock;
        }
    }

    public FileStorage(Serializer<T> serializer, ps0 ps0Var, os0 os0Var) {
        serializer.getClass();
        ps0Var.getClass();
        os0Var.getClass();
        this.serializer = serializer;
        this.coordinatorProducer = ps0Var;
        this.produceFile = os0Var;
    }

    public /* synthetic */ FileStorage(Serializer serializer, ps0 ps0Var, os0 os0Var, int i, sb0 sb0Var) {
        this(serializer, (i & 2) != 0 ? AnonymousClass1.INSTANCE : ps0Var, os0Var);
    }

    @Override // androidx.datastore.core.Storage
    public StorageConnection<T> createConnection() {
        File canonicalFile = ((File) this.produceFile.invoke()).getCanonicalFile();
        synchronized (activeFilesLock) {
            String absolutePath = canonicalFile.getAbsolutePath();
            Set<String> set = activeFiles;
            if (set.contains(absolutePath)) {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
            absolutePath.getClass();
            set.add(absolutePath);
        }
        return new FileStorageConnection(canonicalFile, this.serializer, (InterProcessCoordinator) this.coordinatorProducer.invoke(canonicalFile), new FileStorage$createConnection$2(canonicalFile));
    }
}
