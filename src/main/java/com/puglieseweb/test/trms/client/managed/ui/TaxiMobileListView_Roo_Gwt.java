// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package com.puglieseweb.test.trms.client.managed.ui;

import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.text.client.DateTimeFormatRenderer;
import com.google.gwt.text.shared.AbstractRenderer;
import com.google.gwt.text.shared.AbstractSafeHtmlRenderer;
import com.google.gwt.text.shared.Renderer;
import com.google.gwt.text.shared.SafeHtmlRenderer;
import com.puglieseweb.test.trms.client.managed.request.TaxiProxy;
import com.puglieseweb.test.trms.client.scaffold.ScaffoldMobileApp;
import com.puglieseweb.test.trms.client.scaffold.ui.MobileProxyListView;
import com.puglieseweb.test.trms.shared.domain.TaxiOptions;
import com.puglieseweb.test.trms.shared.domain.TaxiRankLocations;
import com.puglieseweb.test.trms.shared.domain.TaxiStatus;
import java.util.HashSet;
import java.util.Set;

public abstract class TaxiMobileListView_Roo_Gwt extends MobileProxyListView<TaxiProxy> {

    protected Set<String> paths = new HashSet<String>();

    public TaxiMobileListView_Roo_Gwt(String buttonText, SafeHtmlRenderer<com.puglieseweb.test.trms.client.managed.request.TaxiProxy> renderer) {
        super(buttonText, renderer);
    }

    public void init() {
        paths.add("id");
        paths.add("version");
    }
}
