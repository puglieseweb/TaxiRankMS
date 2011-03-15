package com.puglieseweb.test.trms.client.scaffold;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class ScaffoldDesktopShell_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.puglieseweb.test.trms.client.scaffold.ScaffoldDesktopShell>, com.puglieseweb.test.trms.client.scaffold.ScaffoldDesktopShell.Binder {

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.puglieseweb.test.trms.client.scaffold.ScaffoldDesktopShell owner) {

    com.puglieseweb.test.trms.client.scaffold.ScaffoldDesktopShell_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.puglieseweb.test.trms.client.scaffold.ScaffoldDesktopShell_BinderImpl_GenBundle) GWT.create(com.puglieseweb.test.trms.client.scaffold.ScaffoldDesktopShell_BinderImpl_GenBundle.class);
    com.google.gwt.resources.client.ImageResource gwtLogo = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.gwtLogo();
    com.google.gwt.resources.client.ImageResource rooLogo = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.rooLogo();
    com.google.gwt.resources.client.ImageResource background = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.background();
    com.puglieseweb.test.trms.client.scaffold.ScaffoldDesktopShell_BinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    com.google.gwt.dom.client.DivElement error = null;
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    java.lang.String domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.puglieseweb.test.trms.client.scaffold.ui.LoginWidget loginWidget = (com.puglieseweb.test.trms.client.scaffold.ui.LoginWidget) GWT.create(com.puglieseweb.test.trms.client.scaffold.ui.LoginWidget.class);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel2 = new com.google.gwt.user.client.ui.HTMLPanel("<div class='" + "" + style.banner() + "" + "'> <div class='" + "" + style.error() + "" + "' id='" + domId0 + "'></div> <span class='" + "" + style.logos() + "" + "'> </span> <div class='" + "" + style.title() + "" + "'> <h1> <a href='http://www.puglieseweb.com/' title='Test - Roo GWT application - Testing new Technologies...'>Taxi Rank Management Sytem</a> </h1> <div> <h3>Roo GWT Application</h3> <a href='http://code.google.com/webtoolkit/' title='GWT Website'> <div class='" + "" + style.gwtLogo() + "" + "'></div> </a> <a href='http://www.springsource.org/roo/' title='Spring Roo Website'> <div class='" + "" + style.rooLogo() + "" + "'></div> </a> </div> </div> <span id='" + domId1 + "'></span> </div>");
    com.google.gwt.user.client.ui.HTML f_HTML3 = (com.google.gwt.user.client.ui.HTML) GWT.create(com.google.gwt.user.client.ui.HTML.class);
    com.google.gwt.user.client.ui.ValuePicker placesBox = owner.placesBox;
    com.google.gwt.user.client.ui.SimplePanel f_SimplePanel5 = (com.google.gwt.user.client.ui.SimplePanel) GWT.create(com.google.gwt.user.client.ui.SimplePanel.class);
    com.google.gwt.user.client.ui.NotificationMole mole = (com.google.gwt.user.client.ui.NotificationMole) GWT.create(com.google.gwt.user.client.ui.NotificationMole.class);
    com.google.gwt.user.client.ui.SimplePanel master = (com.google.gwt.user.client.ui.SimplePanel) GWT.create(com.google.gwt.user.client.ui.SimplePanel.class);
    com.google.gwt.user.client.ui.FlowPanel f_FlowPanel6 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
    com.google.gwt.user.client.ui.SimplePanel details = (com.google.gwt.user.client.ui.SimplePanel) GWT.create(com.google.gwt.user.client.ui.SimplePanel.class);
    com.google.gwt.user.client.ui.FlowPanel f_FlowPanel4 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
    com.google.gwt.user.client.ui.DockLayoutPanel f_DockLayoutPanel1 = new com.google.gwt.user.client.ui.DockLayoutPanel(com.google.gwt.dom.client.Style.Unit.EM);

    loginWidget.setStyleName("" + style.login() + "");
    f_HTMLPanel2.setStyleName("" + style.centered() + "");
    f_DockLayoutPanel1.addNorth(f_HTMLPanel2, 8);
    f_HTML3.setHTML("<div class='" + "" + style.footer() + "" + "'> <p> Powered by Emanuele Pugliese. <br> Copyleft (ↄ) 2011 <a href='http://www.puglieseweb.com' title='Emanuele Pugliese&#39;s Website'>Puglieseweb.com</a> </p> </div>");
    f_DockLayoutPanel1.addSouth(f_HTML3, 4);
    placesBox.setStyleName("" + style.entitiesList() + "");
    placesBox.setWidth("100%");
    placesBox.setPageSize(100);
    f_SimplePanel5.add(placesBox);
    f_SimplePanel5.setStyleName("" + style.entities() + "");
    f_FlowPanel4.add(f_SimplePanel5);
    mole.setMessage("loading...");
    mole.setAnimationDuration(0);
    f_FlowPanel6.add(mole);
    master.setStyleName("" + style.entityDetails() + "");
    f_FlowPanel6.add(master);
    f_FlowPanel4.add(f_FlowPanel6);
    details.setStyleName("" + style.entityDetails() + "");
    f_FlowPanel4.add(details);
    f_FlowPanel4.setStyleName("" + style.content() + " " + style.centered() + "");
    f_DockLayoutPanel1.add(f_FlowPanel4);
    f_DockLayoutPanel1.setStyleName("" + style.page() + "");

    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel2.getElement());
    error = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    error.removeAttribute("id");
    com.google.gwt.user.client.Element domId1Element = com.google.gwt.dom.client.Document.get().getElementById(domId1).cast();
    attachRecord0.detach();
    f_HTMLPanel2.addAndReplaceElement(loginWidget, domId1Element);


    owner.details = details;
    owner.error = error;
    owner.loginWidget = loginWidget;
    owner.master = master;
    owner.mole = mole;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return f_DockLayoutPanel1;
  }
}
