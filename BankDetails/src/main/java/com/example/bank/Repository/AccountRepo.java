package com.example.bank.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.bank.Model.Account;

import jakarta.transaction.Transactional;

public interface AccountRepo extends JpaRepository<Account, Integer> 
{
	public List<Account> findBybname(String bname);
	
	@Query(value = "select * from account_details",nativeQuery = true)
	public List<Account> getAllData();
	
	@Query(value = "select * from account_details where bid=:id",nativeQuery = true)
	public List<Account> bybid(@Param("id") int id);
	
	@Query(value="select * from account_details where bid between :start and :end",nativeQuery=true)
	public List<Account> startend(@Param("start") int start,@Param("end") int end);
	
	@Modifying
	@Transactional
	@Query(value = "delete from account_details where bid=?1 and bname=?2",nativeQuery = true)
	Integer deletebyId(@Param("id") int id,@Param("name") String name);
	
	@Modifying
	@Transactional
	@Query(value = "update account_details set bid=:id where bname=:name",nativeQuery = true)
	public void updatebyidname(@Param("id") int id,@Param("name") String name);
	
	//JPQL
	@Query("select s from Account s where s.bname=?1")
	public List<Account> getbybnamej(@Param("bname")String bname);
	
	@Query("select s from Account s where s.bid between ?1 and ?2")
	public List<Account> betweenj(@Param("start")int start,@Param("end")int end);
	
	@Query(value="select s from Account s where s.bname like 'S%'")
	public List<Account> likej();
	
	@Modifying
	@Transactional
	@Query(value="update Account s set s.bname=?1 where s.bid=?2")
	public void updatej(@Param("bname")String bname,@Param("id")int id);
	
	
	@Modifying
	@Transactional
	@Query(value = "delete from Account s where s.bid=?1")
	public void deletej(@Param("bid") int bid);
}
