package org.ajou.realcoding.lol.homeworklol.domain;


import lombok.Data;

import java.util.List;
import java.util.Set;

@Data
public class LeagueDTO {
    private Set<LeagueEntryDTO> leagues;

    @Data
    public static class LeagueEntryDTO {
        private String queueType;
        private String summonerName;
        private boolean hotStreak;
        private Set<MiniSeriesDTO> miniSeries;
        private int wins;
        private boolean veteran;
        private int losses;
        private String rank;
        private String leagueId;
        private boolean inactive;
        private boolean freshBlood;
        private String tier;
        private String summonerId;
        private int leaguePoints;

    }
    @Data
    public static class MiniSeriesDTO {
        private String progress;
        private int losses;
        private int target;
        private int wins;
    }


}
