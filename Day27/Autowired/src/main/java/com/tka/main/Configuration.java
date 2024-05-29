package com.tka.main;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan(basePackages = {"com.tka"})
@PropertySource("classpath:myfile.properties")
public class Configuration {

}
