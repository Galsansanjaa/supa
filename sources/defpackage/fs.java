package defpackage;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class fs implements ba1, Serializable {
    public static final Object NO_RECEIVER = es.a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient ba1 reflected;
    private final String signature;

    public fs(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }

    @Override // defpackage.ba1
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // defpackage.ba1
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public ba1 compute() {
        ba1 ba1Var = this.reflected;
        if (ba1Var != null) {
            return ba1Var;
        }
        ba1 computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    public abstract ba1 computeReflected();

    @Override // defpackage.aa1
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // defpackage.ba1
    public String getName() {
        return this.name;
    }

    public da1 getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (!this.isTopLevel) {
            return a52.a(cls);
        }
        a52.a.getClass();
        return new su1(cls);
    }

    @Override // defpackage.ba1
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public abstract ba1 getReflected();

    @Override // defpackage.ba1
    public ua1 getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // defpackage.ba1
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // defpackage.ba1
    public va1 getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // defpackage.ba1
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // defpackage.ba1
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // defpackage.ba1
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // defpackage.ba1, defpackage.ea1
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }
}
