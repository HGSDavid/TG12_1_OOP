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

void setup ()
{
    t_blink.attachInterrupt(ISR_Blink);
}

void loop()
{
    switch (Zustand)
    {
        case Stopp:
        digitalWrite(MH,0);
        digitalWrite(MR,0);
        digitalWrite(LED_R,0);  //alternativ nur GPIOC->ODR=0;
        if (digitalRead(TH)==0)
        {
            Zustand = Hoch;
        }
        if (digitalRead(TR)==0)
        {
            Zustand=Runter;
        }
        break;

        case Runter:
        digitalWrite(MR,1);
        digitalWrite(MH,0);
        Blinken();
        if (digitalRead(TH)==0)
        {
            Zustand=Hoch;
        }
        break;

        case Hoch:
        digitalWrite(MR,0);
        digitalWrite(MH,1);
        if (digitalRead(TR)==0)
        {
            Zustand=Runter
        }
        break;
    }
}

void ISR_Stopp()
{
    Zustand=Stopp;
}

void Blinken()
{
    t_blink.resume;     //Timer2 starten
}

//Timeranweisungen
//t_blink.setOverflow(1000,MICROSEC_FORMAT)
//t_blink.setPrescaleFactor(50);

void ISR_Blink()
{
    digitalToggle(LED_R);
}

t_blink.pause;          //Timer2 stoppen
````