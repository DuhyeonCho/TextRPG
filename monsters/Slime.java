package textrpg.monsters;

import textrpg.items.SlimeExtract;

public class Slime extends Monster
{
    public Slime()
    {
        super.setName("Slime");
        super.setHealth(200);
        super.setMana(10);        
        super.setStrength(5);
        super.setMagic(2);
        super.setAgility(3);
        super.setDefense(6);
        super.setMagicDefense(2);
        
        super.setGoldWorth(30);
        //super.setLoot(SlimeExtract);
    }
    
    public int slash()
    {
        return (int)(super.getStrength() * 0.5) + 10;
    }
}