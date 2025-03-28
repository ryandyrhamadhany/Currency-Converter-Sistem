package com.appmain.Converter;

import java.util.HashMap;
import java.util.Scanner;

public class ConverterCurrency {
   private Scanner input = new Scanner(System.in);
   private HashMap<String, Double> targetCurrency = new HashMap<>();
   private Currency currency = new Currency();

   // OOP
   public ConverterCurrency(Currency currency) {
      this.currency = currency;
      addCurrency();
   }

   // Procedural
   public Double inputCurrency(String info){
      System.out.print(info);
      Double inputResult = input.nextDouble();
      input.nextLine();
      return inputResult;
   }

   // Procedural
   public String input(String info){
      System.out.print(info);
      String inputResult = input.nextLine();

      return inputResult;
   }

   // Procedural
   public String ChooseCurrency(String input){
      if (input.equals("1")){
         return "Dollar";
      } else if (input.equals("2")) {
         return "Ringgit";
      } else if (input.equals("3")) {
         return "Riyal";
      }
      return null;
   }

   // OOP
   public void viewConverterCurrency(){
      while (true){
         System.out.println("Currency Converter");
         System.out.println("Pilih: ");
         System.out.println("1. Rupiah ke mata uang lain");
         System.out.println("2. Mata uang lain ke rupiah");
         System.out.println();
         String result = input("Masukan pilihan anda (x untuk keluar): ");

         if (result.equals("1")){
            viewRupiah();
         } else if (result.equals("2")) {
            viewOrderCurrency();
         } else if (result.equalsIgnoreCase("x")) {
            break;
         }
      }
   }

   // OOP
   public void viewOrderCurrency(){
      System.out.println("Pilih mata uang untuk dirubah ke Rupiah: ");
      System.out.println("1. Dollar");
      System.out.println("2. Ringgit");
      System.out.println("3. Riyal");

      String result = input("Masukan Pilihan anda: ");
      String key = ChooseCurrency(result);
      double resultOrder = inputCurrency("Masukan Nilai Mata Uang anda: ");
      currency.converterRupiah(resultOrder,targetCurrency.get(key));

//      System.out.println(resultOrder+" "+key+" ke mata uang Rupiah adalah "+getResultRupiah());
      System.out.printf("%.2f %s ke mata uang Rupiah adalah %.2f\n",resultOrder,key,currency.getResult());
   }

   // OOP
   public void viewRupiah(){
      System.out.println("Pilih Mata uang untuk merubah rupiah: ");
      System.out.println("1. Dollar");
      System.out.println("2. Ringgit");
      System.out.println("3. Riyal");

      String result = input("Masukan Pilihan anda: ");
      String key = ChooseCurrency(result);
      double resultrupiah = inputCurrency("Masukan Nilai Rupiah: ");

      currency.converterOrderCurrency(resultrupiah,targetCurrency.get(key));
//      System.out.println(resultrupiah+" Rupiah ke mata uang "+key+" adalah "+getResultOrder());
      System.out.printf("%.2f Rupiah ke mata uang %s adalah %.2f\n",resultrupiah,key,currency.getResult());
   }

   // OOP


   // OOP
   public void addCurrency(){
      targetCurrency.put("Dollar",16425D);
      targetCurrency.put("Ringgit",3695D);
      targetCurrency.put("Riyal",4400D);
   }
}
