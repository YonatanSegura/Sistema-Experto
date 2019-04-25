package reglas;

import Rule.*;


public class SE {
    //obejto tipo booleano
  private  BooleanRuleBase reglas = new BooleanRuleBase("reglas");
    // Variables datos de entrada
   private RuleVariable bacterianas, numeros, design, software, microbiologia, fisiologia,
                  enfermedades, virus, hongos, parasitos, patogena, antisepcia,
                detecEnfermedades, heridas, cirujias, N1P1, N1P2,N2P1,N2P2,N3P1,N3P2,N4P1,N4P2,N5P1,N5P2,N6P1,N6P2,N7P1,N7P2,N8P1,N8P2,N9P1,N9P2,N10P1,N10P2,
                        animales, enferHum, quiropractico,
                        medicina, odontologia, nutricion, ocupacional;



    //Variables de Salida
   private RuleVariable resultadoInteres, resultadoBacteriana, resultadoMicro, resultadoDoc,resultadoN1,resultadoN2,
            resultadoN3,resultadoN4,resultadoN5,resultadoN6,resultadoN7,resultadoN8,resultadoN9,resultadoN10,resultadoAnatomia,
                        resultadoEnfermedades;

   private String Resultado = "";

    public String obtenerDatosInteres(String isBacterianas, String isNumeros, String isDesign, String isSoftware){
        BaseConocimiento();
        bacterianas.setValue(isBacterianas);
        numeros.setValue((isNumeros));
        design.setValue(isDesign);
        software.setValue(isSoftware);
        reglas.forwardChain();
        Resultado = resultadoInteres.getValue();

        return Resultado;
    }
    public  String obtenerResultadosRelacionesNum(String isN1P1,String isN1P2){
        BaseConocimiento();
        N1P1.setValue(isN1P1);
        N1P2.setValue(isN1P2);
        reglas.forwardChain();
        Resultado = resultadoN1.getValue();
        return Resultado;
    }
    public String getN2(String isN2P1, String isN2P2){
        BaseConocimiento();
        N2P1.setValue(isN2P1);
        N2P2.setValue(isN2P2);
        reglas.forwardChain();
        Resultado = resultadoN2.getValue();
        return Resultado;
    }
    public String getN3(String isN3P1,String isN3P2){
        BaseConocimiento();
        N3P1.setValue(isN3P1);
        N3P2.setValue(isN3P2);
        reglas.forwardChain();
        Resultado = resultadoN3.getValue();
        return Resultado;
    }
    public String getN4(String isN4P1,String isN4P2){
        BaseConocimiento();
        N4P1.setValue(isN4P1);
        N4P2.setValue(isN4P2);
        reglas.forwardChain();
        Resultado = resultadoN4.getValue();
        return Resultado;
    }
    public String getN5(String isN5P1,String isN5P2){
        BaseConocimiento();
        N5P1.setValue(isN5P1);
        N5P2.setValue(isN5P2);
        reglas.forwardChain();
        Resultado = resultadoN5.getValue();
        return Resultado;
    }
    public String getN6(String isN6P1,String isN6P2){
        BaseConocimiento();
        N6P1.setValue(isN6P1);
        N6P2.setValue(isN6P2);
        reglas.forwardChain();
        Resultado = resultadoN6.getValue();
        return Resultado;
    }
    public String getN7(String isN7P1,String isN7P2){
        BaseConocimiento();
        N7P1.setValue(isN7P1);
        N7P2.setValue(isN7P2);
        reglas.forwardChain();
        Resultado = resultadoN7.getValue();
        return Resultado;
    }
    public String getN8(String isN8P1,String isN8P2){
        BaseConocimiento();
        N8P1.setValue(isN8P1);
        N8P2.setValue(isN8P2);
        reglas.forwardChain();
        Resultado = resultadoN8.getValue();
        return Resultado;
    }
    public String getN9(String isN9P1,String isN9P2){
        BaseConocimiento();
        N9P1.setValue(isN9P1);
        N9P2.setValue(isN9P2);
        reglas.forwardChain();
        Resultado = resultadoN9.getValue();
        return Resultado;
    }
    public String getN10(String isN10P1,String isN10P2){
        BaseConocimiento();
        N10P1.setValue(isN10P1);
        N10P2.setValue(isN10P2);
        reglas.forwardChain();
        Resultado = resultadoN10.getValue();
        return Resultado;
    }

