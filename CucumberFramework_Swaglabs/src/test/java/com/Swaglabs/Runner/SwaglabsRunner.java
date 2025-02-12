package com.Swaglabs.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\features\\Inventory.feature",
					glue= {"com.Swaglabs.Steps","com.Swaglabs.Hooks"},
					plugin={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class SwaglabsRunner {

}
