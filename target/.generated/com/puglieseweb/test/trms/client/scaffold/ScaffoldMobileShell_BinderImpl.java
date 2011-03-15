package com.puglieseweb.test.trms.client.scaffold;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class ScaffoldMobileShell_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.puglieseweb.test.trms.client.scaffold.ScaffoldMobileShell>, com.puglieseweb.test.trms.client.scaffold.ScaffoldMobileShell.Binder {

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.puglieseweb.test.trms.client.scaffold.ScaffoldMobileShell owner) {

    com.puglieseweb.test.trms.client.scaffold.ScaffoldMobileShell_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.puglieseweb.test.trms.client.scaffold.ScaffoldMobileShell_BinderImpl_GenBundle) GWT.create(com.puglieseweb.test.trms.client.scaffold.ScaffoldMobileShell_BinderImpl_GenBundle.class);
    com.google.gwt.resources.client.ImageResource titleGradient = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.titleGradient();
    com.google.gwt.resources.client.ImageResource backButtonImage = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.backButtonImage();
    com.puglieseweb.test.trms.client.scaffold.ScaffoldMobileShell_BinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    com.google.gwt.dom.client.TableElement backButtonWrapper = null;
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    java.lang.String domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Button backButton = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    com.google.gwt.dom.client.TableCellElement title = null;
    java.lang.String domId2 = com.google.gwt.dom.client.Document.get().createUniqueId();
    java.lang.String domId3 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Button editButton = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel2 = new com.google.gwt.user.client.ui.HTMLPanel("<table cellpadding='0' cellspacing='0' class='" + "" + style.titlebarLayout() + "" + "'> <tr> <td align='left' class='" + "" + style.backButtonCell() + "" + "' valign='middle'> <table cellpadding='0' cellspacing='0' id='" + domId0 + "'> <tr> <td> <div class='" + "" + style.backButtonImage() + "" + "'></div> </td> <td> <span id='" + domId1 + "'></span> </td> </tr> </table> </td> <td align='center' class='" + "" + style.title() + "" + "' id='" + domId2 + "' valign='middle'> All Entities </td> <td align='right' class='" + "" + style.editButtonCell() + "" + "' valign='middle'> <span id='" + domId3 + "'></span> </td> </tr> </table>");
    com.google.gwt.user.client.ui.SimplePanel body = (com.google.gwt.user.client.ui.SimplePanel) GWT.create(com.google.gwt.user.client.ui.SimplePanel.class);
    com.puglieseweb.test.trms.client.scaffold.ui.LoginWidget loginWidget = (com.puglieseweb.test.trms.client.scaffold.ui.LoginWidget) GWT.create(com.puglieseweb.test.trms.client.scaffold.ui.LoginWidget.class);
    com.google.gwt.user.client.ui.FlowPanel f_FlowPanel1 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);

    backButton.setHTML("Back");
    backButton.setStyleName("" + style.button() + " " + style.backButton() + "");
    editButton.setHTML("Edit");
    editButton.setStyleName("" + style.button() + "");
    f_HTMLPanel2.setStyleName("" + style.titlebar() + "");
    f_FlowPanel1.add(f_HTMLPanel2);
    f_FlowPanel1.add(body);
    loginWidget.setStyleName("" + style.login() + "");
    f_FlowPanel1.add(loginWidget);

    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel2.getElement());
    backButtonWrapper = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    backButtonWrapper.removeAttribute("id");
    com.google.gwt.user.client.Element domId1Element = com.google.gwt.dom.client.Document.get().getElementById(domId1).cast();
    title = com.google.gwt.dom.client.Document.get().getElementById(domId2).cast();
    title.removeAttribute("id");
    com.google.gwt.user.client.Element domId3Element = com.google.gwt.dom.client.Document.get().getElementById(domId3).cast();
    attachRecord0.detach();
    f_HTMLPanel2.addAndReplaceElement(backButton, domId1Element);
    f_HTMLPanel2.addAndReplaceElement(editButton, domId3Element);


    owner.backButton = backButton;
    owner.backButtonWrapper = backButtonWrapper;
    owner.body = body;
    owner.editButton = editButton;
    owner.loginWidget = loginWidget;
    owner.title = title;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return f_FlowPanel1;
  }
}
