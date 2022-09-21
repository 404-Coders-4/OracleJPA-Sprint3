package com.example.demo_crud;

public class PIC {
    private int id;
    private String PIC_IMPRT_STAT_CD;
    private String CRT_USER_ID;
    private String CRT_TS;
    private String LASTMT_USER_ID;
    private String LASTMT_TS;
    private String PIC_IMPRT_STAT_NM;
    private String PIC_IMPRT_STAT_DS;

    protected PIC() {
    }

    protected PIC(String PIC_IMPRT_STAT_CD, String CRT_USER_ID, String CRT_TS, String LASTMT_USER_ID
                    , String LASTMT_TS, String PIC_IMPRT_STAT_NM, String PIC_IMPRT_STAT_DS) {
        this.PIC_IMPRT_STAT_CD = PIC_IMPRT_STAT_CD;
        this.CRT_USER_ID = CRT_USER_ID;
        this.CRT_TS = CRT_TS;
        this.LASTMT_USER_ID = LASTMT_USER_ID;
        this.LASTMT_TS = LASTMT_TS;
        this.PIC_IMPRT_STAT_NM = PIC_IMPRT_STAT_NM;
        this.PIC_IMPRT_STAT_DS = PIC_IMPRT_STAT_DS;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id= id;
    }

    public String getPIC_IMPRT_STAT_CD() {
        return PIC_IMPRT_STAT_CD;
    }

    public void setPIC_IMPRT_STAT_CD(String PIC_IMPRT_STAT_CD) {
        this.PIC_IMPRT_STAT_CD= PIC_IMPRT_STAT_CD;
    }

    public String getCRT_USER_ID() {
        return CRT_USER_ID;
    }

    public void setCRT_USER_ID(String CRT_USER_ID) {
        this.CRT_USER_ID= CRT_USER_ID;
    }

    public String getCRT_TS() {
        return CRT_TS;
    }

    public void setCRT_TS(String CRT_TS) {
        this.CRT_TS= CRT_TS;
    }

    public String getLASTMT_USER_ID() {
        return LASTMT_USER_ID;
    }

    public void setLASTMT_USER_ID(String LASTMT_USER_ID) {
        this.LASTMT_USER_ID= LASTMT_USER_ID;
    }

    public String getLASTMT_TS() {
        return LASTMT_TS;
    }

    public void setLASTMT_TS(String LASTMT_TS) {
        this.LASTMT_TS= LASTMT_TS;
    }

    public String getPIC_IMPRT_STAT_NM() {
        return PIC_IMPRT_STAT_NM;
    }

    public void setPIC_IMPRT_STAT_NM(String PIC_IMPRT_STAT_NM) {
        this.PIC_IMPRT_STAT_NM= PIC_IMPRT_STAT_NM;
    }

    public String getPIC_IMPRT_STAT_DS() {
        return PIC_IMPRT_STAT_DS;
    }

    public void setPIC_IMPRT_STAT_DS(String PIC_IMPRT_STAT_DS) {
        this.PIC_IMPRT_STAT_DS= PIC_IMPRT_STAT_DS;
    }

    @Override
    public String toString() {
        return "PIC_IMPRT_STAT_TYPE: {\n"+
                "\nLASTMT_TS: " + LASTMT_TS +
                "\nCRT_USER_TS: " + CRT_TS +
                "\nCRT_USER_ID: " + CRT_USER_ID +
                "\nLASTMT_USER_ID: " + LASTMT_USER_ID +
                "\nLASTMT_TS: " + LASTMT_TS +
                "\nPIC_IMPRT_STAT_NM: " + PIC_IMPRT_STAT_NM +
                "\nPIC_IMPRT_STAT_DS: " + PIC_IMPRT_STAT_DS +
                "\nPIC_IMPRT_STAT_CD: " + PIC_IMPRT_STAT_CD +
                "}";
    }
}