package com.google.gwt.user.cellview.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class CellTable_Resources_default_StaticClientBundleGenerator implements com.google.gwt.user.cellview.client.CellTable.Resources {
  public com.google.gwt.resources.client.ImageResource cellTableFooterBackground() {
    return cellTableFooterBackground;
  }
  public com.google.gwt.resources.client.ImageResource cellTableHeaderBackground() {
    return cellTableHeaderBackground;
  }
  public com.google.gwt.resources.client.ImageResource cellTableLoading() {
    return cellTableLoading;
  }
  public com.google.gwt.resources.client.ImageResource cellTableSelectedBackground() {
    return cellTableSelectedBackground;
  }
  public com.google.gwt.resources.client.ImageResource cellTableSortAscending() {
    return cellTableSortAscending;
  }
  public com.google.gwt.resources.client.ImageResource cellTableSortDescending() {
    return cellTableSortDescending;
  }
  public com.google.gwt.user.cellview.client.CellTable.Style cellTableStyle() {
    return cellTableStyle;
  }
  private void _init0() {
    cellTableFooterBackground = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
    "cellTableFooterBackground",
    com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ?bundledImage_Horizontal_rtl : bundledImage_Horizontal,
    0, 0, 82, 23, false, false
  );
    cellTableHeaderBackground = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
    "cellTableHeaderBackground",
    com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ?bundledImage_Horizontal_rtl : bundledImage_Horizontal,
    0, 0, 82, 23, false, false
  );
    cellTableLoading = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
    "cellTableLoading",
    com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ?externalImage_rtl : externalImage,
    0, 0, 220, 19, true, false
  );
    cellTableSelectedBackground = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
    "cellTableSelectedBackground",
    com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ?bundledImage_Horizontal_rtl : bundledImage_Horizontal,
    0, 23, 82, 26, false, false
  );
    cellTableSortAscending = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
    "cellTableSortAscending",
    com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ?bundledImage_None_rtl : bundledImage_None,
    11, 0, 11, 7, false, false
  );
    cellTableSortDescending = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
    "cellTableSortDescending",
    com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ?bundledImage_None_rtl : bundledImage_None,
    0, 0, 11, 7, false, false
  );
    cellTableStyle = new com.google.gwt.user.cellview.client.CellTable.Style() {
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
      return "cellTableStyle";
    }
    public String getText() {
      return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GLLMHHUDNC{border-top:" + ("2px"+ " " +"solid"+ " " +"#6f7277")  + ";padding:" + ("3px"+ " " +"15px")  + ";text-align:" + ("right")  + ";color:" + ("#4b4a4a")  + ";text-shadow:" + ("#ddf"+ " " +"1px"+ " " +"1px"+ " " +"0")  + ";overflow:" + ("hidden")  + ";}.GLLMHHUDOC{border-bottom:" + ("2px"+ " " +"solid"+ " " +"#6f7277")  + ";padding:" + ("3px"+ " " +"15px")  + ";text-align:" + ("right")  + ";color:" + ("#4b4a4a")  + ";text-shadow:") + (("#ddf"+ " " +"1px"+ " " +"1px"+ " " +"0")  + ";overflow:" + ("hidden")  + ";}.GLLMHHUDHC{padding:" + ("2px"+ " " +"15px")  + ";overflow:" + ("hidden")  + ";}.GLLMHHUDMD{cursor:" + ("pointer")  + ";cursor:" + ("hand")  + ";}.GLLMHHUDMD:hover{color:" + ("#6c6b6b")  + ";}.GLLMHHUDIC{background:" + ("#fff")  + ";}.GLLMHHUDJC{border:" + ("2px"+ " " +"solid"+ " " +"#fff")  + ";}.GLLMHHUDID{background:" + ("#f3f7fb")  + ";}.GLLMHHUDJD{border:" + ("2px"+ " " +"solid"+ " " +"#f3f7fb") ) + (";}.GLLMHHUDPC{background:" + ("#eee")  + ";}.GLLMHHUDAD{border:" + ("2px"+ " " +"solid"+ " " +"#eee")  + ";}.GLLMHHUDCD{background:" + ("#ffc")  + ";}.GLLMHHUDDD{border:" + ("2px"+ " " +"solid"+ " " +"#ffc")  + ";}.GLLMHHUDKD{background:" + ("#628cd5")  + ";color:" + ("white")  + ";height:" + ("auto")  + ";overflow:" + ("auto")  + ";}.GLLMHHUDLD{border:" + ("2px"+ " " +"solid"+ " " +"#628cd5")  + ";}.GLLMHHUDBD{border:" + ("2px"+ " " +"solid"+ " " +"#d7dde8")  + ";}.GLLMHHUDHD{height:") + (((CellTable_Resources_default_StaticClientBundleGenerator.this.cellTableLoading()).getHeight() + "px")  + ";width:" + ((CellTable_Resources_default_StaticClientBundleGenerator.this.cellTableLoading()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (CellTable_Resources_default_StaticClientBundleGenerator.this.cellTableLoading()).getURL() + "\") -" + (CellTable_Resources_default_StaticClientBundleGenerator.this.cellTableLoading()).getLeft() + "px -" + (CellTable_Resources_default_StaticClientBundleGenerator.this.cellTableLoading()).getTop() + "px  no-repeat")  + ";margin:" + ("30px")  + ";}")) : ((".GLLMHHUDNC{border-top:" + ("2px"+ " " +"solid"+ " " +"#6f7277")  + ";padding:" + ("3px"+ " " +"15px")  + ";text-align:" + ("left")  + ";color:" + ("#4b4a4a")  + ";text-shadow:" + ("#ddf"+ " " +"1px"+ " " +"1px"+ " " +"0")  + ";overflow:" + ("hidden")  + ";}.GLLMHHUDOC{border-bottom:" + ("2px"+ " " +"solid"+ " " +"#6f7277")  + ";padding:" + ("3px"+ " " +"15px")  + ";text-align:" + ("left")  + ";color:" + ("#4b4a4a")  + ";text-shadow:") + (("#ddf"+ " " +"1px"+ " " +"1px"+ " " +"0")  + ";overflow:" + ("hidden")  + ";}.GLLMHHUDHC{padding:" + ("2px"+ " " +"15px")  + ";overflow:" + ("hidden")  + ";}.GLLMHHUDMD{cursor:" + ("pointer")  + ";cursor:" + ("hand")  + ";}.GLLMHHUDMD:hover{color:" + ("#6c6b6b")  + ";}.GLLMHHUDIC{background:" + ("#fff")  + ";}.GLLMHHUDJC{border:" + ("2px"+ " " +"solid"+ " " +"#fff")  + ";}.GLLMHHUDID{background:" + ("#f3f7fb")  + ";}.GLLMHHUDJD{border:" + ("2px"+ " " +"solid"+ " " +"#f3f7fb") ) + (";}.GLLMHHUDPC{background:" + ("#eee")  + ";}.GLLMHHUDAD{border:" + ("2px"+ " " +"solid"+ " " +"#eee")  + ";}.GLLMHHUDCD{background:" + ("#ffc")  + ";}.GLLMHHUDDD{border:" + ("2px"+ " " +"solid"+ " " +"#ffc")  + ";}.GLLMHHUDKD{background:" + ("#628cd5")  + ";color:" + ("white")  + ";height:" + ("auto")  + ";overflow:" + ("auto")  + ";}.GLLMHHUDLD{border:" + ("2px"+ " " +"solid"+ " " +"#628cd5")  + ";}.GLLMHHUDBD{border:" + ("2px"+ " " +"solid"+ " " +"#d7dde8")  + ";}.GLLMHHUDHD{height:") + (((CellTable_Resources_default_StaticClientBundleGenerator.this.cellTableLoading()).getHeight() + "px")  + ";width:" + ((CellTable_Resources_default_StaticClientBundleGenerator.this.cellTableLoading()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (CellTable_Resources_default_StaticClientBundleGenerator.this.cellTableLoading()).getURL() + "\") -" + (CellTable_Resources_default_StaticClientBundleGenerator.this.cellTableLoading()).getLeft() + "px -" + (CellTable_Resources_default_StaticClientBundleGenerator.this.cellTableLoading()).getTop() + "px  no-repeat")  + ";margin:" + ("30px")  + ";}"));
    }
    public java.lang.String cellTableCell(){
      return "GLLMHHUDHC";
    }
    public java.lang.String cellTableEvenRow(){
      return "GLLMHHUDIC";
    }
    public java.lang.String cellTableEvenRowCell(){
      return "GLLMHHUDJC";
    }
    public java.lang.String cellTableFirstColumn(){
      return "GLLMHHUDKC";
    }
    public java.lang.String cellTableFirstColumnFooter(){
      return "GLLMHHUDLC";
    }
    public java.lang.String cellTableFirstColumnHeader(){
      return "GLLMHHUDMC";
    }
    public java.lang.String cellTableFooter(){
      return "GLLMHHUDNC";
    }
    public java.lang.String cellTableHeader(){
      return "GLLMHHUDOC";
    }
    public java.lang.String cellTableHoveredRow(){
      return "GLLMHHUDPC";
    }
    public java.lang.String cellTableHoveredRowCell(){
      return "GLLMHHUDAD";
    }
    public java.lang.String cellTableKeyboardSelectedCell(){
      return "GLLMHHUDBD";
    }
    public java.lang.String cellTableKeyboardSelectedRow(){
      return "GLLMHHUDCD";
    }
    public java.lang.String cellTableKeyboardSelectedRowCell(){
      return "GLLMHHUDDD";
    }
    public java.lang.String cellTableLastColumn(){
      return "GLLMHHUDED";
    }
    public java.lang.String cellTableLastColumnFooter(){
      return "GLLMHHUDFD";
    }
    public java.lang.String cellTableLastColumnHeader(){
      return "GLLMHHUDGD";
    }
    public java.lang.String cellTableLoading(){
      return "GLLMHHUDHD";
    }
    public java.lang.String cellTableOddRow(){
      return "GLLMHHUDID";
    }
    public java.lang.String cellTableOddRowCell(){
      return "GLLMHHUDJD";
    }
    public java.lang.String cellTableSelectedRow(){
      return "GLLMHHUDKD";
    }
    public java.lang.String cellTableSelectedRowCell(){
      return "GLLMHHUDLD";
    }
    public java.lang.String cellTableSortableHeader(){
      return "GLLMHHUDMD";
    }
    public java.lang.String cellTableSortedHeaderAscending(){
      return "GLLMHHUDND";
    }
    public java.lang.String cellTableSortedHeaderDescending(){
      return "GLLMHHUDOD";
    }
    public java.lang.String cellTableWidget(){
      return "GLLMHHUDPD";
    }
  }
  ;
  }
  
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static final java.lang.String bundledImage_Horizontal = GWT.getModuleBaseURL() + "223E04DC70F69BC559571D1C0E0667E5.cache.png";
  private static final java.lang.String bundledImage_Horizontal_rtl = GWT.getModuleBaseURL() + "0326AF455425F6065C00E0361659A798.cache.png";
  private static final java.lang.String bundledImage_None = GWT.getModuleBaseURL() + "AB196D9D7834625802449A82C5811B43.cache.png";
  private static final java.lang.String bundledImage_None_rtl = GWT.getModuleBaseURL() + "3E13412DD77AE068AAF96B6978824A75.cache.png";
  private static final java.lang.String externalImage = GWT.getModuleBaseURL() + "182BA4497063143378FFE2BB7E67E86C.cache.gif";
  private static final java.lang.String externalImage_rtl = GWT.getModuleBaseURL() + "523B38788076F8F4B4F611EB0EA4A08F.cache.png";
  private static com.google.gwt.resources.client.ImageResource cellTableFooterBackground;
  private static com.google.gwt.resources.client.ImageResource cellTableHeaderBackground;
  private static com.google.gwt.resources.client.ImageResource cellTableLoading;
  private static com.google.gwt.resources.client.ImageResource cellTableSelectedBackground;
  private static com.google.gwt.resources.client.ImageResource cellTableSortAscending;
  private static com.google.gwt.resources.client.ImageResource cellTableSortDescending;
  private static com.google.gwt.user.cellview.client.CellTable.Style cellTableStyle;
  
  static {
    new CellTable_Resources_default_StaticClientBundleGenerator()._init0();
  }
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      cellTableFooterBackground(), 
      cellTableHeaderBackground(), 
      cellTableLoading(), 
      cellTableSelectedBackground(), 
      cellTableSortAscending(), 
      cellTableSortDescending(), 
      cellTableStyle(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("cellTableFooterBackground", cellTableFooterBackground());
        resourceMap.put("cellTableHeaderBackground", cellTableHeaderBackground());
        resourceMap.put("cellTableLoading", cellTableLoading());
        resourceMap.put("cellTableSelectedBackground", cellTableSelectedBackground());
        resourceMap.put("cellTableSortAscending", cellTableSortAscending());
        resourceMap.put("cellTableSortDescending", cellTableSortDescending());
        resourceMap.put("cellTableStyle", cellTableStyle());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'cellTableFooterBackground': return this.@com.google.gwt.user.cellview.client.CellTable.Resources::cellTableFooterBackground()();
      case 'cellTableHeaderBackground': return this.@com.google.gwt.user.cellview.client.CellTable.Resources::cellTableHeaderBackground()();
      case 'cellTableLoading': return this.@com.google.gwt.user.cellview.client.CellTable.Resources::cellTableLoading()();
      case 'cellTableSelectedBackground': return this.@com.google.gwt.user.cellview.client.CellTable.Resources::cellTableSelectedBackground()();
      case 'cellTableSortAscending': return this.@com.google.gwt.user.cellview.client.CellTable.Resources::cellTableSortAscending()();
      case 'cellTableSortDescending': return this.@com.google.gwt.user.cellview.client.CellTable.Resources::cellTableSortDescending()();
      case 'cellTableStyle': return this.@com.google.gwt.user.cellview.client.CellTable.Resources::cellTableStyle()();
    }
    return null;
  }-*/;
}
