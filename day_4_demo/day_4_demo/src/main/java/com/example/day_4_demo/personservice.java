package com.example.day_4_demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class personservice
{
    @Autowired
    personrepo pr;
    public person createperson(person p)
    {
        return pr.save(p);
    }
}
