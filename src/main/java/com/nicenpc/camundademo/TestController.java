package com.nicenpc.camundademo;

import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.ProcessEngines;
import org.camunda.bpm.engine.runtime.ProcessInstantiationBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/execute")
	public void execute() {
		ProcessEngine engine = ProcessEngines.getDefaultProcessEngine();
		ProcessInstantiationBuilder instance = engine.getRuntimeService().createProcessInstanceByKey("generate-coupon");
		instance.executeWithVariablesInReturn();
	}
}
