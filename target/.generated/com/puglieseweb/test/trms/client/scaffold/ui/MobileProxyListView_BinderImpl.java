package com.puglieseweb.test.trms.client.scaffold.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class MobileProxyListView_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.puglieseweb.test.trms.client.scaffold.ui.MobileProxyListView>, com.puglieseweb.test.trms.client.scaffold.ui.MobileProxyListView.Binder {

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.puglieseweb.test.trms.client.scaffold.ui.MobileProxyListView owner) {

    com.puglieseweb.test.trms.client.scaffold.ui.MobileProxyListView_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.puglieseweb.test.trms.client.scaffold.ui.MobileProxyListView_BinderImpl_GenBundle) GWT.create(com.puglieseweb.test.trms.client.scaffold.ui.MobileProxyListView_BinderImpl_GenBundle.class);
    com.google.gwt.resources.client.ImageResource createButton = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.createButton();
    com.puglieseweb.test.trms.client.scaffold.ui.MobileProxyListView_BinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    com.google.gwt.user.client.ui.Button newButton = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    com.google.gwt.user.cellview.client.CellList list = owner.list;
    com.google.gwt.user.client.ui.FlowPanel f_FlowPanel1 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);

    newButton.setStyleName("" + style.createButton() + "");
    f_FlowPanel1.add(newButton);
    list.addStyleName("" + style.list() + "");
    list.setPageSize(8);
    f_FlowPanel1.add(list);



    owner.newButton = newButton;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return f_FlowPanel1;
  }
}
