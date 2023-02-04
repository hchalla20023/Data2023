package Abstractt;

abstract class abstractsclass {

    public  abstractsclass() {

    }
    abstract void test();// defination

    public void test1() {

    }
    static  class newbike extends abstractsclass {

        public void test() {
            //implementation
            System.out.println("This is sub class method");
        }

    }
    public static void main(String[] args) {


        newbike nn = new newbike();

        nn.test();//
    }
}
