package defpackage;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class to extends ThreadLocal {
    public final /* synthetic */ int a;

    public /* synthetic */ to(int i) {
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [do3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, jd4] */
    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.a) {
            case 0:
                return new StringBuilder("Picasso-");
            case 1:
                return new Random();
            case 2:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(f63.e);
                return simpleDateFormat;
            case 3:
                return Boolean.FALSE;
            case 4:
                ?? obj = new Object();
                obj.a = 0;
                return obj;
            case 5:
                return 0L;
            case 6:
                jh2.h0(Thread.currentThread());
                ?? obj2 = new Object();
                obj2.a = false;
                obj2.b = null;
                Thread currentThread = Thread.currentThread();
                WeakHashMap weakHashMap = wc4.c;
                synchronized (weakHashMap) {
                    weakHashMap.put(currentThread, obj2);
                }
                return obj2;
            default:
                return new Random();
        }
    }
}
