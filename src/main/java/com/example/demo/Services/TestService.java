package com.example.demo.Services;

import com.example.demo.Models.Test;
import com.example.demo.Models.TestNested;
import com.example.demo.Repositories.TestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TestService {

    @Autowired
    private TestRepo testRepo;

    public void addTest(Test test) {
        testRepo.save(test);
    }
}
