package ua.lviv.iot.creativity.manager;

import java.util.List;
import ua.lviv.iot.creativity.model.CreativityGood;
import ua.lviv.iot.creativity.model.Type;

public interface ICreativityManager {

    public void sortByPrice(List<CreativityGood> creativityGood, boolean reverse);

    public List<CreativityGood> sortByName(List<CreativityGood> creativityGood, boolean reverse);

    public List<CreativityGood> findByType(List<CreativityGood> creativityGood, Type type);
}
