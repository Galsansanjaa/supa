package defpackage;

import j$.util.function.Predicate$CC;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x13 implements Predicate {
    public final /* synthetic */ int a;

    public /* synthetic */ Predicate and(Predicate predicate) {
        int i = this.a;
        return Predicate$CC.$default$and(this, predicate);
    }

    public /* synthetic */ Predicate negate() {
        int i = this.a;
        return Predicate$CC.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        int i = this.a;
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                Integer num = (Integer) obj;
                return num.intValue() >= 1 && num.intValue() <= 2;
            case 1:
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    int intValue = ((Integer) it.next()).intValue();
                    if (intValue < 0 || intValue > 2) {
                        return false;
                    }
                }
                return true;
            case 2:
                Integer num2 = (Integer) obj;
                return num2.intValue() >= 0 && num2.intValue() <= 2;
            case 3:
                Integer num3 = (Integer) obj;
                return num3.intValue() >= 1 && num3.intValue() <= 2;
            case 4:
                Iterator it2 = ((List) obj).iterator();
                while (it2.hasNext()) {
                    int intValue2 = ((Integer) it2.next()).intValue();
                    if (intValue2 < 0 || intValue2 > 2) {
                        return false;
                    }
                }
                return true;
            case 5:
                Integer num4 = (Integer) obj;
                return num4.intValue() >= 0 && num4.intValue() <= 2;
            case 6:
                Integer num5 = (Integer) obj;
                return num5.intValue() >= 1 && num5.intValue() <= 2;
            case 7:
                Iterator it3 = ((List) obj).iterator();
                while (it3.hasNext()) {
                    int intValue3 = ((Integer) it3.next()).intValue();
                    if (intValue3 < 0 || intValue3 > 2) {
                        return false;
                    }
                }
                return true;
            case 8:
                Integer num6 = (Integer) obj;
                return num6.intValue() >= 0 && num6.intValue() <= 2;
            case 9:
                Integer num7 = (Integer) obj;
                return num7.intValue() >= 1 && num7.intValue() <= 2;
            case 10:
                Iterator it4 = ((List) obj).iterator();
                while (it4.hasNext()) {
                    int intValue4 = ((Integer) it4.next()).intValue();
                    if (intValue4 < 0 || intValue4 > 2) {
                        return false;
                    }
                }
                return true;
            case 11:
                Integer num8 = (Integer) obj;
                return num8.intValue() >= 0 && num8.intValue() <= 2;
            case 12:
                Integer num9 = (Integer) obj;
                return num9.intValue() >= 1 && num9.intValue() <= 2;
            case 13:
                Iterator it5 = ((List) obj).iterator();
                while (it5.hasNext()) {
                    int intValue5 = ((Integer) it5.next()).intValue();
                    if (intValue5 < 0 || intValue5 > 2) {
                        return false;
                    }
                }
                return true;
            case 14:
                Integer num10 = (Integer) obj;
                return num10.intValue() >= 0 && num10.intValue() <= 2;
            case 15:
                Integer num11 = (Integer) obj;
                return num11.intValue() >= 1 && num11.intValue() <= 2;
            case 16:
                Iterator it6 = ((List) obj).iterator();
                while (it6.hasNext()) {
                    int intValue6 = ((Integer) it6.next()).intValue();
                    if (intValue6 < 0 || intValue6 > 2) {
                        return false;
                    }
                }
                return true;
            case 17:
                Integer num12 = (Integer) obj;
                return num12.intValue() >= 0 && num12.intValue() <= 2;
            case 18:
                Integer num13 = (Integer) obj;
                return num13.intValue() >= 1 && num13.intValue() <= 2;
            case 19:
                Iterator it7 = ((List) obj).iterator();
                while (it7.hasNext()) {
                    int intValue7 = ((Integer) it7.next()).intValue();
                    if (intValue7 < 0 || intValue7 > 2) {
                        return false;
                    }
                }
                return true;
            case 20:
                Integer num14 = (Integer) obj;
                return num14.intValue() >= 0 && num14.intValue() <= 2;
            case 21:
                Integer num15 = (Integer) obj;
                return num15.intValue() >= 1 && num15.intValue() <= 2;
            case 22:
                Iterator it8 = ((List) obj).iterator();
                while (it8.hasNext()) {
                    int intValue8 = ((Integer) it8.next()).intValue();
                    if (intValue8 < 0 || intValue8 > 2) {
                        return false;
                    }
                }
                return true;
            case 23:
                Integer num16 = (Integer) obj;
                return num16.intValue() >= 0 && num16.intValue() <= 2;
            case 24:
                Integer num17 = (Integer) obj;
                return num17.intValue() >= 1 && num17.intValue() <= 2;
            case 25:
                Iterator it9 = ((List) obj).iterator();
                while (it9.hasNext()) {
                    int intValue9 = ((Integer) it9.next()).intValue();
                    if (intValue9 < 0 || intValue9 > 2) {
                        return false;
                    }
                }
                return true;
            case 26:
                Character ch = (Character) obj;
                return ch.charValue() == 'Y' || ch.charValue() == 'N' || ch.charValue() == '-';
            case 27:
                Character ch2 = (Character) obj;
                return ch2.charValue() == 'Y' || ch2.charValue() == 'N' || ch2.charValue() == '-';
            default:
                Character ch3 = (Character) obj;
                return ch3.charValue() == 'Y' || ch3.charValue() == 'N' || ch3.charValue() == '-';
        }
    }
}
