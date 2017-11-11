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


public enum Sport {
   GENERIC((short)0),
   RUNNING((short)1),
   CYCLING((short)2),
   TRANSITION((short)3),
   FITNESS_EQUIPMENT((short)4),
   SWIMMING((short)5),
   BASKETBALL((short)6),
   SOCCER((short)7),
   TENNIS((short)8),
   AMERICAN_FOOTBALL((short)9),
   TRAINING((short)10),
   WALKING((short)11),
   CROSS_COUNTRY_SKIING((short)12),
   ALPINE_SKIING((short)13),
   SNOWBOARDING((short)14),
   ROWING((short)15),
   MOUNTAINEERING((short)16),
   HIKING((short)17),
   MULTISPORT((short)18),
   PADDLING((short)19),
   FLYING((short)20),
   E_BIKING((short)21),
   MOTORCYCLING((short)22),
   BOATING((short)23),
   DRIVING((short)24),
   GOLF((short)25),
   HANG_GLIDING((short)26),
   HORSEBACK_RIDING((short)27),
   HUNTING((short)28),
   FISHING((short)29),
   INLINE_SKATING((short)30),
   ROCK_CLIMBING((short)31),
   SAILING((short)32),
   ICE_SKATING((short)33),
   SKY_DIVING((short)34),
   SNOWSHOEING((short)35),
   SNOWMOBILING((short)36),
   STAND_UP_PADDLEBOARDING((short)37),
   SURFING((short)38),
   WAKEBOARDING((short)39),
   WATER_SKIING((short)40),
   KAYAKING((short)41),
   RAFTING((short)42),
   WINDSURFING((short)43),
   KITESURFING((short)44),
   TACTICAL((short)45),
   JUMPMASTER((short)46),
   BOXING((short)47),
   FLOOR_CLIMBING((short)48),
   ALL((short)254),
    INVALID((short)255);

    protected short value;

    private Sport(short value) {
        this.value = value;
    }

   public static Sport getByValue(final Short value) {
      for (final Sport type : Sport.values()) {
         if (value == type.value)
            return type;
      }

      return Sport.INVALID;
   }

    /**
     * Retrieves the String Representation of the Value
     * @return The string representation of the value
     */
   public static String getStringFromValue( Sport value ) {
       return value.name();
   }

   public short getValue() {
      return value;
   }


}
