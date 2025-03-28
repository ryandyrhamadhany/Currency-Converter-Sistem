package com.appmain;

import com.appmain.Converter.ConverterCurrency;
import com.appmain.Converter.Currency;

public class AppMain {

   public static void main(String[] args) {
      Currency currency = new Currency();
      ConverterCurrency converterCurrency = new ConverterCurrency(currency);
      converterCurrency.viewConverterCurrency();
   }

}
