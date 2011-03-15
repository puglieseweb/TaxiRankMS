package com.puglieseweb.test.trms.client.scaffold;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.DataResource;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.resources.client.ImageResource.ImageOptions;
import com.google.gwt.resources.client.CssResource.Import;

public interface ScaffoldDesktopShell_BinderImpl_GenBundle extends ClientBundle {
  @Source("uibinder:com.puglieseweb.test.trms.client.scaffold.ScaffoldDesktopShell_BinderImpl_GenCss_style.css")
  ScaffoldDesktopShell_BinderImpl_GenCss_style style();

  @Source("../style/images/gwtLogo.png")
  ImageResource gwtLogo();
  @Source("../style/images/rooLogo.png")
  ImageResource rooLogo();
  @Source("../style/images/background.jpeg")
  ImageResource background();
}
