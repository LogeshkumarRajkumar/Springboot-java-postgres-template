package com.example.demo.Repositories;

import com.example.demo.Models.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("testRepo")
public interface TestRepo extends JpaRepository<Test, Integer> {

}
