package com.cc.java;

import com.cc.bean.Customer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Ping
 * @Date 2020/11/30-17:09
 */
public class Hello {
    //IDEA中代码模块所处位置：settings-Editoe-live Templates/Postfix Completion
    //模板一：psvm
    public static void main(String[] args) {

            //模板二：sout
        System.out.println("hello!!!");
        //变形：soutp/soutm/soutv/xxx.sout

        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("Hello.main");
       int num1=10;
       int num2=20;
        System.out.println("num2 = " + num2);
        System.out.println(num1);
    //模板三：fori
        String[]arr=new String[]{"Tom","Jerry","Marry","Rose"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //变形：iter 增强for循环
        for (String s : arr) {
            System.out.println(s);
        }
        //变形：itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }
        //模板四：list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(678);
        for (Object o : list) {
            System.out.println(o);
        }
        //变形：list.fori
        for (int i = 0; i < list.size(); i++) {
            
        }
        //变形：list.forr  倒序遍历
        for (int i = list.size() - 1; i >= 0; i--) {

        }
        //模板五：ifn 如果为空
        if (list == null) {

        }
        //变形：inn  如果不为空
        if (list != null) {

        }
        //变形：xxx.nn/xxx.null
        if (list == null) {

        }
        if (list != null) {

        }


    }
    //模板六：prsf:可生成 private static final
    //alt+Enter添加依赖
    private static final Customer CUST=new Customer();
    //变形：psf
    public static final int NUM=1;
    //变形：psfi
    public static final int NUM2=2;
    //变形：psfs
    //ctrl+shif+y 大小写转换
    public static final String NATION="china";
}

