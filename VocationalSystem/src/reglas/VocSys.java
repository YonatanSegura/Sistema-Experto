package reglas;

import com.sun.xml.internal.fastinfoset.algorithm.UUIDEncodingAlgorithm;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.UUID;

public class VocSys {

    public static void main(String[] args) {
        SE sistema = new SE();
        String r1 = "", r2 = "", rMicro = "", rDoc = "", resultadosNumero = "", N1 = "", N2 = "", N3 = "", N4 = "", N5 = "", N6 = "", N7 = "", N8 = "", N9 = "", N10 = "";
        String resultado = getRespuesta("¿Qué materia te intesa más? \n 1.- Bacterias y patógenos \n 2.- Relaciones Numericas");
        String  rAnantomia="", rEnfermedades="";
        //String resultado = getRespuesta("¿Qué materia te intesa más? \n 1.- Bacterias y patógenos \n 2.- Relaciones Numericas \n 3.- Modelado y diseño \n 4.-Software");

        if (resultado.contains("1")) {//Bacterias y patógenos
            r1 = sistema.obtenerDatosInteres(Variables.SI, Variables.NO, Variables.NO, Variables.NO);
            String resultadoBacterianas = getRespuesta("Que te interesa? \n 1.- Microbiologia y Parasitologia \n 2.- Anatomia y Fisiologia \n 3.- Conocer sobre Enfermedades");


            //---------------Microbiologia y PARASITOLOGIA TERMINADO ----------------------------
            if (resultadoBacterianas.contains("1")) {
                r2 = sistema.obtenerDatosBacterianas(Variables.SI, Variables.NO, Variables.NO);

                String resultadoMicro = getRespuesta("Que te interesa \n" +
                        "1- Clasificación, estructura y replicación de virus\n" +
                        "2- Clasificación, estructura y multiplicación de hongos\n" +
                        "3- Clasificación, estructura y crecimiento de parásitos\n" +
                        "4- Flora microbiana comensal y patógena\n" +
                        "5- Esterilización, desinfección y antisepsia\n");

                if (resultadoMicro.contains("1")) { //Clasificación, estructura y replicación de virus
                    rMicro = sistema.obtenerMicro(Variables.SI, Variables.NO, Variables.NO, Variables.NO, Variables.NO);

                    String resultadoDoc = getRespuesta("Que te interesa \n 1- Deteccion de Enfermedades \n" +
                            " 2- Curacion de Heridas \n 3- Cirujias");

                    if (resultadoDoc.contains("1")) {
                        rDoc = sistema.obtenerDoc(Variables.SI, Variables.NO, Variables.NO);
                    } else if (resultadoDoc.contains("2")) {
                        rDoc = sistema.obtenerDoc(Variables.NO, Variables.SI, Variables.NO);
                    } else if (resultadoDoc.contains("3")) {
                        rDoc = sistema.obtenerDoc(Variables.NO, Variables.NO, Variables.SI);
                    }

                    printCarrera(rDoc);

                } else if (resultadoMicro.contains("2")) { //Clasificación, estructura y multiplicación de hongos
                    rMicro = sistema.obtenerMicro(Variables.NO, Variables.SI, Variables.NO, Variables.NO, Variables.NO);

                    printCarrera(rMicro);

                } else if (resultadoMicro.contains("3")) { //Clasificación, estructura y crecimiento de parásitos
                    rMicro = sistema.obtenerMicro(Variables.NO, Variables.NO, Variables.SI, Variables.NO, Variables.NO);

                    printCarrera(rMicro);

                } else if (resultadoMicro.contains("4")) { //Flora microbiana comensal y patógena
                    rMicro = sistema.obtenerMicro(Variables.NO, Variables.NO, Variables.NO, Variables.SI, Variables.NO);

                    printCarrera(rMicro);

                } else if (resultadoMicro.contains("5")) { //Esterilización, desinfección y antisepsia
                    rMicro = sistema.obtenerMicro(Variables.NO, Variables.NO, Variables.NO, Variables.NO, Variables.SI);

                    String resultadoDoc = getRespuesta("Que te interesa \n" +
                            "1- Deteccion de Enfermedades \n" +
                            "2- Curacion de Heridas \n" +
                            "3- Cirujias");

                    if (resultadoDoc.contains("1")) {
                        rDoc = sistema.obtenerDoc(Variables.SI, Variables.NO, Variables.NO);
                    } else if (resultadoDoc.contains("2")) {
                        rDoc = sistema.obtenerDoc(Variables.NO, Variables.SI, Variables.NO);
                    } else if (resultadoDoc.contains("3")) {
                        rDoc = sistema.obtenerDoc(Variables.NO, Variables.NO, Variables.SI);
                    }

                    printCarrera(rDoc);
                }

                //--------------TERMINA CON CARRERAS --------------------

            } else if (resultadoBacterianas.contains("2")) { //Fisiologia
                r2 = sistema.obtenerDatosBacterianas(Variables.NO, Variables.SI, Variables.NO);

                String resultadoAnatomia = getRespuesta("Que te interesa \n" +
                        "1- Atencion a Animales \n" +
                        "2- Enfermedades Humanas \n" +
                        "3- El sistema musculoesquelético");

                if(resultadoAnatomia.contains("1")){
                    rAnantomia = sistema.obtenerAnantomia(Variables.SI,Variables.NO,Variables.NO);
                } else if (resultadoAnatomia.contains("2")){
                    rAnantomia = sistema.obtenerAnantomia(Variables.NO,Variables.SI,Variables.NO);
                } else if (resultadoAnatomia.contains("3")) {
                    rAnantomia = sistema.obtenerAnantomia(Variables.NO,Variables.NO,Variables.SI);
                }

                printCarrera(rAnantomia);

                //--------------TERMINA CON CARRERAS --------------------

            } else if (resultadoBacterianas.contains("3")) { //Enfermedades
                r2 = sistema.obtenerDatosBacterianas(Variables.NO, Variables.NO, Variables.SI);
                String resultadoEnfermedades = getRespuesta("Que te interesa \n" +
                        "1- Enfermedades en general \n" +
                        "2- Salud bucal \n" +
                        "3- Nutricion y estilos de alimentacion humana \n" +
                        "4- Higiene, Seguridad  y medicina preventiva");

                if(resultadoEnfermedades.contains("1")){
                    rEnfermedades = sistema.obtenerEnfer(Variables.SI,Variables.NO,Variables.NO,Variables.NO);
                } else if (resultadoEnfermedades.contains("2")){
                    rEnfermedades = sistema.obtenerEnfer(Variables.NO,Variables.SI,Variables.NO,Variables.NO);
                } else if (resultadoEnfermedades.contains("3")) {
                    rEnfermedades = sistema.obtenerEnfer(Variables.NO,Variables.NO,Variables.SI,Variables.NO);
                } else if (resultadoEnfermedades.contains("4")) {
                    rEnfermedades = sistema.obtenerEnfer(Variables.NO,Variables.NO,Variables.NO,Variables.SI);
                }

                printCarrera(rEnfermedades);


            }

            //System.out.println("El resultado de bacteriana es: "+ r2);
            ///Relaciones numéricas
        } else if (resultado.contains("2")) {
            r1 = sistema.obtenerDatosInteres(Variables.NO, Variables.SI, Variables.NO, Variables.NO);
            resultadosNumero = getRespuesta("¿Qué te interesa más? \n 1.- Análisis de estructuras, topología, matemática y física \n 2.- Crear sistemas informáticos ");
            switch (resultadosNumero) {
                case "1":
                    ///Análisis de estructuras, topología, matemática y física
                    N1 = sistema.obtenerResultadosRelacionesNum(Variables.SI, Variables.NO);
                    System.out.println(N1);
                    //dice resultN2 pero en realidad es 9 lo que pasa es que lo dejé para el final hay que ver el diagrama
                    String resultN2 = getRespuesta("¿Te gustaría?: \n 1.- crear Driagramas para la creacion de infra estructura \n 2.- crear estudios para crear infraesturcturas");
                    switch (resultN2) {
                        case "1":
                            N8 = sistema.getN8(Variables.SI, Variables.NO);

                            printCarrera(N8);

                            break;
                        case "2":
                            N8 = sistema.getN8(Variables.SI, Variables.NO);
                            System.out.println(N8);
                            String resultado9 = getRespuesta("¿Te gustaría?: \n 1.-Te interesa el dibujo aplicado a la cartografia \n 2.-Te interesa el dibujo para realizar labore generales");
                            switch (resultado9) {
                                case "1":
                                    N9 = sistema.getN9(Variables.SI, Variables.NO);
                                    System.out.println(N9);
                                    String resultado10 = getRespuesta("¿Te gustaría?: \n 1.- Te interesa el dibujo aplicado a la cartografia \n 2.- Te interesa el dibujo para realizar labore generales");
                                    switch (resultado10) {
                                        case "1":
                                            N10 = sistema.getN10(Variables.SI, Variables.NO);
                                            break;
                                        case "2":
                                            N10 = sistema.getN10(Variables.SI, Variables.NO);
                                            break;
                                    }

                                    printCarrera(N10);

                                    break;

                                case "2":
                                    N9 = sistema.getN9(Variables.SI, Variables.NO);

                                    printCarrera(N9);

                                    break;
                            }
                            break;
                    }
                    break;

                case "2":
                    ///Crear sistemas informáticos
                    N1 = sistema.obtenerResultadosRelacionesNum(Variables.NO, Variables.SI);
                    System.out.println(N1);
                    String resultadoN2 = getRespuesta("¿Qué te interesa?: \n 1.- Crear programas para computadores \n 2.- Crear sistemas Hardware");
                    switch (resultadoN2) {
                        case "1"://Crear programas para computadora
                            N2 = sistema.getN2(Variables.SI, Variables.NO);
                            System.out.println(N2);
                            String resultadoN3 = getRespuesta("¿Qué te interesa más?  \n 1.- Aprender sobre Redes de telecomunicaciones \n 2.- Programar una computadora para que siga ordenes");
                            switch (resultadoN3) {
                                case "1"://Aprender sobre Redes de telecomunicaciones
                                    N3 = sistema.getN3(Variables.SI, Variables.NO);
                                    ///aquí termina el test

                                    printCarrera(N3);

                                    break;
                                case "2"://Programar una computadora para que siga ordenes
                                    N3 = sistema.getN3(Variables.NO, Variables.SI);
                                    System.out.println(N3);
                                    String resultadoN4 = getRespuesta("Elige una opción:\n 1.- Conocer hardware a nivel básico \n 2.-Enfocarte solo en software");
                                    switch (resultadoN4) {
                                        case "1"://Conocer hardware a nivel básico
                                            N4 = sistema.getN4(Variables.SI, Variables.NO);
                                            System.out.println(N4);
                                            String resultadoN5 = getRespuesta("Elige una opción:\n 1.- Te gustaria estudiar sobre: programacion basica,harware basico y la documentacion corespondiente \n 2.-te gustaria realizar harware y programar software en un nivel superior.");
                                            switch (resultadoN5) {
                                                case "1":
                                                    N5 = sistema.getN5(Variables.SI, Variables.NO);
                                                    break;
                                                case "2":
                                                    N5 = sistema.getN5(Variables.NO, Variables.SI);
                                                    ///Fin del primer Hilo
                                                    break;
                                            }
                                            printCarrera(N5);
                                            break;
                                        case "2": //Enfocarte solo en software
                                            N4 = sistema.getN4(Variables.NO, Variables.SI);
                                            printCarrera(N4);
                                            break;

                                    }
                                    break;

                            }
                            break;
                        case "2": //Crear sistemas hardware
                            N2 = sistema.getN2(Variables.NO, Variables.SI);
                            System.out.println(N2);
                            String resultadoN6 = getRespuesta("Elige una opción:\n 1.-Te gustaria brindar mantenimiento a aparatos electrónicos \n 2.-Te gustaría crear sistemas electrónicos o modificar existentes");
                            switch (resultadoN6) {
                                case "1":
                                    N6 = sistema.getN6(Variables.SI, Variables.NO);
                                    printCarrera(N6);
                                    break;
                                case "2":
                                    N6 = sistema.getN6(Variables.SI, Variables.NO);
                                    System.out.println(N6);
                                    String resultado7 = getRespuesta("Elige una opción:\n 1.-te gustaria saber sobre tecnologia,componentes electricos y electronicos \n 2.- me interesa unicamente saber  todo sobre electricidad.\n");
                                    switch (resultado7) {
                                        case "1":
                                            N7 = sistema.getN7(Variables.SI, Variables.NO);
                                            break;
                                        case "2":
                                            N7 = sistema.getN7(Variables.NO, Variables.SI);
                                            break;
                                    }

                                    printCarrera(N7);

                                    break;
                            }
                            break;

                    }
                    break;


                default:
                    System.out.println("Ninguna opción coherente seleccionada");
                    break;
            }


        } else if (resultado.contains("3")) {//Modelado y diseño
            r1 = sistema.obtenerDatosInteres(Variables.NO, Variables.NO, Variables.SI, Variables.NO);

        } else if (resultado.contains("4")) {///Creacion de programas digitales
            r1 = sistema.obtenerDatosInteres(Variables.NO, Variables.NO, Variables.NO, Variables.SI);

        }
        //System.out.printf(r1);

    }

    private static void printCarrera(String resp){

        System.out.println("*----------------------------------*");
        System.out.println("Tu carrera recomendada es: " + resp);
        System.out.println("*----------------------------------*");

    }

    private static String getRespuesta(String pregunta) {
        String respuesta = "";
        System.out.println(pregunta);
        Scanner respuesta1 = new Scanner(System.in);
        respuesta = respuesta1.nextLine();

        return respuesta;
    }

}
