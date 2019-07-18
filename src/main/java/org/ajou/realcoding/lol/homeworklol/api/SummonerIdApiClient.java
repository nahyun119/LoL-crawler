package org.ajou.realcoding.lol.homeworklol.api;

import org.ajou.realcoding.lol.homeworklol.domain.SummonerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class SummonerIdApiClient { //summoner v4 api를 이용해서 소환사이름을 통해서 id를 얻는 곳
    private final String appid  ="RGAPI-fea5ef13-1848-40fe-9042-88f8439cdbfe";
    private final String summonerIdUrl = "https://kr.api.riotgames.com/lol/summoner/v4/summoners/by-name/{name}?api_key={appid}";


    @Autowired
    RestTemplate restTemplate;

    public SummonerDTO requestSummonerDTO(String summonerName)
    {
        SummonerDTO summonerDTO =  restTemplate.exchange(summonerIdUrl, HttpMethod.GET,null,SummonerDTO.class,summonerName,appid).getBody();
        return summonerDTO;
    }

}

