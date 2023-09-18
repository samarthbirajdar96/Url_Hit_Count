package com.example.countHitApi.Repo;

import com.example.countHitApi.Entity.UserHitCount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class Repo {
    @Autowired
   private List<UserHitCount> gethit;

   public List<UserHitCount> getUserlist(){

       return gethit;
   }

    public void addUsers(UserHitCount u)
    {
        gethit.add(u);
    }
}



