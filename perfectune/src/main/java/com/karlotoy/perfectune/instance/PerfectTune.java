package com.karlotoy.perfectune.instance;

import com.karlotoy.perfectune.thread.TuneThread;

/**
 * Created by Nerubia on 2/20/2017.
 */

public class PerfectTune {

    private TuneThread tuneThread;
    private double tuneFreq = 0f;

    public PerfectTune playTune(){
        if(tuneThread == null){
            tuneThread = new TuneThread();
            tuneThread.setTuneFreq(tuneFreq);
            tuneThread.start();
        }
        return this;
    }

    public void setTuneFreq(double tuneFreq) {
        this.tuneFreq = tuneFreq;
        if(tuneThread != null){
            tuneThread.setTuneFreq(tuneFreq);
        }
    }

    public double getTuneFreq() {
        return tuneFreq;
    }

    public void stopTune(){
        if(tuneThread != null){
            tuneThread.stopTune();
            tuneThread = null;
        }
    }

}
