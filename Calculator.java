package Calculator_02;

import java.util.ArrayList;

public abstract class Calculator {
    //2 레벨 8번 할 차례
    // 추상클래스 Calculator 만들어 상속 시켜야함

    private ArrayList<Double> data;

    public Calculator() {
        this.data = new ArrayList<>();
    }


    public ArrayList<Double> getData() {
        return data;
    }

    public void addToData(double data) {
        this.data.add(data);
    }

    public void removeData() {
            data.remove(0);
        }
    }