package com.example.omd.expandablerecyclerview.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.omd.expandablerecyclerview.Holders.ChildViewholder;
import com.example.omd.expandablerecyclerview.Holders.ParentViewHolder;
import com.example.omd.expandablerecyclerview.Models.ClassModel;
import com.example.omd.expandablerecyclerview.Models.ExpandParenModel;
import com.example.omd.expandablerecyclerview.R;
import com.thoughtbot.expandablerecyclerview.ExpandableRecyclerViewAdapter;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

/**
 * Created by Delta on 29/11/2017.
 */

public class ExpandableRecyclerAdapter extends ExpandableRecyclerViewAdapter<ParentViewHolder,ChildViewholder> {
    Context mContext;
    public ExpandableRecyclerAdapter(List<? extends ExpandableGroup> groups,Context mContext) {
        super(groups);
        this.mContext = mContext;
    }

    @Override
    public ParentViewHolder onCreateGroupViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.parent_layout,parent,false);
        return new ParentViewHolder(view);
    }

    @Override
    public ChildViewholder onCreateChildViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.child_layout,parent,false);
        return new ChildViewholder(view);
    }

    @Override
    public void onBindChildViewHolder(ChildViewholder holder, int flatPosition, ExpandableGroup group, int childIndex) {
        ClassModel classModel =  ((ExpandParenModel)group).getItems().get(childIndex);
        holder.setChildName(classModel.getClass_title());

    }

    @Override
    public void onBindGroupViewHolder(ParentViewHolder holder, int flatPosition, ExpandableGroup group) {
        holder.setParentBtn(group.getTitle());

    }


}
