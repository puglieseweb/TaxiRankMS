package com.puglieseweb.test.trms.client.managed.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.HTMLPanel;

public class TaxiMobileDetailsView_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.HTMLPanel, com.puglieseweb.test.trms.client.managed.ui.TaxiMobileDetailsView>, com.puglieseweb.test.trms.client.managed.ui.TaxiMobileDetailsView.Binder {

  public com.google.gwt.user.client.ui.HTMLPanel createAndBindUi(final com.puglieseweb.test.trms.client.managed.ui.TaxiMobileDetailsView owner) {

    com.puglieseweb.test.trms.client.managed.ui.TaxiMobileDetailsView_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.puglieseweb.test.trms.client.managed.ui.TaxiMobileDetailsView_BinderImpl_GenBundle) GWT.create(com.puglieseweb.test.trms.client.managed.ui.TaxiMobileDetailsView_BinderImpl_GenBundle.class);
    com.puglieseweb.test.trms.client.managed.ui.TaxiMobileDetailsView_BinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    com.google.gwt.dom.client.DivElement id = null;
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.dom.client.DivElement version = null;
    java.lang.String domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.dom.client.DivElement location = null;
    java.lang.String domId2 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.dom.client.DivElement status = null;
    java.lang.String domId3 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.dom.client.DivElement addOption = null;
    java.lang.String domId4 = com.google.gwt.dom.client.Document.get().createUniqueId();
    java.lang.String domId5 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Button delete = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    com.google.gwt.user.client.ui.HTMLPanel boundElementHolder = new com.google.gwt.user.client.ui.HTMLPanel("<div id='id'><div class='" + "" + style.label() + "" + "'>Id</div><div class='" + "" + style.value() + "" + "' id='" + domId0 + "'></div></div> <div id='version'><div class='" + "" + style.label() + "" + "'>Version</div><div class='" + "" + style.value() + "" + "' id='" + domId1 + "'></div></div> <div id='location'><div class='" + "" + style.label() + "" + "'>Location</div><div class='" + "" + style.value() + "" + "' id='" + domId2 + "'></div></div> <div id='status'><div class='" + "" + style.label() + "" + "'>Status</div><div class='" + "" + style.value() + "" + "' id='" + domId3 + "'></div></div> <div id='addOption'><div class='" + "" + style.label() + "" + "'>Add Option</div><div class='" + "" + style.value() + "" + "' id='" + domId4 + "'></div></div> <span id='" + domId5 + "'></span>");

    delete.setHTML("Delete");
    boundElementHolder.setStyleName("" + style.outer() + "");

    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(boundElementHolder.getElement());
    id = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    id.removeAttribute("id");
    version = com.google.gwt.dom.client.Document.get().getElementById(domId1).cast();
    version.removeAttribute("id");
    location = com.google.gwt.dom.client.Document.get().getElementById(domId2).cast();
    location.removeAttribute("id");
    status = com.google.gwt.dom.client.Document.get().getElementById(domId3).cast();
    status.removeAttribute("id");
    addOption = com.google.gwt.dom.client.Document.get().getElementById(domId4).cast();
    addOption.removeAttribute("id");
    com.google.gwt.user.client.Element domId5Element = com.google.gwt.dom.client.Document.get().getElementById(domId5).cast();
    attachRecord0.detach();
    boundElementHolder.addAndReplaceElement(delete, domId5Element);


    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onDeleteClicked(event);
      }
    };
    delete.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

    owner.addOption = addOption;
    owner.delete = delete;
    owner.id = id;
    owner.location = location;
    owner.status = status;
    owner.version = version;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return boundElementHolder;
  }
}
