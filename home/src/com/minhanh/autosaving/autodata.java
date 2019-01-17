package com.minhanh.autosaving;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.minhanh.Model.Tour;
import com.minhanh.Model.Tour_DAO;

public class autodata {
	public boolean getdata(String r) throws IOException {
		int i=0;
		Tour tour = new Tour();
		Tour_DAO tour_dao = new Tour_DAO();
		
		Document d = Jsoup.connect(r).timeout(5000).get();
	    // System.out.println(d.html());
        Elements ele = d.select("div.wpb_wrapper");
        //System.out.println(ele);
           for(Element elem : ele) {
        	   
        	   
        	   String nameall = "div.product-details h2";
        	   Elements elements = elem.select(nameall);
        	   for(Element elementName : elements) {
        		   String name = elementName.text();
       		   tour.setTour_name(name);
       		tour_dao.inserttour(tour);
        		   System.out.println(name);
        	   }
        	   
        	   
        	   String gia = "div.product-details>span";
        	   Elements elementss = elem.select(gia);
        	   for(Element elementName : elementss) {
        		   String names = elementName.text();
        		   System.out.println(names);
        		   tour.setTour_price(names);
        		   tour_dao.inserttour(tour);
        	   }
        	  
        	   
        	   String node = "div.product-inner ul";
        	   Elements elementsss = elem.select(node);
        	   for(Element elementName : elementsss) {
        		   String namess = elementName.text();
        		   System.out.println(namess);
        		   tour.setTour_customer_notes(namess);
        		   tour_dao.inserttour(tour);
        	   }
        	   
        	   //img
        	   String img = "div.product-inner>a>img";
        	   Elements elementssss = elem.select(img);
        	   for(Element elementName : elementssss) {
        		   String namesss = elementName.attr("data-lazy-src");
        		   System.out.println(namesss);
       		   tour.setTour_img(namesss);
       		tour_dao.inserttour(tour);
        	   }
        	   
           }
           return false;
      
	}  
	
	public static void main(String[] args) throws IOException {
		autodata a = new autodata();
		a.getdata("http://sinhcafetouronline.com/");
	}
}
