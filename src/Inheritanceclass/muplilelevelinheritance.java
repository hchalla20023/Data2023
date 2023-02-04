package Inheritanceclass;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class muplilelevelinheritance {

    String name = "Hari";

    public void Mainclassmethod() {

        System.out.println("this is main class method");
    }

    static class A extends muplilelevelinheritance {

        public void TestA() {

            System.out.println("This is A Class method");
        }
    }

    static class B extends  muplilelevelinheritance{

        public void TestB() {
            System.out.println("This is B Class method");
        }
    }

    static class C extends A {

        public void TestC() {
            System.out.println("This is C Class method");
        }
    }
    public static void main(String[] args) {

           C c = new C();


    }
}
