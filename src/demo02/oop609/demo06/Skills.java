package demo02.oop609.demo06;

import java.util.Arrays;

public class Skills extends Player {
    public String name;
    public int lowerGrade = 18;
    public Skills() {

    }

    public Skills(int grade, int i) {
        super(grade, i);
    }

    public void showSkills() {
        if (getGrade() > lowerGrade)
            System.out.print("您当前学的技能有:" + Arrays.toString(skillsTree) + " 当前等级为:" + getGrade());
        else
            System.out.println("打怪失败");
    }
}
