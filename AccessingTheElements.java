import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class AccessingTheElements {
    public static void main(String[] args) {
        List<String> topcompanies=new ArrayList<String>() ;
        System.out.println("is topcompanies list emplty?"+topcompanies.isEmpty());
        topcompanies.add("google");
        topcompanies.add("apple");
        topcompanies.add("microsoft");
        topcompanies.add("facebook");
        System.out.println(topcompanies);
        System.out.println("here are the top "+topcompanies.size()+" "+"companies list in the world");
        String besttopcompany= topcompanies.get(0);
        String Secondbesttopcompany=topcompanies.get(1);
        String lastCompany=topcompanies.get(3);
        System.out.println("besttopcompany :"+besttopcompany);
        System.out.println("secondBestCompany :"+Secondbesttopcompany);
        System.out.println("last Company in the List :"+lastCompany);
        topcompanies.add(3,"walmart");
        System.out.println("the modified list is"+topcompanies);


    }
}
