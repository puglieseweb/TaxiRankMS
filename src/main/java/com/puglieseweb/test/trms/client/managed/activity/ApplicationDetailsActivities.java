package com.puglieseweb.test.trms.client.managed.activity;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.inject.Inject;
import com.puglieseweb.test.trms.client.managed.request.ApplicationEntityTypesProcessor;
import com.puglieseweb.test.trms.client.managed.request.ApplicationRequestFactory;
import com.puglieseweb.test.trms.client.managed.request.TaxiProxy;
import com.puglieseweb.test.trms.client.scaffold.place.ProxyPlace;

public class ApplicationDetailsActivities extends ApplicationDetailsActivities_Roo_Gwt {

    @Inject
    public ApplicationDetailsActivities(ApplicationRequestFactory requestFactory, PlaceController placeController) {
        this.requests = requestFactory;
        this.placeController = placeController;
    }
}
