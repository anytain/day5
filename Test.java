package com.frist.day5;

public class Test
{public static void main(String[ ]args )
{Student stu1=new Student();
stu1.setId(14232149);
stu1.setName("»ÆÌÎ");
stu1.setAge(20);
System.out.println("stu1,id:"+stu1.getId());
System.out.println("stu1,name:"+stu1.getName());
System.out.println("stu1,age:"+stu1.getAge());

//ÊµÀı»¯
Student stu2=new Student();
stu2.setId(14232148);
stu2.setName("Ó¦ÓÀ¼ª");
stu2.setAge(20);
System.out.println("stu2,id:"+stu2.getId());
System.out.println("stu2,name:"+stu2.getName());
System.out.println("stu2,age:"+stu2.getAge());
System.out.println("they are good boy , but too much time sleep every day");
}
}