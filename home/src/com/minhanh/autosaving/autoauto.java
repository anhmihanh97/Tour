package com.minhanh.autosaving;
import java.io.File;
import java.io.IOException;
 
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
public class autoauto {
	 public static void main(String[] args) throws IOException {
		 autodata a = new autodata();
	 a.getdata("http://sinhcafetouronline.com/");
	 }        
}
