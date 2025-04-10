
class College{
    String name;
    int percentage;
    void geteligibility(String name,int percentage){
        this.name=name;
        this.percentage=percentage;
    }
}
class UG extends College{
    void geteligibility(String name,int percentage){
        if (percentage>=60){
            System.out.println(name+" is eligible");
        }
        else{
            System.out.println(name+" is not eligible");
        }
    }
}
class PG extends College{
    void geteligibility(String name,int percentage){
        if (percentage>=70){
            System.out.println(name+" is eligible");
        }
        else{
            System.out.println(name+" is not eligible");
        }
    }
}
class poly2{
    public static void main(String[] args){
        UG ug=new UG();
        ug.geteligibility("Person-1",40);
        PG pg=new PG();
        pg.geteligibility("Person-2",80);
    }
}
