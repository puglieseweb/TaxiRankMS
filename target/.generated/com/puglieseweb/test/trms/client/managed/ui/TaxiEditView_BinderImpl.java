package com.puglieseweb.test.trms.client.managed.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.HTMLPanel;

public class TaxiEditView_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.HTMLPanel, com.puglieseweb.test.trms.client.managed.ui.TaxiEditView>, com.puglieseweb.test.trms.client.managed.ui.TaxiEditView.Binder {
  static TaxiEditViewBinderImplGenMessages messages = (TaxiEditViewBinderImplGenMessages) GWT.create(TaxiEditViewBinderImplGenMessages.class);

  public com.google.gwt.user.client.ui.HTMLPanel createAndBindUi(final com.puglieseweb.test.trms.client.managed.ui.TaxiEditView owner) {

    com.puglieseweb.test.trms.client.managed.ui.TaxiEditView_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.puglieseweb.test.trms.client.managed.ui.TaxiEditView_BinderImpl_GenBundle) GWT.create(com.puglieseweb.test.trms.client.managed.ui.TaxiEditView_BinderImpl_GenBundle.class);
    com.puglieseweb.test.trms.client.managed.ui.TaxiEditView_BinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    com.google.gwt.dom.client.HeadingElement editTitle = null;
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.dom.client.HeadingElement createTitle = null;
    java.lang.String domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.dom.client.DivElement errors = null;
    java.lang.String domId2 = com.google.gwt.dom.client.Document.get().createUniqueId();
    java.lang.String domId3 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.ValueListBox location = owner.location;
    java.lang.String domId4 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.ValueListBox status = owner.status;
    java.lang.String domId5 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.ValueListBox addOption = owner.addOption;
    java.lang.String domId6 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Button save = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    java.lang.String domId7 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Button cancel = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel("<div class='" + "" + style.underline() + "" + "'> <h3 class='" + "" + style.header() + "" + "' id='" + domId0 + "'> " + messages.message1() + " </h3> <h3 class='" + "" + style.header() + "" + "' id='" + domId1 + "'>" + messages.message2() + "</h3> </div> <div class='" + "" + style.errors() + "" + "' id='" + domId2 + "'></div> <table class='" + "" + style.fields() + "" + "' id='boundElementHolder'> <tr id='location'><td><div class='" + "" + style.label() + "" + "'>Location:</div></td><td><span id='" + domId3 + "'></span></td></tr> <tr id='status'><td><div class='" + "" + style.label() + "" + "'>Status:</div></td><td><span id='" + domId4 + "'></span></td></tr> <tr id='addOption'><td><div class='" + "" + style.label() + "" + "'>Add Option:</div></td><td><span id='" + domId5 + "'></span></td></tr> </table> <div class='" + "" + style.bar() + "" + "'> <span id='" + domId6 + "'></span> <span id='" + domId7 + "'></span> </div>");

    save.setHTML("Save");
    save.addStyleName("" + style.button() + "");
    cancel.setHTML("Cancel");
    cancel.addStyleName("" + style.button() + "");

    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
    editTitle = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    editTitle.removeAttribute("id");
    createTitle = com.google.gwt.dom.client.Document.get().getElementById(domId1).cast();
    createTitle.removeAttribute("id");
    errors = com.google.gwt.dom.client.Document.get().getElementById(domId2).cast();
    errors.removeAttribute("id");
    com.google.gwt.user.client.Element domId3Element = com.google.gwt.dom.client.Document.get().getElementById(domId3).cast();
    com.google.gwt.user.client.Element domId4Element = com.google.gwt.dom.client.Document.get().getElementById(domId4).cast();
    com.google.gwt.user.client.Element domId5Element = com.google.gwt.dom.client.Document.get().getElementById(domId5).cast();
    com.google.gwt.user.client.Element domId6Element = com.google.gwt.dom.client.Document.get().getElementById(domId6).cast();
    com.google.gwt.user.client.Element domId7Element = com.google.gwt.dom.client.Document.get().getElementById(domId7).cast();
    attachRecord0.detach();
    f_HTMLPanel1.addAndReplaceElement(location, domId3Element);
    f_HTMLPanel1.addAndReplaceElement(status, domId4Element);
    f_HTMLPanel1.addAndReplaceElement(addOption, domId5Element);
    f_HTMLPanel1.addAndReplaceElement(save, domId6Element);
    f_HTMLPanel1.addAndReplaceElement(cancel, domId7Element);


    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onCancel(event);
      }
    };
    cancel.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onSave(event);
      }
    };
    save.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2);

    owner.cancel = cancel;
    owner.createTitle = createTitle;
    owner.editTitle = editTitle;
    owner.errors = errors;
    owner.save = save;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return f_HTMLPanel1;
  }
}
