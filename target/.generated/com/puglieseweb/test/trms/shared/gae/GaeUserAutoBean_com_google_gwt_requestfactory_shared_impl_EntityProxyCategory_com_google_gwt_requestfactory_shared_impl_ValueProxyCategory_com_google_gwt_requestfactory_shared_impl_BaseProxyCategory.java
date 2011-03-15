package com.puglieseweb.test.trms.shared.gae;

public class GaeUserAutoBean_com_google_gwt_requestfactory_shared_impl_EntityProxyCategory_com_google_gwt_requestfactory_shared_impl_ValueProxyCategory_com_google_gwt_requestfactory_shared_impl_BaseProxyCategory extends com.google.gwt.autobean.shared.impl.AbstractAutoBean<com.puglieseweb.test.trms.shared.gae.GaeUser> {
  private final com.puglieseweb.test.trms.shared.gae.GaeUser shim = new com.puglieseweb.test.trms.shared.gae.GaeUser() {
    public java.lang.String getEmail()  {
      GaeUserAutoBean_com_google_gwt_requestfactory_shared_impl_EntityProxyCategory_com_google_gwt_requestfactory_shared_impl_ValueProxyCategory_com_google_gwt_requestfactory_shared_impl_BaseProxyCategory.this.checkWrapped();
      java.lang.String toReturn = GaeUserAutoBean_com_google_gwt_requestfactory_shared_impl_EntityProxyCategory_com_google_gwt_requestfactory_shared_impl_ValueProxyCategory_com_google_gwt_requestfactory_shared_impl_BaseProxyCategory.this.get("getEmail", getWrapped().getEmail());
      toReturn = com.google.gwt.requestfactory.shared.impl.BaseProxyCategory.__intercept(GaeUserAutoBean_com_google_gwt_requestfactory_shared_impl_EntityProxyCategory_com_google_gwt_requestfactory_shared_impl_ValueProxyCategory_com_google_gwt_requestfactory_shared_impl_BaseProxyCategory.this, toReturn);
      return toReturn;
    }
    public java.lang.String getNickname()  {
      GaeUserAutoBean_com_google_gwt_requestfactory_shared_impl_EntityProxyCategory_com_google_gwt_requestfactory_shared_impl_ValueProxyCategory_com_google_gwt_requestfactory_shared_impl_BaseProxyCategory.this.checkWrapped();
      java.lang.String toReturn = GaeUserAutoBean_com_google_gwt_requestfactory_shared_impl_EntityProxyCategory_com_google_gwt_requestfactory_shared_impl_ValueProxyCategory_com_google_gwt_requestfactory_shared_impl_BaseProxyCategory.this.get("getNickname", getWrapped().getNickname());
      toReturn = com.google.gwt.requestfactory.shared.impl.BaseProxyCategory.__intercept(GaeUserAutoBean_com_google_gwt_requestfactory_shared_impl_EntityProxyCategory_com_google_gwt_requestfactory_shared_impl_ValueProxyCategory_com_google_gwt_requestfactory_shared_impl_BaseProxyCategory.this, toReturn);
      return toReturn;
    }
    @Override public boolean equals(Object o) {
      return this == o || getWrapped().equals(o);
    }
    @Override public int hashCode() {
      return getWrapped().hashCode();
    }
    @Override public String toString() {
      return getWrapped().toString();
    }
  };
  { com.google.gwt.core.client.impl.WeakMapping.set(shim, com.google.gwt.autobean.shared.AutoBean.class.getName(), this); }
  public GaeUserAutoBean_com_google_gwt_requestfactory_shared_impl_EntityProxyCategory_com_google_gwt_requestfactory_shared_impl_ValueProxyCategory_com_google_gwt_requestfactory_shared_impl_BaseProxyCategory(com.google.gwt.autobean.shared.AutoBeanFactory factory) {super(factory);}
  public GaeUserAutoBean_com_google_gwt_requestfactory_shared_impl_EntityProxyCategory_com_google_gwt_requestfactory_shared_impl_ValueProxyCategory_com_google_gwt_requestfactory_shared_impl_BaseProxyCategory(GaeUserAutoBean_com_google_gwt_requestfactory_shared_impl_EntityProxyCategory_com_google_gwt_requestfactory_shared_impl_ValueProxyCategory_com_google_gwt_requestfactory_shared_impl_BaseProxyCategory toClone, boolean deep) {
    super(toClone, deep);
  }
  public GaeUserAutoBean_com_google_gwt_requestfactory_shared_impl_EntityProxyCategory_com_google_gwt_requestfactory_shared_impl_ValueProxyCategory_com_google_gwt_requestfactory_shared_impl_BaseProxyCategory(com.google.gwt.autobean.shared.AutoBeanFactory factory, com.puglieseweb.test.trms.shared.gae.GaeUser wrapped) {
    super(factory, wrapped);
  }
  public com.puglieseweb.test.trms.shared.gae.GaeUser as() {return shim;}
  public com.puglieseweb.test.trms.shared.gae.GaeUserAutoBean_com_google_gwt_requestfactory_shared_impl_EntityProxyCategory_com_google_gwt_requestfactory_shared_impl_ValueProxyCategory_com_google_gwt_requestfactory_shared_impl_BaseProxyCategory clone(boolean deep) {
    return new GaeUserAutoBean_com_google_gwt_requestfactory_shared_impl_EntityProxyCategory_com_google_gwt_requestfactory_shared_impl_ValueProxyCategory_com_google_gwt_requestfactory_shared_impl_BaseProxyCategory(this, deep);
  }
  public Class<com.puglieseweb.test.trms.shared.gae.GaeUser> getType() {return com.puglieseweb.test.trms.shared.gae.GaeUser.class;}
  @Override protected com.puglieseweb.test.trms.shared.gae.GaeUser createSimplePeer() {
    return new com.puglieseweb.test.trms.shared.gae.GaeUser() {
      public java.lang.String getEmail()  {
        return (java.lang.String) values.get("email");
      }
      public java.lang.String getNickname()  {
        return (java.lang.String) values.get("nickname");
      }
      public boolean equals(java.lang.Object other)  {
        return com.google.gwt.requestfactory.shared.impl.ValueProxyCategory.equals(GaeUserAutoBean_com_google_gwt_requestfactory_shared_impl_EntityProxyCategory_com_google_gwt_requestfactory_shared_impl_ValueProxyCategory_com_google_gwt_requestfactory_shared_impl_BaseProxyCategory.this, other);
      }
      public int hashCode()  {
        return com.google.gwt.requestfactory.shared.impl.ValueProxyCategory.hashCode(GaeUserAutoBean_com_google_gwt_requestfactory_shared_impl_EntityProxyCategory_com_google_gwt_requestfactory_shared_impl_ValueProxyCategory_com_google_gwt_requestfactory_shared_impl_BaseProxyCategory.this);
      }
    };
  }
  @Override protected void traverseProperties(com.google.gwt.autobean.shared.AutoBeanVisitor visitor, com.google.gwt.autobean.shared.impl.AbstractAutoBean.OneShotContext ctx) {
    class _emailPropertyContext implements com.google.gwt.autobean.shared.AutoBeanVisitor.PropertyContext {
      public boolean canSet() { return true; }
      public Class<?> getType() { return java.lang.String.class; }
      public void set(Object obj) { 
        values.put("email", obj);
      }
    }
    {_emailPropertyContext _emailPropertyContext = new _emailPropertyContext();
      Object value = as().getEmail();
      if (visitor.visitValueProperty("email", value, _emailPropertyContext))
      visitor.endVisitValueProperty("email", value, _emailPropertyContext);
    }class _nicknamePropertyContext implements com.google.gwt.autobean.shared.AutoBeanVisitor.PropertyContext {
      public boolean canSet() { return true; }
      public Class<?> getType() { return java.lang.String.class; }
      public void set(Object obj) { 
        values.put("nickname", obj);
      }
    }
    {_nicknamePropertyContext _nicknamePropertyContext = new _nicknamePropertyContext();
      Object value = as().getNickname();
      if (visitor.visitValueProperty("nickname", value, _nicknamePropertyContext))
      visitor.endVisitValueProperty("nickname", value, _nicknamePropertyContext);
    }}
}
