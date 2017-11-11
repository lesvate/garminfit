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


package com.garmin.fit.csv;

import com.garmin.fit.*;

import java.util.Collection;
import java.util.Iterator;

public class MesgDataCSVWriter extends MesgCSVWriterBase implements MesgListener {

   public MesgDataCSVWriter(String fileName) {
      super(fileName);
   }

   public void onMesg(Mesg mesg) {
      if (mesg.getName().equals("unknown") && hideUnknownData)
         return;

      if (removeExpandedFields) {
          mesg.removeExpandedFields();
      }

      for(Field field : mesg.getFields()) {
         if (field.getName().equals("unknown") && hideUnknownData) {
            continue;
         }

         int subFieldIndex = mesg.getActiveSubFieldIndex(field.getNum());

         String value = getValueString(field, subFieldIndex);
         String headerString = mesg.getName() + "." + field.getName(subFieldIndex);

         String units = field.getUnits(subFieldIndex);
         if(!units.isEmpty()) {
            headerString+= "[" + units + "]";
         }

         csv.set(headerString, value);
      }

      for(DeveloperField field : mesg.getDeveloperFields()){
         if(!field.isDefined() && hideUnknownData){
            continue;
         }

         String value = getValueString(field, Fit.SUBFIELD_INDEX_MAIN_FIELD);
         String headerString = mesg.getName() + ".developer." + field.getDeveloperDataIndex() + "." + field.getName();

         String units = field.getUnits();
         if(units != null && !units.isEmpty()) {
            headerString += "[" + units + "]";
         }

         csv.set(headerString, value);
      }

      csv.writeln();
   }
}
