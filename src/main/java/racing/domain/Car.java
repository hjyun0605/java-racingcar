package racing.domain;

public class Car {

    static final int DEFAULT_POSITION = 1;
    static final int MOVE_THRESHOLD = 4;

    /**
     * 차량번호
     */
    private final String name;
    private int position;

    private Car(String name) {

        this.name = name;
        this.position = DEFAULT_POSITION;
    }

    public static Car of(String name) {

        return new Car(name);
    }

    public void race(int value) {

        if (isMoveValue(value)) {
            position++;
        }
    }

    private boolean isMoveValue(int value) {

        return value >= MOVE_THRESHOLD;
    }

    public int getPosition() {

        return position;
    }

    public String getName() {

        return name;
    }
}