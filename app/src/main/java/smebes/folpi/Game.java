package smebes.folpi;

import android.content.Context;
import android.widget.LinearLayout;

import java.util.LinkedList;

public class Game extends LinearLayout {

    int GAME = 0;
    int MENU = 1;
    int LEADERBOARD = 2;
    int SHOP = 3;
    int currentScreen;

    protected double SCREEN_WIDTH = 0;
    protected double SCREEN_HEIGHT = 0;
    private LinkedList<Sprite> sprites;
    private Bird bird;
    private Background background;
    private Pipe pipe;
    private Block block;
    private TextCalculus texteCalculus;
    private Score score;
    private ButtonReplay buttons;
    private LeaderBoard lb;
    private Shop shop;

    private boolean scorePasEncoreCompte = false;

    private int random;
    private int random2;
    private int random3;
    private int random4;
    private int result;
    private int transparency;
    private boolean gameOver = false;
    private int difficulty = 1;
    private boolean screenPressed = false;
    Context c;


    public Game(Context c, int h, int w) {
        super(c);
        sprites = new LinkedList<Sprite>();
        this.c = (MainActivity) c;
        SCREEN_WIDTH = w;
        SCREEN_HEIGHT = h;
        background = new Background(c, (int) SCREEN_WIDTH, (int) SCREEN_HEIGHT);

    }
}
