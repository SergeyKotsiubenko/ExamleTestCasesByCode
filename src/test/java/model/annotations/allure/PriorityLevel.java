package model.annotations.allure;

public enum PriorityLevel {

     CRITICAL("critical"),
     NORMAL("normal"),
     LOW("low"),
     BLOCKER("blocker");

    private String value;

    PriorityLevel(final String v) {
        value = v;
    }

    public String value() {
            return value;
        }

        @Override
        public String toString()  {
            return value;
        }

}
