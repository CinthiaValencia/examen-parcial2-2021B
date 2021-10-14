import greenfoot.*;

public class SnakeSectionsManager extends WorldObjectsManager implements ItemObserver
{
    private static final int INITIAL_DELAY = 100;
    SnakeSection snakeSection=new SnakeSection(this);

    public SnakeSectionsManager(World world){
        super(world, INITIAL_DELAY);
    }

    public Actor getNewWorldObject(){
        return snakeSection;
    }

    public void itemEaten(){
        enableNewItemCounter = true;
    }
}
