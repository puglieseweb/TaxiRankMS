package com.puglieseweb.test.trms.server.domain;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;
import com.puglieseweb.test.trms.shared.domain.Shift;
import javax.validation.constraints.NotNull;
import javax.persistence.Enumerated;
import java.util.Set;
import java.util.HashSet;
import javax.persistence.ManyToMany;
import javax.persistence.CascadeType;

@RooJavaBean
@RooToString
@RooEntity
public class TaxiRank {

    @NotNull
    @Enumerated
    private Shift shift;

    @NotNull
    private boolean peakTimes;

    private Integer parkingSpace;

    private Set<String> rankLocation = new HashSet<String>();
}
