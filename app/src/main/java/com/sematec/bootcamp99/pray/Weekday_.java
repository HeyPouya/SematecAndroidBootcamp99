
package com.sematec.bootcamp99.pray;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Weekday_ {

    @SerializedName("en")
    @Expose
    private String en;

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

}
