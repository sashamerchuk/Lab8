package ua.lviv.iot.creativity.manager;

import ua.lviv.iot.creativity.model.CreativityGood;
import ua.lviv.iot.creativity.model.Type;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CreativityManager implements ICreativityManager {

    public CreativityManager() {

    }

    @Override
    public void sortByPrice(List<CreativityGood> creativityGood, boolean reverse) {
        if (reverse) {
            Collections.sort(creativityGood, Comparator.comparing(CreativityGood::getPrice).reversed());
        }else{
            Collections.sort(creativityGood, Comparator.comparing(CreativityGood::getPrice));
    }
    }

    @Override
    public List<CreativityGood> sortByName(List<CreativityGood> creativityGood, boolean reverse) {
        if(reverse) {
            Collections.sort(creativityGood, Comparator.comparing(CreativityGood::getName).reversed());
        }else {
            Collections.sort(creativityGood, Comparator.comparing(CreativityGood::getName));
        }
        return creativityGood;
        }

    @Override
    public List<CreativityGood> findByType(List<CreativityGood> creativityGood, Type type) {
        List<CreativityGood> findCreativityGoodsList = creativityGood.stream()
                .filter(creativitygood -> creativitygood.getType() == type).collect(Collectors.toList());
        return findCreativityGoodsList;
    }

}
