package org.spring.springboot.repository;

import org.spring.springboot.domain.City;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * ES 操作类
 * <p>
 * Created by by wh on 20/06/2017.
 */
public interface CityRepository extends ElasticsearchRepository<City, Long> {

}
