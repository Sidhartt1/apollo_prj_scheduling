package com.example.demo;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
public class ApolloPrjSchedulingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApolloPrjSchedulingApplication.class, args);
	}
	
	
	
//	@Scheduled(fixedRate = 1000)
//	public void displayTimeAtFixedRate() //this should be a no argument method
//	{
//		System.out.println("Current date : "+new Date());
//	}
	
//	@Scheduled(fixedRate = 1000,initialDelay = 5000)
//	public void displayTimeAtFixedRate() //this should be a no argument method
//	{
//		System.out.println("Current date : "+new Date());
//	}
	
//	@Scheduled(fixedRateString = "PT02S",initialDelay = 1000)
//	public void displayTimeAtFixedRate() //this should be a no argument method
//	{
//		System.out.println("Current date : "+new Date());
//	}
	
	@Async
	@Scheduled(fixedRate = 2000)
	public void displayAsyncAnnot()
	{
		System.out.println("Hi async scheduling is going on now");
	}
	
	
	
//	@Scheduled(fixedDelay = 1000)
//	public void displayTimeAtFixedDelay() //this should be a no argument method
//	{
//		System.out.println("Current date : "+new Date());
//	}
	
//	@Scheduled(cron = "0 6 22 * * *") //seconds minute hour dayinmonth month dayinweek(So this is the order of cron job)
//	public void displayAtParticularTimeUsingCron()
//	{
//		System.out.println("Hi the cron job has been executed");
//	}

	
	

}
