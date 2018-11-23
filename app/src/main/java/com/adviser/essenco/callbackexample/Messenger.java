package com.adviser.essenco.callbackexample;

public class Messenger {
    private static final String TAG = "Messenger";
    private CallbackInterface callbackInterface;

    public Messenger(CallbackInterface callbackInterface) {
        this.callbackInterface = callbackInterface;
        this.calledFromMessenger();
    }
    public void calledFromMessenger(){
        //Messenger received call and is returning
        callbackInterface.callbackMessage();
    }
}
