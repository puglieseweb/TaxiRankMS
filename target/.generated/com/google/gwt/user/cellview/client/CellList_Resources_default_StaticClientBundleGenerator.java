package com.google.gwt.user.cellview.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class CellList_Resources_default_StaticClientBundleGenerator implements com.google.gwt.user.cellview.client.CellList.Resources {
  public com.google.gwt.resources.client.ImageResource cellListSelectedBackground() {
    return cellListSelectedBackground;
  }
  public com.google.gwt.user.cellview.client.CellList.Style cellListStyle() {
    return cellListStyle;
  }
  private void _init0() {
    cellListSelectedBackground = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
    "cellListSelectedBackground",
    com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ?bundledImage_Horizontal_rtl : bundledImage_Horizontal,
    0, 0, 82, 26, false, false
  );
    cellListStyle = new com.google.gwt.user.cellview.client.CellList.Style() {
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
      return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GLLMHHUDJ,.GLLMHHUDL{cursor:" + ("pointer")  + ";zoom:" + ("1")  + ";}.GLLMHHUDK{background:" + ("#ffc")  + ";}.GLLMHHUDM{height:" + ((CellList_Resources_default_StaticClientBundleGenerator.this.cellListSelectedBackground()).getHeight() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (CellList_Resources_default_StaticClientBundleGenerator.this.cellListSelectedBackground()).getURL() + "\") -" + (CellList_Resources_default_StaticClientBundleGenerator.this.cellListSelectedBackground()).getLeft() + "px -" + (CellList_Resources_default_StaticClientBundleGenerator.this.cellListSelectedBackground()).getTop() + "px  repeat-x")  + ";background-color:" + ("#628cd5")  + ";color:" + ("white")  + ";height:" + ("auto")  + ";overflow:" + ("visible")  + ";}")) : ((".GLLMHHUDJ,.GLLMHHUDL{cursor:" + ("pointer")  + ";zoom:" + ("1")  + ";}.GLLMHHUDK{background:" + ("#ffc")  + ";}.GLLMHHUDM{height:" + ((CellList_Resources_default_StaticClientBundleGenerator.this.cellListSelectedBackground()).getHeight() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (CellList_Resources_default_StaticClientBundleGenerator.this.cellListSelectedBackground()).getURL() + "\") -" + (CellList_Resources_default_StaticClientBundleGenerator.this.cellListSelectedBackground()).getLeft() + "px -" + (CellList_Resources_default_StaticClientBundleGenerator.this.cellListSelectedBackground()).getTop() + "px  repeat-x")  + ";background-color:" + ("#628cd5")  + ";color:" + ("white")  + ";height:" + ("auto")  + ";overflow:" + ("visible")  + ";}"));
    }
    public java.lang.String cellListEvenItem(){
      return "GLLMHHUDJ";
    }
    public java.lang.String cellListKeyboardSelectedItem(){
      return "GLLMHHUDK";
    }
    public java.lang.String cellListOddItem(){
      return "GLLMHHUDL";
    }
    public java.lang.String cellListSelectedItem(){
      return "GLLMHHUDM";
    }
    public java.lang.String cellListWidget(){
      return "GLLMHHUDN";
    }
  }
  ;
  }
  
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static final java.lang.String bundledImage_Horizontal = GWT.getModuleBaseURL() + "CD15EC0BBF9CD57F9198FD5C1C37122E.cache.png";
  private static final java.lang.String bundledImage_Horizontal_rtl = GWT.getModuleBaseURL() + "9760B036C3B6E12FF6DEEDC917855221.cache.png";
  private static com.google.gwt.resources.client.ImageResource cellListSelectedBackground;
  private static com.google.gwt.user.cellview.client.CellList.Style cellListStyle;
  
  static {
    new CellList_Resources_default_StaticClientBundleGenerator()._init0();
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
      case 'cellListStyle': return this.@com.google.gwt.user.cellview.client.CellList.Resources::cellListStyle()();
    }
    return null;
  }-*/;
}
