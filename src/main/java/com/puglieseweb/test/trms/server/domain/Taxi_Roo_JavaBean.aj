// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.puglieseweb.test.trms.server.domain;

import com.puglieseweb.test.trms.shared.domain.TaxiOptions;
import com.puglieseweb.test.trms.shared.domain.TaxiRankLocations;
import com.puglieseweb.test.trms.shared.domain.TaxiStatus;

privileged aspect Taxi_Roo_JavaBean {
    
    public TaxiRankLocations Taxi.getLocation() {
        return this.Location;
    }
    
    public void Taxi.setLocation(TaxiRankLocations Location) {
        this.Location = Location;
    }
    
    public TaxiStatus Taxi.getStatus() {
        return this.status;
    }
    
    public void Taxi.setStatus(TaxiStatus status) {
        this.status = status;
    }
    
    public TaxiOptions Taxi.getAddOption() {
        return this.addOption;
    }
    
    public void Taxi.setAddOption(TaxiOptions addOption) {
        this.addOption = addOption;
    }
    
}
