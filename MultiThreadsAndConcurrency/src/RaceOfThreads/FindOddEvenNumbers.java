package RaceOfThreads;

import java.util.ArrayList;

public class FindOddEvenNumbers implements Runnable{
    private ArrayList<Integer> numberList;
    private ArrayList<Integer> evenNumberList;
    private ArrayList<Integer> oddNumberList;

    public FindOddEvenNumbers(ArrayList<Integer> numberList, ArrayList<Integer> evenNumberList, ArrayList<Integer> oddNumberList) {
        this.numberList = numberList;
        this.evenNumberList = evenNumberList;
        this.oddNumberList = oddNumberList;
    }

    @Override
    public void run() {
        findOddEvenNumber();
    }

    public synchronized void findOddEvenNumber(){
        for(Integer number : numberList) {
            if (number % 2 == 0) {
                evenNumberList.add(number);
            } else {
                oddNumberList.add(number);
            }
        }
    }
}
