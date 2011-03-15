package com.puglieseweb.test.trms.shared.gae;

import com.puglieseweb.test.trms.server.gae.UserServiceLocator;
import com.puglieseweb.test.trms.server.gae.UserServiceWrapper;
import com.google.gwt.requestfactory.shared.Request;
import com.google.gwt.requestfactory.shared.RequestContext;
import com.google.gwt.requestfactory.shared.Service;

/**
 * Makes requests of the Google AppEngine UserService.
 */
@Service(value = UserServiceWrapper.class, locator = UserServiceLocator.class)
public interface GaeUserServiceRequest extends RequestContext {
	public Request<String> createLoginURL(String destinationURL);

	public Request<String> createLogoutURL(String destinationURL);

	public Request<GaeUser> getCurrentUser();
}
