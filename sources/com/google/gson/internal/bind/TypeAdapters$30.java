package com.google.gson.internal.bind;

import com.google.gson.reflect.TypeToken;
import defpackage.sx2;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public class TypeAdapters$30 implements sx2 {
    public final /* synthetic */ Class a;
    public final /* synthetic */ com.google.gson.b b;

    public TypeAdapters$30(Class cls, com.google.gson.b bVar) {
        this.a = cls;
        this.b = bVar;
    }

    @Override // defpackage.sx2
    public final com.google.gson.b a(com.google.gson.a aVar, TypeToken typeToken) {
        if (typeToken.a == this.a) {
            return this.b;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.a.getName() + ",adapter=" + this.b + "]";
    }
}
