package com.puglieseweb.test.trms.client.managed.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class TaxiEditView_BinderImpl_GenBundle_default_InlineClientBundleGenerator implements com.puglieseweb.test.trms.client.managed.ui.TaxiEditView_BinderImpl_GenBundle {
  public com.puglieseweb.test.trms.client.managed.ui.TaxiEditView_BinderImpl_GenCss_style style() {
    return style;
  }
  private void _init0() {
    style = new com.puglieseweb.test.trms.client.managed.ui.TaxiEditView_BinderImpl_GenCss_style() {
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
      return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GLLMHHUDJJ{padding-right:" + ("0.5em")  + ";background-color:" + ("red")  + ";}.GLLMHHUDKJ{margin-top:" + ("0.5em")  + ";margin-right:" + ("1em")  + ";}.GLLMHHUDMJ{min-height:" + ("25px")  + ";font-weight:" + ("bold")  + ";}.GLLMHHUDIJ{margin-left:" + ("1em")  + ";}.GLLMHHUDHJ{margin-right:" + ("1em")  + ";}.GLLMHHUDLJ{margin-right:" + ("1em")  + ";color:" + ("#4b4a4a")  + ";text-shadow:") + (("#ddf"+ " " +"1px"+ " " +"1px"+ " " +"0")  + ";margin-bottom:" + ("0")  + ";}.GLLMHHUDNJ{border-bottom:" + ("2px"+ " " +"solid"+ " " +"#6f7277")  + ";}")) : ((".GLLMHHUDJJ{padding-left:" + ("0.5em")  + ";background-color:" + ("red")  + ";}.GLLMHHUDKJ{margin-top:" + ("0.5em")  + ";margin-left:" + ("1em")  + ";}.GLLMHHUDMJ{min-height:" + ("25px")  + ";font-weight:" + ("bold")  + ";}.GLLMHHUDIJ{margin-right:" + ("1em")  + ";}.GLLMHHUDHJ{margin-left:" + ("1em")  + ";}.GLLMHHUDLJ{margin-left:" + ("1em")  + ";color:" + ("#4b4a4a")  + ";text-shadow:") + (("#ddf"+ " " +"1px"+ " " +"1px"+ " " +"0")  + ";margin-bottom:" + ("0")  + ";}.GLLMHHUDNJ{border-bottom:" + ("2px"+ " " +"solid"+ " " +"#6f7277")  + ";}"));
    }
    public java.lang.String bar(){
      return "GLLMHHUDHJ";
    }
    public java.lang.String button(){
      return "GLLMHHUDIJ";
    }
    public java.lang.String errors(){
      return "GLLMHHUDJJ";
    }
    public java.lang.String fields(){
      return "GLLMHHUDKJ";
    }
    public java.lang.String header(){
      return "GLLMHHUDLJ";
    }
    public java.lang.String label(){
      return "GLLMHHUDMJ";
    }
    public java.lang.String underline(){
      return "GLLMHHUDNJ";
    }
  }
  ;
  }
  
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.puglieseweb.test.trms.client.managed.ui.TaxiEditView_BinderImpl_GenCss_style style;
  
  static {
    new TaxiEditView_BinderImpl_GenBundle_default_InlineClientBundleGenerator()._init0();
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
      case 'style': return this.@com.puglieseweb.test.trms.client.managed.ui.TaxiEditView_BinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
