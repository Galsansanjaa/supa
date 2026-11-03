package com.inmobi.cmp.data.model;

import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class ChoiceStyle {
    private Integer boldFont;
    private ChoiceColor darkModeColors;
    private ChoiceColor lightModeColors;
    private Integer regularFont;
    private ThemeMode themeMode;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes4.dex */
    public static final class Builder {
        private Integer boldFont;
        private ChoiceColor darkModeColors;
        private ChoiceColor lightModeColors;
        private Integer regularFont;
        private ThemeMode themeMode;

        public final ChoiceStyle build() {
            return new ChoiceStyle(this.themeMode, this.lightModeColors, this.darkModeColors, this.boldFont, this.regularFont, null);
        }

        public final Builder setBoldFont(int i) {
            this.boldFont = Integer.valueOf(i);
            return this;
        }

        public final Builder setDarkModeColors(ChoiceColor choiceColor) {
            choiceColor.getClass();
            this.darkModeColors = choiceColor;
            return this;
        }

        public final Builder setLightModeColors(ChoiceColor choiceColor) {
            choiceColor.getClass();
            this.lightModeColors = choiceColor;
            return this;
        }

        public final Builder setRegularFont(int i) {
            this.regularFont = Integer.valueOf(i);
            return this;
        }

        public final Builder setThemeMode(ThemeMode themeMode) {
            themeMode.getClass();
            this.themeMode = themeMode;
            return this;
        }
    }

    public ChoiceStyle() {
        this(null, null, null, null, null);
    }

    private ChoiceStyle(ThemeMode themeMode, ChoiceColor choiceColor, ChoiceColor choiceColor2, Integer num, Integer num2) {
        this.themeMode = themeMode;
        this.lightModeColors = choiceColor;
        this.darkModeColors = choiceColor2;
        this.boldFont = num;
        this.regularFont = num2;
    }

    public /* synthetic */ ChoiceStyle(ThemeMode themeMode, ChoiceColor choiceColor, ChoiceColor choiceColor2, Integer num, Integer num2, sb0 sb0Var) {
        this(themeMode, choiceColor, choiceColor2, num, num2);
    }

    public final Integer getBoldFont() {
        return this.boldFont;
    }

    public final ChoiceColor getDarkModeColors() {
        return this.darkModeColors;
    }

    public final ChoiceColor getLightModeColors() {
        return this.lightModeColors;
    }

    public final Integer getRegularFont() {
        return this.regularFont;
    }

    public final ThemeMode getThemeMode() {
        return this.themeMode;
    }

    public final void setBoldFont(Integer num) {
        this.boldFont = num;
    }

    public final void setDarkModeColors(ChoiceColor choiceColor) {
        this.darkModeColors = choiceColor;
    }

    public final void setLightModeColors(ChoiceColor choiceColor) {
        this.lightModeColors = choiceColor;
    }

    public final void setRegularFont(Integer num) {
        this.regularFont = num;
    }

    public final void setThemeMode(ThemeMode themeMode) {
        this.themeMode = themeMode;
    }
}
