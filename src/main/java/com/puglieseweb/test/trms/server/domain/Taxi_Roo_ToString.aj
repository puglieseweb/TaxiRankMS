// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.puglieseweb.test.trms.server.domain;

import java.lang.String;

privileged aspect Taxi_Roo_ToString {
    
    public String Taxi.toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Location: ").append(getLocation()).append(", ");
        sb.append("Status: ").append(getStatus()).append(", ");
        sb.append("AddOption: ").append(getAddOption());
        return sb.toString();
    }
    
}