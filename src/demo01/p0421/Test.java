package demo01.p0421;

public class Test {
    public static void main(String[] args) {
        /*int[] array = new int[]{1,2,3};
        int[] array2 = new int[]{4,5};
        int[] array3 = new int[array.length+ array2.length];
        for (int i = 0;i< array.length;i++){
            array3[i] =array[i];
        }
        for (int i = 0;i< array2.length;i++){
            array3[i+ array.length]=array2[i]; //i+array.length 从该数组的最后一个位置开始拼接
        }
        System.out.println(Arrays.toString(array3));*/
        //最值
        int[] array = new int[]{4,4,3,5556,75,4};
        int max=array[0];
        int min =array[0];
        for (int i = 0;i< array.length;i++){
            if (array[i]>max){
                max=array[i];
            }
            if (array[i]<min){
                min=array[i];
            }
        }
        System.out.println("max="+max+"min="+min);
    }
}
//数组拼接
//最值
//冒泡排序