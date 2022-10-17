package com.hwb.houserent.service;

import com.hwb.houserent.domain.House;

public class HouseService {
    private House house[];
    private int houseNums = 1;//记录房屋个数
    private int idCounter = 1;//记录id自增长

    //构造器
    public HouseService(int size) {
        house = new House[size];
        house[0] = new House(1, "jack", "110", "派出所", 1000, "未出租");
    }

    //返回数组
    public House[] list() {
        return house;
    }

    //房屋添加
    public boolean add(House newHouse) {
        if (houseNums == house.length) {
            System.out.println("数组已满");
            return false;
        } else {
            house[houseNums++] = newHouse;
            newHouse.setId(++idCounter);
            return true;
        }
    }

    //房屋删除
    public boolean del(int delId) {
        int index = -1;
        for (int i = 0; i < houseNums; i++) {
            if (delId == house[i].getId()) {
                index = i;
            }
        }
        if (index == -1) {
            return false;
        }
        for (int j = index; j < houseNums - 1; j++) {
            house[index] = house[index + 1];
            house[index].setId(--idCounter);
        }
        house[--houseNums] = null;
        return true;
    }

    //查找
    public House find(int findId) {
        for (int i = 0; i < houseNums; i++) {
            if (findId == house[i].getId()) {
                return house[i];
            }
        }
        return null;
    }

}

