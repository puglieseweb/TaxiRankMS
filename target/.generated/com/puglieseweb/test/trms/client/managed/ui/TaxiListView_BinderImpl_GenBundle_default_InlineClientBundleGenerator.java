package com.puglieseweb.test.trms.client.managed.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class TaxiListView_BinderImpl_GenBundle_default_InlineClientBundleGenerator implements com.puglieseweb.test.trms.client.managed.ui.TaxiListView_BinderImpl_GenBundle {
  public com.google.gwt.resources.client.ImageResource createButton() {
    return createButton;
  }
  public com.puglieseweb.test.trms.client.managed.ui.TaxiListView_BinderImpl_GenCss_style style() {
    return style;
  }
  private void _init0() {
    createButton = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
    "createButton",
    externalImage,
    0, 0, 19, 19, false, false
  );
    style = new com.puglieseweb.test.trms.client.managed.ui.TaxiListView_BinderImpl_GenCss_style() {
    private boolean injected;
    public boolean ensureInjected() {
      if (!injected) {
        injected = true;
        com.google.gwt.dom.client.StyleInjector.inject(getText());
        return true;
      }
      return false;
    }
    public String getName() {
      return "style";
    }
    public String getText() {
      return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GLLMHHUDCI{position:" + ("absolute")  + ";right:" + ("0")  + ";left:" + ("0")  + ";top:" + ("3px")  + ";height:" + ("2em")  + ";margin-right:" + ("15px")  + ";}.GLLMHHUDDI{height:" + ((TaxiListView_BinderImpl_GenBundle_default_InlineClientBundleGenerator.this.createButton()).getHeight() + "px")  + ";width:" + ((TaxiListView_BinderImpl_GenBundle_default_InlineClientBundleGenerator.this.createButton()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (TaxiListView_BinderImpl_GenBundle_default_InlineClientBundleGenerator.this.createButton()).getURL() + "\") -" + (TaxiListView_BinderImpl_GenBundle_default_InlineClientBundleGenerator.this.createButton()).getLeft() + "px -" + (TaxiListView_BinderImpl_GenBundle_default_InlineClientBundleGenerator.this.createButton()).getTop() + "px  no-repeat")  + ";border:") + (("0")  + ";margin-top:" + ("5px")  + ";width:" + ("12em")  + ";font-size:" + ("1em")  + ";cursor:" + ("pointer")  + ";text-align:" + ("right")  + ";padding-right:" + ("22px")  + ";}.GLLMHHUDCI table{position:" + ("absolute")  + ";left:" + ("0")  + ";top:" + ("0")  + ";}.GLLMHHUDCI button{display:" + ("inline") ) + (";}.GLLMHHUDEI{position:" + ("relative")  + ";}.GLLMHHUDEI>table{table-layout:" + ("fixed")  + ";}.GLLMHHUDEI>table td{text-overflow:" + ("ellipsis")  + ";overflow:" + ("hidden")  + ";white-space:" + ("nowrap")  + ";cursor:" + ("pointer")  + ";}")) : ((".GLLMHHUDCI{position:" + ("absolute")  + ";left:" + ("0")  + ";right:" + ("0")  + ";top:" + ("3px")  + ";height:" + ("2em")  + ";margin-left:" + ("15px")  + ";}.GLLMHHUDDI{height:" + ((TaxiListView_BinderImpl_GenBundle_default_InlineClientBundleGenerator.this.createButton()).getHeight() + "px")  + ";width:" + ((TaxiListView_BinderImpl_GenBundle_default_InlineClientBundleGenerator.this.createButton()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (TaxiListView_BinderImpl_GenBundle_default_InlineClientBundleGenerator.this.createButton()).getURL() + "\") -" + (TaxiListView_BinderImpl_GenBundle_default_InlineClientBundleGenerator.this.createButton()).getLeft() + "px -" + (TaxiListView_BinderImpl_GenBundle_default_InlineClientBundleGenerator.this.createButton()).getTop() + "px  no-repeat")  + ";border:") + (("0")  + ";margin-top:" + ("5px")  + ";width:" + ("12em")  + ";font-size:" + ("1em")  + ";cursor:" + ("pointer")  + ";text-align:" + ("left")  + ";padding-left:" + ("22px")  + ";}.GLLMHHUDCI table{position:" + ("absolute")  + ";right:" + ("0")  + ";top:" + ("0")  + ";}.GLLMHHUDCI button{display:" + ("inline") ) + (";}.GLLMHHUDEI{position:" + ("relative")  + ";}.GLLMHHUDEI>table{table-layout:" + ("fixed")  + ";}.GLLMHHUDEI>table td{text-overflow:" + ("ellipsis")  + ";overflow:" + ("hidden")  + ";white-space:" + ("nowrap")  + ";cursor:" + ("pointer")  + ";}"));
    }
    public java.lang.String controls(){
      return "GLLMHHUDCI";
    }
    public java.lang.String createButton(){
      return "GLLMHHUDDI";
    }
    public java.lang.String listView(){
      return "GLLMHHUDEI";
    }
  }
  ;
  }
  
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static final java.lang.String externalImage = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABMAAAATCAYAAAByUDbMAAADDElEQVR42nVUW0gUURgeu9/vUdEFfJDIgkAhW3Z3dlIrBX2RRtCdmwZCyUb7Ui/lPlQvuu3atrNzxl3rQX1oHyQEs4JQibTUqKTriwhlUFBgWaQPTfOdbdZZtw78nDn/+b5v/v/85z8MYx+BwKLCBn2paas4JbyhpCa+jfNGdjlFfQ9mujb92AcOeOZfg+eTiznl5gpXbWwjW6fu5kTtgEciDlbUij0COUpncw0/9oEDHjxmYUTY4Gr0LU4htpeVo2zZqRvCxfiInrg3OZzomxzFjDX82AcOePBsERo55b7Icmy4vSTfI8XKm+KjibsvZmYG384ZAwsM/qb4kwRwwIMHPnQYjgssKeX19axC8tyidjyUfNVjEQffzRldvWOGIsvG5SCxic4aYRMHPFtL8sCHDgNVt6DvwHn4QwPN/W9+/QbYInb1PjVkScoQw0+A87cONIMHPo2O49U1iMojksruka9T1p/tYojsSlDPSBeC3Y+/THlEtRLRQYdBVVwCOSheuO23Ay3RTjNNGWm2EOq3GzDggQ8dhh68pB06rz5qtcQafWepAAxRIU1qf32wnqH3FAse+NBh3HWRrS4xWhRoH2uz/tZ4xp8WUmyi1jeEe4Y/0MjBAx86TIkU3ewWogW+YP+l+RRn02nSAtBq6lkpwsAzC1AAHabIG1nHiuq+I/Vt1XeefZvOFEtdDVrNFpJ15/qef58uVnQefOgwDj60Er3nEjQuTO/YfFSpyFIFWFhN2NVbL7s5k4f2gg6DhnWcTGxCz3F15ERy6NOElS4sXc0gyUgxOfR5AninHN0PPm189BVUcfFccqywwtchdTyYGrffdkvAOgLsV5zukIAHj0Zl9SdaAZeuWNJ2ohi4iOeiD6919n98fX/8x0+IYMYafpe5j0N3mHjwaCvNDyMHjmNiy2q8WfRF8MYOcwopMw+3ihW0alYkVZyglsGPfeCATwmZTZ45jBzrTSttMBtXUbezYjyXPklmtVLz9Vz4aWOn37IsoWzRfD65DGeBNJz17WsxYw3//0T+AKQE12Y6YgSsAAAAAElFTkSuQmCC";
  private static com.google.gwt.resources.client.ImageResource createButton;
  private static com.puglieseweb.test.trms.client.managed.ui.TaxiListView_BinderImpl_GenCss_style style;
  
  static {
    new TaxiListView_BinderImpl_GenBundle_default_InlineClientBundleGenerator()._init0();
  }
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      createButton(), 
      style(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("createButton", createButton());
        resourceMap.put("style", style());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'createButton': return this.@com.puglieseweb.test.trms.client.managed.ui.TaxiListView_BinderImpl_GenBundle::createButton()();
      case 'style': return this.@com.puglieseweb.test.trms.client.managed.ui.TaxiListView_BinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
