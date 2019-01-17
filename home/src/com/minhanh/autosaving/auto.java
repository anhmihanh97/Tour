//package com.minhanh.autosaving;
//
//import org.jsoup.Connection;
//import org.jsoup.Jsoup;
//import org.jsoup.nodes.Document;
//import org.jsoup.nodes.Element;
//import org.jsoup.select.Elements;
//
//import com.minhanh.Model.Tour;
//
//public class auto {
//	public static int getTourData(String URL, String place) {
//        int i = 0;
//        try {
//            Tour tour = new Tour();
//            	
//            
//            Connection conn = (Connection) Jsoup.connect(URL);
//            Document doc = conn.get();
//            String cssQuery = ".main-content>.hotel-itm";
//            Elements elements = doc.select(cssQuery);
//            
//            for (Element element : elements) {
//                //Lay link
//                String cssLink = ".ks-info>h3>a";
//                Element elementLink = element.select(cssLink).first();
//            
//                 Document hotelDoc = Jsoup.connect("http://sinhcafetouronline.com/").get();
//                 System.out.println(hotelDoc.html());
//
//                //Tên
//                String cssName = ".ks-title>h1";
//                Element elementName = hotelDoc.select(cssName).first();
//                String tour_name = elementName.text();
//                tour.setTour_name(tour_name);
//
//                //gia 
//                String cssAddress = ".hotel-address";
//                Element elementAddress = hotelDoc.select(cssAddress).first();
//                String Tour_price = elementAddress.text();
//                tour.setTour_price(Tour_price);
//
//                //anh
//                String cssImg = ".ks-images>.img-col-1>a";
//                Element elementImg = hotelDoc.select(cssImg).first();
//                String Tour_img = elementImg.attr("href");
//                tour.setTour_img(Tour_img);
//
//                //Chi tiet
//                String Tour_customer_notes = "";
//                String cssDetail = ".tong-quan>.mo-ta>.content>p";
//                Elements elementDetail = hotelDoc.select(cssDetail);
//                if (elementDetail.size() > 0) {
//                    for (Element elementDetailContent : elementDetail) {
//                    	Tour_customer_notes += elementDetailContent.text() + " ";
//                    }
//                }
//               tour.setTour_customer_notes(Tour_customer_notes);
//
//            
//            }
//        } catch (Exception ex) {
//            
//        }
//        return i;
//    }
//    
//    
//    public static List<PlaceData> getPlaceData() {
//        List<PlaceData> listPlaceData = new ArrayList<>();
//        try {
//            
//            String URL = "http://khachsan24gio.vn/";
//            Connection conn = Jsoup.connect(URL);
//            Document doc = conn.get();
//            String cssQuery = ".place-links>.row>.col-xs-6";
//            Elements elements = doc.select(cssQuery);
//            for (Element element : elements) {
//                PlaceData placeData = new PlaceData();
//                String cssPlace = "a";
//                Element place = element.select(cssPlace).first();
//                String place_name = place.text();
//                place_name = place_name.substring(10, place_name.length());
//                String place_url = place.attr("href");
//                placeData.setPlace_name(place_name);
//                placeData.setPlace_url(place_url);
//                listPlaceData.add(placeData);
//            }
//        } catch (Exception ex) {
//            
//        }
//        return listPlaceData;
//    }
//    
//    public static int checkKindName(String kind_name) {
//        KindOfRoomModel kindOfRoomModel = new KindOfRoomModel();
//        int kind_id = kindOfRoomModel.getKindIdByKindName(kind_name);
//        if (kind_id == -1) {
//            KindOfRoom kindOfRoom = new KindOfRoom();
//            kindOfRoom.setKind_name(kind_name);
//            kindOfRoomModel.addKindOfRoom(kindOfRoom);
//            kind_id = kindOfRoomModel.getKindIdByKindName(kind_name);
//        }
//        return kind_id;
//    }
//
//    public static int checkPlaceName(String place_name) {
//        PlaceModel placeModel = new PlaceModel();
//        int place_id = placeModel.getPlaceIdByPlaceName(place_name);
//        if (place_id == -1) {
//            Place place = new Place();
//            place.setPlace_name(place_name);
//            placeModel.addPlace(place);
//            place_id = placeModel.getPlaceIdByPlaceName(place_name);
//        }
//        return place_id;
//    }
//    public static void main(String[] args) {
//		getTourData("", place);
//	}
//}
