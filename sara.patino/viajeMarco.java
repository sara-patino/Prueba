import java.lang.Math;
import java.text.DecimalFormat;

public class viajeMarco{
    public static void main(String[] args){

int dia;
double tiempodeMarco, velocidadMarco, distanciaRecorridaMarco,distanciaTotalMarco, distanciaEntreEllos;
double probabilidadLluvia, probabilidadLluviaMama, probabilidadMono;
double tiempoMadre, velocidadMadre,distanciaRecorridaMadre, distanciaTotalMadre;
double probabilidadDeIndicacion;

System.out.println("Marco inicia su viaje");
System.out.println("");
System.out.println("La madre de Marco se encuentra a 350 km de distancia");
System.out.println("");

dia=0;
distanciaTotalMadre=350;
distanciaTotalMarco=0;
distanciaEntreEllos=distanciaTotalMadre-distanciaTotalMarco;
probabilidadLluvia=Math.random();
velocidadMarco=Math.random();


System.out.println("EL DIARIO DE MARCO");
System.out.println("====================");
System.out.println("");

while(distanciaEntreEllos > 0){
    dia=dia +1;

//Madre
velocidadMadre = (Math.random() * (9-6))+6;
tiempoMadre = (Math.random() * (9-6))+6;
probabilidadLluviaMama =(Math.random() * (100-0))+0;

if(probabilidadLluviaMama<=10){
    velocidadMadre = velocidadMadre * 0.50;
}
    else if(probabilidadLluvia<=40){
        velocidadMadre = velocidadMarco - 0.75;
    }

    distanciaRecorridaMadre = velocidadMadre * tiempoMadre;
    distanciaTotalMadre = distanciaTotalMadre + distanciaRecorridaMadre;

//Marco
velocidadMarco = (Math.random() * (15-10))+10;
tiempodeMarco = (Math.random() * (10-8))+8;
probabilidadLluvia = (Math.random() * (100-0))+0;

if(probabilidadLluvia<=10){
    velocidadMarco=velocidadMarco * 0.25;
}
else if(probabilidadLluvia<=40){
    velocidadMarco=velocidadMarco*0.75;
}
//mono
probabilidadMono= (Math.random() * (100-0))+0;

if(probabilidadMono<=15){
    tiempodeMarco=tiempodeMarco-2;
}
else if(probabilidadMono<=35){
    velocidadMarco=velocidadMarco*0.90;

}
else if(probabilidadMono<=15 && probabilidadMono<=35){
    tiempodeMarco=tiempodeMarco-2;
    velocidadMarco=velocidadMarco*0.90;

}

distanciaRecorridaMarco = velocidadMarco * tiempodeMarco;
distanciaTotalMarco = distanciaTotalMarco + distanciaRecorridaMarco;
distanciaEntreEllos = distanciaTotalMadre - distanciaTotalMarco;

probabilidadDeIndicacion = (Math.random() * (100-0)) +0;

if(distanciaEntreEllos<=50 && probabilidadDeIndicacion<=50){
    distanciaEntreEllos=distanciaEntreEllos-25;

}

System.out.println("Dia " + dia);
System.out.println("");

if(probabilidadLluvia<=10){
    System.out.println("Hoy llovió muy fuerte");
    System.out.println("");
}
else if(probabilidadLluvia<=40){
    System.out.println("Hoy llovió normal");
    System.out.println("");
}
else{
    System.out.println("Hoy fue un buen día");
    System.out.println("");
}

if(probabilidadMono<=15){
    System.out.print("Se ha escapado Amedio");
    System.out.println("");
}
else if(probabilidadMono<=35){
    System.out.println("Amedio está cansado y lo tuve que cargar");
    System.out.println("");
}
else if(probabilidadMono<=15 && probabilidadMono<=35){
    System.out.println("Amedio se escapo");
    System.out.println("");
    System.out.println("Amedio se canso y lo tuve que cargar");
    System.out.println("");
}
DecimalFormat df = new DecimalFormat("0.00");


System.out.println("Estuve caminando por " + df.format(tiempodeMarco) + "horas a " + df.format(velocidadMarco) + " km por hora");
System.out.println("Hoy recorrí " + df.format(distanciaRecorridaMadre) + "km y en total he recorrido " + df.format(distanciaTotalMarco) + "km");

if(probabilidadLluviaMama<=10){
    System.out.println("A mammá le tocó lluvia fuerte");
    System.out.println("");
}
else if(probabilidadLluviaMama<=40){
    System.out.println("A mamá le tocó poca lluvia");
    System.out.println("");
}
else{
    System.out.println("El clima estuvo bien para mamá");
    System.out.println("");
}

DecimalFormat df2 = new DecimalFormat("0.00");

System.out.println("Hoy mi madre avanzó " + df2.format(tiempoMadre) + " horas a " + df2.format(distanciaRecorridaMadre) + " km. En total recorrió " + df2.format(distanciaRecorridaMadre) + " km");
System.out.println("");

if(distanciaEntreEllos<=50){
    System.out.println("Alguién me dijo que vió a mamá entonces corri 25km más");
    System.out.println("");
}

if(distanciaTotalMadre>distanciaTotalMadre){
    System.out.println("La distancia entre nosotros es de " + df2.format(distanciaEntreEllos) + " Km");
    System.out.println("");
}
if(distanciaEntreEllos<=0){
    System.out.println("Marco ha encontrado a su madre");
}

    }
}

}