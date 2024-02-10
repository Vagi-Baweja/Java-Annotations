import java.lang.annotation.*;
import java.lang.reflect.*;
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.FIELD})
@interface Whatever
{
}
class abcd
{
@Whatever
private String data1;
private int data2;
@Whatever
private int data3;
public int data4;
@Whatever
protected int data5;
int data6;
}
class psp
{
public static void main(String gg[])
{
Class a=abcd.class;
Field [] flds;
flds=a.getDeclaredFields(); //agar getDeclaredFileds ko call kiya hota to sari fields declare ho jate hai
for(int e=0;e<flds.length;e++)
{
Annotation aaa=flds[e].getAnnotation(Whatever.class);
if(aaa!=null)
{
System.out.println("Whatever has been applied on filed : "+flds[e].getName());
}
}
}
}
