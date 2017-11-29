package com.example.omd.expandablerecyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.example.omd.expandablerecyclerview.Adapters.ExpandableRecyclerAdapter;
import com.example.omd.expandablerecyclerview.Controler.Controller;
import com.example.omd.expandablerecyclerview.Models.ChildModel;
import com.example.omd.expandablerecyclerview.Models.ClassModel;
import com.example.omd.expandablerecyclerview.Models.ExpandParenModel;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager manager;
    final static String api = "http://anwaralfyaha.com/api/stages";
    final static String capi = "http://anwaralfyaha.com/api/classes";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.mRecView);
        manager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(manager);

        RequestQueue queue = Controller.getInstance().getRequestQueue();

        JsonArrayRequest request1 = new JsonArrayRequest(api, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                if (response.length()>0)
                {
                    List<ChildModel> childModelList = new ArrayList<>();

                    for (int index=0;index<response.length();index++)
                    {
                        try {
                            ChildModel childModel = new ChildModel();
                            childModel.setStage_id_pk(response.getJSONObject(index).getString("stage_id_pk"));
                            childModel.setStage_name(response.getJSONObject(index).getString("stage_name"));
                            childModel.setSchool_id_fk(response.getJSONObject(index).getString("school_id_fk"));
                            childModel.setStage_order(response.getJSONObject(index).getString("stage_order"));

                            childModelList.add(childModel);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                    getFeeds(childModelList);
                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        queue.add(request1);

    }

    private void getFeeds(final List<ChildModel> childModelList) {
        RequestQueue queue2 = Controller.getInstance().getRequestQueue();
         JsonArrayRequest request2 = new JsonArrayRequest(capi, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                if (response.length()>0)
                {
                    final Map<String,List<ClassModel>> listMap = new HashMap<>();
                    final List<ClassModel> list_1 = new ArrayList<>();
                    final List<ClassModel> list_2 = new ArrayList<>();
                    final List<ClassModel> list_3= new ArrayList<>();
                    final List<ClassModel> list_4= new ArrayList<>();
                    final List<ClassModel> list_5= new ArrayList<>();
                    final List<ClassModel> list_6= new ArrayList<>();

                    JSONObject object=null;
                    for (int index=0;index<response.length();index++)
                    {
                        try {
                            object = response.getJSONObject(index);
                            for (int x=0;x<childModelList.size();x++)
                            {


                                if (childModelList.get(x).getStage_name().equals("أول"))
                                {
                                    if (object.get("class_title").toString().startsWith("1"))
                                    {
                                        ClassModel classModel = new ClassModel(object.getString("class_id_pk"),object.getString("school_id_fk"),object.getString("stage_id_fk"),object.getString("class_title"));
                                        list_1.add(classModel);
                                        listMap.put(childModelList.get(x).getStage_name(),list_1);
                                    }

                                }
                                else if (childModelList.get(x).getStage_name().equals("ثاني "))
                                {
                                    if (object.get("class_title").toString().startsWith("2"))
                                    {
                                        ClassModel classModel = new ClassModel(object.getString("class_id_pk"),object.getString("school_id_fk"),object.getString("stage_id_fk"),object.getString("class_title"));
                                        list_2.add(classModel);
                                        listMap.put(childModelList.get(x).getStage_name(),list_2);
                                    }
                                }
                                else if (childModelList.get(x).getStage_name().equals("ثالث "))
                                {
                                    if (object.get("class_title").toString().startsWith("3"))
                                    {
                                        ClassModel classModel = new ClassModel(object.getString("class_id_pk"),object.getString("school_id_fk"),object.getString("stage_id_fk"),object.getString("class_title"));
                                        list_3.add(classModel);
                                        listMap.put(childModelList.get(x).getStage_name(),list_3);
                                    }
                                }
                                else if (childModelList.get(x).getStage_name().equals("رابع"))
                                {
                                    if (object.get("class_title").toString().startsWith("4"))
                                    {
                                        ClassModel classModel = new ClassModel(object.getString("class_id_pk"),object.getString("school_id_fk"),object.getString("stage_id_fk"),object.getString("class_title"));
                                        list_4.add(classModel);
                                        listMap.put(childModelList.get(x).getStage_name(),list_4);
                                    }
                                }
                                else if (childModelList.get(x).getStage_name().equals("خامس "))
                                {
                                    if (object.get("class_title").toString().startsWith("5"))
                                    {
                                        ClassModel classModel = new ClassModel(object.getString("class_id_pk"),object.getString("school_id_fk"),object.getString("stage_id_fk"),object.getString("class_title"));
                                        list_5.add(classModel);
                                        listMap.put(childModelList.get(x).getStage_name(),list_5);
                                    }
                                }
                                else if (childModelList.get(x).getStage_name().equals("سادس "))
                                {
                                    if (object.get("class_title").toString().startsWith("6"))
                                    {
                                        ClassModel classModel = new ClassModel(object.getString("class_id_pk"),object.getString("school_id_fk"),object.getString("stage_id_fk"),object.getString("class_title"));
                                        list_6.add(classModel);
                                        listMap.put(childModelList.get(x).getStage_name(),list_6);
                                    }
                                }

                            }


                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                    List<ExpandParenModel> expandParenModels = new ArrayList<>();
                    for (String key:listMap.keySet())
                    {
                        expandParenModels.add(new ExpandParenModel(key,listMap.get(key)));
                    }
                    if (expandParenModels.size()>0)
                    {
                        ExpandableRecyclerAdapter adapter = new ExpandableRecyclerAdapter(expandParenModels,MainActivity.this);
                        mRecyclerView.setAdapter(adapter);
                        adapter.notifyDataSetChanged();
                        ////////////////////////////
                    }


                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        queue2.add(request2);
    }
}
