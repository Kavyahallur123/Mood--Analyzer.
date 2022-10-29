package com.bridgelabz.MoodAnalyzer;

public class MoodAnalyzerMain {
    String  message;

    public MoodAnalyzerMain() {
    }

    MoodAnalyzerMain(String message){
        this.message = message;
    }
    public String analyseMood() {
        if (this.message.contains("sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}
Footer
        © 2022 GitHub, Inc.
        Footer navigation
        Terms
        Privacy
        Security
        Status
        Docs
        Contact GitHub