package com.puglieseweb.test.trms.client.scaffold.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class MobileProxyListView_BinderImpl_GenBundle_default_StaticClientBundleGenerator implements com.puglieseweb.test.trms.client.scaffold.ui.MobileProxyListView_BinderImpl_GenBundle {
  public com.google.gwt.resources.client.ImageResource createButton() {
    return createButton;
  }
  public com.puglieseweb.test.trms.client.scaffold.ui.MobileProxyListView_BinderImpl_GenCss_style style() {
    return style;
  }
  private void _init0() {
    createButton = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
    "createButton",
    bundledImage_None,
    0, 0, 19, 19, false, false
  );
    style = new com.puglieseweb.test.trms.client.scaffold.ui.MobileProxyListView_BinderImpl_GenCss_style() {
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
      return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GLLMHHUDPI{height:" + ((MobileProxyListView_BinderImpl_GenBundle_default_StaticClientBundleGenerator.this.createButton()).getHeight() + "px")  + ";width:" + ((MobileProxyListView_BinderImpl_GenBundle_default_StaticClientBundleGenerator.this.createButton()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (MobileProxyListView_BinderImpl_GenBundle_default_StaticClientBundleGenerator.this.createButton()).getURL() + "\") -" + (MobileProxyListView_BinderImpl_GenBundle_default_StaticClientBundleGenerator.this.createButton()).getLeft() + "px -" + (MobileProxyListView_BinderImpl_GenBundle_default_StaticClientBundleGenerator.this.createButton()).getTop() + "px  no-repeat")  + ";border:" + ("0")  + ";margin:" + ("9px"+ " " +"9px"+ " " +"9px"+ " " +"0")  + ";width:" + ("12em")  + ";font-size:" + ("12pt")  + ";cursor:" + ("pointer")  + ";text-align:" + ("right")  + ";padding-right:") + (("22px")  + ";color:" + ("#6a779a")  + ";}.GLLMHHUDAJ{border-top:" + ("1px"+ " " +"solid"+ " " +"#ddd")  + ";}")) : ((".GLLMHHUDPI{height:" + ((MobileProxyListView_BinderImpl_GenBundle_default_StaticClientBundleGenerator.this.createButton()).getHeight() + "px")  + ";width:" + ((MobileProxyListView_BinderImpl_GenBundle_default_StaticClientBundleGenerator.this.createButton()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (MobileProxyListView_BinderImpl_GenBundle_default_StaticClientBundleGenerator.this.createButton()).getURL() + "\") -" + (MobileProxyListView_BinderImpl_GenBundle_default_StaticClientBundleGenerator.this.createButton()).getLeft() + "px -" + (MobileProxyListView_BinderImpl_GenBundle_default_StaticClientBundleGenerator.this.createButton()).getTop() + "px  no-repeat")  + ";border:" + ("0")  + ";margin:" + ("9px"+ " " +"0"+ " " +"9px"+ " " +"9px")  + ";width:" + ("12em")  + ";font-size:" + ("12pt")  + ";cursor:" + ("pointer")  + ";text-align:" + ("left")  + ";padding-left:") + (("22px")  + ";color:" + ("#6a779a")  + ";}.GLLMHHUDAJ{border-top:" + ("1px"+ " " +"solid"+ " " +"#ddd")  + ";}"));
    }
    public java.lang.String createButton(){
      return "GLLMHHUDPI";
    }
    public java.lang.String list(){
      return "GLLMHHUDAJ";
    }
  }
  ;
  }
  
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static final java.lang.String bundledImage_None = GWT.getModuleBaseURL() + "9CD64767FC975D4C997C8753923A8922.cache.png";
  private static com.google.gwt.resources.client.ImageResource createButton;
  private static com.puglieseweb.test.trms.client.scaffold.ui.MobileProxyListView_BinderImpl_GenCss_style style;
  
  static {
    new MobileProxyListView_BinderImpl_GenBundle_default_StaticClientBundleGenerator()._init0();
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
      case 'createButton': return this.@com.puglieseweb.test.trms.client.scaffold.ui.MobileProxyListView_BinderImpl_GenBundle::createButton()();
      case 'style': return this.@com.puglieseweb.test.trms.client.scaffold.ui.MobileProxyListView_BinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
