package androidx.privacysandbox.ads.adservices.topics;

import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import defpackage.sn0;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class GetTopicsResponseHelper {
    public static final GetTopicsResponseHelper INSTANCE = new GetTopicsResponseHelper();

    private GetTopicsResponseHelper() {
    }

    public final GetTopicsResponse convertResponse$ads_adservices_release(android.adservices.topics.GetTopicsResponse getTopicsResponse) {
        getTopicsResponse.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator<android.adservices.topics.Topic> it = getTopicsResponse.getTopics().iterator();
        while (it.hasNext()) {
            android.adservices.topics.Topic a = sn0.a(it.next());
            arrayList.add(new Topic(a.getTaxonomyVersion(), a.getModelVersion(), a.getTopicId()));
        }
        return new GetTopicsResponse(arrayList);
    }

    @ExperimentalFeatures.Ext11OptIn
    public final GetTopicsResponse convertResponseWithEncryptedTopics$ads_adservices_release(android.adservices.topics.GetTopicsResponse getTopicsResponse) {
        getTopicsResponse.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator<android.adservices.topics.Topic> it = getTopicsResponse.getTopics().iterator();
        while (it.hasNext()) {
            android.adservices.topics.Topic a = sn0.a(it.next());
            arrayList.add(new Topic(a.getTaxonomyVersion(), a.getModelVersion(), a.getTopicId()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (android.adservices.topics.EncryptedTopic encryptedTopic : getTopicsResponse.getEncryptedTopics()) {
            byte[] encryptedTopic2 = encryptedTopic.getEncryptedTopic();
            encryptedTopic2.getClass();
            String keyIdentifier = encryptedTopic.getKeyIdentifier();
            keyIdentifier.getClass();
            byte[] encapsulatedKey = encryptedTopic.getEncapsulatedKey();
            encapsulatedKey.getClass();
            arrayList2.add(new EncryptedTopic(encryptedTopic2, keyIdentifier, encapsulatedKey));
        }
        return new GetTopicsResponse(arrayList, arrayList2);
    }
}
