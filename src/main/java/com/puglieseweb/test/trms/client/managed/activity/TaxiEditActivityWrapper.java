package com.puglieseweb.test.trms.client.managed.activity;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.requestfactory.shared.EntityProxyId;
import com.google.gwt.requestfactory.shared.Receiver;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.puglieseweb.test.trms.client.managed.activity.TaxiEditActivityWrapper.View;
import com.puglieseweb.test.trms.client.managed.request.ApplicationRequestFactory;
import com.puglieseweb.test.trms.client.managed.request.TaxiProxy;
import com.puglieseweb.test.trms.client.scaffold.activity.IsScaffoldMobileActivity;
import com.puglieseweb.test.trms.client.scaffold.place.ProxyEditView;
import com.puglieseweb.test.trms.client.scaffold.place.ProxyListPlace;
import com.puglieseweb.test.trms.client.scaffold.place.ProxyPlace;
import com.puglieseweb.test.trms.shared.domain.TaxiOptions;
import com.puglieseweb.test.trms.shared.domain.TaxiStatus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TaxiEditActivityWrapper extends TaxiEditActivityWrapper_Roo_Gwt {

    private final EntityProxyId<TaxiProxy> proxyId;

    public TaxiEditActivityWrapper(ApplicationRequestFactory requests, View<?> view, Activity activity, EntityProxyId<com.puglieseweb.test.trms.client.managed.request.TaxiProxy> proxyId) {
        this.requests = requests;
        this.view = view;
        this.wrapped = activity;
        this.proxyId = proxyId;
    }

    public Place getBackButtonPlace() {
        return (proxyId == null) ? new ProxyListPlace(TaxiProxy.class) : new ProxyPlace(proxyId, ProxyPlace.Operation.DETAILS);
    }

    public String getBackButtonText() {
        return "Cancel";
    }

    public Place getEditButtonPlace() {
        return null;
    }

    public String getTitleText() {
        return (proxyId == null) ? "New Taxi" : "Edit Taxi";
    }

    public boolean hasEditButton() {
        return false;
    }

    @Override
    public String mayStop() {
        return wrapped.mayStop();
    }

    @Override
    public void onCancel() {
        wrapped.onCancel();
    }

    @Override
    public void onStop() {
        wrapped.onStop();
    }

    public interface View<V extends com.puglieseweb.test.trms.client.scaffold.place.ProxyEditView<com.puglieseweb.test.trms.client.managed.request.TaxiProxy, V>> extends View_Roo_Gwt<V> {
    }
}
