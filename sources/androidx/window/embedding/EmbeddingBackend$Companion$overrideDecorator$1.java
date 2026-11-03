package androidx.window.embedding;

import defpackage.et0;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class EmbeddingBackend$Companion$overrideDecorator$1 extends et0 implements ps0 {
    public EmbeddingBackend$Companion$overrideDecorator$1(Object obj) {
        super(1, obj, EmbeddingBackendDecorator.class, "decorate", "decorate(Landroidx/window/embedding/EmbeddingBackend;)Landroidx/window/embedding/EmbeddingBackend;", 0);
    }

    @Override // defpackage.ps0
    public final EmbeddingBackend invoke(EmbeddingBackend embeddingBackend) {
        embeddingBackend.getClass();
        return ((EmbeddingBackendDecorator) this.receiver).decorate(embeddingBackend);
    }
}
