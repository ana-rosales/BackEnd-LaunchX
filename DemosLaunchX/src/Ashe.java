import imonsh.Screen;
import imonsh.Colors;

public class Ashe extends Champion implements AsheActionCallbacks{
    public Ashe(int id, String name, String role, String difficulty, String description) {
        super(id, name, role, difficulty, description);
    }

    @Override
    public void frostShot(Screen s) {
        s.setVisible(true);
        s.out(showMessage(),"Helvetica",28,Colors.BlueHorizon);
        //gif al mismo nivel de carpeta src
        //NO dentro
        s.showImage("FrostShot.gif");
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void hawkShot(Screen s) {
        s.setVisible(true);
        s.out(showMessage(),"Helvetica",28,Colors.BlueHorizon);
        //gif al mismo nivel de carpeta src
        //NO dentro
        s.showImage("FrostShot.gif");
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void rangerFocus(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(),"Helvetica",28,Colors.BlueHorizon);
        s.showImage("RangerFocus.gif");
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void volley(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(),"Helvetica",28,Colors.BlueHorizon);
        s.showImage("Volley.gif");
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void crystalArrow(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(),"Helvetica",28,Colors.BlueHorizon);
        s.showImage("CrystalArrow.gif");
        s.setBounds(200,100,1100,900);
    }
}
