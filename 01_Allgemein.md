````java
class Person{
    private String name;
    protected int id;

    public Person(String name){
        this.name = name;

        //ToDo Id generieren

    }

    public getName(){
        return name;
    }
}

class Schueler extends Person {
    private String email;

    public Schueler(String name){
        super(name);
        email(null);
    }

    public Schueler(String name, String email){
        this(name);
        this.email = email;
    }
}
````

````C
void setup ()
{
    attach Interrupt(digitalPinToInterrupt(T_Stopp),ISR_Stopp,FALLING);
}
TimerInterrupt
static HardwareTimer t_blink = HardwareTimer(TIM2);
````