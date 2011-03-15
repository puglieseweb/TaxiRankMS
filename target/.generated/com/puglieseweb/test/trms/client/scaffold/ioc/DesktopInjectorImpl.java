package com.puglieseweb.test.trms.client.scaffold.ioc;

import com.google.gwt.core.client.GWT;

public class DesktopInjectorImpl implements com.puglieseweb.test.trms.client.scaffold.ioc.DesktopInjector {
  public com.puglieseweb.test.trms.client.scaffold.ScaffoldDesktopApp getScaffoldApp() {
    return get_Key$type$com$puglieseweb$test$trms$client$scaffold$ScaffoldDesktopApp$_annotation$$none$$();
  }
  
  
  /**
   * Binding for com.puglieseweb.test.trms.client.scaffold.ioc.ScaffoldModule$RequestFactoryProvider declared at:
   *   Implicit binding for Key[type=com.puglieseweb.test.trms.client.scaffold.ioc.ScaffoldModule$RequestFactoryProvider, annotation=[none]]
   */
  private void memberInject_Key$type$com$puglieseweb$test$trms$client$scaffold$ioc$ScaffoldModule$RequestFactoryProvider$_annotation$$none$$(com.puglieseweb.test.trms.client.scaffold.ioc.ScaffoldModule.RequestFactoryProvider injectee) {
    
  }
  
  private native com.puglieseweb.test.trms.client.scaffold.ioc.ScaffoldModule.RequestFactoryProvider com$puglieseweb$test$trms$client$scaffold$ioc$ScaffoldModule$RequestFactoryProvider_RequestFactoryProvider_methodInjection(com.google.gwt.event.shared.EventBus _0) /*-{
    return @com.puglieseweb.test.trms.client.scaffold.ioc.ScaffoldModule.RequestFactoryProvider::new(Lcom/google/gwt/event/shared/EventBus;)(_0);
  }-*/;
  
  private com.puglieseweb.test.trms.client.scaffold.ioc.ScaffoldModule.RequestFactoryProvider create_Key$type$com$puglieseweb$test$trms$client$scaffold$ioc$ScaffoldModule$RequestFactoryProvider$_annotation$$none$$() {
    com.puglieseweb.test.trms.client.scaffold.ioc.ScaffoldModule.RequestFactoryProvider result = com$puglieseweb$test$trms$client$scaffold$ioc$ScaffoldModule$RequestFactoryProvider_RequestFactoryProvider_methodInjection(get_Key$type$com$google$gwt$event$shared$EventBus$_annotation$$none$$());
    memberInject_Key$type$com$puglieseweb$test$trms$client$scaffold$ioc$ScaffoldModule$RequestFactoryProvider$_annotation$$none$$(result);
    return result;
  }
  
  
  /**
   * Binding for com.puglieseweb.test.trms.client.scaffold.ioc.ScaffoldModule$RequestFactoryProvider declared at:
   *   Implicit binding for Key[type=com.puglieseweb.test.trms.client.scaffold.ioc.ScaffoldModule$RequestFactoryProvider, annotation=[none]]
   */
  private com.puglieseweb.test.trms.client.scaffold.ioc.ScaffoldModule.RequestFactoryProvider get_Key$type$com$puglieseweb$test$trms$client$scaffold$ioc$ScaffoldModule$RequestFactoryProvider$_annotation$$none$$() {
    return create_Key$type$com$puglieseweb$test$trms$client$scaffold$ioc$ScaffoldModule$RequestFactoryProvider$_annotation$$none$$();
  }
  
  
  
  /**
   * Binding for com.puglieseweb.test.trms.client.managed.activity.ApplicationDetailsActivities declared at:
   *   Implicit binding for Key[type=com.puglieseweb.test.trms.client.managed.activity.ApplicationDetailsActivities, annotation=[none]]
   */
  private void memberInject_Key$type$com$puglieseweb$test$trms$client$managed$activity$ApplicationDetailsActivities$_annotation$$none$$(com.puglieseweb.test.trms.client.managed.activity.ApplicationDetailsActivities injectee) {
    
  }
  
