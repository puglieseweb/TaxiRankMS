package com.google.gwt.user.cellview.client;

public class CellList_TemplateImpl implements com.google.gwt.user.cellview.client.CellList.Template {
  
  public com.google.gwt.safehtml.shared.SafeHtml divFocusable(int arg0,java.lang.String arg1,int arg2,com.google.gwt.safehtml.shared.SafeHtml arg3) {
    StringBuilder sb = new java.lang.StringBuilder()
        .append("<div onclick=\"\" __idx=\"")
        .append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(String.valueOf(arg0)))
        .append("\" class=\"")
        .append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg1))
        .append("\" style=\"outline:none;\" tabindex=\"")
        .append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(String.valueOf(arg2)))
        .append("\">")
        .append(arg3.asString())
        .append("</div>")
        ;
    return new com.google.gwt.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
  }
  
  public com.google.gwt.safehtml.shared.SafeHtml divFocusableWithKey(int arg0,java.lang.String arg1,int arg2,char arg3,com.google.gwt.safehtml.shared.SafeHtml arg4) {
    StringBuilder sb = new java.lang.StringBuilder()
        .append("<div onclick=\"\" __idx=\"")
        .append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(String.valueOf(arg0)))
        .append("\" class=\"")
        .append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg1))
        .append("\" style=\"outline:none;\" tabindex=\"")
        .append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(String.valueOf(arg2)))
        .append("\" accesskey=\"")
        .append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(String.valueOf(arg3)))
        .append("\">")
        .append(arg4.asString())
        .append("</div>")
        ;
    return new com.google.gwt.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
  }
  
  public com.google.gwt.safehtml.shared.SafeHtml div(int arg0,java.lang.String arg1,com.google.gwt.safehtml.shared.SafeHtml arg2) {
    StringBuilder sb = new java.lang.StringBuilder()
        .append("<div onclick=\"\" __idx=\"")
        .append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(String.valueOf(arg0)))
        .append("\" class=\"")
        .append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg1))
        .append("\" style=\"outline:none;\" >")
        .append(arg2.asString())
        .append("</div>")
        ;
    return new com.google.gwt.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
  }
}
