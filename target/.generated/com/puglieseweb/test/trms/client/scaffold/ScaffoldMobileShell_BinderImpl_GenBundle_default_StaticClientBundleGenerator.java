package com.puglieseweb.test.trms.client.scaffold;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class ScaffoldMobileShell_BinderImpl_GenBundle_default_StaticClientBundleGenerator implements com.puglieseweb.test.trms.client.scaffold.ScaffoldMobileShell_BinderImpl_GenBundle {
  public com.google.gwt.resources.client.ImageResource backButtonImage() {
    return backButtonImage;
  }
  public com.google.gwt.resources.client.ImageResource titleGradient() {
    return titleGradient;
  }
  public com.puglieseweb.test.trms.client.scaffold.ScaffoldMobileShell_BinderImpl_GenCss_style style() {
    return style;
  }
  private void _init0() {
    backButtonImage = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
    "backButtonImage",
    bundledImage_None,
    0, 0, 9, 27, false, false
  );
    titleGradient = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
    "titleGradient",
    bundledImage_Horizontal,
    0, 0, 43, 44, false, false
  );
    style = new com.puglieseweb.test.trms.client.scaffold.ScaffoldMobileShell_BinderImpl_GenCss_style() {
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
      return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GLLMHHUDMI{height:" + ((ScaffoldMobileShell_BinderImpl_GenBundle_default_StaticClientBundleGenerator.this.titleGradient()).getHeight() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (ScaffoldMobileShell_BinderImpl_GenBundle_default_StaticClientBundleGenerator.this.titleGradient()).getURL() + "\") -" + (ScaffoldMobileShell_BinderImpl_GenBundle_default_StaticClientBundleGenerator.this.titleGradient()).getLeft() + "px -" + (ScaffoldMobileShell_BinderImpl_GenBundle_default_StaticClientBundleGenerator.this.titleGradient()).getTop() + "px  repeat-x")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#a0abbf")  + ";height:" + ("44px")  + ";}.GLLMHHUDNI{height:" + ("100%")  + ";width:" + ("100%")  + ";}.GLLMHHUDLI{color:" + ("#444")  + ";font-size:" + ("12pt")  + ";font-weight:" + ("bold")  + ";text-shadow:") + (("#ddd"+ " " +"1px"+ " " +"1px"+ " " +"1px")  + ";}.GLLMHHUDGI{width:" + ("50px")  + ";padding-right:" + ("5px")  + ";}.GLLMHHUDJI{width:" + ("50px")  + ";padding-left:" + ("5px")  + ";}.GLLMHHUDII{color:" + ("#4d657f")  + ";font-size:" + ("9pt")  + ";font-weight:" + ("bold")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#aebbdd")  + ";padding:" + ("4px"+ " " +"6px")  + ";background:" + ("#ecf1fd") ) + (";height:" + ("27px")  + ";}.GLLMHHUDFI{border-right:" + ("none")  + ";padding-right:" + ("2px")  + ";margin-right:" + ("0")  + ";}.GLLMHHUDHI{height:" + ((ScaffoldMobileShell_BinderImpl_GenBundle_default_StaticClientBundleGenerator.this.backButtonImage()).getHeight() + "px")  + ";width:" + ((ScaffoldMobileShell_BinderImpl_GenBundle_default_StaticClientBundleGenerator.this.backButtonImage()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (ScaffoldMobileShell_BinderImpl_GenBundle_default_StaticClientBundleGenerator.this.backButtonImage()).getURL() + "\") -" + (ScaffoldMobileShell_BinderImpl_GenBundle_default_StaticClientBundleGenerator.this.backButtonImage()).getLeft() + "px -" + (ScaffoldMobileShell_BinderImpl_GenBundle_default_StaticClientBundleGenerator.this.backButtonImage()).getTop() + "px  no-repeat")  + ";}.GLLMHHUDKI{height:" + ("32px")  + ";color:" + ("#222")  + ";text-align:") + (("center")  + ";background:" + ("white")  + ";padding:" + ("2px"+ " " +"0")  + ";border-top:" + ("1px"+ " " +"solid"+ " " +"#a0abbf")  + ";}")) : ((".GLLMHHUDMI{height:" + ((ScaffoldMobileShell_BinderImpl_GenBundle_default_StaticClientBundleGenerator.this.titleGradient()).getHeight() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (ScaffoldMobileShell_BinderImpl_GenBundle_default_StaticClientBundleGenerator.this.titleGradient()).getURL() + "\") -" + (ScaffoldMobileShell_BinderImpl_GenBundle_default_StaticClientBundleGenerator.this.titleGradient()).getLeft() + "px -" + (ScaffoldMobileShell_BinderImpl_GenBundle_default_StaticClientBundleGenerator.this.titleGradient()).getTop() + "px  repeat-x")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#a0abbf")  + ";height:" + ("44px")  + ";}.GLLMHHUDNI{height:" + ("100%")  + ";width:" + ("100%")  + ";}.GLLMHHUDLI{color:" + ("#444")  + ";font-size:" + ("12pt")  + ";font-weight:" + ("bold")  + ";text-shadow:") + (("#ddd"+ " " +"1px"+ " " +"1px"+ " " +"1px")  + ";}.GLLMHHUDGI{width:" + ("50px")  + ";padding-left:" + ("5px")  + ";}.GLLMHHUDJI{width:" + ("50px")  + ";padding-right:" + ("5px")  + ";}.GLLMHHUDII{color:" + ("#4d657f")  + ";font-size:" + ("9pt")  + ";font-weight:" + ("bold")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#aebbdd")  + ";padding:" + ("4px"+ " " +"6px")  + ";background:" + ("#ecf1fd") ) + (";height:" + ("27px")  + ";}.GLLMHHUDFI{border-left:" + ("none")  + ";padding-left:" + ("2px")  + ";margin-left:" + ("0")  + ";}.GLLMHHUDHI{height:" + ((ScaffoldMobileShell_BinderImpl_GenBundle_default_StaticClientBundleGenerator.this.backButtonImage()).getHeight() + "px")  + ";width:" + ((ScaffoldMobileShell_BinderImpl_GenBundle_default_StaticClientBundleGenerator.this.backButtonImage()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (ScaffoldMobileShell_BinderImpl_GenBundle_default_StaticClientBundleGenerator.this.backButtonImage()).getURL() + "\") -" + (ScaffoldMobileShell_BinderImpl_GenBundle_default_StaticClientBundleGenerator.this.backButtonImage()).getLeft() + "px -" + (ScaffoldMobileShell_BinderImpl_GenBundle_default_StaticClientBundleGenerator.this.backButtonImage()).getTop() + "px  no-repeat")  + ";}.GLLMHHUDKI{height:" + ("32px")  + ";color:" + ("#222")  + ";text-align:") + (("center")  + ";background:" + ("white")  + ";padding:" + ("2px"+ " " +"0")  + ";border-top:" + ("1px"+ " " +"solid"+ " " +"#a0abbf")  + ";}"));
    }
    public java.lang.String backButton(){
      return "GLLMHHUDFI";
    }
    public java.lang.String backButtonCell(){
      return "GLLMHHUDGI";
    }
    public java.lang.String backButtonImage(){
      return "GLLMHHUDHI";
    }
    public java.lang.String button(){
      return "GLLMHHUDII";
    }
    public java.lang.String editButtonCell(){
      return "GLLMHHUDJI";
    }
    public java.lang.String login(){
      return "GLLMHHUDKI";
    }
    public java.lang.String title(){
      return "GLLMHHUDLI";
    }
    public java.lang.String titlebar(){
      return "GLLMHHUDMI";
    }
    public java.lang.String titlebarLayout(){
      return "GLLMHHUDNI";
    }
  }
  ;
  }
  
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static final java.lang.String bundledImage_None = GWT.getModuleBaseURL() + "86936A39E7B2A9FE81863C792627814D.cache.png";
  private static final java.lang.String bundledImage_Horizontal = GWT.getModuleBaseURL() + "4DB30A786149AA814D5C3C8FF1B89153.cache.png";
  private static com.google.gwt.resources.client.ImageResource backButtonImage;
  private static com.google.gwt.resources.client.ImageResource titleGradient;
  private static com.puglieseweb.test.trms.client.scaffold.ScaffoldMobileShell_BinderImpl_GenCss_style style;
  
  static {
    new ScaffoldMobileShell_BinderImpl_GenBundle_default_StaticClientBundleGenerator()._init0();
  }
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      backButtonImage(), 
      titleGradient(), 
      style(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("backButtonImage", backButtonImage());
        resourceMap.put("titleGradient", titleGradient());
        resourceMap.put("style", style());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'backButtonImage': return this.@com.puglieseweb.test.trms.client.scaffold.ScaffoldMobileShell_BinderImpl_GenBundle::backButtonImage()();
      case 'titleGradient': return this.@com.puglieseweb.test.trms.client.scaffold.ScaffoldMobileShell_BinderImpl_GenBundle::titleGradient()();
      case 'style': return this.@com.puglieseweb.test.trms.client.scaffold.ScaffoldMobileShell_BinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
