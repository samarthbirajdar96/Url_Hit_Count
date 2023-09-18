package com.example.countHitApi.Service;
import com.example.countHitApi.Entity.UserHitCount;
import com.example.countHitApi.Repo.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UrlHitService {

    @Autowired
    Repo repo;

    public List<UserHitCount> getAllVisitors()
    {
        return  repo.getUserlist();
    }


    public String addVisitor(UserHitCount user) {
        List<UserHitCount> visitorlist = getAllVisitors();
        for(UserHitCount u : visitorlist)
        {
            if(u.getUserName().equals(user.getUserName()))
            {
                u.setCounter(u.getCounter()+1);
                return "count updated";
            }
        }
        visitorlist.add(user);

        return "New User Hit !!!";
    }


    public String getCountOfVisitors() {

        List<UserHitCount> li = getAllVisitors();

        return "Visitors: "+li.size();
    }


    public UserHitCount getAVisitor(String username) {
        List<UserHitCount> visitorlist = getAllVisitors();
        for(UserHitCount u : visitorlist)
        {
            if(u.getUserName().equals(username))
            {
                return u;

            }
        }
        throw new IllegalStateException("UserName not found");
    }

    public String countUpdated(String username) {
        List<UserHitCount> visitorlist = getAllVisitors();
        for(UserHitCount u : visitorlist)
        {
            if(u.getUserName().equals(username))
            {
                u.setCounter(u.getCounter()+1);
                return "Welcome Back";
            }
        }


        return "User not found new User";
    }
}

