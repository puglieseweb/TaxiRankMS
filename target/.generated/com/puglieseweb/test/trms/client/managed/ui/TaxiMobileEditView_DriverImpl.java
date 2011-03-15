package com.puglieseweb.test.trms.client.managed.ui;

public class TaxiMobileEditView_DriverImpl extends com.google.gwt.requestfactory.client.impl.AbstractRequestFactoryEditorDriver<com.puglieseweb.test.trms.client.managed.request.TaxiProxy, com.puglieseweb.test.trms.client.managed.ui.TaxiMobileEditView> implements com.puglieseweb.test.trms.client.managed.ui.TaxiMobileEditView.Driver {
  protected com.google.gwt.requestfactory.client.impl.RequestFactoryEditorDelegate createDelegate() {
    return new com.puglieseweb.test.trms.client.managed.ui.TaxiMobileEditView_RequestFactoryEditorDelegate();
  }
  protected void traverseEditors(java.util.List<String> paths) {
    com.puglieseweb.test.trms.client.managed.ui.TaxiMobileEditView_RequestFactoryEditorDelegate.traverseEditor(getEditor(), "", paths);
  }
}
