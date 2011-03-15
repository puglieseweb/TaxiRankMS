package com.puglieseweb.test.trms.client.managed.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.SpanElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;
import com.puglieseweb.test.trms.client.managed.request.TaxiProxy;
import com.puglieseweb.test.trms.client.managed.ui.TaxiDetailsView.Binder;
import com.puglieseweb.test.trms.client.scaffold.place.ProxyDetailsView;
import com.puglieseweb.test.trms.client.scaffold.place.ProxyListView;
import com.puglieseweb.test.trms.shared.domain.TaxiOptions;
import com.puglieseweb.test.trms.shared.domain.TaxiStatus;

public class TaxiDetailsView extends TaxiDetailsView_Roo_Gwt {

    private static final Binder BINDER = GWT.create(Binder.class);

    private static com.puglieseweb.test.trms.client.managed.ui.TaxiDetailsView instance;

    @UiField
    HasClickHandlers edit;

    @UiField
    HasClickHandlers delete;

    private Delegate delegate;

    public TaxiDetailsView() {
        initWidget(BINDER.createAndBindUi(this));
    }

    public static com.puglieseweb.test.trms.client.managed.ui.TaxiDetailsView instance() {
        if (instance == null) {
            instance = new TaxiDetailsView();
        }
        return instance;
    }

    public Widget asWidget() {
        return this;
    }

    public boolean confirm(String msg) {
        return Window.confirm(msg);
    }

    public TaxiProxy getValue() {
        return proxy;
    }

    @UiHandler("delete")
    public void onDeleteClicked(ClickEvent e) {
        delegate.deleteClicked();
    }

    @UiHandler("edit")
    public void onEditClicked(ClickEvent e) {
        delegate.editClicked();
    }

    public void setDelegate(Delegate delegate) {
        this.delegate = delegate;
    }

    interface Binder extends UiBinder<HTMLPanel, TaxiDetailsView> {
    }
}
