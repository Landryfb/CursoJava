/**
 * relogio
 */
public class Relogio {

    // Atributos do Relogio
    private int hora;
    private int minuto;
    private int segundo;

    /**
     * Nao esquecer o nome tem q ser igual a Class
     */
    public Relogio(int h, int m, int s) {
        hora = h;
        minuto = m;
        segundo = s;

    }
    // Segundo

    public void acrescenta() {
        if (++segundo > 59) {
            segundo = 0;

            if (++minuto > 59) {
                minuto = 0;

                if (++hora > 23) {
                    hora = 0;
                    segundo = 1;
                }

            }

        }
    }

    public void informahora() {
        System.out.println(" Hora atual: " + hora + ":" + minuto + ":" + segundo);

    }

}
