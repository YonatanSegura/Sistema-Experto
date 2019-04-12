package reglas;

import Rule.*;


public class SE {
    //obejto tipo booleano
  private  BooleanRuleBase reglas = new BooleanRuleBase("reglas");
    // Variables datos de entrada
   private RuleVariable bacterianas, numeros, design, software, microbiologia, fisiologia,
                  enfermedades, virus, hongos, parasitos, patogena, antisepcia,
                detecEnfermedades, heridas, cirujias, N1P1, N1P2,N1P3;



    //Variables de Salida
   private RuleVariable resultadoInteres, resultadoBacteriana, resultadoMicro, resultadoDoc,resultadoN1;

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
    public  String obtenerResultadosRelacionesNum(String isN1P1,String isN1P2,String isN1P3){
        BaseConocimiento();
        N1P1.setValue(isN1P1);
        N1P2.setValue(isN1P2);
        N1P3.setValue(isN1P3);
        reglas.forwardChain();
        Resultado = resultadoN1.getValue();
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
        N1P3 = new RuleVariable(reglas,"");

        //Iniciando variables de Salida
        resultadoInteres = new RuleVariable(reglas, "");
        resultadoBacteriana = new RuleVariable(reglas, "");
        resultadoMicro = new RuleVariable(reglas,"");
        resultadoDoc = new RuleVariable(reglas,"");

        resultadoN1 = new RuleVariable(reglas,"");



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
                        new Clause(N1P3,igual,"no")
                },
                new Clause(resultadoN1,igual,"Estudios suelos")
        );
        Rule ruleN1P2 = new Rule(
                reglas, "ruleN1",
                new Clause[]{
                        new Clause(N1P1,igual,"no"),
                        new Clause(N1P2,igual,"si"),
                        new Clause(N1P3,igual,"no")
                },
                new Clause(resultadoN1,igual,"Calculo proyectos científicos")
        );
        Rule ruleN1P3 = new Rule(
                reglas, "ruleN1",
                new Clause[]{
                        new Clause(N1P1,igual,"no"),
                        new Clause(N1P2,igual,"no"),
                        new Clause(N1P3,igual,"si")
                },
                new Clause(resultadoN1,igual,"Enseñar matemáticas")
        );


    }
}
