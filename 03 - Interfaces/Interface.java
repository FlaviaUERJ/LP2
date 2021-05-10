
//instrumentos musicais que podem ser tocados

interface Playable {
     void play(int note) ;  
     void adjust(int tuner);

}

class Wind implements Playable{
     public void play(int note) {  
     //tocar nota musical
    }
     public void adjust(int tuner){
     //ajustar instrumento
    }
}

class Percussion implements Playable{
     public void play(int note) {  
     //tocar nota musical
    }
     public void adjust(int tuner){
     //ajustar instrumento
    }
}

class Stringed implements Playable{
      public void play(int note) {  
      //tocar nota musical
    }
      public void adjust(int tuner){
      //ajustar instrumento
    }
}

/**********************************************************************************/

//Eletrodomesticos ligáveis e desligáveis

interface Pluggable {
     void turnOn();
     void turnOff();
}

class Microwave implements Playable{
     public void turnOn(int n) {  
     return n;
    }
     public void turnOff(int n){
     return n;
    }
}

class TV implements Playable{
    public void turnOn(int n) {  
     return n;
    }
     public void turnOff(int n){
     return n;
    }
}

class Radio implements Playable{
      public void turnOn(int n) {  
     return n;
    }
     public void turnOff(int n){
     return n;
    }
}