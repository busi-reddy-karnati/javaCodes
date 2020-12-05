package com.lti.ComparatorComparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by busis on 2020-12-05.
 */
public class Movie implements Comparable<Movie>{
    private int relyear;
    private String Name;

    Movie(int year, String Name){
        this.relyear=year;
        this.Name=Name;
    }
    @Override
    public int compareTo(Movie o) {
        //Since in the class definition,we wrote that the comparator with
        //this is another movie, we need to do it with o
        return this.getRelyear() - o.getRelyear();//Only one comparision
        //Wither year or name not both. IF you want both, use comparator
        //Swap in bubble sort if return <0;
    }

    public int getRelyear() {
        return relyear;
    }

    public void setRelyear(int relyear) {
        this.relyear = relyear;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}

class Comparison{
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<Movie>();
        movies.add(new Movie(2012,"SSR"));
        movies.add(new Movie(2013,"S3R"));
        movies.add(new Movie(2010,"S4R"));
        Collections.sort(movies);
        //TO enable this sorting, we implement comparable class
        //The criteria is relYear
        for(Movie movie:movies){
            System.out.println(movie.getRelyear()+" "+movie.getName());
        }
    }
}