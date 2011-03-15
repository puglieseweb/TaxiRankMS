package com.puglieseweb.test.trms.client.style;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class MobileListResources_default_StaticClientBundleGenerator implements com.puglieseweb.test.trms.client.style.MobileListResources {
  public com.google.gwt.resources.client.ImageResource cellListSelectedBackground() {
    return cellListSelectedBackground;
  }
  public com.puglieseweb.test.trms.client.style.MobileListResources.MobileStyle cellListStyle() {
    return cellListStyle;
  }
  private void _init0() {
    cellListSelectedBackground = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
    "cellListSelectedBackground",
    com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ?bundledImage_Horizontal_rtl : bundledImage_Horizontal,
    0, 0, 82, 26, false, false
  );
    cellListStyle = new com.puglieseweb.test.trms.client.style.MobileListResources.MobileStyle() {
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
      return "cellListStyle";
    }
    public String getText() {
      return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GLLMHHUDIH,.GLLMHHUDKH{cursor:" + ("pointer")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#ddd")  + ";padding:" + ("10px")  + ";font-weight:" + ("bold")  + ";font-size:" + ("12pt")  + ";}.GLLMHHUDOH{padding-top:" + ("2px")  + ";color:" + ("#888")  + ";font-size:" + ("10pt")  + ";width:" + ("70%")  + ";overflow:" + ("hidden")  + ";min-height:") + (("10pt")  + ";}.GLLMHHUDNH{padding-top:" + ("2px")  + ";text-align:" + ("left")  + ";color:" + ("#888")  + ";font-size:" + ("10pt")  + ";overflow:" + ("hidden")  + ";position:" + ("absolute")  + ";top:" + ("0")  + ";left:" + ("10px")  + ";}.gwt-TextBox,.gwt-DateBox{border:" + ("1px"+ " " +"solid"+ " " +"black")  + ";padding:" + ("1px") ) + (";}")) : ((".GLLMHHUDIH,.GLLMHHUDKH{cursor:" + ("pointer")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#ddd")  + ";padding:" + ("10px")  + ";font-weight:" + ("bold")  + ";font-size:" + ("12pt")  + ";}.GLLMHHUDOH{padding-top:" + ("2px")  + ";color:" + ("#888")  + ";font-size:" + ("10pt")  + ";width:" + ("70%")  + ";overflow:" + ("hidden")  + ";min-height:") + (("10pt")  + ";}.GLLMHHUDNH{padding-top:" + ("2px")  + ";text-align:" + ("right")  + ";color:" + ("#888")  + ";font-size:" + ("10pt")  + ";overflow:" + ("hidden")  + ";position:" + ("absolute")  + ";top:" + ("0")  + ";right:" + ("10px")  + ";}.gwt-TextBox,.gwt-DateBox{border:" + ("1px"+ " " +"solid"+ " " +"black")  + ";padding:" + ("1px") ) + (";}"));
    }
    public java.lang.String cellListEvenItem(){
      return "GLLMHHUDIH";
    }
    public java.lang.String cellListKeyboardSelectedItem(){
      return "GLLMHHUDJH";
    }
    public java.lang.String cellListOddItem(){
      return "GLLMHHUDKH";
    }
    public java.lang.String cellListSelectedItem(){
      return "GLLMHHUDLH";
    }
    public java.lang.String cellListWidget(){
      return "GLLMHHUDMH";
    }
    public java.lang.String dateProp(){
      return "GLLMHHUDNH";
    }
    public java.lang.String secondaryProp(){
      return "GLLMHHUDOH";
    }
  }
  ;
  }
  
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static final java.lang.String bundledImage_Horizontal = GWT.getModuleBaseURL() + "CD15EC0BBF9CD57F9198FD5C1C37122E.cache.png";
  private static final java.lang.String bundledImage_Horizontal_rtl = GWT.getModuleBaseURL() + "9760B036C3B6E12FF6DEEDC917855221.cache.png";
  private static com.google.gwt.resources.client.ImageResource cellListSelectedBackground;
  private static com.puglieseweb.test.trms.client.style.MobileListResources.MobileStyle cellListStyle;
  
  static {
    new MobileListResources_default_StaticClientBundleGenerator()._init0();
  }
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      cellListSelectedBackground(), 
      cellListStyle(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("cellListSelectedBackground", cellListSelectedBackground());
        resourceMap.put("cellListStyle", cellListStyle());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'cellListSelectedBackground': return this.@com.google.gwt.user.cellview.client.CellList.Resources::cellListSelectedBackground()();
      case 'cellListStyle': return this.@com.puglieseweb.test.trms.client.style.MobileListResources::cellListStyle()();
    }
    return null;
  }-*/;
}
