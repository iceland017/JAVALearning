package innerclass.anonymousinnerclass;

/**\
 * 1.有一个铃声接口Bell，里面有个ring方法()
 * 2.有一个手机类Cellphone，具有闹钟功能alarmclock，参数是Bell类型
 * 3.测试手机类的闹钟功能，通过匿名内部类(对象)作为参数，打印:懒猪起床了
 * 4.再传入另一个匿名内部类(对象)，打印小伙伴上课了
 */
public class AnonymousInnerClassExercise02 {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        cellPhone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床了");
            }
        });//使用匿名内部类

        cellPhone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("小伙伴们上课了");
            }
        });
    }
}
interface Bell{//接口
    void ring();//方法
}
class CellPhone{//类
    public void alarmclock(Bell bell){//形参是Bell接口类型
        bell.ring();
    }
}