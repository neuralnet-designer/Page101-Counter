package com.turesw.oms.cafecounter.dto;

import java.util.ArrayList;

public class OrderInfo {

    int tableNum;
    ArrayList<MenuInfo> OrderList;
    int wholeMenuCount;

    public OrderInfo() {

    }

    public OrderInfo(int _tableNum, MenuInfo _OrderList[], int _wholeMenuCount)
    {
        this.tableNum = _tableNum;
        for(int i = 0; i < _OrderList.length; i++){
            this.OrderList.add(_OrderList[i]);
        }
        this.wholeMenuCount = _wholeMenuCount;
    }

    public void put(String key, String object) {
        if (key.equals("tableNum"))
            this.tableNum = Integer.parseInt(object);
//		else if (key.equals("name"))
//			this.name = object;
        else if (key.equals("wholeMenuCount"))
            this.wholeMenuCount = Integer.parseInt(object);
    }

//	public void putMenuInfo(String key, ArrayList<String> object) {
//		if (key.equals("tableNum"))
//			this.tableNum = Integer.parseInt(object);
////		else if (key.equals("name"))
////			this.name = object;
//		else if (key.equals("wholeMenuCount"))
//			this.wholeMenuCount = Integer.parseInt(object);
//	}

    public int get_tableNum() {
        return tableNum;
    }

//	public ArrayList<MenuInfo> get_name() {
//		return name;
//
//	}

    public int get_wholeMenuCount() {
        return wholeMenuCount;
    }
}
