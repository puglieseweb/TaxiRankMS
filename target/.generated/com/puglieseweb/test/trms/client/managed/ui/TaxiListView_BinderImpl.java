package com.puglieseweb.test.trms.client.managed.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.HTMLPanel;

public class TaxiListView_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.HTMLPanel, com.puglieseweb.test.trms.client.managed.ui.TaxiListView>, com.puglieseweb.test.trms.client.managed.ui.TaxiListView.Binder {

  public com.google.gwt.user.client.ui.HTMLPanel createAndBindUi(final com.puglieseweb.test.trms.client.managed.ui.TaxiListView owner) {

    com.puglieseweb.test.trms.client.managed.ui.TaxiListView_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.puglieseweb.test.trms.client.managed.ui.TaxiListView_BinderImpl_GenBundle) GWT.create(com.puglieseweb.test.trms.client.managed.ui.TaxiListView_BinderImpl_GenBundle.class);
    com.google.gwt.resources.client.ImageResource createButton = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.createButton();
    com.puglieseweb.test.trms.client.managed.ui.TaxiListView_BinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.cellview.client.CellTable table = (com.google.gwt.user.cellview.client.CellTable) GWT.create(com.google.gwt.user.cellview.client.CellTable.class);
    java.lang.String domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Button newButton = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    java.lang.String domId2 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.cellview.client.SimplePager f_SimplePager2 = new com.google.gwt.user.cellview.client.SimplePager(com.google.gwt.user.cellview.client.SimplePager.TextLocation.RIGHT);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel("<div style='height:3em;'></div> <span id='" + domId0 + "'></span> <div class='" + "" + style.controls() + "" + "'> <span id='" + domId1 + "'></span> <span id='" + domId2 + "'></span> </div>");

    table.setWidth("100%");
    table.setPageSize(8);
    newButton.setHTML("Create Taxi");
    newButton.setStyleName("" + style.createButton() + "");
    f_SimplePager2.setDisplay(table);
    f_HTMLPanel1.setStyleName("" + style.listView() + "");

    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
    com.google.gwt.user.client.Element domId0Element = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    com.google.gwt.user.client.Element domId1Element = com.google.gwt.dom.client.Document.get().getElementById(domId1).cast();
    com.google.gwt.user.client.Element domId2Element = com.google.gwt.dom.client.Document.get().getElementById(domId2).cast();
    attachRecord0.detach();
    f_HTMLPanel1.addAndReplaceElement(table, domId0Element);
    f_HTMLPanel1.addAndReplaceElement(newButton, domId1Element);
    f_HTMLPanel1.addAndReplaceElement(f_SimplePager2, domId2Element);


    owner.newButton = newButton;
    owner.table = table;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return f_HTMLPanel1;
  }
}
