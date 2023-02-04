package Encapsulatiuonss;

public class EncapsPerson {

    private String accountname;
    private int accountNO;

    public String getAccountname() {

        return accountname;
    }

    public void setAccountname(String myaccname) {

        accountname = myaccname;
    }

    public int getAccountNO() {

        return accountNO;
    }

    public void setAccountNO(int myaccNo) {

        accountNO = myaccNo;
    }
    public static void main(String[] args) {

        EncapsPerson ee = new EncapsPerson();

        ee.setAccountname("AXIS");
        ee.setAccountNO(2021);

        System.out.println("My account name is " + ee.getAccountname() + "" + " my account number is " + ee.getAccountNO());
    }
}