  private com.puglieseweb.test.trms.client.managed.activity.ApplicationDetailsActivities com$puglieseweb$test$trms$client$managed$activity$ApplicationDetailsActivities_ApplicationDetailsActivities_methodInjection(com.puglieseweb.test.trms.client.managed.request.ApplicationRequestFactory _0, com.google.gwt.place.shared.PlaceController _1) {
    return new com.puglieseweb.test.trms.client.managed.activity.ApplicationDetailsActivities(_0, _1);
  }
  
  private com.puglieseweb.test.trms.client.managed.activity.ApplicationDetailsActivities create_Key$type$com$puglieseweb$test$trms$client$managed$activity$ApplicationDetailsActivities$_annotation$$none$$() {
    com.puglieseweb.test.trms.client.managed.activity.ApplicationDetailsActivities result = com$puglieseweb$test$trms$client$managed$activity$ApplicationDetailsActivities_ApplicationDetailsActivities_methodInjection(get_Key$type$com$puglieseweb$test$trms$client$managed$request$ApplicationRequestFactory$_annotation$$none$$(), get_Key$type$com$google$gwt$place$shared$PlaceController$_annotation$$none$$());
    memberInject_Key$type$com$puglieseweb$test$trms$client$managed$activity$ApplicationDetailsActivities$_annotation$$none$$(result);
    return result;
  }
  
  
  /**
   * Binding for com.puglieseweb.test.trms.client.managed.activity.ApplicationDetailsActivities declared at:
   *   Implicit binding for Key[type=com.puglieseweb.test.trms.client.managed.activity.ApplicationDetailsActivities, annotation=[none]]
   */
  private com.puglieseweb.test.trms.client.managed.activity.ApplicationDetailsActivities get_Key$type$com$puglieseweb$test$trms$client$managed$activity$ApplicationDetailsActivities$_annotation$$none$$() {
    return create_Key$type$com$puglieseweb$test$trms$client$managed$activity$ApplicationDetailsActivities$_annotation$$none$$();
  }
  
  
  
  /**
   * Binding for com.google.gwt.event.shared.SimpleEventBus declared at:
   *   Implicit binding for Key[type=com.google.gwt.event.shared.SimpleEventBus, annotation=[none]]
   */
  private void memberInject_Key$type$com$google$gwt$event$shared$SimpleEventBus$_annotation$$none$$(com.google.gwt.event.shared.SimpleEventBus injectee) {
    
  }
  
  private com.google.gwt.event.shared.SimpleEventBus create_Key$type$com$google$gwt$event$shared$SimpleEventBus$_annotation$$none$$() {
    Object created = GWT.create(com.google.gwt.event.shared.SimpleEventBus.class);
    assert created instanceof com.google.gwt.event.shared.SimpleEventBus;
    com.google.gwt.event.shared.SimpleEventBus result = (com.google.gwt.event.shared.SimpleEventBus) created;
    
    memberInject_Key$type$com$google$gwt$event$shared$SimpleEventBus$_annotation$$none$$(result);
    return result;
  }
  
  
  /**
   * Binding for com.google.gwt.event.shared.SimpleEventBus declared at:
   *   Implicit binding for Key[type=com.google.gwt.event.shared.SimpleEventBus, annotation=[none]]
   */
  private com.google.gwt.event.shared.SimpleEventBus get_Key$type$com$google$gwt$event$shared$SimpleEventBus$_annotation$$none$$() {
    return create_Key$type$com$google$gwt$event$shared$SimpleEventBus$_annotation$$none$$();
  }
  
  
  
  /**
   * Binding for com.google.gwt.place.shared.PlaceController declared at:
   *   com.puglieseweb.test.trms.client.scaffold.ioc.ScaffoldModule.configure(ScaffoldModule.java:23)
   */
  private com.google.gwt.place.shared.PlaceController create_Key$type$com$google$gwt$place$shared$PlaceController$_annotation$$none$$() {
    return get_Key$type$com$puglieseweb$test$trms$client$scaffold$ioc$ScaffoldModule$PlaceControllerProvider$_annotation$$none$$().get();
  }
  
