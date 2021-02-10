package day09.players;

import day09.player.Player;

public class Players {

    Player[] party;
    int participation;//현재 들어온 파티원의 수

    public Players(int partyNum){
        this.party = new Player[partyNum];
        System.out.println(partyNum + "인 파티가 생성되었습니다.");
    }

    //파티원 추가 기능
    void addPlayer(Player player){

        if(participation >= party.length){
            System.out.printf("%s야 풀파야~!\n",player.name);
            return;
        }
        party[participation] = player;
        participation++;
        System.out.println(player.name + "님 파티 참여 완료");
    }

    //파티원 상세 정보 보기
    void showPartyInfo(){
        for(int i = 0; i < participation; i++){
            party[i].info();
        }
    }
}
