import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class SnakeSection extends Actor
{
    private ItemObserver snakeSectionHandler;

    public SnakeSection(ItemObserver snakeSectionHandler){
        this.snakeSectionHandler = snakeSectionHandler;
    }

    public void eaten(){
        getWorld().removeObject(this);
        snakeSectionHandler.itemEaten();
    }

}
