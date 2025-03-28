package com.appmain.Converter;

public class Currency {
   private double result;

   public void converterOrderCurrency(double inputRupiah,Double valueConverter){
      this.result = inputRupiah / valueConverter;
   }
   // OOP
   public void converterRupiah(double inputOrderCurrency,Double valueConverter){
      this.result = inputOrderCurrency * valueConverter;
   }

   public double getResult() {
      return result;
   }

}
