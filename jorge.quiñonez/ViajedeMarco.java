import java.lang.Math;
import java.text.DecimalFormat;
public class ViajedeMarco{
    public static void main(String[] args){

        int Dia;
        double VelocidadDeMarco, TiempoDeMarco, DistanciaTotalDeMarco, DistanciaRecorridaPorMarco, DistanciaEntreEllos;
        double ProbabilidadDeLluvia, ProbabilidadDelMono, ProbabilidadDeLluviaMama;
        double VelocidadDeLaMadre, TiempoDeLaMadre, DistanciaTotalDeLaMadre, DistanciaRecorridaPorLaMadre;
        double ProbabilidadDeIndicacion;

        System.out.println("Marco inicia su viaje en busca de su madre.");
        System.out.println("La madre de Marco se encuentra a 350Km de distancia.");
        System.out.println("");

        Dia = 0;
        DistanciaTotalDeLaMadre = 350;
        DistanciaTotalDeMarco = 0;
        DistanciaEntreEllos = DistanciaTotalDeLaMadre - DistanciaTotalDeMarco;

        System.out.println("DIARIO DEL VIAJE DE MARCO");
        System.out.println("====================================");
        System.out.println("");
        
        while(DistanciaEntreEllos > 0){
            Dia = Dia + 1;

    //La madre---------------------------------------------------
            VelocidadDeLaMadre = (Math.random()*(9-6))+6;
            TiempoDeLaMadre = (Math.random()*(9-6))+6;

            ProbabilidadDeLluviaMama = (Math.random()*(100-0)+0);

            if(ProbabilidadDeLluviaMama <=10){
                VelocidadDeLaMadre = VelocidadDeLaMadre * 0.50;
            }
            else if (ProbabilidadDeLluviaMama <=40){
                VelocidadDeLaMadre = VelocidadDeLaMadre *0.75;
            }


            DistanciaRecorridaPorLaMadre = TiempoDeLaMadre * VelocidadDeLaMadre;
            
            DistanciaTotalDeLaMadre = DistanciaTotalDeLaMadre + DistanciaRecorridaPorLaMadre;

    //Marco-----------------------------------------------------
            VelocidadDeMarco = (Math.random()*(15-10))+10;
            TiempoDeMarco = (Math.random()*(10-8))+8;

            ProbabilidadDeLluvia = (Math.random()*(100-0)+0);

            if(ProbabilidadDeLluvia <=10){
                VelocidadDeMarco = VelocidadDeMarco * 0.25;
            }
            else if (ProbabilidadDeLluvia <=40){
                VelocidadDeMarco = VelocidadDeMarco *0.75;
            }

            ProbabilidadDelMono = (Math.random()*(100-0)+0);

            if(ProbabilidadDelMono <=15){
                TiempoDeMarco = TiempoDeMarco - 2;
            }
            else if(ProbabilidadDelMono <=35){
                VelocidadDeMarco = VelocidadDeMarco * 0.90;
            }
            else if(ProbabilidadDelMono <=15 & ProbabilidadDelMono <=35){
                VelocidadDeMarco = VelocidadDeMarco * 0.90;
                TiempoDeMarco = TiempoDeMarco - 2;
            }

            DistanciaRecorridaPorMarco = TiempoDeMarco * VelocidadDeMarco;
            
            DistanciaTotalDeMarco = DistanciaTotalDeMarco + DistanciaRecorridaPorMarco;

            DistanciaEntreEllos = DistanciaTotalDeLaMadre - DistanciaTotalDeMarco;

            ProbabilidadDeIndicacion = (Math.random()*(100-0)+0);
            
            if(DistanciaEntreEllos < 50 && ProbabilidadDeIndicacion >=50){
                DistanciaEntreEllos = DistanciaEntreEllos - 25;
            }
            
            

//Impresiones de datos-----------------------------------------------------
        
    //Impresiones para Marco-----------------------------------------------
            System.out.println("DIA " + Dia);
            System.out.println("");

            if(ProbabilidadDeLluvia <=10){      
                System.out.println("Este dia llovio muy fuerte");
                System.out.println("");
            }else if(ProbabilidadDeLluvia <=40){
                System.out.println("Hoy me ha llovio un poco");
                System.out.println("");
            }else{
                System.out.println("Hoy hizo un buen dia");
                System.out.println("");
            }

            if(ProbabilidadDelMono <=15){
                System.out.println("Amedio se las piro y tuve que ir a buscarlo");
                System.out.println("");
            }
            else if(ProbabilidadDelMono <=35){
                System.out.println("A Amedio le falta ejercicio, se canso y tuve que cargarlo");
                System.out.println("");
            }
            else if(ProbabilidadDelMono <=15 & ProbabilidadDelMono <=35){
                System.out.println("Hoy Amedio se escapo y se canso, me dio muchos problemas >:/");
                System.out.println("");
            }

            DecimalFormat df = new DecimalFormat("0.00");

            System.out.println("Pude avanzar " + df.format(TiempoDeMarco) + " horas a " + df.format(VelocidadDeMarco) + "Km/h");
            System.out.println("Al final del dia logre recorrer " + df.format(DistanciaRecorridaPorMarco) + "Km" );
            System.out.println("");
            System.out.println("--------------------------------------------------------");
            System.out.println("");

    //Impresiones para la madre--------------------------------------------
            if(ProbabilidadDeLluviaMama <=10){      
                System.out.println("A mi madre le ha llovido muy fuerte");
                System.out.println("");
            }else if(ProbabilidadDeLluviaMama <=40){
                System.out.println("A mi madre le ha llovio un poco");
                System.out.println("");
            }else{
                System.out.println("Fue un buen dia para mi madre");
                System.out.println("");
            }

            DecimalFormat df2 = new DecimalFormat("0.00");

            System.out.println("Hoy mi madre avanzo " + df2.format(TiempoDeLaMadre) + " horas a " + df2.format(VelocidadDeLaMadre) + "Km/h");
            System.out.println("Al final del dia mi madre recorrio " + df2.format(DistanciaRecorridaPorLaMadre) + "Km" );
            System.out.println("");

            if(DistanciaEntreEllos < 50 && ProbabilidadDeIndicacion >=50){
                System.out.println("Marco corrió 25Km mas porque una persona le dijo que vio a su madre");
            }

            if(DistanciaTotalDeLaMadre > DistanciaTotalDeMarco || DistanciaEntreEllos >=0){
                System.out.println(""); 
                System.out.println("La distancia entre nosotros es de " + df2.format(DistanciaEntreEllos) + "Km");
            }          

            System.out.println("========================================================");
        }
        System.out.println("Logre alcanzar a mi madre, estoy muy feliz");
        System.out.println("FIN DEL DIARIO");
        System.out.println("");
    }
}