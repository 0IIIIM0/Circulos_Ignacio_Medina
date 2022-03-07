public class Circulo {
    //atributo radio privado
   private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public Circulo (){
        System.out.println("No sirvo para nada");
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    // metodos

    public double calculararea (){
        double area;
        area = (Math.PI*Math.pow(radio,2));
        return area;

    }
    public double calcularDiametro (){
        return radio*2;


    }
    public double calcularCircunferencia(){
        //opcion 1
        //return Math.PI*radio*2;
        //opcion 2
        return Math.PI*calcularDiametro();
    }

    @Override
    public String toString() {
        return "el radio tiene un radio de: "+ radio
                + "\n El area del ciculo es: "+calculararea()
                +"\n El diametro del circulo es:"+ calcularDiametro()
                +"\n La circunferencia del circulo es de: "+ calcularCircunferencia();


    }
}
