package com.web.mq;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ChooseTask {

	
	@Scheduled(cron = "*/2 * * * * *")
	public void task1() {
		System.out.println("任务111111开始了:"+new Date());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("任务111111结束了:"+new Date());
	}
	
	@Scheduled(cron = "*/2 * * * * *")
	public void task2() {
		System.out.println("任务22222开始了:"+new Date());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("任务22222结束了:"+new Date());
	}
}
