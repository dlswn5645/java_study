package com.opp.myapp.company;

import com.opp.myapp.idol.GirlGroup;

public class Manager {

    private GirlGroup[] idol;
    private int number;//관리하고 있는 걸그룹 수

    public Manager() {

    }

    //관리 걸그룹 추가기능
    public void addGroup(GirlGroup idol){

    }

    //관리 그룹명 전체 출력기능
    public void showAllGroupName() {

    }

    /* setter - getter */
    public GirlGroup[] getIdol() {
        return idol;
    }

    public void setIdol(GirlGroup[] idol) {
        this.idol = idol;
    }

    public int getNumber() {
        return number;
    }

    //매니저가 관리하는 인원수가 0명이상 10명 이하가 되도록 setter에 제한조건 걸기
    // 제한 조건에 벗어날 경우 0으로 설정
    public void setNumber(int number) {
        if(number >= 0 && 10 >= number){
           this.number = number;
           return;
        }
        this.number = 0;
    }
}
