package com.example.oopcw;

public class AcademicClub extends  Club{
    private String academicType;

    public AcademicClub(String clubId,String clubName,String members,String advisorId,String clubDescription,String academicType){
        super(clubId,clubName,members,advisorId,clubDescription);
        this.academicType = academicType;
    }

    public String getAcademicType(){
        return academicType;
    }

    public void setAcademicType(String academicType) {
        this.academicType = academicType;
    }
}
