class Main {
  public static void main(String[] args) {
    Cliente miCliente = new Cliente();
    miCliente.edad = 30;
    miCliente.nombre = "Juan";
    miCliente.telefono = "245-65-732-1";
    miCliente.credito= 4323;
    
    System.out.println("El nombre del cliente es " + miCliente.nombre + " su edad es " + miCliente.edad + "  su teléfono es " + miCliente.telefono + " y tiene un crédito de " + miCliente.credito);

    Trabajador miTrabajador = new Trabajador();
    miTrabajador.edad = 18;
    miTrabajador.nombre = "Carlos";
    miTrabajador.telefono = "333-652-78-11";
    miTrabajador.salario = 4323;    


System.out.println("El nombre del Trabajador es " + miTrabajador.nombre + " su edad es " + miTrabajador.edad + "  su teléfono es " + miTrabajador.telefono + " y tiene un crédito de " + miTrabajador.salario);


    
  }
}

class Persona {
  
  int edad;
  String nombre;
  String telefono;
  
}

class Cliente extends Persona {
  int credito;
}

class Trabajador  extends Persona {
  int salario;
}