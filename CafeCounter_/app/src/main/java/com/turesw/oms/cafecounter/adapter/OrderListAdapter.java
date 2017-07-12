package com.turesw.oms.cafecounter.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.turesw.oms.cafecounter.dto.OrderInfo;

import java.util.ArrayList;

/**
 * Created by OMS on 2015-10-13.
 */
public class OrderListAdapter extends ArrayAdapter<OrderInfo> {
    private ArrayList<OrderInfo> orderInfos = new ArrayList<>();
    public OrderListAdapter(Context context, int resource) {
        super(context, resource);
    }

    @Override
    public void add(OrderInfo object) {
        super.add(object);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return super.getView(position, convertView, parent);
    }
}
