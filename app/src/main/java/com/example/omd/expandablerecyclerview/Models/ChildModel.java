package com.example.omd.expandablerecyclerview.Models;

import java.io.Serializable;

/**
 * Created by Delta on 29/11/2017.
 */

public class ChildModel implements Serializable {

    private String stage_id_pk;
    private String stage_name;
    private String school_id_fk;
    private String stage_order;


    public String getStage_id_pk() {
        return stage_id_pk;
    }

    public ChildModel() {
    }

    public ChildModel(String stage_id_pk, String stage_name, String school_id_fk, String stage_order) {
        this.stage_id_pk = stage_id_pk;
        this.stage_name = stage_name;
        this.school_id_fk = school_id_fk;
        this.stage_order = stage_order;
    }

    public void setStage_id_pk(String stage_id_pk) {
        this.stage_id_pk = stage_id_pk;
    }

    public String getStage_name() {
        return stage_name;
    }

    public void setStage_name(String stage_name) {
        this.stage_name = stage_name;
    }

    public String getSchool_id_fk() {
        return school_id_fk;
    }

    public void setSchool_id_fk(String school_id_fk) {
        this.school_id_fk = school_id_fk;
    }

    public String getStage_order() {
        return stage_order;
    }

    public void setStage_order(String stage_order) {
        this.stage_order = stage_order;
    }


}
