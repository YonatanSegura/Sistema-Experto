package reglas;

import java.util.Scanner;

public class VocSys {

    public static void main(String[] args) {
        SE sistema = new SE();
        String r1 = "", r2 = "", rMicro = "", rDoc = "", resultadosNumero = "", N1 = "";;
        String resultado = getRespuesta("¿Qué materia te intesa más? \n 1.- Bacterias y patógenos \n 2.- Relaciones Numericas \n 3.- Modelado y diseño \n 4.-Software");

        if (resultado.contains("1")) {//Bacterias y patógenos
            r1 = sistema.obtenerDatosInteres(Variables.SI, Variables.NO, Variables.NO, Variables.NO);
            String resultadoBacterianas = getRespuesta("Que te interesa? \n 1.- Microbiologia y Parasitologia \n 2.- Anatomia y Fisiologia \n 3.- Conocer sobre Enfermedades");

            if (resultadoBacterianas.contains("1")) { //Microbiologia
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

                    System.out.println("*----------------------------------*");
                    System.out.println(rDoc);
                    System.out.println("*----------------------------------*");

                } else if (resultadoMicro.contains("2")) { //Clasificación, estructura y multiplicación de hongos
                    rMicro = sistema.obtenerMicro(Variables.NO, Variables.SI, Variables.NO, Variables.NO, Variables.NO);

                    System.out.println("*----------------------------------*");
                    System.out.println(rMicro);
                    System.out.println("*----------------------------------*");

                } else if (resultadoMicro.contains("3")) { //Clasificación, estructura y crecimiento de parásitos
                    rMicro = sistema.obtenerMicro(Variables.NO, Variables.NO, Variables.SI, Variables.NO, Variables.NO);

                    System.out.println("*----------------------------------*");
                    System.out.println(rMicro);
                    System.out.println("*----------------------------------*");

                } else if (resultadoMicro.contains("4")) { //Flora microbiana comensal y patógena
                    rMicro = sistema.obtenerMicro(Variables.NO, Variables.NO, Variables.NO, Variables.SI, Variables.NO);

                    System.out.println("*----------------------------------*");
                    System.out.println(rMicro);
                    System.out.println("*----------------------------------*");

                } else if (resultadoMicro.contains("5")) { //Esterilización, desinfección y antisepsia
                    rMicro = sistema.obtenerMicro(Variables.NO, Variables.NO, Variables.NO, Variables.NO, Variables.SI);

                    String resultadoDoc = getRespuesta("Que te interesa \n 1- Deteccion de Enfermedades \n" +
                            "2- Curacion de Heridas \n 3- Cirujias");

                    if (resultadoDoc.contains("1")) {
                        rDoc = sistema.obtenerDoc(Variables.SI, Variables.NO, Variables.NO);
                    } else if (resultadoDoc.contains("2")) {
                        rDoc = sistema.obtenerDoc(Variables.NO, Variables.SI, Variables.NO);
                    } else if (resultadoDoc.contains("3")) {
                        rDoc = sistema.obtenerDoc(Variables.NO, Variables.NO, Variables.SI);
                    }

                    System.out.println("*----------------------------------*");
                    System.out.println(rDoc);
                    System.out.println("*----------------------------------*");
                }


            } else if (resultadoBacterianas.contains("2")) { //Fisiologia
                r2 = sistema.obtenerDatosBacterianas(Variables.NO, Variables.SI, Variables.NO);

            } else if (resultadoBacterianas.contains("3")) { //Enfermedades
                r2 = sistema.obtenerDatosBacterianas(Variables.NO, Variables.NO, Variables.SI);
            }

            //System.out.println("El resultado de bacteriana es: "+ r2);

        } else if (resultado.contains("2")) {
            r1 = sistema.obtenerDatosInteres(Variables.NO, Variables.SI, Variables.NO, Variables.NO);
            resultadosNumero = getRespuesta("¿Qué te interesa más? \n 1.- Realizar estudios de suelo \n 2.- Realizar cálculo para proyectos científicos \n 3.- Enseñar matemáticas ");
            switch (resultadosNumero) {
                case "1":
                    N1 = sistema.obtenerResultadosRelacionesNum(Variables.SI,Variables.NO,Variables.NO);
                    System.out.println(N1);
                    break;

                case "2":
                    N1 = sistema.obtenerResultadosRelacionesNum(Variables.NO,Variables.SI,Variables.NO);
                    System.out.println(N1);
                    break;
                case "3":
                    N1 = sistema.obtenerResultadosRelacionesNum(Variables.NO,Variables.NO,Variables.SI);
                    System.out.println(N1);
                    break;

                default:
                    System.out.println("Pasó algun error en la pregunta de relaciones numéricas");
                    break;
            }


        } else if (resultado.contains("3")) {
            r1 = sistema.obtenerDatosInteres(Variables.NO, Variables.NO, Variables.SI, Variables.NO);

        } else if (resultado.contains("4")) {
            r1 = sistema.obtenerDatosInteres(Variables.NO, Variables.NO, Variables.NO, Variables.SI);

        }
        //System.out.printf(r1);

    }


    private static String getRespuesta(String pregunta) {
        String respuesta = "";
        System.out.println(pregunta);
        Scanner respuesta1 = new Scanner(System.in);
        respuesta = respuesta1.nextLine();

        return respuesta;
    }

}
