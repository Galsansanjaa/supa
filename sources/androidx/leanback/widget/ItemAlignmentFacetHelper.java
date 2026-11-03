package androidx.leanback.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.leanback.widget.GridLayoutManager;
import androidx.leanback.widget.ItemAlignmentFacet;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public class ItemAlignmentFacetHelper {
    private static final Rect sRect = new Rect();

    private ItemAlignmentFacetHelper() {
    }

    public static int getAlignmentPosition(View view, ItemAlignmentFacet.ItemAlignmentDef itemAlignmentDef, int i) {
        View view2;
        GridLayoutManager.LayoutParams layoutParams = (GridLayoutManager.LayoutParams) view.getLayoutParams();
        int i2 = itemAlignmentDef.mViewId;
        if (i2 == 0 || (view2 = view.findViewById(i2)) == null) {
            view2 = view;
        }
        int i3 = itemAlignmentDef.mOffset;
        if (i != 0) {
            if (itemAlignmentDef.mOffsetWithPadding) {
                float f = itemAlignmentDef.mOffsetPercent;
                if (f == 0.0f) {
                    i3 += view2.getPaddingTop();
                } else if (f == 100.0f) {
                    i3 -= view2.getPaddingBottom();
                }
            }
            if (itemAlignmentDef.mOffsetPercent != -1.0f) {
                i3 += (int) (((view2 == view ? layoutParams.getOpticalHeight(view2) : view2.getHeight()) * itemAlignmentDef.mOffsetPercent) / 100.0f);
            }
            if (view != view2) {
                Rect rect = sRect;
                rect.top = i3;
                ((ViewGroup) view).offsetDescendantRectToMyCoords(view2, rect);
                i3 = rect.top - layoutParams.getOpticalTopInset();
            }
            return itemAlignmentDef.isAlignedToTextViewBaseLine() ? view2.getBaseline() + i3 : i3;
        }
        if (view.getLayoutDirection() != 1) {
            if (itemAlignmentDef.mOffsetWithPadding) {
                float f2 = itemAlignmentDef.mOffsetPercent;
                if (f2 == 0.0f) {
                    i3 += view2.getPaddingLeft();
                } else if (f2 == 100.0f) {
                    i3 -= view2.getPaddingRight();
                }
            }
            if (itemAlignmentDef.mOffsetPercent != -1.0f) {
                i3 += (int) (((view2 == view ? layoutParams.getOpticalWidth(view2) : view2.getWidth()) * itemAlignmentDef.mOffsetPercent) / 100.0f);
            }
            if (view == view2) {
                return i3;
            }
            Rect rect2 = sRect;
            rect2.left = i3;
            ((ViewGroup) view).offsetDescendantRectToMyCoords(view2, rect2);
            return rect2.left - layoutParams.getOpticalLeftInset();
        }
        int opticalWidth = (view2 == view ? layoutParams.getOpticalWidth(view2) : view2.getWidth()) - i3;
        if (itemAlignmentDef.mOffsetWithPadding) {
            float f3 = itemAlignmentDef.mOffsetPercent;
            if (f3 == 0.0f) {
                opticalWidth -= view2.getPaddingRight();
            } else if (f3 == 100.0f) {
                opticalWidth += view2.getPaddingLeft();
            }
        }
        if (itemAlignmentDef.mOffsetPercent != -1.0f) {
            opticalWidth -= (int) (((view2 == view ? layoutParams.getOpticalWidth(view2) : view2.getWidth()) * itemAlignmentDef.mOffsetPercent) / 100.0f);
        }
        if (view == view2) {
            return opticalWidth;
        }
        Rect rect3 = sRect;
        rect3.right = opticalWidth;
        ((ViewGroup) view).offsetDescendantRectToMyCoords(view2, rect3);
        return rect3.right + layoutParams.getOpticalRightInset();
    }
}
