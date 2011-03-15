package com.puglieseweb.test.trms.shared.gae;

public class GaeUserServiceRequestImpl extends com.google.gwt.requestfactory.shared.impl.AbstractRequestContext implements com.puglieseweb.test.trms.shared.gae.GaeUserServiceRequest {
  public GaeUserServiceRequestImpl(com.google.gwt.requestfactory.shared.impl.AbstractRequestFactory requestFactory) {super(requestFactory);}
  public  com.google.gwt.requestfactory.shared.Request<java.lang.String> createLoginURL(final java.lang.String destinationURL) {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<java.lang.String> implements com.google.gwt.requestfactory.shared.Request<java.lang.String> {
      public X() { super(GaeUserServiceRequestImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("com.puglieseweb.test.trms.shared.gae.GaeUserServiceRequest::createLoginURL", new Object[] {destinationURL}, propertyRefs, java.lang.String.class, null);
      }
    }
    X x = new X();
    addInvocation(x);
    return x;
  }
  public  com.google.gwt.requestfactory.shared.Request<java.lang.String> createLogoutURL(final java.lang.String destinationURL) {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<java.lang.String> implements com.google.gwt.requestfactory.shared.Request<java.lang.String> {
      public X() { super(GaeUserServiceRequestImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("com.puglieseweb.test.trms.shared.gae.GaeUserServiceRequest::createLogoutURL", new Object[] {destinationURL}, propertyRefs, java.lang.String.class, null);
      }
    }
    X x = new X();
    addInvocation(x);
    return x;
  }
  public  com.google.gwt.requestfactory.shared.Request<com.puglieseweb.test.trms.shared.gae.GaeUser> getCurrentUser() {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<com.puglieseweb.test.trms.shared.gae.GaeUser> implements com.google.gwt.requestfactory.shared.Request<com.puglieseweb.test.trms.shared.gae.GaeUser> {
      public X() { super(GaeUserServiceRequestImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("com.puglieseweb.test.trms.shared.gae.GaeUserServiceRequest::getCurrentUser", new Object[] {}, propertyRefs, com.puglieseweb.test.trms.shared.gae.GaeUser.class, null);
      }
    }
    X x = new X();
    addInvocation(x);
    return x;
  }
}
