package com.puglieseweb.test.trms.client.managed.activity;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.requestfactory.shared.EntityProxyId;
import com.google.gwt.requestfactory.shared.RequestContext;
import com.puglieseweb.test.trms.client.managed.request.ApplicationRequestFactory;
import com.puglieseweb.test.trms.client.managed.request.TaxiProxy;
import com.puglieseweb.test.trms.client.managed.request.TaxiRequest;
import com.puglieseweb.test.trms.client.managed.ui.TaxiDetailsView;
import com.puglieseweb.test.trms.client.managed.ui.TaxiEditView;
import com.puglieseweb.test.trms.client.managed.ui.TaxiListView;
import com.puglieseweb.test.trms.client.managed.ui.TaxiMobileDetailsView;
import com.puglieseweb.test.trms.client.managed.ui.TaxiMobileEditView;
import com.puglieseweb.test.trms.client.scaffold.ScaffoldApp;
import com.puglieseweb.test.trms.client.scaffold.place.CreateAndEditProxy;
import com.puglieseweb.test.trms.client.scaffold.place.FindAndEditProxy;
import com.puglieseweb.test.trms.client.scaffold.place.ProxyPlace;
import com.puglieseweb.test.trms.shared.domain.TaxiOptions;
import com.puglieseweb.test.trms.shared.domain.TaxiStatus;

public class TaxiActivitiesMapper {

    private final ApplicationRequestFactory requests;

    private final PlaceController placeController;

    public TaxiActivitiesMapper(ApplicationRequestFactory requests, PlaceController placeController) {
        this.requests = requests;
        this.placeController = placeController;
    }

    public Activity getActivity(ProxyPlace place) {
        switch(place.getOperation()) {
            case DETAILS:
                return new TaxiDetailsActivity((EntityProxyId<TaxiProxy>) place.getProxyId(), requests, placeController, ScaffoldApp.isMobile() ? TaxiMobileDetailsView.instance() : TaxiDetailsView.instance());
            case EDIT:
                return makeEditActivity(place);
            case CREATE:
                return makeCreateActivity();
        }
        throw new IllegalArgumentException("Unknown operation " + place.getOperation());
    }

    @SuppressWarnings("unchecked")
    private EntityProxyId<com.puglieseweb.test.trms.client.managed.request.TaxiProxy> coerceId(ProxyPlace place) {
        return (EntityProxyId<TaxiProxy>) place.getProxyId();
    }

    private Activity makeCreateActivity() {
        TaxiEditView.instance().setCreating(true);
        final TaxiRequest request = requests.taxiRequest();
        Activity activity = new CreateAndEditProxy<TaxiProxy>(TaxiProxy.class, request, ScaffoldApp.isMobile() ? TaxiMobileEditView.instance() : TaxiEditView.instance(), placeController) {

            @Override
            protected RequestContext createSaveRequest(TaxiProxy proxy) {
                request.persist().using(proxy);
                return request;
            }
        };
        return new TaxiEditActivityWrapper(requests, ScaffoldApp.isMobile() ? TaxiMobileEditView.instance() : TaxiEditView.instance(), activity, null);
    }

    private Activity makeEditActivity(ProxyPlace place) {
        TaxiEditView.instance().setCreating(false);
        EntityProxyId<TaxiProxy> proxyId = coerceId(place);
        Activity activity = new FindAndEditProxy<TaxiProxy>(proxyId, requests, ScaffoldApp.isMobile() ? TaxiMobileEditView.instance() : TaxiEditView.instance(), placeController) {

            @Override
            protected RequestContext createSaveRequest(TaxiProxy proxy) {
                TaxiRequest request = requests.taxiRequest();
                request.persist().using(proxy);
                return request;
            }
        };
        return new TaxiEditActivityWrapper(requests, ScaffoldApp.isMobile() ? TaxiMobileEditView.instance() : TaxiEditView.instance(), activity, proxyId);
    }
}
