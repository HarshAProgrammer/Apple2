package com.android.apple.activities;

import android.app.Activity;
import android.app.AlertDialog;
import android.view.LayoutInflater;

import com.airbnb.lottie.LottieAnimationView;
import com.android.apple.R;

class TransitionDialogue
{
    private AlertDialog dialogue;
    private final Activity activity;

    TransitionDialogue(Activity myActivity){
        activity = myActivity;
    }

    void startTransitionDialogue(){


        AlertDialog.Builder builder = new AlertDialog.Builder(activity);

        LayoutInflater inflate = activity.getLayoutInflater();
        builder.setView(inflate.inflate(R.layout.transition_dialogue,null));
        builder.setCancelable(true);

        dialogue = builder.create();
        dialogue.show();
    }

    void dismissDialogue(){
        dialogue.dismiss();
    }
}
