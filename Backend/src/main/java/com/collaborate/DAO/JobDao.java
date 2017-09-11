package com.collaborate.DAO;

import java.util.List;

import com.collaborate.Model.Job;

public interface JobDao {

	public boolean createJob(Job job);
	public Job getJobdetails(int jobId);
	public List<Job> getJob();
	public boolean approveJob(Job job);
	public boolean editJob(int JobId);
	public boolean deleteJob(int JobId);
}






