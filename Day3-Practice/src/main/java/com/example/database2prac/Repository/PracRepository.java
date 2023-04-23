package com.example.database2prac.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.database2prac.Eg.Main;

public interface PracRepository extends JpaRepository<Main,Integer> {

}
