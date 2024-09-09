import java.util.Date;

class account{
    public int accNo;
    public String name;
    public String address = "";
    public int phoneNo;
    public String dob;

    public float balance=0;

    public void getBalance(){
        System.out.println(balance);
    }

    public void setAddress(String add){
        address = add;
    }
}

class savingAccount extends account{
    public savingAccount(int acc, String nameAccountHolder, int phone){
        accNo = acc;
        name = nameAccountHolder;
        phoneNo=phone;
    }

    account ac = new account();

    public void depositAmount(float amount){
        balance += amount;
    }

    public void withdrawAmount(float amount){
        balance -= amount;
        ac.getBalance();
    }

    public void getDetails(){
        System.out.println(accNo +"\n"+name+"\n"+phoneNo+"\n"+address);
        ac.getBalance();
    }
}

class loanAccount extends account{
    public int loanAmount=0;
    public loanAccount(int acc, String nameAccountHolder, int phone){
        accNo = acc;
        name = nameAccountHolder;
        phoneNo=phone;
    }

    public void depositAmount(int amount){
        balance+=amount;
        System.out.println(balance);
    }

    public void getLoan(int amount){
        if(amount>balance){
            System.out.println("Balance is very less loan can't be dispatched");
        }
        else{
            balance += amount;
            loanAmount +=amount;
            System.out.println("Loan dispatched " + balance);
        }

    }

    public void loanGiven(){
        System.out.println("Loan dispatched is: " + loanAmount);
    }
}

public class inheritanceAdvance {
    public static void main(String[] args){
        savingAccount sa = new savingAccount(123456,"Abhiraj",987654321);
        sa.depositAmount(2000);
        sa.getBalance();
        sa.getDetails();

        loanAccount la = new loanAccount(23456,"Yashraj",87654329);

        la.depositAmount(3000);
        la.getLoan(1000);
        la.loanGiven();
    }
}
