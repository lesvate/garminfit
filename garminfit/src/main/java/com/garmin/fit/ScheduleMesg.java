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
import java.math.BigInteger;


public class ScheduleMesg extends Mesg {

   
   public static final int ManufacturerFieldNum = 0;
   
   public static final int ProductFieldNum = 1;
   
   public static final int SerialNumberFieldNum = 2;
   
   public static final int TimeCreatedFieldNum = 3;
   
   public static final int CompletedFieldNum = 4;
   
   public static final int TypeFieldNum = 5;
   
   public static final int ScheduledTimeFieldNum = 6;
   

   protected static final  Mesg scheduleMesg;
   static {
      int field_index = 0;
      int subfield_index = 0;
      // schedule
      scheduleMesg = new Mesg("schedule", MesgNum.SCHEDULE);
      scheduleMesg.addField(new Field("manufacturer", ManufacturerFieldNum, 132, 1, 0, "", false, Profile.Type.MANUFACTURER));
      field_index++;
      scheduleMesg.addField(new Field("product", ProductFieldNum, 132, 1, 0, "", false, Profile.Type.UINT16));
      subfield_index = 0;
      scheduleMesg.fields.get(field_index).subFields.add(new SubField("garmin_product", 132, 1, 0, ""));
      scheduleMesg.fields.get(field_index).subFields.get(subfield_index).addMap(0, 1);
      scheduleMesg.fields.get(field_index).subFields.get(subfield_index).addMap(0, 15);
      scheduleMesg.fields.get(field_index).subFields.get(subfield_index).addMap(0, 13);
      subfield_index++;
      field_index++;
      scheduleMesg.addField(new Field("serial_number", SerialNumberFieldNum, 140, 1, 0, "", false, Profile.Type.UINT32Z));
      field_index++;
      scheduleMesg.addField(new Field("time_created", TimeCreatedFieldNum, 134, 1, 0, "", false, Profile.Type.DATE_TIME));
      field_index++;
      scheduleMesg.addField(new Field("completed", CompletedFieldNum, 0, 1, 0, "", false, Profile.Type.BOOL));
      field_index++;
      scheduleMesg.addField(new Field("type", TypeFieldNum, 0, 1, 0, "", false, Profile.Type.SCHEDULE));
      field_index++;
      scheduleMesg.addField(new Field("scheduled_time", ScheduledTimeFieldNum, 134, 1, 0, "", false, Profile.Type.LOCAL_DATE_TIME));
      field_index++;
   }

   public ScheduleMesg() {
      super(Factory.createMesg(MesgNum.SCHEDULE));
   }

   public ScheduleMesg(final Mesg mesg) {
      super(mesg);
   }


   /**
    * Get manufacturer field
    * Comment: Corresponds to file_id of scheduled workout / course.
    *
    * @return manufacturer
    */
   public Integer getManufacturer() {
      return getFieldIntegerValue(0, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set manufacturer field
    * Comment: Corresponds to file_id of scheduled workout / course.
    *
    * @param manufacturer
    */
   public void setManufacturer(Integer manufacturer) {
      setFieldValue(0, 0, manufacturer, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get product field
    * Comment: Corresponds to file_id of scheduled workout / course.
    *
    * @return product
    */
   public Integer getProduct() {
      return getFieldIntegerValue(1, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set product field
    * Comment: Corresponds to file_id of scheduled workout / course.
    *
    * @param product
    */
   public void setProduct(Integer product) {
      setFieldValue(1, 0, product, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get garmin_product field
    *
    * @return garmin_product
    */
   public Integer getGarminProduct() {
      return getFieldIntegerValue(1, 0, Profile.SubFields.SCHEDULE_MESG_PRODUCT_FIELD_GARMIN_PRODUCT);
   }

   /**
    * Set garmin_product field
    *
    * @param garminProduct
    */
   public void setGarminProduct(Integer garminProduct) {
      setFieldValue(1, 0, garminProduct, Profile.SubFields.SCHEDULE_MESG_PRODUCT_FIELD_GARMIN_PRODUCT);
   }

   /**
    * Get serial_number field
    * Comment: Corresponds to file_id of scheduled workout / course.
    *
    * @return serial_number
    */
   public Long getSerialNumber() {
      return getFieldLongValue(2, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set serial_number field
    * Comment: Corresponds to file_id of scheduled workout / course.
    *
    * @param serialNumber
    */
   public void setSerialNumber(Long serialNumber) {
      setFieldValue(2, 0, serialNumber, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get time_created field
    * Comment: Corresponds to file_id of scheduled workout / course.
    *
    * @return time_created
    */
   public DateTime getTimeCreated() {
      return timestampToDateTime(getFieldLongValue(3, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD));
   }

   /**
    * Set time_created field
    * Comment: Corresponds to file_id of scheduled workout / course.
    *
    * @param timeCreated
    */
   public void setTimeCreated(DateTime timeCreated) {
      setFieldValue(3, 0, timeCreated.getTimestamp(), Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get completed field
    * Comment: TRUE if this activity has been started
    *
    * @return completed
    */
   public Bool getCompleted() {
      Short value = getFieldShortValue(4, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
      if (value == null)
         return null;
      return Bool.getByValue(value);
   }

   /**
    * Set completed field
    * Comment: TRUE if this activity has been started
    *
    * @param completed
    */
   public void setCompleted(Bool completed) {
      setFieldValue(4, 0, completed.value, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get type field
    *
    * @return type
    */
   public Schedule getType() {
      Short value = getFieldShortValue(5, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
      if (value == null)
         return null;
      return Schedule.getByValue(value);
   }

   /**
    * Set type field
    *
    * @param type
    */
   public void setType(Schedule type) {
      setFieldValue(5, 0, type.value, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get scheduled_time field
    *
    * @return scheduled_time
    */
   public Long getScheduledTime() {
      return getFieldLongValue(6, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set scheduled_time field
    *
    * @param scheduledTime
    */
   public void setScheduledTime(Long scheduledTime) {
      setFieldValue(6, 0, scheduledTime, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

}