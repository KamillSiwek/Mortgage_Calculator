package pl.loan_calculator.service;

import pl.loan_calculator.model.InputData;
import pl.loan_calculator.model.Rate;

import java.util.List;

public interface PrintingService {

    String INTEREST_SUM = "SUMA ODSETEK: ";
    String RATE_NUMBER = "NR: ";
    String YEAR = "ROK: ";
    String MONTH = "MIESIAC: ";
    String DATE = "DATA: ";
    String MONTHS = " MIESIECY";
    String RATE = "RATA: ";
    String INTREREST = "ODSETKI: ";
    String INTREREST_RATE = "OPROCENTOWANIE: ";
    String CAPITAL = "KAPITAL: ";
    String LEFT_AMOUNT = "POZOSTALA KWOTA: ";
    String LEFT_MONTHS = "POZOSTALO MIESIECY: ";
    String MORTAGE_AMOUNT = "KWOTA KREDYTU: ";
    String MORTGAGE_PERIOD = "OKRES KREDYTOWANIA: ";
    String CURRENCY = " ZL ";
    String NEW_LINE = "\n";
    String PERCENT = "% ";

    void printInputDataInfo(final InputData inputData);

    void printRates(List<Rate> rates);
}
