package com.koda;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.koda.domain.Journal;
import com.koda.repository.JournalRepository;

@SpringBootApplication
public class SpringBootJournalApplication {

	@Bean
	InitializingBean saveData(JournalRepository journalRepository) {
		return () -> {
			journalRepository.save(new Journal("스프링 부트 입문", "오늘부터 스프링 공부하기 시작했다","03/05/2018"));
			journalRepository.save(new Journal("간단한 스프링 부트 프로젝트", "스프링 부트 프로젝트를 처음 만들어 보았다.","05/05/2018"));
			journalRepository.save(new Journal("스프링 부트 해부", "스프링 부트를 자세히 살펴보았다","09/05/2018"));
			journalRepository.save(new Journal("스프링 부트 클라우드", "클라우드 파운드리를 응용한 스프링 부트를 공부했다","15/05/2018"));
		};
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootJournalApplication.class, args);
	}
}
