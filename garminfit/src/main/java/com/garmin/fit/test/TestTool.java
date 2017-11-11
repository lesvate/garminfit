////////////////////////////////////////////////////////////////////////////////
// The following FIT Protocol software provided may be used with FIT protocol
// devices only and remains the copyrighted property of Dynastream Innovations Inc.
// The software is being provided on an "as-is" basis and as an accommodation,
// and therefore all warranties, representations, or guarantees of any kind
// (whether express, implied or statutory) including, without limitation,
// warranties of merchantability, non-infringement, or fitness for a particular
// purpose, are specifically disclaimed.
//
// Copyright 2017 Dynastream Innovations Inc.
////////////////////////////////////////////////////////////////////////////////
// ****WARNING****  This file is auto-generated!  Do NOT edit this file.
// Profile Version = 20.46Release
// Tag = production/akw/20.46.00-0-g42b354e
////////////////////////////////////////////////////////////////////////////////


package com.garmin.fit.test;

import com.garmin.fit.*;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;

public class TestTool {
   public static void main(String args[]) {
      int arg = 0;
      ArrayList<String> inFile = new ArrayList<String>();
      Decode decode = new Decode();

      System.out.printf("FIT Test Tool %d.%d.%d.%d\n", Fit.PROTOCOL_VERSION_MAJOR, Fit.PROTOCOL_VERSION_MINOR, Fit.PROFILE_VERSION_MAJOR, Fit.PROFILE_VERSION_MINOR);

      while (arg < args.length) {
         if (args[arg].equals("-d")) {
            Fit.debug = true;
         } else {
           String in = args[arg];
           inFile.add(in);
         }
         arg++;
      }

      if (inFile.size() == 0)
      {
         printUsage();
         return;
      }

      for (int i=0; i<inFile.size(); i++)
      {
         Object stList[] = inFile.toArray();

         System.out.println("Input file: " + ((String) stList[i]));
         try {
            if (!decode.checkFileIntegrity((InputStream) new FileInputStream(((String) stList[i]))))
               throw new RuntimeException("FIT file integrity failure.");
         } catch (java.io.IOException e) {
            throw new RuntimeException(e);
         }

         Tests tests = new Tests();
         System.out.println("Running FIT file verification tests...");
         if (tests.run(((String) stList[i])))
            System.out.println("Passed FIT file verification.");
         else
            System.out.println("Failed FIT file verification.");
      }
   }

   private static void printUsage() {
      System.out.println("Usage: java -jar FitTestTool.jar <INPUT FILE> <INPUT FILE>");
      System.out.println("      -d Enable debug output.");
   }
}