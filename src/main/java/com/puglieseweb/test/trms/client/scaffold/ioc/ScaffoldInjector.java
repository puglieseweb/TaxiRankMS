package com.puglieseweb.test.trms.client.scaffold.ioc;

import com.puglieseweb.test.trms.client.scaffold.ScaffoldApp;
import com.google.gwt.inject.client.Ginjector;

public interface ScaffoldInjector extends Ginjector {

	ScaffoldApp getScaffoldApp();
}
