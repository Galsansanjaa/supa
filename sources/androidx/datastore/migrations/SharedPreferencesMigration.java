package androidx.datastore.migrations;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.datastore.core.DataMigration;
import defpackage.a10;
import defpackage.bb1;
import defpackage.hu2;
import defpackage.kw;
import defpackage.lb0;
import defpackage.nb1;
import defpackage.os0;
import defpackage.sb0;
import defpackage.ta3;
import defpackage.tn2;
import defpackage.ts0;
import defpackage.us0;
import defpackage.vy2;
import defpackage.wa2;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class SharedPreferencesMigration<T> implements DataMigration<T> {
    private final Context context;
    private final Set<String> keySet;
    private final us0 migrate;
    private final String name;
    private final nb1 sharedPrefs$delegate;
    private final ts0 shouldRunMigration;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    @lb0(c = "androidx.datastore.migrations.SharedPreferencesMigration$1", f = "SharedPreferencesMigration.android.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.datastore.migrations.SharedPreferencesMigration$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends tn2 implements ts0 {
        int label;

        public AnonymousClass1(a10 a10Var) {
            super(2, a10Var);
        }

        @Override // defpackage.cm
        public final a10 create(Object obj, a10 a10Var) {
            return new AnonymousClass1(a10Var);
        }

        public final Object invoke(T t, a10 a10Var) {
            return ((AnonymousClass1) create(t, a10Var)).invokeSuspend(vy2.a);
        }

        @Override // defpackage.ts0
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke((AnonymousClass1) obj, (a10) obj2);
        }

        @Override // defpackage.cm
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                ta3.H(obj);
                return Boolean.TRUE;
            }
            hu2.h("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    @lb0(c = "androidx.datastore.migrations.SharedPreferencesMigration$2", f = "SharedPreferencesMigration.android.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.datastore.migrations.SharedPreferencesMigration$2, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass2 extends tn2 implements ts0 {
        int label;

        public AnonymousClass2(a10 a10Var) {
            super(2, a10Var);
        }

        @Override // defpackage.cm
        public final a10 create(Object obj, a10 a10Var) {
            return new AnonymousClass2(a10Var);
        }

        public final Object invoke(T t, a10 a10Var) {
            return ((AnonymousClass2) create(t, a10Var)).invokeSuspend(vy2.a);
        }

        @Override // defpackage.ts0
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke((AnonymousClass2) obj, (a10) obj2);
        }

        @Override // defpackage.cm
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                ta3.H(obj);
                return Boolean.TRUE;
            }
            hu2.h("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    @lb0(c = "androidx.datastore.migrations.SharedPreferencesMigration$3", f = "SharedPreferencesMigration.android.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.datastore.migrations.SharedPreferencesMigration$3, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass3 extends tn2 implements ts0 {
        int label;

        public AnonymousClass3(a10 a10Var) {
            super(2, a10Var);
        }

        @Override // defpackage.cm
        public final a10 create(Object obj, a10 a10Var) {
            return new AnonymousClass3(a10Var);
        }

        public final Object invoke(T t, a10 a10Var) {
            return ((AnonymousClass3) create(t, a10Var)).invokeSuspend(vy2.a);
        }

        @Override // defpackage.ts0
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke((AnonymousClass3) obj, (a10) obj2);
        }

        @Override // defpackage.cm
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                ta3.H(obj);
                return Boolean.TRUE;
            }
            hu2.h("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* renamed from: androidx.datastore.migrations.SharedPreferencesMigration$4, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass4 extends bb1 implements os0 {
        final /* synthetic */ Context $context;
        final /* synthetic */ String $sharedPreferencesName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(Context context, String str) {
            super(0);
            this.$context = context;
            this.$sharedPreferencesName = str;
        }

        @Override // defpackage.os0
        public final SharedPreferences invoke() {
            SharedPreferences sharedPreferences = this.$context.getSharedPreferences(this.$sharedPreferencesName, 0);
            sharedPreferences.getClass();
            return sharedPreferences;
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Api24Impl {
        public static final Api24Impl INSTANCE = new Api24Impl();

        private Api24Impl() {
        }

        public static final boolean deleteSharedPreferences(Context context, String str) {
            context.getClass();
            str.getClass();
            return context.deleteSharedPreferences(str);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigration(Context context, String str, Set<String> set, ts0 ts0Var, us0 us0Var) {
        this(new AnonymousClass4(context, str), set, ts0Var, us0Var, context, str);
        context.getClass();
        str.getClass();
        set.getClass();
        ts0Var.getClass();
        us0Var.getClass();
    }

    public /* synthetic */ SharedPreferencesMigration(Context context, String str, Set set, ts0 ts0Var, us0 us0Var, int i, sb0 sb0Var) {
        this(context, str, (i & 4) != 0 ? SharedPreferencesMigration_androidKt.getMIGRATE_ALL_KEYS() : set, (i & 8) != 0 ? new AnonymousClass3(null) : ts0Var, us0Var);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigration(Context context, String str, Set<String> set, us0 us0Var) {
        this(context, str, set, null, us0Var, 8, null);
        context.getClass();
        str.getClass();
        set.getClass();
        us0Var.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigration(Context context, String str, us0 us0Var) {
        this(context, str, null, null, us0Var, 12, null);
        context.getClass();
        str.getClass();
        us0Var.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigration(os0 os0Var, Set<String> set, ts0 ts0Var, us0 us0Var) {
        this(os0Var, set, ts0Var, us0Var, (Context) null, (String) null);
        os0Var.getClass();
        set.getClass();
        ts0Var.getClass();
        us0Var.getClass();
    }

    public /* synthetic */ SharedPreferencesMigration(os0 os0Var, Set set, ts0 ts0Var, us0 us0Var, int i, sb0 sb0Var) {
        this(os0Var, (Set<String>) ((i & 2) != 0 ? SharedPreferencesMigration_androidKt.getMIGRATE_ALL_KEYS() : set), (i & 4) != 0 ? new AnonymousClass2(null) : ts0Var, us0Var);
    }

    private SharedPreferencesMigration(os0 os0Var, Set<String> set, ts0 ts0Var, us0 us0Var, Context context, String str) {
        this.shouldRunMigration = ts0Var;
        this.migrate = us0Var;
        this.context = context;
        this.name = str;
        this.sharedPrefs$delegate = ta3.x(os0Var);
        this.keySet = set == SharedPreferencesMigration_androidKt.getMIGRATE_ALL_KEYS() ? null : kw.O0(set);
    }

    public /* synthetic */ SharedPreferencesMigration(os0 os0Var, Set set, ts0 ts0Var, us0 us0Var, Context context, String str, int i, sb0 sb0Var) {
        this(os0Var, (Set<String>) set, (i & 4) != 0 ? new AnonymousClass1(null) : ts0Var, us0Var, context, str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigration(os0 os0Var, Set<String> set, us0 us0Var) {
        this(os0Var, set, (ts0) null, us0Var, 4, (sb0) null);
        os0Var.getClass();
        set.getClass();
        us0Var.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigration(os0 os0Var, us0 us0Var) {
        this(os0Var, (Set) null, (ts0) null, us0Var, 6, (sb0) null);
        os0Var.getClass();
        us0Var.getClass();
    }

    private final void deleteSharedPreferences(Context context, String str) {
        if (Build.VERSION.SDK_INT >= 24) {
            Api24Impl.deleteSharedPreferences(context, str);
            return;
        }
        File sharedPrefsFile = getSharedPrefsFile(context, str);
        File sharedPrefsBackup = getSharedPrefsBackup(sharedPrefsFile);
        sharedPrefsFile.delete();
        sharedPrefsBackup.delete();
    }

    private final SharedPreferences getSharedPrefs() {
        return (SharedPreferences) this.sharedPrefs$delegate.getValue();
    }

    private final File getSharedPrefsBackup(File file) {
        return new File(file.getPath() + ".bak");
    }

    private final File getSharedPrefsFile(Context context, String str) {
        return new File(new File(context.getApplicationInfo().dataDir, "shared_prefs"), wa2.q(str, ".xml"));
    }

    @Override // androidx.datastore.core.DataMigration
    public Object cleanUp(a10 a10Var) throws IOException {
        Context context;
        String str;
        SharedPreferences.Editor edit = getSharedPrefs().edit();
        Set<String> set = this.keySet;
        if (set == null) {
            edit.clear();
        } else {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                edit.remove((String) it.next());
            }
        }
        if (!edit.commit()) {
            hu2.p("Unable to delete migrated keys from SharedPreferences.");
            return null;
        }
        if (getSharedPrefs().getAll().isEmpty() && (context = this.context) != null && (str = this.name) != null) {
            deleteSharedPreferences(context, str);
        }
        Set<String> set2 = this.keySet;
        if (set2 != null) {
            set2.clear();
        }
        return vy2.a;
    }

    @Override // androidx.datastore.core.DataMigration
    public Object migrate(T t, a10 a10Var) {
        return this.migrate.invoke(new SharedPreferencesView(getSharedPrefs(), this.keySet), t, a10Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
    
        if (r4.isEmpty() == false) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // androidx.datastore.core.DataMigration
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object shouldMigrate(T r5, defpackage.a10 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.datastore.migrations.SharedPreferencesMigration$shouldMigrate$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.datastore.migrations.SharedPreferencesMigration$shouldMigrate$1 r0 = (androidx.datastore.migrations.SharedPreferencesMigration$shouldMigrate$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.migrations.SharedPreferencesMigration$shouldMigrate$1 r0 = new androidx.datastore.migrations.SharedPreferencesMigration$shouldMigrate$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            java.lang.Object r4 = r0.L$0
            androidx.datastore.migrations.SharedPreferencesMigration r4 = (androidx.datastore.migrations.SharedPreferencesMigration) r4
            defpackage.ta3.H(r6)
            goto L42
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.hu2.h(r4)
            r4 = 0
            return r4
        L30:
            defpackage.ta3.H(r6)
            ts0 r6 = r4.shouldRunMigration
            r0.L$0 = r4
            r0.label = r2
            java.lang.Object r6 = r6.invoke(r5, r0)
            e50 r5 = defpackage.e50.a
            if (r6 != r5) goto L42
            return r5
        L42:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r5 = r6.booleanValue()
            if (r5 != 0) goto L4d
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L4d:
            java.util.Set<java.lang.String> r5 = r4.keySet
            r6 = 0
            if (r5 != 0) goto L66
            android.content.SharedPreferences r4 = r4.getSharedPrefs()
            java.util.Map r4 = r4.getAll()
            r4.getClass()
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L64
            goto L90
        L64:
            r2 = r6
            goto L90
        L66:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            android.content.SharedPreferences r4 = r4.getSharedPrefs()
            boolean r0 = r5 instanceof java.util.Collection
            if (r0 == 0) goto L7a
            r0 = r5
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L7a
            goto L64
        L7a:
            java.util.Iterator r5 = r5.iterator()
        L7e:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L64
            java.lang.Object r0 = r5.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r4.contains(r0)
            if (r0 == 0) goto L7e
        L90:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.migrations.SharedPreferencesMigration.shouldMigrate(java.lang.Object, a10):java.lang.Object");
    }
}
