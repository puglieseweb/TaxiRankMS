package com.puglieseweb.test.trms.client.scaffold.ioc;

import com.puglieseweb.test.trms.client.scaffold.ScaffoldMobileApp;
import com.google.gwt.inject.client.GinModules;

@GinModules(value = {ScaffoldModule.class})
public interface MobileInjector extends ScaffoldInjector {

	ScaffoldMobileApp getScaffoldApp();
}
