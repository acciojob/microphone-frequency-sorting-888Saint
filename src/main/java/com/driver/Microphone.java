package com.driver;

public class Microphone {
    private String id;
    private int frequencyResponse;

    public Microphone(String id, int frequencyResponse) {
        this.id = id;
        this.frequencyResponse = frequencyResponse;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getFrequencyResponse() {
        return frequencyResponse;
    }

    public void setFrequencyResponse(int frequencyResponse) {
        this.frequencyResponse = frequencyResponse;
    }

    @Override
    public String toString() {
    	// your code goes here
        return "Microphone [ID=" + id + ", FrequencyResponse=" + frequencyResponse + "Hz]";
    }
}
