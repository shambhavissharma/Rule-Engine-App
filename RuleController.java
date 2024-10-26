package src.main.java.controller;

import src.main.java.model.Node;
import src.main.java.service.RuleService;

public class RuleController {
    private RuleService ruleService = new RuleService();

    public boolean isUserEligible(String ruleString, int age, int salary) {
        Node ruleAst = ruleService.parseRule(ruleString);
        return ruleService.evaluateRule(ruleAst, age, salary);
    }
}