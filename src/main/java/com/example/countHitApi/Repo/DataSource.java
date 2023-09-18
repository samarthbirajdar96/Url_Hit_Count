package com.example.countHitApi.Repo;

import com.example.countHitApi.Entity.UserHitCount;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;
@Configuration
public class DataSource {

        @Bean
        List<UserHitCount> datauserhit(){
            return new ArrayList<>();
        }

    }

