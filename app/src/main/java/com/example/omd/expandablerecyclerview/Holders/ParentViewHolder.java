package com.example.omd.expandablerecyclerview.Holders;

import android.view.View;
import android.widget.TextView;

import com.example.omd.expandablerecyclerview.R;
import com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder;

/**
 * Created by Delta on 29/11/2017.
 */

public class ParentViewHolder extends GroupViewHolder {
    private TextView ParentBtn;
    public ParentViewHolder(View itemView) {
        super(itemView);
        ParentBtn = (TextView) itemView.findViewById(R.id.parent_btn);
    }
    public void setParentBtn(String name)
    {
        ParentBtn.setText(name);
    }

    @Override
    public void expand() {
        super.expand();
        ParentBtn.setCompoundDrawablesRelativeWithIntrinsicBounds(0,0,R.drawable.coll_arrow,0);
    }

    @Override
    public void collapse() {
        super.collapse();
        ParentBtn.setCompoundDrawablesRelativeWithIntrinsicBounds(0,0,R.drawable.exp_arrow,0);

    }
}
