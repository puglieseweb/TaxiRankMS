package com.puglieseweb.test.trms.client.managed.request;

public class ApplicationRequestFactoryImpl extends com.google.gwt.requestfactory.client.impl.AbstractClientRequestFactory implements com.puglieseweb.test.trms.client.managed.request.ApplicationRequestFactory {
  @com.google.gwt.autobean.shared.AutoBeanFactory.Category({com.google.gwt.requestfactory.shared.impl.EntityProxyCategory.class, com.google.gwt.requestfactory.shared.impl.ValueProxyCategory.class, com.google.gwt.requestfactory.shared.impl.BaseProxyCategory.class})
  @com.google.gwt.autobean.shared.AutoBeanFactory.NoWrap(com.google.gwt.requestfactory.shared.EntityProxyId.class)
  interface Factory extends com.google.gwt.autobean.shared.AutoBeanFactory {
    com.google.gwt.autobean.shared.AutoBean<com.puglieseweb.test.trms.client.managed.request.TaxiProxy> com_puglieseweb_test_trms_client_managed_request_TaxiProxy();
    com.google.gwt.autobean.shared.AutoBean<com.puglieseweb.test.trms.shared.gae.GaeUser> com_puglieseweb_test_trms_shared_gae_GaeUser();
  }
  public static final Factory FACTORY=com.google.gwt.core.client.GWT.create(Factory.class);
  @Override public Factory getAutoBeanFactory() { return FACTORY; }
  public com.google.gwt.requestfactory.shared.LoggingRequestImpl loggingRequest() {
    return new com.google.gwt.requestfactory.shared.LoggingRequestImpl(this);
  }
  public com.puglieseweb.test.trms.client.managed.request.TaxiRequestImpl taxiRequest() {
    return new com.puglieseweb.test.trms.client.managed.request.TaxiRequestImpl(this);
  }
  public com.puglieseweb.test.trms.shared.gae.GaeUserServiceRequestImpl userServiceRequest() {
    return new com.puglieseweb.test.trms.shared.gae.GaeUserServiceRequestImpl(this);
  }
  private static final java.util.HashMap<String, Class<?>> tokensToTypes = new java.util.HashMap<String, Class<?>>();
  private static final java.util.HashMap<Class<?>, String> typesToTokens = new java.util.HashMap<Class<?>, String>();
  private static final java.util.HashSet<Class<?>> entityProxyTypes = new java.util.HashSet<Class<?>>();
  private static final java.util.HashSet<Class<?>> valueProxyTypes = new java.util.HashSet<Class<?>>();
  static {
    tokensToTypes.put("com.puglieseweb.test.trms.client.managed.request.TaxiProxy", com.puglieseweb.test.trms.client.managed.request.TaxiProxy.class);
    typesToTokens.put(com.puglieseweb.test.trms.client.managed.request.TaxiProxy.class, "com.puglieseweb.test.trms.client.managed.request.TaxiProxy");
    entityProxyTypes.add(com.puglieseweb.test.trms.client.managed.request.TaxiProxy.class);
    tokensToTypes.put("com.puglieseweb.test.trms.shared.gae.GaeUser", com.puglieseweb.test.trms.shared.gae.GaeUser.class);
    typesToTokens.put(com.puglieseweb.test.trms.shared.gae.GaeUser.class, "com.puglieseweb.test.trms.shared.gae.GaeUser");
    valueProxyTypes.add(com.puglieseweb.test.trms.shared.gae.GaeUser.class);
  }
  @Override protected Class getTypeFromToken(String typeToken) {
    return tokensToTypes.get(typeToken);
  }
  @Override protected String getTypeToken(Class type) {
    return typesToTokens.get(type);
  }
  @Override public boolean isEntityType(Class<?> type) {
    return entityProxyTypes.contains(type);
  }
  @Override public boolean isValueType(Class<?> type) {
    return valueProxyTypes.contains(type);
  }
}
