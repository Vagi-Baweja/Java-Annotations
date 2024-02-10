import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface ThinkingMachines
{
public int value() default 10;
public String city() default "Ujjain";
}
@ThinkingMachines(value=40,city="Indore")
class abcd 
{

}
class psp
{
public static void main(String gg[])
{
Class a=abcd.class; //class a = Class.forName("abcd");
Annotation aa = a.getAnnotation(ThinkingMachines.class);
if(aa!=null)
{
ThinkingMachines tm = (ThinkingMachines)aa;
System.out.println(tm.value());
System.out.println(tm.city());
}
}
}