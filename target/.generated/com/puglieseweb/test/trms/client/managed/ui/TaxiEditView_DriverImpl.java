package com.puglieseweb.test.trms.client.managed.ui;

public class TaxiEditView_DriverImpl extends com.google.gwt.requestfactory.client.impl.AbstractRequestFactoryEditorDriver<com.puglieseweb.test.trms.client.managed.request.TaxiProxy, com.puglieseweb.test.trms.client.managed.ui.TaxiEditView> implements com.puglieseweb.test.trms.client.managed.ui.TaxiEditView.Driver {
  protected com.google.gwt.requestfactory.client.impl.RequestFactoryEditorDelegate createDelegate() {
    return new com.puglieseweb.test.trms.client.managed.ui.TaxiEditView_RequestFactoryEditorDelegate();
  }
  protected void traverseEditors(java.util.List<String> paths) {
    com.puglieseweb.test.trms.client.managed.ui.TaxiEditView_RequestFactoryEditorDelegate.traverseEditor(getEditor(), "", paths);
  }
}
