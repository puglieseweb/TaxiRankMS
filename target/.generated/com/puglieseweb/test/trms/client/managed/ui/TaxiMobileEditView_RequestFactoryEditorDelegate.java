package com.puglieseweb.test.trms.client.managed.ui;

public class TaxiMobileEditView_RequestFactoryEditorDelegate extends com.google.gwt.requestfactory.client.impl.RequestFactoryEditorDelegate {
  private com.puglieseweb.test.trms.client.managed.ui.TaxiMobileEditView editor;
  protected com.puglieseweb.test.trms.client.managed.ui.TaxiMobileEditView getEditor() {return editor;}
  protected void setEditor(com.google.gwt.editor.client.Editor editor) {this.editor=(com.puglieseweb.test.trms.client.managed.ui.TaxiMobileEditView)editor;}
  private com.puglieseweb.test.trms.client.managed.request.TaxiProxy object;
  public com.puglieseweb.test.trms.client.managed.request.TaxiProxy getObject() {return object;}
  protected void setObject(Object object) {this.object=(com.puglieseweb.test.trms.client.managed.request.TaxiProxy)object;}
  protected void attachSubEditors(com.google.gwt.editor.client.impl.DelegateMap delegateMap) {
    if (editor.location.asEditor() != null) {
      if (true) editor.location.asEditor().setValue(getObject().getLocation());
      simpleEditors.put("location", editor.location.asEditor());
    }
    if (editor.status.asEditor() != null) {
      if (true) editor.status.asEditor().setValue(getObject().getStatus());
      simpleEditors.put("status", editor.status.asEditor());
    }
    if (editor.addOption.asEditor() != null) {
      if (true) editor.addOption.asEditor().setValue(getObject().getAddOption());
      simpleEditors.put("addOption", editor.addOption.asEditor());
    }
  }
  protected void flushSubEditors(java.util.List errorAccumulator) {
    if (editor.location.asEditor() != null && true) {
      getObject().setLocation(editor.location.asEditor().getValue());
    }
    if (editor.status.asEditor() != null && true) {
      getObject().setStatus(editor.status.asEditor().getValue());
    }
    if (editor.addOption.asEditor() != null && true) {
      getObject().setAddOption(editor.addOption.asEditor().getValue());
    }
  }
  protected void flushSubEditorErrors(java.util.List errorAccumulator) {
  }
  protected void refreshEditors() {
    if (editor.location.asEditor() != null) {
      if (true) editor.location.asEditor().setValue(getObject().getLocation());
      else { editor.location.asEditor().setValue(null); }
    }
    if (editor.status.asEditor() != null) {
      if (true) editor.status.asEditor().setValue(getObject().getStatus());
      else { editor.status.asEditor().setValue(null); }
    }
    if (editor.addOption.asEditor() != null) {
      if (true) editor.addOption.asEditor().setValue(getObject().getAddOption());
      else { editor.addOption.asEditor().setValue(null); }
    }
  }
  protected void traverse(java.util.List paths) {
    traverseEditor(getEditor(), "", paths);
  }
  public static void traverseEditor(com.puglieseweb.test.trms.client.managed.ui.TaxiMobileEditView editor, String prefix, java.util.List<String> paths) {
  }
}
