package androidx.compose.ui.graphics.layer;

import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.ui.graphics.InlineClassHelperKt;
import defpackage.os0;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class ChildLayerDependenciesTracker {
    public static final int $stable = 8;
    private MutableScatterSet<GraphicsLayer> dependenciesSet;
    private GraphicsLayer dependency;
    private MutableScatterSet<GraphicsLayer> oldDependenciesSet;
    private GraphicsLayer oldDependency;
    private boolean trackingInProgress;

    public static final /* synthetic */ MutableScatterSet access$getDependenciesSet$p(ChildLayerDependenciesTracker childLayerDependenciesTracker) {
        return childLayerDependenciesTracker.dependenciesSet;
    }

    public static final /* synthetic */ GraphicsLayer access$getDependency$p(ChildLayerDependenciesTracker childLayerDependenciesTracker) {
        return childLayerDependenciesTracker.dependency;
    }

    public static final /* synthetic */ MutableScatterSet access$getOldDependenciesSet$p(ChildLayerDependenciesTracker childLayerDependenciesTracker) {
        return childLayerDependenciesTracker.oldDependenciesSet;
    }

    public static final /* synthetic */ GraphicsLayer access$getOldDependency$p(ChildLayerDependenciesTracker childLayerDependenciesTracker) {
        return childLayerDependenciesTracker.oldDependency;
    }

    public static final /* synthetic */ void access$setDependency$p(ChildLayerDependenciesTracker childLayerDependenciesTracker, GraphicsLayer graphicsLayer) {
        childLayerDependenciesTracker.dependency = graphicsLayer;
    }

    public static final /* synthetic */ void access$setOldDependenciesSet$p(ChildLayerDependenciesTracker childLayerDependenciesTracker, MutableScatterSet mutableScatterSet) {
        childLayerDependenciesTracker.oldDependenciesSet = mutableScatterSet;
    }

    public static final /* synthetic */ void access$setOldDependency$p(ChildLayerDependenciesTracker childLayerDependenciesTracker, GraphicsLayer graphicsLayer) {
        childLayerDependenciesTracker.oldDependency = graphicsLayer;
    }

    public static final /* synthetic */ void access$setTrackingInProgress$p(ChildLayerDependenciesTracker childLayerDependenciesTracker, boolean z) {
        childLayerDependenciesTracker.trackingInProgress = z;
    }

    public final boolean onDependencyAdded(GraphicsLayer graphicsLayer) {
        if (!this.trackingInProgress) {
            InlineClassHelperKt.throwIllegalArgumentException("Only add dependencies during a tracking");
        }
        MutableScatterSet<GraphicsLayer> mutableScatterSet = this.dependenciesSet;
        if (mutableScatterSet != null) {
            mutableScatterSet.getClass();
            mutableScatterSet.add(graphicsLayer);
        } else if (this.dependency != null) {
            MutableScatterSet<GraphicsLayer> mutableScatterSetOf = ScatterSetKt.mutableScatterSetOf();
            GraphicsLayer graphicsLayer2 = this.dependency;
            graphicsLayer2.getClass();
            mutableScatterSetOf.add(graphicsLayer2);
            mutableScatterSetOf.add(graphicsLayer);
            this.dependenciesSet = mutableScatterSetOf;
            this.dependency = null;
        } else {
            this.dependency = graphicsLayer;
        }
        MutableScatterSet<GraphicsLayer> mutableScatterSet2 = this.oldDependenciesSet;
        if (mutableScatterSet2 != null) {
            mutableScatterSet2.getClass();
            return !mutableScatterSet2.remove(graphicsLayer);
        }
        if (this.oldDependency != graphicsLayer) {
            return true;
        }
        this.oldDependency = null;
        return false;
    }

    public final void removeDependencies(ps0 ps0Var) {
        GraphicsLayer graphicsLayer = this.dependency;
        if (graphicsLayer != null) {
            ps0Var.invoke(graphicsLayer);
            this.dependency = null;
        }
        MutableScatterSet mutableScatterSet = this.dependenciesSet;
        if (mutableScatterSet != null) {
            Object[] objArr = mutableScatterSet.elements;
            long[] jArr = mutableScatterSet.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                ps0Var.invoke(objArr[(i << 3) + i3]);
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            mutableScatterSet.clear();
        }
    }

    public final void withTracking(ps0 ps0Var, os0 os0Var) {
        this.oldDependency = this.dependency;
        MutableScatterSet mutableScatterSet = this.dependenciesSet;
        if (mutableScatterSet != null && mutableScatterSet.isNotEmpty()) {
            MutableScatterSet mutableScatterSet2 = this.oldDependenciesSet;
            if (mutableScatterSet2 == null) {
                mutableScatterSet2 = ScatterSetKt.mutableScatterSetOf();
                this.oldDependenciesSet = mutableScatterSet2;
            }
            mutableScatterSet2.addAll(mutableScatterSet);
            mutableScatterSet.clear();
        }
        this.trackingInProgress = true;
        os0Var.invoke();
        this.trackingInProgress = false;
        GraphicsLayer graphicsLayer = this.oldDependency;
        if (graphicsLayer != null) {
            ps0Var.invoke(graphicsLayer);
        }
        MutableScatterSet mutableScatterSet3 = this.oldDependenciesSet;
        if (mutableScatterSet3 == null || !mutableScatterSet3.isNotEmpty()) {
            return;
        }
        Object[] objArr = mutableScatterSet3.elements;
        long[] jArr = mutableScatterSet3.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            ps0Var.invoke(objArr[(i << 3) + i3]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        mutableScatterSet3.clear();
    }
}
