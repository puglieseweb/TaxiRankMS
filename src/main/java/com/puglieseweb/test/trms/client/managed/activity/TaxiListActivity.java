package com.puglieseweb.test.trms.client.managed.activity;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.requestfactory.shared.Receiver;
import com.google.gwt.requestfactory.shared.Request;
import com.google.gwt.view.client.Range;
import com.puglieseweb.test.trms.client.managed.request.ApplicationRequestFactory;
import com.puglieseweb.test.trms.client.managed.request.TaxiProxy;
import com.puglieseweb.test.trms.client.scaffold.ScaffoldMobileApp;
import com.puglieseweb.test.trms.client.scaffold.activity.IsScaffoldMobileActivity;
import com.puglieseweb.test.trms.client.scaffold.place.AbstractProxyListActivity;
import com.puglieseweb.test.trms.client.scaffold.place.ProxyListView;
import com.puglieseweb.test.trms.shared.domain.TaxiOptions;
import com.puglieseweb.test.trms.shared.domain.TaxiStatus;
import java.util.List;

public class TaxiListActivity extends AbstractProxyListActivity<TaxiProxy> implements IsScaffoldMobileActivity {

    private final ApplicationRequestFactory requests;

    public TaxiListActivity(ApplicationRequestFactory requests, ProxyListView<com.puglieseweb.test.trms.client.managed.request.TaxiProxy> view, PlaceController placeController) {
        super(placeController, view, TaxiProxy.class);
        this.requests = requests;
    }

    public Place getBackButtonPlace() {
        return ScaffoldMobileApp.ROOT_PLACE;
    }

    public String getBackButtonText() {
        return "Entities";
    }

    public Place getEditButtonPlace() {
        return null;
    }

    public String getTitleText() {
        return "Taxis";
    }

    public boolean hasEditButton() {
        return false;
    }

    protected Request<java.util.List<com.puglieseweb.test.trms.client.managed.request.TaxiProxy>> createRangeRequest(Range range) {
        return requests.taxiRequest().findTaxiEntries(range.getStart(), range.getLength());
    }

    protected void fireCountRequest(Receiver<Long> callback) {
        requests.taxiRequest().countTaxis().fire(callback);
    }
}