  private com.google.gwt.place.shared.PlaceController singleton_Key$type$com$google$gwt$place$shared$PlaceController$_annotation$$none$$ = null;
  
  
  /**
   * Singleton bound at:
   *   com.puglieseweb.test.trms.client.scaffold.ioc.ScaffoldModule.configure(ScaffoldModule.java:23)
   */
  private com.google.gwt.place.shared.PlaceController get_Key$type$com$google$gwt$place$shared$PlaceController$_annotation$$none$$() {
    if (singleton_Key$type$com$google$gwt$place$shared$PlaceController$_annotation$$none$$ == null) {
      singleton_Key$type$com$google$gwt$place$shared$PlaceController$_annotation$$none$$ = create_Key$type$com$google$gwt$place$shared$PlaceController$_annotation$$none$$();
    }
    return singleton_Key$type$com$google$gwt$place$shared$PlaceController$_annotation$$none$$;
  }
  
  
  /**
   * Binding for com.puglieseweb.test.trms.client.managed.activity.ApplicationMasterActivities declared at:
   *   Implicit binding for Key[type=com.puglieseweb.test.trms.client.managed.activity.ApplicationMasterActivities, annotation=[none]]
   */
  private void memberInject_Key$type$com$puglieseweb$test$trms$client$managed$activity$ApplicationMasterActivities$_annotation$$none$$(com.puglieseweb.test.trms.client.managed.activity.ApplicationMasterActivities injectee) {
    
  }
  
  private com.puglieseweb.test.trms.client.managed.activity.ApplicationMasterActivities com$puglieseweb$test$trms$client$managed$activity$ApplicationMasterActivities_ApplicationMasterActivities_methodInjection(com.puglieseweb.test.trms.client.managed.request.ApplicationRequestFactory _0, com.google.gwt.place.shared.PlaceController _1) {
    return new com.puglieseweb.test.trms.client.managed.activity.ApplicationMasterActivities(_0, _1);
  }
  
  private com.puglieseweb.test.trms.client.managed.activity.ApplicationMasterActivities create_Key$type$com$puglieseweb$test$trms$client$managed$activity$ApplicationMasterActivities$_annotation$$none$$() {
    com.puglieseweb.test.trms.client.managed.activity.ApplicationMasterActivities result = com$puglieseweb$test$trms$client$managed$activity$ApplicationMasterActivities_ApplicationMasterActivities_methodInjection(get_Key$type$com$puglieseweb$test$trms$client$managed$request$ApplicationRequestFactory$_annotation$$none$$(), get_Key$type$com$google$gwt$place$shared$PlaceController$_annotation$$none$$());
    memberInject_Key$type$com$puglieseweb$test$trms$client$managed$activity$ApplicationMasterActivities$_annotation$$none$$(result);
    return result;
  }
  
  
  /**
   * Binding for com.puglieseweb.test.trms.client.managed.activity.ApplicationMasterActivities declared at:
   *   Implicit binding for Key[type=com.puglieseweb.test.trms.client.managed.activity.ApplicationMasterActivities, annotation=[none]]
   */
  private com.puglieseweb.test.trms.client.managed.activity.ApplicationMasterActivities get_Key$type$com$puglieseweb$test$trms$client$managed$activity$ApplicationMasterActivities$_annotation$$none$$() {
    return create_Key$type$com$puglieseweb$test$trms$client$managed$activity$ApplicationMasterActivities$_annotation$$none$$();
  }
  
  
  
  /**
   * Binding for com.puglieseweb.test.trms.client.scaffold.ioc.ScaffoldModule$PlaceControllerProvider declared at:
   *   Implicit binding for Key[type=com.puglieseweb.test.trms.client.scaffold.ioc.ScaffoldModule$PlaceControllerProvider, annotation=[none]]
   */
  private void memberInject_Key$type$com$puglieseweb$test$trms$client$scaffold$ioc$ScaffoldModule$PlaceControllerProvider$_annotation$$none$$(com.puglieseweb.test.trms.client.scaffold.ioc.ScaffoldModule.PlaceControllerProvider injectee) {
    
  }
  
  private native com.puglieseweb.test.trms.client.scaffold.ioc.ScaffoldModule.PlaceControllerProvider com$puglieseweb$test$trms$client$scaffold$ioc$ScaffoldModule$PlaceControllerProvider_PlaceControllerProvider_methodInjection(com.google.gwt.event.shared.EventBus _0) /*-{
    return @com.puglieseweb.test.trms.client.scaffold.ioc.ScaffoldModule.PlaceControllerProvider::new(Lcom/google/gwt/event/shared/EventBus;)(_0);
  }-*/;
  
