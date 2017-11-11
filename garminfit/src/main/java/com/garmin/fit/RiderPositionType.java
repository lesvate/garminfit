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


package com.garmin.fit;


public enum RiderPositionType {
   SEATED((short)0),
   STANDING((short)1),
   TRANSITION_TO_SEATED((short)2),
   TRANSITION_TO_STANDING((short)3),
    INVALID((short)255);

    protected short value;

    private RiderPositionType(short value) {
        this.value = value;
    }

   public static RiderPositionType getByValue(final Short value) {
      for (final RiderPositionType type : RiderPositionType.values()) {
         if (value == type.value)
            return type;
      }

      return RiderPositionType.INVALID;
   }

    /**
     * Retrieves the String Representation of the Value
     * @return The string representation of the value
     */
   public static String getStringFromValue( RiderPositionType value ) {
       return value.name();
   }

   public short getValue() {
      return value;
   }


}
