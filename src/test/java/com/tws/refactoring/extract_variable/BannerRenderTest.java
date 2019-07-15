package com.tws.refactoring.extract_variable;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BannerRenderTest {

    @Test
    public void should_return_IE_on_Mac_when_call_renderBanner_given_IE_on_Mac () {
        BannerRender bannerRender = new BannerRender();
        String result = bannerRender.renderBanner("Mac", "IE");
        Assert.assertEquals("IE or Mac?",result);
    }

}