  private com.puglieseweb.test.trms.client.scaffold.ioc.ScaffoldModule.PlaceControllerProvider create_Key$type$com$puglieseweb$test$trms$client$scaffold$ioc$ScaffoldModule$PlaceControllerProvider$_annotation$$none$$() {
    com.puglieseweb.test.trms.client.scaffold.ioc.ScaffoldModule.PlaceControllerProvider result = com$puglieseweb$test$trms$client$scaffold$ioc$ScaffoldModule$PlaceControllerProvider_PlaceControllerProvider_methodInjection(get_Key$type$com$google$gwt$event$shared$EventBus$_annotation$$none$$());
    memberInject_Key$type$com$puglieseweb$test$trms$client$scaffold$ioc$ScaffoldModule$PlaceControllerProvider$_annotation$$none$$(result);
    return result;
  }
  
  
  /**
   * Binding for com.puglieseweb.test.trms.client.scaffold.ioc.ScaffoldModule$PlaceControllerProvider declared at:
   *   Implicit binding for Key[type=com.puglieseweb.test.trms.client.scaffold.ioc.ScaffoldModule$PlaceControllerProvider, annotation=[none]]
   */
  private com.puglieseweb.test.trms.client.scaffold.ioc.ScaffoldModule.PlaceControllerProvider get_Key$type$com$puglieseweb$test$trms$client$scaffold$ioc$ScaffoldModule$PlaceControllerProvider$_annotation$$none$$() {
    return create_Key$type$com$puglieseweb$test$trms$client$scaffold$ioc$ScaffoldModule$PlaceControllerProvider$_annotation$$none$$();
  }
  
  
  
  /**
   * Binding for com.puglieseweb.test.trms.client.scaffold.place.PlaceHistoryFactory declared at:
   *   Implicit binding for Key[type=com.puglieseweb.test.trms.client.scaffold.place.PlaceHistoryFactory, annotation=[none]]
   */
  private void memberInject_Key$type$com$puglieseweb$test$trms$client$scaffold$place$PlaceHistoryFactory$_annotation$$none$$(com.puglieseweb.test.trms.client.scaffold.place.PlaceHistoryFactory injectee) {
    
  }
  
  private com.puglieseweb.test.trms.client.scaffold.place.PlaceHistoryFactory com$puglieseweb$test$trms$client$scaffold$place$PlaceHistoryFactory_PlaceHistoryFactory_methodInjection(com.puglieseweb.test.trms.client.managed.request.ApplicationRequestFactory _0) {
    return new com.puglieseweb.test.trms.client.scaffold.place.PlaceHistoryFactory(_0);
  }
  
  private com.puglieseweb.test.trms.client.scaffold.place.PlaceHistoryFactory create_Key$type$com$puglieseweb$test$trms$client$scaffold$place$PlaceHistoryFactory$_annotation$$none$$() {
    com.puglieseweb.test.trms.client.scaffold.place.PlaceHistoryFactory result = com$puglieseweb$test$trms$client$scaffold$place$PlaceHistoryFactory_PlaceHistoryFactory_methodInjection(get_Key$type$com$puglieseweb$test$trms$client$managed$request$ApplicationRequestFactory$_annotation$$none$$());
    memberInject_Key$type$com$puglieseweb$test$trms$client$scaffold$place$PlaceHistoryFactory$_annotation$$none$$(result);
    return result;
  }
  
  
  /**
   * Binding for com.puglieseweb.test.trms.client.scaffold.place.PlaceHistoryFactory declared at:
   *   Implicit binding for Key[type=com.puglieseweb.test.trms.client.scaffold.place.PlaceHistoryFactory, annotation=[none]]
   */
  private com.puglieseweb.test.trms.client.scaffold.place.PlaceHistoryFactory get_Key$type$com$puglieseweb$test$trms$client$scaffold$place$PlaceHistoryFactory$_annotation$$none$$() {
    return create_Key$type$com$puglieseweb$test$trms$client$scaffold$place$PlaceHistoryFactory$_annotation$$none$$();
  }
  
  
  
  /**
   * Binding for com.puglieseweb.test.trms.client.managed.request.ApplicationRequestFactory declared at:
   *   com.puglieseweb.test.trms.client.scaffold.ioc.ScaffoldModule.configure(ScaffoldModule.java:22)
   */
  private com.puglieseweb.test.trms.client.managed.request.ApplicationRequestFactory create_Key$type$com$puglieseweb$test$trms$client$managed$request$ApplicationRequestFactory$_annotation$$none$$() {
    return get_Key$type$com$puglieseweb$test$trms$client$scaffold$ioc$ScaffoldModule$RequestFactoryProvider$_annotation$$none$$().get();
  }
  
