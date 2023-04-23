package com.example.database2prac.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.database2prac.Eg.Main;
import com.example.database2prac.Repository.PracRepository;


@Service
public class PracService {

	@Autowired
	public PracRepository mser;
	public Main saveInfo(Main m)
	{
		return mser.save(m);
	}
	
}
