package com.example.oopcw;

public class ClubCreation {
    int clubId;
    String clubName;
    int members;
    int advisorId;
    String clubDescription;

    public int getClubId() {
        return clubId;
    }

    public void setClubId(int clubId) {
        this.clubId = clubId;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public int getMembers() {
        return members;
    }

    public void setMembers(int members) {
        this.members = members;
    }

    public int getAdvisorId() {
        return advisorId;
    }

    public void setAdvisorId(int advisorId) {
        this.advisorId = advisorId;
    }

    public String getClubDescription() {
        return clubDescription;
    }

    public void setClubDescription(String clubDescription) {
        this.clubDescription = clubDescription;
    }

    public ClubCreation(int clubId,String clubName,int members,int advisorId,String clubDescription){
        this.clubId = clubId;
        this.clubName = clubName;
        this.advisorId = advisorId;
        this.members = members;
        this.clubDescription = clubDescription;
    }


}
