// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.puglieseweb.test.trms.server.domain;

import com.puglieseweb.test.trms.shared.domain.Shift;
import java.lang.Integer;
import java.lang.String;
import java.util.Set;

privileged aspect TaxiRank_Roo_JavaBean {
    
    public Shift TaxiRank.getShift() {
        return this.shift;
    }
    
    public void TaxiRank.setShift(Shift shift) {
        this.shift = shift;
    }
    
    public boolean TaxiRank.isPeakTimes() {
        return this.peakTimes;
    }
    
    public void TaxiRank.setPeakTimes(boolean peakTimes) {
        this.peakTimes = peakTimes;
    }
    
    public Integer TaxiRank.getParkingSpace() {
        return this.parkingSpace;
    }
    
    public void TaxiRank.setParkingSpace(Integer parkingSpace) {
        this.parkingSpace = parkingSpace;
    }
    
    public Set<String> TaxiRank.getRankLocation() {
        return this.rankLocation;
    }
    
    public void TaxiRank.setRankLocation(Set<String> rankLocation) {
        this.rankLocation = rankLocation;
    }
    
}
