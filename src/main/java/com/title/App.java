package com.title;  
import java.io.IOException;  
import org.jsoup.Jsoup;  
import org.jsoup.nodes.Document;  

public class App 
{
    public static void main( String[] args )throws IOException
    {
        
        Document doc = Jsoup.connect("http://kavita-ganesan.com").get();  
        String title = doc.title();  
        System.out.println("Title is: " + title);  
    }
}
