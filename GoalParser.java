class GoalParser {
    public String interpret(String command) {
        return command.replace("()","o").replace("(","").replace(")","");
    }
}
