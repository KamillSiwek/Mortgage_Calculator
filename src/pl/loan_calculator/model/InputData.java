package pl.loan_calculator.model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class InputData {

    private static final BigDecimal PERCENT = BigDecimal.valueOf(100);

    private LocalDate repaymentStartDate = LocalDate.of(2022,4,1);

    private BigDecimal wiborPercent = new BigDecimal("4.87");

    private BigDecimal amount = new BigDecimal("700000");

    private BigDecimal monthsDuration =  BigDecimal.valueOf(300);

    private RateType rateType = RateType.CONSTANT;

    private BigDecimal bankMarginPercent = new BigDecimal("1.9");

    public InputData withRepaymentStartDate(LocalDate repaymentStartDate){
       this.repaymentStartDate = repaymentStartDate;
       return this;
    }

    public InputData withWiborPercent(BigDecimal wiborPercent){
       this.wiborPercent = wiborPercent;
       return this;
    }

    public InputData withAmount(BigDecimal amount){
       this.amount = amount;
       return this;
    }

    public InputData withMonthsDuration(BigDecimal monthsDuration){
        this.monthsDuration = monthsDuration;
        return this;
    }

    public InputData withRateType(RateType rateType){
        this.rateType = rateType;
        return this;
    }

    public InputData withBankMargin(BigDecimal bankMargin){
        this.bankMarginPercent = bankMargin;
        return this;
    }


    public LocalDate getRepaymentStartDate() {
        return repaymentStartDate;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public BigDecimal getMonthsDuration() {
        return monthsDuration;
    }

    public RateType getRateType() {
        return rateType;
    }

    public BigDecimal getInterestPercent() {
        return wiborPercent.add(bankMarginPercent).divide(PERCENT,10 , RoundingMode.HALF_UP);
    }
    public BigDecimal getInterestDisplay() {
        return wiborPercent.add(bankMarginPercent).setScale(2, RoundingMode.HALF_UP);
    }
}
