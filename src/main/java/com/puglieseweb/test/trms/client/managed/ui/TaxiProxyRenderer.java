package com.puglieseweb.test.trms.client.managed.ui;

import com.google.gwt.requestfactory.ui.client.ProxyRenderer;
import com.puglieseweb.test.trms.client.managed.request.TaxiProxy;
import com.puglieseweb.test.trms.shared.domain.TaxiOptions;
import com.puglieseweb.test.trms.shared.domain.TaxiStatus;

public class TaxiProxyRenderer extends ProxyRenderer<TaxiProxy> {

    private static com.puglieseweb.test.trms.client.managed.ui.TaxiProxyRenderer INSTANCE;

    protected TaxiProxyRenderer() {
        super(new String[] { "id" });
    }

    public static com.puglieseweb.test.trms.client.managed.ui.TaxiProxyRenderer instance() {
        if (INSTANCE == null) {
            INSTANCE = new TaxiProxyRenderer();
        }
        return INSTANCE;
    }

    public String render(TaxiProxy object) {
        if (object == null) {
            return "";
        }
        return object.getId() + " (" + object.getId() + ")";
    }
}
