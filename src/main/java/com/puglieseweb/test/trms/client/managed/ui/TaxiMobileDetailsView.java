package com.puglieseweb.test.trms.client.managed.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
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
import com.puglieseweb.test.trms.client.managed.ui.TaxiMobileDetailsView.Binder;
import com.puglieseweb.test.trms.client.scaffold.place.ProxyDetailsView;
import com.puglieseweb.test.trms.shared.domain.TaxiOptions;
import com.puglieseweb.test.trms.shared.domain.TaxiStatus;

public class TaxiMobileDetailsView extends TaxiMobileDetailsView_Roo_Gwt {

    private static final Binder BINDER = GWT.create(Binder.class);

    private static com.puglieseweb.test.trms.client.managed.ui.TaxiMobileDetailsView instance;

    @UiField
    HasClickHandlers delete;

    private Delegate delegate;

    public TaxiMobileDetailsView() {
        initWidget(BINDER.createAndBindUi(this));
    }

    public static com.puglieseweb.test.trms.client.managed.ui.TaxiMobileDetailsView instance() {
        if (instance == null) {
            instance = new TaxiMobileDetailsView();
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

    public void setDelegate(Delegate delegate) {
        this.delegate = delegate;
    }

    interface Binder extends UiBinder<HTMLPanel, TaxiMobileDetailsView> {
    }
}
