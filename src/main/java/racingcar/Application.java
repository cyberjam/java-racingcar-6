package racingcar;

import static camp.nextstep.edu.missionutils.Console.*;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        Car[] cars = generateCars();
        System.out.println("시도할 회수는 몇회인가요?");
        int turnCount = inputTurnCount();
        System.out.println("실행 결과");
    }

    private static int inputTurnCount() {
        String turnCountInput = readLine();
        return Integer.parseInt(turnCountInput);
    }

    private static Car[] generateCars() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String carNamesInput = readLine();

        String[] carNames = carNamesInput.split(",");
        int carCount = carNames.length;

        Car[] cars = new Car[carCount];
        for (int index = 0; index < carCount; index++) {
            cars[index] = new Car(carNames[index], 0);
        }
        return cars;
    }
}
