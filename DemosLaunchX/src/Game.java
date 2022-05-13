import imonsh.Screen;

public class Game {
    public static void main(String[] args) {
        TestAshe();
    }

    private static void TestAshe (){
        Screen screen = new Screen();
        Ashe ashe = new Ashe(
                01,
                "Ashe",
                "Marksman",
                "Moderate",
                "Como Hija del Hielo y madre de guerra de la tribu Avarosa, Ashe comanda la más grande horda en el norte. Estoica, inteligente e idealista, pero incómoda con su rol de líder, ella aprovecha las magias ancestrales de su linaje para portar un arco de Hielo Puro. Apoyada por la creencia de su gente que ella es el héroe mitológico reencarnado de Avarosa, Ashe espera unificar el Fréljord una vez más al retomar sus tierras antiguas y tribales"
        );

        Runnable attack = new Runnable() {
            @Override
            public void run() {
                try{
                    ashe.frostShot(screen);
                    Thread.sleep(3000);

                    ashe.hawkShot(screen);
                    Thread.sleep(3000);

                    ashe.rangerFocus(screen);
                    Thread.sleep(3000);

                    ashe.crystalArrow(screen);
                    Thread.sleep(3000);

                    ashe.volley(screen);
                    Thread.sleep(3000);
                } catch (InterruptedException ie){
                    ie.printStackTrace();
                }

            }
        };
        /*ashe.frostShot(screen);
        //3000 ms == 3 segundos
        Thread.sleep(3000);
        ashe.crystalArrow(screen);*/
    }
}
