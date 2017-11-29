package com.example.omd.expandablerecyclerview.Holders;

import android.view.View;
import android.widget.TextView;

import com.example.omd.expandablerecyclerview.R;
import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;

/**
 * Created by Delta on 29/11/2017.
 */

public class ChildViewholder extends ChildViewHolder{
    private TextView Childname;
    public ChildViewholder(View itemView) {
        super(itemView);
        Childname= (TextView) itemView.findViewById(R.id.child_name);
    }
    public void setChildName(String name)
    {
        Childname.setText(name);
    }
}
