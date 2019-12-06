package com.xudcloud.webflux.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Flux;

import java.time.Duration;

class WebFluxDemoApplicationTests {

	@Test
	void contextLoads() {
		Flux.just("hello,world").subscribe(System.out::println);
		Flux.range(10, 10).subscribe(System.out::println);
		Flux.create(sink ->{
			sink.next("Hello");
			sink.next("world");
			sink.complete();
		}).subscribe(System.out::println);
	}

}
