package poo;

public class Veiculo {
    String marca;
    String modelo;
    String consumo;
    int km;

    Veiculo(String marca, String modelo, String consumo, int km) {
        this.marca = marca;
        this.modelo = modelo;
        this.consumo = consumo;
        this.km = km;
    }

    String exibirVeiculoString() {
        return marca + "-" + modelo + ":" + consumo + ":" + km;

    }

}
