package androidx.window.embedding;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import androidx.window.R;
import androidx.window.embedding.ActivityRule;
import androidx.window.embedding.DividerAttributes;
import androidx.window.embedding.EmbeddingAnimationParams;
import androidx.window.embedding.EmbeddingAspectRatio;
import androidx.window.embedding.SplitAttributes;
import androidx.window.embedding.SplitPairRule;
import androidx.window.embedding.SplitPlaceholderRule;
import androidx.window.embedding.SplitRule;
import defpackage.ri0;
import defpackage.sn0;
import defpackage.um2;
import defpackage.v5;
import defpackage.wa2;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class RuleParser {
    public static final RuleParser INSTANCE = new RuleParser();

    private RuleParser() {
    }

    private final void addRuleWithDuplicatedTagCheck(HashSet<EmbeddingRule> hashSet, EmbeddingRule embeddingRule) {
        String tag = embeddingRule.getTag();
        for (EmbeddingRule embeddingRule2 : hashSet) {
            if (tag != null && tag.equals(embeddingRule2.getTag())) {
                sn0.p("Duplicated tag: ", tag, " for ", embeddingRule, ". The tag must be unique in XML rule definition.");
                return;
            }
        }
        hashSet.add(embeddingRule);
    }

    private final ComponentName buildClassName(String str, CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            v5.m("Activity name must not be null");
            return null;
        }
        String obj = charSequence.toString();
        if (obj.charAt(0) == '.') {
            return new ComponentName(str, wa2.q(str, obj));
        }
        int t0 = um2.t0('/', 0, 6, obj);
        if (t0 > 0) {
            str = obj.substring(0, t0);
            obj = obj.substring(t0 + 1);
        }
        if (obj.equals("*") || um2.t0('.', 0, 6, obj) >= 0) {
            return new ComponentName(str, obj);
        }
        return new ComponentName(str, str + '.' + obj);
    }

    private final ActivityFilter parseActivityFilter(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(xmlResourceParser, R.styleable.ActivityFilter, 0, 0);
        String string = obtainStyledAttributes.getString(R.styleable.ActivityFilter_activityName);
        String string2 = obtainStyledAttributes.getString(R.styleable.ActivityFilter_activityAction);
        String packageName = context.getApplicationContext().getPackageName();
        packageName.getClass();
        return new ActivityFilter(buildClassName(packageName, string), string2);
    }

    private final ActivityRule parseActivityRule(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(xmlResourceParser, R.styleable.ActivityRule, 0, 0);
        String string = obtainStyledAttributes.getString(R.styleable.ActivityRule_tag);
        boolean z = obtainStyledAttributes.getBoolean(R.styleable.ActivityRule_alwaysExpand, false);
        obtainStyledAttributes.recycle();
        ActivityRule.Builder alwaysExpand = new ActivityRule.Builder(ri0.a).setAlwaysExpand(z);
        if (string != null) {
            alwaysExpand.setTag(string);
        }
        return alwaysExpand.build();
    }

    private final DividerAttributes parseDividerAttributes(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(xmlResourceParser, R.styleable.DividerAttributes, 0, 0);
        int i = obtainStyledAttributes.getInt(R.styleable.DividerAttributes_embeddingDividerType, 0);
        DividerAttributes.Companion companion = DividerAttributes.Companion;
        companion.validateXmlDividerAttributes$window_release(i, obtainStyledAttributes.hasValue(R.styleable.DividerAttributes_dragRangeMinRatio), obtainStyledAttributes.hasValue(R.styleable.DividerAttributes_dragRangeMaxRatio), obtainStyledAttributes.hasValue(R.styleable.DividerAttributes_isDraggingToFullscreenAllowed));
        return companion.createDividerAttributes$window_release(i, obtainStyledAttributes.getInt(R.styleable.DividerAttributes_embeddingDividerWidthDp, -1), obtainStyledAttributes.getColor(R.styleable.DividerAttributes_embeddingDividerColor, -16777216), obtainStyledAttributes.getFloat(R.styleable.DividerAttributes_dragRangeMinRatio, -1.0f), obtainStyledAttributes.getFloat(R.styleable.DividerAttributes_dragRangeMaxRatio, -1.0f), obtainStyledAttributes.getBoolean(R.styleable.DividerAttributes_isDraggingToFullscreenAllowed, false));
    }

    private final SplitPairFilter parseSplitPairFilter(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(xmlResourceParser, R.styleable.SplitPairFilter, 0, 0);
        String string = obtainStyledAttributes.getString(R.styleable.SplitPairFilter_primaryActivityName);
        String string2 = obtainStyledAttributes.getString(R.styleable.SplitPairFilter_secondaryActivityName);
        String string3 = obtainStyledAttributes.getString(R.styleable.SplitPairFilter_secondaryActivityAction);
        String packageName = context.getApplicationContext().getPackageName();
        packageName.getClass();
        return new SplitPairFilter(buildClassName(packageName, string), buildClassName(packageName, string2), string3);
    }

    private final SplitPairRule parseSplitPairRule(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(xmlResourceParser, R.styleable.SplitPairRule, 0, 0);
        String string = obtainStyledAttributes.getString(R.styleable.SplitPairRule_tag);
        float f = obtainStyledAttributes.getFloat(R.styleable.SplitPairRule_splitRatio, 0.5f);
        int integer = obtainStyledAttributes.getInteger(R.styleable.SplitPairRule_splitMinWidthDp, 600);
        int integer2 = obtainStyledAttributes.getInteger(R.styleable.SplitPairRule_splitMinHeightDp, 600);
        int integer3 = obtainStyledAttributes.getInteger(R.styleable.SplitPairRule_splitMinSmallestWidthDp, 600);
        float f2 = obtainStyledAttributes.getFloat(R.styleable.SplitPairRule_splitMaxAspectRatioInPortrait, SplitRule.SPLIT_MAX_ASPECT_RATIO_PORTRAIT_DEFAULT.getValue$window_release());
        float f3 = obtainStyledAttributes.getFloat(R.styleable.SplitPairRule_splitMaxAspectRatioInLandscape, SplitRule.SPLIT_MAX_ASPECT_RATIO_LANDSCAPE_DEFAULT.getValue$window_release());
        int i = obtainStyledAttributes.getInt(R.styleable.SplitPairRule_splitLayoutDirection, SplitAttributes.LayoutDirection.LOCALE.getValue$window_release());
        int i2 = obtainStyledAttributes.getInt(R.styleable.SplitPairRule_finishPrimaryWithSecondary, SplitRule.FinishBehavior.NEVER.getValue$window_release());
        int i3 = obtainStyledAttributes.getInt(R.styleable.SplitPairRule_finishSecondaryWithPrimary, SplitRule.FinishBehavior.ALWAYS.getValue$window_release());
        boolean z = obtainStyledAttributes.getBoolean(R.styleable.SplitPairRule_clearTop, false);
        int color = obtainStyledAttributes.getColor(R.styleable.SplitPairRule_animationBackgroundColor, 0);
        int i4 = R.styleable.SplitPairRule_splitOpenAnimation;
        EmbeddingAnimationParams.AnimationSpec animationSpec = EmbeddingAnimationParams.AnimationSpec.DEFAULT;
        int i5 = obtainStyledAttributes.getInt(i4, animationSpec.getValue$window_release());
        int i6 = obtainStyledAttributes.getInt(R.styleable.SplitPairRule_splitCloseAnimation, animationSpec.getValue$window_release());
        int i7 = obtainStyledAttributes.getInt(R.styleable.SplitPairRule_splitChangeAnimation, animationSpec.getValue$window_release());
        obtainStyledAttributes.recycle();
        EmbeddingAnimationParams.Builder animationBackground = new EmbeddingAnimationParams.Builder().setAnimationBackground(EmbeddingAnimationBackground.Companion.buildFromValue$window_release(color));
        EmbeddingAnimationParams.AnimationSpec.Companion companion = EmbeddingAnimationParams.AnimationSpec.Companion;
        SplitAttributes build = new SplitAttributes.Builder().setSplitType(SplitAttributes.SplitType.Companion.buildSplitTypeFromValue$window_release(f)).setLayoutDirection(SplitAttributes.LayoutDirection.Companion.getLayoutDirectionFromValue$window_release(i)).setAnimationParams(animationBackground.setOpenAnimation(companion.getAnimationSpecFromValue$window_release(i5)).setCloseAnimation(companion.getAnimationSpecFromValue$window_release(i6)).setChangeAnimation(companion.getAnimationSpecFromValue$window_release(i7)).build()).build();
        SplitPairRule.Builder minSmallestWidthDp = new SplitPairRule.Builder(ri0.a).setTag(string).setMinWidthDp(integer).setMinHeightDp(integer2).setMinSmallestWidthDp(integer3);
        EmbeddingAspectRatio.Companion companion2 = EmbeddingAspectRatio.Companion;
        SplitPairRule.Builder maxAspectRatioInLandscape = minSmallestWidthDp.setMaxAspectRatioInPortrait(companion2.buildAspectRatioFromValue$window_release(f2)).setMaxAspectRatioInLandscape(companion2.buildAspectRatioFromValue$window_release(f3));
        SplitRule.FinishBehavior.Companion companion3 = SplitRule.FinishBehavior.Companion;
        return maxAspectRatioInLandscape.setFinishPrimaryWithSecondary(companion3.getFinishBehaviorFromValue$window_release(i2)).setFinishSecondaryWithPrimary(companion3.getFinishBehaviorFromValue$window_release(i3)).setClearTop(z).setDefaultSplitAttributes(build).build();
    }

    private final SplitPlaceholderRule parseSplitPlaceholderRule(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(xmlResourceParser, R.styleable.SplitPlaceholderRule, 0, 0);
        String string = obtainStyledAttributes.getString(R.styleable.SplitPlaceholderRule_tag);
        String string2 = obtainStyledAttributes.getString(R.styleable.SplitPlaceholderRule_placeholderActivityName);
        boolean z = obtainStyledAttributes.getBoolean(R.styleable.SplitPlaceholderRule_stickyPlaceholder, false);
        int i = obtainStyledAttributes.getInt(R.styleable.SplitPlaceholderRule_finishPrimaryWithPlaceholder, SplitRule.FinishBehavior.ALWAYS.getValue$window_release());
        if (i == SplitRule.FinishBehavior.NEVER.getValue$window_release()) {
            v5.m("Never is not a valid configuration for Placeholder activities. Please use FINISH_ALWAYS or FINISH_ADJACENT instead or refer to the current API");
            return null;
        }
        float f = obtainStyledAttributes.getFloat(R.styleable.SplitPlaceholderRule_splitRatio, 0.5f);
        int integer = obtainStyledAttributes.getInteger(R.styleable.SplitPlaceholderRule_splitMinWidthDp, 600);
        int integer2 = obtainStyledAttributes.getInteger(R.styleable.SplitPlaceholderRule_splitMinHeightDp, 600);
        int integer3 = obtainStyledAttributes.getInteger(R.styleable.SplitPlaceholderRule_splitMinSmallestWidthDp, 600);
        float f2 = obtainStyledAttributes.getFloat(R.styleable.SplitPlaceholderRule_splitMaxAspectRatioInPortrait, SplitRule.SPLIT_MAX_ASPECT_RATIO_PORTRAIT_DEFAULT.getValue$window_release());
        float f3 = obtainStyledAttributes.getFloat(R.styleable.SplitPlaceholderRule_splitMaxAspectRatioInLandscape, SplitRule.SPLIT_MAX_ASPECT_RATIO_LANDSCAPE_DEFAULT.getValue$window_release());
        int i2 = obtainStyledAttributes.getInt(R.styleable.SplitPlaceholderRule_splitLayoutDirection, SplitAttributes.LayoutDirection.LOCALE.getValue$window_release());
        int color = obtainStyledAttributes.getColor(R.styleable.SplitPlaceholderRule_animationBackgroundColor, 0);
        int i3 = R.styleable.SplitPlaceholderRule_splitOpenAnimation;
        EmbeddingAnimationParams.AnimationSpec animationSpec = EmbeddingAnimationParams.AnimationSpec.DEFAULT;
        int i4 = obtainStyledAttributes.getInt(i3, animationSpec.getValue$window_release());
        int i5 = obtainStyledAttributes.getInt(R.styleable.SplitPlaceholderRule_splitCloseAnimation, animationSpec.getValue$window_release());
        int i6 = obtainStyledAttributes.getInt(R.styleable.SplitPlaceholderRule_splitChangeAnimation, animationSpec.getValue$window_release());
        obtainStyledAttributes.recycle();
        EmbeddingAnimationParams.Builder animationBackground = new EmbeddingAnimationParams.Builder().setAnimationBackground(EmbeddingAnimationBackground.Companion.buildFromValue$window_release(color));
        EmbeddingAnimationParams.AnimationSpec.Companion companion = EmbeddingAnimationParams.AnimationSpec.Companion;
        SplitAttributes build = new SplitAttributes.Builder().setSplitType(SplitAttributes.SplitType.Companion.buildSplitTypeFromValue$window_release(f)).setLayoutDirection(SplitAttributes.LayoutDirection.Companion.getLayoutDirectionFromValue$window_release(i2)).setAnimationParams(animationBackground.setOpenAnimation(companion.getAnimationSpecFromValue$window_release(i4)).setCloseAnimation(companion.getAnimationSpecFromValue$window_release(i5)).setChangeAnimation(companion.getAnimationSpecFromValue$window_release(i6)).build()).build();
        String packageName = context.getApplicationContext().getPackageName();
        RuleParser ruleParser = INSTANCE;
        packageName.getClass();
        Intent component = new Intent().setComponent(ruleParser.buildClassName(packageName, string2));
        component.getClass();
        SplitPlaceholderRule.Builder minSmallestWidthDp = new SplitPlaceholderRule.Builder(ri0.a, component).setTag(string).setMinWidthDp(integer).setMinHeightDp(integer2).setMinSmallestWidthDp(integer3);
        EmbeddingAspectRatio.Companion companion2 = EmbeddingAspectRatio.Companion;
        return minSmallestWidthDp.setMaxAspectRatioInPortrait(companion2.buildAspectRatioFromValue$window_release(f2)).setMaxAspectRatioInLandscape(companion2.buildAspectRatioFromValue$window_release(f3)).setSticky(z).setFinishPrimaryWithPlaceholder(SplitRule.FinishBehavior.Companion.getFinishBehaviorFromValue$window_release(i)).setDefaultSplitAttributes(build).build();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:26:0x004a. Please report as an issue. */
    public final Set<EmbeddingRule> parseRules$window_release(Context context, int i) {
        SplitPlaceholderRule build;
        SplitPairRule build2;
        ActivityRule plus$window_release;
        context.getClass();
        try {
            XmlResourceParser xml = context.getResources().getXml(i);
            xml.getClass();
            HashSet<EmbeddingRule> hashSet = new HashSet<>();
            int depth = xml.getDepth();
            int next = xml.next();
            SplitPairRule splitPairRule = null;
            ActivityRule activityRule = null;
            SplitPlaceholderRule splitPlaceholderRule = null;
            while (next != 1 && (next != 3 || xml.getDepth() > depth)) {
                if (xml.getEventType() != 2 || "split-config".equals(xml.getName())) {
                    next = xml.next();
                } else {
                    String name = xml.getName();
                    if (name != null) {
                        switch (name.hashCode()) {
                            case 304713008:
                                if (name.equals("DividerAttributes")) {
                                    if (splitPairRule != null || splitPlaceholderRule != null) {
                                        DividerAttributes parseDividerAttributes = parseDividerAttributes(context, xml);
                                        if (splitPairRule == null) {
                                            if (splitPlaceholderRule != null) {
                                                hashSet.remove(splitPlaceholderRule);
                                                build = new SplitPlaceholderRule.Builder(splitPlaceholderRule).setDefaultSplitAttributes(new SplitAttributes.Builder(splitPlaceholderRule.getDefaultSplitAttributes()).setDividerAttributes(parseDividerAttributes).build()).build();
                                                addRuleWithDuplicatedTagCheck(hashSet, build);
                                                splitPlaceholderRule = build;
                                                break;
                                            }
                                        } else {
                                            hashSet.remove(splitPairRule);
                                            build2 = new SplitPairRule.Builder(splitPairRule).setDefaultSplitAttributes(new SplitAttributes.Builder(splitPairRule.getDefaultSplitAttributes()).setDividerAttributes(parseDividerAttributes).build()).build();
                                            addRuleWithDuplicatedTagCheck(hashSet, build2);
                                            splitPairRule = build2;
                                            break;
                                        }
                                    } else {
                                        v5.m("Found orphaned DividerAttributes");
                                        return null;
                                    }
                                }
                                break;
                            case 511422343:
                                if (name.equals("ActivityFilter")) {
                                    if (activityRule != null || splitPlaceholderRule != null) {
                                        ActivityFilter parseActivityFilter = parseActivityFilter(context, xml);
                                        if (activityRule == null) {
                                            if (splitPlaceholderRule != null) {
                                                hashSet.remove(splitPlaceholderRule);
                                                build = splitPlaceholderRule.plus$window_release(parseActivityFilter);
                                                addRuleWithDuplicatedTagCheck(hashSet, build);
                                                splitPlaceholderRule = build;
                                                break;
                                            }
                                        } else {
                                            hashSet.remove(activityRule);
                                            plus$window_release = activityRule.plus$window_release(parseActivityFilter);
                                            addRuleWithDuplicatedTagCheck(hashSet, plus$window_release);
                                            activityRule = plus$window_release;
                                            break;
                                        }
                                    } else {
                                        v5.m("Found orphaned ActivityFilter");
                                        return null;
                                    }
                                }
                                break;
                            case 520447504:
                                if (name.equals("SplitPairRule")) {
                                    build2 = parseSplitPairRule(context, xml);
                                    addRuleWithDuplicatedTagCheck(hashSet, build2);
                                    activityRule = null;
                                    splitPlaceholderRule = null;
                                    splitPairRule = build2;
                                    break;
                                }
                                break;
                            case 1579230604:
                                if (name.equals("SplitPairFilter")) {
                                    if (splitPairRule == null) {
                                        v5.m("Found orphaned SplitPairFilter outside of SplitPairRule");
                                        return null;
                                    }
                                    SplitPairFilter parseSplitPairFilter = parseSplitPairFilter(context, xml);
                                    hashSet.remove(splitPairRule);
                                    build2 = splitPairRule.plus$window_release(parseSplitPairFilter);
                                    addRuleWithDuplicatedTagCheck(hashSet, build2);
                                    splitPairRule = build2;
                                    break;
                                }
                                break;
                            case 1793077963:
                                if (name.equals("ActivityRule")) {
                                    plus$window_release = parseActivityRule(context, xml);
                                    addRuleWithDuplicatedTagCheck(hashSet, plus$window_release);
                                    splitPairRule = null;
                                    splitPlaceholderRule = null;
                                    activityRule = plus$window_release;
                                    break;
                                }
                                break;
                            case 2050988213:
                                if (name.equals("SplitPlaceholderRule")) {
                                    build = parseSplitPlaceholderRule(context, xml);
                                    addRuleWithDuplicatedTagCheck(hashSet, build);
                                    splitPairRule = null;
                                    activityRule = null;
                                    splitPlaceholderRule = build;
                                    break;
                                }
                                break;
                        }
                    }
                    next = xml.next();
                }
            }
            return hashSet;
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }
}
