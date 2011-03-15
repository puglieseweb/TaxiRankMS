package com.puglieseweb.test.trms.client.scaffold;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.DataResource;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.resources.client.ImageResource.ImageOptions;
import com.google.gwt.resources.client.CssResource.Import;

public interface ScaffoldMobileShell_BinderImpl_GenBundle extends ClientBundle {
  @Source("uibinder:com.puglieseweb.test.trms.client.scaffold.ScaffoldMobileShell_BinderImpl_GenCss_style.css")
  ScaffoldMobileShell_BinderImpl_GenCss_style style();

  @Source("../style/images/titleGradient.png")
  @ImageOptions(repeatStyle=ImageResource.RepeatStyle.Horizontal)
  ImageResource titleGradient();
  @Source("../style/images/backButton.png")
  ImageResource backButtonImage();
}
