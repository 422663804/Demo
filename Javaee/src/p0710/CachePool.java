package p0710;

public class CachePool<T> {
    T temp;

    public void save(T temp) {
        this.temp = temp;
    }

    public T getTemp() {
        return temp;
    }

    public static void main(String[] args) {
//        实例化CachePool对象，传入参数为Integer类型
        CachePool<Integer> pool = new CachePool<>();
        pool.save(1);
        Integer temp = pool.getTemp(); //获取save的设置的temp数据
        System.out.println(temp);
    }
}
