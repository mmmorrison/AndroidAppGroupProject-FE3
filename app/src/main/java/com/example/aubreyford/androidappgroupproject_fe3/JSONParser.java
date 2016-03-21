package com.example.aubreyford.androidappgroupproject_fe3;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by aubreyford on 3/20/16.
 */
public class JSONParser {


    public List<HashMap<String, Object>> parse(JSONArray jDecisions) {

        int decisionCount = jDecisions.length();

        List<HashMap<String, Object>> decisionList = new ArrayList<HashMap<String, Object>>();
        HashMap<String, Object> decision = null;

        for (int i = 0; i < decisionCount; i++) {
            try {
                decision = getDecision((JSONObject) jDecisions.get(i));
                decisionList.add(decision);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return decisionList;
    }

    private HashMap<String, Object> getDecision(JSONObject decisionObject) {
        HashMap<String, Object> mDecision = new HashMap<String, Object>();



        int id;
        int user_id;
        String title;
        String category;
        String picA_Url;
        String picB_Url;

        try {

        id =  decisionObject.getInt("id");
        user_id = decisionObject.getInt("user_id");
        title = decisionObject.getString("title");
        category = decisionObject.getString("category");
        picA_Url= decisionObject.getString("picA");
        picB_Url= decisionObject.getString("picB");

            Log.i("****Should be title", title);

        mDecision.put("id", id);
        mDecision.put("user_id", user_id);
        mDecision.put("title", title);
        mDecision.put("category", category);
        mDecision.put("picA_Url", picA_Url);
        mDecision.put("picB_Url", picB_Url);
            mDecision.put("picA", R.mipmap.ic_launcher);  //making a spot for actual img files
            mDecision.put("picB", R.mipmap.ic_launcher);  //making a spot for actual img files

        }catch(JSONException e){
            e.printStackTrace();
        }

        return mDecision;
    }
}
