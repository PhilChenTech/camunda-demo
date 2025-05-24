package com.nicenpc.camundademo;

import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.ProcessEngines;
import org.camunda.bpm.engine.runtime.ProcessInstantiationBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/execute/{userId}")
	public void execute(@PathVariable String userId) {
		ProcessEngine engine = ProcessEngines.getDefaultProcessEngine();
		ProcessInstantiationBuilder instance = engine.getRuntimeService().createProcessInstanceByKey("generate-coupon")
			.setVariable("userId", userId); // 傳遞參數給流程
		instance.executeWithVariablesInReturn();
	}
}