    public String obtenerDatosBacterianas(String isMicro, String isFisio, String isEnfermedades){
        BaseConocimiento();
        microbiologia.setValue(isMicro);
        fisiologia.setValue(isFisio);
        enfermedades.setValue(isEnfermedades);
        reglas.forwardChain();
        Resultado = resultadoBacteriana.getValue();

        return Resultado;
    }

    public String obtenerMicro(String isVirus, String isHongos, String isParasitos, String isPatogena, String isAntisepcia){
         BaseConocimiento();
         virus.setValue(isVirus);
         hongos.setValue(isHongos);
         parasitos.setValue(isParasitos);
         patogena.setValue(isPatogena);
         antisepcia.setValue(isAntisepcia);
         reglas.forwardChain();
         Resultado = resultadoMicro.getValue();

         return Resultado;
    }

    public String obtenerDoc(String isDetecEnf, String isHeridas, String isCirujias){
        BaseConocimiento();
        detecEnfermedades.setValue(isDetecEnf);
        heridas.setValue(isHeridas);
        cirujias.setValue(isCirujias);
        reglas.forwardChain();
        Resultado = resultadoDoc.getValue();

        return Resultado;
    }

    public String obtenerAnantomia(String isAnimales, String isEnerHum, String isQuiro){
        BaseConocimiento();
        animales.setValue(isAnimales);
        enferHum.setValue(isEnerHum);
        quiropractico.setValue(isQuiro);
        reglas.forwardChain();
        Resultado = resultadoAnatomia.getValue();

        return Resultado;
    }

    public String obtenerEnfer(String isMedicina, String isOdon, String isNutri, String isOcupa){
        BaseConocimiento();
        medicina.setValue(isMedicina);
        odontologia.setValue(isOdon);
        nutricion.setValue(isNutri);
        ocupacional.setValue(isOcupa);
        reglas.forwardChain();
        Resultado = resultadoEnfermedades.getValue();

        return Resultado;
    }

