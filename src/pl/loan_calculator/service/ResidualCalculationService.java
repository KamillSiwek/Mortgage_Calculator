package pl.loan_calculator.service;

import pl.loan_calculator.model.InputData;
import pl.loan_calculator.model.MortgageResidual;
import pl.loan_calculator.model.Rate;
import pl.loan_calculator.model.RateAmounts;

public interface ResidualCalculationService {
    MortgageResidual calculate(RateAmounts rateAmounts, InputData inputData);
    MortgageResidual calculate(RateAmounts rateAmounts, Rate previousRate);
}
