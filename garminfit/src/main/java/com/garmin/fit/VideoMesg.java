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


public class VideoMesg extends Mesg {

   
   public static final int UrlFieldNum = 0;
   
   public static final int HostingProviderFieldNum = 1;
   
   public static final int DurationFieldNum = 2;
   

   protected static final  Mesg videoMesg;
   static {
      // video
      videoMesg = new Mesg("video", MesgNum.VIDEO);
      videoMesg.addField(new Field("url", UrlFieldNum, 7, 1, 0, "", false, Profile.Type.STRING));
      
      videoMesg.addField(new Field("hosting_provider", HostingProviderFieldNum, 7, 1, 0, "", false, Profile.Type.STRING));
      
      videoMesg.addField(new Field("duration", DurationFieldNum, 134, 1, 0, "ms", false, Profile.Type.UINT32));
      
   }

   public VideoMesg() {
      super(Factory.createMesg(MesgNum.VIDEO));
   }

   public VideoMesg(final Mesg mesg) {
      super(mesg);
   }


   /**
    * Get url field
    *
    * @return url
    */
   public String getUrl() {
      return getFieldStringValue(0, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set url field
    *
    * @param url
    */
   public void setUrl(String url) {
      setFieldValue(0, 0, url, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get hosting_provider field
    *
    * @return hosting_provider
    */
   public String getHostingProvider() {
      return getFieldStringValue(1, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set hosting_provider field
    *
    * @param hostingProvider
    */
   public void setHostingProvider(String hostingProvider) {
      setFieldValue(1, 0, hostingProvider, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get duration field
    * Units: ms
    * Comment: Playback time of video
    *
    * @return duration
    */
   public Long getDuration() {
      return getFieldLongValue(2, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set duration field
    * Units: ms
    * Comment: Playback time of video
    *
    * @param duration
    */
   public void setDuration(Long duration) {
      setFieldValue(2, 0, duration, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

}
