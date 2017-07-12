package com.turesw.oms.cafecounter.dto;

public class MenuInfo {
    int tableNum;
    int orderNum;
    int menuCount;
    String menuName;
    int price;

    public MenuInfo() {

    }

    public MenuInfo(int _tableNum, int _orderNum, int _menuCount, String _menuName, int _price)

    {
        this.tableNum = _tableNum;
        this.orderNum = _orderNum;
        this.menuCount = _menuCount;
        this.menuName = _menuName;
        this.price = _price;
    }

    public void put(String key, String object) {
        if (key.equals("menuCount"))
            this.menuCount = Integer.parseInt(object);
        else if (key.equals("menuName"))
            this.menuName = object;
        else if (key.equals("type"))
            this.price = Integer.parseInt(object);
    }

    public int get_menuCount() {
        return menuCount;
    }

    public String get_menuName() {
        return menuName;

    }

    public int get_price() {
        return price;
    }
}
