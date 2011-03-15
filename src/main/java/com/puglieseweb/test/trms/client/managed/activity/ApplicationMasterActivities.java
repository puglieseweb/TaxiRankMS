package com.puglieseweb.test.trms.client.managed.activity;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.inject.Inject;
import com.puglieseweb.test.trms.client.managed.request.ApplicationEntityTypesProcessor;
import com.puglieseweb.test.trms.client.managed.request.ApplicationRequestFactory;
import com.puglieseweb.test.trms.client.managed.request.TaxiProxy;
import com.puglieseweb.test.trms.client.managed.ui.TaxiListView;
import com.puglieseweb.test.trms.client.managed.ui.TaxiMobileListView;
import com.puglieseweb.test.trms.client.scaffold.ScaffoldApp;
import com.puglieseweb.test.trms.client.scaffold.place.ProxyListPlace;

public final class ApplicationMasterActivities extends ApplicationMasterActivities_Roo_Gwt {

    @Inject
    public ApplicationMasterActivities(ApplicationRequestFactory requests, PlaceController placeController) {
        this.requests = requests;
        this.placeController = placeController;
    }
}
