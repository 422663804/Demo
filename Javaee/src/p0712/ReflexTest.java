package p0712;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflexTest {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Light light = new Light();
//        第一种
//        Class class01 = Light.class;
//        第二种
//        Class class02 = light.getClass();
//        第三种
        Class class03 = null;
        try {
            class03 = Class.forName("p0712.Light"); //包名.类名

            Constructor constructor01 = class03.getDeclaredConstructor();
            Object obj01 = constructor01.newInstance();
            System.out.println(class03.toString());

            Constructor constructor02 = class03.getDeclaredConstructor(int.class, String.class);
            Object obj02 = constructor02.newInstance(123, "Tian");

            Method on = class03.getDeclaredMethod("on");
            on.invoke(obj01);
//            System.out.println(class03);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("-----------获取类的所有属性------------");
        Class c4 = Class.forName("p0712.Person");
        Field[] declaredFields = c4.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        System.out.println("-----------获取指定属性的值------------");
        Field name = c4.getDeclaredField("name");
        System.out.println(name);
    }
}

class Light {
    private int num;
    private String name;

    public Light() {
        System.out.println("调用无参构造方法");
    }

    public Light(int num, String name) {
        this.num = num;
        this.name = name;
        System.out.println("调用有参构造方法");
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println("打开");
    }

    @Override
    public String toString() {
        return "Light{" +
                "num=" + num +
                ", name='" + name + '\'' +
                '}';
    }
}