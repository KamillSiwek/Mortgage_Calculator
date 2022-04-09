package pl.loan_calculator.service;

import pl.loan_calculator.model.InputData;
import pl.loan_calculator.model.Rate;
import pl.loan_calculator.model.RateAmounts;

public interface AmountsCalculationService {
    RateAmounts calculate(InputData inputData);

    RateAmounts calculate(InputData inputData, Rate previousRate);
}
