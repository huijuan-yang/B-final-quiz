package com.thoughtworks.capability.gtb.entrancequiz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// TODO GTB-知识点: * 需要了解下三层(Three Layer)架构
// TODO GTB-知识点: * 没有使用数据库，对JPA的使用无法考察
// TODO GTB-完成度: * 部分接口缺失，部分接口实现不符合要求，所有接口无法正常使用，且没有使用数据库保存数据
// TODO GTB-综合: * 完成度很有问题，工程实践有很多小问题需要注意，知识点运用相对好些，继续加油
@SpringBootApplication
public class GtbEntranceQuizApplication {

	public static void main(String[] args) {
		SpringApplication.run(GtbEntranceQuizApplication.class, args);
	}

}
