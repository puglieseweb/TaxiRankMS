package com.puglieseweb.test.trms.client.managed.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class TaxiMobileDetailsView_BinderImpl_GenBundle_default_InlineClientBundleGenerator implements com.puglieseweb.test.trms.client.managed.ui.TaxiMobileDetailsView_BinderImpl_GenBundle {
  public com.puglieseweb.test.trms.client.managed.ui.TaxiMobileDetailsView_BinderImpl_GenCss_style style() {
    return style;
  }
  private void _init0() {
    style = new com.puglieseweb.test.trms.client.managed.ui.TaxiMobileDetailsView_BinderImpl_GenCss_style() {
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
      return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GLLMHHUDPJ{padding:" + ("10px")  + ";}.GLLMHHUDOJ{font-weight:" + ("bold")  + ";}.GLLMHHUDAK{padding:" + ("4px"+ " " +"15px"+ " " +"15px"+ " " +"0")  + ";}")) : ((".GLLMHHUDPJ{padding:" + ("10px")  + ";}.GLLMHHUDOJ{font-weight:" + ("bold")  + ";}.GLLMHHUDAK{padding:" + ("4px"+ " " +"0"+ " " +"15px"+ " " +"15px")  + ";}"));
    }
    public java.lang.String label(){
      return "GLLMHHUDOJ";
    }
    public java.lang.String outer(){
      return "GLLMHHUDPJ";
    }
    public java.lang.String value(){
      return "GLLMHHUDAK";
    }
  }
  ;
  }
  
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.puglieseweb.test.trms.client.managed.ui.TaxiMobileDetailsView_BinderImpl_GenCss_style style;
  
  static {
    new TaxiMobileDetailsView_BinderImpl_GenBundle_default_InlineClientBundleGenerator()._init0();
  }
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      style(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("style", style());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'style': return this.@com.puglieseweb.test.trms.client.managed.ui.TaxiMobileDetailsView_BinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
