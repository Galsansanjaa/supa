package androidx.privacysandbox.ads.adservices.topics;

import android.content.Context;
import androidx.privacysandbox.ads.adservices.internal.AdServicesInfo;
import androidx.privacysandbox.ads.adservices.internal.BackCompatManager;
import defpackage.a10;
import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public abstract class TopicsManager {
    public static final Companion Companion = new Companion(null);

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        public final TopicsManager obtain(Context context) {
            context.getClass();
            AdServicesInfo adServicesInfo = AdServicesInfo.INSTANCE;
            if (adServicesInfo.adServicesVersion() >= 11) {
                return new TopicsManagerApi33Ext11Impl(context);
            }
            if (adServicesInfo.adServicesVersion() >= 5) {
                return new TopicsManagerApi33Ext5Impl(context);
            }
            if (adServicesInfo.adServicesVersion() == 4) {
                return new TopicsManagerApi33Ext4Impl(context);
            }
            if (adServicesInfo.extServicesVersionS() >= 11) {
                return (TopicsManager) BackCompatManager.INSTANCE.getManager(context, "TopicsManager", new TopicsManager$Companion$obtain$1(context));
            }
            if (adServicesInfo.extServicesVersionS() >= 9) {
                return (TopicsManager) BackCompatManager.INSTANCE.getManager(context, "TopicsManager", new TopicsManager$Companion$obtain$2(context));
            }
            return null;
        }
    }

    public static final TopicsManager obtain(Context context) {
        return Companion.obtain(context);
    }

    public abstract Object getTopics(GetTopicsRequest getTopicsRequest, a10 a10Var);
}
