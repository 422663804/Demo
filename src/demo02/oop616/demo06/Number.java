package demo02.oop616.demo06;

import java.util.ArrayList;
import java.util.Scanner;

public class Number {
    private ArrayList arrayList = new ArrayList();

    public Number() {
    }

    public Number(ArrayList arrayList) {
        this.arrayList = arrayList;
    }

    public ArrayList getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList arrayList) {
        this.arrayList = arrayList;
    }

    //数组添加元素
    public void addNum(int i) {
        boolean result = true; //判断传入的值是否相同
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(99);
        arrayList.add(9);
        for (int j = 0; j < arrayList.size(); j++) {
            if (arrayList.get(j).equals(i)) {
                result = false;
                break;
            }
        }
        if (result) {
            arrayList.add(arrayList.size(), i);
            System.out.println("成功添加数据");
        }
        System.out.println("添加数据后的数组为" + arrayList);
    }

    //    删除元素
    public boolean remove() {
        boolean result = true; //判断是否有要删除的数据 默认是没有
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入你要删除的数据:");
        int num = scanner.nextInt();
        for (int j = 0; j < arrayList.size(); j++) {
            if (arrayList.get(j).equals(num)) {
                arrayList.remove(j);
                System.out.println("成功删除,删除后的数组为:" + arrayList);
                result = false;
            }
        }
        if (result) {
            System.out.println("数组中没有该数据,删除失败");
        }
        return result;
    }

    //    查找数组下标
    public int find(int i) {
        int index = 0;
        boolean isFind = true;
        for (int j = 0; j < arrayList.size(); j++) {
            if (arrayList.get(j).equals(i)) {
                index = j;
                isFind = false;
            }
        }
        if (isFind) {
            System.out.println("没有该数字");
        }
        return index;
    }

    //查找最大值
    public int max() {
        int max = (int) arrayList.get(0);
        for (int j = 0; j < arrayList.size(); j++) {
            if (max < (int) arrayList.get(j)) {
                max = (int) arrayList.get(j);
            }
        }
        System.out.println(arrayList);
        return max;
    }

    public static void main(String[] args) {
        Number number = new Number();
        number.addNum(6);
        System.out.println(number.remove());
        System.out.println("下标index=" + number.find(6));
        System.out.println("max=" + number.max());
        System.out.println("数组数据个数为:" + number.arrayList.size());
    }
}
// 思考题：使用面向对象封装的思想实现对 整数数据 的操作类，要求具有以下方法：
//        1. 构造函数(int)，传递一个整数作为初始数据的容量大小
//        2. add(int)添加一个新的数据，不添加重复的数字
//        3. remove(int):boolean删除一个数据，返回是否删除成功
//        4. find(int):int查找一个数字，返回下标，没有该数字则返回-1
//        5. max():int返回当前最大数字
//        6. size():int返回数据个数
//        提示：使用数组进行封装，数组长度可以超过当前数据个数，增加删除数字需要考虑是否进行扩容、缩小，即数组的长度会发生动态变化。

