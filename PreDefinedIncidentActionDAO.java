package com.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.model.PreDefinedIncidentAction;



@Repository
public interface PreDefinedIncidentActionDAO {
	public void add(RequestForAction action);
	public RequestForAction findRequest(int id);
	public List<RequestForAction> findAllRequest();
	public boolean updateRequest(RequestForAction action);
	public boolean deleteRequest(RequestForAction action);


}