package com.puglieseweb.test.trms.client.managed.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class TaxiDetailsView_BinderImpl_GenBundle_default_InlineClientBundleGenerator implements com.puglieseweb.test.trms.client.managed.ui.TaxiDetailsView_BinderImpl_GenBundle {
  public com.puglieseweb.test.trms.client.managed.ui.TaxiDetailsView_BinderImpl_GenCss_style style() {
    return style;
  }
  private void _init0() {
    style = new com.puglieseweb.test.trms.client.managed.ui.TaxiDetailsView_BinderImpl_GenCss_style() {
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
      return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GLLMHHUDDJ{margin-top:" + ("0.5em")  + ";margin-right:" + ("1em")  + ";}.GLLMHHUDFJ{min-height:" + ("25px")  + ";font-weight:" + ("bold")  + ";}.GLLMHHUDCJ{margin-left:" + ("1em")  + ";}.GLLMHHUDBJ{margin-right:" + ("1em")  + ";}.GLLMHHUDEJ{margin-right:" + ("1em")  + ";color:" + ("#4b4a4a")  + ";text-shadow:" + ("#ddf"+ " " +"1px"+ " " +"1px"+ " " +"0")  + ";margin-bottom:" + ("0")  + ";}.GLLMHHUDGJ{border-bottom:") + (("2px"+ " " +"solid"+ " " +"#6f7277")  + ";}")) : ((".GLLMHHUDDJ{margin-top:" + ("0.5em")  + ";margin-left:" + ("1em")  + ";}.GLLMHHUDFJ{min-height:" + ("25px")  + ";font-weight:" + ("bold")  + ";}.GLLMHHUDCJ{margin-right:" + ("1em")  + ";}.GLLMHHUDBJ{margin-left:" + ("1em")  + ";}.GLLMHHUDEJ{margin-left:" + ("1em")  + ";color:" + ("#4b4a4a")  + ";text-shadow:" + ("#ddf"+ " " +"1px"+ " " +"1px"+ " " +"0")  + ";margin-bottom:" + ("0")  + ";}.GLLMHHUDGJ{border-bottom:") + (("2px"+ " " +"solid"+ " " +"#6f7277")  + ";}"));
    }
    public java.lang.String bar(){
      return "GLLMHHUDBJ";
    }
    public java.lang.String button(){
      return "GLLMHHUDCJ";
    }
    public java.lang.String fields(){
      return "GLLMHHUDDJ";
    }
    public java.lang.String header(){
      return "GLLMHHUDEJ";
    }
    public java.lang.String label(){
      return "GLLMHHUDFJ";
    }
    public java.lang.String underline(){
      return "GLLMHHUDGJ";
    }
  }
  ;
  }
  
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.puglieseweb.test.trms.client.managed.ui.TaxiDetailsView_BinderImpl_GenCss_style style;
  
  static {
    new TaxiDetailsView_BinderImpl_GenBundle_default_InlineClientBundleGenerator()._init0();
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
      case 'style': return this.@com.puglieseweb.test.trms.client.managed.ui.TaxiDetailsView_BinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