  private com.puglieseweb.test.trms.client.managed.request.ApplicationRequestFactory singleton_Key$type$com$puglieseweb$test$trms$client$managed$request$ApplicationRequestFactory$_annotation$$none$$ = null;
  
  
  /**
   * Singleton bound at:
   *   com.puglieseweb.test.trms.client.scaffold.ioc.ScaffoldModule.configure(ScaffoldModule.java:22)
   */
  private com.puglieseweb.test.trms.client.managed.request.ApplicationRequestFactory get_Key$type$com$puglieseweb$test$trms$client$managed$request$ApplicationRequestFactory$_annotation$$none$$() {
    if (singleton_Key$type$com$puglieseweb$test$trms$client$managed$request$ApplicationRequestFactory$_annotation$$none$$ == null) {
      singleton_Key$type$com$puglieseweb$test$trms$client$managed$request$ApplicationRequestFactory$_annotation$$none$$ = create_Key$type$com$puglieseweb$test$trms$client$managed$request$ApplicationRequestFactory$_annotation$$none$$();
    }
    return singleton_Key$type$com$puglieseweb$test$trms$client$managed$request$ApplicationRequestFactory$_annotation$$none$$;
  }
  
  
  /**
   * Binding for com.google.gwt.event.shared.EventBus declared at:
   *   com.puglieseweb.test.trms.client.scaffold.ioc.ScaffoldModule.configure(ScaffoldModule.java:21)
   */
  private com.google.gwt.event.shared.EventBus create_Key$type$com$google$gwt$event$shared$EventBus$_annotation$$none$$() {
    return get_Key$type$com$google$gwt$event$shared$SimpleEventBus$_annotation$$none$$();
  }
  
  private com.google.gwt.event.shared.EventBus singleton_Key$type$com$google$gwt$event$shared$EventBus$_annotation$$none$$ = null;
  
  
  /**
   * Singleton bound at:
   *   com.puglieseweb.test.trms.client.scaffold.ioc.ScaffoldModule.configure(ScaffoldModule.java:21)
   */
  private com.google.gwt.event.shared.EventBus get_Key$type$com$google$gwt$event$shared$EventBus$_annotation$$none$$() {
    if (singleton_Key$type$com$google$gwt$event$shared$EventBus$_annotation$$none$$ == null) {
      singleton_Key$type$com$google$gwt$event$shared$EventBus$_annotation$$none$$ = create_Key$type$com$google$gwt$event$shared$EventBus$_annotation$$none$$();
    }
    return singleton_Key$type$com$google$gwt$event$shared$EventBus$_annotation$$none$$;
  }
  
  
  /**
   * Binding for com.puglieseweb.test.trms.client.scaffold.ScaffoldDesktopShell declared at:
   *   Implicit binding for Key[type=com.puglieseweb.test.trms.client.scaffold.ScaffoldDesktopShell, annotation=[none]]
   */
  private void memberInject_Key$type$com$puglieseweb$test$trms$client$scaffold$ScaffoldDesktopShell$_annotation$$none$$(com.puglieseweb.test.trms.client.scaffold.ScaffoldDesktopShell injectee) {
    
  }
  
  private com.puglieseweb.test.trms.client.scaffold.ScaffoldDesktopShell create_Key$type$com$puglieseweb$test$trms$client$scaffold$ScaffoldDesktopShell$_annotation$$none$$() {
    Object created = GWT.create(com.puglieseweb.test.trms.client.scaffold.ScaffoldDesktopShell.class);
    assert created instanceof com.puglieseweb.test.trms.client.scaffold.ScaffoldDesktopShell;
    com.puglieseweb.test.trms.client.scaffold.ScaffoldDesktopShell result = (com.puglieseweb.test.trms.client.scaffold.ScaffoldDesktopShell) created;
    
    memberInject_Key$type$com$puglieseweb$test$trms$client$scaffold$ScaffoldDesktopShell$_annotation$$none$$(result);
    return result;
  }
  
  
  /**
   * Binding for com.puglieseweb.test.trms.client.scaffold.ScaffoldDesktopShell declared at:
   *   Implicit binding for Key[type=com.puglieseweb.test.trms.client.scaffold.ScaffoldDesktopShell, annotation=[none]]
   */
  private com.puglieseweb.test.trms.client.scaffold.ScaffoldDesktopShell get_Key$type$com$puglieseweb$test$trms$client$scaffold$ScaffoldDesktopShell$_annotation$$none$$() {
    return create_Key$type$com$puglieseweb$test$trms$client$scaffold$ScaffoldDesktopShell$_annotation$$none$$();
  }
  
  
  
