package com.google.gson.internal.bind;

import com.google.gson.reflect.TypeToken;
import defpackage.sx2;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public class TypeAdapters$31 implements sx2 {
    public final /* synthetic */ Class a;
    public final /* synthetic */ Class b;
    public final /* synthetic */ com.google.gson.b m;

    public TypeAdapters$31(Class cls, Class cls2, com.google.gson.b bVar) {
        this.a = cls;
        this.b = cls2;
        this.m = bVar;
    }

    @Override // defpackage.sx2
    public final com.google.gson.b a(com.google.gson.a aVar, TypeToken typeToken) {
        Class cls = typeToken.a;
        if (cls == this.a || cls == this.b) {
            return this.m;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.b.getName() + "+" + this.a.getName() + ",adapter=" + this.m + "]";
    }
}
