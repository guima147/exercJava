package com.fit.tarefas.tarefa.Exercico2;


import java.math.BigDecimal;
import java.math.RoundingMode;

public class TransactionType {
    enum Type {
        SELL, BUY, DEPOSIT, WITHDRAWAL;
    }

    private final Type type;

    public TransactionType(Type type){
        this.type = type;
    }

    class TransactionService {

        protected void doBuyTransactionOperation(Account account, BigDecimal cashValue){
            BigDecimal taxPercentageValue = calculateTax(BigDecimal.valueOf(0.15), cashValue);
            cashValue = cashValue.add(taxPercentageValue);
            account.removeMoney(cashValue);
        }

        protected void doSellTransactionOperation(Account account, BigDecimal cashValue){
            BigDecimal taxPercentageValue = calculateTax(BigDecimal.valueOf(0.1), cashValue);
            cashValue = cashValue.add(taxPercentageValue.negate());
            account.addMoney(cashValue);
        }

        protected void doDepositTransactionOperation(Account account, BigDecimal cashValue){
            BigDecimal taxPercentageValue = calculateTax(BigDecimal.valueOf(0.05), cashValue);
            cashValue = cashValue.add(taxPercentageValue.negate());
            account.addMoney(cashValue);
        }

        protected void doWithdrawalTransactionOperation(Account account, BigDecimal cashValue){
            BigDecimal taxPercentageValue = calculateTax(BigDecimal.valueOf(0.20), cashValue);
            cashValue = cashValue.add(taxPercentageValue);
            account.removeMoney(cashValue);
        }

        public void doTransactionOperation(TransactionType.Type type, Account account, BigDecimal cashValue){
            switch (type){
                case BUY: doBuyTransactionOperation(account, cashValue);
                case SELL: doSellTransactionOperation(account, cashValue);
                case DEPOSIT: doDepositTransactionOperation(account, cashValue);
                case WITHDRAWAL: doWithdrawalTransactionOperation(account, cashValue);
                default: throw new IllegalArgumentException();
            }
        }

        private  BigDecimal calculateTax(BigDecimal percentage, BigDecimal cashValue){
            return cashValue
                    .multiply(percentage)
                    .divide(new BigDecimal(100), RoundingMode.HALF_DOWN);
        }
    }

}