  /**
   * Binding for com.puglieseweb.test.trms.client.scaffold.ScaffoldDesktopApp declared at:
   *   Implicit binding for Key[type=com.puglieseweb.test.trms.client.scaffold.ScaffoldDesktopApp, annotation=[none]]
   */
  private void memberInject_Key$type$com$puglieseweb$test$trms$client$scaffold$ScaffoldDesktopApp$_annotation$$none$$(com.puglieseweb.test.trms.client.scaffold.ScaffoldDesktopApp injectee) {
    
  }
  
  private com.puglieseweb.test.trms.client.scaffold.ScaffoldDesktopApp com$puglieseweb$test$trms$client$scaffold$ScaffoldDesktopApp_ScaffoldDesktopApp_methodInjection(com.puglieseweb.test.trms.client.scaffold.ScaffoldDesktopShell _0, com.puglieseweb.test.trms.client.managed.request.ApplicationRequestFactory _1, com.google.gwt.event.shared.EventBus _2, com.google.gwt.place.shared.PlaceController _3, com.puglieseweb.test.trms.client.scaffold.place.PlaceHistoryFactory _4, com.puglieseweb.test.trms.client.managed.activity.ApplicationMasterActivities _5, com.puglieseweb.test.trms.client.managed.activity.ApplicationDetailsActivities _6) {
    return new com.puglieseweb.test.trms.client.scaffold.ScaffoldDesktopApp(_0, _1, _2, _3, _4, _5, _6);
  }
  
  private com.puglieseweb.test.trms.client.scaffold.ScaffoldDesktopApp create_Key$type$com$puglieseweb$test$trms$client$scaffold$ScaffoldDesktopApp$_annotation$$none$$() {
    com.puglieseweb.test.trms.client.scaffold.ScaffoldDesktopApp result = com$puglieseweb$test$trms$client$scaffold$ScaffoldDesktopApp_ScaffoldDesktopApp_methodInjection(get_Key$type$com$puglieseweb$test$trms$client$scaffold$ScaffoldDesktopShell$_annotation$$none$$(), get_Key$type$com$puglieseweb$test$trms$client$managed$request$ApplicationRequestFactory$_annotation$$none$$(), get_Key$type$com$google$gwt$event$shared$EventBus$_annotation$$none$$(), get_Key$type$com$google$gwt$place$shared$PlaceController$_annotation$$none$$(), get_Key$type$com$puglieseweb$test$trms$client$scaffold$place$PlaceHistoryFactory$_annotation$$none$$(), get_Key$type$com$puglieseweb$test$trms$client$managed$activity$ApplicationMasterActivities$_annotation$$none$$(), get_Key$type$com$puglieseweb$test$trms$client$managed$activity$ApplicationDetailsActivities$_annotation$$none$$());
    memberInject_Key$type$com$puglieseweb$test$trms$client$scaffold$ScaffoldDesktopApp$_annotation$$none$$(result);
    return result;
  }
  
  
  /**
   * Binding for com.puglieseweb.test.trms.client.scaffold.ScaffoldDesktopApp declared at:
   *   Implicit binding for Key[type=com.puglieseweb.test.trms.client.scaffold.ScaffoldDesktopApp, annotation=[none]]
   */
  private com.puglieseweb.test.trms.client.scaffold.ScaffoldDesktopApp get_Key$type$com$puglieseweb$test$trms$client$scaffold$ScaffoldDesktopApp$_annotation$$none$$() {
    return create_Key$type$com$puglieseweb$test$trms$client$scaffold$ScaffoldDesktopApp$_annotation$$none$$();
  }
  
  
  public DesktopInjectorImpl() {
    
  }
  
}
