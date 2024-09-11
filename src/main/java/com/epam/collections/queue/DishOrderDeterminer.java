package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        Queue<Integer> queue = new LinkedList<>();
        int i = 1;
        int counter = 0;
        while (queue.size() < numberOfDishes) {
            if (!queue.contains(i)){
                ++counter;
                if (counter == everyDishNumberToEat){
                    queue.add(i);
                    counter = 0;
                }
            }
            i = i % numberOfDishes + 1;
        }
        return queue.stream().toList();
    }
}
