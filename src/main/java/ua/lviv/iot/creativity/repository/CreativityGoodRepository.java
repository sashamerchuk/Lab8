package ua.lviv.iot.creativity.repository;

import org.springframework.data.repository.CrudRepository;

import ua.lviv.iot.creativity.model.CreativityGood;

public interface CreativityGoodRepository<T extends CreativityGood> extends CrudRepository<T,Integer> {

}
