package com.example.omd.expandablerecyclerview.Models;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

/**
 * Created by Delta on 29/11/2017.
 */

public class ClassModel implements Parcelable {
    private String class_id_pk;
    private String school_id_fk;
    private String stage_id_fk;

    protected ClassModel(Parcel in) {
        class_id_pk = in.readString();
        school_id_fk = in.readString();
        stage_id_fk = in.readString();
        class_title = in.readString();
    }

    public static final Creator<ClassModel> CREATOR = new Creator<ClassModel>() {
        @Override
        public ClassModel createFromParcel(Parcel in) {
            return new ClassModel(in);
        }

        @Override
        public ClassModel[] newArray(int size) {
            return new ClassModel[size];
        }
    };

    public String getClass_id_pk() {
        return class_id_pk;
    }

    public void setClass_id_pk(String class_id_pk) {
        this.class_id_pk = class_id_pk;
    }

    public String getSchool_id_fk() {
        return school_id_fk;
    }

    public void setSchool_id_fk(String school_id_fk) {
        this.school_id_fk = school_id_fk;
    }

    public String getStage_id_fk() {
        return stage_id_fk;
    }

    public void setStage_id_fk(String stage_id_fk) {
        this.stage_id_fk = stage_id_fk;
    }

    public String getClass_title() {
        return class_title;
    }

    public void setClass_title(String class_title) {
        this.class_title = class_title;
    }

    public ClassModel(String class_id_pk, String school_id_fk, String stage_id_fk, String class_title) {

        this.class_id_pk = class_id_pk;
        this.school_id_fk = school_id_fk;
        this.stage_id_fk = stage_id_fk;
        this.class_title = class_title;
    }

    private String class_title;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(class_id_pk);
        parcel.writeString(school_id_fk);
        parcel.writeString(stage_id_fk);
        parcel.writeString(class_title);
    }
}
