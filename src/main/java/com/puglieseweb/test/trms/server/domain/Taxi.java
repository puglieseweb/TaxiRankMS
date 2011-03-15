package com.puglieseweb.test.trms.server.domain;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;

import com.puglieseweb.test.trms.shared.domain.TaxiRankLocations;
import com.puglieseweb.test.trms.shared.domain.TaxiStatus;
import javax.validation.constraints.NotNull;
import javax.persistence.Enumerated;
import com.puglieseweb.test.trms.shared.domain.TaxiOptions;

@RooJavaBean
@RooToString
@RooEntity
public class Taxi {
    
	@NotNull
    @Enumerated
    private TaxiRankLocations Location;
	
    @NotNull
    @Enumerated
    private TaxiStatus status;

    @NotNull
    @Enumerated
    private TaxiOptions addOption;
}
