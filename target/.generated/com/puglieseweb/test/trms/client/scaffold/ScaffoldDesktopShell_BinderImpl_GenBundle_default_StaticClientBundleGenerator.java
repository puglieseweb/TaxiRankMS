package com.puglieseweb.test.trms.client.scaffold;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class ScaffoldDesktopShell_BinderImpl_GenBundle_default_StaticClientBundleGenerator implements com.puglieseweb.test.trms.client.scaffold.ScaffoldDesktopShell_BinderImpl_GenBundle {
  public com.google.gwt.resources.client.ImageResource background() {
    return background;
  }
  public com.google.gwt.resources.client.ImageResource gwtLogo() {
    return gwtLogo;
  }
  public com.google.gwt.resources.client.ImageResource rooLogo() {
    return rooLogo;
  }
  public com.puglieseweb.test.trms.client.scaffold.ScaffoldDesktopShell_BinderImpl_GenCss_style style() {
    return style;
  }
  private void _init0() {
    background = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
    "background",
    externalImage,
    0, 0, 1920, 720, false, true
  );
    gwtLogo = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
    "gwtLogo",
    bundledImage_None,
    38, 0, 22, 20, false, false
  );
    rooLogo = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
    "rooLogo",
    bundledImage_None,
    0, 0, 38, 20, false, false
  );
    style = new com.puglieseweb.test.trms.client.scaffold.ScaffoldDesktopShell_BinderImpl_GenCss_style() {
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
      return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GLLMHHUDEH{background-image:" + ("url(background.jpeg)")  + ";}.GLLMHHUDLG{color:" + ("gray")  + ";}.GLLMHHUDIG{overflow:" + ("auto")  + ";}.GLLMHHUDHG{margin-top:" + ("1.5em")  + ";height:" + ("6em")  + ";}.GLLMHHUDGH{color:" + ("white")  + ";position:" + ("absolute")  + ";color:" + ("black")  + ";margin:" + ("5px"+ " " +"0")  + ";padding:" + ("0")  + ";}.GLLMHHUDGH h1{margin:") + (("0")  + ";}.GLLMHHUDGH h1 a{text-decoration:" + ("none")  + ";color:" + ("#003a66")  + ";margin:" + ("0")  + ";padding:" + ("0")  + ";}.GLLMHHUDGH h3{margin:" + ("0"+ " " +"0"+ " " +"0"+ " " +"10px")  + ";color:" + ("#666")  + ";float:" + ("right")  + ";}.GLLMHHUDGH div{margin:" + ("0")  + ";text-align:" + ("left")  + ";}.GLLMHHUDGH a{margin:" + ("0"+ " " +"5px"+ " " +"0"+ " " +"0") ) + (";float:" + ("right")  + ";}.GLLMHHUDPG{position:" + ("absolute")  + ";right:" + ("12%")  + ";left:" + ("12%")  + ";text-align:" + ("center")  + ";background-color:" + ("red")  + ";}.GLLMHHUDCH{position:" + ("absolute")  + ";right:" + ("80%")  + ";left:" + ("0")  + ";text-align:" + ("center")  + ";color:") + (("black")  + ";}.GLLMHHUDHH{position:" + ("absolute")  + ";left:" + ("0")  + ";}.GLLMHHUDJG{width:" + ("850px")  + ";margin-left:" + ("auto")  + ";margin-right:" + ("auto")  + ";}.GLLMHHUDKG{position:" + ("relative")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#ddf")  + ";overflow-y:" + ("auto")  + ";overflow-x:" + ("hidden")  + ";-moz-border-radius-topleft:" + ("10px") ) + (";-webkit-border-top-right-radius:" + ("10px")  + ";-moz-border-radius-topright:" + ("10px")  + ";-webkit-border-top-left-radius:" + ("10px")  + ";background-color:" + ("white")  + ";-moz-border-radius-bottomleft:" + ("10px")  + ";-webkit-border-bottom-right-radius:" + ("10px")  + ";-moz-border-radius-bottomright:" + ("10px")  + ";-webkit-border-bottom-left-radius:" + ("10px")  + ";}.GLLMHHUDMG{position:" + ("absolute")  + ";right:" + ("0")  + ";top:") + (("0")  + ";bottom:" + ("0")  + ";width:" + ("11em")  + ";}.GLLMHHUDNG{border-left:" + ("1px"+ " " +"solid"+ " " +"#ddf")  + ";height:" + ("100%")  + ";outline:" + ("none")  + ";}.GLLMHHUDNG>div>div{padding-right:" + ("1em")  + ";padding-top:" + ("5px")  + ";padding-bottom:" + ("5px")  + ";}.GLLMHHUDOG{margin-right:" + ("11em")  + ";}.GLLMHHUDBH{height:" + ((ScaffoldDesktopShell_BinderImpl_GenBundle_default_StaticClientBundleGenerator.this.gwtLogo()).getHeight() + "px") ) + (";width:" + ((ScaffoldDesktopShell_BinderImpl_GenBundle_default_StaticClientBundleGenerator.this.gwtLogo()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (ScaffoldDesktopShell_BinderImpl_GenBundle_default_StaticClientBundleGenerator.this.gwtLogo()).getURL() + "\") -" + (ScaffoldDesktopShell_BinderImpl_GenBundle_default_StaticClientBundleGenerator.this.gwtLogo()).getLeft() + "px -" + (ScaffoldDesktopShell_BinderImpl_GenBundle_default_StaticClientBundleGenerator.this.gwtLogo()).getTop() + "px  no-repeat")  + ";float:" + ("left")  + ";}.GLLMHHUDFH{height:" + ((ScaffoldDesktopShell_BinderImpl_GenBundle_default_StaticClientBundleGenerator.this.rooLogo()).getHeight() + "px")  + ";width:" + ((ScaffoldDesktopShell_BinderImpl_GenBundle_default_StaticClientBundleGenerator.this.rooLogo()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (ScaffoldDesktopShell_BinderImpl_GenBundle_default_StaticClientBundleGenerator.this.rooLogo()).getURL() + "\") -" + (ScaffoldDesktopShell_BinderImpl_GenBundle_default_StaticClientBundleGenerator.this.rooLogo()).getLeft() + "px -" + (ScaffoldDesktopShell_BinderImpl_GenBundle_default_StaticClientBundleGenerator.this.rooLogo()).getTop() + "px  no-repeat")  + ";float:" + ("left")  + ";}.GLLMHHUDDH{color:" + ("#aaa")  + ";font-size:") + (("0.8em")  + ";width:" + ("160px")  + ";margin-right:" + ("auto")  + ";margin-left:" + ("auto")  + ";text-align:" + ("left")  + ";}.GLLMHHUDAH{color:" + ("#aaa")  + ";font-size:" + ("0.8em")  + ";text-align:" + ("center")  + ";}")) : ((".GLLMHHUDEH{background-image:" + ("url(background.jpeg)")  + ";}.GLLMHHUDLG{color:" + ("gray")  + ";}.GLLMHHUDIG{overflow:" + ("auto")  + ";}.GLLMHHUDHG{margin-top:" + ("1.5em")  + ";height:" + ("6em")  + ";}.GLLMHHUDGH{color:" + ("white")  + ";position:" + ("absolute")  + ";color:" + ("black")  + ";margin:" + ("5px"+ " " +"0")  + ";padding:" + ("0")  + ";}.GLLMHHUDGH h1{margin:") + (("0")  + ";}.GLLMHHUDGH h1 a{text-decoration:" + ("none")  + ";color:" + ("#003a66")  + ";margin:" + ("0")  + ";padding:" + ("0")  + ";}.GLLMHHUDGH h3{margin:" + ("0"+ " " +"10px"+ " " +"0"+ " " +"0")  + ";color:" + ("#666")  + ";float:" + ("left")  + ";}.GLLMHHUDGH div{margin:" + ("0")  + ";text-align:" + ("right")  + ";}.GLLMHHUDGH a{margin:" + ("0"+ " " +"0"+ " " +"0"+ " " +"5px") ) + (";float:" + ("left")  + ";}.GLLMHHUDPG{position:" + ("absolute")  + ";left:" + ("12%")  + ";right:" + ("12%")  + ";text-align:" + ("center")  + ";background-color:" + ("red")  + ";}.GLLMHHUDCH{position:" + ("absolute")  + ";left:" + ("80%")  + ";right:" + ("0")  + ";text-align:" + ("center")  + ";color:") + (("black")  + ";}.GLLMHHUDHH{position:" + ("absolute")  + ";right:" + ("0")  + ";}.GLLMHHUDJG{width:" + ("850px")  + ";margin-right:" + ("auto")  + ";margin-left:" + ("auto")  + ";}.GLLMHHUDKG{position:" + ("relative")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#ddf")  + ";overflow-y:" + ("auto")  + ";overflow-x:" + ("hidden")  + ";-moz-border-radius-topleft:" + ("10px") ) + (";-webkit-border-top-left-radius:" + ("10px")  + ";-moz-border-radius-topright:" + ("10px")  + ";-webkit-border-top-right-radius:" + ("10px")  + ";background-color:" + ("white")  + ";-moz-border-radius-bottomleft:" + ("10px")  + ";-webkit-border-bottom-left-radius:" + ("10px")  + ";-moz-border-radius-bottomright:" + ("10px")  + ";-webkit-border-bottom-right-radius:" + ("10px")  + ";}.GLLMHHUDMG{position:" + ("absolute")  + ";left:" + ("0")  + ";top:") + (("0")  + ";bottom:" + ("0")  + ";width:" + ("11em")  + ";}.GLLMHHUDNG{border-right:" + ("1px"+ " " +"solid"+ " " +"#ddf")  + ";height:" + ("100%")  + ";outline:" + ("none")  + ";}.GLLMHHUDNG>div>div{padding-left:" + ("1em")  + ";padding-top:" + ("5px")  + ";padding-bottom:" + ("5px")  + ";}.GLLMHHUDOG{margin-left:" + ("11em")  + ";}.GLLMHHUDBH{height:" + ((ScaffoldDesktopShell_BinderImpl_GenBundle_default_StaticClientBundleGenerator.this.gwtLogo()).getHeight() + "px") ) + (";width:" + ((ScaffoldDesktopShell_BinderImpl_GenBundle_default_StaticClientBundleGenerator.this.gwtLogo()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (ScaffoldDesktopShell_BinderImpl_GenBundle_default_StaticClientBundleGenerator.this.gwtLogo()).getURL() + "\") -" + (ScaffoldDesktopShell_BinderImpl_GenBundle_default_StaticClientBundleGenerator.this.gwtLogo()).getLeft() + "px -" + (ScaffoldDesktopShell_BinderImpl_GenBundle_default_StaticClientBundleGenerator.this.gwtLogo()).getTop() + "px  no-repeat")  + ";float:" + ("right")  + ";}.GLLMHHUDFH{height:" + ((ScaffoldDesktopShell_BinderImpl_GenBundle_default_StaticClientBundleGenerator.this.rooLogo()).getHeight() + "px")  + ";width:" + ((ScaffoldDesktopShell_BinderImpl_GenBundle_default_StaticClientBundleGenerator.this.rooLogo()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (ScaffoldDesktopShell_BinderImpl_GenBundle_default_StaticClientBundleGenerator.this.rooLogo()).getURL() + "\") -" + (ScaffoldDesktopShell_BinderImpl_GenBundle_default_StaticClientBundleGenerator.this.rooLogo()).getLeft() + "px -" + (ScaffoldDesktopShell_BinderImpl_GenBundle_default_StaticClientBundleGenerator.this.rooLogo()).getTop() + "px  no-repeat")  + ";float:" + ("right")  + ";}.GLLMHHUDDH{color:" + ("#aaa")  + ";font-size:") + (("0.8em")  + ";width:" + ("160px")  + ";margin-left:" + ("auto")  + ";margin-right:" + ("auto")  + ";text-align:" + ("right")  + ";}.GLLMHHUDAH{color:" + ("#aaa")  + ";font-size:" + ("0.8em")  + ";text-align:" + ("center")  + ";}"));
    }
    public java.lang.String banner(){
      return "GLLMHHUDHG";
    }
    public java.lang.String body(){
      return "GLLMHHUDIG";
    }
    public java.lang.String centered(){
      return "GLLMHHUDJG";
    }
    public java.lang.String content(){
      return "GLLMHHUDKG";
    }
    public java.lang.String disabled(){
      return "GLLMHHUDLG";
    }
    public java.lang.String entities(){
      return "GLLMHHUDMG";
    }
    public java.lang.String entitiesList(){
      return "GLLMHHUDNG";
    }
    public java.lang.String entityDetails(){
      return "GLLMHHUDOG";
    }
    public java.lang.String error(){
      return "GLLMHHUDPG";
    }
    public java.lang.String footer(){
      return "GLLMHHUDAH";
    }
    public java.lang.String gwtLogo(){
      return "GLLMHHUDBH";
    }
    public java.lang.String login(){
      return "GLLMHHUDCH";
    }
    public java.lang.String logos(){
      return "GLLMHHUDDH";
    }
    public java.lang.String page(){
      return "GLLMHHUDEH";
    }
    public java.lang.String rooLogo(){
      return "GLLMHHUDFH";
    }
    public java.lang.String title(){
      return "GLLMHHUDGH";
    }
    public java.lang.String users(){
      return "GLLMHHUDHH";
    }
  }
  ;
  }
  
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static final java.lang.String bundledImage_None = GWT.getModuleBaseURL() + "FF1AF23C6C21FE5AB5CC0016DE2BF803.cache.png";
  private static final java.lang.String externalImage = GWT.getModuleBaseURL() + "676B582DA773032463F24C3B59066D2D.cache.jpeg";
  private static com.google.gwt.resources.client.ImageResource background;
  private static com.google.gwt.resources.client.ImageResource gwtLogo;
  private static com.google.gwt.resources.client.ImageResource rooLogo;
  private static com.puglieseweb.test.trms.client.scaffold.ScaffoldDesktopShell_BinderImpl_GenCss_style style;
  
  static {
    new ScaffoldDesktopShell_BinderImpl_GenBundle_default_StaticClientBundleGenerator()._init0();
  }
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      background(), 
      gwtLogo(), 
      rooLogo(), 
      style(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("background", background());
        resourceMap.put("gwtLogo", gwtLogo());
        resourceMap.put("rooLogo", rooLogo());
        resourceMap.put("style", style());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'background': return this.@com.puglieseweb.test.trms.client.scaffold.ScaffoldDesktopShell_BinderImpl_GenBundle::background()();
      case 'gwtLogo': return this.@com.puglieseweb.test.trms.client.scaffold.ScaffoldDesktopShell_BinderImpl_GenBundle::gwtLogo()();
      case 'rooLogo': return this.@com.puglieseweb.test.trms.client.scaffold.ScaffoldDesktopShell_BinderImpl_GenBundle::rooLogo()();
      case 'style': return this.@com.puglieseweb.test.trms.client.scaffold.ScaffoldDesktopShell_BinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
