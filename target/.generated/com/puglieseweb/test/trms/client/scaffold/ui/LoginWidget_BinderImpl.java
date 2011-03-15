package com.puglieseweb.test.trms.client.scaffold.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class LoginWidget_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.puglieseweb.test.trms.client.scaffold.ui.LoginWidget>, com.puglieseweb.test.trms.client.scaffold.ui.LoginWidget.Binder {

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.puglieseweb.test.trms.client.scaffold.ui.LoginWidget owner) {

    com.puglieseweb.test.trms.client.scaffold.ui.LoginWidget_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.puglieseweb.test.trms.client.scaffold.ui.LoginWidget_BinderImpl_GenBundle) GWT.create(com.puglieseweb.test.trms.client.scaffold.ui.LoginWidget_BinderImpl_GenBundle.class);
    com.puglieseweb.test.trms.client.scaffold.ui.LoginWidget_BinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    com.google.gwt.dom.client.SpanElement name = null;
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    java.lang.String domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Anchor logoutLink = (com.google.gwt.user.client.ui.Anchor) GWT.create(com.google.gwt.user.client.ui.Anchor.class);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel("<div> <span id='" + domId0 + "'>Not logged in</span> | <span id='" + domId1 + "'></span> </div>");

    logoutLink.setHTML("Sign out");
    logoutLink.addStyleName("" + style.link() + "");

    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
    name = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    name.removeAttribute("id");
    com.google.gwt.user.client.Element domId1Element = com.google.gwt.dom.client.Document.get().getElementById(domId1).cast();
    attachRecord0.detach();
    f_HTMLPanel1.addAndReplaceElement(logoutLink, domId1Element);


    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.handleClick(event);
      }
    };
    logoutLink.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

    owner.logoutLink = logoutLink;
    owner.name = name;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return f_HTMLPanel1;
  }
}
