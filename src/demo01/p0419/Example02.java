package demo01.p0419;

public class Example02 {
    public static void main(String[] args) {
        String[] array = {"休息", "攻击", "跳跃", "死亡",};
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print("\t" + array[i]);
        }
    }
}
//2. 创建一个字符串数组，值为：休息、攻击、跳跃、死亡，请在控制台输出每一个元素，要求反向输出（即逆序输出到控制台）