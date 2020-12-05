package com.lti.ComparatorComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by busis on 2020-12-05.
 */
public class NewMovie {
    private int relyear;
    private String Name;

    NewMovie(int year, String Name){
        this.relyear=year;
        this.Name=Name;
    }
    /*@Override
    public int compareTo(Movie o) {
        //Since in the class definition,we wrote that the comparator with
        //this is another movie, we need to do it with o
        return this.getRelyear() - o.getRelyear();
        //Swap in bubble sort if return <0;
    }*/
    //THis isn't required here

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

class Comparison2{
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<Movie>();
        movies.add(new Movie(2012,"SSR"));
        movies.add(new Movie(2013,"SaR"));
        movies.add(new Movie(2010,"SbR"));
        Collections.sort(movies, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
               return o1.getName().compareToIgnoreCase(o2.getName());
            }//Swap if o1 is greater than o2
        });
        Collections.sort(movies, new NameCompare());
        Collections.reverse(movies);
        for(Movie movie:movies){
            System.out.println(movie.getRelyear()+" "+movie.getName());
        }
    }
}
class NameCompare implements Comparator<Movie>{

    @Override
    public int compare(Movie o1, Movie o2) {
        return o1.getName().compareToIgnoreCase(o2.getName());
    }
}

class YearCompare implements Comparator<Movie>{
    @Override
    public int compare(Movie o1, Movie o2) {
        return o1.getRelyear()-o2.getRelyear();
    }
}

