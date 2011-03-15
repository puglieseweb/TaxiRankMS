package com.puglieseweb.test.trms.client.managed.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.HTMLPanel;

public class TaxiDetailsView_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.HTMLPanel, com.puglieseweb.test.trms.client.managed.ui.TaxiDetailsView>, com.puglieseweb.test.trms.client.managed.ui.TaxiDetailsView.Binder {
  static TaxiDetailsViewBinderImplGenMessages messages = (TaxiDetailsViewBinderImplGenMessages) GWT.create(TaxiDetailsViewBinderImplGenMessages.class);

  public com.google.gwt.user.client.ui.HTMLPanel createAndBindUi(final com.puglieseweb.test.trms.client.managed.ui.TaxiDetailsView owner) {

    com.puglieseweb.test.trms.client.managed.ui.TaxiDetailsView_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.puglieseweb.test.trms.client.managed.ui.TaxiDetailsView_BinderImpl_GenBundle) GWT.create(com.puglieseweb.test.trms.client.managed.ui.TaxiDetailsView_BinderImpl_GenBundle.class);
    com.puglieseweb.test.trms.client.managed.ui.TaxiDetailsView_BinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    com.google.gwt.dom.client.SpanElement displayRenderer = null;
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.dom.client.SpanElement id = null;
    java.lang.String domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.dom.client.SpanElement version = null;
    java.lang.String domId2 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.dom.client.SpanElement location = null;
    java.lang.String domId3 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.dom.client.SpanElement status = null;
    java.lang.String domId4 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.dom.client.SpanElement addOption = null;
    java.lang.String domId5 = com.google.gwt.dom.client.Document.get().createUniqueId();
    java.lang.String domId6 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Button edit = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    java.lang.String domId7 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Anchor delete = (com.google.gwt.user.client.ui.Anchor) GWT.create(com.google.gwt.user.client.ui.Anchor.class);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel("<div class='" + "" + style.underline() + "" + "'> <h3 class='" + "" + style.header() + "" + "'>" + messages.message1("<span id='" + domId0 + "'>","</span>") + "</h3> </div> <table class='" + "" + style.fields() + "" + "' id='boundElementHolder'> <tr id='id'><td><span class='" + "" + style.label() + "" + "'>Id:</span></td><td><span id='" + domId1 + "'></span></td></tr> <tr id='version'><td><span class='" + "" + style.label() + "" + "'>Version:</span></td><td><span id='" + domId2 + "'></span></td></tr> <tr id='location'><td><span class='" + "" + style.label() + "" + "'>Location:</span></td><td><span id='" + domId3 + "'></span></td></tr> <tr id='status'><td><span class='" + "" + style.label() + "" + "'>Status:</span></td><td><span id='" + domId4 + "'></span></td></tr> <tr id='addOption'><td><span class='" + "" + style.label() + "" + "'>Add Option:</span></td><td><span id='" + domId5 + "'></span></td></tr> </table> <div class='" + "" + style.bar() + "" + "'> <span id='" + domId6 + "'></span> <span id='" + domId7 + "'></span> </div>");

    edit.setHTML("Edit");
    edit.addStyleName("" + style.button() + "");
    delete.setHTML("Delete");

    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
    displayRenderer = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    displayRenderer.removeAttribute("id");
    id = com.google.gwt.dom.client.Document.get().getElementById(domId1).cast();
    id.removeAttribute("id");
    version = com.google.gwt.dom.client.Document.get().getElementById(domId2).cast();
    version.removeAttribute("id");
    location = com.google.gwt.dom.client.Document.get().getElementById(domId3).cast();
    location.removeAttribute("id");
    status = com.google.gwt.dom.client.Document.get().getElementById(domId4).cast();
    status.removeAttribute("id");
    addOption = com.google.gwt.dom.client.Document.get().getElementById(domId5).cast();
    addOption.removeAttribute("id");
    com.google.gwt.user.client.Element domId6Element = com.google.gwt.dom.client.Document.get().getElementById(domId6).cast();
    com.google.gwt.user.client.Element domId7Element = com.google.gwt.dom.client.Document.get().getElementById(domId7).cast();
    attachRecord0.detach();
    f_HTMLPanel1.addAndReplaceElement(edit, domId6Element);
    f_HTMLPanel1.addAndReplaceElement(delete, domId7Element);


    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onDeleteClicked(event);
      }
    };
    delete.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onEditClicked(event);
      }
    };
    edit.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2);

    owner.addOption = addOption;
    owner.delete = delete;
    owner.displayRenderer = displayRenderer;
    owner.edit = edit;
    owner.id = id;
    owner.location = location;
    owner.status = status;
    owner.version = version;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return f_HTMLPanel1;
  }
}
