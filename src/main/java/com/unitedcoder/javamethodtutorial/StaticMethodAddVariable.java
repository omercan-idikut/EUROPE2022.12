package com.unitedcoder.javamethodtutorial;

public class StaticMethodAddVariable {
    //static variable
    private static double accountBalance;
    private static String accountName;
    private static int accountNumber;
    public int deposit;
    public  static int money;

    public StaticMethodAddVariable() {
    }
    ///static variable

    public static double getAccountBalance() {
        return accountBalance;
    }

    public static void setAccountBalance(double accountBalance) {
        StaticMethodAddVariable.accountBalance = accountBalance;
    }

    public static String getAccountName() {
        return accountName;
    }

    public static void setAccountName(String accountName) {
        StaticMethodAddVariable.accountName = accountName;
    }

    public static int getAccountNumber() {
        return accountNumber;
    }

    public static void setAccountNumber(int accountNumber) {
        StaticMethodAddVariable.accountNumber = accountNumber;
    }
}
