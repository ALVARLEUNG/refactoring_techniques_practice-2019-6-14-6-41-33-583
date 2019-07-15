package com.tws.refactoring.extract_variable;

import org.junit.Assert;
import org.junit.Test;

public class BannerRenderTest {

    @Test
    public void should_return_IE_or_Mac_when_call_renderBanner_given_IE_on_Mac () {
        BannerRender bannerRender = new BannerRender();
        String result = bannerRender.renderBanner("Mac", "IE");
        Assert.assertEquals("IE or Mac?",result);
    }

    @Test
    public void should_return_banner_when_call_renderBanner_given_IE_and_chrome () {
        BannerRender bannerRender = new BannerRender();
        String result = bannerRender.renderBanner("IE", "chrome");
        Assert.assertEquals("banner",result);
    }

}