package com.turesw.oms.cafecounter.adapter;

import android.content.Context;
import android.widget.ArrayAdapter;

import com.turesw.oms.cafecounter.dto.QnAInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by OMS on 2015-10-13.
 */
public class QnAListAdapter extends ArrayAdapter<QnAInfo> {
    public QnAListAdapter(Context context, int resource, int textViewResourceId, List<QnAInfo> objects) {
        super(context, resource, textViewResourceId, objects);
    }
}
