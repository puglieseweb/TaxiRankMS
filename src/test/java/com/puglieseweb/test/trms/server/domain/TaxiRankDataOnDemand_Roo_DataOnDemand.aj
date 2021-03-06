// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.puglieseweb.test.trms.server.domain;

import com.puglieseweb.test.trms.server.domain.TaxiRank;
import java.util.List;
import java.util.Random;
import org.springframework.stereotype.Component;

privileged aspect TaxiRankDataOnDemand_Roo_DataOnDemand {
    
    declare @type: TaxiRankDataOnDemand: @Component;
    
    private Random TaxiRankDataOnDemand.rnd = new java.security.SecureRandom();
    
    private List<TaxiRank> TaxiRankDataOnDemand.data;
    
    public TaxiRank TaxiRankDataOnDemand.getNewTransientTaxiRank(int index) {
        com.puglieseweb.test.trms.server.domain.TaxiRank obj = new com.puglieseweb.test.trms.server.domain.TaxiRank();
        obj.setShift(com.puglieseweb.test.trms.shared.domain.Shift.class.getEnumConstants()[0]);
        obj.setPeakTimes(true);
        obj.setParkingSpace(new Integer(index));
        return obj;
    }
    
    public TaxiRank TaxiRankDataOnDemand.getSpecificTaxiRank(int index) {
        init();
        if (index < 0) index = 0;
        if (index > (data.size() - 1)) index = data.size() - 1;
        TaxiRank obj = data.get(index);
        return TaxiRank.findTaxiRank(obj.getId());
    }
    
    public TaxiRank TaxiRankDataOnDemand.getRandomTaxiRank() {
        init();
        TaxiRank obj = data.get(rnd.nextInt(data.size()));
        return TaxiRank.findTaxiRank(obj.getId());
    }
    
    public boolean TaxiRankDataOnDemand.modifyTaxiRank(TaxiRank obj) {
        return false;
    }
    
    public void TaxiRankDataOnDemand.init() {
        data = com.puglieseweb.test.trms.server.domain.TaxiRank.findTaxiRankEntries(0, 10);
        if (data == null) throw new IllegalStateException("Find entries implementation for 'TaxiRank' illegally returned null");
        if (!data.isEmpty()) {
            return;
        }
        
        data = new java.util.ArrayList<com.puglieseweb.test.trms.server.domain.TaxiRank>();
        for (int i = 0; i < 10; i++) {
            com.puglieseweb.test.trms.server.domain.TaxiRank obj = getNewTransientTaxiRank(i);
            obj.persist();
            obj.flush();
            data.add(obj);
        }
    }
    
}
