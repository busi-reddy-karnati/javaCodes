package com.lti.Abstraction;

import com.lti.BankAccount;

/**
 * Created by busis on 2020-12-02.
 */
interface Bank{
    void deposit();
    void withdraw();//We don't need abstract keyword
}
interface house{
    void payRent();
}

class Institute{

}
public class UseInterface extends Institute implements Bank,house{//IN inheritance, we can implement multiple methods
    //We can implement and extend and at the same time
    @Override
    public void deposit() {

    }

    @Override
    public void withdraw() {

    }

    @Override
    public void payRent() {

    }
}