    public void BaseConocimiento() {
        //Iniciando variables de entrada
        bacterianas = new RuleVariable(reglas, "");
        numeros = new RuleVariable(reglas, "");
        design = new RuleVariable(reglas, "");
        software = new RuleVariable(reglas, "");
        microbiologia = new RuleVariable(reglas,"");
        fisiologia = new RuleVariable(reglas,"");
        enfermedades = new RuleVariable(reglas, "");
        virus = new RuleVariable(reglas, "");
        hongos = new RuleVariable(reglas, "");
        parasitos = new RuleVariable(reglas,"");
        patogena = new RuleVariable(reglas,"");
        antisepcia = new RuleVariable(reglas, "");
        detecEnfermedades = new RuleVariable(reglas,"");
        heridas = new RuleVariable(reglas,"");
        cirujias = new RuleVariable(reglas,"");

        N1P1 = new RuleVariable(reglas,"");
        N1P2 = new RuleVariable(reglas,"");
        N2P1 = new RuleVariable(reglas,"");
        N2P2 = new RuleVariable(reglas,"");
        N3P1 = new RuleVariable(reglas,"");
        N3P2 = new RuleVariable(reglas,"");
        N4P1 = new RuleVariable(reglas,"");
        N4P2 = new RuleVariable(reglas,"");
        N5P1 = new RuleVariable(reglas,"");
        N5P2 = new RuleVariable(reglas,"");
        N6P1 = new RuleVariable(reglas,"");
        N6P2 = new RuleVariable(reglas,"");
        N7P1 = new RuleVariable(reglas,"");
        N7P2 = new RuleVariable(reglas,"");
        N8P1 = new RuleVariable(reglas,"");
        N8P2 = new RuleVariable(reglas,"");
        N9P1 = new RuleVariable(reglas,"");
        N9P2 = new RuleVariable(reglas,"");
        N10P1 = new RuleVariable(reglas,"");
        N10P2 = new RuleVariable(reglas,"");

        animales = new RuleVariable(reglas, "");
        enferHum = new RuleVariable(reglas, "");
        quiropractico = new RuleVariable(reglas,"");

        medicina = new RuleVariable(reglas,"");
        odontologia = new RuleVariable(reglas,"");
        nutricion = new RuleVariable(reglas,"");
        ocupacional = new RuleVariable(reglas,"");


        //Iniciando variables de Salida
        resultadoInteres = new RuleVariable(reglas, "");
        resultadoBacteriana = new RuleVariable(reglas, "");
        resultadoMicro = new RuleVariable(reglas,"");
        resultadoDoc = new RuleVariable(reglas,"");

        resultadoN1 = new RuleVariable(reglas,"");
        resultadoN2 = new RuleVariable(reglas,"");
        resultadoN3 = new RuleVariable(reglas,"");
        resultadoN4 = new RuleVariable(reglas,"");
        resultadoN5 = new RuleVariable(reglas,"");
        resultadoN6 = new RuleVariable(reglas,"");
        resultadoN7 = new RuleVariable(reglas,"");
        resultadoN8 = new RuleVariable(reglas,"");
        resultadoN9 = new RuleVariable(reglas,"");
        resultadoN10 = new RuleVariable(reglas,"");

        resultadoAnatomia = new RuleVariable(reglas,"");

        resultadoEnfermedades = new RuleVariable(reglas,"");




        Condition igual = new Condition("=");

        Rule ruleBacterianas = new Rule(
                reglas, "ruleBacterianas",
                new Clause[]{
                        new Clause(bacterianas,igual,"si"),
                        new Clause(numeros,igual,"no"),
                        new Clause(design,igual,"no"),
                        new Clause(software,igual,"no")
                },
                new Clause(resultadoInteres,igual,"bacterianas")
        );

        Rule ruleNumeros = new Rule(
                reglas, "ruleBacterianas",
                new Clause[]{
                        new Clause(bacterianas,igual,"no"),
                        new Clause(numeros,igual,"si"),
                        new Clause(design,igual,"no"),
                        new Clause(software,igual,"no")
                },
                new Clause(resultadoInteres,igual,"numeros")
        );

        Rule ruleDesign = new Rule(
                reglas, "ruleBacterianas",
                new Clause[]{
                        new Clause(bacterianas,igual,"no"),
                        new Clause(numeros,igual,"no"),
                        new Clause(design,igual,"si"),
                        new Clause(software,igual,"no")
                },
                new Clause(resultadoInteres,igual,"design")
        );

        Rule ruleSoftware = new Rule(
                reglas, "ruleBacterianas",
                new Clause[]{
                        new Clause(bacterianas,igual,"no"),
                        new Clause(numeros,igual,"no"),
                        new Clause(design,igual,"no"),
                        new Clause(software,igual,"si")
                },
                new Clause(resultadoInteres,igual,"software")
        );

        Rule ruleMicro = new Rule(
                reglas, "ruleMicro",
                new Clause[]{
                        new Clause(microbiologia,igual,"si"),
                        new Clause(fisiologia,igual,"no"),
                        new Clause(enfermedades,igual,"no")
                },
                new Clause(resultadoBacteriana,igual,"microbiologia")
        );
        Rule ruleFisio = new Rule(
                reglas, "ruleFisio",
                new Clause[]{
                        new Clause(microbiologia,igual,"no"),
                        new Clause(fisiologia,igual,"si"),
                        new Clause(enfermedades,igual,"no")
                },
                new Clause(resultadoBacteriana,igual,"fisiologia")
        );
        Rule ruleEnfermemdades = new Rule(
                reglas, "ruleEnfermedades",
                new Clause[]{
                        new Clause(microbiologia,igual,"no"),
                        new Clause(fisiologia,igual,"no"),
                        new Clause(enfermedades,igual,"si")
                },
                new Clause(resultadoBacteriana,igual,"enfermedades")
        );

        Rule ruleVirus = new Rule(
                reglas,"ruleVirus",
                new Clause[]{
                        new Clause(virus,igual,"si"),
                        new Clause(hongos,igual,"no"),
                        new Clause(parasitos,igual,"no"),
                        new Clause(patogena,igual,"no"),
                        new Clause(antisepcia,igual,"no")
                },
                new Clause(resultadoMicro,igual,"Continua...")
        );
        Rule ruleHongos = new Rule(
                reglas,"ruleHongos",
                new Clause[]{
                        new Clause(virus,igual,"no"),
                        new Clause(hongos,igual,"si"),
                        new Clause(parasitos,igual,"no"),
                        new Clause(patogena,igual,"no"),
                        new Clause(antisepcia,igual,"no")
                },
                new Clause(resultadoMicro,igual,"Laboratorio Clinico")
        );
        Rule ruleParasitos = new Rule(
                reglas,"ruleParasitos",
                new Clause[]{
                        new Clause(virus,igual,"no"),
                        new Clause(hongos,igual,"no"),
                        new Clause(parasitos,igual,"si"),
                        new Clause(patogena,igual,"no"),
                        new Clause(antisepcia,igual,"no")
                },
                new Clause(resultadoMicro,igual,"Laboratorio Clinico")
        );
        Rule rulePatogena = new Rule(
                reglas,"rulePatogena",
                new Clause[]{
                        new Clause(virus,igual,"no"),
                        new Clause(hongos,igual,"no"),
                        new Clause(parasitos,igual,"no"),
                        new Clause(patogena,igual,"si"),
                        new Clause(antisepcia,igual,"no")
                },
                new Clause(resultadoMicro,igual,"Laboratorio Clinico")
        );
        Rule ruleAntisepcia = new Rule(
                reglas,"ruleAntisepcia",
                new Clause[]{
                        new Clause(virus,igual,"no"),
                        new Clause(hongos,igual,"no"),
                        new Clause(parasitos,igual,"no"),
                        new Clause(patogena,igual,"no"),
                        new Clause(antisepcia,igual,"si")
                },
                new Clause(resultadoMicro,igual,"Continua...")
        );

        Rule ruleDetecEnfer = new Rule(
                reglas, "ruleDetecEnfer",
                new Clause[]{
                        new Clause(detecEnfermedades,igual,"si"),
                        new Clause(heridas,igual,"no"),
                        new Clause(cirujias,igual,"no")
                },
                new Clause(resultadoDoc,igual,"Medicina")
        );
        Rule ruleHeridas = new Rule(
                reglas, "ruleHeridas",
                new Clause[]{
                        new Clause(detecEnfermedades,igual,"no"),
                        new Clause(heridas,igual,"si"),
                        new Clause(cirujias,igual,"no")
                },
                new Clause(resultadoDoc,igual,"Enfermeria")
        );
        Rule ruleCirujias = new Rule(
                reglas, "ruleCirujias",
                new Clause[]{
                        new Clause(detecEnfermedades,igual,"no"),
                        new Clause(heridas,igual,"no"),
                        new Clause(cirujias,igual,"si")
                },
                new Clause(resultadoDoc,igual,"Medicina")
        );
        Rule ruleN1P1 = new Rule(
                reglas, "ruleN1",
                new Clause[]{
                        new Clause(N1P1,igual,"si"),
                        new Clause(N1P2,igual,"no"),

                },
                new Clause(resultadoN1,igual,"Análisis de estructuras, topología, matemática y física")
        );
        Rule ruleN1P2 = new Rule(
                reglas, "ruleN1",
                new Clause[]{
                        new Clause(N1P1,igual,"no"),
                        new Clause(N1P2,igual,"si"),

                },
                new Clause(resultadoN1,igual,"Crear sistemas informáticos")
        );
        Rule ruleN2P1 = new Rule(
                reglas, "ruleN2",
                new Clause[]{
                        new Clause(N2P1,igual,"si"),
                        new Clause(N2P2,igual,"no"),

                },
                new Clause(resultadoN2,igual,"Crear programas para computadores")
        );
        Rule ruleN2P2 = new Rule(
                reglas, "ruleN2",
                new Clause[]{
                        new Clause(N2P1,igual,"no"),
                        new Clause(N2P2,igual,"si"),

                },
                new Clause(resultadoN2,igual,"Crear sistemas hardware")
        );
        Rule ruleN3P1 = new Rule(
                reglas, "ruleN3",
                new Clause[]{
                        new Clause(N3P1,igual,"si"),
                        new Clause(N3P2,igual,"no"),

                },
                new Clause(resultadoN3,igual,"Técnico en Redes")
        );
        Rule ruleN3P2 = new Rule(
                reglas, "ruleN3",
                new Clause[]{
                        new Clause(N3P1,igual,"no"),
                        new Clause(N3P2,igual,"si"),

                },
                new Clause(resultadoN3,igual,"Programar una computadora para que siga ordenes")
        );
        Rule ruleN4P1 = new Rule(
                reglas, "ruleN4",
                new Clause[]{
                        new Clause(N4P1,igual,"si"),
                        new Clause(N4P2,igual,"no"),

                },
                new Clause(resultadoN4,igual,"Te gustaria conocer sobre hardware a un nivel básico")
        );
        Rule ruleN4P2 = new Rule(
                reglas, "ruleN4",
                new Clause[]{
                        new Clause(N4P1,igual,"no"),
                        new Clause(N4P2,igual,"si"),

                },
                new Clause(resultadoN4,igual,"Ing. En Software :)")
        );
        Rule ruleN5P1 = new Rule(
                reglas, "ruleN5",
                new Clause[]{
                        new Clause(N5P1,igual,"si"),
                        new Clause(N5P2,igual,"no"),

                },
                new Clause(resultadoN5,igual,"Ingeniería en sistemas")
        );
        Rule ruleN5P2 = new Rule(
                reglas, "ruleN5",
                new Clause[]{
                        new Clause(N5P1,igual,"no"),
                        new Clause(N5P2,igual,"si"),

                },
                new Clause(resultadoN5,igual,"Mecatrónica")
        );
        Rule ruleN6P1 = new Rule(
                reglas, "ruleN6",
                new Clause[]{
                        new Clause(N6P1,igual,"si"),
                        new Clause(N6P2,igual,"no"),

                },
                new Clause(resultadoN6,igual,"Técnico en mantenimiento en computación")
        );
        Rule ruleN6P2 = new Rule(
                reglas, "ruleN6",
                new Clause[]{
                        new Clause(N6P1,igual,"no"),
                        new Clause(N6P2,igual,"si"),

                },
                new Clause(resultadoN6,igual,"Te gustaría crear sistemas electrónicos o modificar existentes")
        );

        Rule ruleN7P1 = new Rule(
                reglas, "ruleN7",
                new Clause[]{
                        new Clause(N7P1,igual,"si"),
                        new Clause(N7P2,igual,"no"),

                },
                new Clause(resultadoN7,igual,"Ingeniería Eléctrica")
        );
        Rule ruleN7P2 = new Rule(
                reglas, "ruleN7",
                new Clause[]{
                        new Clause(N7P1,igual,"no"),
                        new Clause(N7P2,igual,"si"),

                },
                new Clause(resultadoN7,igual,"Ingeniería en Hardware")
        );
        Rule ruleN8P1 = new Rule(
                reglas, "ruleN8",
                new Clause[]{
                        new Clause(N8P1,igual,"si"),
                        new Clause(N8P2,igual,"no"),

                },
                new Clause(resultadoN8,igual,"Ingenieria Civil")
        );
        Rule ruleN8P2 = new Rule(
                reglas, "ruleN8",
                new Clause[]{
                        new Clause(N8P1,igual,"no"),
                        new Clause(N8P2,igual,"si"),

                },
                new Clause(resultadoN8,igual,"crear estudios para crear infraesturcturas")
        );
        Rule ruleN9P1 = new Rule(
                reglas, "ruleN9",
                new Clause[]{
                        new Clause(N9P1,igual,"si"),
                        new Clause(N9P2,igual,"no"),

                },
                new Clause(resultadoN9,igual,"Diseño Gráfico")
        );
        Rule ruleN9P2 = new Rule(
                reglas, "ruleN9",
                new Clause[]{
                        new Clause(N9P1,igual,"no"),
                        new Clause(N9P2,igual,"si"),

                },
                new Clause(resultadoN9,igual,"Te interesa el dibujo para realizar labore generales")
        );
        Rule ruleN10P1 = new Rule(
                reglas, "ruleN10",
                new Clause[]{
                        new Clause(N10P1,igual,"si"),
                        new Clause(N10P2,igual,"no"),

                },
                new Clause(resultadoN10,igual,"Arquitecto")
        );
        Rule ruleN10P2 = new Rule(
                reglas, "ruleN10",
                new Clause[]{
                        new Clause(N10P1,igual,"no"),
                        new Clause(N10P2,igual,"Si"),

                },
                new Clause(resultadoN10,igual,"Diseño Gráfico")
        );





        //--------------Aqui casual para no PERDERME


        Rule ruleAnimales = new Rule(
                reglas, "ruleAnimales",
                new Clause[]{
                        new Clause(animales, igual, "si"),
                        new Clause(enferHum, igual, "no"),
                        new Clause(quiropractico, igual, "no")
                },
                new Clause(resultadoAnatomia,igual,"Veterinaria")
        );

        Rule ruleEnferHum = new Rule(
                reglas, "ruleEnferHum",
                new Clause[]{
                        new Clause(animales, igual, "no"),
                        new Clause(enferHum, igual, "si"),
                        new Clause(quiropractico, igual, "no")
                },
                new Clause(resultadoAnatomia,igual,"Cientifico Medico")
        );

        Rule ruleQuiro = new Rule(
                reglas, "ruleQuiro",
                new Clause[]{
                        new Clause(animales, igual, "no"),
                        new Clause(enferHum, igual, "no"),
                        new Clause(quiropractico, igual, "si")
                },
                new Clause(resultadoAnatomia,igual,"Doctor en Quiropractica")
        );

        Rule ruleMedicina = new Rule(
                reglas, "ruleMedicina",
                new Clause[]{
                        new Clause(medicina, igual, "si"),
                        new Clause(odontologia, igual, "no"),
                        new Clause(nutricion, igual, "no"),
                        new Clause(ocupacional, igual, "no")
                },
                new Clause(resultadoEnfermedades,igual,"Medicina General")
        );

        Rule ruleOdon = new Rule(
                reglas, "ruleMedicina",
                new Clause[]{
                        new Clause(medicina, igual, "no"),
                        new Clause(odontologia, igual, "si"),
                        new Clause(nutricion, igual, "no"),
                        new Clause(ocupacional, igual, "no")
                },
                new Clause(resultadoEnfermedades,igual,"Odontologia")
        );

        Rule ruleNutricion = new Rule(
                reglas, "ruleNutricion",
                new Clause[]{
                        new Clause(medicina, igual, "no"),
                        new Clause(odontologia, igual, "no"),
                        new Clause(nutricion, igual, "si"),
                        new Clause(ocupacional, igual, "no")
                },
                new Clause(resultadoEnfermedades,igual,"Licenciatura en Nutricion")
        );

        Rule ruleOcupa = new Rule(
                reglas, "ruleOcupa",
                new Clause[]{
                        new Clause(medicina, igual, "no"),
                        new Clause(odontologia, igual, "no"),
                        new Clause(nutricion, igual, "no"),
                        new Clause(ocupacional, igual, "si")
                },
                new Clause(resultadoEnfermedades,igual,"Salud Ocupacional")
        );



    }
}
