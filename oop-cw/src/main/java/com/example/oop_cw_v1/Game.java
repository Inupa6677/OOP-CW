package com.example.oop_cw_v1;

public class Game extends Event {

    public String getReward(){
        return reward;
    }

    public void setReward(String reward) {
        this.reward = reward;
    }

    private String reward;
     public Game(String eventName, String eventDate, String eventTime, String reward){
         super(eventName, eventDate, eventTime);
         this.reward = reward;
     }

     // Overriding the handle event method for the game
    @Override
    public void handleEvent(){
        super.handleEvent();
        System.out.println("This is a game with a reward of " + reward);
    }

}
