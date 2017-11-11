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

import java.util.List;
import java.util.ArrayList;

/**
 * BufferedMesgBroadcaster intercepts the incoming messages
 * from the given decode stream, buffers them, and offers
 * an opportunity to edit the messages before broadcasting
 * the messages to all registered listeners.
 * <p>
 * To edit the messages, a MesgBroadcastPlugin must be
 * registered. All registered MesgBroadcastPlugins are given
 * the opportunity to see each message as they are decoded,
 * as well as to see and edit the final list of
 * messages before broadcast to listeners
 *
 */
public class BufferedMesgBroadcaster extends MesgBroadcaster{
   private final List<Mesg>                  mesgs;
   private final List<MesgBroadcastPlugin>   plugins;

   /**
    * Constructor.
    *
    * Calls the super constructor and initializes lists
    */
   public BufferedMesgBroadcaster() {

      // Call MesgBroadcaster constructor
      super();

      mesgs = new ArrayList<Mesg>();
      plugins = new ArrayList<MesgBroadcastPlugin>();
   }

   /**
    * Constructor.
    *
    * Calls the super constructor and initializes lists
    *
    * @param decode
    */
   public BufferedMesgBroadcaster(Decode decode) {

      // Call MesgBroadcaster constructor
      super(decode);

      mesgs = new ArrayList<Mesg>();
      plugins = new ArrayList<MesgBroadcastPlugin>();
   }

   /**
    * Registers a plugin, which the class will call on onMesg and broadcast
    * @param plugin The MesgBroadcastPlugin object to be registered
    *
    */
   public void registerMesgBroadcastPlugin(MesgBroadcastPlugin plugin) {
      plugins.add(plugin);
   }

   /**
    * Buffers incoming messages and passes them on to any registered plugins
    *
    * @param mesg
    */
   public void onMesg(final Mesg mesg) {
      mesgs.add(mesg);

      // Pass the message to each plugin. This gives the
      // plugin a chance to peek the incoming messages
      for (final MesgBroadcastPlugin plugin : plugins )
         plugin.onIncomingMesg(mesg);
   }

   /**
    * Passes the reference to the list of messages to any registered plugins.
    * Sends each message to the MesgBroadcast class to be broadcast to any listeners
    *
    */
   public void broadcast() {
      for (final MesgBroadcastPlugin plugin : plugins )
         plugin.onBroadcast(mesgs);

      for (final Mesg mesg : mesgs )
         super.onMesg(mesg);
   }
}
