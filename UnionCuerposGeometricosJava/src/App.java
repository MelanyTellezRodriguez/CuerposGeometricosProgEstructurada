
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        int opcion = 0;
        int cantidadLadosPrisma = 0;
        double longitudLadosPrisma, alturaPrisma, areaLateralPrisma, areaTotalPrisma, volumenPrisma;
        double perimetroBasePrisma, areaBasePrisma, apotemaPrisma;
        double perimetroBaseCilindro, alturaCilindro, radioCilindro;
        double areaLateralCilindro, areaBaseCilindro;
        double volumenCilindro, areaTotalCilindro;

        int cantidadLadosPiramide;
        double areaLateralPiramide, perimetroBasePiramide;
        double alturaPiramide, apotemaPiramide, areaTotalPiramide, areaBasePiramide;
        double volumenPiramide, longitudLadosPiramide;
        double alfa;

        double areaLateralCono, perimetroBaseCono, generatrizCono;
        double radioCono, alturaCono, areaBaseCono, areaTotalCono;
        double volumenCono;
        double areaTotalEsfera, radioEsfera, volumenEsfera;
        double areaLateralTroncoCono, generatrizTroncoCono, radioMayorTroncoCono;
        double radioMenorTroncoCono, areaTotalTroncoCono, areaBaseMayorTroncoCono;
        double areaBaseMenorTroncoCono, alturaTroncoCono, volumenTroncoCono;
        double areaLateralTroncoPiramide, areaTrapecioTroncoPiramide;
        double areaTotalTroncoPiramide, areaBaseMayorTroncoPiramide;
        double areaBaseMenorTroncoPiramide, volumenTroncoPiramide, apotemaPiramideTroncoPiramide, alturaTroncoPiramide;
        double aristaTetraedro, areaTotalTetraedro, alturaTetraedro, volumenTetraedro;
        double areaHexaedro, volumenHexaedro, aristaHexaedro, diagonalHexaedro;
        double areaOctaedro, volumenOctaedro, aristaOctaedro;
        double areaDodecaedro, aristaDodecaedro, volumenDodecaedro;
        double areaIcosaedro, aristaIcosaedro, volumenIcosaedro;
        double areaOrtoedro, alturaOrtoedro, longitudbOrtoedro;
        double profundidadCOrtoedro, diagonalOrtoedro, volumenOrtoedro;
        double areaEsfe, alturaEsfe, radioMayorEsfe_r1;
        double radioMenorEsfe_r2, volumenEsfe, radioEsfe_R;
        double volumenCasquete, areaCasquete;
        double areaHusoEsferico, volumencuñaEsferica, radioHuso, anguloNHuso;
        int intentos = 3;


        System.out.println("**Diferentes tipos de cuerpos geometricos**");
        System.out.println("ELIGE UNA OPCION: ");
        System.out.println("1- Prisma.");
        System.out.println("2- Cilindro.");
        System.out.println("3- Piramide");
        System.out.println("4- Cono");
        System.out.println("5- Esfera");
        System.out.println("6- Tronco De Cono");
        System.out.println("7- Trono piramide");
        System.out.println("8- Tetraedro");
        System.out.println("9- Hexaedro");
        System.out.println("10- Octaedro");
        System.out.println("11- Dodecaedro");
        System.out.println("12- Icosaedro");
        System.out.println("13- Ortoedro");
        System.out.println("14- Circunferencia esferica");
        System.out.println("15- Huso Esferico");
        System.out.println("16- Salir");
        System.out.println("");
        

        do{
            System.out.println("Ingrese la opcion que desee: ");
            opcion = entrada.nextInt();
            
            if(opcion <= 0 || opcion > 16){
                intentos++;
                System.out.println("El numero que ingreso no se encuentra entre las opciones, intentelo de nuevo");
                System.out.println("Ingrese la opcion que desee:");
                opcion = entrada.nextInt();
             if(opcion <= 0 || opcion > 16){
                intentos++;
                System.out.println("El numero que ingreso no se encuentra entre las opciones, intentelo de nuevo");
                System.out.println("Ingrese la opcion que desee:");
                opcion = entrada.nextInt();
             }
                
            break;    
            }
          
        }while(opcion <= 0 || opcion > 16);
        

        switch(opcion){
            case 1: 
            System.out.println("Ingrese la cantidad de lados del prisma:");
                cantidadLadosPrisma = entrada.nextInt(); 
                
                if(cantidadLadosPrisma <= 0){
                    intentos++;
                    System.out.println("Por favor ingrese un numero que sea mayor y diferente de cero");
                    System.out.println("Ingrese la cantidad de lados del prisma: ");
                    cantidadLadosPrisma = entrada.nextInt();    
                if(cantidadLadosPrisma <= 0){
                    intentos++;
                    System.out.println("Por favor ingrese un numero que sea mayor y diferente de cero");
                    System.out.println("Ingrese la cantidad de lados del prisma: ");
                    cantidadLadosPrisma = entrada.nextInt();
                    break;
                }    
                }
                

                System.out.println("ingrese la Altura del prisma:");
                alturaPrisma = entrada.nextDouble();
                
              if(alturaPrisma <= 0){
                  intentos++;
                  System.out.println("Por favor ingrese un numero que sea mayor y diferente de cero");
                  System.out.println("Ingrese la Altura del prisma: ");
                  alturaPrisma = entrada.nextInt();
              if(alturaPrisma <= 0){
                  intentos++;
                  System.out.println("Por favor ingrese un numero que sea mayor y diferente de cero");
                  System.out.println("Ingrese la Altura del prisma: ");
                  alturaPrisma = entrada.nextInt();
                  break;      
              }
              } 

              System.out.println("ingrese la Longitud de lados del prisma:");
              longitudLadosPrisma = entrada.nextDouble(); 
              
             if(alturaPrisma <= 0){
                 intentos++;
                 System.out.println("Por favor ingrese un numero que sea mayor y diferente de cero");
                 System.out.println("Ingrese la Altura del prisma: ");
                 alturaPrisma = entrada.nextInt();
             if(alturaPrisma <= 0){
                 intentos++;
                 System.out.println("Por favor ingrese un numero que sea mayor y diferente de cero");
                 System.out.println("Ingrese la Altura del prisma: ");
                 alturaPrisma = entrada.nextInt();
                 break;      
             }
             } 

             perimetroBasePrisma = cantidadLadosPrisma * longitudLadosPrisma;  
               areaLateralPrisma = perimetroBasePrisma * alturaPrisma;
               alfa = (Math.PI / 180) * (360 / cantidadLadosPrisma);
               apotemaPrisma = longitudLadosPrisma / (2 * Math.tan (alfa)/2); 
               areaBasePrisma = (perimetroBasePrisma * apotemaPrisma) /2;
               areaTotalPrisma = areaLateralPrisma + 2 * areaBasePrisma;  
               volumenPrisma = areaBasePrisma * alturaPrisma;
                
               System.out.print("Area lateral del prisma es: " + areaLateralPrisma +  "Unidades caudradas");
               System.out.println("");
               System.out.print("Area total del prisma es : " + areaTotalPrisma +  "Unidades cuadradas");
               System.out.println("");
               System.out.println("volumen del prisma es: " + volumenPrisma +  "Unidades cuadradas");  
               System.out.println("");
               break;

            case 2:
            System.out.println ("Ingrese el radio:");
               radioCilindro = entrada.nextDouble();
               
               if(radioCilindro <= 0){
                    intentos++;
                    System.out.println("Por favor ingrese un numero que sea mayor y diferente de cero");
                    System.out.println("Ingrese el radio: ");
                    radioCilindro = entrada.nextInt();    
                if(radioCilindro <= 0){
                    intentos++;
                    System.out.println("Por favor ingrese un numero que sea mayor y diferente de cero");
                    System.out.println("Ingrese el radio: ");
                    radioCilindro = entrada.nextInt();
                    break;
                }    
                }
             

                System.out.println("Ingrese la altura:");
                alturaCilindro = entrada.nextDouble();
                
                if(radioCilindro <= 0){
                     intentos++;
                     System.out.println("Por favor ingrese un numero que sea mayor y diferente de cero");
                     System.out.println("Ingrese el radio: ");
                     radioCilindro = entrada.nextInt();    
                 if(radioCilindro <= 0){
                     intentos++;
                     System.out.println("Por favor ingrese un numero que sea mayor y diferente de cero");
                     System.out.println("Ingrese el radio: ");
                     radioCilindro = entrada.nextInt();
                     break;
                 }    
                 }

                 perimetroBaseCilindro = (2 * Math.PI * radioCilindro);
                 
                 areaLateralCilindro = perimetroBaseCilindro * alturaCilindro;
                   
                 areaBaseCilindro = Math.PI * (radioCilindro * radioCilindro);
                   
                 areaTotalCilindro = perimetroBaseCilindro * (alturaCilindro + radioCilindro);
                   
                 volumenCilindro = areaBaseCilindro * alturaCilindro;
                   
                 System.out.println("El area lateral es: " + areaLateralCilindro);
                 System.out.println("");
                 System.out.println("El area total es: " + areaTotalCilindro);
                 System.out.println("");
                 System.out.println("El volumen es: " + volumenCilindro);
                 System.out.println(""); 
                  break;

            case 3: 
            System.out.println("Ingrese la cantidad de lados:");
            cantidadLadosPiramide = entrada.nextInt();
            
            if(cantidadLadosPiramide <= 0){
                 intentos++;
                 System.out.println("Por favor ingrese un numero que sea mayor y diferente de cero");
                 System.out.println("Ingrese la cantidad de lados: ");
                 cantidadLadosPiramide = entrada.nextInt();    
             if(cantidadLadosPiramide <= 0){
                 intentos++;
                 System.out.println("Por favor ingrese un numero que sea mayor y diferente de cero");
                 System.out.println("Ingrese la cantidad de lados: ");
                 cantidadLadosPiramide = entrada.nextInt();
                 break;
             }    
             }

             System.out.println("Ingrese la altura:");
               alturaPiramide = entrada.nextDouble();
               
               if(alturaPiramide <= 0){
                    intentos++;
                    System.out.println("Por favor ingrese un numero que sea mayor y diferente de cero");
                    System.out.println("Ingrese la altura: ");
                    alturaPiramide = entrada.nextInt();    
                if(alturaPiramide <= 0){
                    intentos++;
                    System.out.println("Por favor ingrese un numero que sea mayor y diferente de cero");
                    System.out.println("Ingrese la altura: ");
                    alturaPiramide = entrada.nextInt();
                    break;
                }    
                }

                System.out.println("Ingrese la longitud de los lados:");
               longitudLadosPiramide = entrada.nextDouble();
               
               if(longitudLadosPiramide <= 0){
                    intentos++;
                    System.out.println("Por favor ingrese un numero que sea mayor y diferente de cero");
                    System.out.println("Ingrese la longitud de los lados: ");
                    longitudLadosPiramide = entrada.nextInt();    
                if(longitudLadosPiramide <= 0){
                    intentos++;
                    System.out.println("Por favor ingrese un numero que sea mayor y diferente de cero");
                    System.out.println("Ingrese la longitud de los lados: ");
                    longitudLadosPiramide = entrada.nextInt();
                    break;
                }    
                }

                perimetroBasePiramide = cantidadLadosPiramide * longitudLadosPiramide;
                 
               alfa = (Math.PI / 180) *(360 / cantidadLadosPiramide);
                 
               apotemaPiramide = longitudLadosPiramide / (2 * Math.tan(alfa)/2);
                 
               apotemaPiramide = (alturaPiramide * alturaPiramide) + (apotemaPiramide * apotemaPiramide);
                 
               areaLateralPiramide = (perimetroBasePiramide * apotemaPiramide) / 2;
                 
               areaBasePiramide =(perimetroBasePiramide * apotemaPiramide) / 2;
                 
               areaTotalPiramide = areaLateralPiramide + areaBasePiramide;
                 
               volumenPiramide = (areaBasePiramide * alturaPiramide) / 3;
                 
               System.out.println("El area lateral es: " + areaLateralPiramide);
               System.out.println("");
               System.out.println("El area total es: " + areaTotalPiramide);
               System.out.println("");
               System.out.println("El volumen es: " + volumenPiramide);
               System.out.println(""); 
               break;
             

            case 4:
            System.out.println("Ingrese el radio: ");
            radioCono = entrada.nextDouble();
            
            if( radioCono <= 0){
                intentos++;
                System.out.println("Por favor ingrese un numero que sea mayor y diferente de cero");
                System.out.println("Ingrese el radio: ");
               radioCono = entrada.nextInt();    
            if( radioCono <= 0){
                intentos++;
                System.out.println("Por favor ingrese un numero que sea mayor y diferente de cero");
                System.out.println("Ingrese el radio: ");
                 radioCono= entrada.nextInt();
                break;
            }    
            }
            
            
            System.out.println("Ingrese la altura: ");
            alturaCono = entrada.nextDouble();
            
            if( alturaCono <= 0){
                intentos++;
                System.out.println("Por favor ingrese un numero que sea mayor y diferente de cero");
                System.out.println("Ingrese la altura: ");
                alturaCono = entrada.nextInt();
                
            if( alturaCono <= 0){
                intentos++;
                System.out.println("Por favor ingrese un numero que sea mayor y diferente de cero");
                System.out.println("Ingrese la altura: ");
                 alturaCono= entrada.nextInt();
                break;
            }    
            }
            
            generatrizCono = Math.sqrt( radioCono * radioCono + alturaCono * alturaCono);
            perimetroBaseCono = Math.PI * radioCono;
            areaLateralCono = perimetroBaseCono * generatrizCono;
            areaBaseCono = Math.PI * (radioCono * radioCono);
            areaTotalCono = Math.PI * radioCono * (generatrizCono + radioCono);
            volumenCono = (areaBaseCono * alturaCono)/3;
            
            
            System.out.println("Area Lateral: " + areaLateralCono);
            System.out.println("");
            System.out.println("Area Toatal: " + areaTotalCono);
            System.out.println("");
            System.out.println("El volumen es: " + volumenCono);
            System.out.println("");
             
             break;

            case 5:
            System.out.println("Ingrese el radio: ");
                radioEsfera = entrada.nextDouble();
                
                if( radioEsfera <= 0){
                    intentos++;
                    System.out.println("Por favor ingrese un numero que sea mayor y diferente de cero");
                    System.out.println("Ingrese el radio: ");
                    radioEsfera = entrada.nextInt();
                    
                if( radioEsfera <= 0){
                    intentos++;
                    System.out.println("Por favor ingrese un numero que sea mayor y diferente de cero");
                    System.out.println("Ingrese el radio: ");
                     radioEsfera= entrada.nextInt();
                    break;
                }    
                }
            
                 
                areaTotalEsfera = 4 * Math.PI * (radioEsfera * radioEsfera);
                volumenEsfera = 4/3 * Math.PI * (radioEsfera * radioEsfera * radioEsfera);
                  
                System.out.println("El area de la esfera es: " + areaTotalEsfera);
                System.out.println("");
                System.out.println("el volumen de la esfera es: " + volumenEsfera);
                System.out.println("");
                 
                 break;

            case 6:
            System.out.println("Ingrese el radio Mayor: ");
            radioMayorTroncoCono = entrada.nextDouble();
            
             if( radioMayorTroncoCono <= 0){
                intentos++;
                System.out.println("Por favor ingrese un numero que sea mayor y diferente de cero");
                System.out.println("Ingrese el radio Mayor: ");
                radioMayorTroncoCono = entrada.nextInt();
                
            if( radioMayorTroncoCono <= 0){
                intentos++;
                System.out.println("Por favor ingrese un numero que sea mayor y diferente de cero");
                System.out.println("Ingrese el radio mayor: ");
                radioMayorTroncoCono= entrada.nextInt();
                break;
            }    
            }
            
            
            System.out.println("Ingrese el radio Menor: ");
            radioMenorTroncoCono = entrada.nextDouble();
            
             if( radioMenorTroncoCono <= 0){
                intentos++;
                System.out.println("Por favor ingrese un numero que sea mayor y diferente de cero");
                System.out.println("Ingrese el radio menor: ");
                radioMenorTroncoCono = entrada.nextInt();
                
            if( radioMenorTroncoCono <= 0){
                intentos++;
                System.out.println("Por favor ingrese un numero que sea mayor y diferente de cero");
                System.out.println("Ingrese el radio menor: ");
                 radioMenorTroncoCono= entrada.nextInt();
                break;
            }    
            }
             
            System.out.println("Ingrese la altura: ");
            alturaTroncoCono = entrada.nextDouble();
            
             if(  alturaTroncoCono <= 0){
                intentos++;
                System.out.println("Por favor ingrese un numero que sea mayor y diferente de cero");
                System.out.println("Ingrese la altura: ");
                 alturaTroncoCono = entrada.nextInt();
                
            if(  alturaTroncoCono <= 0){
                intentos++;
                System.out.println("Por favor ingrese un numero que sea mayor y diferente de cero");
                System.out.println("Ingrese la altura: ");
                alturaTroncoCono= entrada.nextInt();
                break;
            }    
            }
            System.out.println("Ingrese  la generatriz: ");
            generatrizTroncoCono = entrada.nextDouble();
            
             if(generatrizTroncoCono <= 0){
                intentos++;
                System.out.println("Por favor ingrese un numero que sea mayor y diferente de cero");
                System.out.println("Ingrese la generatriz: ");
                generatrizTroncoCono = entrada.nextInt();
                
            if(generatrizTroncoCono <= 0){
                intentos++;
                System.out.println("Por favor ingrese un numero que sea mayor y diferente de cero");
                System.out.println("Ingrese la generatriz: ");
                generatrizTroncoCono= entrada.nextInt();
                break;
            }    
            }
            
            areaLateralTroncoCono = Math.PI * generatrizTroncoCono * (radioMayorTroncoCono + radioMenorTroncoCono);
            areaBaseMayorTroncoCono = Math.PI * (radioMayorTroncoCono * radioMayorTroncoCono);
            areaBaseMenorTroncoCono = Math.PI * (radioMenorTroncoCono * radioMenorTroncoCono);
            areaTotalTroncoCono = areaLateralTroncoCono+ areaBaseMayorTroncoCono + areaBaseMenorTroncoCono;
            volumenTroncoCono= 1/3 *  Math.PI * alturaTroncoCono * ((radioMayorTroncoCono * radioMayorTroncoCono) + (radioMenorTroncoCono * radioMenorTroncoCono) + (radioMayorTroncoCono * radioMenorTroncoCono));
            
            System.out.println("El area lateral del tronco de cono es: " + areaLateralTroncoCono);
            System.out.println("");
            System.out.println("El areaTotal del tronco de cono es: " + areaTotalTroncoCono);
            System.out.println("");
            System.out.println("El volumen del tronco de cono es: " + volumenTroncoCono);
            System.out.println("");
             
             break;
            
           case 7:
           System.out.println("Ingrese el apotema de la piramide o altura de las caras laterales : ");
                apotemaPiramideTroncoPiramide = entrada.nextDouble();
                
                 if( apotemaPiramideTroncoPiramide <= 0){
                    intentos++;
                    System.out.println("Por favor ingrese un numero que sea mayor y diferente de cero");
                    System.out.println("Ingrese el apotema de la piramide o altura de las caras laterales: ");
                    apotemaPiramideTroncoPiramide = entrada.nextInt();
                    
                if( apotemaPiramideTroncoPiramide <= 0){
                    intentos++;
                    System.out.println("Por favor ingrese un numero que sea mayor y diferente de cero");
                    System.out.println("Ingrese el apotema de la piramide o la altura de las caras laterales: ");
                     apotemaPiramideTroncoPiramide= entrada.nextInt();
                    break;
                }    
                }
                 
                System.out.println("Ingrese la altura del tronco de piramide: ");
                alturaTroncoPiramide = entrada.nextDouble();
                
                 if( alturaTroncoPiramide <= 0){
                    intentos++;
                    System.out.println("Por favor ingrese un numero que sea mayor y diferente de cero");
                    System.out.println("Ingrese la altura del tronco de la piramide: ");
                    alturaTroncoPiramide = entrada.nextInt();
                    
                if( alturaTroncoPiramide <= 0){
                    intentos++;
                    System.out.println("Por favor ingrese un numero que sea mayor y diferente de cero");
                    System.out.println("Ingrese la altura del tronco de la piramide: ");
                     alturaTroncoPiramide= entrada.nextInt();
                    break;
                }    
                }
                 
                System.out.println("Ingrese el area de la base mayor: ");
                areaBaseMayorTroncoPiramide = entrada.nextDouble();
                
                 if( areaBaseMayorTroncoPiramide <= 0){
                    intentos++;
                    System.out.println("Por favor ingrese un numero que sea mayor y diferente de cero");
                    System.out.println("Ingrese el area de la base mayor: ");
                    areaBaseMayorTroncoPiramide = entrada.nextInt();
                    
                if( areaBaseMayorTroncoPiramide <= 0){
                    intentos++;
                    System.out.println("Por favor ingrese un numero que sea mayor y diferente de cero");
                    System.out.println("Ingrese el area de la base mayor: ");
                     areaBaseMayorTroncoPiramide= entrada.nextInt();
                    break;
                }    
                }
                 
                System.out.println("Ingrese el area de la base menor: ");
                areaBaseMenorTroncoPiramide = entrada.nextDouble();
                
                 if(  areaBaseMenorTroncoPiramide <= 0){
                    intentos++;
                    System.out.println("Por favor ingrese un numero que sea mayor y diferente de cero");
                    System.out.println("Ingrese el area de la base menor: ");
                     areaBaseMenorTroncoPiramide = entrada.nextInt();
                    
                if(  areaBaseMenorTroncoPiramide <= 0){
                    intentos++;
                    System.out.println("Por favor ingrese un numero que sea mayor y diferente de cero");
                    System.out.println("Ingrese el area de la base menor: ");
                      areaBaseMenorTroncoPiramide= entrada.nextInt();
                    break;
                }    
                }
                
                areaTrapecioTroncoPiramide= ((areaBaseMayorTroncoPiramide + areaBaseMenorTroncoPiramide) * apotemaPiramideTroncoPiramide)/2;
                areaLateralTroncoPiramide = (areaTrapecioTroncoPiramide * 5);
                areaTotalTroncoPiramide = areaLateralTroncoPiramide + areaBaseMenorTroncoPiramide + areaBaseMayorTroncoPiramide;
                volumenTroncoPiramide = 1/3 * alturaTroncoPiramide* (areaBaseMayorTroncoPiramide + areaBaseMenorTroncoPiramide + Math.sqrt(areaBaseMayorTroncoPiramide + areaBaseMenorTroncoPiramide));
                
                
                System.out.println("El area lateral del trono de piramide es: " + areaLateralTroncoPiramide);
                System.out.println("");
                System.out.println("El area total del tronco de piramide es: " + areaTotalTroncoPiramide);
                System.out.println("");
                System.out.println("El volumen del troco de piramide es: " + volumenTroncoPiramide);
                System.out.println("");
                 
                 break;

            case 8: 
            System.out.println("Ingrese la arista o valor de la orilla del triangulo: ");
                aristaTetraedro = entrada.nextDouble();
                
                if(aristaTetraedro <= 0){
                    intentos++;
                    System.out.println("Por favor ingrese un numero que sea mayor y diferente de cero");
                    System.out.println("Ingrese la arista o valor de la orilla del triangulo: ");
                     aristaTetraedro = entrada.nextInt();
                    
                if(  aristaTetraedro <= 0){
                    intentos++;
                    System.out.println("Por favor ingrese un numero que sea mayor y diferente de cero");
                    System.out.println("Ingrese la arista o valor de la orilla del triangulo: ");
                      aristaTetraedro= entrada.nextInt();
                    break;
                }    
                }
               
                areaTotalTetraedro = (aristaTetraedro * aristaTetraedro) * Math.sqrt(3);
                volumenTetraedro = (Math.sqrt(2) / 12) * (aristaTetraedro * aristaTetraedro * aristaTetraedro);
                alturaTetraedro = aristaTetraedro * (Math.sqrt(6) /3);
                
                System.out.println("El area del tetraedro es: " + areaTotalTetraedro);
                System.out.println("");
                System.out.println("El volumen del tetraedro es: " + volumenTetraedro);
                System.out.println("");
                System.out.println("La altura del tretraedro es: " + alturaTetraedro);
                System.out.println("");
                 
                 break;

            case 9:
            System.out.println("Ingrese la arista: ");
                aristaHexaedro = entrada.nextDouble();
                
                if(aristaHexaedro <= 0){
                    intentos++;
                    System.out.println("Por favor ingrese un numero que sea mayor y diferente de cero");
                    System.out.println("Ingrese la arista: ");
                     aristaHexaedro = entrada.nextInt();
                    
                if(  aristaHexaedro <= 0){
                    intentos++;
                    System.out.println("Por favor ingrese un numero que sea mayor y diferente de cero");
                    System.out.println("Ingrese la arista: ");
                      aristaHexaedro= entrada.nextInt();
                    break;
                }    
                }

                areaHexaedro = 6 * (aristaHexaedro * aristaHexaedro);
                volumenHexaedro= (aristaHexaedro * aristaHexaedro * aristaHexaedro);
                diagonalHexaedro = aristaHexaedro * (Math.sqrt(3));

                System.out.println("El area del hexaedro es: " + areaHexaedro);
                System.out.println("");
                System.out.println("El volumen del hexaedro es: " + volumenHexaedro);
                System.out.println("");
                System.out.println("La diagonal del hexaedro es: " + diagonalHexaedro);
                System.out.println("");
                 
                 break;

            case 10:
            System.out.println("Ingrese el valor de la arista del octaedro: ");
                aristaOctaedro = entrada.nextDouble();
                
                if(aristaOctaedro <= 0){
                    intentos++;
                    System.out.println("Por favor ingrese un numero que sea mayor y diferente de cero");
                    System.out.println("Ingrese el valor de la arista del octaedro: ");
                     aristaOctaedro = entrada.nextInt();
                    
                if(  aristaOctaedro <= 0){
                    intentos++;
                    System.out.println("Por favor ingrese un numero que sea mayor y diferente de cero");
                    System.out.println("Ingrese el valor de la arista del octaedro: ");
                      aristaOctaedro= entrada.nextInt();
                    break;
                }    
                }

                areaOctaedro = 2 * (aristaOctaedro * aristaOctaedro) * Math.sqrt(3);
                volumenOctaedro = Math.sqrt(2)/3 * (aristaOctaedro * aristaOctaedro * aristaOctaedro);

                System.out.println("El area del octaedro es: " + areaOctaedro);
                System.out.println("");
                System.out.println("El volumen del octaedro es: " + volumenOctaedro);
                System.out.println("");
                 
                 break;
                
            case 11:
            System.out.println("Ingrese el valor de la arista del dodecaedro: ");
                aristaDodecaedro = entrada.nextDouble();
                
                if(aristaDodecaedro <= 0){
                    intentos++;
                    System.out.println("Por favor ingrese un numero que sea mayor y diferente de cero");
                    System.out.println("Ingrese el valor de la arista del dodecaedro: ");
                     aristaDodecaedro = entrada.nextInt();
                    
                if(aristaDodecaedro <= 0){
                    intentos++;
                    System.out.println("Por favor ingrese un numero que sea mayor y diferente de cero");
                    System.out.println("Ingrese el valor de la arista del dodecaedro: ");
                    aristaDodecaedro= entrada.nextInt();
                    break;
                }    
                }

                areaDodecaedro = (3 * (aristaDodecaedro * aristaDodecaedro)) * Math.sqrt(25 + (10 * Math.sqrt(5)));
                volumenDodecaedro = (Math.pow(aristaDodecaedro, 3)) / 4 * (15 + 7 * Math.sqrt(5));

                System.out.println ("El area del dodecaedro es: " + areaDodecaedro);
                System.out.println("");
                System.out.println("El volumen del dodecaedro es: " + volumenDodecaedro);
                System.out.println("");
                 
                 break;

            case 12:
            System.out.println("Ingrese el valor de la arista del Icosaedro: ");
                aristaIcosaedro = entrada.nextDouble();
                
                if( aristaIcosaedro <= 0){
                    intentos++;
                    System.out.println("Por favor ingrese un numero que sea mayor y diferente de cero");
                    System.out.println("Ingrese el valor de la arista del icosaedro: ");
                      aristaIcosaedro = entrada.nextInt();
                    
                if( aristaIcosaedro <= 0){
                    intentos++;
                    System.out.println("Por favor ingrese un numero que sea mayor y diferente de cero");
                    System.out.println("Ingrese el valor de la arista del icosaedro: ");
                     aristaIcosaedro= entrada.nextInt();
                    break;
                }    
                }

                areaIcosaedro = 2 * (aristaIcosaedro * aristaIcosaedro) * Math.sqrt(3);
                volumenIcosaedro = (Math.sqrt(2)/3) * (aristaIcosaedro * aristaIcosaedro * aristaIcosaedro);

                System.out.println("El area del Icosaedro es: " + areaIcosaedro);
                System.out.println("");
                System.out.println("El volumen del Icosaedro es: " + volumenIcosaedro);
                System.out.println("");
                 
                 break;

            case 13: 
            System.out.println("Ingrese la altura del Ortoedro: ");
               alturaOrtoedro = entrada.nextDouble();
               
               if(  alturaOrtoedro <= 0){
                    intentos++;
                    System.out.println("Por favor ingrese un numero que sea mayor y diferente de cero");
                    System.out.println("Ingrese la altura del ortoedro: ");
                    alturaOrtoedro = entrada.nextInt();
                    
                if(alturaOrtoedro <= 0){
                    intentos++;
                    System.out.println("Por favor ingrese un numero que sea mayor y diferente de cero");
                    System.out.println("Ingrese la altura del ortoedro: ");
                      alturaOrtoedro= entrada.nextInt();
                    break;
                }    
                }
               
               
               System.out.println("Ingrese la longitud B del ortoedro: ");
               longitudbOrtoedro = entrada.nextDouble();
               
               if(  longitudbOrtoedro <= 0){
                    intentos++;
                    System.out.println("Por favor ingrese un numero que sea mayor y diferente de cero");
                    System.out.println("Ingrese la longitud B del ortoedro: ");
                    longitudbOrtoedro = entrada.nextInt();
                    
                if(longitudbOrtoedro <= 0){
                    intentos++;
                    System.out.println("Por favor ingrese un numero que sea mayor y diferente de cero");
                    System.out.println("Ingrese la longitud B del ortoedro: ");
                      longitudbOrtoedro= entrada.nextInt();
                    break;
                }    
                }
               System.out.println("Ingrese la profundidad C del ortoedro: ");
               profundidadCOrtoedro = entrada.nextDouble();
               
               if(profundidadCOrtoedro <= 0){
                    intentos++;
                    System.out.println("Por favor ingrese un numero que sea mayor y diferente de cero");
                    System.out.println("Ingrese la profundidad C del ortoedro: ");
                    profundidadCOrtoedro = entrada.nextInt();
                    
                if(profundidadCOrtoedro <= 0){
                    intentos++;
                    System.out.println("Por favor ingrese un numero que sea mayor y diferente de cero");
                    System.out.println("Ingrese la profundidad C del ortoedro: ");
                    profundidadCOrtoedro= entrada.nextInt();
                    break;
                }    
                }
               

               areaOrtoedro = 2 * ((alturaOrtoedro * longitudbOrtoedro) + (alturaOrtoedro * profundidadCOrtoedro) + (longitudbOrtoedro * profundidadCOrtoedro));
               diagonalOrtoedro = Math.sqrt ((alturaOrtoedro * alturaOrtoedro) + (longitudbOrtoedro * longitudbOrtoedro) + (profundidadCOrtoedro * profundidadCOrtoedro));
               volumenOrtoedro = alturaOrtoedro * longitudbOrtoedro * profundidadCOrtoedro;

               System.out.println("El area del Ortoedro es: " + areaOrtoedro);
               System.out.println("");
               System.out.println("La diagonal del Ortoedro es: " + diagonalOrtoedro);
               System.out.println("");
               System.out.println("El volumen del Ortoedro es: " + volumenOrtoedro);
               System.out.println("");
                
                break;

            case 14: 
            System.out.println("Ingrese la altura de la Zona esferica: ");
            alturaEsfe = entrada.nextDouble();
            
            if(alturaEsfe <= 0){
                 intentos++;
                 System.out.println("Por favor ingrese un numero que sea mayor y diferente de cero");
                 System.out.println("Ingrese la altura de la zona esferica: ");
                 alturaEsfe = entrada.nextInt();
                 
             if(alturaEsfe <= 0){
                 intentos++;
                 System.out.println("Por favor ingrese un numero que sea mayor y diferente de cero");
                 System.out.println("Ingrese la altura de la zona esferica: ");
                 alturaEsfe= entrada.nextInt();
                 break;
             }    
             }
            
           
            System.out.println("Ingrese el radio mayor de la esfera r1: ");
            radioMayorEsfe_r1 = entrada.nextDouble();
            
            if(radioMayorEsfe_r1 <= 0){
                 intentos++;
                 System.out.println("Por favor ingrese un numero que sea mayor y diferente de cero");
                 System.out.println("Ingrese el radio mayor de la esfera r1: ");
                 radioMayorEsfe_r1 = entrada.nextInt();
                 
             if(radioMayorEsfe_r1 <= 0){
                 intentos++;
                 System.out.println("Por favor ingrese un numero que sea mayor y diferente de cero");
                 System.out.println("Ingrese el radio mayor de la esfera r1: ");
                 radioMayorEsfe_r1= entrada.nextInt();
                 break;
             }    
             }
            

            System.out.println("Ingresa el radio menor de la esfera r2: ");
            radioMenorEsfe_r2 = entrada.nextDouble();
            
            if(radioMenorEsfe_r2 <= 0){
                 intentos++;
                 System.out.println("Por favor ingrese un numero que sea mayor y diferente de cero");
                 System.out.println("Ingrese el radio menor de la esfera r2: ");
                 radioMenorEsfe_r2 = entrada.nextInt();
                 
             if(radioMenorEsfe_r2 <= 0){
                 intentos++;
                 System.out.println("Por favor ingrese un numero que sea mayor y diferente de cero");
                 System.out.println("Ingrese el radio menor de la esfera r2: ");
                 radioMenorEsfe_r2= entrada.nextInt();
                 break;
             }    
             }
            

            System.out.println("Ingresa el radio de la esfera R: ");
            radioEsfe_R = entrada.nextDouble();
            
            if( radioEsfe_R <= 0){
                 intentos++;
                 System.out.println("Por favor ingrese un numero que sea mayor y diferente de cero");
                 System.out.println("Ingrese el radio de la esfera R: ");
                  radioEsfe_R = entrada.nextInt();
                 
             if( radioEsfe_R <= 0){
                 intentos++;
                 System.out.println("Por favor ingrese un numero que sea mayor y diferente de cero");
                 System.out.println("Ingrese el radio de la esfera R: ");
                  radioEsfe_R= entrada.nextInt();
                 break;
             }    
             }
            
            
            areaEsfe = (2 * Math.PI * radioEsfe_R * alturaEsfe);

            volumenEsfe = (Math.PI * alturaEsfe * ((alturaEsfe * alturaEsfe) + (3 * (radioMayorEsfe_r1 * radioMayorEsfe_r1)) + (3 *     (radioMenorEsfe_r2 * radioMenorEsfe_r2)))) / 6;

            areaCasquete = 2 * Math.PI * radioEsfe_R * alturaEsfe;

            volumenCasquete = ((Math.PI * (alturaEsfe * alturaEsfe)) * (3 * radioEsfe_R) - alturaEsfe);
            
            System.out.println("El area de la zona esferica es: " + areaEsfe);
            System.out.println("");

            System.out.println("El volumen de la Zona esferica es: " + volumenEsfe);
            System.out.println("");

            System.out.println("El area del casquete esferico es: " + areaCasquete);
            System.out.println("");

            System.out.println("El volumen del casquete esferico es: " + volumenCasquete);
            System.out.println("");
            
             break;
            
            case 15:
            System.out.println("Ingrese el radio: ");
               radioHuso = entrada.nextDouble();
               
               if( radioHuso <= 0){
                    intentos++;
                    System.out.println("Por favor ingrese un numero que sea mayor y diferente de cero");
                    System.out.println("Ingrese el radio: ");
                     radioHuso = entrada.nextInt();
                    
                if( radioHuso <= 0){
                    intentos++;
                    System.out.println("Por favor ingrese un numero que sea mayor y diferente de cero");
                    System.out.println("Ingrese el radio: ");
                     radioHuso= entrada.nextInt();
                    break;
                }    
                }
               System.out.println("Ingrese el angulo: ");
               anguloNHuso = entrada.nextDouble();
               
               if( anguloNHuso <= 0){
                    intentos++;
                    System.out.println("Por favor ingrese un numero que sea mayor y diferente de cero");
                    System.out.println("Ingrese el angulo: ");
                     anguloNHuso = entrada.nextInt();
                    
                if( anguloNHuso <= 0){
                    intentos++;
                    System.out.println("Por favor ingrese un numero que sea mayor y diferente de cero");
                    System.out.println("Ingrese el angulo: ");
                     anguloNHuso= entrada.nextInt();
                    break;
                }    
                }

               areaHusoEsferico =  (4 * Math.PI * (radioHuso * radioHuso) * anguloNHuso) / 360;
               volumencuñaEsferica = (Math.PI * (radioHuso * radioHuso * radioHuso) * anguloNHuso) / 270;

               System.out.println("El area del huso esferico es: " + areaHusoEsferico);
               System.out.println("");
               System.out.println("El volumen de la cuña esferica es: " + volumencuñaEsferica);
               System.out.println("");
                 
                 break;
               
            case 16:
            System.out.println("Adios, hasta luego");
                System.out.println("");
                break;
        

        }


    }
}
