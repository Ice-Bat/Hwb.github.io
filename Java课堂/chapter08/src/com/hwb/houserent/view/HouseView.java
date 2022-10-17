package com.hwb.houserent.view;

import com.hwb.houserent.domain.House;
import com.hwb.houserent.service.HouseService;
import com.hwb.houserent.utils.Utility;

public class HouseView {
    private boolean loop = true;
    private char key;
    private HouseService houseService = new HouseService(10);

    public void mainMenu() {
        do {
            System.out.println("---------------房屋出租菜单--------------");
            System.out.println("\t\t\t1 新增房源");
            System.out.println("\t\t\t2 查找房源");
            System.out.println("\t\t\t3 删除房源");
            System.out.println("\t\t\t4 修改房屋信息");
            System.out.println("\t\t\t5 房屋列表");
            System.out.println("\t\t\t6 退       出");
            System.out.println("请选择需要的服务(1-6):");
            key = Utility.readChar();
            switch (key) {
                case '1':
                    addHouse();
                    break;
                case '2':
                    findHouse();
                    break;
                case '3':
                    delHouse();
                    break;
                case '4':
                    System.out.println("修改");
                    break;
                case '5':
                    listHouse();
                    break;
                case '6':
                    exit();
                    break;
            }
        } while (loop);
    }

    //房屋列表
    public void listHouse() {
        System.out.println("---------------房屋列表--------------");

        System.out.println("房号\t\t姓名\t\t电话\t\t地址\t\t租金\t\t状态");
        House[] houses = houseService.list();
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] != null) {
                System.out.println(houses[i]);
            } else {
                break;
            }

        }
        System.out.println("--------------房屋列表显示完毕-------------");
    }

    //添加房屋
    public void addHouse() {
        System.out.println("--------------添加房屋-------------");
        System.out.print("姓名：");
        String name = Utility.readString(6);
        System.out.print("电话：");
        String phone = Utility.readString(11);
        System.out.print("地址：");
        String address = Utility.readString(8);
        System.out.print("租金：");
        int rent = Utility.readInt();
        System.out.print("状态：");
        String state = Utility.readString(3);
        House newhouse = new House(0, name, phone, address, rent, state);
        if (houseService.add(newhouse)) {
            System.out.println("--------------添加房屋成功-------------");
        } else {
            System.out.println("--------------添加房屋失败-------------");
        }
    }

    //删除房屋
    public void delHouse() {
        System.out.println("--------------删除房屋-------------");
        System.out.println("请选择待删除房屋编号(-1退出):");
        int delId = Utility.readInt();
        if (delId == -1) {
            System.out.println("----------放弃删除信息----------");
            return;
        }
        System.out.println("确认是否删除(Y/N) 请小心选择：");
        char choice = Utility.readConfirmSelection();
        if (choice == 'N') {
            System.out.println("----------放弃删除信息----------");
            return;
        } else {
            if (houseService.del(delId)) {
                System.out.println("--------------删除成功-------------");
            } else {
                System.out.println("--------------房屋编号不存在-------------");
            }
        }
    }

    //查找
    public void findHouse() {
        System.out.println("--------------查找房屋-------------");
        System.out.println("请选择需要查找房间的id号:");
        int findId = Utility.readInt();
        House house = houseService.find(findId);
        if (house != null) {
            System.out.println(house);
        } else {
            System.out.println("未找到房屋信息");
        }
    }

    //修改
    public void update() {
        System.out.println("--------------修改房屋信息-------------");
        System.out.println("请选择待删除房屋编号(-1退出):");
        int updateId = Utility.readInt();
        if (updateId == -1) {
            System.out.println("----------放弃删除信息----------");
            return;
        }
        House house = houseService.find(updateId);
        if (house == null) {
            System.out.println("房屋信息不存在");
            return;
        }
        System.out.print("姓名：" + house.getName());
        String name = Utility.readString(8, "");
        if (!"".equals(name)) {
            house.setName(name);
        }
        System.out.print("电话：" + house.getPhone());
        String phone = Utility.readString(12,"")
        if (!"".equals(phone)) {
            house.setName(phone);
        }
        String phone = Utility.readString(11);
        System.out.print("地址：");
        String address = Utility.readString(8);
        System.out.print("租金：");
        int rent = Utility.readInt();
        System.out.print("状态：");
        String state = Utility.readString(3);
    }


    //退出
    public void exit() {
        System.out.println("是否确认退出");
        char c = Utility.readConfirmSelection();
        if (c == 'Y') {
            loop = false;
        }
    }

}