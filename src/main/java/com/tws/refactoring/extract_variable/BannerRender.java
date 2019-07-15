package com.tws.refactoring.extract_variable;

public class BannerRender {
    private static final String IE_OR_MAC = "IE or Mac?";
    private static final String BANNER = "banner";
    private static final String MAC = "MAC";
    private static final String IE = "IE";

    String renderBanner(String platform, String browser) {
        return (platform.toUpperCase().indexOf(MAC) > -1) && (browser.toUpperCase().indexOf(IE) > -1) ? IE_OR_MAC : BANNER;
    }
}
