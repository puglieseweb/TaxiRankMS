package com.puglieseweb.test.trms.client.managed.request;

public class TaxiRequestImpl extends com.google.gwt.requestfactory.shared.impl.AbstractRequestContext implements com.puglieseweb.test.trms.client.managed.request.TaxiRequest {
  public TaxiRequestImpl(com.google.gwt.requestfactory.shared.impl.AbstractRequestFactory requestFactory) {super(requestFactory);}
  public  com.google.gwt.requestfactory.shared.Request<java.lang.Long> countTaxis() {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<java.lang.Long> implements com.google.gwt.requestfactory.shared.Request<java.lang.Long> {
      public X() { super(TaxiRequestImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("com.puglieseweb.test.trms.client.managed.request.TaxiRequest::countTaxis", new Object[] {}, propertyRefs, java.lang.Long.class, null);
      }
    }
    X x = new X();
    addInvocation(x);
    return x;
  }
  public  com.google.gwt.requestfactory.shared.Request<java.util.List<com.puglieseweb.test.trms.client.managed.request.TaxiProxy>> findAllTaxis() {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<java.util.List<com.puglieseweb.test.trms.client.managed.request.TaxiProxy>> implements com.google.gwt.requestfactory.shared.Request<java.util.List<com.puglieseweb.test.trms.client.managed.request.TaxiProxy>> {
      public X() { super(TaxiRequestImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("com.puglieseweb.test.trms.client.managed.request.TaxiRequest::findAllTaxis", new Object[] {}, propertyRefs, java.util.List.class, com.puglieseweb.test.trms.client.managed.request.TaxiProxy.class);
      }
    }
    X x = new X();
    addInvocation(x);
    return x;
  }
  public  com.google.gwt.requestfactory.shared.Request<com.puglieseweb.test.trms.client.managed.request.TaxiProxy> findTaxi(final java.lang.Long id) {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<com.puglieseweb.test.trms.client.managed.request.TaxiProxy> implements com.google.gwt.requestfactory.shared.Request<com.puglieseweb.test.trms.client.managed.request.TaxiProxy> {
      public X() { super(TaxiRequestImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("com.puglieseweb.test.trms.client.managed.request.TaxiRequest::findTaxi", new Object[] {id}, propertyRefs, com.puglieseweb.test.trms.client.managed.request.TaxiProxy.class, null);
      }
    }
    X x = new X();
    addInvocation(x);
    return x;
  }
  public  com.google.gwt.requestfactory.shared.Request<java.util.List<com.puglieseweb.test.trms.client.managed.request.TaxiProxy>> findTaxiEntries(final int firstResult,final int maxResults) {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<java.util.List<com.puglieseweb.test.trms.client.managed.request.TaxiProxy>> implements com.google.gwt.requestfactory.shared.Request<java.util.List<com.puglieseweb.test.trms.client.managed.request.TaxiProxy>> {
      public X() { super(TaxiRequestImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("com.puglieseweb.test.trms.client.managed.request.TaxiRequest::findTaxiEntries", new Object[] {firstResult,maxResults}, propertyRefs, java.util.List.class, com.puglieseweb.test.trms.client.managed.request.TaxiProxy.class);
      }
    }
    X x = new X();
    addInvocation(x);
    return x;
  }
  public  com.google.gwt.requestfactory.shared.InstanceRequest<com.puglieseweb.test.trms.client.managed.request.TaxiProxy, java.lang.Void> persist() {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<java.lang.Void> implements com.google.gwt.requestfactory.shared.InstanceRequest<com.puglieseweb.test.trms.client.managed.request.TaxiProxy, java.lang.Void> {
      public X() { super(TaxiRequestImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("com.puglieseweb.test.trms.client.managed.request.TaxiRequest::persist", new Object[] {null}, propertyRefs, java.lang.Void.class, null);
      }
    }
    X x = new X();
    return x;
  }
  public  com.google.gwt.requestfactory.shared.InstanceRequest<com.puglieseweb.test.trms.client.managed.request.TaxiProxy, java.lang.Void> remove() {
    class X extends com.google.gwt.requestfactory.shared.impl.AbstractRequest<java.lang.Void> implements com.google.gwt.requestfactory.shared.InstanceRequest<com.puglieseweb.test.trms.client.managed.request.TaxiProxy, java.lang.Void> {
      public X() { super(TaxiRequestImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.shared.impl.RequestData("com.puglieseweb.test.trms.client.managed.request.TaxiRequest::remove", new Object[] {null}, propertyRefs, java.lang.Void.class, null);
      }
    }
    X x = new X();
    return x;
  }
}
