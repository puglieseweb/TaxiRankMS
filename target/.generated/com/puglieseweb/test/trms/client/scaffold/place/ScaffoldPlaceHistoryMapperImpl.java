package com.puglieseweb.test.trms.client.scaffold.place;

import com.google.gwt.place.impl.AbstractPlaceHistoryMapper;
import com.puglieseweb.test.trms.client.scaffold.place.ScaffoldPlaceHistoryMapper;
import com.puglieseweb.test.trms.client.scaffold.place.PlaceHistoryFactory;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.place.impl.AbstractPlaceHistoryMapper.PrefixAndToken;
import com.google.gwt.core.client.GWT;

public class ScaffoldPlaceHistoryMapperImpl extends AbstractPlaceHistoryMapper<PlaceHistoryFactory> implements ScaffoldPlaceHistoryMapper {
  
  protected PrefixAndToken getPrefixAndToken(Place newPlace) {
    if (newPlace instanceof com.puglieseweb.test.trms.client.scaffold.place.ProxyListPlace) {
      com.puglieseweb.test.trms.client.scaffold.place.ProxyListPlace place = (com.puglieseweb.test.trms.client.scaffold.place.ProxyListPlace) newPlace;
      return new PrefixAndToken("ProxyListPlace", factory.getProxyListPlaceTokenizer().getToken(place));
    }
    if (newPlace instanceof com.puglieseweb.test.trms.client.scaffold.place.ProxyPlace) {
      com.puglieseweb.test.trms.client.scaffold.place.ProxyPlace place = (com.puglieseweb.test.trms.client.scaffold.place.ProxyPlace) newPlace;
      return new PrefixAndToken("ProxyPlace", factory.getProxyPlaceTokenizer().getToken(place));
    }
    return null;
  }
  
  protected PlaceTokenizer<?> getTokenizer(String prefix) {
    if ("ProxyListPlace".equals(prefix)) {
      return factory.getProxyListPlaceTokenizer();
    }
    if ("ProxyPlace".equals(prefix)) {
      return factory.getProxyPlaceTokenizer();
    }
    return null;
  }

}
