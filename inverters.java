class Inverters{
    // Attribute 
    int in_id;
    String in_name;
    String type_name;
    int current;
    int op_voltage;
   
    //Constructor
    Inverters(){
        System.out.println(">>>This is Inverter object Constructed");
    }

//   public void power_rating(int current,int op_voltage) {  //creating Encapsulation
//       int p_rate;
//       p_rate=current*op_voltage;
//     System.out.println(p_rate);
//   }

//Method (Behavior)
void setInverterDetails(int in_id,String in_name,int current,int op_voltage,String type_name){
    this.in_id=in_id;
    this.in_name=in_name;
    this.current=current;
    this.op_voltage=op_voltage;
    this.type_name=type_name;
}

//to read data from Inverter object
void showInverterDetails(){
    System.out.println("       Inverter ID: "+in_id+"  ");
    System.out.println("              Name:\t"+in_name);
    System.out.println("      Power Rating: "+current*op_voltage);
    System.out.println("  Type of Inverter: "+type_name);
    
    System.out.println("--------------------------------");
}
}

public class opInverters{
    public static void main(String[] args)
    {
        Inverters inverter=new Inverters();
       // System.out.println("hashcode:"+inverter);
    //inverter.setInverterDetails(in_id,"Inverter name",current,operating voltage,"type of inverter")
        inverter.setInverterDetails(1,"PCU",5,4,"solar");
        inverter.showInverterDetails();
        
        inverter.setInverterDetails(2,"GTI",6,4,"solar");
        inverter.showInverterDetails();
        
         inverter.setInverterDetails(3,"Zelio",7,4,"solar");
        inverter.showInverterDetails();
        
        inverter.setInverterDetails(4,"Regalia",8,5,"solar");
        inverter.showInverterDetails();
        
         inverter.setInverterDetails(5,"iCruze",5,3,"non solar");
        inverter.showInverterDetails();
        
    }
}

//Output
/*
>>>This is Inverter object Constructed
       Inverter ID: 1  
              Name:	PCU
      Power Rating: 20
  Type of Inverter: solar
--------------------------------
       Inverter ID: 2  
              Name:	GTI
      Power Rating: 24
  Type of Inverter: solar
--------------------------------
       Inverter ID: 3  
              Name:	Zelio
      Power Rating: 28
  Type of Inverter: solar
--------------------------------
       Inverter ID: 4  
              Name:	Regalia
      Power Rating: 40
  Type of Inverter: solar
--------------------------------
       Inverter ID: 5  
              Name:	iCruze
      Power Rating: 15
  Type of Inverter: non solar
--------------------------------

*/
