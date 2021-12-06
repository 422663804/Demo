package demo01.p0421;

public class Example01 {
    public static void main(String[] args) {
        int[] array = {1,3,6,7,2,5,9,0};
        int max = array[0];
        int min = array[0];
        for (int i = 0;i<array.length;i++){
            if (array[i]>max){
                max=array[i];
            }
            if (array[i]<min){
                min=array[i];
            }
        }
        System.out.println("max="+max+"\tmin="+min);
    }
}
//1.已知数组{1，3，6，7，2，5，9，0}，输出数组的最大数字和最小数字