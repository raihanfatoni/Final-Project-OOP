import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class GamePanel extends JPanel implements ActionListener{

    private static final int SCREEN_WIDTH = 600;
    private static final int SCREEN_HEIGHT = 600;
    private static final int UNIT_SIZE = 6;
    private static final int GAME_UNITS = (SCREEN_WIDTH*SCREEN_HEIGHT)/UNIT_SIZE;
    private static final int DELAY = 100;
    private static boolean On = false;
    private static boolean New = false;
    private final int x[] = new int[GAME_UNITS];
    private final int y[] = new int[GAME_UNITS];
    private int bodyParts = 5;
    private int appleEaten;
    private int appleX;
    private int appleY;
    private int first = 0;
    private char direction = 'R';
    private boolean running = false;
    private Timer timer;



    GamePanel(){
        Random random = new Random();
        this.setPreferredSize(new Dimension(SCREEN_WIDTH,SCREEN_HEIGHT));
        this.setBackground(Color.black );
        this.setFocusable(true);
        this.addKeyListener(new MyKeyAdapter());
        startGame();
    }
    public void startGame() {
        newApple();
        running = true;
        timer = new Timer(DELAY,this);
        timer.start();
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        draw(g); 
    }

    public void draw(Graphics g){
        if(running){
            for(int i=0;i<SCREEN_HEIGHT/UNIT_SIZE;i++){
                g.drawLine(i*UNIT_SIZE, 0, i*UNIT_SIZE, SCREEN_HEIGHT);
                g.drawLine(0, i*UNIT_SIZE, SCREEN_WIDTH, i*UNIT_SIZE);
            }
            g.setColor(Color.red);
            g.fillOval(appleX, appleY, UNIT_SIZE, UNIT_SIZE);

            if (first == 0){
            for(int i=0; i < bodyParts; i++){
                x[0]=300;
                x[1]=300;
                x[2]=300;
                x[3]=300;
                x[4]=300;

                y[0]=300;
                y[1]=300;
                y[2]=300;
                y[3]=300;
                y[4]=300;
            }

        }
            for(int i = 0; i< bodyParts; i++){
                first++;
                if(i == 0){
                    g.setColor(Color.blue);
                    g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);

                }
                else {
                    g.setColor(new Color(0, 0, 128));
                    g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
                }
            }
            g.setColor(new Color(0, 0, 128));
            g.setFont(new Font("Ink Free",Font.BOLD,40));
            FontMetrics metrics = getFontMetrics(g.getFont());
            g.drawString("Score : "+appleEaten, (SCREEN_WIDTH - metrics.stringWidth("Score : "+appleEaten))/2, g.getFont().getSize());
        }   
        else {
            gameOver(g);
            if (New = true){
                repaint();
            }
        }
    }   

    public void newApple(){
        Random random = new Random();
        appleX = random.nextInt((int)(SCREEN_WIDTH/UNIT_SIZE))*UNIT_SIZE;
        appleY = random.nextInt((int)(SCREEN_HEIGHT/UNIT_SIZE))*UNIT_SIZE;

    }
    public void move() {
        for(int i = bodyParts;i>0;i--){
            x[i] = x[i-1];
            y[i] = y[i-1];
        }

        switch(direction){
        case 'U':
            y[0] = y[0] - UNIT_SIZE;
            break;
        case 'D':
            y[0] = y[0] + UNIT_SIZE;
            break;
        case 'L':
            x[0] = x[0] - UNIT_SIZE;
            break;
        case 'R':
            x[0] = x[0] + UNIT_SIZE;
            break;
        }

    }
    public void checkApple(){
        if((x[0] == appleX) && (y[0] == appleY)){
            bodyParts++;
            appleEaten++;
            newApple();
        }
    }
    public void checkCollisions(){
        // Kalo kepala ular nabrak badannya
        for(int i = bodyParts;i>0;i--){
            if((x[0] == x[i])&& (y[0] == y[i])){
                running = false;
            }
        }
        // Kalo kepala kena panel kiri
        if(x[0] < 0){
            running = false;
        }
        // Kalo kepala kena panel kanan
        if(x[0] > SCREEN_WIDTH){
            running = false;
        }
        // Kalo kepala kena panel atas
        if(y[0] < 0){
            running = false;
        }
        // Kalo kepala kena panel bawah
        if(y[0] > SCREEN_HEIGHT){
            running = false;
        }

        if(!running){
            timer.stop();
        }
    }

    public void New(){
        do{
            appleEaten = 0;
            bodyParts = 5;
            first = 0;
            direction = 'U';
            On = true;
            running = true;
            New = true;
            startGame();
        }while (running == false && On == false);
    }

    public void gameOver(Graphics g){
        //Score
        g.setColor(new Color(0, 0, 128));
        g.setFont(new Font("Ink Free",Font.BOLD,40));
        FontMetrics metrics1 = getFontMetrics(g.getFont());
        g.drawString("Score : "+appleEaten, (SCREEN_WIDTH - metrics1.stringWidth("Score : "+appleEaten))/2, g.getFont().getSize());
        //Game Over
        g.setColor(new Color(0, 0, 128));
        g.setFont(new Font("Ink Free",Font.BOLD,60));
        FontMetrics metrics2 = getFontMetrics(g.getFont());
        g.drawString("Loser!!!", (SCREEN_WIDTH - metrics2.stringWidth("Loser!!!"))/4, SCREEN_HEIGHT/4 );
        FontMetrics metrics3 = getFontMetrics(g.getFont());
        g.drawString("Space To restart", (SCREEN_WIDTH - metrics3.stringWidth("Space to restart"))/3, SCREEN_HEIGHT/3 );
        g.setColor(new Color(0, 0, 128));
        g.setFont(new Font("Ink Free",Font.BOLD,35));
        FontMetrics metrics4 = getFontMetrics(g.getFont());
        g.drawString("Space in game for boost", (SCREEN_WIDTH - metrics3.stringWidth("Space in game for boost"))/8, SCREEN_HEIGHT/2 );


    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(running){
            move();
            checkApple();
            checkCollisions();
        }
        repaint();
    }
    public class MyKeyAdapter extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e){
            switch(e.getKeyCode()){
            case KeyEvent.VK_LEFT:
                if(direction != 'R'){
                    direction = 'L';
                }
                break;
            case KeyEvent.VK_RIGHT:
                if(direction != 'L'){
                    direction = 'R';
                }
                break;
            case KeyEvent.VK_UP:
                if(direction != 'D'){
                    direction = 'U';
                }
                break;
            case KeyEvent.VK_DOWN:
                if(direction != 'U'){
                    direction = 'D';
                }
                break;
            case KeyEvent.VK_SPACE:
                New();
                break;

            }
        }
    }
}
