public class PruebaAuto{
    public static void main(String[] args) {

        /*Automovil bmw= new Automovil();
        bmw.marca = "BMW";
        bmw.modelo = "i320";
        bmw.color = "Blanco";
        bmw.cilindraje = 3.2;
        System.out.println("La marca del auto es = " + bmw.marca);
        System.out.println("El modelo del auto es = " + bmw.modelo);
        System.out.println("El color del auto es = " + bmw.color);
        System.out.println("El cilindraje auto es = " + bmw.cilindraje);*/

        Automovil bmw= new Automovil();
        bmw.marca = "BMW";
        bmw.modelo = "i320";
        bmw.color = "Blanco";
        bmw.cilindraje = 3.2;
        System.out.println(bmw.detalleauto());


        System.out.println();

        AutoDeportivo carro= new AutoDeportivo();
        carro.marca = "Tesla";
        carro.modelo = "Roadster";
        carro.color = "Rojo";
        carro.caja = "Automatica";
        carro.combustible = "Electrico";
        carro.hp = 1000;
        carro.metodocarro();

        System.out.println();

        Automovil mb= new Automovil();
        mb.marca = "Mercedes Benz";
        mb.modelo = "ML300";
        mb.color = "Negro";
        mb.cilindraje= 2.5;
        System.out.println(mb.detalleauto());;
    }
}
