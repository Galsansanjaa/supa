package androidx.compose.ui.text;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.TextUnit;
import androidx.core.view.ViewCompat;
import defpackage.hd0;
import defpackage.jh2;
import defpackage.lt;
import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class TextStyle {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final TextStyle Default = new TextStyle(0, 0, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, ViewCompat.MEASURED_SIZE_MASK, (sb0) null);
    private final ParagraphStyle paragraphStyle;
    private final PlatformTextStyle platformStyle;
    private final SpanStyle spanStyle;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        public static /* synthetic */ void getDefault$annotations() {
        }

        public final TextStyle getDefault() {
            return TextStyle.Default;
        }
    }

    private TextStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i, int i2, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i3, int i4, TextMotion textMotion) {
        this(new SpanStyle(j, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (sb0) null), new ParagraphStyle(i, i2, j5, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, i3, i4, textMotion, (sb0) null), platformTextStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ TextStyle(long r31, long r33, androidx.compose.ui.text.font.FontWeight r35, androidx.compose.ui.text.font.FontStyle r36, androidx.compose.ui.text.font.FontSynthesis r37, androidx.compose.ui.text.font.FontFamily r38, java.lang.String r39, long r40, androidx.compose.ui.text.style.BaselineShift r42, androidx.compose.ui.text.style.TextGeometricTransform r43, androidx.compose.ui.text.intl.LocaleList r44, long r45, androidx.compose.ui.text.style.TextDecoration r47, androidx.compose.ui.graphics.Shadow r48, androidx.compose.ui.graphics.drawscope.DrawStyle r49, int r50, int r51, long r52, androidx.compose.ui.text.style.TextIndent r54, androidx.compose.ui.text.PlatformTextStyle r55, androidx.compose.ui.text.style.LineHeightStyle r56, int r57, int r58, androidx.compose.ui.text.style.TextMotion r59, int r60, defpackage.sb0 r61) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.TextStyle.<init>(long, long, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontSynthesis, androidx.compose.ui.text.font.FontFamily, java.lang.String, long, androidx.compose.ui.text.style.BaselineShift, androidx.compose.ui.text.style.TextGeometricTransform, androidx.compose.ui.text.intl.LocaleList, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.graphics.Shadow, androidx.compose.ui.graphics.drawscope.DrawStyle, int, int, long, androidx.compose.ui.text.style.TextIndent, androidx.compose.ui.text.PlatformTextStyle, androidx.compose.ui.text.style.LineHeightStyle, int, int, androidx.compose.ui.text.style.TextMotion, int, sb0):void");
    }

    public /* synthetic */ TextStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i, int i2, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i3, int i4, TextMotion textMotion, sb0 sb0Var) {
        this(j, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, drawStyle, i, i2, j5, textIndent, platformTextStyle, lineHeightStyle, i3, i4, textMotion);
    }

    private TextStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        this(new SpanStyle(j, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (sb0) null), new ParagraphStyle(textAlign != null ? textAlign.m7938unboximpl() : TextAlign.Companion.m7945getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m7955unboximpl() : TextDirection.Companion.m7961getUnspecifieds_7Xco(), j5, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, lineBreak != null ? lineBreak.m7849unboximpl() : LineBreak.Companion.m7857getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m7830unboximpl() : Hyphens.Companion.m7833getUnspecifiedvmbZdU8(), textMotion, (sb0) null), platformTextStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ TextStyle(long r31, long r33, androidx.compose.ui.text.font.FontWeight r35, androidx.compose.ui.text.font.FontStyle r36, androidx.compose.ui.text.font.FontSynthesis r37, androidx.compose.ui.text.font.FontFamily r38, java.lang.String r39, long r40, androidx.compose.ui.text.style.BaselineShift r42, androidx.compose.ui.text.style.TextGeometricTransform r43, androidx.compose.ui.text.intl.LocaleList r44, long r45, androidx.compose.ui.text.style.TextDecoration r47, androidx.compose.ui.graphics.Shadow r48, androidx.compose.ui.graphics.drawscope.DrawStyle r49, androidx.compose.ui.text.style.TextAlign r50, androidx.compose.ui.text.style.TextDirection r51, long r52, androidx.compose.ui.text.style.TextIndent r54, androidx.compose.ui.text.PlatformTextStyle r55, androidx.compose.ui.text.style.LineHeightStyle r56, androidx.compose.ui.text.style.LineBreak r57, androidx.compose.ui.text.style.Hyphens r58, androidx.compose.ui.text.style.TextMotion r59, int r60, defpackage.sb0 r61) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.TextStyle.<init>(long, long, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontSynthesis, androidx.compose.ui.text.font.FontFamily, java.lang.String, long, androidx.compose.ui.text.style.BaselineShift, androidx.compose.ui.text.style.TextGeometricTransform, androidx.compose.ui.text.intl.LocaleList, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.graphics.Shadow, androidx.compose.ui.graphics.drawscope.DrawStyle, androidx.compose.ui.text.style.TextAlign, androidx.compose.ui.text.style.TextDirection, long, androidx.compose.ui.text.style.TextIndent, androidx.compose.ui.text.PlatformTextStyle, androidx.compose.ui.text.style.LineHeightStyle, androidx.compose.ui.text.style.LineBreak, androidx.compose.ui.text.style.Hyphens, androidx.compose.ui.text.style.TextMotion, int, sb0):void");
    }

    @hd0
    public /* synthetic */ TextStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, sb0 sb0Var) {
        this(j, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, drawStyle, textAlign, textDirection, j5, textIndent, platformTextStyle, lineHeightStyle, lineBreak, hyphens, textMotion);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private TextStyle(long r23, long r25, androidx.compose.ui.text.font.FontWeight r27, androidx.compose.ui.text.font.FontStyle r28, androidx.compose.ui.text.font.FontSynthesis r29, androidx.compose.ui.text.font.FontFamily r30, java.lang.String r31, long r32, androidx.compose.ui.text.style.BaselineShift r34, androidx.compose.ui.text.style.TextGeometricTransform r35, androidx.compose.ui.text.intl.LocaleList r36, long r37, androidx.compose.ui.text.style.TextDecoration r39, androidx.compose.ui.graphics.Shadow r40, androidx.compose.ui.text.style.TextAlign r41, androidx.compose.ui.text.style.TextDirection r42, long r43, androidx.compose.ui.text.style.TextIndent r45) {
        /*
            r22 = this;
            androidx.compose.ui.text.SpanStyle r0 = new androidx.compose.ui.text.SpanStyle
            r20 = 0
            r21 = 0
            r19 = 0
            r1 = r23
            r3 = r25
            r5 = r27
            r6 = r28
            r7 = r29
            r8 = r30
            r9 = r31
            r10 = r32
            r12 = r34
            r13 = r35
            r14 = r36
            r15 = r37
            r17 = r39
            r18 = r40
            r0.<init>(r1, r3, r5, r6, r7, r8, r9, r10, r12, r13, r14, r15, r17, r18, r19, r20, r21)
            androidx.compose.ui.text.ParagraphStyle r1 = new androidx.compose.ui.text.ParagraphStyle
            if (r41 == 0) goto L30
            int r2 = r41.m7938unboximpl()
            goto L36
        L30:
            androidx.compose.ui.text.style.TextAlign$Companion r2 = androidx.compose.ui.text.style.TextAlign.Companion
            int r2 = r2.m7945getUnspecifiede0LSkKk()
        L36:
            if (r42 == 0) goto L3d
            int r3 = r42.m7955unboximpl()
            goto L43
        L3d:
            androidx.compose.ui.text.style.TextDirection$Companion r3 = androidx.compose.ui.text.style.TextDirection.Companion
            int r3 = r3.m7961getUnspecifieds_7Xco()
        L43:
            androidx.compose.ui.text.style.LineBreak$Companion r4 = androidx.compose.ui.text.style.LineBreak.Companion
            int r4 = r4.m7857getUnspecifiedrAG3T2k()
            androidx.compose.ui.text.style.Hyphens$Companion r5 = androidx.compose.ui.text.style.Hyphens.Companion
            int r5 = r5.m7833getUnspecifiedvmbZdU8()
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r26 = r43
            r28 = r45
            r23 = r1
            r24 = r2
            r25 = r3
            r31 = r4
            r32 = r5
            r33 = r6
            r34 = r7
            r29 = r8
            r30 = r9
            r23.<init>(r24, r25, r26, r28, r29, r30, r31, r32, r33, r34)
            r2 = 0
            r3 = r22
            r3.<init>(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.TextStyle.<init>(long, long, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontSynthesis, androidx.compose.ui.text.font.FontFamily, java.lang.String, long, androidx.compose.ui.text.style.BaselineShift, androidx.compose.ui.text.style.TextGeometricTransform, androidx.compose.ui.text.intl.LocaleList, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.graphics.Shadow, androidx.compose.ui.text.style.TextAlign, androidx.compose.ui.text.style.TextDirection, long, androidx.compose.ui.text.style.TextIndent):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ TextStyle(long r25, long r27, androidx.compose.ui.text.font.FontWeight r29, androidx.compose.ui.text.font.FontStyle r30, androidx.compose.ui.text.font.FontSynthesis r31, androidx.compose.ui.text.font.FontFamily r32, java.lang.String r33, long r34, androidx.compose.ui.text.style.BaselineShift r36, androidx.compose.ui.text.style.TextGeometricTransform r37, androidx.compose.ui.text.intl.LocaleList r38, long r39, androidx.compose.ui.text.style.TextDecoration r41, androidx.compose.ui.graphics.Shadow r42, androidx.compose.ui.text.style.TextAlign r43, androidx.compose.ui.text.style.TextDirection r44, long r45, androidx.compose.ui.text.style.TextIndent r47, int r48, defpackage.sb0 r49) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.TextStyle.<init>(long, long, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontSynthesis, androidx.compose.ui.text.font.FontFamily, java.lang.String, long, androidx.compose.ui.text.style.BaselineShift, androidx.compose.ui.text.style.TextGeometricTransform, androidx.compose.ui.text.intl.LocaleList, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.graphics.Shadow, androidx.compose.ui.text.style.TextAlign, androidx.compose.ui.text.style.TextDirection, long, androidx.compose.ui.text.style.TextIndent, int, sb0):void");
    }

    private TextStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle) {
        this(new SpanStyle(j, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, (DrawStyle) null, (sb0) null), new ParagraphStyle(textAlign != null ? textAlign.m7938unboximpl() : TextAlign.Companion.m7945getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m7955unboximpl() : TextDirection.Companion.m7961getUnspecifieds_7Xco(), j5, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, LineBreak.Companion.m7857getUnspecifiedrAG3T2k(), Hyphens.Companion.m7833getUnspecifiedvmbZdU8(), (TextMotion) null, (sb0) null), platformTextStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ TextStyle(long r27, long r29, androidx.compose.ui.text.font.FontWeight r31, androidx.compose.ui.text.font.FontStyle r32, androidx.compose.ui.text.font.FontSynthesis r33, androidx.compose.ui.text.font.FontFamily r34, java.lang.String r35, long r36, androidx.compose.ui.text.style.BaselineShift r38, androidx.compose.ui.text.style.TextGeometricTransform r39, androidx.compose.ui.text.intl.LocaleList r40, long r41, androidx.compose.ui.text.style.TextDecoration r43, androidx.compose.ui.graphics.Shadow r44, androidx.compose.ui.text.style.TextAlign r45, androidx.compose.ui.text.style.TextDirection r46, long r47, androidx.compose.ui.text.style.TextIndent r49, androidx.compose.ui.text.PlatformTextStyle r50, androidx.compose.ui.text.style.LineHeightStyle r51, int r52, defpackage.sb0 r53) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.TextStyle.<init>(long, long, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontSynthesis, androidx.compose.ui.text.font.FontFamily, java.lang.String, long, androidx.compose.ui.text.style.BaselineShift, androidx.compose.ui.text.style.TextGeometricTransform, androidx.compose.ui.text.intl.LocaleList, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.graphics.Shadow, androidx.compose.ui.text.style.TextAlign, androidx.compose.ui.text.style.TextDirection, long, androidx.compose.ui.text.style.TextIndent, androidx.compose.ui.text.PlatformTextStyle, androidx.compose.ui.text.style.LineHeightStyle, int, sb0):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private TextStyle(long r26, long r28, androidx.compose.ui.text.font.FontWeight r30, androidx.compose.ui.text.font.FontStyle r31, androidx.compose.ui.text.font.FontSynthesis r32, androidx.compose.ui.text.font.FontFamily r33, java.lang.String r34, long r35, androidx.compose.ui.text.style.BaselineShift r37, androidx.compose.ui.text.style.TextGeometricTransform r38, androidx.compose.ui.text.intl.LocaleList r39, long r40, androidx.compose.ui.text.style.TextDecoration r42, androidx.compose.ui.graphics.Shadow r43, androidx.compose.ui.text.style.TextAlign r44, androidx.compose.ui.text.style.TextDirection r45, long r46, androidx.compose.ui.text.style.TextIndent r48, androidx.compose.ui.text.PlatformTextStyle r49, androidx.compose.ui.text.style.LineHeightStyle r50, androidx.compose.ui.text.style.LineBreak r51, androidx.compose.ui.text.style.Hyphens r52) {
        /*
            r25 = this;
            r0 = r49
            androidx.compose.ui.text.SpanStyle r1 = new androidx.compose.ui.text.SpanStyle
            r24 = 0
            if (r0 == 0) goto Lf
            androidx.compose.ui.text.PlatformSpanStyle r2 = r0.getSpanStyle()
            r20 = r2
            goto L11
        Lf:
            r20 = r24
        L11:
            r22 = 32768(0x8000, float:4.5918E-41)
            r23 = 0
            r21 = 0
            r2 = r26
            r4 = r28
            r6 = r30
            r7 = r31
            r8 = r32
            r9 = r33
            r10 = r34
            r11 = r35
            r13 = r37
            r14 = r38
            r15 = r39
            r16 = r40
            r18 = r42
            r19 = r43
            r1.<init>(r2, r4, r6, r7, r8, r9, r10, r11, r13, r14, r15, r16, r18, r19, r20, r21, r22, r23)
            androidx.compose.ui.text.ParagraphStyle r2 = new androidx.compose.ui.text.ParagraphStyle
            if (r44 == 0) goto L40
            int r3 = r44.m7938unboximpl()
            goto L46
        L40:
            androidx.compose.ui.text.style.TextAlign$Companion r3 = androidx.compose.ui.text.style.TextAlign.Companion
            int r3 = r3.m7945getUnspecifiede0LSkKk()
        L46:
            if (r45 == 0) goto L4d
            int r4 = r45.m7955unboximpl()
            goto L53
        L4d:
            androidx.compose.ui.text.style.TextDirection$Companion r4 = androidx.compose.ui.text.style.TextDirection.Companion
            int r4 = r4.m7961getUnspecifieds_7Xco()
        L53:
            if (r0 == 0) goto L59
            androidx.compose.ui.text.PlatformParagraphStyle r24 = r0.getParagraphStyle()
        L59:
            if (r51 == 0) goto L60
            int r5 = r51.m7849unboximpl()
            goto L66
        L60:
            androidx.compose.ui.text.style.LineBreak$Companion r5 = androidx.compose.ui.text.style.LineBreak.Companion
            int r5 = r5.m7857getUnspecifiedrAG3T2k()
        L66:
            if (r52 == 0) goto L6d
            int r6 = r52.m7830unboximpl()
            goto L73
        L6d:
            androidx.compose.ui.text.style.Hyphens$Companion r6 = androidx.compose.ui.text.style.Hyphens.Companion
            int r6 = r6.m7833getUnspecifiedvmbZdU8()
        L73:
            r7 = 256(0x100, float:3.59E-43)
            r8 = 0
            r9 = 0
            r29 = r46
            r31 = r48
            r33 = r50
            r26 = r2
            r27 = r3
            r28 = r4
            r34 = r5
            r35 = r6
            r37 = r7
            r38 = r8
            r36 = r9
            r32 = r24
            r26.<init>(r27, r28, r29, r31, r32, r33, r34, r35, r36, r37, r38)
            r2 = r25
            r3 = r26
            r2.<init>(r1, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.TextStyle.<init>(long, long, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontSynthesis, androidx.compose.ui.text.font.FontFamily, java.lang.String, long, androidx.compose.ui.text.style.BaselineShift, androidx.compose.ui.text.style.TextGeometricTransform, androidx.compose.ui.text.intl.LocaleList, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.graphics.Shadow, androidx.compose.ui.text.style.TextAlign, androidx.compose.ui.text.style.TextDirection, long, androidx.compose.ui.text.style.TextIndent, androidx.compose.ui.text.PlatformTextStyle, androidx.compose.ui.text.style.LineHeightStyle, androidx.compose.ui.text.style.LineBreak, androidx.compose.ui.text.style.Hyphens):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ TextStyle(long r29, long r31, androidx.compose.ui.text.font.FontWeight r33, androidx.compose.ui.text.font.FontStyle r34, androidx.compose.ui.text.font.FontSynthesis r35, androidx.compose.ui.text.font.FontFamily r36, java.lang.String r37, long r38, androidx.compose.ui.text.style.BaselineShift r40, androidx.compose.ui.text.style.TextGeometricTransform r41, androidx.compose.ui.text.intl.LocaleList r42, long r43, androidx.compose.ui.text.style.TextDecoration r45, androidx.compose.ui.graphics.Shadow r46, androidx.compose.ui.text.style.TextAlign r47, androidx.compose.ui.text.style.TextDirection r48, long r49, androidx.compose.ui.text.style.TextIndent r51, androidx.compose.ui.text.PlatformTextStyle r52, androidx.compose.ui.text.style.LineHeightStyle r53, androidx.compose.ui.text.style.LineBreak r54, androidx.compose.ui.text.style.Hyphens r55, int r56, defpackage.sb0 r57) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.TextStyle.<init>(long, long, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontSynthesis, androidx.compose.ui.text.font.FontFamily, java.lang.String, long, androidx.compose.ui.text.style.BaselineShift, androidx.compose.ui.text.style.TextGeometricTransform, androidx.compose.ui.text.intl.LocaleList, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.graphics.Shadow, androidx.compose.ui.text.style.TextAlign, androidx.compose.ui.text.style.TextDirection, long, androidx.compose.ui.text.style.TextIndent, androidx.compose.ui.text.PlatformTextStyle, androidx.compose.ui.text.style.LineHeightStyle, androidx.compose.ui.text.style.LineBreak, androidx.compose.ui.text.style.Hyphens, int, sb0):void");
    }

    @hd0
    public /* synthetic */ TextStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, sb0 sb0Var) {
        this(j, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, textAlign, textDirection, j5, textIndent, platformTextStyle, lineHeightStyle, lineBreak, hyphens);
    }

    @hd0
    public /* synthetic */ TextStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, sb0 sb0Var) {
        this(j, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, textAlign, textDirection, j5, textIndent, platformTextStyle, lineHeightStyle);
    }

    @hd0
    public /* synthetic */ TextStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, sb0 sb0Var) {
        this(j, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, textAlign, textDirection, j5, textIndent);
    }

    private TextStyle(Brush brush, float f, long j, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j2, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j3, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i, int i2, long j4, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i3, int i4, TextMotion textMotion) {
        this(new SpanStyle(brush, f, j, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j2, baselineShift, textGeometricTransform, localeList, j3, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (sb0) null), new ParagraphStyle(i, i2, j4, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, i3, i4, textMotion, (sb0) null), platformTextStyle);
    }

    public /* synthetic */ TextStyle(Brush brush, float f, long j, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j2, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j3, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i, int i2, long j4, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i3, int i4, TextMotion textMotion, int i5, sb0 sb0Var) {
        this(brush, (i5 & 2) != 0 ? Float.NaN : f, (i5 & 4) != 0 ? TextUnit.Companion.m8250getUnspecifiedXSAIIZE() : j, (i5 & 8) != 0 ? null : fontWeight, (i5 & 16) != 0 ? null : fontStyle, (i5 & 32) != 0 ? null : fontSynthesis, (i5 & 64) != 0 ? null : fontFamily, (i5 & 128) != 0 ? null : str, (i5 & 256) != 0 ? TextUnit.Companion.m8250getUnspecifiedXSAIIZE() : j2, (i5 & 512) != 0 ? null : baselineShift, (i5 & 1024) != 0 ? null : textGeometricTransform, (i5 & 2048) != 0 ? null : localeList, (i5 & 4096) != 0 ? Color.Companion.m5368getUnspecified0d7_KjU() : j3, (i5 & 8192) != 0 ? null : textDecoration, (i5 & 16384) != 0 ? null : shadow, (32768 & i5) != 0 ? null : drawStyle, (65536 & i5) != 0 ? TextAlign.Companion.m7945getUnspecifiede0LSkKk() : i, (131072 & i5) != 0 ? TextDirection.Companion.m7961getUnspecifieds_7Xco() : i2, (262144 & i5) != 0 ? TextUnit.Companion.m8250getUnspecifiedXSAIIZE() : j4, (524288 & i5) != 0 ? null : textIndent, (1048576 & i5) != 0 ? null : platformTextStyle, (2097152 & i5) != 0 ? null : lineHeightStyle, (4194304 & i5) != 0 ? LineBreak.Companion.m7857getUnspecifiedrAG3T2k() : i3, (8388608 & i5) != 0 ? Hyphens.Companion.m7833getUnspecifiedvmbZdU8() : i4, (i5 & 16777216) != 0 ? null : textMotion, (sb0) null);
    }

    public /* synthetic */ TextStyle(Brush brush, float f, long j, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j2, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j3, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i, int i2, long j4, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i3, int i4, TextMotion textMotion, sb0 sb0Var) {
        this(brush, f, j, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j2, baselineShift, textGeometricTransform, localeList, j3, textDecoration, shadow, drawStyle, i, i2, j4, textIndent, platformTextStyle, lineHeightStyle, i3, i4, textMotion);
    }

    private TextStyle(Brush brush, float f, long j, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j2, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j3, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j4, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        this(new SpanStyle(brush, f, j, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j2, baselineShift, textGeometricTransform, localeList, j3, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (sb0) null), new ParagraphStyle(textAlign != null ? textAlign.m7938unboximpl() : TextAlign.Companion.m7945getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m7955unboximpl() : TextDirection.Companion.m7961getUnspecifieds_7Xco(), j4, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, lineBreak != null ? lineBreak.m7849unboximpl() : LineBreak.Companion.m7857getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m7830unboximpl() : Hyphens.Companion.m7833getUnspecifiedvmbZdU8(), textMotion, (sb0) null), platformTextStyle);
    }

    public /* synthetic */ TextStyle(Brush brush, float f, long j, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j2, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j3, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j4, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, int i, sb0 sb0Var) {
        this(brush, (i & 2) != 0 ? Float.NaN : f, (i & 4) != 0 ? TextUnit.Companion.m8250getUnspecifiedXSAIIZE() : j, (i & 8) != 0 ? null : fontWeight, (i & 16) != 0 ? null : fontStyle, (i & 32) != 0 ? null : fontSynthesis, (i & 64) != 0 ? null : fontFamily, (i & 128) != 0 ? null : str, (i & 256) != 0 ? TextUnit.Companion.m8250getUnspecifiedXSAIIZE() : j2, (i & 512) != 0 ? null : baselineShift, (i & 1024) != 0 ? null : textGeometricTransform, (i & 2048) != 0 ? null : localeList, (i & 4096) != 0 ? Color.Companion.m5368getUnspecified0d7_KjU() : j3, (i & 8192) != 0 ? null : textDecoration, (i & 16384) != 0 ? null : shadow, (32768 & i) != 0 ? null : drawStyle, (65536 & i) != 0 ? null : textAlign, (131072 & i) != 0 ? null : textDirection, (262144 & i) != 0 ? TextUnit.Companion.m8250getUnspecifiedXSAIIZE() : j4, (524288 & i) != 0 ? null : textIndent, (1048576 & i) != 0 ? null : platformTextStyle, (2097152 & i) != 0 ? null : lineHeightStyle, (4194304 & i) != 0 ? null : lineBreak, (8388608 & i) != 0 ? null : hyphens, (i & 16777216) != 0 ? null : textMotion, (sb0) null);
    }

    @hd0
    public /* synthetic */ TextStyle(Brush brush, float f, long j, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j2, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j3, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j4, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, sb0 sb0Var) {
        this(brush, f, j, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j2, baselineShift, textGeometricTransform, localeList, j3, textDecoration, shadow, drawStyle, textAlign, textDirection, j4, textIndent, platformTextStyle, lineHeightStyle, lineBreak, hyphens, textMotion);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TextStyle(androidx.compose.ui.text.SpanStyle r3, androidx.compose.ui.text.ParagraphStyle r4) {
        /*
            r2 = this;
            androidx.compose.ui.text.PlatformSpanStyle r0 = r3.getPlatformStyle()
            androidx.compose.ui.text.PlatformParagraphStyle r1 = r4.getPlatformStyle()
            androidx.compose.ui.text.PlatformTextStyle r0 = androidx.compose.ui.text.TextStyleKt.access$createPlatformTextStyleInternal(r0, r1)
            r2.<init>(r3, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.TextStyle.<init>(androidx.compose.ui.text.SpanStyle, androidx.compose.ui.text.ParagraphStyle):void");
    }

    public TextStyle(SpanStyle spanStyle, ParagraphStyle paragraphStyle, PlatformTextStyle platformTextStyle) {
        this.spanStyle = spanStyle;
        this.paragraphStyle = paragraphStyle;
        this.platformStyle = platformTextStyle;
    }

    public /* synthetic */ TextStyle(SpanStyle spanStyle, ParagraphStyle paragraphStyle, PlatformTextStyle platformTextStyle, int i, sb0 sb0Var) {
        this(spanStyle, paragraphStyle, (i & 4) != 0 ? null : platformTextStyle);
    }

    /* renamed from: copy-CXVQc50$default */
    public static /* synthetic */ TextStyle m7494copyCXVQc50$default(TextStyle textStyle, long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, int i, Object obj) {
        Hyphens hyphens2;
        LineBreak lineBreak2;
        long m7427getColor0d7_KjU = (i & 1) != 0 ? textStyle.spanStyle.m7427getColor0d7_KjU() : j;
        long m7428getFontSizeXSAIIZE = (i & 2) != 0 ? textStyle.spanStyle.m7428getFontSizeXSAIIZE() : j2;
        FontWeight fontWeight2 = (i & 4) != 0 ? textStyle.spanStyle.getFontWeight() : fontWeight;
        FontStyle m7429getFontStyle4Lr2A7w = (i & 8) != 0 ? textStyle.spanStyle.m7429getFontStyle4Lr2A7w() : fontStyle;
        FontSynthesis m7430getFontSynthesisZQGJjVo = (i & 16) != 0 ? textStyle.spanStyle.m7430getFontSynthesisZQGJjVo() : fontSynthesis;
        FontFamily fontFamily2 = (i & 32) != 0 ? textStyle.spanStyle.getFontFamily() : fontFamily;
        String fontFeatureSettings = (i & 64) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : str;
        long m7431getLetterSpacingXSAIIZE = (i & 128) != 0 ? textStyle.spanStyle.m7431getLetterSpacingXSAIIZE() : j3;
        BaselineShift m7426getBaselineShift5SSeXJ0 = (i & 256) != 0 ? textStyle.spanStyle.m7426getBaselineShift5SSeXJ0() : baselineShift;
        TextGeometricTransform textGeometricTransform2 = (i & 512) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : textGeometricTransform;
        LocaleList localeList2 = (i & 1024) != 0 ? textStyle.spanStyle.getLocaleList() : localeList;
        long j6 = m7427getColor0d7_KjU;
        long m7425getBackground0d7_KjU = (i & 2048) != 0 ? textStyle.spanStyle.m7425getBackground0d7_KjU() : j4;
        TextDecoration textDecoration2 = (i & 4096) != 0 ? textStyle.spanStyle.getTextDecoration() : textDecoration;
        Shadow shadow2 = (i & 8192) != 0 ? textStyle.spanStyle.getShadow() : shadow;
        TextDecoration textDecoration3 = textDecoration2;
        TextAlign m7932boximpl = (i & 16384) != 0 ? TextAlign.m7932boximpl(textStyle.paragraphStyle.m7391getTextAligne0LSkKk()) : textAlign;
        TextDirection m7949boximpl = (i & 32768) != 0 ? TextDirection.m7949boximpl(textStyle.paragraphStyle.m7393getTextDirections_7Xco()) : textDirection;
        long m7389getLineHeightXSAIIZE = (i & 65536) != 0 ? textStyle.paragraphStyle.m7389getLineHeightXSAIIZE() : j5;
        TextIndent textIndent2 = (i & 131072) != 0 ? textStyle.paragraphStyle.getTextIndent() : textIndent;
        PlatformTextStyle platformTextStyle2 = (i & 262144) != 0 ? textStyle.platformStyle : platformTextStyle;
        LineHeightStyle lineHeightStyle2 = (i & 524288) != 0 ? textStyle.paragraphStyle.getLineHeightStyle() : lineHeightStyle;
        LineBreak m7837boximpl = (i & 1048576) != 0 ? LineBreak.m7837boximpl(textStyle.paragraphStyle.m7388getLineBreakrAG3T2k()) : lineBreak;
        if ((i & 2097152) != 0) {
            lineBreak2 = m7837boximpl;
            hyphens2 = Hyphens.m7824boximpl(textStyle.paragraphStyle.m7386getHyphensvmbZdU8());
        } else {
            hyphens2 = hyphens;
            lineBreak2 = m7837boximpl;
        }
        return textStyle.m7507copyCXVQc50(j6, m7428getFontSizeXSAIIZE, fontWeight2, m7429getFontStyle4Lr2A7w, m7430getFontSynthesisZQGJjVo, fontFamily2, fontFeatureSettings, m7431getLetterSpacingXSAIIZE, m7426getBaselineShift5SSeXJ0, textGeometricTransform2, localeList2, m7425getBackground0d7_KjU, textDecoration3, shadow2, m7932boximpl, m7949boximpl, m7389getLineHeightXSAIIZE, textIndent2, platformTextStyle2, lineHeightStyle2, lineBreak2, hyphens2);
    }

    /* renamed from: copy-HL5avdY$default */
    public static /* synthetic */ TextStyle m7495copyHL5avdY$default(TextStyle textStyle, long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, int i, Object obj) {
        long m7427getColor0d7_KjU = (i & 1) != 0 ? textStyle.spanStyle.m7427getColor0d7_KjU() : j;
        return textStyle.m7508copyHL5avdY(m7427getColor0d7_KjU, (i & 2) != 0 ? textStyle.spanStyle.m7428getFontSizeXSAIIZE() : j2, (i & 4) != 0 ? textStyle.spanStyle.getFontWeight() : fontWeight, (i & 8) != 0 ? textStyle.spanStyle.m7429getFontStyle4Lr2A7w() : fontStyle, (i & 16) != 0 ? textStyle.spanStyle.m7430getFontSynthesisZQGJjVo() : fontSynthesis, (i & 32) != 0 ? textStyle.spanStyle.getFontFamily() : fontFamily, (i & 64) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : str, (i & 128) != 0 ? textStyle.spanStyle.m7431getLetterSpacingXSAIIZE() : j3, (i & 256) != 0 ? textStyle.spanStyle.m7426getBaselineShift5SSeXJ0() : baselineShift, (i & 512) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : textGeometricTransform, (i & 1024) != 0 ? textStyle.spanStyle.getLocaleList() : localeList, (i & 2048) != 0 ? textStyle.spanStyle.m7425getBackground0d7_KjU() : j4, (i & 4096) != 0 ? textStyle.spanStyle.getTextDecoration() : textDecoration, (i & 8192) != 0 ? textStyle.spanStyle.getShadow() : shadow, (i & 16384) != 0 ? TextAlign.m7932boximpl(textStyle.paragraphStyle.m7391getTextAligne0LSkKk()) : textAlign, (i & 32768) != 0 ? TextDirection.m7949boximpl(textStyle.paragraphStyle.m7393getTextDirections_7Xco()) : textDirection, (i & 65536) != 0 ? textStyle.paragraphStyle.m7389getLineHeightXSAIIZE() : j5, (i & 131072) != 0 ? textStyle.paragraphStyle.getTextIndent() : textIndent);
    }

    /* renamed from: copy-NOaFTUo$default */
    public static /* synthetic */ TextStyle m7496copyNOaFTUo$default(TextStyle textStyle, long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i, Object obj) {
        LineHeightStyle lineHeightStyle2;
        PlatformTextStyle platformTextStyle2;
        long m7427getColor0d7_KjU = (i & 1) != 0 ? textStyle.spanStyle.m7427getColor0d7_KjU() : j;
        long m7428getFontSizeXSAIIZE = (i & 2) != 0 ? textStyle.spanStyle.m7428getFontSizeXSAIIZE() : j2;
        FontWeight fontWeight2 = (i & 4) != 0 ? textStyle.spanStyle.getFontWeight() : fontWeight;
        FontStyle m7429getFontStyle4Lr2A7w = (i & 8) != 0 ? textStyle.spanStyle.m7429getFontStyle4Lr2A7w() : fontStyle;
        FontSynthesis m7430getFontSynthesisZQGJjVo = (i & 16) != 0 ? textStyle.spanStyle.m7430getFontSynthesisZQGJjVo() : fontSynthesis;
        FontFamily fontFamily2 = (i & 32) != 0 ? textStyle.spanStyle.getFontFamily() : fontFamily;
        String fontFeatureSettings = (i & 64) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : str;
        long m7431getLetterSpacingXSAIIZE = (i & 128) != 0 ? textStyle.spanStyle.m7431getLetterSpacingXSAIIZE() : j3;
        BaselineShift m7426getBaselineShift5SSeXJ0 = (i & 256) != 0 ? textStyle.spanStyle.m7426getBaselineShift5SSeXJ0() : baselineShift;
        TextGeometricTransform textGeometricTransform2 = (i & 512) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : textGeometricTransform;
        LocaleList localeList2 = (i & 1024) != 0 ? textStyle.spanStyle.getLocaleList() : localeList;
        long j6 = m7427getColor0d7_KjU;
        long m7425getBackground0d7_KjU = (i & 2048) != 0 ? textStyle.spanStyle.m7425getBackground0d7_KjU() : j4;
        TextDecoration textDecoration2 = (i & 4096) != 0 ? textStyle.spanStyle.getTextDecoration() : textDecoration;
        Shadow shadow2 = (i & 8192) != 0 ? textStyle.spanStyle.getShadow() : shadow;
        TextDecoration textDecoration3 = textDecoration2;
        TextAlign m7932boximpl = (i & 16384) != 0 ? TextAlign.m7932boximpl(textStyle.paragraphStyle.m7391getTextAligne0LSkKk()) : textAlign;
        TextDirection m7949boximpl = (i & 32768) != 0 ? TextDirection.m7949boximpl(textStyle.paragraphStyle.m7393getTextDirections_7Xco()) : textDirection;
        long m7389getLineHeightXSAIIZE = (i & 65536) != 0 ? textStyle.paragraphStyle.m7389getLineHeightXSAIIZE() : j5;
        TextIndent textIndent2 = (i & 131072) != 0 ? textStyle.paragraphStyle.getTextIndent() : textIndent;
        PlatformTextStyle platformTextStyle3 = (i & 262144) != 0 ? textStyle.platformStyle : platformTextStyle;
        if ((i & 524288) != 0) {
            platformTextStyle2 = platformTextStyle3;
            lineHeightStyle2 = textStyle.paragraphStyle.getLineHeightStyle();
        } else {
            lineHeightStyle2 = lineHeightStyle;
            platformTextStyle2 = platformTextStyle3;
        }
        return textStyle.m7509copyNOaFTUo(j6, m7428getFontSizeXSAIIZE, fontWeight2, m7429getFontStyle4Lr2A7w, m7430getFontSynthesisZQGJjVo, fontFamily2, fontFeatureSettings, m7431getLetterSpacingXSAIIZE, m7426getBaselineShift5SSeXJ0, textGeometricTransform2, localeList2, m7425getBackground0d7_KjU, textDecoration3, shadow2, m7932boximpl, m7949boximpl, m7389getLineHeightXSAIIZE, textIndent2, platformTextStyle2, lineHeightStyle2);
    }

    /* renamed from: copy-Ns73l9s$default */
    public static /* synthetic */ TextStyle m7497copyNs73l9s$default(TextStyle textStyle, Brush brush, float f, long j, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j2, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j3, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i, int i2, long j4, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i3, int i4, TextMotion textMotion, int i5, Object obj) {
        TextMotion textMotion2;
        int i6;
        TextDecoration textDecoration2;
        DrawStyle drawStyle2;
        int i7;
        int i8;
        TextIndent textIndent2;
        PlatformTextStyle platformTextStyle2;
        LineHeightStyle lineHeightStyle2;
        Shadow shadow2;
        long j5;
        FontWeight fontWeight2;
        FontStyle fontStyle2;
        FontSynthesis fontSynthesis2;
        String str2;
        long j6;
        BaselineShift baselineShift2;
        TextGeometricTransform textGeometricTransform2;
        LocaleList localeList2;
        long j7;
        long j8;
        Brush brush2;
        float f2;
        int i9;
        TextStyle textStyle2;
        FontFamily fontFamily2;
        float alpha = (i5 & 2) != 0 ? textStyle.spanStyle.getAlpha() : f;
        long m7428getFontSizeXSAIIZE = (i5 & 4) != 0 ? textStyle.spanStyle.m7428getFontSizeXSAIIZE() : j;
        FontWeight fontWeight3 = (i5 & 8) != 0 ? textStyle.spanStyle.getFontWeight() : fontWeight;
        FontStyle m7429getFontStyle4Lr2A7w = (i5 & 16) != 0 ? textStyle.spanStyle.m7429getFontStyle4Lr2A7w() : fontStyle;
        FontSynthesis m7430getFontSynthesisZQGJjVo = (i5 & 32) != 0 ? textStyle.spanStyle.m7430getFontSynthesisZQGJjVo() : fontSynthesis;
        FontFamily fontFamily3 = (i5 & 64) != 0 ? textStyle.spanStyle.getFontFamily() : fontFamily;
        String fontFeatureSettings = (i5 & 128) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : str;
        long m7431getLetterSpacingXSAIIZE = (i5 & 256) != 0 ? textStyle.spanStyle.m7431getLetterSpacingXSAIIZE() : j2;
        BaselineShift m7426getBaselineShift5SSeXJ0 = (i5 & 512) != 0 ? textStyle.spanStyle.m7426getBaselineShift5SSeXJ0() : baselineShift;
        TextGeometricTransform textGeometricTransform3 = (i5 & 1024) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : textGeometricTransform;
        LocaleList localeList3 = (i5 & 2048) != 0 ? textStyle.spanStyle.getLocaleList() : localeList;
        long m7425getBackground0d7_KjU = (i5 & 4096) != 0 ? textStyle.spanStyle.m7425getBackground0d7_KjU() : j3;
        float f3 = alpha;
        TextDecoration textDecoration3 = (i5 & 8192) != 0 ? textStyle.spanStyle.getTextDecoration() : textDecoration;
        Shadow shadow3 = (i5 & 16384) != 0 ? textStyle.spanStyle.getShadow() : shadow;
        DrawStyle drawStyle3 = (i5 & 32768) != 0 ? textStyle.spanStyle.getDrawStyle() : drawStyle;
        int m7391getTextAligne0LSkKk = (i5 & 65536) != 0 ? textStyle.paragraphStyle.m7391getTextAligne0LSkKk() : i;
        int m7393getTextDirections_7Xco = (i5 & 131072) != 0 ? textStyle.paragraphStyle.m7393getTextDirections_7Xco() : i2;
        long m7389getLineHeightXSAIIZE = (i5 & 262144) != 0 ? textStyle.paragraphStyle.m7389getLineHeightXSAIIZE() : j4;
        TextIndent textIndent3 = (i5 & 524288) != 0 ? textStyle.paragraphStyle.getTextIndent() : textIndent;
        PlatformTextStyle platformTextStyle3 = (i5 & 1048576) != 0 ? textStyle.platformStyle : platformTextStyle;
        LineHeightStyle lineHeightStyle3 = (i5 & 2097152) != 0 ? textStyle.paragraphStyle.getLineHeightStyle() : lineHeightStyle;
        int m7388getLineBreakrAG3T2k = (i5 & 4194304) != 0 ? textStyle.paragraphStyle.m7388getLineBreakrAG3T2k() : i3;
        int m7386getHyphensvmbZdU8 = (i5 & 8388608) != 0 ? textStyle.paragraphStyle.m7386getHyphensvmbZdU8() : i4;
        if ((i5 & 16777216) != 0) {
            i6 = m7386getHyphensvmbZdU8;
            textMotion2 = textStyle.paragraphStyle.getTextMotion();
            textDecoration2 = textDecoration3;
            drawStyle2 = drawStyle3;
            i7 = m7391getTextAligne0LSkKk;
            i8 = m7393getTextDirections_7Xco;
            textIndent2 = textIndent3;
            platformTextStyle2 = platformTextStyle3;
            lineHeightStyle2 = lineHeightStyle3;
            i9 = m7388getLineBreakrAG3T2k;
            shadow2 = shadow3;
            j5 = m7428getFontSizeXSAIIZE;
            fontWeight2 = fontWeight3;
            fontStyle2 = m7429getFontStyle4Lr2A7w;
            fontSynthesis2 = m7430getFontSynthesisZQGJjVo;
            fontFamily2 = fontFamily3;
            str2 = fontFeatureSettings;
            j6 = m7431getLetterSpacingXSAIIZE;
            baselineShift2 = m7426getBaselineShift5SSeXJ0;
            textGeometricTransform2 = textGeometricTransform3;
            localeList2 = localeList3;
            j7 = m7425getBackground0d7_KjU;
            j8 = m7389getLineHeightXSAIIZE;
            brush2 = brush;
            f2 = f3;
            textStyle2 = textStyle;
        } else {
            textMotion2 = textMotion;
            i6 = m7386getHyphensvmbZdU8;
            textDecoration2 = textDecoration3;
            drawStyle2 = drawStyle3;
            i7 = m7391getTextAligne0LSkKk;
            i8 = m7393getTextDirections_7Xco;
            textIndent2 = textIndent3;
            platformTextStyle2 = platformTextStyle3;
            lineHeightStyle2 = lineHeightStyle3;
            shadow2 = shadow3;
            j5 = m7428getFontSizeXSAIIZE;
            fontWeight2 = fontWeight3;
            fontStyle2 = m7429getFontStyle4Lr2A7w;
            fontSynthesis2 = m7430getFontSynthesisZQGJjVo;
            str2 = fontFeatureSettings;
            j6 = m7431getLetterSpacingXSAIIZE;
            baselineShift2 = m7426getBaselineShift5SSeXJ0;
            textGeometricTransform2 = textGeometricTransform3;
            localeList2 = localeList3;
            j7 = m7425getBackground0d7_KjU;
            j8 = m7389getLineHeightXSAIIZE;
            brush2 = brush;
            f2 = f3;
            i9 = m7388getLineBreakrAG3T2k;
            textStyle2 = textStyle;
            fontFamily2 = fontFamily3;
        }
        return textStyle2.m7510copyNs73l9s(brush2, f2, j5, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, str2, j6, baselineShift2, textGeometricTransform2, localeList2, j7, textDecoration2, shadow2, drawStyle2, i7, i8, j8, textIndent2, platformTextStyle2, lineHeightStyle2, i9, i6, textMotion2);
    }

    /* renamed from: copy-aIRg9q4$default */
    public static /* synthetic */ TextStyle m7498copyaIRg9q4$default(TextStyle textStyle, Brush brush, float f, long j, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j2, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j3, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j4, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, int i, Object obj) {
        TextMotion textMotion2;
        Hyphens hyphens2;
        TextDecoration textDecoration2;
        DrawStyle drawStyle2;
        TextAlign textAlign2;
        TextDirection textDirection2;
        TextIndent textIndent2;
        PlatformTextStyle platformTextStyle2;
        LineHeightStyle lineHeightStyle2;
        Shadow shadow2;
        long j5;
        FontWeight fontWeight2;
        FontStyle fontStyle2;
        FontSynthesis fontSynthesis2;
        String str2;
        long j6;
        BaselineShift baselineShift2;
        TextGeometricTransform textGeometricTransform2;
        LocaleList localeList2;
        long j7;
        long j8;
        Brush brush2;
        float f2;
        LineBreak lineBreak2;
        TextStyle textStyle2;
        FontFamily fontFamily2;
        float alpha = (i & 2) != 0 ? textStyle.spanStyle.getAlpha() : f;
        long m7428getFontSizeXSAIIZE = (i & 4) != 0 ? textStyle.spanStyle.m7428getFontSizeXSAIIZE() : j;
        FontWeight fontWeight3 = (i & 8) != 0 ? textStyle.spanStyle.getFontWeight() : fontWeight;
        FontStyle m7429getFontStyle4Lr2A7w = (i & 16) != 0 ? textStyle.spanStyle.m7429getFontStyle4Lr2A7w() : fontStyle;
        FontSynthesis m7430getFontSynthesisZQGJjVo = (i & 32) != 0 ? textStyle.spanStyle.m7430getFontSynthesisZQGJjVo() : fontSynthesis;
        FontFamily fontFamily3 = (i & 64) != 0 ? textStyle.spanStyle.getFontFamily() : fontFamily;
        String fontFeatureSettings = (i & 128) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : str;
        long m7431getLetterSpacingXSAIIZE = (i & 256) != 0 ? textStyle.spanStyle.m7431getLetterSpacingXSAIIZE() : j2;
        BaselineShift m7426getBaselineShift5SSeXJ0 = (i & 512) != 0 ? textStyle.spanStyle.m7426getBaselineShift5SSeXJ0() : baselineShift;
        TextGeometricTransform textGeometricTransform3 = (i & 1024) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : textGeometricTransform;
        LocaleList localeList3 = (i & 2048) != 0 ? textStyle.spanStyle.getLocaleList() : localeList;
        long m7425getBackground0d7_KjU = (i & 4096) != 0 ? textStyle.spanStyle.m7425getBackground0d7_KjU() : j3;
        float f3 = alpha;
        TextDecoration textDecoration3 = (i & 8192) != 0 ? textStyle.spanStyle.getTextDecoration() : textDecoration;
        Shadow shadow3 = (i & 16384) != 0 ? textStyle.spanStyle.getShadow() : shadow;
        DrawStyle drawStyle3 = (i & 32768) != 0 ? textStyle.spanStyle.getDrawStyle() : drawStyle;
        TextAlign m7932boximpl = (i & 65536) != 0 ? TextAlign.m7932boximpl(textStyle.paragraphStyle.m7391getTextAligne0LSkKk()) : textAlign;
        TextDirection m7949boximpl = (i & 131072) != 0 ? TextDirection.m7949boximpl(textStyle.paragraphStyle.m7393getTextDirections_7Xco()) : textDirection;
        long m7389getLineHeightXSAIIZE = (i & 262144) != 0 ? textStyle.paragraphStyle.m7389getLineHeightXSAIIZE() : j4;
        TextIndent textIndent3 = (i & 524288) != 0 ? textStyle.paragraphStyle.getTextIndent() : textIndent;
        PlatformTextStyle platformTextStyle3 = (i & 1048576) != 0 ? textStyle.platformStyle : platformTextStyle;
        LineHeightStyle lineHeightStyle3 = (i & 2097152) != 0 ? textStyle.paragraphStyle.getLineHeightStyle() : lineHeightStyle;
        LineBreak m7837boximpl = (i & 4194304) != 0 ? LineBreak.m7837boximpl(textStyle.paragraphStyle.m7388getLineBreakrAG3T2k()) : lineBreak;
        Hyphens m7824boximpl = (i & 8388608) != 0 ? Hyphens.m7824boximpl(textStyle.paragraphStyle.m7386getHyphensvmbZdU8()) : hyphens;
        if ((i & 16777216) != 0) {
            hyphens2 = m7824boximpl;
            textMotion2 = textStyle.paragraphStyle.getTextMotion();
            textDecoration2 = textDecoration3;
            drawStyle2 = drawStyle3;
            textAlign2 = m7932boximpl;
            textDirection2 = m7949boximpl;
            textIndent2 = textIndent3;
            platformTextStyle2 = platformTextStyle3;
            lineHeightStyle2 = lineHeightStyle3;
            lineBreak2 = m7837boximpl;
            shadow2 = shadow3;
            j5 = m7428getFontSizeXSAIIZE;
            fontWeight2 = fontWeight3;
            fontStyle2 = m7429getFontStyle4Lr2A7w;
            fontSynthesis2 = m7430getFontSynthesisZQGJjVo;
            fontFamily2 = fontFamily3;
            str2 = fontFeatureSettings;
            j6 = m7431getLetterSpacingXSAIIZE;
            baselineShift2 = m7426getBaselineShift5SSeXJ0;
            textGeometricTransform2 = textGeometricTransform3;
            localeList2 = localeList3;
            j7 = m7425getBackground0d7_KjU;
            j8 = m7389getLineHeightXSAIIZE;
            brush2 = brush;
            f2 = f3;
            textStyle2 = textStyle;
        } else {
            textMotion2 = textMotion;
            hyphens2 = m7824boximpl;
            textDecoration2 = textDecoration3;
            drawStyle2 = drawStyle3;
            textAlign2 = m7932boximpl;
            textDirection2 = m7949boximpl;
            textIndent2 = textIndent3;
            platformTextStyle2 = platformTextStyle3;
            lineHeightStyle2 = lineHeightStyle3;
            shadow2 = shadow3;
            j5 = m7428getFontSizeXSAIIZE;
            fontWeight2 = fontWeight3;
            fontStyle2 = m7429getFontStyle4Lr2A7w;
            fontSynthesis2 = m7430getFontSynthesisZQGJjVo;
            str2 = fontFeatureSettings;
            j6 = m7431getLetterSpacingXSAIIZE;
            baselineShift2 = m7426getBaselineShift5SSeXJ0;
            textGeometricTransform2 = textGeometricTransform3;
            localeList2 = localeList3;
            j7 = m7425getBackground0d7_KjU;
            j8 = m7389getLineHeightXSAIIZE;
            brush2 = brush;
            f2 = f3;
            lineBreak2 = m7837boximpl;
            textStyle2 = textStyle;
            fontFamily2 = fontFamily3;
        }
        return textStyle2.m7511copyaIRg9q4(brush2, f2, j5, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, str2, j6, baselineShift2, textGeometricTransform2, localeList2, j7, textDecoration2, shadow2, drawStyle2, textAlign2, textDirection2, j8, textIndent2, platformTextStyle2, lineHeightStyle2, lineBreak2, hyphens2, textMotion2);
    }

    /* renamed from: copy-p1EtxEg$default */
    public static /* synthetic */ TextStyle m7499copyp1EtxEg$default(TextStyle textStyle, long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i, int i2, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i3, int i4, TextMotion textMotion, int i5, Object obj) {
        TextMotion textMotion2;
        int i6;
        long m7427getColor0d7_KjU = (i5 & 1) != 0 ? textStyle.spanStyle.m7427getColor0d7_KjU() : j;
        long m7428getFontSizeXSAIIZE = (i5 & 2) != 0 ? textStyle.spanStyle.m7428getFontSizeXSAIIZE() : j2;
        FontWeight fontWeight2 = (i5 & 4) != 0 ? textStyle.spanStyle.getFontWeight() : fontWeight;
        FontStyle m7429getFontStyle4Lr2A7w = (i5 & 8) != 0 ? textStyle.spanStyle.m7429getFontStyle4Lr2A7w() : fontStyle;
        FontSynthesis m7430getFontSynthesisZQGJjVo = (i5 & 16) != 0 ? textStyle.spanStyle.m7430getFontSynthesisZQGJjVo() : fontSynthesis;
        FontFamily fontFamily2 = (i5 & 32) != 0 ? textStyle.spanStyle.getFontFamily() : fontFamily;
        String fontFeatureSettings = (i5 & 64) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : str;
        long m7431getLetterSpacingXSAIIZE = (i5 & 128) != 0 ? textStyle.spanStyle.m7431getLetterSpacingXSAIIZE() : j3;
        BaselineShift m7426getBaselineShift5SSeXJ0 = (i5 & 256) != 0 ? textStyle.spanStyle.m7426getBaselineShift5SSeXJ0() : baselineShift;
        TextGeometricTransform textGeometricTransform2 = (i5 & 512) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : textGeometricTransform;
        LocaleList localeList2 = (i5 & 1024) != 0 ? textStyle.spanStyle.getLocaleList() : localeList;
        long j6 = m7427getColor0d7_KjU;
        long m7425getBackground0d7_KjU = (i5 & 2048) != 0 ? textStyle.spanStyle.m7425getBackground0d7_KjU() : j4;
        TextDecoration textDecoration2 = (i5 & 4096) != 0 ? textStyle.spanStyle.getTextDecoration() : textDecoration;
        Shadow shadow2 = (i5 & 8192) != 0 ? textStyle.spanStyle.getShadow() : shadow;
        TextDecoration textDecoration3 = textDecoration2;
        DrawStyle drawStyle2 = (i5 & 16384) != 0 ? textStyle.spanStyle.getDrawStyle() : drawStyle;
        int m7391getTextAligne0LSkKk = (i5 & 32768) != 0 ? textStyle.paragraphStyle.m7391getTextAligne0LSkKk() : i;
        int m7393getTextDirections_7Xco = (i5 & 65536) != 0 ? textStyle.paragraphStyle.m7393getTextDirections_7Xco() : i2;
        long m7389getLineHeightXSAIIZE = (i5 & 131072) != 0 ? textStyle.paragraphStyle.m7389getLineHeightXSAIIZE() : j5;
        TextIndent textIndent2 = (i5 & 262144) != 0 ? textStyle.paragraphStyle.getTextIndent() : textIndent;
        PlatformTextStyle platformTextStyle2 = (i5 & 524288) != 0 ? textStyle.platformStyle : platformTextStyle;
        LineHeightStyle lineHeightStyle2 = (i5 & 1048576) != 0 ? textStyle.paragraphStyle.getLineHeightStyle() : lineHeightStyle;
        int m7388getLineBreakrAG3T2k = (i5 & 2097152) != 0 ? textStyle.paragraphStyle.m7388getLineBreakrAG3T2k() : i3;
        int m7386getHyphensvmbZdU8 = (i5 & 4194304) != 0 ? textStyle.paragraphStyle.m7386getHyphensvmbZdU8() : i4;
        if ((i5 & 8388608) != 0) {
            i6 = m7386getHyphensvmbZdU8;
            textMotion2 = textStyle.paragraphStyle.getTextMotion();
        } else {
            textMotion2 = textMotion;
            i6 = m7386getHyphensvmbZdU8;
        }
        return textStyle.m7512copyp1EtxEg(j6, m7428getFontSizeXSAIIZE, fontWeight2, m7429getFontStyle4Lr2A7w, m7430getFontSynthesisZQGJjVo, fontFamily2, fontFeatureSettings, m7431getLetterSpacingXSAIIZE, m7426getBaselineShift5SSeXJ0, textGeometricTransform2, localeList2, m7425getBackground0d7_KjU, textDecoration3, shadow2, drawStyle2, m7391getTextAligne0LSkKk, m7393getTextDirections_7Xco, m7389getLineHeightXSAIIZE, textIndent2, platformTextStyle2, lineHeightStyle2, m7388getLineBreakrAG3T2k, i6, textMotion2);
    }

    /* renamed from: copy-v2rsoow$default */
    public static /* synthetic */ TextStyle m7500copyv2rsoow$default(TextStyle textStyle, long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, int i, Object obj) {
        TextMotion textMotion2;
        Hyphens hyphens2;
        long m7427getColor0d7_KjU = (i & 1) != 0 ? textStyle.spanStyle.m7427getColor0d7_KjU() : j;
        long m7428getFontSizeXSAIIZE = (i & 2) != 0 ? textStyle.spanStyle.m7428getFontSizeXSAIIZE() : j2;
        FontWeight fontWeight2 = (i & 4) != 0 ? textStyle.spanStyle.getFontWeight() : fontWeight;
        FontStyle m7429getFontStyle4Lr2A7w = (i & 8) != 0 ? textStyle.spanStyle.m7429getFontStyle4Lr2A7w() : fontStyle;
        FontSynthesis m7430getFontSynthesisZQGJjVo = (i & 16) != 0 ? textStyle.spanStyle.m7430getFontSynthesisZQGJjVo() : fontSynthesis;
        FontFamily fontFamily2 = (i & 32) != 0 ? textStyle.spanStyle.getFontFamily() : fontFamily;
        String fontFeatureSettings = (i & 64) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : str;
        long m7431getLetterSpacingXSAIIZE = (i & 128) != 0 ? textStyle.spanStyle.m7431getLetterSpacingXSAIIZE() : j3;
        BaselineShift m7426getBaselineShift5SSeXJ0 = (i & 256) != 0 ? textStyle.spanStyle.m7426getBaselineShift5SSeXJ0() : baselineShift;
        TextGeometricTransform textGeometricTransform2 = (i & 512) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : textGeometricTransform;
        LocaleList localeList2 = (i & 1024) != 0 ? textStyle.spanStyle.getLocaleList() : localeList;
        long j6 = m7427getColor0d7_KjU;
        long m7425getBackground0d7_KjU = (i & 2048) != 0 ? textStyle.spanStyle.m7425getBackground0d7_KjU() : j4;
        TextDecoration textDecoration2 = (i & 4096) != 0 ? textStyle.spanStyle.getTextDecoration() : textDecoration;
        Shadow shadow2 = (i & 8192) != 0 ? textStyle.spanStyle.getShadow() : shadow;
        TextDecoration textDecoration3 = textDecoration2;
        DrawStyle drawStyle2 = (i & 16384) != 0 ? textStyle.spanStyle.getDrawStyle() : drawStyle;
        TextAlign m7932boximpl = (i & 32768) != 0 ? TextAlign.m7932boximpl(textStyle.paragraphStyle.m7391getTextAligne0LSkKk()) : textAlign;
        TextDirection m7949boximpl = (i & 65536) != 0 ? TextDirection.m7949boximpl(textStyle.paragraphStyle.m7393getTextDirections_7Xco()) : textDirection;
        long m7389getLineHeightXSAIIZE = (i & 131072) != 0 ? textStyle.paragraphStyle.m7389getLineHeightXSAIIZE() : j5;
        TextIndent textIndent2 = (i & 262144) != 0 ? textStyle.paragraphStyle.getTextIndent() : textIndent;
        PlatformTextStyle platformTextStyle2 = (i & 524288) != 0 ? textStyle.platformStyle : platformTextStyle;
        LineHeightStyle lineHeightStyle2 = (i & 1048576) != 0 ? textStyle.paragraphStyle.getLineHeightStyle() : lineHeightStyle;
        LineBreak m7837boximpl = (i & 2097152) != 0 ? LineBreak.m7837boximpl(textStyle.paragraphStyle.m7388getLineBreakrAG3T2k()) : lineBreak;
        Hyphens m7824boximpl = (i & 4194304) != 0 ? Hyphens.m7824boximpl(textStyle.paragraphStyle.m7386getHyphensvmbZdU8()) : hyphens;
        if ((i & 8388608) != 0) {
            hyphens2 = m7824boximpl;
            textMotion2 = textStyle.paragraphStyle.getTextMotion();
        } else {
            textMotion2 = textMotion;
            hyphens2 = m7824boximpl;
        }
        return textStyle.m7513copyv2rsoow(j6, m7428getFontSizeXSAIIZE, fontWeight2, m7429getFontStyle4Lr2A7w, m7430getFontSynthesisZQGJjVo, fontFamily2, fontFeatureSettings, m7431getLetterSpacingXSAIIZE, m7426getBaselineShift5SSeXJ0, textGeometricTransform2, localeList2, m7425getBackground0d7_KjU, textDecoration3, shadow2, drawStyle2, m7932boximpl, m7949boximpl, m7389getLineHeightXSAIIZE, textIndent2, platformTextStyle2, lineHeightStyle2, m7837boximpl, hyphens2, textMotion2);
    }

    @hd0
    /* renamed from: getHyphens-EaSxIns$annotations */
    public static /* synthetic */ void m7501getHyphensEaSxIns$annotations() {
    }

    @hd0
    /* renamed from: getLineBreak-LgCVezo$annotations */
    public static /* synthetic */ void m7502getLineBreakLgCVezo$annotations() {
    }

    @hd0
    /* renamed from: getTextAlign-buA522U$annotations */
    public static /* synthetic */ void m7503getTextAlignbuA522U$annotations() {
    }

    @hd0
    /* renamed from: getTextDirection-mmuk1to$annotations */
    public static /* synthetic */ void m7504getTextDirectionmmuk1to$annotations() {
    }

    public static /* synthetic */ TextStyle merge$default(TextStyle textStyle, TextStyle textStyle2, int i, Object obj) {
        if ((i & 1) != 0) {
            textStyle2 = null;
        }
        return textStyle.merge(textStyle2);
    }

    @hd0
    /* renamed from: copy-CXVQc50 */
    public final /* synthetic */ TextStyle m7507copyCXVQc50(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens) {
        return new TextStyle(new SpanStyle(Color.m5333equalsimpl0(j, this.spanStyle.m7427getColor0d7_KjU()) ? this.spanStyle.getTextForegroundStyle$ui_text() : TextForegroundStyle.Companion.m7966from8_81llA(j), j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, getDrawStyle(), (sb0) null), new ParagraphStyle(textAlign != null ? textAlign.m7938unboximpl() : TextAlign.Companion.m7945getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m7955unboximpl() : TextDirection.Companion.m7961getUnspecifieds_7Xco(), j5, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, lineBreak != null ? lineBreak.m7849unboximpl() : LineBreak.Companion.m7857getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m7830unboximpl() : Hyphens.Companion.m7833getUnspecifiedvmbZdU8(), getTextMotion(), (sb0) null), platformTextStyle);
    }

    @hd0
    /* renamed from: copy-HL5avdY */
    public final /* synthetic */ TextStyle m7508copyHL5avdY(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent) {
        return new TextStyle(new SpanStyle(Color.m5333equalsimpl0(j, this.spanStyle.m7427getColor0d7_KjU()) ? this.spanStyle.getTextForegroundStyle$ui_text() : TextForegroundStyle.Companion.m7966from8_81llA(j), j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, this.spanStyle.getPlatformStyle(), this.spanStyle.getDrawStyle(), (sb0) null), new ParagraphStyle(textAlign != null ? textAlign.m7938unboximpl() : TextAlign.Companion.m7945getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m7955unboximpl() : TextDirection.Companion.m7961getUnspecifieds_7Xco(), j5, textIndent, this.paragraphStyle.getPlatformStyle(), getLineHeightStyle(), m7524getLineBreakrAG3T2k(), m7521getHyphensvmbZdU8(), getTextMotion(), (sb0) null), this.platformStyle);
    }

    @hd0
    /* renamed from: copy-NOaFTUo */
    public final /* synthetic */ TextStyle m7509copyNOaFTUo(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle) {
        return new TextStyle(new SpanStyle(Color.m5333equalsimpl0(j, this.spanStyle.m7427getColor0d7_KjU()) ? this.spanStyle.getTextForegroundStyle$ui_text() : TextForegroundStyle.Companion.m7966from8_81llA(j), j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, this.spanStyle.getDrawStyle(), (sb0) null), new ParagraphStyle(textAlign != null ? textAlign.m7938unboximpl() : TextAlign.Companion.m7945getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m7955unboximpl() : TextDirection.Companion.m7961getUnspecifieds_7Xco(), j5, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, m7524getLineBreakrAG3T2k(), m7521getHyphensvmbZdU8(), getTextMotion(), (sb0) null), platformTextStyle);
    }

    /* renamed from: copy-Ns73l9s */
    public final TextStyle m7510copyNs73l9s(Brush brush, float f, long j, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j2, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j3, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i, int i2, long j4, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i3, int i4, TextMotion textMotion) {
        return new TextStyle(new SpanStyle(brush, f, j, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j2, baselineShift, textGeometricTransform, localeList, j3, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (sb0) null), new ParagraphStyle(i, i2, j4, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, i3, i4, textMotion, (sb0) null), platformTextStyle);
    }

    @hd0
    /* renamed from: copy-aIRg9q4 */
    public final /* synthetic */ TextStyle m7511copyaIRg9q4(Brush brush, float f, long j, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j2, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j3, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j4, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        return new TextStyle(new SpanStyle(brush, f, j, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j2, baselineShift, textGeometricTransform, localeList, j3, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (sb0) null), new ParagraphStyle(textAlign != null ? textAlign.m7938unboximpl() : TextAlign.Companion.m7945getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m7955unboximpl() : TextDirection.Companion.m7961getUnspecifieds_7Xco(), j4, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, lineBreak != null ? lineBreak.m7849unboximpl() : LineBreak.Companion.m7857getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m7830unboximpl() : Hyphens.Companion.m7833getUnspecifiedvmbZdU8(), textMotion, (sb0) null), platformTextStyle);
    }

    /* renamed from: copy-p1EtxEg */
    public final TextStyle m7512copyp1EtxEg(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i, int i2, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i3, int i4, TextMotion textMotion) {
        return new TextStyle(new SpanStyle(Color.m5333equalsimpl0(j, this.spanStyle.m7427getColor0d7_KjU()) ? this.spanStyle.getTextForegroundStyle$ui_text() : TextForegroundStyle.Companion.m7966from8_81llA(j), j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (sb0) null), new ParagraphStyle(i, i2, j5, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, i3, i4, textMotion, (sb0) null), platformTextStyle);
    }

    @hd0
    /* renamed from: copy-v2rsoow */
    public final /* synthetic */ TextStyle m7513copyv2rsoow(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        return new TextStyle(new SpanStyle(Color.m5333equalsimpl0(j, this.spanStyle.m7427getColor0d7_KjU()) ? this.spanStyle.getTextForegroundStyle$ui_text() : TextForegroundStyle.Companion.m7966from8_81llA(j), j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (sb0) null), new ParagraphStyle(textAlign != null ? textAlign.m7938unboximpl() : TextAlign.Companion.m7945getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m7955unboximpl() : TextDirection.Companion.m7961getUnspecifieds_7Xco(), j5, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, lineBreak != null ? lineBreak.m7849unboximpl() : LineBreak.Companion.m7857getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m7830unboximpl() : Hyphens.Companion.m7833getUnspecifiedvmbZdU8(), textMotion, (sb0) null), platformTextStyle);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStyle)) {
            return false;
        }
        TextStyle textStyle = (TextStyle) obj;
        return jh2.k(this.spanStyle, textStyle.spanStyle) && jh2.k(this.paragraphStyle, textStyle.paragraphStyle) && jh2.k(this.platformStyle, textStyle.platformStyle);
    }

    public final float getAlpha() {
        return this.spanStyle.getAlpha();
    }

    /* renamed from: getBackground-0d7_KjU */
    public final long m7514getBackground0d7_KjU() {
        return this.spanStyle.m7425getBackground0d7_KjU();
    }

    /* renamed from: getBaselineShift-5SSeXJ0 */
    public final BaselineShift m7515getBaselineShift5SSeXJ0() {
        return this.spanStyle.m7426getBaselineShift5SSeXJ0();
    }

    public final Brush getBrush() {
        return this.spanStyle.getBrush();
    }

    /* renamed from: getColor-0d7_KjU */
    public final long m7516getColor0d7_KjU() {
        return this.spanStyle.m7427getColor0d7_KjU();
    }

    public final DrawStyle getDrawStyle() {
        return this.spanStyle.getDrawStyle();
    }

    public final FontFamily getFontFamily() {
        return this.spanStyle.getFontFamily();
    }

    public final String getFontFeatureSettings() {
        return this.spanStyle.getFontFeatureSettings();
    }

    /* renamed from: getFontSize-XSAIIZE */
    public final long m7517getFontSizeXSAIIZE() {
        return this.spanStyle.m7428getFontSizeXSAIIZE();
    }

    /* renamed from: getFontStyle-4Lr2A7w */
    public final FontStyle m7518getFontStyle4Lr2A7w() {
        return this.spanStyle.m7429getFontStyle4Lr2A7w();
    }

    /* renamed from: getFontSynthesis-ZQGJjVo */
    public final FontSynthesis m7519getFontSynthesisZQGJjVo() {
        return this.spanStyle.m7430getFontSynthesisZQGJjVo();
    }

    public final FontWeight getFontWeight() {
        return this.spanStyle.getFontWeight();
    }

    /* renamed from: getHyphens-EaSxIns */
    public final Hyphens m7520getHyphensEaSxIns() {
        return Hyphens.m7824boximpl(m7521getHyphensvmbZdU8());
    }

    /* renamed from: getHyphens-vmbZdU8 */
    public final int m7521getHyphensvmbZdU8() {
        return this.paragraphStyle.m7386getHyphensvmbZdU8();
    }

    /* renamed from: getLetterSpacing-XSAIIZE */
    public final long m7522getLetterSpacingXSAIIZE() {
        return this.spanStyle.m7431getLetterSpacingXSAIIZE();
    }

    /* renamed from: getLineBreak-LgCVezo */
    public final LineBreak m7523getLineBreakLgCVezo() {
        return LineBreak.m7837boximpl(m7524getLineBreakrAG3T2k());
    }

    /* renamed from: getLineBreak-rAG3T2k */
    public final int m7524getLineBreakrAG3T2k() {
        return this.paragraphStyle.m7388getLineBreakrAG3T2k();
    }

    /* renamed from: getLineHeight-XSAIIZE */
    public final long m7525getLineHeightXSAIIZE() {
        return this.paragraphStyle.m7389getLineHeightXSAIIZE();
    }

    public final LineHeightStyle getLineHeightStyle() {
        return this.paragraphStyle.getLineHeightStyle();
    }

    public final LocaleList getLocaleList() {
        return this.spanStyle.getLocaleList();
    }

    public final ParagraphStyle getParagraphStyle$ui_text() {
        return this.paragraphStyle;
    }

    public final PlatformTextStyle getPlatformStyle() {
        return this.platformStyle;
    }

    public final Shadow getShadow() {
        return this.spanStyle.getShadow();
    }

    public final SpanStyle getSpanStyle$ui_text() {
        return this.spanStyle;
    }

    /* renamed from: getTextAlign-buA522U */
    public final TextAlign m7526getTextAlignbuA522U() {
        return TextAlign.m7932boximpl(m7527getTextAligne0LSkKk());
    }

    /* renamed from: getTextAlign-e0LSkKk */
    public final int m7527getTextAligne0LSkKk() {
        return this.paragraphStyle.m7391getTextAligne0LSkKk();
    }

    public final TextDecoration getTextDecoration() {
        return this.spanStyle.getTextDecoration();
    }

    /* renamed from: getTextDirection-mmuk1to */
    public final TextDirection m7528getTextDirectionmmuk1to() {
        return TextDirection.m7949boximpl(m7529getTextDirections_7Xco());
    }

    /* renamed from: getTextDirection-s_7X-co */
    public final int m7529getTextDirections_7Xco() {
        return this.paragraphStyle.m7393getTextDirections_7Xco();
    }

    public final TextGeometricTransform getTextGeometricTransform() {
        return this.spanStyle.getTextGeometricTransform();
    }

    public final TextIndent getTextIndent() {
        return this.paragraphStyle.getTextIndent();
    }

    public final TextMotion getTextMotion() {
        return this.paragraphStyle.getTextMotion();
    }

    public final boolean hasSameDrawAffectingAttributes(TextStyle textStyle) {
        return this == textStyle || this.spanStyle.hasSameNonLayoutAttributes$ui_text(textStyle.spanStyle);
    }

    public final boolean hasSameLayoutAffectingAttributes(TextStyle textStyle) {
        if (this != textStyle) {
            return jh2.k(this.paragraphStyle, textStyle.paragraphStyle) && this.spanStyle.hasSameLayoutAffectingAttributes$ui_text(textStyle.spanStyle);
        }
        return true;
    }

    public int hashCode() {
        int hashCode = (this.paragraphStyle.hashCode() + (this.spanStyle.hashCode() * 31)) * 31;
        PlatformTextStyle platformTextStyle = this.platformStyle;
        return hashCode + (platformTextStyle != null ? platformTextStyle.hashCode() : 0);
    }

    public final int hashCodeLayoutAffectingAttributes$ui_text() {
        int hashCode = (this.paragraphStyle.hashCode() + (this.spanStyle.hashCodeLayoutAffectingAttributes$ui_text() * 31)) * 31;
        PlatformTextStyle platformTextStyle = this.platformStyle;
        return hashCode + (platformTextStyle != null ? platformTextStyle.hashCode() : 0);
    }

    public final TextStyle merge(ParagraphStyle paragraphStyle) {
        return new TextStyle(toSpanStyle(), toParagraphStyle().merge(paragraphStyle));
    }

    public final TextStyle merge(SpanStyle spanStyle) {
        return new TextStyle(toSpanStyle().merge(spanStyle), toParagraphStyle());
    }

    public final TextStyle merge(TextStyle textStyle) {
        return (textStyle == null || textStyle.equals(Default)) ? this : new TextStyle(toSpanStyle().merge(textStyle.toSpanStyle()), toParagraphStyle().merge(textStyle.toParagraphStyle()));
    }

    @hd0
    /* renamed from: merge-Z1GrekI */
    public final /* synthetic */ TextStyle m7530mergeZ1GrekI(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, PlatformTextStyle platformTextStyle, TextMotion textMotion) {
        SpanStyle m7432fastMergedSHsh3o = SpanStyleKt.m7432fastMergedSHsh3o(this.spanStyle, j, null, Float.NaN, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle);
        ParagraphStyle m7394fastMergej5T8yCg = ParagraphStyleKt.m7394fastMergej5T8yCg(this.paragraphStyle, textAlign != null ? textAlign.m7938unboximpl() : TextAlign.Companion.m7945getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m7955unboximpl() : TextDirection.Companion.m7961getUnspecifieds_7Xco(), j5, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, lineBreak != null ? lineBreak.m7849unboximpl() : LineBreak.Companion.m7857getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m7830unboximpl() : Hyphens.Companion.m7833getUnspecifiedvmbZdU8(), textMotion);
        return (this.spanStyle == m7432fastMergedSHsh3o && this.paragraphStyle == m7394fastMergej5T8yCg) ? this : new TextStyle(m7432fastMergedSHsh3o, m7394fastMergej5T8yCg);
    }

    /* renamed from: merge-dA7vx0o */
    public final TextStyle m7531mergedA7vx0o(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i, int i2, long j5, TextIndent textIndent, LineHeightStyle lineHeightStyle, int i3, int i4, PlatformTextStyle platformTextStyle, TextMotion textMotion) {
        SpanStyle m7432fastMergedSHsh3o = SpanStyleKt.m7432fastMergedSHsh3o(this.spanStyle, j, null, Float.NaN, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle);
        ParagraphStyle m7394fastMergej5T8yCg = ParagraphStyleKt.m7394fastMergej5T8yCg(this.paragraphStyle, i, i2, j5, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, i3, i4, textMotion);
        return (this.spanStyle == m7432fastMergedSHsh3o && this.paragraphStyle == m7394fastMergej5T8yCg) ? this : new TextStyle(m7432fastMergedSHsh3o, m7394fastMergej5T8yCg);
    }

    public final TextStyle plus(ParagraphStyle paragraphStyle) {
        return merge(paragraphStyle);
    }

    public final TextStyle plus(SpanStyle spanStyle) {
        return merge(spanStyle);
    }

    public final TextStyle plus(TextStyle textStyle) {
        return merge(textStyle);
    }

    public final ParagraphStyle toParagraphStyle() {
        return this.paragraphStyle;
    }

    public final SpanStyle toSpanStyle() {
        return this.spanStyle;
    }

    public String toString() {
        String m5340toStringimpl = Color.m5340toStringimpl(m7516getColor0d7_KjU());
        Brush brush = getBrush();
        float alpha = getAlpha();
        String m8246toStringimpl = TextUnit.m8246toStringimpl(m7517getFontSizeXSAIIZE());
        FontWeight fontWeight = getFontWeight();
        FontStyle m7518getFontStyle4Lr2A7w = m7518getFontStyle4Lr2A7w();
        FontSynthesis m7519getFontSynthesisZQGJjVo = m7519getFontSynthesisZQGJjVo();
        FontFamily fontFamily = getFontFamily();
        String fontFeatureSettings = getFontFeatureSettings();
        String m8246toStringimpl2 = TextUnit.m8246toStringimpl(m7522getLetterSpacingXSAIIZE());
        BaselineShift m7515getBaselineShift5SSeXJ0 = m7515getBaselineShift5SSeXJ0();
        TextGeometricTransform textGeometricTransform = getTextGeometricTransform();
        LocaleList localeList = getLocaleList();
        String m5340toStringimpl2 = Color.m5340toStringimpl(m7514getBackground0d7_KjU());
        TextDecoration textDecoration = getTextDecoration();
        Shadow shadow = getShadow();
        DrawStyle drawStyle = getDrawStyle();
        String m7937toStringimpl = TextAlign.m7937toStringimpl(m7527getTextAligne0LSkKk());
        String m7954toStringimpl = TextDirection.m7954toStringimpl(m7529getTextDirections_7Xco());
        String m8246toStringimpl3 = TextUnit.m8246toStringimpl(m7525getLineHeightXSAIIZE());
        TextIndent textIndent = getTextIndent();
        PlatformTextStyle platformTextStyle = this.platformStyle;
        LineHeightStyle lineHeightStyle = getLineHeightStyle();
        String m7848toStringimpl = LineBreak.m7848toStringimpl(m7524getLineBreakrAG3T2k());
        String m7829toStringimpl = Hyphens.m7829toStringimpl(m7521getHyphensvmbZdU8());
        TextMotion textMotion = getTextMotion();
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        sb.append(m5340toStringimpl);
        sb.append(", brush=");
        sb.append(brush);
        sb.append(", alpha=");
        sb.append(alpha);
        sb.append(", fontSize=");
        sb.append(m8246toStringimpl);
        sb.append(", fontWeight=");
        sb.append(fontWeight);
        sb.append(", fontStyle=");
        sb.append(m7518getFontStyle4Lr2A7w);
        sb.append(", fontSynthesis=");
        sb.append(m7519getFontSynthesisZQGJjVo);
        sb.append(", fontFamily=");
        sb.append(fontFamily);
        sb.append(", fontFeatureSettings=");
        lt.L(sb, fontFeatureSettings, ", letterSpacing=", m8246toStringimpl2, ", baselineShift=");
        sb.append(m7515getBaselineShift5SSeXJ0);
        sb.append(", textGeometricTransform=");
        sb.append(textGeometricTransform);
        sb.append(", localeList=");
        sb.append(localeList);
        sb.append(", background=");
        sb.append(m5340toStringimpl2);
        sb.append(", textDecoration=");
        sb.append(textDecoration);
        sb.append(", shadow=");
        sb.append(shadow);
        sb.append(", drawStyle=");
        sb.append(drawStyle);
        sb.append(", textAlign=");
        sb.append(m7937toStringimpl);
        sb.append(", textDirection=");
        lt.L(sb, m7954toStringimpl, ", lineHeight=", m8246toStringimpl3, ", textIndent=");
        sb.append(textIndent);
        sb.append(", platformStyle=");
        sb.append(platformTextStyle);
        sb.append(", lineHeightStyle=");
        sb.append(lineHeightStyle);
        sb.append(", lineBreak=");
        sb.append(m7848toStringimpl);
        sb.append(", hyphens=");
        sb.append(m7829toStringimpl);
        sb.append(", textMotion=");
        sb.append(textMotion);
        sb.append(")");
        return sb.toString();
    }
}
