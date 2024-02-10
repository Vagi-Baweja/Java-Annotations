import java.lang.reflect.*;
class abcd
{
private String data1;
private int data2;
private int data3;
public int data4;
protected int data5;
int data6;
}
class psp
{
public static void main(String gg[])
{
Class a=abcd.class;
Field [] flds;
flds=a.getFields();
for(int e=0;e<flds.length;e++)
{
System.out.println("Property : "+flds[e].getName());
}
}
}
