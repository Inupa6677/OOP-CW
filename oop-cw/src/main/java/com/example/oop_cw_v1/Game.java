package com.example.oop_cw_v1;

import java.time.LocalDateTime;
import java.util.Date;

public class Game extends MainSchedule {
    private int reward;


    public Game(String scheduleId, String scheduleName, String scheduleLocation, String scheduleDescription, Date scheduleDate, LocalDateTime scheduleTime, int reward) {
        super(scheduleId, scheduleName, scheduleLocation, scheduleDescription, scheduleDate, scheduleTime);
        this.reward = reward;
    }

    public int getReward() {
        return reward;
    }

    public void setReward(int reward) {
        this.reward = reward;
    }
}
