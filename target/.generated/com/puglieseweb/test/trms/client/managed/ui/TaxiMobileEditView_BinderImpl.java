package com.puglieseweb.test.trms.client.managed.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.HTMLPanel;

public class TaxiMobileEditView_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.HTMLPanel, com.puglieseweb.test.trms.client.managed.ui.TaxiMobileEditView>, com.puglieseweb.test.trms.client.managed.ui.TaxiMobileEditView.Binder {

  public com.google.gwt.user.client.ui.HTMLPanel createAndBindUi(final com.puglieseweb.test.trms.client.managed.ui.TaxiMobileEditView owner) {

    com.puglieseweb.test.trms.client.managed.ui.TaxiMobileEditView_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.puglieseweb.test.trms.client.managed.ui.TaxiMobileEditView_BinderImpl_GenBundle) GWT.create(com.puglieseweb.test.trms.client.managed.ui.TaxiMobileEditView_BinderImpl_GenBundle.class);
    com.puglieseweb.test.trms.client.managed.ui.TaxiMobileEditView_BinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    com.google.gwt.dom.client.DivElement errors = null;
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    java.lang.String domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.ValueListBox location = owner.location;
    java.lang.String domId2 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.ValueListBox status = owner.status;
    java.lang.String domId3 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.ValueListBox addOption = owner.addOption;
    java.lang.String domId4 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Button save = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    com.google.gwt.user.client.ui.HTMLPanel boundElementHolder = new com.google.gwt.user.client.ui.HTMLPanel("<div class='" + "" + style.error() + "" + "' id='" + domId0 + "'></div> <div id='location'><div class='" + "" + style.label() + "" + "'>Location</div><div class='" + "" + style.value() + "" + "'><span id='" + domId1 + "'></span></div></div> <div id='status'><div class='" + "" + style.label() + "" + "'>Status</div><div class='" + "" + style.value() + "" + "'><span id='" + domId2 + "'></span></div></div> <div id='addOption'><div class='" + "" + style.label() + "" + "'>Add Option</div><div class='" + "" + style.value() + "" + "'><span id='" + domId3 + "'></span></div></div> <span id='" + domId4 + "'></span>");

    save.setHTML("Save");
    boundElementHolder.setStyleName("" + style.outer() + "");

    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(boundElementHolder.getElement());
    errors = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    errors.removeAttribute("id");
    com.google.gwt.user.client.Element domId1Element = com.google.gwt.dom.client.Document.get().getElementById(domId1).cast();
    com.google.gwt.user.client.Element domId2Element = com.google.gwt.dom.client.Document.get().getElementById(domId2).cast();
    com.google.gwt.user.client.Element domId3Element = com.google.gwt.dom.client.Document.get().getElementById(domId3).cast();
    com.google.gwt.user.client.Element domId4Element = com.google.gwt.dom.client.Document.get().getElementById(domId4).cast();
    attachRecord0.detach();
    boundElementHolder.addAndReplaceElement(location, domId1Element);
    boundElementHolder.addAndReplaceElement(status, domId2Element);
    boundElementHolder.addAndReplaceElement(addOption, domId3Element);
    boundElementHolder.addAndReplaceElement(save, domId4Element);


    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onSave(event);
      }
    };
    save.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

    owner.errors = errors;
    owner.save = save;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return boundElementHolder;
  }
}
