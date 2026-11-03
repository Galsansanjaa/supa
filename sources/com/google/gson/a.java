package com.google.gson;

import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import defpackage.f00;
import defpackage.mv0;
import defpackage.np3;
import defpackage.q91;
import defpackage.rx;
import defpackage.sn0;
import defpackage.sr0;
import defpackage.sx2;
import defpackage.x91;
import defpackage.xh1;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class a {
    public final ThreadLocal a;
    public final ConcurrentHashMap b;
    public final f00 c;
    public final JsonAdapterAnnotationTypeAdapterFactory d;
    public final List e;
    public final sr0 f;
    public final List g;
    public final List h;
    public final List i;

    public a() {
        mv0 mv0Var = mv0.m;
        this.a = new ThreadLocal();
        this.b = new ConcurrentHashMap();
        Excluder excluder = mv0Var.a;
        new HashMap(mv0Var.b);
        this.f = mv0Var.e;
        this.g = mv0.a(mv0Var.c);
        this.h = mv0.a(mv0Var.d);
        this.i = mv0.a(mv0Var.f);
        this.c = mv0.k;
        this.d = mv0.l;
        this.e = mv0.n;
    }

    /* JADX WARN: Finally extract failed */
    public final Object a(String str, Type type) {
        Object obj;
        TypeToken typeToken = new TypeToken(type);
        q91 q91Var = new q91(new StringReader(str));
        q91Var.y = 2;
        boolean z = true;
        q91Var.y = 1;
        try {
            try {
                try {
                    try {
                        try {
                            q91Var.H();
                            z = false;
                            b b = b(typeToken);
                            Class cls = typeToken.a;
                            obj = b.b(q91Var);
                            Class O = np3.O(cls);
                            if (obj != null && !O.isInstance(obj)) {
                                throw new ClassCastException("Type adapter '" + b + "' returned wrong type; requested " + cls + " but got instance of " + obj.getClass() + "\nVerify that the adapter was registered for the correct type.");
                            }
                            q91Var.y = 2;
                        } catch (IOException e) {
                            throw new rx(e, 3);
                        }
                    } catch (IllegalStateException e2) {
                        throw new rx(e2, 3);
                    }
                } catch (AssertionError e3) {
                    throw new AssertionError("AssertionError (GSON 2.14.0): " + e3.getMessage(), e3);
                }
            } catch (EOFException e4) {
                if (!z) {
                    throw new rx(e4, 3);
                }
                q91Var.y = 2;
                obj = null;
            }
            if (obj != null) {
                try {
                    if (q91Var.H() != 10) {
                        throw new rx("JSON document was not fully consumed.", 3);
                    }
                } catch (xh1 e5) {
                    throw new rx(e5, 3);
                } catch (IOException e6) {
                    throw new rx(e6, 3);
                }
            }
            return obj;
        } catch (Throwable th) {
            q91Var.y = 2;
            throw th;
        }
    }

    public final b b(TypeToken typeToken) {
        boolean z;
        Objects.requireNonNull(typeToken, "type must not be null");
        ConcurrentHashMap concurrentHashMap = this.b;
        b bVar = (b) concurrentHashMap.get(typeToken);
        if (bVar != null) {
            return bVar;
        }
        ThreadLocal threadLocal = this.a;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z = true;
        } else {
            b bVar2 = (b) map.get(typeToken);
            if (bVar2 != null) {
                return bVar2;
            }
            z = false;
        }
        try {
            Gson$FutureTypeAdapter gson$FutureTypeAdapter = new Gson$FutureTypeAdapter();
            map.put(typeToken, gson$FutureTypeAdapter);
            Iterator it = this.e.iterator();
            b bVar3 = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                bVar3 = ((sx2) it.next()).a(this, typeToken);
                if (bVar3 != null) {
                    if (gson$FutureTypeAdapter.a != null) {
                        throw new AssertionError("Delegate is already set");
                    }
                    gson$FutureTypeAdapter.a = bVar3;
                    map.put(typeToken, bVar3);
                }
            }
            if (z) {
                threadLocal.remove();
            }
            if (bVar3 == null) {
                sn0.n(typeToken, "GSON (2.14.0) cannot handle ");
                return null;
            }
            if (z) {
                concurrentHashMap.putAll(map);
            }
            return bVar3;
        } catch (Throwable th) {
            if (z) {
                threadLocal.remove();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0056, code lost:
    
        if (r4 == r8) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0021, code lost:
    
        if (r4 == r8) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.gson.b c(defpackage.sx2 r8, com.google.gson.reflect.TypeToken r9) {
        /*
            r7 = this;
            java.lang.String r0 = "skipPast must not be null"
            j$.util.Objects.requireNonNull(r8, r0)
            java.lang.String r0 = "type must not be null"
            j$.util.Objects.requireNonNull(r9, r0)
            com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory r0 = r7.d
            r0.getClass()
            j$.util.concurrent.ConcurrentHashMap r1 = r0.b
            sx2 r2 = com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory.m
            r3 = 1
            if (r8 != r2) goto L17
            goto L58
        L17:
            java.lang.Class r2 = r9.a
            java.lang.Object r4 = r1.get(r2)
            sx2 r4 = (defpackage.sx2) r4
            if (r4 == 0) goto L24
            if (r4 != r8) goto L59
            goto L58
        L24:
            java.lang.Class<c81> r4 = defpackage.c81.class
            java.lang.annotation.Annotation r4 = r2.getAnnotation(r4)
            c81 r4 = (defpackage.c81) r4
            if (r4 != 0) goto L2f
            goto L59
        L2f:
            java.lang.Class r4 = r4.value()
            java.lang.Class<sx2> r5 = defpackage.sx2.class
            boolean r5 = r5.isAssignableFrom(r4)
            if (r5 != 0) goto L3c
            goto L59
        L3c:
            f00 r5 = r0.a
            com.google.gson.reflect.TypeToken r6 = new com.google.gson.reflect.TypeToken
            r6.<init>(r4)
            bs1 r4 = r5.b(r6, r3)
            java.lang.Object r4 = r4.a()
            sx2 r4 = (defpackage.sx2) r4
            java.lang.Object r1 = r1.putIfAbsent(r2, r4)
            sx2 r1 = (defpackage.sx2) r1
            if (r1 == 0) goto L56
            r4 = r1
        L56:
            if (r4 != r8) goto L59
        L58:
            r8 = r0
        L59:
            java.util.List r0 = r7.e
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L60:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L79
            java.lang.Object r2 = r0.next()
            sx2 r2 = (defpackage.sx2) r2
            if (r1 != 0) goto L72
            if (r2 != r8) goto L60
            r1 = r3
            goto L60
        L72:
            com.google.gson.b r2 = r2.a(r7, r9)
            if (r2 == 0) goto L60
            return r2
        L79:
            if (r1 != 0) goto L80
            com.google.gson.b r7 = r7.b(r9)
            return r7
        L80:
            java.lang.String r7 = "GSON cannot serialize or deserialize "
            defpackage.sn0.n(r9, r7)
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.a.c(sx2, com.google.gson.reflect.TypeToken):com.google.gson.b");
    }

    public final void d(Object obj, Class cls, x91 x91Var) {
        b b = b(new TypeToken(cls));
        int i = x91Var.r;
        if (i == 2) {
            x91Var.r = 1;
        }
        boolean z = x91Var.s;
        boolean z2 = x91Var.u;
        x91Var.s = true;
        x91Var.u = false;
        try {
            try {
                b.c(x91Var, obj);
            } catch (IOException e) {
                throw new rx(e, 3);
            } catch (AssertionError e2) {
                throw new AssertionError("AssertionError (GSON 2.14.0): " + e2.getMessage(), e2);
            }
        } finally {
            x91Var.x(i);
            x91Var.s = z;
            x91Var.u = z2;
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.e + ",instanceCreators:" + this.c + "}";
    }
}
