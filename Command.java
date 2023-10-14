public enum Command {
    GO ("Идти"),
    STOP ("Остановиться"),
    RUN_AWAY ("Убегать"),
    COME_UP("Подходить"),
    LIE ("Лежать"),
    JUMP("Прыгать"),
    STAND_UP("Стоять"),
    SIT_DOWN("Садиться");

    private String comName;
    Command(String comName){
        this.comName = comName;
    }

    @Override
    public String toString() {
        return "Умеет " + comName;
    }

    public static Command[] getDomesticComands() {
        return new Command[]{GO, STAND_UP, JUMP, COME_UP, STOP, SIT_DOWN};
    }

    public static Command[] getBaggageComands() {
        return new Command[]{GO, STAND_UP, STOP, RUN_AWAY, LIE};
    }
}
