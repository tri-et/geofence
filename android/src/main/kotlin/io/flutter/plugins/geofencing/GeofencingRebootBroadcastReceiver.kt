package com.example.geofencing;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

class GeofencingRebootBroadcastReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        if (intent.getAction().equals("android.intent.action.BOOT_COMPLETED")) {
            Log.e("GEOFENCING REBOOT", "Reregistering geofences!")
            GeofencingPlugin.reRegisterAfterReboot(context)
        }
    }
}