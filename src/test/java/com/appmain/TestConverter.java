package com.appmain;

import com.appmain.Converter.ConverterCurrency;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class TestConverter {

   HashMap<String, Double> data = new HashMap<>();
   ConverterCurrency converter = new ConverterCurrency();
   @Test
   void name() {
      data.put("Dollar",16425D);
      data.put("Ringgit",3695D);
      data.put("Riyal",4400D);

      converter.converterOrderCurrency(50000, data.get("Dollar"));
      System.out.println(converter.getResultOrder());
      System.out.printf("%5f",converter.getResultOrder());
   }

   @Test
   void test() {
      data.put("Dollar",16425D);
      data.put("Ringgit",3695D);
      data.put("Riyal",4400D);

      converter.converterRupiah(5,data.get("Dollar"));
      System.out.println(converter.getResultRupiah());
   }

   @Test
   void testviewRupiah() {
      converter.viewRupiah();
   }

   @Test
   void choose() {
      System.out.println(converter.ChooseCurrency("1"));
   }
}
