package scheduler;

import java.text.ParseException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.easy.scheduler.JobDetailDemo;
import com.easy.scheduler.QuartzManager;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:/spring/spring.xml")
public class ScheduleTest {
	
	@Autowired
	private StdSchedulerFactory schedulerFactoryBean;
	
	@Test
	public void Test01() throws Exception {
		System.out.println("任务开始添加进调图++++++++");
		SchedulerFactory factory=new  StdSchedulerFactory();
		Scheduler scheduler = factory.getScheduler();
		String jobName="Test_Job_Name";
		System.out.println("任务开始添加进调图++++++++");
		QuartzManager.addTast(scheduler, jobName, JobDetailDemo.class, "0/3 * * * * ? *");
		System.in.read();
	}
	
	
	@Test
	public void Test02() throws Exception {
		System.out.println("任务开始添加进调图++++++++");
		Scheduler scheduler = schedulerFactoryBean.getScheduler();
		String jobName="Test_Job_Name";
		System.out.println("任务开始添加进调图++++++++");
		QuartzManager.addTast(scheduler, jobName, JobDetailDemo.class, "0/3 * * * * ? *");
		System.in.read();
	}
	
}
