package string;

/**
 * 测试题4
 */
public class StringClassExercise02 {
    public static void main(String[] args) {
        String s1 = "hspedu";//指向常量池的 "hspedu"
        String s2 = "java";//指向常量池的 "java"
        String s3 = new String("java");//指向堆中对象 "java"
        String s4 = "java";//指向常量池的 "java"
        System.out.println(s2 == s3);//F
        System.out.println(s2 == s4);//T
        System.out.println(s2.equals(s3));//T
        System.out.println(s1 == s2);//F
    }
}
