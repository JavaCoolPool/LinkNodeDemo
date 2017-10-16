package com.easy.scheduler;

import java.text.ParseException;
import java.util.Timer;

import org.quartz.CronTrigger;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;

public class QuartzManager {
	
	  private static String JOB_GROUP_NAME = "DEMO_JOBGROUP_NAME";
	  private static String TRIGGER_GROUP_NAME = "DEMO_TRIGGERGROUP_NAME";

	  
	  @SuppressWarnings({ "unused", "rawtypes" })
	public static void addTast(Scheduler sche,String jobName,Class clz,String time ) throws SchedulerException, ParseException {

		  JobDetail job=new JobDetail(jobName, JOB_GROUP_NAME, clz);
		  CronTrigger  cronTrigger=new CronTrigger(jobName, TRIGGER_GROUP_NAME);
		  cronTrigger.setCronExpression(time);
		  sche.scheduleJob(job, cronTrigger);
		  if(!sche.isShutdown()){
			  sche.start();
		  }
	}
}
