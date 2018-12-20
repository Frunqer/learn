package com.lianjia.test_glz.guava;

import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;

import java.util.List;

/**
 * Created by guiliangzhou on 2017/8/24.
 */
public class Sort {

    public static void main(String[] args) {
        City city1 = new City("Beijing", 100000, 55.0);
        City city2 = new City("Shanghai", 100000, 45.0);
        City city3 = new City("ShenZhen", 100000, 33.8);

        List<City> list = Lists.newArrayList(city1, city2, city3);
        //单参数排序
        Ordering<City> ordering = new Ordering<City>() {
            @Override
            public int compare(City city, City t1) {
                return Double.compare(city.averageRainfall, t1.averageRainfall);
            }
        };

        list = ordering.immutableSortedCopy(list);

        for(City c:list){
            System.out.println(c);
        }
    }


    static class City {
        private String cityName;
        private Integer population;
        private Double averageRainfall;


        public City(String cityName, Integer population, Double averageRainfall) {
            this.cityName = cityName;
            this.population = population;
            this.averageRainfall = averageRainfall;
        }

        public String getCityName() {
            return cityName;
        }

        public void setCityName(String cityName) {
            this.cityName = cityName;
        }


        public Integer getPopulation() {

            return population;
        }

        public void setPopulation(Integer population) {
            this.population = population;
        }

        @Override
        public String toString() {
            return cityName+","+averageRainfall;
        }
    }
}
