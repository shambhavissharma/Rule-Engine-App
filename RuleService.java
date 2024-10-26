package src.main.java.service;

import src.main.java.model.Node;

public class RuleService {

    // Parses a rule string into an AST
    public Node parseRule(String ruleString) {
        // Example of hard-coded conditions for the AST
        Node ageCondition = new Node("operand", null, null, "age > 30");
        Node salaryCondition = new Node("operand", null, null, "salary > 50000");
        return new Node("operator", ageCondition, salaryCondition, "AND");
    }

    // Evaluates the AST against user data
    public boolean evaluateRule(Node root, int age, int salary) {
        if (root.getType().equals("operand")) {
            if (root.getValue().equals("age > 30")) return age > 30;
            if (root.getValue().equals("salary > 50000")) return salary > 50000;
        } else if (root.getType().equals("operator") && root.getValue().equals("AND")) {
            return evaluateRule(root.getLeft(), age, salary) && evaluateRule(root.getRight(), age, salary);
        }
        return false;
    }
}
