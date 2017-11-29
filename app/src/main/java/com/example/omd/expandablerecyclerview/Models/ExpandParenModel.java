package com.example.omd.expandablerecyclerview.Models;

import android.annotation.SuppressLint;

import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

/**
 * Created by Delta on 29/11/2017.
 */
@SuppressLint("ParcelCreator")
public class ExpandParenModel extends ExpandableGroup<ClassModel> {
    public ExpandParenModel(String title, List<ClassModel> items) {
        super(title, items);
    }
}
