package com.puglieseweb.test.trms.client.managed.request;

public class ApplicationRequestFactoryImpl_FactoryImpl extends com.google.gwt.autobean.client.impl.AbstractAutoBeanFactory implements com.puglieseweb.test.trms.client.managed.request.ApplicationRequestFactoryImpl.Factory {
  {
    creators.put(com.puglieseweb.test.trms.shared.gae.GaeUser.class, new Creator() {
      public com.puglieseweb.test.trms.shared.gae.GaeUserAutoBean_com_google_gwt_requestfactory_shared_impl_EntityProxyCategory_com_google_gwt_requestfactory_shared_impl_ValueProxyCategory_com_google_gwt_requestfactory_shared_impl_BaseProxyCategory create() { return new com.puglieseweb.test.trms.shared.gae.GaeUserAutoBean_com_google_gwt_requestfactory_shared_impl_EntityProxyCategory_com_google_gwt_requestfactory_shared_impl_ValueProxyCategory_com_google_gwt_requestfactory_shared_impl_BaseProxyCategory(ApplicationRequestFactoryImpl_FactoryImpl.this); }
      public com.puglieseweb.test.trms.shared.gae.GaeUserAutoBean_com_google_gwt_requestfactory_shared_impl_EntityProxyCategory_com_google_gwt_requestfactory_shared_impl_ValueProxyCategory_com_google_gwt_requestfactory_shared_impl_BaseProxyCategory create(Object delegate) { return new com.puglieseweb.test.trms.shared.gae.GaeUserAutoBean_com_google_gwt_requestfactory_shared_impl_EntityProxyCategory_com_google_gwt_requestfactory_shared_impl_ValueProxyCategory_com_google_gwt_requestfactory_shared_impl_BaseProxyCategory(ApplicationRequestFactoryImpl_FactoryImpl.this, (com.puglieseweb.test.trms.shared.gae.GaeUser) delegate); }
    });
    creators.put(com.puglieseweb.test.trms.client.managed.request.TaxiProxy.class, new Creator() {
      public com.puglieseweb.test.trms.client.managed.request.TaxiProxyAutoBean_com_google_gwt_requestfactory_shared_impl_EntityProxyCategory_com_google_gwt_requestfactory_shared_impl_ValueProxyCategory_com_google_gwt_requestfactory_shared_impl_BaseProxyCategory create() { return new com.puglieseweb.test.trms.client.managed.request.TaxiProxyAutoBean_com_google_gwt_requestfactory_shared_impl_EntityProxyCategory_com_google_gwt_requestfactory_shared_impl_ValueProxyCategory_com_google_gwt_requestfactory_shared_impl_BaseProxyCategory(ApplicationRequestFactoryImpl_FactoryImpl.this); }
      public com.puglieseweb.test.trms.client.managed.request.TaxiProxyAutoBean_com_google_gwt_requestfactory_shared_impl_EntityProxyCategory_com_google_gwt_requestfactory_shared_impl_ValueProxyCategory_com_google_gwt_requestfactory_shared_impl_BaseProxyCategory create(Object delegate) { return new com.puglieseweb.test.trms.client.managed.request.TaxiProxyAutoBean_com_google_gwt_requestfactory_shared_impl_EntityProxyCategory_com_google_gwt_requestfactory_shared_impl_ValueProxyCategory_com_google_gwt_requestfactory_shared_impl_BaseProxyCategory(ApplicationRequestFactoryImpl_FactoryImpl.this, (com.puglieseweb.test.trms.client.managed.request.TaxiProxy) delegate); }
    });
  }
  @Override protected void initializeEnumMap() {
    enumToStringMap.put(com.puglieseweb.test.trms.shared.domain.TaxiOptions.EIGHT_SEATS, "EIGHT_SEATS");
    enumToStringMap.put(com.puglieseweb.test.trms.shared.domain.TaxiOptions.LARGE_BAGGAGE, "LARGE_BAGGAGE");
    enumToStringMap.put(com.puglieseweb.test.trms.shared.domain.TaxiOptions.ALLOW_PETS, "ALLOW_PETS");
    enumToStringMap.put(com.puglieseweb.test.trms.shared.domain.TaxiRankLocations.RANK1, "RANK1");
    enumToStringMap.put(com.puglieseweb.test.trms.shared.domain.TaxiRankLocations.RANK2, "RANK2");
    enumToStringMap.put(com.puglieseweb.test.trms.shared.domain.TaxiRankLocations.RANK3, "RANK3");
    enumToStringMap.put(com.puglieseweb.test.trms.shared.domain.TaxiStatus.FREE, "FREE");
    enumToStringMap.put(com.puglieseweb.test.trms.shared.domain.TaxiStatus.BUSY, "BUSY");
    enumToStringMap.put(com.puglieseweb.test.trms.shared.domain.TaxiStatus.CLOSED, "CLOSED");
    stringsToEnumsMap.put("RANK3", java.util.Collections.<java.lang.Enum<?>> singletonList(com.puglieseweb.test.trms.shared.domain.TaxiRankLocations.RANK3));
    stringsToEnumsMap.put("FREE", java.util.Collections.<java.lang.Enum<?>> singletonList(com.puglieseweb.test.trms.shared.domain.TaxiStatus.FREE));
    stringsToEnumsMap.put("RANK2", java.util.Collections.<java.lang.Enum<?>> singletonList(com.puglieseweb.test.trms.shared.domain.TaxiRankLocations.RANK2));
    stringsToEnumsMap.put("CLOSED", java.util.Collections.<java.lang.Enum<?>> singletonList(com.puglieseweb.test.trms.shared.domain.TaxiStatus.CLOSED));
    stringsToEnumsMap.put("RANK1", java.util.Collections.<java.lang.Enum<?>> singletonList(com.puglieseweb.test.trms.shared.domain.TaxiRankLocations.RANK1));
    stringsToEnumsMap.put("EIGHT_SEATS", java.util.Collections.<java.lang.Enum<?>> singletonList(com.puglieseweb.test.trms.shared.domain.TaxiOptions.EIGHT_SEATS));
    stringsToEnumsMap.put("BUSY", java.util.Collections.<java.lang.Enum<?>> singletonList(com.puglieseweb.test.trms.shared.domain.TaxiStatus.BUSY));
    stringsToEnumsMap.put("LARGE_BAGGAGE", java.util.Collections.<java.lang.Enum<?>> singletonList(com.puglieseweb.test.trms.shared.domain.TaxiOptions.LARGE_BAGGAGE));
    stringsToEnumsMap.put("ALLOW_PETS", java.util.Collections.<java.lang.Enum<?>> singletonList(com.puglieseweb.test.trms.shared.domain.TaxiOptions.ALLOW_PETS));
  }
  public com.google.gwt.autobean.shared.AutoBean com_puglieseweb_test_trms_client_managed_request_TaxiProxy() {
    return new com.puglieseweb.test.trms.client.managed.request.TaxiProxyAutoBean_com_google_gwt_requestfactory_shared_impl_EntityProxyCategory_com_google_gwt_requestfactory_shared_impl_ValueProxyCategory_com_google_gwt_requestfactory_shared_impl_BaseProxyCategory(ApplicationRequestFactoryImpl_FactoryImpl.this);
  }
  public com.google.gwt.autobean.shared.AutoBean com_puglieseweb_test_trms_shared_gae_GaeUser() {
    return new com.puglieseweb.test.trms.shared.gae.GaeUserAutoBean_com_google_gwt_requestfactory_shared_impl_EntityProxyCategory_com_google_gwt_requestfactory_shared_impl_ValueProxyCategory_com_google_gwt_requestfactory_shared_impl_BaseProxyCategory(ApplicationRequestFactoryImpl_FactoryImpl.this);
  }
}
