// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.puglieseweb.test.trms.server.domain;

import java.lang.String;

privileged aspect TaxiRank_Roo_ToString {
    
    public String TaxiRank.toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Shift: ").append(getShift()).append(", ");
        sb.append("PeakTimes: ").append(isPeakTimes()).append(", ");
        sb.append("ParkingSpace: ").append(getParkingSpace()).append(", ");
        sb.append("RankLocation: ").append(getRankLocation() == null ? "null" : getRankLocation().size());
        return sb.toString();
    }
    
}
