package face;
/*写一个类表示海绵，海绵有一组吸水孔（用孔径表示），海绵有吸水和放水的功能。
pipes 表示吸水孔
current 表示现在的水量
absorb 表示吸水
drain 表示放水
total 吸收的水量
*/

public class Example40_Sponge {
    public double[] pipes;
    public double current;
    public boolean absorb(double water) {
        if (pipes == null) {
            return false;
        }
        double total = 0;
        for (int i = 0; i < pipes.length; i++) {
            total += pipes[i];
        }
        current += water;
        if (current > total) {
            current = total;
            return false;
        }
        return true;
    }

    public void drain() {
        current = 0;
    }
}
