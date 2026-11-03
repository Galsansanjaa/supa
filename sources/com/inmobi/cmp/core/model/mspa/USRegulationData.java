package com.inmobi.cmp.core.model.mspa;

import defpackage.dn3;
import defpackage.jh2;
import defpackage.sg3;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class USRegulationData {
    private int additionalProcessingDataConsent;
    private String gppString;
    private List<Integer> knownChildSensitiveDataConsents;
    private int mspaCoveredTransaction;
    private int mspaOptOutOptionMode;
    private int mspaServiceProviderMode;
    private int personalDataConsents;
    private int processingNotice;
    private int saleOptOut;
    private int saleOptOutNotice;
    private int sensitiveDataLimitUseNotice;
    private List<Integer> sensitiveDataProcessing;
    private int sensitiveDataProcessingOptOutNotice;
    private int sharingNotice;
    private int sharingOptOut;
    private int sharingOptOutNotice;
    private int targetedAdvertisingOptOut;
    private int targetedAdvertisingOptOutNotice;
    private int version;

    public USRegulationData() {
        this(0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, 0, 0, 0, 0, 0, 524287, null);
    }

    public USRegulationData(int i, String str, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, List<Integer> list, List<Integer> list2, int i12, int i13, int i14, int i15, int i16) {
        str.getClass();
        list.getClass();
        list2.getClass();
        this.version = i;
        this.gppString = str;
        this.sharingNotice = i2;
        this.saleOptOutNotice = i3;
        this.sharingOptOutNotice = i4;
        this.targetedAdvertisingOptOutNotice = i5;
        this.sensitiveDataProcessingOptOutNotice = i6;
        this.sensitiveDataLimitUseNotice = i7;
        this.processingNotice = i8;
        this.saleOptOut = i9;
        this.sharingOptOut = i10;
        this.targetedAdvertisingOptOut = i11;
        this.sensitiveDataProcessing = list;
        this.knownChildSensitiveDataConsents = list2;
        this.personalDataConsents = i12;
        this.additionalProcessingDataConsent = i13;
        this.mspaCoveredTransaction = i14;
        this.mspaOptOutOptionMode = i15;
        this.mspaServiceProviderMode = i16;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ USRegulationData(int r21, java.lang.String r22, int r23, int r24, int r25, int r26, int r27, int r28, int r29, int r30, int r31, int r32, java.util.List r33, java.util.List r34, int r35, int r36, int r37, int r38, int r39, int r40, defpackage.sb0 r41) {
        /*
            Method dump skipped, instructions count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.cmp.core.model.mspa.USRegulationData.<init>(int, java.lang.String, int, int, int, int, int, int, int, int, int, int, java.util.List, java.util.List, int, int, int, int, int, int, sb0):void");
    }

    public static /* synthetic */ USRegulationData copy$default(USRegulationData uSRegulationData, int i, String str, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, List list, List list2, int i12, int i13, int i14, int i15, int i16, int i17, Object obj) {
        int i18;
        int i19;
        int i20 = (i17 & 1) != 0 ? uSRegulationData.version : i;
        String str2 = (i17 & 2) != 0 ? uSRegulationData.gppString : str;
        int i21 = (i17 & 4) != 0 ? uSRegulationData.sharingNotice : i2;
        int i22 = (i17 & 8) != 0 ? uSRegulationData.saleOptOutNotice : i3;
        int i23 = (i17 & 16) != 0 ? uSRegulationData.sharingOptOutNotice : i4;
        int i24 = (i17 & 32) != 0 ? uSRegulationData.targetedAdvertisingOptOutNotice : i5;
        int i25 = (i17 & 64) != 0 ? uSRegulationData.sensitiveDataProcessingOptOutNotice : i6;
        int i26 = (i17 & 128) != 0 ? uSRegulationData.sensitiveDataLimitUseNotice : i7;
        int i27 = (i17 & 256) != 0 ? uSRegulationData.processingNotice : i8;
        int i28 = (i17 & 512) != 0 ? uSRegulationData.saleOptOut : i9;
        int i29 = (i17 & 1024) != 0 ? uSRegulationData.sharingOptOut : i10;
        int i30 = (i17 & 2048) != 0 ? uSRegulationData.targetedAdvertisingOptOut : i11;
        List list3 = (i17 & 4096) != 0 ? uSRegulationData.sensitiveDataProcessing : list;
        List list4 = (i17 & 8192) != 0 ? uSRegulationData.knownChildSensitiveDataConsents : list2;
        int i31 = i20;
        int i32 = (i17 & 16384) != 0 ? uSRegulationData.personalDataConsents : i12;
        int i33 = (i17 & 32768) != 0 ? uSRegulationData.additionalProcessingDataConsent : i13;
        int i34 = (i17 & 65536) != 0 ? uSRegulationData.mspaCoveredTransaction : i14;
        int i35 = (i17 & 131072) != 0 ? uSRegulationData.mspaOptOutOptionMode : i15;
        if ((i17 & 262144) != 0) {
            i19 = i35;
            i18 = uSRegulationData.mspaServiceProviderMode;
        } else {
            i18 = i16;
            i19 = i35;
        }
        return uSRegulationData.copy(i31, str2, i21, i22, i23, i24, i25, i26, i27, i28, i29, i30, list3, list4, i32, i33, i34, i19, i18);
    }

    public final int component1() {
        return this.version;
    }

    public final int component10() {
        return this.saleOptOut;
    }

    public final int component11() {
        return this.sharingOptOut;
    }

    public final int component12() {
        return this.targetedAdvertisingOptOut;
    }

    public final List<Integer> component13() {
        return this.sensitiveDataProcessing;
    }

    public final List<Integer> component14() {
        return this.knownChildSensitiveDataConsents;
    }

    public final int component15() {
        return this.personalDataConsents;
    }

    public final int component16() {
        return this.additionalProcessingDataConsent;
    }

    public final int component17() {
        return this.mspaCoveredTransaction;
    }

    public final int component18() {
        return this.mspaOptOutOptionMode;
    }

    public final int component19() {
        return this.mspaServiceProviderMode;
    }

    public final String component2() {
        return this.gppString;
    }

    public final int component3() {
        return this.sharingNotice;
    }

    public final int component4() {
        return this.saleOptOutNotice;
    }

    public final int component5() {
        return this.sharingOptOutNotice;
    }

    public final int component6() {
        return this.targetedAdvertisingOptOutNotice;
    }

    public final int component7() {
        return this.sensitiveDataProcessingOptOutNotice;
    }

    public final int component8() {
        return this.sensitiveDataLimitUseNotice;
    }

    public final int component9() {
        return this.processingNotice;
    }

    public final USRegulationData copy(int i, String str, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, List<Integer> list, List<Integer> list2, int i12, int i13, int i14, int i15, int i16) {
        str.getClass();
        list.getClass();
        list2.getClass();
        return new USRegulationData(i, str, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, list, list2, i12, i13, i14, i15, i16);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof USRegulationData)) {
            return false;
        }
        USRegulationData uSRegulationData = (USRegulationData) obj;
        return this.version == uSRegulationData.version && jh2.k(this.gppString, uSRegulationData.gppString) && this.sharingNotice == uSRegulationData.sharingNotice && this.saleOptOutNotice == uSRegulationData.saleOptOutNotice && this.sharingOptOutNotice == uSRegulationData.sharingOptOutNotice && this.targetedAdvertisingOptOutNotice == uSRegulationData.targetedAdvertisingOptOutNotice && this.sensitiveDataProcessingOptOutNotice == uSRegulationData.sensitiveDataProcessingOptOutNotice && this.sensitiveDataLimitUseNotice == uSRegulationData.sensitiveDataLimitUseNotice && this.processingNotice == uSRegulationData.processingNotice && this.saleOptOut == uSRegulationData.saleOptOut && this.sharingOptOut == uSRegulationData.sharingOptOut && this.targetedAdvertisingOptOut == uSRegulationData.targetedAdvertisingOptOut && jh2.k(this.sensitiveDataProcessing, uSRegulationData.sensitiveDataProcessing) && jh2.k(this.knownChildSensitiveDataConsents, uSRegulationData.knownChildSensitiveDataConsents) && this.personalDataConsents == uSRegulationData.personalDataConsents && this.additionalProcessingDataConsent == uSRegulationData.additionalProcessingDataConsent && this.mspaCoveredTransaction == uSRegulationData.mspaCoveredTransaction && this.mspaOptOutOptionMode == uSRegulationData.mspaOptOutOptionMode && this.mspaServiceProviderMode == uSRegulationData.mspaServiceProviderMode;
    }

    public final int getAdditionalProcessingDataConsent() {
        return this.additionalProcessingDataConsent;
    }

    public final String getGppString() {
        return this.gppString;
    }

    public final List<Integer> getKnownChildSensitiveDataConsents() {
        return this.knownChildSensitiveDataConsents;
    }

    public final int getMspaCoveredTransaction() {
        return this.mspaCoveredTransaction;
    }

    public final int getMspaOptOutOptionMode() {
        return this.mspaOptOutOptionMode;
    }

    public final int getMspaServiceProviderMode() {
        return this.mspaServiceProviderMode;
    }

    public final int getPersonalDataConsents() {
        return this.personalDataConsents;
    }

    public final int getProcessingNotice() {
        return this.processingNotice;
    }

    public final int getSaleOptOut() {
        return this.saleOptOut;
    }

    public final int getSaleOptOutNotice() {
        return this.saleOptOutNotice;
    }

    public final int getSensitiveDataLimitUseNotice() {
        return this.sensitiveDataLimitUseNotice;
    }

    public final List<Integer> getSensitiveDataProcessing() {
        return this.sensitiveDataProcessing;
    }

    public final int getSensitiveDataProcessingOptOutNotice() {
        return this.sensitiveDataProcessingOptOutNotice;
    }

    public final int getSharingNotice() {
        return this.sharingNotice;
    }

    public final int getSharingOptOut() {
        return this.sharingOptOut;
    }

    public final int getSharingOptOutNotice() {
        return this.sharingOptOutNotice;
    }

    public final int getTargetedAdvertisingOptOut() {
        return this.targetedAdvertisingOptOut;
    }

    public final int getTargetedAdvertisingOptOutNotice() {
        return this.targetedAdvertisingOptOutNotice;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.mspaServiceProviderMode + ((this.mspaOptOutOptionMode + ((this.mspaCoveredTransaction + ((this.additionalProcessingDataConsent + ((this.personalDataConsents + jh2.f(jh2.f((this.targetedAdvertisingOptOut + ((this.sharingOptOut + ((this.saleOptOut + ((this.processingNotice + ((this.sensitiveDataLimitUseNotice + ((this.sensitiveDataProcessingOptOutNotice + ((this.targetedAdvertisingOptOutNotice + ((this.sharingOptOutNotice + ((this.saleOptOutNotice + ((this.sharingNotice + dn3.b(this.version * 31, this.gppString)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, this.sensitiveDataProcessing), this.knownChildSensitiveDataConsents)) * 31)) * 31)) * 31)) * 31);
    }

    public final void setAdditionalProcessingDataConsent(int i) {
        this.additionalProcessingDataConsent = i;
    }

    public final void setGppString(String str) {
        str.getClass();
        this.gppString = str;
    }

    public final void setKnownChildSensitiveDataConsents(List<Integer> list) {
        list.getClass();
        this.knownChildSensitiveDataConsents = list;
    }

    public final void setMspaCoveredTransaction(int i) {
        this.mspaCoveredTransaction = i;
    }

    public final void setMspaOptOutOptionMode(int i) {
        this.mspaOptOutOptionMode = i;
    }

    public final void setMspaServiceProviderMode(int i) {
        this.mspaServiceProviderMode = i;
    }

    public final void setPersonalDataConsents(int i) {
        this.personalDataConsents = i;
    }

    public final void setProcessingNotice(int i) {
        this.processingNotice = i;
    }

    public final void setSaleOptOut(int i) {
        this.saleOptOut = i;
    }

    public final void setSaleOptOutNotice(int i) {
        this.saleOptOutNotice = i;
    }

    public final void setSensitiveDataLimitUseNotice(int i) {
        this.sensitiveDataLimitUseNotice = i;
    }

    public final void setSensitiveDataProcessing(List<Integer> list) {
        list.getClass();
        this.sensitiveDataProcessing = list;
    }

    public final void setSensitiveDataProcessingOptOutNotice(int i) {
        this.sensitiveDataProcessingOptOutNotice = i;
    }

    public final void setSharingNotice(int i) {
        this.sharingNotice = i;
    }

    public final void setSharingOptOut(int i) {
        this.sharingOptOut = i;
    }

    public final void setSharingOptOutNotice(int i) {
        this.sharingOptOutNotice = i;
    }

    public final void setTargetedAdvertisingOptOut(int i) {
        this.targetedAdvertisingOptOut = i;
    }

    public final void setTargetedAdvertisingOptOutNotice(int i) {
        this.targetedAdvertisingOptOutNotice = i;
    }

    public final void setVersion(int i) {
        this.version = i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("USRegulationData(version=");
        sb.append(this.version);
        sb.append(", gppString=");
        sb.append(this.gppString);
        sb.append(", sharingNotice=");
        sb.append(this.sharingNotice);
        sb.append(", saleOptOutNotice=");
        sb.append(this.saleOptOutNotice);
        sb.append(", sharingOptOutNotice=");
        sb.append(this.sharingOptOutNotice);
        sb.append(", targetedAdvertisingOptOutNotice=");
        sb.append(this.targetedAdvertisingOptOutNotice);
        sb.append(", sensitiveDataProcessingOptOutNotice=");
        sb.append(this.sensitiveDataProcessingOptOutNotice);
        sb.append(", sensitiveDataLimitUseNotice=");
        sb.append(this.sensitiveDataLimitUseNotice);
        sb.append(", processingNotice=");
        sb.append(this.processingNotice);
        sb.append(", saleOptOut=");
        sb.append(this.saleOptOut);
        sb.append(", sharingOptOut=");
        sb.append(this.sharingOptOut);
        sb.append(", targetedAdvertisingOptOut=");
        sb.append(this.targetedAdvertisingOptOut);
        sb.append(", sensitiveDataProcessing=");
        sb.append(this.sensitiveDataProcessing);
        sb.append(", knownChildSensitiveDataConsents=");
        sb.append(this.knownChildSensitiveDataConsents);
        sb.append(", personalDataConsents=");
        sb.append(this.personalDataConsents);
        sb.append(", additionalProcessingDataConsent=");
        sb.append(this.additionalProcessingDataConsent);
        sb.append(", mspaCoveredTransaction=");
        sb.append(this.mspaCoveredTransaction);
        sb.append(", mspaOptOutOptionMode=");
        sb.append(this.mspaOptOutOptionMode);
        sb.append(", mspaServiceProviderMode=");
        return sg3.r(sb, this.mspaServiceProviderMode, ')');
    }
}
