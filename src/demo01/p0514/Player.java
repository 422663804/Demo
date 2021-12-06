package demo01.p0514;

import java.util.Arrays;

public class Player {
    // 名字属性
    public String name;
    // 装备属性
    public String[] equipments = new String[5];

    // 请完成showInfo方法：显示玩家信息
    public void showInfo() {
        // 1). 显示玩家信息
        System.out.println("江湖人称:" + name + "所带装备:" + Arrays.toString(equipments));
    }

    // 请完成addEquip方法 ：添加一件装备
    public void addEquip(String equipment) {
        // 2).添加一件装备
        if (equipment.equals("方天画戟")) {
            System.out.println("添加装备失败:" + equipment + "未添加");
        } else {
            equipments[0] = "青釭剑";
            equipments[1] = "青龙偃月刀";
            equipments[2] = "倚天剑";
            equipments[3] = "屠龙刀";
            equipments[4] = "丈八长矛";
            System.out.println("成功添加装备:" + equipment);
        }
    }

    // 请完成removeEquip方法：移除一件装备
    public void removeEquip(String equipment) {
        // 3).移除一件装备
        int index = 0;
        boolean result = true;
        for (int i = 0; i < equipments.length; i++) {
            if (equipment.equals("丈八长矛")) {
                index = i;
            }
            result = equipment.equals("AK47");
        }
        if (result) {
            System.out.println("移除装备失败！无此装备：" + equipment);
        } else {
            equipments[index] = null;
            System.out.println("成功移除装备:" + equipment);
        }
    }

    // 【选做题，不计分】：请完成addEquips方法：一次性添加多个装备
    public void addEquips(String[] equipments) {
        // 4).一次性添加多个装备
    }

    // 测试入口
    public static void main(String[] args) {
        // 创建一个玩家，名字为 一刀999
        Player player = new Player();
        player.name = "一刀999";

        // 输出：玩家【一刀999】的装备：
        player.addEquip("青釭剑"); // 调用方法输出：成功添加装备：青釭剑
        player.addEquip("青龙偃月刀");
        player.addEquip("倚天剑");
        player.addEquip("屠龙刀");
        player.addEquip("丈八长矛");
        player.addEquip("方天画戟"); // 调用方法输出：添加装备失败：方天画戟未添加
        player.showInfo(); // 调用方法输出：江湖人称：一刀999；所带兵器：青釭剑、青龙偃月刀、倚天剑、屠龙刀、丈八长矛、
        player.removeEquip("丈八长矛"); // 调用方法输出：成功移除装备：丈八长矛
        player.removeEquip("AK47"); // 调用方法输出：移除装备失败！无此装备：AK47
        player.showInfo(); // 调用方法输出：江湖人称：一刀999；所带兵器：青釭剑、青龙偃月刀、倚天剑、屠龙刀、
    }
}
