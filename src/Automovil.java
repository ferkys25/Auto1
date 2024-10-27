public class Automovil {
    String marca;
    String modelo;
    String color = "Negro";
    double cilindraje; //tipo de dato nativo letra miniscula



    /*public void detalleauto(){
        //Este es el metodo
        System.out.println("La marca del modelo es = "+this.marca);//Este es con sout
        System.out.println("auto.modelo = " + this.modelo);
        System.out.println("auto.color = " + this.color);
        System.out.println("cilindraje = " + cilindraje);*/

    public String detalleauto(){
        StringBuilder sb = new StringBuilder();
        sb.append("La marca del auto es = "+this.marca+ " ");//Este es con sout
        sb.append("auto.modelo = " + this.modelo+" ");
        sb.append("auto.color = " + this.color+" ");
        sb.append("cilindraje = " + cilindraje+ " ");
        return sb.toString();

    }
}