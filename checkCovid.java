class omnivore{
    // Attribute 
    
    String disease_name;
    String person_name;
    
    //Constructor
    omnivore(){
        System.out.println("check person has a omnivore covid disease");
    }
void setCovidDetails(String disease_name,String person_name){
    this.disease_name=disease_name;
    this.person_name=person_name;
}
void showCovidDetails(){
    
    System.out.println("     covid or not:\t"+disease_name);
    System.out.println("     Person name : "+person_name);
    System.out.println("--------------------------------");
}
}

public class checkCovid{
    public static void main(String[] args)
    {
        omnivore covid=new omnivore();    
        covid.setCovidDetails("covid","Gaurav");
        covid.showCovidDetails();
       
    }
}


//Output
/*
check person has a omnivore covid disease
     covid or not:	covid
     Person name : Gaurav
--------------------------------
*/
