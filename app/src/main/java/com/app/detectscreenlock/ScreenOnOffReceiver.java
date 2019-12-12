package com.app.detectscreenlock;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class ScreenOnOffReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals(Intent.ACTION_SCREEN_OFF)) {
            Log.v("Screen mode", "Screen is in off State");
            Intent i  = new Intent();
            i.setClassName("com.app.detectscreenlock", "com.app.detectscreenlock.MainActivity");
            i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(i);

            /*Intent i = new Intent(context, MainActivity.class);
            i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP); // You need this if starting
            // the activity from a service
          //  i.setAction(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_LAUNCHER);
            context.startActivity(intent);*/

            /*MainActivity.UpdateUiTask.execute(new Runnable() {
                @Override
                public void run() {

                }
            });*/
            //Your logic comes here whatever you want perform when screen is in off state			                  			            }

        } else if (intent.getAction().equals(Intent.ACTION_SCREEN_ON)) {
            Log.v("Screen mode", " Screen is in on State");


            //Your logic comes here whatever you want perform when screen is in on state

        }
    }
}

