package com.example.demo2.repository;

import com.example.demo2.pojo.Project;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Project,Long> {

}
