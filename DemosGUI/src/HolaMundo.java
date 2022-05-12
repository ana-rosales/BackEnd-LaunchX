public class HolaMundo {
    public static void main(String[] args) {
        Screen screen = new Screen();
        Dialog d = new Dialog();
        String str;

        screen.out("Bienvenidxs a la misión Backend Java", "Helvetica", 28, Colors.Desire);
        screen.setVisible(true);

        str = d.readString("¿Quieres aprender a hacer esto? s/n");
        if(str.charAt(0) == 'S' || str.charAt(0) == 'N'){
            screen.showImage("ashe.jpeg");
            screen.out("Hola Explorers");
        } else
            screen.out("Tal vez en otro momento, adiós :(","Century Schoolbook", 28, Colors.AgalFuel);
    }
}
