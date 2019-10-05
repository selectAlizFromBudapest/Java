class Frog{
    // Encapsulation: az alábbi paraméterek elfedése privattal
    private String colour;
    private int id;

    /* Az olyan paramétereknél kell használnom a this kulcszót,
    ahol kettő is van belülük egy classban, és az egyiket az
    instance-ban is használom*/
    public void setColour(String colour){
        this.colour = colour; // A this fejezi ki, hogy a lokális colour paraméter a fenti globálisra vonatkozik.
    }

    public void setId(int id){
        this.id = id;
    }

    // Függvényeknél nem kell használni, de lehet, gondot nem okoz
    public String getColour(){
        return this.colour;
    }

    public int getId(){
        return id;
    }
}

public class SetterAndThis {
    public static void main(String[] args){
        Frog frog1 = new Frog();
        // frog1.id = 1; ez nem fog működni, hiszen az id private, így innen nem érhető el, a setter/getter viszont public, az használható
        frog1.setColour("kék");
        System.out.println("A béka színe: " + frog1.getColour());
    }
}
