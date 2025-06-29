import main.Account.Account;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    private Account justineAccount;

    @BeforeEach
    public void setUp(){
        justineAccount = new Account(0, "passWord");
        assertEquals(0, justineAccount.getBalance());
    }

    @Test
    public void depositTest() {
        justineAccount.deposit(2_000);
        assertEquals(2_000, justineAccount.getBalance());
        }

    @Test
    public void withdrawMoneyFromAccount_checkBalanceWasDeducted(){
        justineAccount.deposit(5_000);
        assertEquals(5_000, justineAccount.getBalance());

        justineAccount.withdraw(2_000, "passWord");
        assertEquals(3_000, justineAccount.getBalance());
    }

    @Test
    public void depositNegativeAmount_balanceIsUnchanged(){
        justineAccount.deposit(1000);
        assertEquals(1_000, justineAccount.getBalance());

        justineAccount.deposit(-2000);
        assertEquals(1_000, justineAccount.getBalance());
    }

    @Test
    public void withdrawNegativeAmount_balanceIsUnchanged(){
        justineAccount.deposit(900);
        assertEquals(900, justineAccount.getBalance());

        justineAccount.withdraw(-5000, "passWord");
        assertEquals(900, justineAccount.getBalance());
    }

    @Test
    public void checkInvalidPinForWithdrawal_balanceIsUnchanged(){
        justineAccount.deposit(2000);
        assertEquals(2_000, justineAccount.getBalance());

        justineAccount.withdraw(1_500, "pssword");
        assertEquals(2_000, justineAccount.getBalance());
    }

    @Test
    public void withdrawHigherThanBalance_balanceIsTheSame(){
        justineAccount.deposit(2000);
        assertEquals(2000, justineAccount.getBalance());

        justineAccount.withdraw(3000, "passWord");
        assertEquals(2000,  justineAccount.getBalance());
    }

    }

