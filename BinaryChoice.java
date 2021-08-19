public class BinaryChoice implements Choice {
    // public static final enum
    public static final int REP_MODIFY = 2;
    public static final int IQ_MODIFY = 1;
    public static final int FIT_MODIFY = 0;

    // private
    public static final void choice(Person person, String choice1, String choice2, int choice1Value, int choice2Value,
            String responseForChoice1, String responseForChoice2, int type) {
        String response = System.console().readLine();
        switch (type) {
            case REP_MODIFY:
                if (response.equalsIgnoreCase(choice1) || response.contains("1")) {
                    person.setReputation(person.getReputation() + choice1Value);
                    System.out.println(responseForChoice1);

                    if (choice1Value > 0) {
                        TerminalColor.printLine("You've gained " + Math.abs(choice1Value)
                                + " Reputation Points, for a total of " + person.getReputation() + " points!",
                                TerminalColor.GREEN_BRIGHT);
                    } else if (choice1Value == 0) {
                        TerminalColor.printLine("You did not get any Reputation Points. You still have "
                                + person.getReputation() + " points.", TerminalColor.BLUE_BRIGHT);
                    } else {
                        TerminalColor.printLine("You've lost " + Math.abs(choice1Value)
                                + " Reputation Points, for a total of " + person.getReputation() + " points!",
                                TerminalColor.RED_BRIGHT);
                    }
                } else if (response.equalsIgnoreCase(choice2) || response.contains("2")) {

                    person.setReputation(person.getReputation() + choice2Value);
                    System.out.println(responseForChoice2);
                    if (choice2Value > 0) {
                        TerminalColor.printLine("You've gained " + Math.abs(choice2Value)
                                + " Reputation Points, for a total of " + person.getReputation() + " points!",
                                TerminalColor.GREEN_BRIGHT);
                    } else if (choice2Value == 0) {
                        TerminalColor.printLine("You did not get any Reputation Points. You still have "
                                + person.getReputation() + " points.", TerminalColor.BLUE_BRIGHT);
                    } else {
                        TerminalColor.printLine("You've lost " + Math.abs(choice2Value)
                                + " Reputation Points, for a total of " + person.getReputation() + " points!",
                                TerminalColor.RED_BRIGHT);
                    }
                } else {
                    System.out.println("Invalid response. Please type in " + choice1 + "(1), or " + choice2 + "(2)");
                    choice(person, choice1, choice2, choice1Value, choice2Value, responseForChoice1, responseForChoice2,
                            type);
                }
            default:
                break;
        }
    }
}