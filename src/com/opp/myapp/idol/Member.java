package com.opp.myapp.idol;

public class Member {

    private String name;
    private GirlGroup girlGroup;

    public Member(String name, GirlGroup girlGroup){

    }

    /* setter - getter */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GirlGroup getGirlGroup() {
        return girlGroup;
    }

    public void setGirlGroup(GirlGroup girlGroup) {
        this.girlGroup = girlGroup;
    }
}
