package org.xiaojian.shuzu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author XIAOJIAN
 * @create 2022-01-18 10:10
 * @项目名 helloworld
 * @package org.xiaojian.shuzu
 */
public class ArrayDemo {
}

class ArrayListDemo {

    public static void main(String[] args) {
        creatArray();
    }

    static void creatArray() {
        ArrayList<Object> obj = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            obj.add(i);
            obj.add("2");
            obj.add("a");
        }

        System.out.println(obj);
        System.out.println(obj.size());
        System.out.println(obj.toArray());
        System.out.println(obj.indexOf("2"));
        System.out.println(obj.lastIndexOf("2"));
        System.out.println(obj.clone());

    }
}

class LinkedListDemo {
    public static void main(String[] args) {
        creatArray();
    }

    static void creatArray() {
        LinkedList<Object> ll = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            ll.add(i);
            ll.add(11);
        }
        System.out.println(ll);

        //1.for循环
        for (int i = 0; i < ll.size(); i++) {
            //System.out.println(linkedList.get(i));
        }
        //2.foreach
        for (Object object : ll) {
            System.out.println(object);
        }
        //3.迭代器
        //获得对应容器的迭代器
        Iterator iterator1 = ll.iterator();
        //
        while (iterator1.hasNext()) {
            Object object = (Object) iterator1.next();
            System.out.println(object);
        }

        Iterator<Object> iterator = ll.iterator();
        for (Iterator<Object> it = iterator; it.hasNext(); ) {
            Object obj = it.next();
            System.out.println(obj);

        }
    }
}
