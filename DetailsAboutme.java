package sample;
public class DetailsAboutme {
    public String printName(){
        String Name="Karthik Mohan";
        System.out.println("NAME:"+Name);
        return Name;
    }
    public String printAge(){
        String Age="20";
        System.out.println("AGE:"+"20");
        return Age;
    }
    public String Address(){
        String Address="NEELAGANDAPURAM,ARAKKONAM TALUK,RANIPET-631101";
        System.out.println("ADDRESS:"+Address);
        return Address;

    }


    public static void main(String[] args){
        DetailsAboutme test= new DetailsAboutme();
        test.printName();
        test.printAge();
        test.Address();
    }
}
