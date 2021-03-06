import java.util.Scanner;
class Principal{

    public static void main(String[] args){
        Principal.mostrarMenu();
    }

    public static void mostrarMenu(){
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        double valorDoble = 0.0;
        Vehiculo auto;
        Sensor senso;
        String str = "";

        while(true){
            System.out.print("Ingrese un número:");
            num = scanner.nextInt();
            if(num == 0){
                break;
            }
            if(num == 1){
                if(Vehiculo.cantidadVehiculos() < Vehiculo.tamano){
                    auto = new Vehiculo();
                    System.out.print("Ingrese un modelo: ");
                    num = scanner.nextInt();
                    auto.setModelo(num);
                    System.out.print("Ingrese una marca: ");
                    str = scanner.next();
                    auto.setMarca(str);
                    System.out.print("Ingrese un valor: ");
                    valorDoble = scanner.nextDouble();
                    auto.setValorComercial(valorDoble);
                    System.out.print("Ingrese un color: ");
                    str = scanner.next();
                    auto.setColor(str);
                    System.out.println("Se ha creado un nuevo vehiculo.");
                }
                else{
                    System.out.println("Error base de datos llena.");
                }
            }
            else if (num == 2){
                System.out.println("Información de todos los vehículos almacenados: ");
                System.out.println(Vehiculo.toStringVehiculos());
            } 
            else if (num == 3){
                System.out.println("Información de la cantidad de vehículos creados:");
                System.out.println(Vehiculo.cantidadVehiculos());
            }
            else if(num == 4){
                System.out.println("Información de los vehículos verdes almacenados:");
                for (Vehiculo v: Vehiculo.metodo4()){
                    System.out.println(v);
                }
            }
            else if (num == 5){
                if(Sensor.cantidadSensores() < Sensor.tamano){
                    senso = new Sensor();
                    System.out.print("Ingrese un tipo: ");
                    str = scanner.next();
                    senso.setTipo(str);
                    System.out.print("Ingrese un valor: ");
                    valorDoble = scanner.nextDouble();
                    senso.setValor(valorDoble);
                }
                else{
                    System.out.println("Error base de datos llena.");
                }
            }
            else if(num == 6){
                System.out.println("Información de todos los sensores almacenados:  ");
                System.out.println(Sensor.toStringSensores());
            }
            else if(num == 7){
                System.out.println("Información de la cantidad de sensores creados: ");
                System.out.println(Sensor.cantidadSensores());
            }
            else if (num == 8){
                System.out.println("Información de sensores de temperatura: ");
                for (Sensor s: Sensor.metodo8()){
                    System.out.println(s);
                }
            }
            else if(num == 666){
                System.out.println("Información de sensores de temperatura organizados de menor a mayor valor: ");
                for(Sensor s: Sensor.metodo666()){
                    System.out.println(s);
                }
            }
        }
    }
}