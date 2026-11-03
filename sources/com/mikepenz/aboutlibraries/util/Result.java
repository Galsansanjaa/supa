package com.mikepenz.aboutlibraries.util;

import com.mikepenz.aboutlibraries.entity.Library;
import com.mikepenz.aboutlibraries.entity.License;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class Result {
    private final List<Library> libraries;
    private final List<License> licenses;

    public Result(List<Library> list, List<License> list2) {
        list.getClass();
        list2.getClass();
        this.libraries = list;
        this.licenses = list2;
    }

    public final List<Library> component1() {
        return this.libraries;
    }

    public final List<License> component2() {
        return this.licenses;
    }

    public final List<Library> getLibraries() {
        return this.libraries;
    }

    public final List<License> getLicenses() {
        return this.licenses;
    }
}
